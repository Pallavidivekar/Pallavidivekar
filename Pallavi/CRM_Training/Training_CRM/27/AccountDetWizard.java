/******************************************************************************
 * Copyright (c) 2000-2005 Infosys Ltd.  All rights reserved.
 *
 * $Workfile: AccountDetWizard.java $
 *
 * Author:Suresh Anand M.
 *
 * $Archive:

 * $History: AccountDetWizard.java $
 *
 *****************************************************

********************  Version 1  *********************
* User: Suman Kumar Date: 02/07/05    Time: 5:47p
* Updated in
* Project Code: CRM70CIF
*
* Changes:  changes related to Approval
*
* Reviewed by:
*****************************************************

********************  Version 2  *********************
* User: Suman Kumar Date: 03/21/05    Time: 5:47p
* Updated in
* Project Code: CRM70CIF
*
* Changes:  CIF LOS Bypass changes
*
* Reviewed by:
******************************************************

********************  Version 3  *********************
* User: Vishal Saxena Date: 04/18/05    Time: 5:47p
* Updated in
* Project Code: CRM70CIF
*
* Changes:  CIF Dedup Frame Changes.
*
* Reviewed by:
******************************************************

********************  Version 4  *********************
* User: VENKATACHALAM Date: 05/03/05    Time: 10:47p
* Updated in
* Project Code: CRM70CIF
*
* Changes:  CIF Trade Finance Changes.
*
* Reviewed by: Deepu Prasad
********************  Version 5  *********************
* User: Sureshanand_m Date: 05/10/05    Time: 3:30p
* Updated in: $/CRM70/com/infy/cis/ui/common
* Project Code: CRM70CIF
*
* Comment:  CORE-CIF Approval Changes
*
* Modified by: Suresh Anand M.
* Reviewed by: Ruchika Mittal
******************************************************
********************  Version 6  *********************
* User: Suman Kumar Date: 05/23/05    Time: 10:47p
* Updated in
* Project Code: CRM70CIF
*
* Changes:  CIF LOS Bypass changes (read Only)
*
* Reviewed by:
******************************************************/
/********************  Version 7 *********************
* User: Amit malhotra Date: 08/08/07    Time: 10:47p
* Updated in
* Project Code: ERPBOME1
* Tarcker Id : 113066
* Changes: Cross Entity Copy
*
* Reviewed by:
******************************************************/


package com.infy.cis.ui.cif;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infy.cis.adaptor.web.WebAdaptor;
import com.infy.cis.common.EditorUtil;
import com.infy.cis.common.ResourceLocator;
import com.infy.cis.common.SRMResourceLoader;
import com.infy.cis.license.LicenseWrapper;
import com.infy.cis.servletruntime.CISHttpServlet;
import com.infy.cis.servletruntime.CISSessionContext;
import com.infy.cis.srmbo.security.user.SRMBusinessContext;
import com.infy.cis.ui.common.SRMUICommon;
import com.infy.cis.ui.common.Utils;
// changes for tracker id :253845
import com.infy.cis.srmbo.SuspectBO;
import com.infy.cis.srmbo.ContactBO;
import com.infy.cis.srmbo.SRMURLResolver;
import com.infy.cis.srmbo.NonCustomerBO;
// changes for tracker id :253845
//changes for TOL 652539 starts
import com.infy.cis.license.LicenseUtil;
//changes for TOL 652539 ends
import com.infosys.insulate.util.concurrent.ConcurrentHashMap;
import com.infy.cis.exception.LicenseException;//ITL call 915696
import com.infy.cis.exception.WriterHookException;

/**
    *Brief Description of class:
	*
	*Functionality: This class loads the tabs and calls the MainDetForms.
	*
	*@author: Suresh Anand M.
	*
	*External Methods called:
	*
	*Known Bugs:
	*
	*Start Date: 01/12/04
	*
	*Modification log :
*/

public class AccountDetWizard extends CISHttpServlet {
    // -------------------------------------------------------------------------
    // Class variables
    // -------------------------------------------------------------------------
    private static final String MODULE_NAME = "cif:AccountDetWizard";
	private static final String HOOK_CUSTOM = "AccountDetWizardHook";
	/****************Appproval Changes:Config Editor :Start**************/
/*changes done by Haresh*/    public String apprFlag=null;
    public String tempApprFlag=null;
    public String mcJNDIFlag="false";
	// Changes for tracker id :253845  start
		public String convertBlacklistedFlag = null;
	    public String convertNegatedFlag = null;
		public String blacklistedFlag = null;
		public String negatedFlag = null;
    // Changes for tracker id :253845 End

/*changes done by Haresh*/

/*Ticket ID 234675 CHANGES BEGIN*/
//Init method commented as the code has been moved to service request method
/*public void init() {
  	// init method changes for CRM11MEM
  	String apprFlag=null;
    String tempApprFlag=null;
    String mcJNDIFlag="false";
	try{
		Properties keyProp = EditorUtil.getCIFGeneralInfo();
		apprFlag = keyProp.getProperty(EditorUtil.APPROVAL_MECHANISM).trim();
		mcJNDIFlag = keyProp.getProperty(EditorUtil.ISMCREQUIRED);
		tempApprFlag = apprFlag;
	} catch(Exception e){
		//System.out.println("In AccountDetWizard "+apprFlag);
		e.printStackTrace();
		apprFlag="false";
	}
//change done by Haresh
}*/

/*Ticket ID 234675 CHANGES END*/

