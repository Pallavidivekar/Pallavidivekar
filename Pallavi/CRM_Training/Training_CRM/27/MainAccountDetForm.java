/******************************************************************************
 * Copyright (c) 2000-2005 Infosys Ltd.  All rights reserved.
 *
 * $Workfile: MainAccountDetForm.java $
 *
 * Author:Suresh Anand M.
 *
 * $Archive:

 * $History: MainAccountDetForm.java $
 *
 *****************************************************


********************  Version 1 *********************
 * User: Suman Kumar Date: 02/07/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes:  changes related to Approval
 *
 * Reviewed by:
 ******************************************************

*******************  Version 2  ************************
 * User: Suman Kumar Date: 03/21/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes:  CIF LOS Bypass changes
 *
 * Reviewed by:
********************  Version 3  *********************
* User: Sureshanand_m Date: 05/10/05    Time: 3:30p
* Updated in: $/CRM70/com/infy/cis/ui/cif
* Project Code: CRM70CIF
*
* Comment:  CORE-CIF Approval Changes
*
* Modified by: Suresh Anand M.
* Reviewed by: Ruchika Mittal
******************************************************/
/********************  Version 4 *********************
* User: Amit malhotra Date: 08/08/07    Time: 10:47p
* Updated in
* Project Code: ERPBOME1
* Tarcker Id : 113066
* Changes: Cross Entity Copy
*
* Reviewed by:
******************************************************/




package com.infy.cis.ui.cif;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import com.infy.cis.ui.common.SRMUICommon;
import com.infy.cis.servletruntime.CISHttpCachedServlet;
import com.infy.cis.servletruntime.CISSessionContext;

/**
    *Brief Description of class:
	*
	*Functionality: Defines frames for General tab and calls Account_det.java.
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

public class MainAccountDetForm extends CISHttpCachedServlet {

    // -------------------------------------------------------------------------
    // Class variables
    // -------------------------------------------------------------------------
    private static final String MODULE_NAME = "cif:MainAccountDetForm";

    public String getModuleName() { return MODULE_NAME; };

    protected void serviceRequest (HttpServletRequest req, HttpServletResponse resp)
    	throws Exception
    {
		////System.out.println("MainAccountDetForm*****************************************");
		String strIntWFID = req.getParameter("IntWFID");//Changes for 'WFlow' POC
        setContentType("text/html",resp);
        PrintWriter out = resp.getWriter();
        StringBuilder sb = new StringBuilder();

	    CISSessionContext sc = context.getSessionContext(req);
		String ScrLayout = "";
		ScrLayout = sc.getScreenLayout();
		if(ScrLayout.equalsIgnoreCase(SRMUICommon.RTL)){
        	sb.append("<HTML dir='rtl'>");
		}
		else{
			 sb.append("<HTML>");
		}

		/* Tracker #: 90197 Begin of Changes for attibute masking */
				String AccessOwnerGroup = req.getParameter("AccessOwnerGroup");
		 /* Tracker #: 90197 End of Changes */

 	 	sb.append("<HEAD>");
 	 	sb.append("<SCRIPT LANGUAGE='javascript' src=\"../common/js/SSOParameter.js \"></SCRIPT>");
 	 	sb.append("</HEAD>");
        String isPopup = req.getParameter("isPopup");
        String  isReadOnly = req.getParameter("isReadOnly");

        //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
		  String  strAcrossSearch = req.getParameter("acrossSearch");
		  String  strBank_id = req.getParameter("bank_id");
        //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra

		//Approval change:Start
		String  boType=req.getParameter("boType");
        String  isCopy = req.getParameter("isCopy");
		boolean apprFlag=Boolean.valueOf(req.getParameter("apprFlag")).booleanValue();
		boolean editFlag=false;
		//Approval change:End
        String isMCEdited = req.getParameter("isMCEdited");
  		/* Changes done by Kanika for Cif Deceased starts */
		String strCreFlag = req.getParameter("creFlag");
		/* Changes done by Kanika for Cif Deceased ends */


        /************CIF LOS Bypass change:Start*****************/
		String byPassFlag=req.getParameter("byPassFlag");
		/************CIF LOS Bypass change:End*****************/
		// Changes for tracker id :253845 Start

				String convToCust = req.getParameter("convToCust");
				String convType   = req.getParameter("convType");
				String entityURL = req.getParameter("entityURL");
				String entityId   = req.getParameter("entityId");

        // Changes for tracker id :253845 End

	/******* Save and Submit Changes for Getting the operationType from DetWizard file : Start******/
		String operationType = req.getParameter("operationType");
		if(operationType.equals("Queue"))
		{
			operationType = "Queue";
		}else if(operationType.equals("EditEntity")){
			operationType = "Edit Entity";
		}
	/******* Save and Submit Changes for Getting the operationType from DetWizard file : End******/

		// vasanth's changes start
		String blacklisted=req.getParameter("blacklisted");
		String suspended=req.getParameter("suspended");
		String negated=req.getParameter("negated");
		String chkBSN=req.getParameter("chkBSN");
		String mcJNDIFlag=req.getParameter("mcJNDIFlag");
		// vasanth's changes end
		// Changes for tracker id :253845 Start
				if(convToCust == null)
				{
					convToCust = "";
				}
				if(convType == null)
				{
					convType = "";
				}
				if(entityURL == null)
				{
					entityURL = "";
				}
				if(entityId == null)
				{
					entityId = "";
				}

		// Changes for tracker id :253845 End
        if(isCopy == null || isCopy == "") {
			isCopy = "N";
        }
		if(isReadOnly == null) {
				            isReadOnly = "N";
        }

        if(isPopup == null) {
            isPopup = "No";
        }
        String accountId = req.getParameter("accountId");
        String mainAccId = req.getParameter("mainAccId");
								if(accountId == null) {
								  accountId = "";
        }

        //Approval change:Start
        if(boType == null) {
		            if(apprFlag)
		            	boType = "Mod";
		            else
		            	boType = "Main";
        }

        if((!accountId.equals("") || convToCust.equals("Y"))  && boType.equalsIgnoreCase("Main")){

				editFlag=true;
		}

		/*Checksum recon from 10.3 SUPP*/
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
			String intractionId=req.getParameter("IntractionID");
//Security Recon Changes : Tracker Id : 356601 ENDS
			String incidentId=req.getParameter("IncidentID");
			String workItemId=req.getParameter("workItemId");
		 /*Checksum recon from 10.3 SUPP*/

		sb.append("<FRAMESET FRAMEBORDER=0 FRAMESPACING=0 id='prodFormContainer' rows='100%,0%'>");

/******* Save and Submit Changes for passing the operationType to Det & ModDet Files : Start******/
		if(boType.equals("Main") && editFlag){
			// Changes for tracker id :253845 Start
					if(convToCust.equals("Y"))
					{
//Security Recon Changes : Tracker Id : 356601 STARTS
						sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.Account_det?isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&apprFlag=" +apprFlag +"&operationType=" +operationType+"&byPassFlag=" +byPassFlag +"&convToCust=" +convToCust +"&convType=" +convType + "&entityId=" + entityId + "&entityURL=" +entityURL+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>");
//Security Recon Changes : Tracker Id : 356601 ENDS
		}
			/* changes for tracker 356601 security ends*/
			else if(accountId.equals("")) {
				//changes for tracker id :253845 ends
				//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
                /*Checksum recon from 10.3 SUPP*/
// Changes for Deceased CIF Starts
			/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.Account_det?bank_id=" + strBank_id + "&acrossSearch=" + strAcrossSearch + "&apprFlag=" +apprFlag +"&operationType=" +operationType+"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN +"&AccessOwnerGroup=" + AccessOwnerGroup +" &isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>");
//Security Recon Changes : Tracker Id : 356601 ENDS
			/* changes for tracker 356601 security ends*/