	/****************Appproval Changes:Config Editor :End**************/


/*changes done by Haresh*/
public String getModuleName() { return MODULE_NAME; };

String sApplPath = "" ;
    protected void serviceRequest (HttpServletRequest req, HttpServletResponse resp)
        throws Exception
    {
			/* CIF Additional Enhancements CRM10402 : R42DRELM: changes for dedup screen :Starts */
				//Declared for getting the screen name.
				String strScreenName = "";
				//admin flag will read from jndi properties
				String sDedupBeforCIFCreation=null;
				// to check whether the dedup flag is set.
				String strDedupSearch=req.getParameter("preDedupSearchFlag");
				//Dflag is set in order to open the create screen when the hyperlink is clicked.

				String operationTypeEdit = req.getParameter("operationType");
			


			/*changes for Ticket id 381047 start */

								SRMResourceLoader srmResource = SRMResourceLoader.getInstance();
								com.infy.cis.common.LocaleBundles  localeBundle1 = srmResource.getBundles("com.infy.cis.ui.cif", "UI");

        	/*changes for Ticket id 381047 end */

				String strDFlag=req.getParameter("dflag");

       	 		String  strDedupView = req.getParameter("DedupView");
       	 		String  strFromMenu = req.getParameter("componentid");


				if(strDedupSearch==null)
				{
					strDedupSearch="false";
				}

				if(strDFlag==null)
				{
					strDFlag="false";
				}

				if ((operationTypeEdit == null &&(!(strDedupView==null)) && (strDedupView.equalsIgnoreCase("Y"))) || (!(operationTypeEdit == null) &&	((operationTypeEdit.equalsIgnoreCase("EditEntity")) || (operationTypeEdit.equalsIgnoreCase("QUEUE")) || (operationTypeEdit.equalsIgnoreCase("undefined")))))
				{
					strDFlag="true";
				}
				if (operationTypeEdit!=null )
				{
					if ( operationTypeEdit.equals("View"))
					{
						strDFlag="true";
					}

				}
				else
		{
					if (strFromMenu==null)
					{
						strDFlag="true";
					}

		}

		        if(strScreenName==null || strScreenName==""){
            		strScreenName="Customer";
            	}
            /* CIF Additional Enhancements CRM10402 : R42DRELM: changes for dedup screen :ends */
		//Changes done by ekta for cif deceased starts
		PrintWriter out5 = resp.getWriter();
		//Changes done by ekta for cif deceased ends
			/* Begin of Changes:Security Audit Fix  */
					String sSecurKey = req.getParameter("SECUREHKEY");
					if(sSecurKey == null){
					sSecurKey = "";
					}
					String sFldHashkey = req.getParameter("FLDHASHKEY");
					if(sFldHashkey == null){
					sFldHashkey = "";
					}
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
					String intractionId=req.getParameter("forHashKey_IntxnId");
//Security Recon Changes : Tracker Id : 356601 ENDS
					String incidentId=req.getParameter("IncidentID");
					String workItemId=req.getParameter("workItemId");
		/* changes for tracker 356601 security ends*/
		/* End of Changes:Security Audit Fix  */
		 if ( ResourceLocator.APPLICATION_NAME != null ){
		 sApplPath = ResourceLocator.APPLICATION_NAME;
}		 else {
		 ResourceLocator.setApplDet(req);
		 sApplPath = ResourceLocator.APPLICATION_NAME;
}
		// Licensing Changes Starts
		SRMBusinessContext busContext = Utils.getBusinessContext(req);
		String bankId = busContext.getBank_id();
		//changes for TOL 652539 starts
		//long retailCustomerLimit = LicenseWrapper.getRetailLicenseLimit(bankId);
		//long retailCount = LicenseWrapper.getRetailCount(bankId);
		//changes for TOL 652539 ends
		 //operationTypeEdit = req.getParameter("operationType");
		/* Changes done by Kanika for Cif Deceased starts */
		String strCreFlag = req.getParameter("creFlag");
		/* Changes done by Kanika for Cif Deceased ends */
//SPE Changes for Relationship Info start
       // String cifType[] = "" ;
        /* CRM102ST: TrackerID:180825 Begin of Change */
        String strEntityType = req.getParameter("entityType");
        /* CRM102ST: TrackerID:180825 End of Change */
        String cifType = req.getParameter("cifType");
        String Bank_Entity = req.getParameter("Bank_Entity");
        String Relation = req.getParameter("Relation");
         String saveSubmit = req.getParameter("saveSubmit");
		 	//ITL call 915696 start
         String flag=null;
//SPE Changes for Relationship Info End
	//changes for TOL 652539 starts
         try
         {
			 //ITL call 915696 end
	if(!LicenseWrapper.checkRetCorpLicenseEnterprise(LicenseUtil.CIF_RETAIL_CUSTOMER,bankId)){
	long retailCustomerLimit = LicenseWrapper.getRetailLicenseLimit(bankId);
	long retailCount = LicenseWrapper.getRetailCount(bankId);
	//changes for TOL 652539 ends
		if((operationTypeEdit == "" || operationTypeEdit == null))
		{
			if(retailCount >= retailCustomerLimit)
			{
				PrintWriter out2 = resp.getWriter();
				StringBuilder sb2 = new StringBuilder();
				java.util.Locale locale = ((com.infy.cis.servletruntime.CISSessionContext)com.infy.cis.common.SRMTLVar.sc.get()).getSessionLocale();
				String strLocale = locale.toString();
				 srmResource = SRMResourceLoader.getInstance();
				com.infy.cis.common.LocaleBundles  localeBundle = srmResource.getBundles("com.infy.cis.ui.cif", "I18N");
				String errorMessage = localeBundle.getString(locale, com.infy.cis.ui.cif.I18N_MsgTags.MSGJAVA50639);
				sb2.append("<HEAD>");
				sb2.append("<TITLE>");
				sb2.append("</TITLE>");
				sb2.append("<link rel=\"stylesheet\" href=\"../Branding/css/common/Popup_"+strLocale+".css\">");
				sb2.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/SSOParameter.js \"></SCRIPT>");
				sb2.append("</HEAD>");
				sb2.append("<BODY class=\"popup\">");
				sb2.append("<CENTER><SPAN class=\"displayMsg\"><SCRIPT>document.write('" + errorMessage +"');</SCRIPT></SPAN></CENTER>");
				sb2.append("<BR>");
				sb2.append("</BODY></HTML>");
				out2.println(sb2.toString());
				return;
			}
		}
		if(LicenseWrapper.logRetailBufferLimit(bankId))
		{
			//Tracker 173759 - Starts
			WebAdaptor.log(com.infy.cis.log.LogType.PANIC, "WARNING!!! License limit for Number of Retail / CORP CIF is in Buffer range.","CIFLICE001","CIF:AccountDetWizard","serviceRequest");
			//Tracker 173759 - Ends
		}
		//changes for TOL 652539 starts
		}
		//ITL call 915696 start
         }	catch(LicenseException e) {
 			flag="LICFAILURE";
 			Utils.getErrMessageLicense(resp, flag);
 		}
 		catch(Exception e) {
 			flag="GENFAILURE";
 			Utils.getErrMessageLicense(resp, flag);
 		}
		//ITL call 915696 end
		//changes for TOL 652539 ends
		// Licensing Changes Ends
		/*Ticket ID 234675 CHANGES BEGIN*/
		//Code moved from init method into service request
		String apprFlag=null;
		    String tempApprFlag=null;
		    String mcJNDIFlag="false";
			try{
				Properties keyProp = EditorUtil.getCIFGeneralInfo();

				apprFlag = keyProp.getProperty(EditorUtil.APPROVAL_MECHANISM).trim();
				mcJNDIFlag = keyProp.getProperty(EditorUtil.ISMCREQUIRED);
				// Changes dfor tracker id :253845 start
				convertBlacklistedFlag = keyProp.getProperty(EditorUtil.CONVERT_BLACKLISTED).trim();
				convertNegatedFlag = keyProp.getProperty(EditorUtil.CONVERT_NEGATED).trim();
				// Changes for tracker id :253845 End
				tempApprFlag = apprFlag;
				sDedupBeforCIFCreation = keyProp.getProperty(EditorUtil.DEDUP_CHECK).trim();
			} catch(Exception e){
			//	e.printStackTrace();
	WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
				apprFlag="false";
				sDedupBeforCIFCreation="false";
				/*Changes for entity conversion starts*/
				convertBlacklistedFlag="true";
				convertNegatedFlag="true";
				// Changes for tracker id :253845 End
	}
	/*Ticket ID 234675 CHANGES END*/

		/* Changes for 'WFlow' POC -- start */
		String strIntWFID = req.getParameter("IntWFID");
		/* Changes for 'WFlow' POC -- end */
        String isPopup = req.getParameter("isPopup");
   
        String  isReadOnly = req.getParameter("IsReadOnly");

        //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
        String  strAcrossSearch = req.getParameter("AcrossSearch");
        String  strBank_id = req.getParameter("bank_id");
       //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra

        String isCopy = req.getParameter("isCopy");
        String isMCEdited = req.getParameter("isMCEdited");
        String messageFile = context.getSessionContext(req).getClientMessageFile();
		String recordStatus="A";
// Changes for Deceased CIF Starts
		String custStatus = null;
// Changes for Deceased CIF Ends
		java.util.Locale locale = ((com.infy.cis.servletruntime.CISSessionContext)com.infy.cis.common.SRMTLVar.sc.get()).getSessionLocale();
		String strLocale = locale.toString();
		String ScrLayout = "";

		// Changes for tracker id :253845 Start
		SRMBusinessContext bc = Utils.getBusinessContext(req);
		// Changes for tracker id :253845 End
		/* Tracker #: 90197 Begin of Changes for attibute masking */
				String AccessOwnerGroup = req.getParameter("AccessOwnerGroup");
		  /* Tracker #: 90197 End of Changes */

        if(isPopup == null) {
            isPopup = "No";
        }
        if(isReadOnly == null) {
		            isReadOnly = "N";
        }
        if(isCopy == null) {
				    isCopy = "N";
        }if(isMCEdited == null||isMCEdited.equals("")) {
				    isMCEdited = "N";
        }
        String accountId = req.getParameter("accountId");
		/*****	 CORE-CIF Approval Changes	-start	*****/
       	String mainAccId = req.getParameter("mainAccId");
		/*****	 CORE-CIF Approval Changes	-end	*****/

        /*
		 * added by Vishal
		 * for encorporating frame changes in dedup result display
		 */
		String IsShowButtons=req.getParameter("IsShowButtons");
		if ( IsShowButtons == null )
		   {
		   IsShowButtons = "Y";
		   }
		/* end of addition Vishal */
		// vasanth's changes start

		String sDob = req.getParameter("dob");
		String blacklisted=req.getParameter("blacklisted");
		String suspended=req.getParameter("suspended");
		String negated=req.getParameter("negated");
		String chkBSN=req.getParameter("chkBSN");

		// vasanth's changes end

		/****Change for tracker no 88742*********:Start*/
        String IsDedup=req.getParameter("IsDedup");
		if ( IsDedup == null ){
				   IsDedup = "N";
		   }
		/****Change for tracker no 88742*********:End*/
        String isGeneral=req.getParameter("isGeneral");
        String isDemo=req.getParameter("isDemo");
        String isPsyco=req.getParameter("isPsyco");
        String isBank=req.getParameter("isBank");
        String isTF=req.getParameter("isTF");

        String isBasel=req.getParameter("isBasel");
		/************ save & submit change:Start*****************/
		String operationType = req.getParameter("operationType");

		/************ save & submit change:Ends *****************/
    	//Approval change:Start
		String boType=req.getParameter("boType");
		//Approval change:End

		// Changes for tracker id :253845 Start

				String convToCust 	 = req.getParameter("convToCust");
				String convType   	 = req.getParameter("convType");
				String entityURL	 = null;
				String entityId      = null;
			 	/* tracker id 336352 changes starts */
			   /* 10.3 SPE Changes */
			   String ScreenName = req.getParameter("ScreenName");