// Changes for Deceased CIF Ends
				//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
			}else {
				if(!apprFlag||editFlag){
					/************CIF LOS Bypass change:Start*****************/
					//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
                    /*Checksum recon from 10.3 SUPP*/
// Changes for Deceased CIF Starts
			/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.Account_det?bank_id=" + strBank_id + "&acrossSearch=" + strAcrossSearch + "&isReadOnly=" +isReadOnly +"&isCopy=" +isCopy +"&accountId=" + accountId + "&apprFlag=" +apprFlag +"&byPassFlag=" +byPassFlag +"&operationType=" +operationType +"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN +"&AccessOwnerGroup=" + AccessOwnerGroup +"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>");
//Security Recon Changes : Tracker Id : 356601 ENDS
			/* changes for tracker 356601 security ends*/
// Changes for Deceased CIF Ends
					//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
					/************CIF LOS Bypass change:End*****************/
				} else {
					//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
                    /*Checksum recon from 10.3 SUPP*/
// Changes for Deceased CIF Starts
			/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.AccountMod_det?bank_id=" + strBank_id + "&acrossSearch=" + strAcrossSearch + "&isReadOnly=" +isReadOnly +"&mainAccId=" + mainAccId + "&isCopy=" +isCopy +"&accountId=" + accountId + "&apprFlag=" +apprFlag +"&operationType=" +operationType +"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN +"&AccessOwnerGroup=" + AccessOwnerGroup +"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>");
//Security Recon Changes : Tracker Id : 356601 ENDS
			/* changes for tracker 356601 security ends*/
// Changes for Deceased CIF Ends
					//Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
				}
			}
		}else{
			if(accountId.equals("")) {
				//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
                /*Checksum recon from 10.3 SUPP*/
				/* Changes done by Kanika for Cif Deceased starts */
			/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.AccountMod_det?bank_id=" + strBank_id + "&acrossSearch=" + strAcrossSearch + "&apprFlag=" +apprFlag +"&operationType=" +operationType+"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&AccessOwnerGroup=" + AccessOwnerGroup +"&IntWFID="+strIntWFID+"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>"); /* Changes for 'WFlow' POC -- 'IntWFID' also being passed */
//Security Recon Changes : Tracker Id : 356601 ENDS
			/* changes for tracker 356601 security ends*/
				/* Changes done by Kanika for Cif Deceased ends */
			} else {
                /*Checksum recon from 10.3 SUPP*/
				/* Changes done by Kanika for Cif Deceased Starts */
			/* changes for tracker 356601 security begins*/
//Security Recon Changes : Tracker Id : 356601 STARTS
sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formDispFrame'  id='formDispFrame' SRC='../servlet/com.infy.cis.ui.cif.AccountMod_det?bank_id=" + strBank_id + "&acrossSearch=" + strAcrossSearch + "&isReadOnly=" +isReadOnly +"&mainAccId=" + mainAccId + "&isCopy=" +isCopy +"&accountId=" + accountId + "&apprFlag=" +apprFlag +"&operationType=" +operationType+"&blacklisted="+blacklisted+"&suspended="+suspended+"&negated="+negated+"&chkBSN="+chkBSN+"&AccessOwnerGroup=" + AccessOwnerGroup +"&isMCEdited="+isMCEdited+ "&mcJNDIFlag="+mcJNDIFlag+"&creFlag="+strCreFlag+"&workItemId="+workItemId+"&IncidentID="+incidentId+"&IntractionID="+intractionId+"&FLDHASHKEY=" + sFldHashkey +"&SECUREHKEY=" + sSecurKey+"'>");
//Security Recon Changes : Tracker Id : 356601 ENDS
			/* changes for tracker 356601 security ends*/
				/* Changes done by Kanika for Cif Deceased Ends */
			}
			   //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
		}
/******* Save and Submit Changes for passing the operationType to Det & ModDet Files : End******/
		sb.append("  <FRAME MARGINHEIGHT=0 MARGINWIDTH=0 name='formSaveFrame'  id='formSaveFrame' SRC='../common/html/blank.html'>");
		sb.append("</FRAMESET>");
		sb.append("</HTML>");
		out.println(sb.toString());
	}

}