			   if(ScreenName == null){
									   ScreenName = "";
			   }
			   /* 10.3 SPE Changes Ends*/
			   /* tracker id 336352 changes ends */

				//Checksum recon from 10.3 SUPP
				String entityID = req.getParameter("entityID");
				//Checksum recon from 10.3 SUPP

				if(convToCust == null)
				{
					convToCust = "";
				}
				if(convType == null)
				{
					convType = "";
				}

				blacklistedFlag = "";
				negatedFlag		= "";

				if(convType.equals("Prospect"))
				{
					entityURL = req.getParameter("SuspectURL");
					entityId  = req.getParameter("suspectId");

					SuspectBO suspect = (SuspectBO) SRMURLResolver.getObject(bc, entityURL);
					blacklistedFlag   = suspect.getBlackListed();
					negatedFlag 	  = suspect.getNegated();
				}
				else if(convType.equals("Contact"))
				{
					entityURL = req.getParameter("ContactURL");
					entityId  = req.getParameter("contactId");

					ContactBO contact = (ContactBO) SRMURLResolver.getObject(bc, entityURL);
					blacklistedFlag   = contact.getBlackListed();
					negatedFlag 	  = contact.getNegated();
				}
				else if(convType.equals("NonCustomer"))
				{
					entityURL = req.getParameter("NonCustomerURL");
					entityId  = req.getParameter("nonCustomerId");

					NonCustomerBO nonCust = (NonCustomerBO)SRMURLResolver.getObject(bc, entityURL);
					blacklistedFlag = nonCust.getBlackListed();
					negatedFlag 	= nonCust.getNegated();
				}

		// Changes for tracker id :253845 End
		/************CIF LOS Bypass change:Start*****************/
		String tabname1;
        String tabName;
        String tabName2;
        String tabName3;
        String tabName4;
        String tabName5;
		String byPassFlag=req.getParameter("byPassFlag");
		String cifID=req.getParameter("cifId");
		String UI=req.getParameter("UI");
		/***********CIF LOS Bypass changes (read Only):Start*****************/
		String readOnlyLOS=req.getParameter("readOnlyLOS");
		if(readOnlyLOS == null) {
			readOnlyLOS = "N";
		}
		if(readOnlyLOS.equals("Y")){
			isReadOnly="Y";
		}
		/***********CIF LOS Bypass changes (read Only):End*****************/

		if(cifID == null) {
			cifID = "";
		}
		if(UI == null) {
			UI = "";
		}
		if(byPassFlag == null) {
			byPassFlag = "N";
		}
		if(byPassFlag.equals("Y")&&!(cifID.equals(""))){
			apprFlag="false";
			accountId=cifID;
			isPopup="Yes";
			boType="Main";
		}
		else
		{
			apprFlag=tempApprFlag;
		}

		if(byPassFlag.equals("Y")){
			  CISSessionContext sc = context.getSessionContext(req);
			  //changes for tracker id :253845 starts
              //SRMBusinessContext bc = Utils.getBusinessContext(req);
              //changes for tracker id :253845 ends
			  recordStatus=CifQueries.checkRecordStatus(bc,accountId,"Customer");
			  //Changes done by ekta for cif deceased starts
			  custStatus=CifQueries.checkCustomerStatus(bc,accountId,"Customer");
			  //Changes done by ekta for cif deceased ends
			  ScrLayout = sc.getScreenLayout();
			  bc.terminate(true);
		}
		else{
			CISSessionContext sc = context.getSessionContext(req);
			ScrLayout = sc.getScreenLayout();
		}
		//Changes done by ekta for cif deceased starts
			if(custStatus != null && custStatus.equals("DCSED")){
				out5.println("<SCRIPT LANGUAGE='javascript' src=\"../common/js/ClientResourceBundle_"+strLocale+".js\"></SCRIPT>");
				/*Fix for TicketID:576892--Start*/
				out5.println("<SCRIPT>");
				out5.println("if(!showConfirmMessage(MSGJ51883)){top.window.close();}");
				out5.println("</SCRIPT>");
				/*Fix for TicketID:576892--End*/

			}
	   //Changes done by ekta for cif deceased starts

		/************CIF LOS Bypass change:End*****************/
		if(recordStatus.equals("I")){
			String 		 displayMsg = null;
			PrintWriter out1 = resp.getWriter();
			StringBuilder sb1 = new StringBuilder();
			if(ScrLayout.equalsIgnoreCase(SRMUICommon.RTL)){
        		sb1.append("<HTML dir='rtl'>");
			}
			else{
				 sb1.append("<HTML>");
			}
			sb1.append("<HEAD><SCRIPT language='javascript'> var applPath = '" +  sApplPath  + "'; </SCRIPT> ");
			sb1.append("<TITLE>");
			sb1.append("</TITLE>");
			sb1.append("<link rel=\"stylesheet\" href=\"../Branding/css/common/Popup_"+strLocale+".css\">");
			sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/SSOParameter.js \"></SCRIPT>");
			sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../cif/js/Message_cif_"+strLocale+".js\"></SCRIPT>");
			sb1.append("<SCRIPT LANGUAGE=\"JAVASCRIPT\">");
			sb1.append("function fClose(){");
			sb1.append("top.window.close();");
			sb1.append("}");
			sb1.append("function setButtonText1(){");
			sb1.append("document.getElementsByName('CloseWin')[0].value = MSGH0001;");
			sb1.append("}");
			sb1.append("var displayMsg = eval('MSGH0002');");
			sb1.append("</SCRIPT>");
			//displayMsg = "Customer is under verification.Cannot be edited ";
			sb1.append("</HEAD>");
			sb1.append("<BODY onload='setButtonText1();' class=\"popup\">");
			sb1.append("<CENTER><SPAN class=\"displayMsg\"><SCRIPT>document.write(displayMsg);</SCRIPT></SPAN></CENTER>");
		  //out1.println("<CENTER><SPAN class=\"displayMsg\">"+displayMsg+"</SPAN></CENTER>");
		  //out1.println("<BR><CENTER> <INPUT class=\"frmBttns\" TYPE=button value=\"OK\" "
			sb1.append("<BR><CENTER> <INPUT class=\"frmBttns\" TYPE=button name=\"CloseWin\" value='' "
			+"onclick='fClose();'></CENTER>");
			sb1.append("</BODY></HTML>");
			out1.println(sb1.toString());

			// Changes for tracker id :253845 Start

					}
					else if(convertBlacklistedFlag.equals("false") && blacklistedFlag.equals("Y"))
					{
						String oldUrl = req.getParameter("oldUrl");
						PrintWriter out1 = resp.getWriter();
						StringBuilder sb1 = new StringBuilder();
						sb1.append("<HTML>");
						sb1.append("<HEAD>");
						sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../cif/js/Message_cif_"+strLocale+".js\"></SCRIPT>");
						sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/MessageFunctions.js\"></SCRIPT>");
						sb1.append(" <SCRIPT> ");
						sb1.append(" function load() { ");
						sb1.append(" showMessage('MSGH0004'); ");
						sb1.append("document.location.href='"+oldUrl+"'; } ");
						sb1.append("</SCRIPT>");
						sb1.append("</HEAD>");
						sb1.append("<BODY onload='load();'></BODY>");
						sb1.append("</HTML>");
						out1.println(sb1.toString());
					}
					else if(convertNegatedFlag.equals("false") && negatedFlag.equals("Y"))
					{
						String oldUrl = req.getParameter("oldUrl");
						PrintWriter out1 = resp.getWriter();
						StringBuilder sb1 = new StringBuilder();
						sb1.append("<HTML>");
						sb1.append("<HEAD>");
						sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../cif/js/Message_cif_"+strLocale+".js\"></SCRIPT>");
						sb1.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/MessageFunctions.js\"></SCRIPT>");
						sb1.append(" <SCRIPT> ");
						sb1.append(" function load() { ");
						sb1.append(" showMessage('MSGH0005'); ");
						sb1.append("document.location.href='"+oldUrl+"'; } ");
						sb1.append("</SCRIPT>");
						sb1.append("</HEAD>");
						sb1.append("<BODY onload='load();'></BODY>");
						sb1.append("</HTML>");
						out1.println(sb1.toString());
		}else{




		if(accountId == null) {
			  accountId = "";
		}
		//changes for tracker id :253845 ends
		//Following code has been added to load the respective form in the case of edit
		if(isGeneral==null || isGeneral.equals("")){
					isGeneral = "No";
		}

		if(isDemo==null || isDemo.equals("")){
					isDemo = "No";
		}

		if(isPsyco==null || isPsyco.equals("")){
					isPsyco = "No";
		}

		if(isBank==null || isBank.equals("")){

					isBank = "No";
		}

		if(isTF==null || isTF.equals("")){

					isTF = "No";
		}
		if(isBasel==null || isBasel.equals("")){

							isBasel = "No";
		}
 

		if(byPassFlag.equals("Y")){
			 tabname1 = "Address";
			 tabName =  "Income/Expenses ";
			 tabName2 = "Dependant Information";
			 //tabName3="Other Bank & Credit Card Details";
			 tabName3="Other_Bank__Credit_Card_Details";
			 tabName4="Trade Finance";
			 tabName5 = "MSGJ51968"; //Basel changes
		}else{
			 tabname1 = "General";
		     tabName =  "Demographic Details";
             tabName2 = "Psychographic Details";
            tabName3="Other_Bank__Credit_Card_Details";
             tabName4 = "Trade Finance";
             tabName5 = "MSGJ51968"; //Basel changes
		}
        setContentType("text/html", resp);
   
        PrintWriter out = resp.getWriter();
        StringBuilder sb  = new StringBuilder();
		if(ScrLayout.equalsIgnoreCase(SRMUICommon.RTL)){
			sb.append("<HTML dir='rtl'>");
		}
		else{
			 sb.append("<HTML>");
		}
		/* CIF Additional Enhancements CRM10402 : R42DRELM: changes for dedup screen :Starts */
		if((sDedupBeforCIFCreation.equalsIgnoreCase("true") &&  strDedupSearch.equalsIgnoreCase("false") && strDFlag.equalsIgnoreCase("false")) && !( isCopy.equalsIgnoreCase("Y") || convToCust.equalsIgnoreCase("Y") ))
		{

Utils.showRetailDedupScreen(out, req, strScreenName);

		}




	   else{
	/* CIF Additional Enhancements CRM10402 : R42DRELM: changes for dedup screen :ends */
		sb.append("<TITLE>");
        sb.append(this.getSystemString("Default", "Title"));
        sb.append("</TITLE>");

        sb.append("<HEAD><SCRIPT language='javascript'> var applPath = '" +  sApplPath  + "'; </SCRIPT> ");
 	 	sb.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/SSOParameter.js \"></SCRIPT>");
        sb.append("<SCRIPT type=\"text/javascript\" src=\""+ messageFile+"\" language=\"javascript\"></SCRIPT>");
        sb.append("<SCRIPT>");
        sb.append(" function initThis() {");
       //Approval change:Start(Paasing Approval flag and BoType to Main
        if(isPopup.trim().equalsIgnoreCase("No")) {
	/* CIF Changes for Tabs On Demand starts */
        if(isCopy.equalsIgnoreCase("Y")){
			sb.append("  tempFrm.showCopyMessage('Customer');");
		}
             //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
            //Changes by Haresh
            //out.println("  tempFrm.addCIFPrimaryForm(\""+tabname1+"\", '../servlet/com.infy.cis.ui.cif.MainAccountDetForm?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&operationType="+operationType+  "&AccessOwnerGroup=" + AccessOwnerGroup + "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&isMCEdited="+isMCEdited+"&mcJNDIFlag="+mcJNDIFlag+"&IntWFID="+strIntWFID+" ', null,'Y');");//Changes for WFlow POC -- IntWFID also being passed.
            /* Changed By Hema.s to include bank id for tracker 142619 Start*/
            /* Changes for Tracker 213512 Start*/
            //changes for tracker id :253845 starts
          	 /*Checksum recon from 10.3 SUPP*/
	   //Changes done by ekta for cif deceased starts
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  tempFrm.addCIFPrimaryForm(\""+tabname1+"\", '../servlet/com.infy.cis.ui.cif.MainAccountDetForm?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&acrossSearch=" +strAcrossSearch + "&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&operationType="+operationType+  "&AccessOwnerGroup=" + AccessOwnerGroup + "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&isMCEdited="+isMCEdited+"&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&IntWFID="+strIntWFID+"&bank_id="+strBank_id+" ', null,'Y');");//Changes for WFlow POC -- IntWFID also being passed.
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
            /* Changes done by Kanika for Cif Deceased ends */
			 /*Checksum recon from 10.3 SUPP*/
            //changes for tracker id :253845 ends
             /* Changes for Tracker 213512 ENd*/
             /* Changed By Hema.s to include bank id for tracker 142619  End */
             //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
           /* Start - Changes done for CRM70TNG */
            //out.println("  tempFrm.addCIFPrimaryForm(\""+tabName+"\", '../servlet/com.infy.cis.ui.cif.MainDemographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "', null,'Y');");
           //out.println("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "', null,'N');");
          //  out.println("  tempFrm.addCIFPrimaryForm(\""+tabName3+"\", '../servlet/com.infy.cis.ui.cif.MainBankDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "', null,'N');");
		/* CRM70t-ST: TRACKER# : 78488	BEGIN OF CHANGES */
           // out.println("  tempFrm.addCIFPrimaryForm(\""+tabName4+"\", '../servlet/com.infy.cis.ui.cif.MainTFDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "', null,'N');");
		/* CRM70t-ST: TRACKER# : 78488	END OF CHANGES */
/* CIF Changes for Tabs On Demand ends */
          // out.println("  tempFrm.selectTab(\""+tabname1+"\");");
          //  out.println("  tempFrm.setTabsVisible(true);");
			/* End - Changes done for CRM70TNG */

		if(isReadOnly.equalsIgnoreCase("Y")){
								 //TrackerID:233978 changes starts
								 /* Tracker ID :756914 - Chrome Porting Changes Starts -*/
						 sb.append("  tempFrm.frames[3].setReadOnlyMode();");
						 /* Tracker ID :756914 - Chrome Porting Changes Ends -*/
						 //TrackerID:233978 changes ends
			 /*
			  * added by Vishal
			  * not showing close button in case of calling this file from ShowEntityDeDupDetails
			  */
			  /* Tracker #: 78495 start of Changes */
			   //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
			   //change done by Haresh
			 /*Checksum recon from 10.3 SUPP*/
		 /* tracker id 345997 changes starts */
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName+"\", '../servlet/com.infy.cis.ui.cif.MainDemographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType +  "&IncidentID="+incidentId +"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&isMCEdited="+isMCEdited+"&bank_id="+strBank_id+" ', null,'N');");/* Line Added- Changes done for CRM70TNG */
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
 /* tracker id 336352 changes starts */
                //sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy + "&acrossSearch=" +strAcrossSearch + "&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&mcJNDIFlag="+mcJNDIFlag+"&bank_id="+strBank_id+"&cifType="+cifType+"&Bank_Entity="+Bank_Entity+"&Relation="+Relation+" ', null,'N');");
                                   //sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&acrossSearch=" + strAcrossSearch+"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&bank_id="+strBank_id+"&cifType="+cifType+"&Bank_Entity="+Bank_Entity+"&Relation="+Relation+"&ScreenName="+ScreenName+" ', null,'N');");
                           /* tracker id 336352 changes ends */
		 /* tracker id 345997 changes ends */
			 /*Checksum recon from 10.3 SUPP*/
             //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
// Changes for CRM10SPE -Psychographic tab was made on demand
              //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
              //change done by Haresh

			 //sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&bank_id="+strBank_id+" ', null,'N');");
			 /*Checksum recon from 10.3 SUPP*/
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
			 	sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&acrossSearch=" + strAcrossSearch+"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&bank_id="+strBank_id+"&cifType="+cifType+"&Bank_Entity="+Bank_Entity+"&Relation="+Relation+"&IncidentID="+incidentId +"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&ScreenName="+ScreenName+" ', null,'N');");
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
			 /*Checksum recon from 10.3 SUPP*/
             //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
// Changes for CRM10SPE -Psychographic tab was made on demand
			 if( IsShowButtons.equalsIgnoreCase("Y"))
			   {/* Tracker #: 78495 end of Changes */
			   sb.append("  tempFrm.setCifButtonsVisible(true,30);");
			   }
			 else
			   {
			   sb.append("  tempFrm.setCifButtonsVisible(false,30);");
			   }
			 /* end of addition Vishal */

			 sb.append("  tempFrm.hideSaveButton('true');");
			 sb.append("  tempFrm.hideSubmitButton('true');");
		 	 /****Change for tracker no 88742*********:Start*/


		 	 if( IsDedup.equalsIgnoreCase("Y")){
				 sb.append("  tempFrm.hideCancelButton('true');");
			  }
			 /****Change for tracker no 88742*********:End*/


		 }else {
            sb.append("  tempFrm.setButtonsVisible(false);");
            //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
            //change done by Haresh
            //changes for tracker id :253845 starts
            //Checksum recon from 10.3 SUPP
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
			sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName+"\", '../servlet/com.infy.cis.ui.cif.MainDemographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY="+sFldHashkey+"&SECUREHKEY="+sSecurKey+"', null,'Y');");/* Line Added- Changes done for CRM70TNG */
//Security Recon Changes : Tracker Id : 356601 ENDS
            //Checksum recon from 10.3 SUPP
			//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
// Changes for CRM10SPE -Psychographic tab was made on demand
            //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
            //change done by Haresh
			/* CRM102ST: TrackerID:180825 Begin of Change */
   		 //Changes made for pyschographic tab to load on demand
       	 /*Checksum recon from 10.3 SUPP*/
//Security Recon Changes : Tracker Id : 356601 STARTS
         sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL +  "&isMCEdited="+isMCEdited+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+ "&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&mcJNDIFlag="+mcJNDIFlag+"&entityType="+strEntityType+"', null,'Y');");
//Security Recon Changes : Tracker Id : 356601 ENDS
		 /*Checksum recon from 10.3 SUPP*/
          /* CRM102ST: TrackerID:180825 End of Change */
		   //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
// Changes for CRM10SPE -Psychographic tab was made on demand
		}
		/* Start- Changes done for CRM70TNG */
// Changes for CRM10SPE -Psychographic tab was made on demand
		//sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"', null,'Y');");
// Changes for CRM10SPE -Psychographic tab was made on demand
//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
//change done by Haresh
        //Checksum recon from 10.3 SUPP
//Security Recon Changes : Tracker Id : 356601 STARTS
		sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName3+"\", '../servlet/com.infy.cis.ui.cif.MainBankDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&isMCEdited="+isMCEdited+ "&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&mcJNDIFlag="+mcJNDIFlag+"', null,'N');");
		//change done by Haresh
		//Checksum recon from 10.3 SUPP
        sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName4+"\", '../servlet/com.infy.cis.ui.cif.MainTFDetFormCust?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&isPopup=Yes&apprFlag=" + apprFlag + "&operationType="+operationType+ "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"', null,'N');");
        //Checksum recon from 10.3 SUPP
        sb.append("  tempFrm.addCIFPrimaryForm(\""+tabName5+"\", '../servlet/com.infy.cis.ui.cif.MainBaselDetFormCust?accountId=" + accountId + "&saveSubmit=" + saveSubmit + "&mainAccId=" + mainAccId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "&entityID=" + entityID + "&operationType="+operationType+ "&boType=" + boType+ "&isReadOnly=" +isReadOnly+"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+ "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"', null,'N');");
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
		//Checksum recon from 10.3 SUPP
//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
        sb.append("  tempFrm.selectTab(\""+tabname1+"\");");
        sb.append("  tempFrm.setTabsVisible(true);");
		//changes for tracker id :253845 ends
        /* End- Changes done for CRM70TNG */
        } else {

				/************CIF LOS Bypass change(Edit Mod):Start*****************/
				 if(byPassFlag.equals("Y")){
					 	// Changes for 386432 Starts Here
					sb.append("  tempFrm.hideSaveButton('true');");
				//	sb.append("  tempFrm.hideSubmitButton('true');");
					//Merging of PIT
						// Changes for 386432 Ends Here
					sb.append("  tempFrm.frames[3].cancelBut.disabled=false;");  /* Tracker 132465 */
					sb.append("  tempFrm.frames[3].setReadOnlyMode();");
				}
				else if(isReadOnly.equalsIgnoreCase("Y") && isBasel.equalsIgnoreCase("Yes") ){
						 sb.append("  tempFrm.hideSaveButton('true');");
						 sb.append("  tempFrm.hideSubmitButton('true');");

				}
				/************CIF LOS Bypass change(Edit MOd):End*****************/

				/************CIF LOS Bypass change:Start*****************/
				//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
				//changes for tracker id :253845 starts
					if((isGeneral.equalsIgnoreCase("Yes"))||(UI.equalsIgnoreCase("A"))|| convToCust.equals("Y")){
/*changes done by Haresh*/
 /* Changes for Tracker 213512 Start*/
                            /*Checksum recon from 10.3 SUPP*/
	   //Changes done by ekta for cif deceased starts
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  tempFrm.addPrimaryForm(\""+tabname1+"\", '../servlet/com.infy.cis.ui.cif.MainAccountDetForm?accountId=" + accountId + "&acrossSearch=" +strAcrossSearch + "&mainAccId=" + mainAccId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&creFlag="+strCreFlag + "&entityURL=" + entityURL + "&byPassFlag=" + byPassFlag + "&isReadOnly=" +isReadOnly +"&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+ "&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey +"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"', null);");
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
/* Changes done by Kanika for Cif Deceased ends */
							 /*Checksum recon from 10.3 SUPP*/
 /* Changes for Tracker 213512 Start*/
					}
					if((isDemo.equalsIgnoreCase("Yes"))||(UI.equalsIgnoreCase("I"))|| convToCust.equals("Y")){
/*changes done by Haresh*/							sb.append("  tempFrm.addPrimaryForm(\""+tabName+"\", '../servlet/com.infy.cis.ui.cif.MainDemographicDetFormCust?accountId=" + accountId + "&mainAccId=" + mainAccId +"&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&byPassFlag=" + byPassFlag + "&isReadOnly=" +isReadOnly +"&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"', null);");
					}
					if((isPsyco.equalsIgnoreCase("Yes"))||(UI.equalsIgnoreCase("D"))){
/*changes done by Haresh*/							/* CRM102ST: TrackerID:180825 Begin of Change */
													/*Checksum recon from 10.3 SUPP*/
				/* Changes done by Kanika for Cif Deceased starts */
				String strCustStatus=req.getParameter("custStatus");
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  tempFrm.addPrimaryForm(\""+tabName2+"\", '../servlet/com.infy.cis.ui.cif.MainPsychographicDetFormCust?accountId=" + accountId + "&mainAccId=" + mainAccId + "&acrossSearch=" +strAcrossSearch + "&isPopup=Yes &apprFlag=" + apprFlag + "&boType=" + boType + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&strCustStatus="+strCustStatus + "&entityURL=" + entityURL + "&byPassFlag=" + byPassFlag + "&isReadOnly=" +isReadOnly +"&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+"&isMCEdited="+isMCEdited+ "&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"&mcJNDIFlag="+mcJNDIFlag+"&entityType="+strEntityType+"', null);");
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
				/* Changes done by Kanika for Cif Deceased ends */
													/*Checksum recon from 10.3 SUPP*/
                                                    /* CRM102ST: TrackerID:180825 End of Change */
					}
					//changes for tracker id :253845 ends
				//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
				/************CIF LOS Bypass change:End*****************/
				//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
					//changes for tracker id :253845 starts
					if(isBank.equalsIgnoreCase("Yes") || convToCust.equals("Y")){
/*changes done by Haresh*/							sb.append("  tempFrm.addPrimaryForm(\""+tabName3+"\", '../servlet/com.infy.cis.ui.cif.MainBankDetFormCust?accountId=" + accountId + "&mainAccId=" + mainAccId + "&isPopup=Yes&apprFlag=" + apprFlag + "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+ "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"', null);");
					}
					if(isTF.equalsIgnoreCase("Yes") || convToCust.equals("Y")){
/*changes done by Haresh*/							sb.append("  tempFrm.addPrimaryForm(\""+tabName4+"\", '../servlet/com.infy.cis.ui.cif.MainTFDetFormCust?accountId=" + accountId + "&mainAccId=" + mainAccId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&convToCust=" + convToCust + "&convType=" + convType + "&entityId=" + entityId + "&entityURL=" + entityURL + "&boType=" + boType +"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+ "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"', null);");
					}
					//changes for tracker id :253845 ends
					//Basel changes
					if(isBasel.equalsIgnoreCase("Yes")){
                            //Checksum recon from 10.3 SUPP
		/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
							sb.append("  tempFrm.addPrimaryForm(\""+tabName5+"\", '../servlet/com.infy.cis.ui.cif.MainBaselDetFormCust?accountId=" + accountId + "&saveSubmit=" + saveSubmit + "&mainAccId=" + mainAccId + "&isPopup=Yes&apprFlag=" + apprFlag + "&boType=" + boType + "&AccessOwnerGroup=" + AccessOwnerGroup + "&operationType="+operationType+ "&entityID=" + entityID + "&boType=" + boType+ "&isReadOnly=" +isReadOnly+"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&dob="+sDob+ "&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&IncidentID="+incidentId+"&workItemId="+workItemId+"&IntractionID="+intractionId+"&FLDHASHKEY=" +sFldHashkey+"&SECUREHKEY=" +sSecurKey+"', null);");
//Security Recon Changes : Tracker Id : 356601 ENDS
		/* changes for tracker 356601 security ends*/
                            //Checksum recon from 10.3 SUPP
					}
				    //Basel changes
          }

        sb.append("  }");


// Changes for tracker id :253845  Start
      //In the case of edit call CifSRMDynamicWizardForEdit.html
       if(isReadOnly.equalsIgnoreCase("Y")||isCopy.equalsIgnoreCase("Y")||isGeneral.equalsIgnoreCase("Yes")||isDemo.equalsIgnoreCase("Yes")||isPsyco.equalsIgnoreCase("Yes")||isBank.equalsIgnoreCase("Yes")||isTF.equalsIgnoreCase("Yes") || convToCust.equals("Y")){
// Changes for tracker id :253845  End

       		sb.append("</SCRIPT>");
        	sb.append("</HEAD>");
        	sb.append("<FRAMESET name='mainFrmSet' FRAMESPACING=\"0\" FRAMEBORDER=\"0\" BORDER=\"0\" onload = initThis()>");
			sb.append("<FRAME name='tempFrm' NORESIZE=false id='tempFrm' SRC = '../wizards/html/CifSRMDynamicWizardForEdit.html'>");
        	sb.append("</FRAMESET>");
        	sb.append("</HTML>");
        	callAccountDetWizardHook("callAccountDetWizard_Method_Mod", sb.toString(), req, bc);
        	String sbFinalHookMod = (String)req.getAttribute("sbFinalHookMod");
    		if(sbFinalHookMod != null && !"".equals(sbFinalHookMod))
    		{
    			out.println(sbFinalHookMod);
    		}
        	else
        	{
				out.println(sb.toString());
			}
        }

        //otherwise call CifSRMDynamicWizard.html
        else{
			 sb.append("</SCRIPT>");
		     sb.append("</HEAD>");
		     sb.append("<FRAMESET name='mainFrmSet' FRAMESPACING=\"0\" FRAMEBORDER=\"0\" BORDER=\"0\" onload = initThis()>");
			 sb.append("<FRAME name='tempFrm' NORESIZE=true id='tempFrm' SRC = '../wizards/html/CifSRMDynamicWizard.html'>");
		     sb.append("</FRAMESET>");
		     sb.append("</HTML>");
             callAccountDetWizardHook("callAccountDetWizard_Method_Main", sb.toString(), req, bc);       
		     String sbFinalHookMain = (String)req.getAttribute("sbFinalHookMain");
		     if(sbFinalHookMain != null && !"".equals(sbFinalHookMain))
			 {
				 out.println(sbFinalHookMain);
			 }
		     else
		     {
				out.println(sb.toString());
			 }
}
       }
		}
		

}
	private void callAccountDetWizardHook(String methodName, String sb, HttpServletRequest req, SRMBusinessContext bc)throws ClassNotFoundException, WriterHookException, Exception 
	{
		ConcurrentHashMap hookParams = new ConcurrentHashMap();
		hookParams.put("sb", sb);
		hookParams.put("Request", req);
		Utils.invokeHook(HOOK_CUSTOM, methodName,"AccountDetWizard", hookParams, bc);
	}
}











