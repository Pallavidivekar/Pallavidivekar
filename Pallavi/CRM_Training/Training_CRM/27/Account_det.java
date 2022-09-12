/******************************************************************************
 * Copyright (c) 2000-2005 Infosys Ltd.  All rights reserved.
 *
 * $Workfile: Account_det.java $
 *
 * Author: Raghu
 *
 * $Archive: /FCRM62BASE/com/infy/cis/ui/admin/Account_det.java $
 *
 * $History: Account_det.java $
 * ********************  Version 16*********************
 * User: Amit malhotra Date: 08/08/07    Time: 10:47p
 * Updated in
 * Project Code: ERPBOME1
 * Tarcker Id : 113066
 * Changes: Cross Entity Copy
 *******************  Version 15  *****************
 * User: Vikas Gaba Date: 08/03/07    Time: 4:47p
 * Updated in
 * Project Code: ERCBOCF1
 *
 * Changes:CIF Usability Changes
 *
 *
 * Reviewed by:
 *******************  Version 14  *****************
 * User: Suman Kumar Date: 09/26/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70ST
 *
 * Changes:Card_holder Changes
 *
 *
 * Reviewed by:
 *******************  Version 13  *****************
 * User: Suman Kumar Date: 04/18/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes:Changed s1,s2,s3,s4 to meaningful varriable Name
 * and Address CleanUp
 *
 * Reviewed by:

 *******************  Version 12  *****************
 * User: Suman Kumar Date: 03/24/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes:Related to Minor Age Configuration parameter
 *
 * Reviewed by:
 *******************  Version 11  *****************
 * User: Suman Kumar Date: 03/21/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes:  CIF LOS Bypass changes
 *
 * Reviewed by:
 * *****************  Version 10  *****************
 * User: Sumedh_samant Date: 1/18/05    Time: 6:46p
 * Updated in $/CRM70CIF/com/infy/cis/ui/admin
 *
 * CIF Changes. Related to Minor Age Configuration parameter
 * Modified by:
 * Venkatachalam
 * Reviewed by:
 * Ruchika
 *
 * *****************  Version 9  *****************
 * User: Sumedh_samant Date: 1/22/04    Time: 7:46p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/admin
 * Tracker number: 61030/61031
 * Changes. Related to ML.
 * Modified by:
 * Sumedh and Raghv
 * Reviewed by:
 * Shiva(201005) & Manoj
 *
 * *****************  Version 8  *****************
 * User: 201347       Date: 3/12/03    Time: 3:07p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/admin
 * Tracker# 49738 (recon of NCB agent lookup changes)
 *
 * Removed the query to populate the agent dropdowns. In edit and view
 * modes, the selected agent name will be passed as custom data.
 *
 * Modified by: Sachin Holla
 * Reviewd by: Naveen
 *
 * *****************  Version 7  *****************
 * User: Pavithra_rajesh Date: 30/01/03   Time: 5:34p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/admin
 * Tracker : 48074
 *
 * Changes Done : The pointer to the caching is now to
 * CurrencyAndRateCache.java as the SRMCurrency.java no longer holds the
 * caching implimentations for CurrencyBO and ExchangeRateBO.
 *
 * Done By : Pavithra R
 *
 * *****************  Version 6  *****************
 * User: Pavithra_rajesh Date: 28/01/03   Time: 7:05p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/admin
 * Tracker : 48074
 * =============
 * Replaced Tracker name Currency BO and ExchangeRateBO with the tracker
 * id 48074.
 *
 * By Pavithra R
 *
 * *****************  Version 5  *****************
 * User: Pavithra_rajesh Date: 28/01/03   Time: 5:13p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/admin
 * Tracker : CurrencyBO & ExchangeRateBO
 * =================================
 * Utilized the caching mechanism to enhance perfomance.
 *
 * Done By
 * Pavithra R
 *
 * *****************  Version 4  *****************
 * User: Vinayashri_a Date: 8/01/03    Time: 7:08p
 * Updated in $/CRM61DEV/com/infy/cis/ui/admin
 * Tracker ID : 47380
 *
 * Changes:
 * The xsl filename for views is obtained from the view, which will
 * provide customization feature for views
 *
 * Modified By:
 * vinayashri
 *
 * Reviewed by:
 * Gayas
 *
 * *****************  Version 3  *****************
 * User: Vinayashri_a Date: 21/12/02   Time: 4:24p
 * Updated in $/CRM61DEV/com/infy/cis/ui/admin
 * Tracker ID: Multicurrency changes
 *
 * Changes:
 * All the amount fields will be displayed along with a currency field
 *
 * Modified By:
 * vinayashri
 *
 * Reviewed By:
 * Gayas
 *
 * *****************  Version 10  *****************
 * User: Palani_munusamy Date: 8/26/02    Time: 3:23p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * Year drop down change revert back as Interface People changed the
 * default Customer DOB to 1/1/1950.
 *
 * *****************  Version 9  *****************
 * User: Palani_munusamy Date: 8/26/02    Time: 3:07p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * tracker 42160
 *
 * Year dropdown values changed. Year dropdown values will be from
 * Current  Year - 110 to Current Year.
 *
 * *****************  Version 8  *****************
 * User: Anand_mandil Date: 8/08/02    Time: 5:29p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * Tracker ID : 41959
 * Commented out line for fetching AccountBO.Status.As it will come as a
 * part of presentation Data through View.
 *
 * *****************  Version 7  *****************
 * User: Mahendra_aher Date: 6/26/02    Time: 8:21p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * Changed to Show 2002 in the Year drop down
 *
 * *****************  Version 6  *****************
 * User: Palani_munusamy Date: 6/19/02    Time: 8:52p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * Added code to show drop down for Manager ID and Rep ID
 *
 * *****************  Version 5  *****************
 * User: Palani_munusamy Date: 6/13/02    Time: 5:46p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * Added logic for Customer, Contact and Suspects for tab in tab
 *
 * *****************  Version 4  *****************
 * User: Anand_mandil Date: 6/04/02    Time: 5:25p
 * Updated in $/CRM10AR/com/infy/cis/ui/admin
 * for Reconcellation from BO to AR
 *
 * reviewed By :
 * Mahandra_Aher
 *
 * *****************  Version 9  *****************
 * User: Anand_mandil Date: 6/01/02    Time: 10:49a
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * Added Table Header for LifeStyle Details
 *
 * Reviewed By :
 *  Mahandra_aher
 *
 * *****************  Version 8  *****************
 * User: Anand_mandil Date: 5/29/02    Time: 5:03p
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * Added code for Relationship.
 *
 *
 * reviewed by
 *
 * Mahendra_Aher
 *
 * *****************  Version 7  *****************
 * User: Anand_mandil Date: 5/24/02    Time: 10:35a
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * added method calls for relationship.
 * *****************  Version 6  *****************
 * User: Anand_mandil Date: 5/22/02    Time: 11:59a
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * uncomment the demo & pshyo  calls.
 *
 * *****************  Version 5  *****************
 * User: Manoj_chodankar Date: 16-05-02   Time: 8:00p
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * Modified Files for build to go through.
 *
 * *****************  Version 3  *****************
 * User: Anand_mandil Date: 5/16/02    Time: 12:43p
 * Updated in $/CRM10BO/com/infy/cis/ui/admin
 * Added new method calls for demo & psychographic
 *
 * Modified by
 * anand
 *
 * reviewed by
 * mahendra
 *
 * *****************  Version 37  *****************
 * User: Hima         Date: 11/01/01   Time: 7:45p
 * Updated in $/com/infy/cis/ui/admin
 * to modify addCustomChoices
 *
 * *****************  Version 36  *****************
 * User: Dalip        Date: 10/24/01   Time: 1:23p
 * Updated in $/com/infy/cis/ui/admin
 * Modified XMLFormAssist constructor to take CISSessionContext as a
 * parameter
 *
 * *****************  Version 35  *****************
 * User: Dalip        Date: 10/19/01   Time: 2:46p
 * Updated in $/com/infy/cis/ui/admin
 * Changed SRMBCException to extend it fromSRMBaseException
 *
 * *****************  Version 34  *****************
 * User: Dalip        Date: 10/18/01   Time: 11:19a
 * Updated in $/com/infy/cis/ui/admin
 * Removed commented code
 *
 * *****************  Version 33  *****************
 * User: Skamath      Date: 10/17/01   Time: 5:08p
 * Updated in $/com/infy/cis/ui/admin
 * Fixed Product List
 *
 * *****************  Version 32  *****************
 * User: Hima         Date: 10/16/01   Time: 8:14p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 31  *****************
 * User: Dalip        Date: 10/15/01   Time: 6:42p
 * Updated in $/com/infy/cis/ui/admin
 * Added Locale as the first argument in translate and closeTranslation
 * methods in XSLAssist
 *
 * *****************  Version 30  *****************
 * User: Chanchal     Date: 6/20/01    Time: 4:04p
 * Updated in $/com/infy/cis/ui/admin
 * #5737 Accounts created from workflow, while editing throws error Fixed
 *
 * *****************  Version 29  *****************
 * User: Satya        Date: 5/16/01    Time: 5:50p
 * Updated in $/com/infy/cis/ui/admin
 * Fix : esc char in comments
 *
 * *****************  Version 28  *****************
 * User: Satya        Date: 5/16/01    Time: 4:40p
 * Updated in $/com/infy/cis/ui/admin
 * CLEANUP : gui to ui
 *
 * *****************  Version 27  *****************
 * User: Dalip        Date: 5/04/01    Time: 5:45p
 * Updated in $/com/infy/cis/ui/admin
 * Code changes for showing form in readonly mode for details
 *
 * *****************  Version 26  *****************
 * User: Dalip        Date: 4/27/01    Time: 3:16p
 * Updated in $/com/infy/cis/ui/admin
 * Extensibility changes all dropdown will come from views
 *
 * *****************  Version 25  *****************
 * User: Hima         Date: 4/17/01    Time: 3:40p
 * Up4d in $/com/infy/cis/ui/admin
 *
 * *****************  Version 23  *****************
 * User: Vikass       Date: 4/17/01    Time: 11:03a
 * Updated in $/com/infy/cis/ui/admin
 * Reference accounts added
 *
 * *****************  Version 22  *****************
 * User: John         Date: 3/05/01    Time: 6:59p
 * Updated in $/com/infy/cis/ui/admin
 * FIX: auto key gen problem
 *
 * *****************  Version 21  *****************
 * User: Shiva        Date: 3/02/01    Time: 8:02a
 * Updated in $/com/infy/cis/ui/admin
 * FIX: concurrency issue?
 *
 * *****************  Version 20  *****************
 * User: Reddy        Date: 2/22/01    Time: 3:15p
 * Updated in $/com/infy/cis/ui/admin
 * Unnecessary queries removed as a perfomance fix
 *
 * *****************  Version 19  *****************
 * User: Hima         Date: 2/13/01    Time: 5:32p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 18  *****************
 * User: John         Date: 2/04/01    Time: 6:14p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 17  *****************
 * User: John         Date: 1/16/01    Time: 6:23p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 16  *****************
 * User: Satya        Date: 1/10/01    Time: 3:54p
 * Updated in $/com/infy/cis/ui/admin
 * Unused Account query commented out
 *
 * *****************  Version 15  *****************
 * User: Shantanu     Date: 12/27/00   Time: 8:02p
 * Updated in $/com/infy/cis/ui/admin
 * for passing xml file directly to xslassist
 *
 * *****************  Version 14  *****************
 * User: Dalip        Date: 12/20/00   Time: 10:52p
 * Updated in $/com/infy/cis/ui/admin
 * optimized the code
 *
 * *****************  Version 13  *****************
 * User: John         Date: 12/16/00   Time: 9:13a
 * Updated in $/com/infy/cis/ui/admin
 * XSLTProcessor.processor (...) replaced with  XSLAssist.translate (context.getSessionContext(req).getSessionLocale(), ...).
 *
 * Several files are checkin and the lable for these files is
 * BC_XSLTPROCESSOR.
 *
 *
 * *****************  Version 12  *****************
 * User: John         Date: 12/12/00   Time: 8:46p
 * Updated in $/com/infy/cis/ui/admin
 * New Exception handling, Remove unwanted logging (llike xml files)
 *
 * *****************  Version 11  *****************
 * User: John         Date: 12/09/00   Time: 6:18p
 * Updated in $/com/infy/cis/ui/admin
 * Fixed : 1766
 *
 * *****************  Version 10  *****************
 * User: John         Date: 11/27/00   Time: 10:15p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 9  *****************
 * User: John         Date: 11/24/00   Time: 12:23p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 8  *****************
 * User: John         Date: 11/14/00   Time: 7:51p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 7  *****************
 * User: Dalip        Date: 11/14/00   Time: 12:46a
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 6  *****************
 * User: Dalip        Date: 10/22/00   Time: 5:35p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 5  *****************
 * User: Dalip        Date: 10/21/00   Time: 5:20p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 4  *****************
 * User: Dalip        Date: 10/21/00   Time: 2:49p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 3  *****************
 * User: Raghu        Date: 18/10/00   Time: 10:18p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 2  *****************
 * User: John         Date: 10/18/00   Time: 12:55p
 * Updated in $/com/infy/cis/ui/admin
 *
 * *****************  Version 1  *****************
 * User: Raghu        Date: 18/10/00   Time: 12:41a
 * Created in $/com/infy/cis/ui/admin
 *
 * *****************  Version 1  *****************
 * User: Raghu        Date: 10/16/00   Time: 6:23p
 * Created in $/com/infy/cis/ui/admin
 * Initial Version
 *
 *****************************************************************************/

package com.infy.cis.ui.cif;

import java.io.PrintWriter;
/* Fix for ticket id 418104 - Begin*/
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
/* Fix for ticket id 418104 - End*/
import java.text.SimpleDateFormat;
import com.infosys.insulate.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.infosys.insulate.util.HashMap;
import com.infosys.insulate.util.concurrent.ConcurrentHashMap;

import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infy.cis.adaptor.web.WebAdaptor;
import com.infy.cis.common.ClassCache;
import com.infy.cis.ui.common.Constants;
import com.infy.cis.common.EditorUtil;
import com.infy.cis.common.KeyGenerationInfo;
import com.infy.cis.common.LocaleConfigInfo;
import com.infy.cis.common.NameValue;
import com.infy.cis.common.SRMFormatter;
import com.infy.cis.custom.CheckSumUtilMain;
import com.infy.cis.custom.EnquiryBOHooks;
import com.infy.cis.exception.FCRMGenericException;
import com.infy.cis.exception.SRMBCException;
import com.infy.cis.exception.WriterHookException;
import com.infy.cis.servletruntime.CISHttpServlet;
import com.infy.cis.servletruntime.CISSessionContext;
import com.infy.cis.srmbo.AccountBO;
import com.infy.cis.srmbo.CorporateBO;
import com.infy.cis.srmbo.AgentBO;
import com.infy.cis.srmbo.AgentGroupMgr;
import com.infy.cis.srmbo.BizCenterBO;
import com.infy.cis.srmbo.CategoryBO;
import com.infy.cis.srmbo.ContactBO;
import com.infy.cis.srmbo.CoreInterfaceBO;
import com.infy.cis.srmbo.ExchangeRateBO;
import com.infy.cis.srmbo.GroupHouseHoldMasterBO;
import com.infy.cis.srmbo.IQuery;
import com.infy.cis.srmbo.PsychographicBO;
import com.infy.cis.srmbo.RelBankModBO;
import com.infy.cis.srmbo.RelationshipBO;
import com.infy.cis.srmbo.SRMAttributeInfo;
import com.infy.cis.srmbo.SRMCollection;
import com.infy.cis.srmbo.SRMQueryBuilder;
import com.infy.cis.srmbo.SRMQueryExpr;
import com.infy.cis.srmbo.SRMQueryResult;
import com.infy.cis.srmbo.SRMRecordSet;
import com.infy.cis.srmbo.SuspectBO;
//changes for tracker id :253845 starts
import com.infy.cis.srmbo.NonCustomerBO;
//changes for tracker id :253845 ends
import com.infy.cis.srmbo.TransFormFn;
import com.infy.cis.srmbo.XML;
import com.infy.cis.srmbo.security.user.SRMBusinessContext;
import com.infy.cis.ui.common.Category;
import com.infy.cis.ui.common.CifDetUtils;
import com.infy.cis.ui.common.CommonQueries;
import com.infy.cis.ui.common.InitAccessControl;
import com.infy.cis.ui.common.QueryAssist;
import com.infy.cis.ui.common.Utils;
import com.infy.cis.ui.common.ViewNames;
import com.infy.cis.ui.common.XMLFormAssist;
import com.infy.cis.ui.common.XSLAssist;
import com.infy.cis.ui.sales.SaleQueries;
import com.infy.cis.viewcfg.ConfigManager;
import com.infy.cis.viewcfg.Views;
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
//Alert server recon in 10.2.14 starts
import com.infy.cis.common.EditorUtil;

	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
//Alert server recon in 10.2.14 ends
public class Account_det extends CISHttpServlet {

	/**** CIF Changes For Smart QB Start ****/   
	public static final String QB_ACCOUNTID = "com_infy_cis_ui_cif_Account_det_AccountID";
	public static final String QB_ENTITYRELATIONSHIPID = "com_infy_cis_ui_cif_Account_det_EntityRelationshipID";
	public static final String QB_COREINTERFACEID = "com_infy_cis_ui_cif_Account_det_CoreInterfaceID";
	/**** CIF Changes For Smart QB End ****/
	//Tracker No 97042 start
	private static final String com_infy_cis_ui_cif_Segmentation_class = "com_infy_cis_ui_cif_Segmentation_class ";
	private static final String com_infy_cis_ui_cif_Sub_Segment = "com_infy_cis_ui_cif_Sub_Segment ";
	//TrackerID:234910 changes starts
	private static final String com_infy_cis_ui_cif_Chargelevel = "com_infy_cis_ui_cif_com_infy_cis_ui_cif_Chargelevel ";
	//TrackerID:234910 changes ends
	//Tracker No 97042 end
	//LocaleConfigInfo user_Locale = null;
	//	private Hashtable hstTable1 = null;
	private static final String HOOK_CUSTOM = "Account_detHook";
    // -------------------------------------------------------------------------
    // Class variables
    // -------------------------------------------------------------------------
    private static final String MODULE_NAME = "cif:Account_det";
    String Currency = "Currency";
    String CurrencyRecordSet = "CurrencyRecordSet";
    String ExRate ="ExRate";
    String ExRateRecordSet ="ExRateRecordSet";
	String defAddress=null;


	//Tracker ID 113276 currency changes start
	String  boName2 = "PsychographicBO";
	PsychographicBO boPsco = null;

	//CIF Changes - Currency Details - Begin
	final StringBuilder CurrencyMandatoryColumns = new StringBuilder(PsychographicBO.MISCELLANEOUSINFO_STRTEXT10).append(",")
												   .append(PsychographicBO.MISCELLANEOUSINFO_DBFLOAT1).append(",").append(PsychographicBO.MISCELLANEOUSINFO_DBFLOAT2)
												   .append(",").append(PsychographicBO.MISCELLANEOUSINFO_DBFLOAT3).append(",")
												   .append(PsychographicBO.MISCELLANEOUSINFO_DBFLOAT4).append(",").append(PsychographicBO.MISCELLANEOUSINFO_DTDATE1);

	final String CurrencyRowIdentifier = PsychographicBO.MISCELLANEOUSINFO_MISCELLANEOUSID;
	final String CurrencyOptionalColumns = "";
	final StringBuilder CurrencyIdAttributeColumns = new StringBuilder(PsychographicBO.MISCELLANEOUSINFO_MISCELLANEOUSID).append(",").append(CurrencyMandatoryColumns.toString());
	final String CurrencyDefaultColumnOrder = CurrencyMandatoryColumns+","+CurrencyOptionalColumns;

	private static ArrayList arrphEmlTypeList= new ArrayList();
	static
	{
		arrphEmlTypeList.add("PHONE_TYPE");
		arrphEmlTypeList.add("EMAIL_TYPE");
	}
	
	//CIF Changes - Currency Details - End
	//Tracker ID 113276 currency changes end

		public String getModuleName() { return MODULE_NAME; };

		    protected void serviceRequest(HttpServletRequest req, HttpServletResponse resp)
    throws Exception  {
            //Moved declaration of variables (whose value gets populated dynamically inside the service method)
           String defAddress=null;
           	/* Change for ticket 367607 starts */
		   	String prefCode = "";
			/* Change for ticket 367607 ends */
			/* Recon of Change for call 391057 start */	
			String hidprefCode = "";	
/* Recon of Change for call 391057 end */	
           LocaleConfigInfo user_Locale = null;
           Hashtable hstTable1 = null;
/****************Minor Age From Config Editor Changes:Start**************/
		 String MINOR_YEAR=null;
		 //Senior Starts
	 	 String SENIOR_YEAR=null;
		 //Senior Ends
	/*ERPBOCF1:TRACKER:113259:BEGIN OF CHANGES(HIJRI:MINOR TO MAJOR CONVERSION)*/
  		 String strConvCalendarType=null;
		String strAltCalendarType=null;
				//Changes for tracker id: 333740 starts
				String Segmentation_Class=null;
				//Changes for tracker id: 333740 ends
				//Changes for tracker id: 333741 starts
				String Tds_tbl=null;
				//Changes for tracker id: 333741 ends
		//Tracker ID 228683 Basel changes begin
		String isBasel="N";
		String tabTitle ="";
		String fullList ="";
		//Changes for Tracker id: 361921 starts
		String constitution_code = "";
		//Changes for Tracker id: 361921 ends

		//Changes for Tracker id:355038starts
		String sector_code = "";
		String subsector_code = "";
		//changes for callID 734881 starts
	    String defAddress_Value ="";
	  //changes for callID 734881 ends
		//Changes for Tracker id:355038ends
		//Tracker ID 228683 Basel changes end
	/*ERPBOCF1:TRACKER:113259:END OF CHANGES(HIJRI:MINOR TO MAJOR CONVERSION)*/
		 String INTRO_DATE_VALIDATE=null;
		 //changes for call id 200023 Ticket: 408152 tracker: 248155 start
		 String countryOfInst=null;
		 //changes for call id 200023 Ticket: 408152 tracker: 248155 ends
//Tracker ID: 113066 Begin of changes Moved Init() method Initializing of variables to serviceRequest()  method
// Getting default address type from JNDI
		//10.6 Changes Starts
		String allowMulti=null;
		EditorUtil  EditorUtil1 = new EditorUtil();
		Properties keyProper = EditorUtil.getCIFGeneralInfo();
		allowMulti = keyProper.getProperty(EditorUtil.ALLOWMULTI).trim();
	 	//10.6 Changes Ends
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert server recon in 10.2.14 starts
		boolean bIsAlert = EditorUtil.getIsalertreq();
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert server recon in 10.2.14 ends
			Properties genProp = EditorUtil.getCIFGeneralInfo();
			//changes for call id 200023 Ticket: 408152 tracker: 248155 start
			Properties busRulesProp = EditorUtil.getBusinessRulesInfo();
			//changes for call id 200023 Ticket: 408152 tracker: 248155 ends
			try{
			//changes for call id 200023 Ticket: 408152 tracker: 248155 start
				countryOfInst = busRulesProp.getProperty(EditorUtil.COUNTRY_OF_INSTALLATION).trim();
			//changes for call id 200023 Ticket: 408152 tracker: 248155 ends
				defAddress = genProp.getProperty(EditorUtil.RETAIL_ADDRESS).trim();
				//changes for callID 734881 starts
				SRMBusinessContext bc = Utils.getBusinessContext(req,
	                    java.sql.Connection.TRANSACTION_READ_UNCOMMITTED);
			CISSessionContext sc = context.getSessionContext(req);
				SRMQueryResult qrCategory6 = null;
				SRMRecordSet rs6 = null;
				List attr6 = new ArrayList();
				attr6.add(CategoryBO.VALUE);
				attr6.add(CategoryBO.CATEGORY_LANG_CAT_VAL);
				SRMQueryBuilder qbCategory6 = QueryAssist.singleObjectQuery("CategoryBO", CategoryBO.CATEGORYID);
				QueryAssist.addSimpleCondition(qbCategory6, "CategoryBO",CategoryBO.CATEGORYTYPE, IQuery.ComparisonOperation_EQ,
						"ORG_ADDRESS_TYPE");
				QueryAssist.addSimpleCondition(qbCategory6, "CategoryBO",
						CategoryBO.VALUE, IQuery.ComparisonOperation_EQ,
						defAddress);
				QueryAssist.selectAttr(qbCategory6, "CategoryBO", attr6);
				qrCategory6 = qbCategory6.runQuery(bc, -1);
				if (qrCategory6 != null) {
				rs6 = qrCategory6.getRecordSet();

				}
				if (rs6 != null) {
					while (rs6.hasNext()) {
						ArrayList list5 = (ArrayList) rs6.getNext();
						defAddress_Value = (String) list5.get(1);
					}
				}
			} catch(Exception e){
				defAddress="Mailing";
			}


			try{
				//Properties keyProp = EditorUtil.getCIFGeneralInfo();
				MINOR_YEAR = genProp.getProperty(EditorUtil.MINOR_AGE).trim();
				//Senior Starts
				SENIOR_YEAR = genProp.getProperty(EditorUtil.SENIOR_AGE).trim();
				//Senior Ends
				INTRO_DATE_VALIDATE=genProp.getProperty(EditorUtil.NO_OF_INTRO_DAYS).trim();
			} catch(Exception e){
				MINOR_YEAR="18";
			}
		/* ERPBOCF1:Minor To Major Conversion changes starts*/
		try{
			//Properties calProp = EditorUtil.getCIFGeneralInfo();
				strConvCalendarType = genProp.getProperty(EditorUtil.CONV_CAL_TYPE).trim();

		} catch(Exception e){
					strConvCalendarType="Gregorian";
		}

		try{
			//Properties prefCalProp = EditorUtil.getCIFGeneralInfo();
			strAltCalendarType = genProp.getProperty(EditorUtil.ALT_CAL_TYPE).trim();

		} catch(Exception e){
								strAltCalendarType="false";
		}

		/* ERPBOCF1:Minor To Major Conversion changes ends*/


    /****************Minor Age From Config Editor Changes:End**************/
    /* Minor Age Changes: start */
	//String MINOR_YEAR ="18";
    /* Minor Age Changes: end */


            String  acctStr = req.getParameter("accountId");
            String apprFlag=req.getParameter("apprFlag");
             String mcJNDIFlag=req.getParameter("mcJNDIFlag");

             /*TRACKER ID 113276 CHANGES BEGIN FOR BUG FIXING*/
			 //For Defaulting the RelationshipCreatedBy lookup
			 //Declare a variable to hold the logged in user id
			 String rCreatedBy = "";
			/*TRACKER ID 113276 CHANGES END*/

			if(apprFlag==null || apprFlag.equals("")|| apprFlag.equals("null")){
				//Properties keyProp = EditorUtil.getCIFGeneralInfo();
				apprFlag = genProp.getProperty(EditorUtil.APPROVAL_MECHANISM).trim();
			}

			if(mcJNDIFlag==null || mcJNDIFlag.equals("")|| mcJNDIFlag.equals("null")){
				mcJNDIFlag = "false";
			}
			String IsMCCheckRequired="N";
			String isMCEdited=req.getParameter("isMCEdited");
			if(isMCEdited==null || isMCEdited.equals("")){
				isMCEdited="N";
			}

			if((apprFlag!= null) && apprFlag.equals("true") && mcJNDIFlag.equals("true")){
				IsMCCheckRequired="Y";
			}else if((apprFlag!= null) && apprFlag.equals("true") && mcJNDIFlag.equals("false")){
				isMCEdited="Y";
			}


	   /******* Save and Submit Changes Getting the operationType  from MaindetForm : Start******/
		    String operationType = req.getParameter("operationType");

       /******* Save and Submit Changes Getting the operationType  from MaindetForm : End******/
	   		/* Changes done by Kanika for Cif Deceased starts */
			String strCreFlag = req.getParameter("creFlag");
			/* Changes done by Kanika for Cif Deceased ends */
			Locale locale = null;
			/*CIF PhoneEmail Changes : Start */
			String preferredAddressType = "";
			String preferredPhone = "";
			String preferredEmail = "";
			String LastUpdate_Date=",";

			 //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
					String  strAcrossSearch = req.getParameter("acrossSearch");
				/*Begin of changes for tracker 131243 by sneha kaul  - BANKID - */
					String  strBank_id = req.getParameter("bank_id");
				/*End of changes for tracker 131243 by sneha kaul  - BANKID - */
            //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra

			/*CIF PhoneEmail Changes : End */
			String entityCreflg = "";
			SRMBusinessContext bc = Utils.getBusinessContext(req);
			CISSessionContext sc = context.getSessionContext(req);
			locale=sc.getSessionLocale();
			/* Tracker id 119188 changes start for bug fixing */
			PsychographicBO boPsco = new PsychographicBO();
			/* Tracker id 119188 changes end for bug fixing */
			//Tracker No 97042 start
			String strlocale = locale.toString();
			//Tracker No 97042 end
			hstTable1 = EditorUtil.getLocaleConfig();
			String currencyCode = "";
			if(hstTable1!=null) {
					user_Locale=(LocaleConfigInfo)hstTable1.get(locale.toString());
			}
			if(user_Locale!=null){
						currencyCode = user_Locale.getCurrency().toString();
						/*TRACKER ID 113276 CHANGES BEGIN FOR BUG FIXING*/
						//Getting the logged in user id to be defaulted in RelationshipCreatedBy lookup
						/*	BEGIN: CRM_ARCH	*/
						/*	return type of the getAgent() method changed to SRMBOBase, hence being typecasted */
						rCreatedBy 	= ((AgentBO)(AgentGroupMgr.getLoggedonUser(bc).getAgent())).getLoginID().toString();

						/*	END: CRM_ARCH	*/
						/*TRACKER ID 113276 CHANGES END*/
			}
			//Tracker ID 228683 Basel changes begin
			 tabTitle =  Constants.RET_CUST_TAB_TITLE;

			   fullList = CommonQueries.getAllTabList(tabTitle);
			   if(fullList.indexOf("Retail_Customer_BF")!= -1){
					   isBasel="Y";
			   }
			 //Tracker ID 228683 Basel changes end

			//SRMBusinessContext bc = Utils.getBusinessContext(req);
            SRMFormatter formatter = sc.getDefaultFormatter();


			/************CIF LOS Bypass change:Start*****************/
			String byPassFlag=req.getParameter("byPassFlag");
			/************CIF LOS Bypass change:End*****************/
			//Tracker:90196: Changes for attibute masking
					String AccessOwnerGroup = req.getParameter("AccessOwnerGroup");
					//Tracker:90196: End of changes for attribute masking

            setContentType("text/html", resp);
            PrintWriter out = resp.getWriter();
     		int accountID = 0;
            if ((acctStr==null)||(acctStr.equalsIgnoreCase(""))){
                 accountID = 0;
            }else{
            try{
                accountID=Integer.parseInt(acctStr);

                } catch(NumberFormatException e){
                    if(WebAdaptor.willLog(com.infy.cis.log.LogType.MINOR)) {
                        WebAdaptor.log(com.infy.cis.log.LogType.MINOR,
                        "Account_det : Invalid AccountID=" + acctStr );
                    }
                    throw new SRMBCException(
                                SRMBCException.INVALID_ACCOUNT,
                                null
                            );
                }
            }
			//Changes for CheckSum : Start
			if (accountID != 0) {
							//DBS Performance change for call id 270578 Ticket: 562427 tracker: 332373 start
									String checkSumValidation = "";
									Properties keyProp1 = EditorUtil.getCIFGeneralInfo();
									checkSumValidation = keyProp1.getProperty(EditorUtil.CHECKSUM_ENABLE).trim();
									if(checkSumValidation!= null && checkSumValidation.equalsIgnoreCase("true")){
							//checksum validation changes

			  boolean chkSumFlag = CheckSumUtilMain.isAccountRecordTampered(
			  								bc,accountID);
          		if (chkSumFlag)
          		{
			 	throw new FCRMGenericException("MSGEXC50039",
			  				new Exception("CheckSum Error"));
						}
				}
			}
				// Changes for CheckSum : End
            String  isReadOnly = req.getParameter("isReadOnly");
            String  isCopy = req.getParameter("isCopy");
			if(isCopy == null || isCopy == "")
			{
				isCopy = "N";
			}
           /*  FCRM61RECON:TRACKER:45342:BEGINOFCHANGES */
            /*
             * "    Avoid making multiple calls to context.getSessionContext (req).
             */

            /**Access Control Changes**/
			final Integer  agentID = sc.getAgentId();
			HashMap agentInfo=new HashMap(4);
			String priGrpID=null;
			String priSegName=null;
			String priBC=null;
			String priBCID=null;

        	/**End of Changes**/

		// Tracker ID 113276 changes start
		String  Type = "Account";
		//Tracker ID 113276 changes end

            Properties keyProp = KeyGenerationInfo.getAccountKeyInfo();

            /* NNTM Changes Start*/
            String isAutoGenCRM = keyProp.getProperty("isCRMGenerated").trim();
			String isAutoGenNNTM = keyProp.getProperty("isNNTMGenerated").trim();
			/* NNTM Changes End*/

			// CIF GroupHouseHold changes : start
			String strGlobalRM= "";
			// CIF GroupHouseHold changes : end

            XMLFormAssist Xmlassist=new XMLFormAssist(sc);
            // changes for tracker id :253845 Start
			/* Tracker ID:142437 */
			     XMLFormAssist XmlassistNC=new XMLFormAssist(sc);
         	// changes for tracker id :253845 End
// For Caching view, following 1 line added
			StringBuilder strbViewName = new StringBuilder(ViewNames.CIF_GEN_GENERAL).append(",").append(ViewNames.CIF_RET_GENERAL_MINOR);
			String viewName= strbViewName.toString();
			Views view = ConfigManager.getInstance().
            findView(ViewNames.CIF_GEN_GENERAL, bc);
			/* Tracker #: 90197 Begin of Changes for attibute masking */
							InitAccessControl.checkAttrAccess(req,view,bc);
		    /* Tracker #: 90197 End of Changes */
            //CIF PhoneEmail Changes : Start
			////System.out.println("before pop for CIF_GEN_GENERAL");
            Xmlassist.populateConfigChoices( view, bc, Xmlassist);
			//CIF PhoneEmail Changes : End
//			//System.out.println("after pop for CIF_GEN_GENERAL");

            Views viewCI = ConfigManager.getInstance().
                    findView(ViewNames.COREINTERFACEDETAILS, bc);

//			//System.out.println("before pop for COREINTERFACEDETAILS");
            Xmlassist.populateConfigChoices( viewCI, bc, Xmlassist);
//			//System.out.println("after pop for COREINTERFACEDETAILS");
// For Caching view, following 1 line commented
//            Xmlassist.populateConfigChoices( view, bc, Xmlassist);
            Views viewMinor = ConfigManager.getInstance().
            findView(ViewNames.CIF_RET_GENERAL_MINOR, bc);
// For Caching view, following 1 line commented
//        	Xmlassist.populateConfigChoices(viewMinor, bc, Xmlassist);

        	Views viewID = ConfigManager.getInstance().
			            		findView(ViewNames.LIST_OF_CUSTOMER_ADDRESS, bc);

			String rowIdentifier = viewID.getRowIdentifier();
			String idAttributeColumns = Utils.getIdAttributeColumns(viewID);
			String requiredColumns = Utils.getOrderedRequiredColumnList(viewID.getRequiredItems());
			if(rowIdentifier == null || rowIdentifier.equals("")) {
						rowIdentifier = "AccountBO.Address.AddressID";
			}
			// CRM GroupHouseHold changes Begin
			Views viewID2 = ConfigManager.getInstance().
			            		findView(ViewNames.LIST_OF_HOUSEHOLD, bc);
			String rowIdentifier1 = viewID2.getRowIdentifier();
			String idAttributeColumns1 = Utils.getIdAttributeColumns(viewID2);
			String requiredColumns1 = Utils.getOrderedRequiredColumnList(viewID2.getRequiredItems());
			if(rowIdentifier1 == null || rowIdentifier1.equals("")) {
						rowIdentifier1 = "AccountBO.GroupHouseHold.GroupHouseHoldCode";
			}
			// CRM GroupHouseHold changes End
			// CRM101UB company changes:Tracker:110963:Begin
			Views viewGrp = ConfigManager.getInstance().findView(ViewNames.CUSTLISTOFGROUP,bc);
		  	String companyRowIdentifier = viewGrp.getRowIdentifier();
			String companyIdAttributeColumns = Utils.getIdAttributeColumns(viewGrp);
			String companyRequiredColumns = Utils.getOrderedRequiredColumnList(viewGrp.getRequiredItems());
			if(companyRowIdentifier == null || companyRowIdentifier.equals("")) {
			 companyRowIdentifier = "AccountBO.GroupHouseHold.GroupHouseHoldCode";
			}
			// CRM101UB company changesTracker:110963:End
			/* CIF PhoneEmail Changes : Start */
			Views viewIDforPhoneEmail = ConfigManager.getInstance().
                      findView(ViewNames.LIST_OF_CUSTOMER_PHONEEMAIL, bc);

			  String phoneEmailRowIdentifier = viewIDforPhoneEmail.getRowIdentifier();
			  String phoneEmailIdAttributeColumns = Utils.getIdAttributeColumns(viewIDforPhoneEmail);
			  String phoneEmailRequiredColumns = Utils.getOrderedRequiredColumnList(viewIDforPhoneEmail.getRequiredItems());
			  if(phoneEmailRowIdentifier == null || phoneEmailRowIdentifier.equals("")) {
						  phoneEmailRowIdentifier = "AccountBO.PhoneEmail.PhoneEmailID";
			  }
			/* CIF PhoneEmail Changes : End */

		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES start
		Views viewEdoc = ConfigManager.getInstance().
		findView(ViewNames.ENTITY_DOCUMENT_LIST, bc);
		String strIDdetRowIdentifier = viewEdoc.getRowIdentifier();
		if(strIDdetRowIdentifier == null || strIDdetRowIdentifier.equals(""))
		{
			strIDdetRowIdentifier = "EntityDocumentBO.IdentificationType";
		}
		String strIDdetIdAttributeColumns = Utils.getIdAttributeColumns(viewEdoc);
		String strIDdetDefaultColumnOrder = Utils.getOrderedRequiredColumnList(viewEdoc.getRequiredItems());
		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES end


            String xslFile = view.getXslFileName();
            /*
             * xslFileName has the Name of the XSL file from view
             */
            String xslFileName = Utils.getXslFileName(xslFile);

            /*
             * xslFilePath has the path of the XSL file from view
             */
            String xslFilePath = Utils.getXslFilePath(xslFile);

			/* *** Tracker# 49738, Begin of Changes *** */
			String  relMgr = null;
			String  accMgr = null;
			String  relCreat = null;
			/* *** Tracker# 49738, End of Changes *** */

			/*Added by Ramsurendar*/
			String  secMgr = null;
			String  terMgr = null;
			/*Added by Ramsurendar*/

			/*doc recieved changes-begin*/
			String  docRecvd = "N";
			/*doc recieved changes-end*/

			//Changes for tracker id 350214 Starts Here
			String Mgr=null;
			String Charge=null;
			//Changes for tracker id 350214 Ends Here
			/* ***** Tracker# 97236 CIF - Ebanking changes : Start ***** */
			String isSMSBanking="N";
			String isWAPBanking="N";
			/* ***** Tracker# 97236 CIF - Ebanking changes : End ***** */
			//CORE Fields Inclusion: start
			String purgeFlag = "N";
			String tfpartyFlag = "N";
			//CORE Fields Inclusion: end

			//Change for card_holder :Start
			String card_holder="N";
            //Change for card_holder :End

            String IntroPrefLocale ="";
            //Parent Account

            //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
			/*
			 *Tracker 131243 Begin of changes sumeet _gandhok-cross entity search
			 *commented this code as it will be handeled in base servlet
			 */
				/*if(strBank_id!=null && !(strBank_id.equalsIgnoreCase("null"))){
				  bc.setBank_id(strBank_id);
				}*/
			/*Tracker 131243 End of changes sumeet _gandhok*/

			 //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
            ArrayList attr = new ArrayList();
            attr.add(AccountBO.ACCOUNTNAME);
            attr.add(AccountBO.ACCOUNTID);
            ArrayList excludeAccountIDs = new ArrayList();
            excludeAccountIDs.add((new Integer(accountID)).toString());

            String concurDetex = "-1";
			String strDate =null;
			//changes for callid 613314 starts
			String boDateCreated = null;
			//changes for callid 613314 ends
   			SRMQueryResult qrAccounts=null;
            //NRE Changes shanmuga in edit mode
			String PassportId="";
			String PassportPlace="";
			String PassportIdate="";
			String PassportVdate="";
			//NRE Changes shanmuga in edit mode
			// changes for tracker id :253845 Start
			            /*   Tracker ID:142437   */
			            String solId = "";// Changes for Tracker id: 347074
			                          String convToCust = req.getParameter("convToCust");
						String convType  = req.getParameter("convType");
						String entityUrl = req.getParameter("entityURL");
						String entityID = req.getParameter("entityId");
						if(convToCust == null){
							convToCust = "";
						}

						if(convType == null){
							convType = "";
						}
				//Changes for 413958 and recon of call id 411963 starts
				//Changes for call id:425507 and recon of call id 413599 starts
				if(convToCust.equals("Y") &&  convType.equalsIgnoreCase("Prospect")){
					 acctStr = req.getParameter("entityId");
					viewID2 = ConfigManager.getInstance().
										findView(ViewNames.RET_PROSHOUSEHOLD, bc);
					viewGrp = ConfigManager.getInstance().findView(ViewNames.SUSLISTOFGROUP,bc);
		              }
					  //Changes for call id:425507 and recon of call id 413599 ends
				//Changes for 413958 and recon of call id 411963 ends
						if(entityUrl == null){
							entityUrl = "";
						}
						if(entityID == null){
							entityID = "";
						}
						String primaryIntroExists = "N";
						SuspectBO suspectBO = null;
						ContactBO contactBO = null;
						NonCustomerBO nonCustBO = null;
            /*   Tracker ID:142437   */
	        String priBCName="";
			String priBCTypeID="";
	        boolean isBranch = false;
	        String catBCName = "";
			String drpYear = null;
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 starts
			String DefaultChannel_Alert="";
			String Enable_Alerts="";
			String PreferredMobileAlert_Type="";
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 ends
			String drpMonth = null;
			String drpDay = null;
			String strCountryValue = "";
            // changes for tracker id :253845 END
	        ArrayList cData = new ArrayList();
	        String minorAgeWithoutGuardianLimit =Utils.getMinorAgeWithoutGuardianLimit();
			cData.add (new NameValue("MINOR_AGE_FOR_GUARDIAN_NON_MANDATORY",minorAgeWithoutGuardianLimit));
			//Key Generation Changes Start - Tracker -178908
			cData = CommonQueries.getUserKeyAccess(cData,bc,agentID);
			//Key Generation Changes End -Tracker -178908
			/**
                This code will fetch complete AccountBO.
            */
//Changes for 413958 and recon of call id 411963 starts
//Changes for call id:425507 and recon of call id 413599 starts
           // if(accountID > 0){

		    if(accountID > 0 || (new Integer(entityID) > 0 && convToCust.equals("Y") && convType.equalsIgnoreCase("Prospect"))){
//Changes for call id:425507 and recon of call id 413599 ends
//Changes for 413958 and recon of call id 411963 ends
			// NRE Changes shanmuga in edit mode - Getting the Passport Details from Demographic Tab
/*commented for IDENTIFICATION DOCUMENT CHANGES start
			CommonMethodsForPsycoDemo CommonMethods = new CommonMethodsForPsycoDemo();
			DemographicBO DemoBO = (DemographicBO)CommonMethods.getExistingDemographicObject(bc,
								  accountID, DemographicBO.ACCOUNTID);
		   PsychographicBO boPsco = (PsychographicBO)CommonMethods.getExistingPsychographicObject(bc,
								  accountID, PsychographicBO.ACCOUNTID);
		   IntroPrefLocale=boPsco.getPreferredLocale();

			if (DemoBO!=null){
				 SRMCollection miscInfo = DemoBO.getMiscellaneousInfo();
				 for (int i = 0; i < miscInfo.size(); ++i){
					 String type = (((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getType());
					 if ( type.equalsIgnoreCase ("Passport Number")){
						 PassportId=(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getStrText1());
						 PassportPlace=(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getStrText2());
							 if(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getDtDate1() != null)
							 {
								PassportIdate=(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getDtDate1().toString());
							}
							 if(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getDtDate2() != null)
							 {
								PassportVdate=(((DemographicBO.MiscellaneousInfo)miscInfo.get(i)).getDtDate2().toString());
						}
					 }
				 }
		 	 }
commented for IDENTIFICATION DOCUMENT CHANGES end*/
			 // NRE Changes shanmuga in edit mode


//IDENTIFICATION DOCUMENT CHANGES start
//Getting Passport Details if any
	/* Commented by SPE - Code moved to EDocRecordSet fetch query, and parsing through the queryresult to avoid DB hit */
			//SRMQueryResult qrEDoc = null;
			/* ArrayList IDAttrList = new ArrayList();

			IDAttrList.add(QueryAssist.getTransformFn("EntityDocumentBO",EntityDocumentBO.REFERENCENUMBER));
			IDAttrList.add(QueryAssist.getTransformFn("EntityDocumentBO",EntityDocumentBO.PLACEOFISSUE));
			IDAttrList.add(QueryAssist.getTransformFn("EntityDocumentBO",EntityDocumentBO.DOCISSUEDATE));
			IDAttrList.add(QueryAssist.getTransformFn("EntityDocumentBO",EntityDocumentBO.DOCEXPIRYDATE));

			SRMQueryBuilder qbEDoc = new SRMQueryBuilder () ;
			QueryAssist.addJoin(qbEDoc, "EntityDocumentBO", EntityDocumentBO.ENTITYDOCUMENTID, "EntityDocumentBO", EntityDocumentBO.ENTITYDOCUMENTID, IQuery.JoinType_Equi);
			QueryAssist.addSimpleCondition(qbEDoc, "EntityDocumentBO", EntityDocumentBO.ENTITYID, IQuery.ComparisonOperation_EQ, accountID + "");
			QueryAssist.addSimpleCondition(qbEDoc, "EntityDocumentBO", EntityDocumentBO.ENTITYTYPE, IQuery.ComparisonOperation_EQ, "CIFRetCust");
			QueryAssist.addSimpleCondition(qbEDoc, "EntityDocumentBO", EntityDocumentBO.IDENTIFICATIONTYPE, IQuery.ComparisonOperation_EQ, "Passport Number");
			QueryAssist.addSimpleCondition(qbEDoc, "EntityDocumentBO", EntityDocumentBO.STATUS,
					  IQuery.ComparisonOperation_ISNOTNULL, "");

			int noOfAttrs = IDAttrList.size();
			for (int i=0; i<noOfAttrs; i++)
			{
				qbEDoc.addAttribScope((TransFormFn) IDAttrList.get(i));
			}
			qrEDoc=qbEDoc.runQuery(bc,-1);
			rsEDoc=qrEDoc.getRecordSet();
			if(rsEDoc.hasNext())
			{
				lstEdoc=(List)rsEDoc.getNext();
			}
			if(lstEdoc!=null)
			{
				if(lstEdoc.get(0)!=null){
					PassportId=lstEdoc.get(0).toString();
				}
				if(lstEdoc.get(1)!=null){
					PassportPlace=lstEdoc.get(1).toString();
				}
				if(lstEdoc.get(2)!=null){
					PassportIdate=lstEdoc.get(2).toString();
				}
				if(lstEdoc.get(3)!=null){
					PassportVdate=lstEdoc.get(3).toString();
				}
			} */

//IDENTIFICATION DOCUMENT CHANGES end

			/*begin of SM plugin changes*/
			//Recon changes for callid 448233 starts
			if (convToCust.equals("N")){
			bc = InitAccessControl.setDriverEntity(bc,view,isReadOnly);
			}
			//Recon changes for callid 448233 ends
			/*end of SM plugin changes*/


			//DBS Enhancement 10215 changes start .TrackerID 402520
				 EnquiryBOHooks enquiryBOHook = new EnquiryBOHooks();
				Integer agentID_audit= sc.getAgentId();
				 enquiryBOHook.enquiryAuditTrail(bc,accountID,view,agentID_audit);
			//DBS Enhancement 10215 changes end .TrackerID 402520


             SRMQueryBuilder qbAccounts =
                                   QueryAssist.singleObjectQuery("AccountBO",
                                                                 AccountBO.ACCOUNTID,QB_ACCOUNTID
                                                                 );
                                                                 //System.out.println("-------------------------\n\n"+QB_ACCOUNTID);
             QueryAssist.addSimpleCondition(qbAccounts,
                                            "AccountBO",
                                             AccountBO.ACCOUNTID,
                                             IQuery.ComparisonOperation_EQ,
                                             ""+accountID
                                             );
                                             //System.out.println("query is "+qbAccounts.getSQLStringQuery(1,true,bc));
            qrAccounts = qbAccounts.runQuery(bc, true, -1);
            SRMRecordSet rsAccount = qrAccounts.getRecordSet();
            if(rsAccount.hasNext()) {
                AccountBO tempAcc = (AccountBO)rsAccount.getNext().get(0);
            	/**********************************Changes made for FATCA******************************************************/
                String catCountryCode="";
                if(tempAcc.getForeignAccTaxReportingReq()!=null&&(tempAcc.getForeignAccTaxReportingReq().equalsIgnoreCase("Y"))){
    			 catCountryCode = tempAcc.getForeignTaxReportingCountry();

    			SRMQueryResult qrCategory5 = null;
    			SRMRecordSet rs5 = null;

    			List attr5 = new ArrayList();
    			attr5.add(CategoryBO.VALUE);
    			attr5.add(CategoryBO.CATEGORY_LANG_CAT_VAL);
    			SRMQueryBuilder qbCategory5 = QueryAssist.singleObjectQuery(
    					"CategoryBO", CategoryBO.CATEGORYID);
    			QueryAssist.addSimpleCondition(qbCategory5, "CategoryBO",
    					CategoryBO.CATEGORYTYPE, IQuery.ComparisonOperation_EQ,
    					"FATCA_COUNTRY");
    			QueryAssist.addSimpleCondition(qbCategory5, "CategoryBO",
    					CategoryBO.VALUE, IQuery.ComparisonOperation_EQ,
    					catCountryCode);
    			QueryAssist.selectAttr(qbCategory5, "CategoryBO", attr5);
    			qbCategory5.setDistinct(true);
    			qrCategory5 = qbCategory5.runQuery(bc, -1);
    			if (qrCategory5 != null) {
    				rs5 = qrCategory5.getRecordSet();

    			}
    			if (rs5 != null) {
    				while (rs5.hasNext()) {
    					ArrayList list5 = (ArrayList) rs5.getNext();

    					strCountryValue = (String) list5.get(1);

    				}
    			}
                }
    			/***********************************Changes made for FATCA ENDS*****************************************************/
                if( null != tempAcc.getConcurIndex() ) {
                    concurDetex = tempAcc.getConcurIndex().toString();
                }
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 starts
				     if( null != tempAcc.getDefaultChannel_Alert() ) {
								              DefaultChannel_Alert = tempAcc.getDefaultChannel_Alert().toString();
				                }
				                if( null != tempAcc.getEnable_Alerts() ) {
												                    Enable_Alerts = tempAcc.getEnable_Alerts().toString();
                }
                 if( null != tempAcc.getEntity_cre_flag() ) {
				                                   entityCreflg =tempAcc.getEntity_cre_flag();
				                                   }
                if( null != tempAcc.getPreferred_Mobile_Alert_Type() ) {
													PreferredMobileAlert_Type = tempAcc.getPreferred_Mobile_Alert_Type().toString();
					                }

				//System.out.println("\n\n getDefaultChannel_Alert "+DefaultChannel_Alert);
				//System.out.println("\n\n PreferredMobileAlert_Type "+PreferredMobileAlert_Type);

	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 ends
                /*doc recieved changes-begin*/
                if( null != tempAcc.getDocument_Received() ) {
					docRecvd = tempAcc.getDocument_Received();
                }
			   /*doc recieved changes-end*/
				/* Change for ticket 367607 starts */
				if( null != tempAcc.getPref_code_rcode()) {
					prefCode = tempAcc.getPref_code_rcode();
				}
                /* Change for ticket 367607 ends */
				/* Recon of Change for call 391057 start */	
                if( null != tempAcc.getPref_code()) {

				hidprefCode =getCategoryValue(tempAcc.getPref_code(),"PREF_CODE",bc);
				}  
/* Recon of Change for call 391057 end */	
			   /* ***** Tracker# 97236 CIF - Ebanking changes : Start ***** */
				if( null != tempAcc.getIsSMSBankingEnabled() ) {
					isSMSBanking = tempAcc.getIsSMSBankingEnabled();
                }
				if( null != tempAcc.getIsWAPBankingEnabled() ) {
					isWAPBanking = tempAcc.getIsWAPBankingEnabled();
                }

			   /* SPE changes */

			   	SRMFormatter srmf = sc.getFormatter();
				try
				{
					java.util.Date dob = null;
					if( null != tempAcc.getCust_DOB() ) {
						dob = tempAcc.getCust_DOB();
					}
					// changes for tracker id :253845 Start
					/* ***** Tracker ID:142437  ***** */
									if (convToCust.equals("Y")){
										if(suspectBO!=null){
											dob = suspectBO.getSuspects_DOB();
										}else if(contactBO!=null){
											dob = contactBO.getDOB();
										}else if(nonCustBO!=null){
											dob = nonCustBO.getDOB();
										}
									}
                /* *****  Tracker ID:142437  ***** */
					String dobStr = srmf.dateToString(dob);
					drpYear = dobStr.substring(dobStr.lastIndexOf("/")+1);
					if(convType.equalsIgnoreCase("NonCustomer"))
										{
											drpMonth = dobStr.substring(dobStr.indexOf("/")+1,dobStr.lastIndexOf("/"));
											drpDay = dobStr.substring(0,dobStr.indexOf("/"));
										}
// changes for tracker id :253845 End
				}
				catch(Exception e)
				{
					throw e;
				}

			 /* SPE Changes End */
/*************************SIT fix******************Start**************************/
					String currId = "";
					String currText10 = "";
					String currFlt1 = "";
					String currFlt2 = "";
					String currFlt3 = "";
					String currFlt4 = "";
					String currDate = "";
/*************************SIT fix******************End**************************/


			   /* ***** Tracker# 97236 CIF - Ebanking changes : End ***** */

				//Tracker ID 113276 currency changes start
				/* CIF Changes - Currency Details :start*/
				if (boPsco != null) {
					ArrayList CurrencyAttr = new ArrayList();
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_MISCELLANEOUSID);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_STRTEXT10);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT1);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT2);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT3);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT4);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DTDATE1);


					String ttParentType = "CURRENCY";
					String CompID = "PsychographicBO.ACCOUNTID";


					if(Type.equals("Account")) {
						CompID = PsychographicBO.ACCOUNTID;
					}
					else if(Type.equals("Contact")){
						CompID = PsychographicBO.CONTACTID;
					}
					else if(Type.equals("Prospect")){
						CompID = PsychographicBO.SUSPECTID;

					}


					SRMQueryResult qr_CurrencyDet = CommonQueries.getCurrencyDetInfo(bc,
							accountID,
							CurrencyAttr,
							ttParentType,
							CompID
					);
					SRMRecordSet rs_CurrencyDet = qr_CurrencyDet.getRecordSet();
/*************************SIT fix******************start**************************/
					//Changes for TOL# 258707 starts
					while(rs_CurrencyDet.hasNext()){
							List arrReult      = rs_CurrencyDet.getNext();
							if(null != arrReult){

							if(null != arrReult.get(0)){
								if(currId !=null && currId.length()!=0) {
									//concatinating all the currencies for the existing customer
									currId      = currId + ',' + arrReult.get(0).toString();
								}
								else{
									currId      = arrReult.get(0).toString();
								}
						}
							if(null != arrReult.get(1)){
								if(currText10 !=null && currText10.length()!=0) {
									//concatinating all the currencies for the existing customer
									currText10    = currText10 + ',' +arrReult.get(1).toString();
								}else{
									currText10    = arrReult.get(1).toString();
								}
						}

			   				if(null != arrReult.get(2)){
								if(currFlt1 !=null && currFlt1.length()!=0) {
									//concatinating all the currencies for the existing customer
									currFlt1       = currFlt1+','+arrReult.get(2).toString();
								}else{
									currFlt1       = arrReult.get(2).toString();
								}
						}
						   if(null != arrReult.get(3) ){
							    if(currFlt2 !=null && currFlt2.length()!=0) {
									//concatinating all the currencies for the existing customer
									currFlt2       = currFlt2+','+arrReult.get(3).toString();
							    }else{
									currFlt2       = arrReult.get(3).toString();
								}
						}
							if(null != arrReult.get(4)  ){
								if(currFlt3 !=null && currFlt3.length()!=0) {
									//concatinating all the currencies for the existing customer
									currFlt3        = currFlt3+','+arrReult.get(4).toString();
								}else{
									currFlt3        = arrReult.get(4).toString();
								}
						}
							if(null != arrReult.get(5) ){
								if(currFlt4 !=null && currFlt4.length()!=0) {
									//concatinating all the currencies for the existing customer
									currFlt4 = currFlt4+','+arrReult.get(5).toString();
								}else{
									currFlt4 = arrReult.get(5).toString();
								}
						}
						    if(null != arrReult.get(6) ){
								//concatinating all the currencies for the existing customer
								String strCurrencyDate = arrReult.get(6).toString();
								strCurrencyDate = fnDateConver(strCurrencyDate);
							    if(currDate !=null && currDate.length()!=0) {
									currDate  = currDate+','+strCurrencyDate;
							    }else{
									currDate  = strCurrencyDate;
								}
						}
					}
					}
					rs_CurrencyDet.resetIndex();
					Xmlassist.setFormData(qr_CurrencyDet, null, true, "CurrencyDetInfo","CurrencyDetRecordSet");
				}
				/* Change for 374326 and 374328 start */
				String strCatLocale = null;
				String strLocaleCode = getPreferredLocaleValue(accountID,bc);
				strCatLocale = CifDetUtils.getLocaleTextValue(bc,strlocale,strLocaleCode);
				if(strLocaleCode == null)
				{
					strLocaleCode = "";
					strCatLocale = "";
				}
				/* Change for 374326 and 374328 end */


/*************************SIT fix***************start*****************************/
			//ashish: added condition in if, as part of sanity fix
				/*Code is moved from here and a new function with name fnDateConver
				is created at the end of thsi file.*/

				//Changes for TOL# 258707 ends

				cData.add(new NameValue("strCountryValue", strCountryValue));
					cData.add(new NameValue("currId", currId));
					cData.add(new NameValue("currText10", currText10));
					cData.add(new NameValue("currFlt1", currFlt1));
					cData.add(new NameValue("currFlt2", currFlt2));
					cData.add(new NameValue("currFlt3", currFlt3));
					cData.add(new NameValue("currFlt4", currFlt4));
					cData.add(new NameValue("currDate", currDate));
					 cData.add(new NameValue("isBasel", isBasel));
					/* Change for 374326 and 374328 start */
					cData.add(new NameValue("PreferredLocale",strLocaleCode));
					cData.add(new NameValue("Cat_PreferredLocale",strCatLocale));
					cData.add (new NameValue("allowMulti",allowMulti));
					/* Change for 374326 and 374328 end */
/*************************SIT fix**************end******************************/
				/* CIF Changes - Currency Details :end*/


				//Tracker ID 113276 currency changes end

					//changes for callid 613314 starts
					if (null != tempAcc.getBODateCreated() ) {
						SRMFormatter srfm =SRMFormatter.getObjectInstance(Locale.getDefault());
						srfm = sc.getFormatter();
						boDateCreated = (String)srfm.dateTimeToString((Date)tempAcc.getBODateCreated());
					}
					//changes for callid 613314 ends


				if (null != tempAcc.getLastSubmittedDate() ) {
					//Call id 346606 and 348767  change start
					//SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					SRMFormatter srfm =SRMFormatter.getObjectInstance(Locale.getDefault());
					//strDate = (String)dateFormat.format((Date)tempAcc.getLastSubmittedDate());
					srfm = sc.getFormatter();
					strDate = (String)srfm.dateTimeToString((Date)tempAcc.getLastSubmittedDate());
					//Call id 346606 and 348767 change end
				}
				if (null !=tempAcc.getDefaultAddressType() ) {
						preferredAddressType = tempAcc.getDefaultAddressType();
				}
				/* CIF PhoneEmail Changes : Start */
				if(tempAcc != null)
				{
					SRMCollection addressDetails = tempAcc.getAddress();
					AccountBO.Address addressValues = null;
//					String preferredAddress = "";
					int iaddr =addressDetails.size();
					for (int i = 0; i < iaddr ; i++){
				       addressValues = (AccountBO.Address)addressDetails.get(i);
/*
						preferredAddress = addressValues.getPreferredAddress();
						if(preferredAddress.equalsIgnoreCase("Y"))
						{
							preferredAddressType = addressValues.getAddressCategory();
							//break;
						}
*/
						LastUpdate_Date=LastUpdate_Date+','+addressValues.getLastUpdate_Date();
			        }

					SRMCollection phEmailDetails = tempAcc.getPhoneEmail();
					AccountBO.PhoneEmail phEmailValues = null;
					String tempPreferredPhone = "";
					String tempPreferredEmail = "";
					int iphe=phEmailDetails.size();
					for (int i = 0; i <iphe ; i++){
				       phEmailValues = (AccountBO.PhoneEmail)phEmailDetails.get(i);
						tempPreferredPhone = phEmailValues.getPreferredFlag();
						tempPreferredEmail = phEmailValues.getPreferredFlag();
				// Begin changes : Tracker id 148302
						if(tempPreferredPhone != null && tempPreferredPhone.equalsIgnoreCase("Y") && phEmailValues.getPhoneOrEmail().equalsIgnoreCase("PHONE"))
						{
							preferredPhone = phEmailValues.getPhoneEmailType();
						}
						if(tempPreferredEmail != null && tempPreferredEmail.equalsIgnoreCase("Y") && phEmailValues.getPhoneOrEmail().equalsIgnoreCase("EMAIL"))
						{
							preferredEmail = phEmailValues.getPhoneEmailType();
						}
				// End changes : Tracker id 148302
			        }
				}
				/* CIF PhoneEmail Changes : End */
			   //CORE Fields Inclusion : start
				if( null != tempAcc.getPurgeFlag() ) {
					purgeFlag = tempAcc.getPurgeFlag();
				}
				if( null != tempAcc.getTFPartyFlag() ) {
					tfpartyFlag = tempAcc.getTFPartyFlag();
				}
				//CORE Fields Inclusion : end


				//CRM10.2 SPE
				//Tracker ID 113276 Changes for Currency: start
				/*SRMQueryResult qResultCur = CurrencyAndRateCache.findCurrency(bc);
				SRMRecordSet recordSetCur = qResultCur.getRecordSet();
				recordSetCur.resetIndex();
				Xmlassist.setFormData(qResultCur,null,false,Currency,CurrencyRecordSet);
				// for getting all exchange rates.
				SRMQueryResult qResultRate = CurrencyAndRateCache.findExchangeRate(bc);*/
				List attr2 = new ArrayList();

				attr2.add(ExchangeRateBO.EXCHANGERATE);

						/* Changes for tracker id 178353 start */
						/*SRMQueryBuilder qbRate = new SRMQueryBuilder(); // QueryAssist.singleObjectQuery("ExchangeRateBO",ExchangeRateBO.RATEID);
				 QueryAssist.addJoin(qbRate, "ExchangeRateBO", ExchangeRateBO.RATEID, "ExchangeRateBO", ExchangeRateBO.RATEID, IQuery.JoinType_Equi);
				 QueryAssist.selectAttr(qbRate,"ExchangeRateBO", attr2);
                 SRMQueryResult qrRate = qbRate.runQuery(bc, -1);
				SRMRecordSet recordSetRate = qrRate.getRecordSet();
				recordSetRate.resetIndex();
					    Xmlassist.setFormData(qrRate,null,false,ExRate,ExRateRecordSet);*/
						/* Changes for tracker id 178353 end */
				//Tracker ID 113276 Changes for Currency: end



				//Chnage for card_Holder start
				if( null != tempAcc.getCard_holder() ) {
					card_holder = tempAcc.getCard_holder();
				}
				//Chnage for card_Holder End

				/**Access Control Changes**/
				if( null != tempAcc.getAccessOwnerGroup() ) {
						priGrpID = tempAcc.getAccessOwnerGroup().toString();
				}
				if( null != tempAcc.getAccessOwnerSegment() ) {
						priSegName = tempAcc.getAccessOwnerSegment();
				}
				if( null != tempAcc.getAccessOwnerBC() ) {
					priBCID = tempAcc.getAccessOwnerBC().toString();
					StringBuilder strbPriBCID = new StringBuilder(priBCID).append("~pBCID");
					String spriBCID = strbPriBCID.toString();

					SRMQueryResult queryRes = null;

					SRMRecordSet srmRecSet = null;
					//CRM10.2 146762  to get it from session contect
					priBC = (String)sc.getItem(spriBCID);

					if(priBC == null || priBC == "")
					{

						SRMQueryBuilder querybuilder =QueryAssist.singleObjectQuery("BizCenterBO", BizCenterBO.BCCODE);
						ArrayList attrList=new ArrayList();
						attrList.add(QueryAssist.getTransformFn("BizCenterBO",BizCenterBO.BCCODE));
						QueryAssist.addSimpleCondition(querybuilder, "BizCenterBO", BizCenterBO.BCID,
						IQuery.ComparisonOperation_EQ, priBCID);
						querybuilder.addAttribScope((TransFormFn) attrList.get(0));

						queryRes = querybuilder.runQuery(bc, false, -1);

						srmRecSet = queryRes.getRecordSet();
						List ls=null;
						priBC ="";
						if(srmRecSet.hasNext())
						{
							 ls=srmRecSet.getNext();
						}
						 priBC=ls.get(0).toString();

						sc.putItem(spriBCID,priBC);
					}



				}

				/**End of Changes**/

				//Tracker 98279 Changes by Ramsurendar S. BEGIN
				boolean tabValFlag 	= false;
				String TabValidator = tempAcc.getTabValidator();
				if(TabValidator == null || TabValidator.indexOf("Retail_Customer_GE=Y") == -1){
					tabValFlag = true;
				}

				if(tempAcc.getIsDummy()!= null && tempAcc.getIsDummy().equalsIgnoreCase("Y") && tabValFlag){
					agentInfo=CommonQueries.getLoggedinAgentInfo(agentID,bc);
					priGrpID=agentInfo.get("GroupID").toString();
					priSegName=agentInfo.get("Segment").toString();
					priBC=agentInfo.get("BCCode").toString();
					priBCID=agentInfo.get("BCID").toString();
				}
				//Tracker 98279  Changes by Ramsurendar S. END

				/* *** Tracker# 49738, Begin of Changes *** */
				if( null != tempAcc.getManager() ) {
					accMgr = tempAcc.getManager();
				}
				relMgr = Utils.getAgentName (bc, tempAcc.getRelationshipMgrID());

				/* changes for ticket 378446 starts */
//changes for callid 700288 
				if(!(isCopy!=null && isCopy.equalsIgnoreCase("Y")))
				relCreat = Utils.getLoginIDfromAgentID(bc, tempAcc.getRelationshipCreatedByID());
									

				/* changes for ticket 378446 ends */


				/* *** Tracker# 49738, End of Changes *** */
				/*Added by Ramsurendar Begin*/
				if( null != tempAcc.getSecondaryRM_ID() ) {
					secMgr = tempAcc.getSecondaryRM_ID();
				}

				if( null != tempAcc.getTertiaryRM_ID() ) {
					terMgr = tempAcc.getTertiaryRM_ID();
				}
				/*Added by Ramsurendar End*/


            }
            rsAccount.resetIndex();
            Xmlassist.setFormData(qrAccounts);

            ArrayList paramList = new ArrayList();
			paramList.add(acctStr);

			SRMQueryResult qrStep = Utils.getQueryResultFromView(bc,formatter,viewID, paramList);
	//Changes for call id 613390 begin
			if (convToCust!=null && !convToCust.equals("Y")){
			Xmlassist.setFormData(qrStep,null,true,"Address","RecordSet");
		}
	//Changes for call id 613390 ends
			//Changes for call id 452772 with reference to 408827 starts Here
			/* CIF PhoneEmail Changes : Start */
	/*		SRMQueryResult qrCorporatePhEmail = null;
			ArrayList phEmailAttrList = new ArrayList();

			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONEEMAILID));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_EMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONENO));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONEOREMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONEEMAILTYPE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONENOCOUNTRYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONENOCITYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_PHONENOLOCALCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"AccountBO",AccountBO.PHONEEMAIL_WORKEXTENSION));

			SRMQueryBuilder qbCorporatePhEmail = new SRMQueryBuilder () ;
			QueryAssist.addJoin(qbCorporatePhEmail, "AccountBO", AccountBO.ACCOUNTID, "AccountBO", AccountBO.ACCOUNTID, IQuery.JoinType_Equi);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "AccountBO", AccountBO.ACCOUNTID, IQuery.ComparisonOperation_EQ, ""+acctStr);

			int phEmailNoOfAttrs = phEmailAttrList.size();
			for (int i=0; i<phEmailNoOfAttrs; i++) {
					 qbCorporatePhEmail.addAttribScope((TransFormFn) phEmailAttrList.get(i));
			}
			qrCorporatePhEmail = qbCorporatePhEmail.runQuery(bc,-1);

			SRMRecordSet phEmailRecordSet = qrCorporatePhEmail.getRecordSet();
			if(phEmailRecordSet.hasNext()){
				if(phEmailRecordSet.getNext().get(0)!=null){
					phEmailRecordSet.resetIndex();
					 Xmlassist.setFormData(qrCorporatePhEmail,null,true,"Phone","PhoneEmailRecordSet");
				}
			}
			/* CIF PhoneEmail Changes : End */

	//Changes for call id 613390 begin
if (convToCust!=null && !convToCust.equals("Y")){
SRMQueryResult qrStepPhEmail = Utils.getQueryResultFromView(bc,formatter,viewIDforPhoneEmail, paramList);
				SRMRecordSet rsPhoneEmail = qrStepPhEmail.getRecordSet();

				if(rsPhoneEmail.hasNext()){
					String temp = (String)rsPhoneEmail.getNext().get(2);
					if((temp !=null)&&(temp !="")){
					rsPhoneEmail.resetIndex();
					Xmlassist.setFormData(qrStepPhEmail,null,true,"Phone","PhoneEmailRecordSet");
					}
					}
		}
	//Changes for call id 613390 ends
			/* CIF PhoneEmail Changes : End */

			//Tracker ID 113276 CIFIdentificationDocument changes begin - IDENTIFICATION DOCUMENT CHANGES
			SRMQueryResult qrEDoc = null;
			if(Type.equals("Account"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + accountID, "CIFRetCust", bc);
				/*  SPE Changes - Vijay */
				SRMRecordSet psportRs =  qrEDoc.getRecordSet();

				while(psportRs.hasNext()){
					ArrayList arrPsprt = (ArrayList)psportRs.getNext();
					String idType      = (String)arrPsprt.get(2);
					if(idType!= null && idType.equals("Passport Number")){
						if(arrPsprt.get(3)!=null){
							PassportId=arrPsprt.get(3).toString();
						}
						if(arrPsprt.get(7)!=null){
							PassportPlace=arrPsprt.get(7).toString();
						}
						if(arrPsprt.get(8)!=null){
							PassportIdate=arrPsprt.get(8).toString();
						}
						if(arrPsprt.get(9)!=null){
							PassportVdate=arrPsprt.get(9).toString();
						}
						break;
					}
				}
				psportRs.resetIndex();
				/*  SPE Changes - Vijay */
			}
			else if(Type.equals("Contact"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + accountID, "CIFRetCont", bc);
			}
			else if(Type.equals("Prospect"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + accountID, "CIFRetPros", bc);
			}

			Xmlassist.setFormData(qrEDoc, null, true, "EntityDocument" ,"EDocRecordSet");
			//Tracker ID 113276 CIFIdentificationDocument changes end - IDENTIFICATION DOCUMENT CHANGES




// CIF HouseHold Changes Start
// CRM101UB changes:Tracker:110963:Start
			ArrayList param = new ArrayList();
			param = paramList;
			param.add("H");
// CRM101UB changes:Tracker:110963:Start
//			//System.out.println("before pop for HouseHoldRecordSet");
			SRMQueryResult qrStep1 = Utils.getQueryResultFromView(bc,formatter,viewID2, param);
//			//System.out.println("after pop for HouseHoldRecordSet");
			SRMRecordSet HouseHoldRecordSet = qrStep1.getRecordSet();

			if(HouseHoldRecordSet.size() > 0) {
				if(HouseHoldRecordSet.getNext().get(0)!=null)
					{
					HouseHoldRecordSet.resetIndex();
					Xmlassist.setFormData(qrStep1,null,true,"HouseHold","RowRecordSet");

					ArrayList codeList = new ArrayList();
					for (int i=0; i< HouseHoldRecordSet.size() ; i++) {
						while(HouseHoldRecordSet.hasNext()) {
								codeList.add(HouseHoldRecordSet.getNext().get(i));
						}
					}

					HouseHoldRecordSet.resetIndex();


					SRMQueryResult qrFilter = null;

					//crm10.2 146762 get the boClass from cache
					//final Class boClass = Class.
									//forName("com.infy.cis.srmbo.GroupHouseHoldMasterBO");
					final Class boClass = ClassCache.getFromCache("com.infy.cis.srmbo.GroupHouseHoldMasterBO");

					final SRMQueryBuilder qb = new SRMQueryBuilder();

					final SRMAttributeInfo attrID = new SRMAttributeInfo
								(boClass, GroupHouseHoldMasterBO.GROUPHOUSEHOLDMASTERID);
					final SRMAttributeInfo attrRm = new SRMAttributeInfo
								(boClass, GroupHouseHoldMasterBO.GLOBAL_RM);
					final SRMAttributeInfo attrCode = new SRMAttributeInfo
								(boClass, GroupHouseHoldMasterBO.CODE);

					qb.addJoinScope(IQuery.LogicalOperation_AND, attrID);
					ArrayList  lstSRMQueryExpr  = new ArrayList();
					final TransFormFn tf_Code = new TransFormFn (attrCode);
					final SRMQueryExpr attr_Code = new SRMQueryExpr(tf_Code);
					int iCode = codeList.size();
					for(int j=0; j< iCode; j++) {
						lstSRMQueryExpr.add(new SRMQueryExpr((codeList.get(j))));
					qb.addCondition(IQuery.LogicalOperation_OR,attr_Code,
								IQuery.ComparisonOperation_EQ,(SRMQueryExpr)lstSRMQueryExpr.get(j));
					}
					qb.addAttribScope(attrRm);
					qrFilter = qb.runQuery(bc,true, -1);

					SRMRecordSet RMRecordSet = qrFilter.getRecordSet();

					strGlobalRM =  getCSVforList(RMRecordSet);
					}
			}
// CIF HouseHold Changes End
// CRM101UB Group changes :Tracker:110963:start
//			//System.out.println("before pop for GrpRecordSet");
			SRMQueryResult qrGroup = Utils.getQueryResultFromView(bc,formatter,viewGrp, param);
			SRMRecordSet GrpRecordSet = qrGroup.getRecordSet();
	//		//System.out.println("after pop for GrpRecordSet");
			cData = CommonQueries.setTheGlobalRM(cData,bc,GrpRecordSet,Xmlassist,qrGroup);
// CRM101UB Group changes:Tracker:110963:end

         }

			  else
			{
				/**Access Control Changes**/
				agentInfo=CommonQueries.getLoggedinAgentInfo(agentID,bc);
				priGrpID=agentInfo.get("GroupID").toString();
				priSegName=agentInfo.get("Segment").toString();
				priBC=agentInfo.get("BCCode").toString();
				priBCID=agentInfo.get("BCID").toString();
				/**End of Changes**/
		        priBCName=agentInfo.get("BCName").toString();
		        priBCTypeID=agentInfo.get("BCTypeID").toString();
	            isBranch = CommonQueries.checkForBranch(bc,priBCTypeID);
	            if(isBranch){
					catBCName = CommonQueries.getLocaleCatValue(bc,"SERVICE_OUTLET",priBCName);
				}


			}
			// changes for tracker id :253845 Start

			                /* *****  Tracker ID:142437  ***** */
							if(convToCust.equals("Y")){

									if(convType.equalsIgnoreCase("Prospect")){
										ArrayList lookupFields = new ArrayList();
										lookupFields.add(SuspectBO.PLACEOFBIRTH);
										lookupFields.add(SuspectBO.COUNTRYOFBIRTH);
										SRMQueryBuilder qbLookup = QueryAssist.singleObjectQuery("SuspectBO",SuspectBO.SUSPECTID);
										QueryAssist.addSimpleCondition(qbLookup, "SuspectBO", SuspectBO.SUSPECTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
										QueryAssist.selectAttr( qbLookup, "SuspectBO", lookupFields ,true);
										SRMQueryResult qrLookup = qbLookup.runQuery(bc,false,-1);
										Xmlassist.setFormData(qrLookup, null, false, "Main", "AccountBO");

										SRMQueryBuilder qbSuspect = QueryAssist.singleObjectQuery("SuspectBO",SuspectBO.SUSPECTID);
										QueryAssist.addSimpleCondition(qbSuspect, "SuspectBO", SuspectBO.SUSPECTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
										SRMQueryResult qrSuspect = qbSuspect.runQuery(bc,false,-1);
										Xmlassist.setFormData(qrSuspect);
										SRMRecordSet rsSuspect = qrSuspect.getRecordSet();
										if(rsSuspect.hasNext()) {

											suspectBO = (SuspectBO)rsSuspect.getNext().get(0);
											// Changes for tracker id 350214 Starts Here
											if( null != suspectBO.getManager() ) {
											Mgr = suspectBO.getManager().toString();
											}
											if( null != suspectBO.getChargeLevelCode() ) {
											Charge = suspectBO.getChargeLevelCode().toString();
											}
											// Changes for call 413958 and recon of call id 411963 reopned issue starts
											//Changes for call id:425507 and recon of call id 413599 starts
											if( null != suspectBO.getAccessOwnerGroup() ) {
						                        priGrpID = suspectBO.getAccessOwnerGroup().toString();
											}
											if( null != suspectBO.getAccessOwnerSegment() ) {
												priSegName = suspectBO.getAccessOwnerSegment();
											}
										if( null != suspectBO.getAccessOwnerBC() ) {
											priBCID = suspectBO.getAccessOwnerBC().toString();
											SRMQueryBuilder querybuilder = QueryAssist.singleObjectQuery("BizCenterBO", BizCenterBO.BCCODE);
											ArrayList attrList=new ArrayList();
											attrList.add(QueryAssist.getTransformFn("BizCenterBO",BizCenterBO.BCCODE));
											QueryAssist.addSimpleCondition(querybuilder, "BizCenterBO", BizCenterBO.BCID,
											IQuery.ComparisonOperation_EQ, priBCID);
											querybuilder.addAttribScope((TransFormFn) attrList.get(0));
											SRMQueryResult queryRes = querybuilder.runQuery(bc, false, -1);
											SRMRecordSet srmRecSet = queryRes.getRecordSet();
											List ls=null;
											if(srmRecSet.hasNext())
											 {
												 ls=srmRecSet.getNext();
											}
											 priBC=ls.get(0).toString();
										}
										//Changes for call id:425507 and recon of call id 413599 ends
									// Changes for call 413958 and recon of call id 411963 reopned issue ends
											//Changes for tracker id 350214 Ends Here
										}
										rsSuspect.resetIndex();

										Views prospectAddr = ConfigManager.getInstance().
													findView(ViewNames.LIST_OF_PROSPECT_ADDRESS, bc);

										ArrayList addrParam = new ArrayList();
										addrParam.add(entityID);
										SRMQueryResult qrSuspectAddr = Utils.getQueryResultFromView(bc,formatter,prospectAddr,addrParam);
										Xmlassist.setFormData(qrSuspectAddr,null,true,"Address","RecordSet");
										setPhoneEmailRecordSuspect(bc,strlocale,entityID,Xmlassist);
										//setCurrencyRecord(bc,"Prospect",entityID,Xmlassist);
										setEdocRecord(bc,"Prospect",entityID,Xmlassist);
								//Changes for Tracker id: 347074 starts
										preferredAddressType = suspectBO.getPreferredAddressType();
										preferredPhone = suspectBO.getPreferredPhoneType();
										preferredEmail = suspectBO.getPreferredEmailType();
										accMgr=suspectBO.getManager();
										solId=suspectBO.getPrimary_service_centre();
										String strSolId =getCategoryValue(suspectBO.getPrimary_service_centre(),"SERVICE_OUTLET",bc);
										// Changes for call 413958 and recon of call id 411963 reopned issue starts
										//Changes for call id:425507 and recon of call id 413599 starts
										cData.add (new NameValue("bcName",solId));
				                                                cData.add (new NameValue("Cat_bcName",strSolId));
										//Changes for call id:425507 and recon of call id 413599 ends
									// Changes for call 413958 and recon of call id 411963 reopned issue ends
										cData.add (new NameValue("AccountBO.Primary_sol_id",strSolId));
										cData.add (new NameValue("solId",solId));
										if( null != suspectBO.getEnableAlerts() ) {
											Enable_Alerts = suspectBO.getEnableAlerts().toString();
										}
										cData.add (new NameValue("Enable_Alerts",Enable_Alerts));
										//changes for TOL 655410 starts
										cData.add (new NameValue("allowMulti",allowMulti));
										//changes for TOL 655410 ends
								//Changes for Tracker id: 347074 ends
									}else if(convType.equalsIgnoreCase("Contact")){
										ArrayList lookupFields = new ArrayList();
										lookupFields.add(ContactBO.PLACEOFBIRTH);
										lookupFields.add(ContactBO.COUNTRYOFBIRTH);
										SRMQueryBuilder qbLookup = QueryAssist.singleObjectQuery("ContactBO",ContactBO.CONTACTID);
										QueryAssist.addSimpleCondition(qbLookup, "ContactBO", ContactBO.CONTACTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
										QueryAssist.selectAttr( qbLookup, "ContactBO", lookupFields ,true);
										SRMQueryResult qrLookup = qbLookup.runQuery(bc,false,-1);
										Xmlassist.setFormData(qrLookup, null, false, "Main", "AccountBO");

										SRMQueryBuilder qbContact = QueryAssist.singleObjectQuery("ContactBO",ContactBO.CONTACTID);
										QueryAssist.addSimpleCondition(qbContact, "ContactBO", ContactBO.CONTACTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
										SRMQueryResult qrContact = qbContact.runQuery(bc,false,-1);
										Xmlassist.setFormData(qrContact);
										SRMRecordSet rsContact = qrContact.getRecordSet();
										if(rsContact.hasNext()) {

											contactBO = (ContactBO)rsContact.getNext().get(0);

                                                                                            // Changes for Call id 402593 Starts

                                                                                           if( null != contactBO.getManager() ) { 
                                                                                                   accMgr = contactBO.getManager().toString(); 
                                                                                                   Mgr = contactBO.getManager().toString(); 
                                                                                           } 
                                                                                           // Changes for Call id 402593 Ends 
                                           if( null != contactBO.getChargeLevelCode() ) {
	   											
												String chargeLevelCode =contactBO.getChargeLevelCode().toString();
												SRMQueryResult qrChargeCode = Category.findCategory("CHARGE_LEVEL_CODE",bc,strlocale);
													SRMRecordSet rsChargeCode = qrChargeCode.getRecordSet();
													rsChargeCode.resetIndex();
												
												while (rsChargeCode.hasNext()){
													List arChargeLevelCode = rsChargeCode.getNext();
													String codeChargeLevel = arChargeLevelCode.get(1).toString();
												
													if(codeChargeLevel.equalsIgnoreCase(chargeLevelCode)){
														Charge = arChargeLevelCode.get(0).toString();
													}
												
												}
   											}
                                           
                                           
                                           
                                           solId=contactBO.getPrimarySOLID();
                                           
   										String strSolId =getCategoryValue(contactBO.getPrimarySOLID(),"SERVICE_OUTLET",bc);
   										cData.add (new NameValue("bcName",solId));
   				                        cData.add (new NameValue("Cat_bcName",strSolId));
   										cData.add (new NameValue("AccountBO.Primary_sol_id",strSolId));
   										cData.add (new NameValue("solId",solId));

										}
										rsContact.resetIndex();

										Views contactAddr = ConfigManager.getInstance().
													findView(ViewNames.LIST_OF_CONTACT_ADDRESS, bc);

										ArrayList addrParam = new ArrayList();
										addrParam.add(entityID);
										SRMQueryResult qrContactAddr = Utils.getQueryResultFromView(bc,formatter,contactAddr,addrParam);
										SRMRecordSet rsContAddr = qrContactAddr.getRecordSet();
										/**10.2.18 fix for techonline 955184 starts**/
										if(rsContAddr.hasNext()){
											/**10.2.18 fix for techonline 955184 ends**/
										    rsContAddr.resetIndex();
										Xmlassist.setFormData(qrContactAddr,null,true,"Address","RecordSet");

										setPhoneEmailRecordContact(bc,strlocale,entityID,Xmlassist);
										//setCurrencyRecord(bc,"Contact",entityID,Xmlassist);
										setEdocRecord(bc,"Contact",entityID,Xmlassist);
										}
										//call id 344225 and 345914 change start
										preferredAddressType = contactBO.getPreferredAddressType();
										preferredPhone = contactBO.getPreferredPhoneType();
										preferredEmail = contactBO.getPreferredEmailType();
										//call id 344225 and 345914 change end
										/**10.2.18 fix for techonline 955184 starts**/
										secMgr = contactBO.getSecondaryRM_ID();
										if (secMgr != null){
											 cData.add (new NameValue("Sec_manager", secMgr));
										}  
										/**10.2.18 fix for techonline 955184 ends**/
										//changes for TOL 655410 starts
										cData.add (new NameValue("allowMulti",allowMulti));
										//changes for TOL 655410 ends
									}else if(convType.equalsIgnoreCase("NonCustomer")){
										SRMQueryBuilder qbNonCust = QueryAssist.singleObjectQuery("NonCustomerBO",NonCustomerBO.NONCUSTOMERID);
										QueryAssist.addSimpleCondition(qbNonCust, "NonCustomerBO", NonCustomerBO.NONCUSTOMERID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
										SRMQueryResult qrNonCust = qbNonCust.runQuery(bc,false,-1);
										Xmlassist.setFormData(qrNonCust);

										SRMRecordSet rsNonCust = qrNonCust.getRecordSet();
										if(rsNonCust.hasNext()) {

											nonCustBO = (NonCustomerBO)rsNonCust.getNext().get(0);
										}
										rsNonCust.resetIndex();

										/*Views ncView = ConfigManager.getInstance().findView(ViewNames.NONCUSTOMER_ADDRESS_DET, bc);
										String ncAddrAttribs = Utils.getIdAttributeColumns(ncView);
										ArrayList lstNcAddrAttribs = ConversionHelper.parseCommaSepString(ncAddrAttribs);

										SRMQueryBuilder qbNonCustAddr = QueryAssist.singleObjectQuery("NonCustomerBO",NonCustomerBO.NONCUSTOMERID);
										QueryAssist.selectAttr( qbNonCustAddr, "NonCustomerBO", lstNcAddrAttribs ,true);
										QueryAssist.addSimpleCondition(qbNonCustAddr, "NonCustomerBO", NonCustomerBO.NONCUSTOMERID, IQuery.ComparisonOperation_EQ, new Integer(entityID));

										SRMQueryResult qrNonCustAddr = qbNonCustAddr.runQuery(bc,false,-1);

										//XmlassistNC.setFormData(rsNonCustAddr);
										Xmlassist.setFormData(qrNonCustAddr,null,true,"Address","RecordSet");*/

										Views noncustAddr = ConfigManager.getInstance().
													findView(ViewNames.LIST_OF_NONCUSTOMER_ADDRESS, bc);

										ArrayList addrParam = new ArrayList();
										addrParam.add(entityID);
										SRMQueryResult qrnonCustAddr = Utils.getQueryResultFromView(bc,formatter,noncustAddr,addrParam);
										Xmlassist.setFormData(qrnonCustAddr,null,true,"Address","RecordSet");

										setPhoneEmailRecordNonCust(bc,strlocale,entityID,Xmlassist);
										//setCurrencyRecord(bc,"Contact",entityID,Xmlassist);
										setEdocRecord(bc,"NonCustomer",entityID,Xmlassist);
										//call id 344225 change start
												preferredAddressType = nonCustBO.getPreferredAddressType();
												preferredPhone = nonCustBO.getPreferredPhoneType();
												preferredEmail = nonCustBO.getPreferredEmailType();
										//call id 344225 change end
										//changes for call id 407866 and recon of call id 400498 starts
										//Changes for call id 414534-recon for 412591 starts
												String salutationcode = nonCustBO.getSalutation();
												String cat_salutation = CommonQueries.getLocaleCatValue(bc,"PERSONSALUTATION",salutationcode);
												String salutationtext = cat_salutation.substring(cat_salutation.indexOf("#")+1);
												cData.add(new NameValue("AccountBO.Salutation_code",salutationcode));
								   				cData.add(new NameValue("Cat_AccountBO.Salutation_code",salutationtext));
                                                                // changes for ticket id 775774
								   				cData.add (new NameValue("allowMulti",allowMulti));
								   		//Changes for call id 414534-recon for 412591 ends
										//changes for call id 407866 and recon of call id 400498 ends
										if( null != nonCustBO.getEnableAlerts() ) {
											Enable_Alerts = nonCustBO.getEnableAlerts().toString();
                						}
										cData.add (new NameValue("Enable_Alerts",Enable_Alerts));
									}
									/*Fetching the currency info for convToCust equals to Y*/
									//Changes done by Deepak Jha for Recon id 398058 (TOLs Call Id 395387)
									String currId = "";
									String currText10 = "";
									String currFlt1 = "";
									String currFlt2 = "";
									String currFlt3 = "";
									String currFlt4 = "";
									String currDate = "";
									int entityId = 0;

									if ((entityID==null)||(entityID.equalsIgnoreCase("")))
									{
										entityId = 0;
									}
									else
									{
										try
										{
											entityId=Integer.parseInt(entityID);
										}
										catch(NumberFormatException e)
										{
											if(WebAdaptor.willLog(com.infy.cis.log.LogType.MINOR))
											{
												WebAdaptor.log(com.infy.cis.log.LogType.MINOR,
														"Suspect_det : Invalid entityId=" + entityID );
											}
											throw new SRMBCException(SRMBCException.INVALID_ACCOUNT,null);
										}
									}
                                        //changes for callid 400616 starts 
									if (boPsco != null && !convType.equalsIgnoreCase("NonCustomer"))
									{
										//changes for callid 400616 ends
										ArrayList CurrencyAttr = new ArrayList();
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_MISCELLANEOUSID);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_STRTEXT10);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT1);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT2);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT3);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT4);
										CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DTDATE1);


										String ttParentType = "CURRENCY";
										String CompID = "PsychographicBO.ACCOUNTID";


										if(convType.equals("Account"))
										{
											CompID = AccountBO.ACCOUNTID;
										}
										else if(convType.equals("Contact"))
										{
											CompID = PsychographicBO.CONTACTID;
										}
										else if(convType.equals("Prospect"))
										{
											CompID = PsychographicBO.SUSPECTID;
										}

										SRMQueryResult qr_CurrencyDet = CommonQueries.getCurrencyDetInfo(bc,
												entityId,
												CurrencyAttr,
												ttParentType,
												CompID
										);

										SRMRecordSet rs_CurrencyDet = qr_CurrencyDet.getRecordSet();

										while(rs_CurrencyDet.hasNext())
										{
											List arrReult      = rs_CurrencyDet.getNext();
											if(null != arrReult)
											{
												if(null != arrReult.get(0))
												{
													if(currId !=null && currId.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currId      = currId + ',' + arrReult.get(0).toString();
													}
													else
													{
														currId      = arrReult.get(0).toString();
													}
												}
												if(null != arrReult.get(1))
												{
													if(currText10 !=null && currText10.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currText10    = currText10 + ',' +arrReult.get(1).toString();
													}
													else
													{
														currText10    = arrReult.get(1).toString();
													}
												}

												if(null != arrReult.get(2))
												{
													if(currFlt1 !=null && currFlt1.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currFlt1       = currFlt1+','+arrReult.get(2).toString();
													}
													else
													{
														currFlt1       = arrReult.get(2).toString();
													}
												}
												if(null != arrReult.get(3) )
												{
													if(currFlt2 !=null && currFlt2.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currFlt2       = currFlt2+','+arrReult.get(3).toString();
													}
													else
													{
														currFlt2       = arrReult.get(3).toString();
													}
												}
												if(null != arrReult.get(4)  )
												{
													if(currFlt3 !=null && currFlt3.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currFlt3        = currFlt3+','+arrReult.get(4).toString();
													}
													else
													{
														currFlt3        = arrReult.get(4).toString();
													}
												}
												if(null != arrReult.get(5) )
												{
													if(currFlt4 !=null && currFlt4.length()!=0)
													{
														//concatinating all the currencies for the existing customer
														currFlt4 = currFlt4+','+arrReult.get(5).toString();
													}
													else
													{
														currFlt4 = arrReult.get(5).toString();
													}
												}
												if(null != arrReult.get(6) )
												{
													//concatinating all the currencies for the existing customer
													String strCurrencyDate = arrReult.get(6).toString();
													strCurrencyDate = fnDateConver(strCurrencyDate);
													if(currDate !=null && currDate.length()!=0)
													{
														currDate  = currDate+','+strCurrencyDate;
													}
													else
													{
														currDate  = strCurrencyDate;
													}
												}
											}
										}
										rs_CurrencyDet.resetIndex();
										Xmlassist.setFormData(qr_CurrencyDet, null, true, "CurrencyDetInfo","CurrencyDetRecordSet");
										cData.add(new NameValue("currId", currId));
										cData.add(new NameValue("currText10", currText10));
										cData.add(new NameValue("currFlt1", currFlt1));
										cData.add(new NameValue("currFlt2", currFlt2));
										cData.add(new NameValue("currFlt3", currFlt3));
										cData.add(new NameValue("currFlt4", currFlt4));
										cData.add(new NameValue("currDate", currDate));
									}

								/**********End of population of currency info******************/
							}/* End of IF convToCust */

			            /* *****  Tracker ID:142437  ***** */
// changes for tracker id :253845 End
		//Tracker No 97042 begin
				/* To fetch Segment and Sub Segment values*/
				String segmentRating = "";
				String segmentValues = "";
				String subSegmentValues = "";
				String ratingValues = "";
				String subSegmentCodeVal = "";
				ArrayList allSegVal = new ArrayList();
				allSegVal = CifQueries.getSegmentValues(com_infy_cis_ui_cif_Segmentation_class,
													com_infy_cis_ui_cif_Sub_Segment,
													"SEGMENTATION_CLASS",
											 		"SUB_SEGMENT",
											 		 strlocale,
											 		 bc);
				segmentValues = (String)allSegVal.get(0);
				segmentRating = (String)allSegVal.get(1);
				subSegmentValues = (String)allSegVal.get(2);
				ratingValues = (String)allSegVal.get(3);
				subSegmentCodeVal = (String)allSegVal.get(4);

		//Tracker No 97042 end
					//TrackerID:234910 changes starts

			 String chargeCode ="";
			ArrayList chargelevel = new ArrayList();
   				chargelevel = CifQueries.getChargelevel(com_infy_cis_ui_cif_Segmentation_class,
   													com_infy_cis_ui_cif_Chargelevel,
   													"SEGMENTATION_CLASS",
   													"CHARGE_LEVEL_CODE",
   													 strlocale,
   													 bc);
   				chargeCode = (String)chargelevel.get(0);
//System.out.println("At 572:AccountMod_det chargeCode="+chargeCode);
   			//cData = CommonQueries.getUserKeyAccess(cData,bc,agentID);

				String codeCharegeLevel ="";
				SRMQueryResult qrChargeCode = Category.findCategory("CHARGE_LEVEL_CODE",bc,strlocale);
				SRMRecordSet rsChargeCode = qrChargeCode.getRecordSet();
/*
				while (rsChargeCode.hasNext()){
					List arChargeLevelCode = rsChargeCode.getNext();
					String langChargeLevel = arChargeLevelCode.get(0).toString();

					if(langChargeLevel.equalsIgnoreCase(chargeCode)){
							codeCharegeLevel = arChargeLevelCode.get(1).toString();
					}
				}*/
			SRMQueryBuilder qbAcct = QueryAssist.singleObjectQuery ( "AccountBO", AccountBO.ACCOUNTID);
			QueryAssist.addSimpleCondition ( qbAcct, "AccountBO", AccountBO.ACCOUNTID, IQuery.ComparisonOperation_EQ, ""+accountID);

			SRMQueryResult qrAccount = qbAcct.runQuery(bc ,true, -1 );
			SRMRecordSet rsAcct = qrAccount.getRecordSet();
			String chargeLevelCode="";
			String serviceLevelCode ="";
		String chargeLevelLang ="";
//Changes for tracker 356432 starts
		SRMQueryResult CustTypeCode = Category.findCategory("ACCOUNT_TYPE",bc,strlocale);
		SRMRecordSet rsCustTypeCode = CustTypeCode.getRecordSet();
	    String CustTCode="";
		String custTypeLang="";
		SRMQueryResult CuststatusCode = Category.findCategory("CUSTOMER_STATUS",bc,strlocale);
		SRMRecordSet rsCuststatusCode = CuststatusCode.getRecordSet();
	    String CustStatCode="";
		String custStatLang="";
		SRMQueryResult ConstCode = Category.findCategory("CONSTITUTION_CODE",bc,strlocale);
		SRMRecordSet rsConstCode = ConstCode.getRecordSet();
	    String ConCode="";
		String constLang="";
		//Changes for tracker 356432 ends
		if(rsAcct.hasNext()) {
		AccountBO tempAcc = (AccountBO)rsAcct.getNext().get(0);

//Changes for tracker 356432 starts
		if(null != tempAcc.getCust_Type()){
			CustTCode=tempAcc.getCust_Type().toString();

			}
	if(null != tempAcc.getStatus()){
			CustStatCode=tempAcc.getStatus().toString();

			}
	if(null != tempAcc.getConstitution_ref_code()){
			ConCode=tempAcc.getConstitution_ref_code().toString();

			}
		//Changes for tracker 356432 ends
		if( null != tempAcc.getChargeLevelCode() ) {
			chargeLevelCode = tempAcc.getChargeLevelCode().toString();

		}

		if( null != tempAcc.getSegmentation_Class() )
				//Changes for tracker id: 333740 starts
				//serviceLevelCode = tempAcc.getSegmentation_Class().toString();
				Segmentation_Class = tempAcc.getSegmentation_Class().toString();
				//Changes for tracker id: 333740 ends
				//Changes for tracker id: 333741 starts
		//Changes for Tracker id: 361921 starts
		if( null != tempAcc.getConstitution_Code() )
				constitution_code = tempAcc.getConstitution_Code().toString();
		//Changes for Tracker id: 361921 ends

				if( null != tempAcc.getTds_tbl() ) {
					Tds_tbl = tempAcc.getTds_tbl().toString();
				}

		//Changes for Tracker id:355038starts
		if( null != tempAcc.getSector() )
				sector_code = tempAcc.getSector().toString();

		if( null != tempAcc.getSubsector() )
				subsector_code = tempAcc.getSubsector().toString();
		//Changes for Tracker id:355038ends
		}
		rsChargeCode.resetIndex();
		while (rsChargeCode.hasNext()){
			List arChargeLevelCode = rsChargeCode.getNext();
			String codeChargeLevel = arChargeLevelCode.get(1).toString();

			if(codeChargeLevel.equalsIgnoreCase(chargeLevelCode)){
				chargeLevelLang = arChargeLevelCode.get(0).toString();
			}

		}
	//Changes for call id 348199 STARTS
	String flagRelType1="false";
			     if(accountID > 0){
						String relType1=null;
						SRMQueryBuilder qbRel1 =
											  QueryAssist.singleObjectQuery("RelationshipBO",
																			 RelationshipBO.ENTITYRELATIONSHIPID
																			);
						QueryAssist.addSimpleCondition(qbRel1,
													   "RelationshipBO",
														RelationshipBO.PARENTENTITYID,
														IQuery.ComparisonOperation_EQ,
														""+accountID
														);
					   SRMQueryResult qrRel1 = qbRel1.runQuery(bc, true, -1);
					   SRMRecordSet rsRel1 = qrRel1.getRecordSet();
					   while(rsRel1.hasNext()) {
						   RelationshipBO tempRel1 = (RelationshipBO)rsRel1.getNext().get(0);
						   if( null != tempRel1.getRelationship() ) {
							   relType1 = tempRel1.getRelationship().toString();
							   	relType1 = relType1.toUpperCase();
								if(relType1.indexOf("GUARDIAN")>=0){
								   flagRelType1="true";
								   break;
						   }
					   }
			  	 	}
			}
	//Changes for call id 348199 ENDS
//Changes for tracker 356432 starts
		rsCustTypeCode.resetIndex();
		while (rsCustTypeCode.hasNext()){
					List arCustTypeCode = rsCustTypeCode.getNext();
					String codeCustType = arCustTypeCode.get(1).toString();

					if(codeCustType.equalsIgnoreCase(CustTCode)){
						custTypeLang = arCustTypeCode.get(0).toString();

					}

		}
		rsCuststatusCode.resetIndex();
		while (rsCuststatusCode.hasNext()){
					List arCustStatCode = rsCuststatusCode.getNext();
					String codeCustStat = arCustStatCode.get(1).toString();

					if(codeCustStat.equalsIgnoreCase(CustStatCode)){
						custStatLang = arCustStatCode.get(0).toString();

					}

		}
		rsConstCode.resetIndex();
		while (rsConstCode.hasNext()){
					List arConstCode = rsConstCode.getNext();
					String codeConst = arConstCode.get(1).toString();

					if(codeConst.equalsIgnoreCase(ConCode)){
						constLang = arConstCode.get(0).toString();

					}

		}
		//Changes for tracker 356432 ends

			//TrackerID:234910 changes ends
		/* CoreInterface Changes:start*/
// Recon for call id 372928 and changes for call id 371274 starts
		ArrayList attrFreeCode = new ArrayList();
		String FreeCode3Desc = null;
		String FreeCode4Desc = null;
		String FreeCode5Desc = null;
		String FreeCode8Desc = null;
		String FreeCode9Desc = null;
		String FreeCode10Desc = null;
		attrFreeCode.add(CoreInterfaceBO.FREECODE3);
		attrFreeCode.add(CoreInterfaceBO.FREECODE4);
		attrFreeCode.add(CoreInterfaceBO.FREECODE5);
		attrFreeCode.add(CoreInterfaceBO.FREECODE8);
		attrFreeCode.add(CoreInterfaceBO.FREECODE9);
		attrFreeCode.add(CoreInterfaceBO.FREECODE10);
		SRMQueryBuilder my = QueryAssist.singleObjectQuery("CoreInterfaceBO",CoreInterfaceBO.ACCOUNTID);
		QueryAssist.addSimpleCondition (my,"CoreInterfaceBO",CoreInterfaceBO.ACCOUNTID,IQuery.ComparisonOperation_EQ,accountID);
		String sqla= my.getSQLStringQuery(1, true, bc).toString();
		QueryAssist.selectAttr(my, "CoreInterfaceBO", attrFreeCode);
		SRMQueryResult qr = my.runQuery(bc, -1);
		SRMRecordSet recordSet= qr.getRecordSet();
		while(recordSet.hasNext()){
			attrFreeCode=(ArrayList)recordSet.getNext();
		}
		String FreeCode3 =(String) attrFreeCode.get(0);
		String FreeCode4 =(String) attrFreeCode.get(1);
		String FreeCode5 =(String) attrFreeCode.get(2);
		String FreeCode8 =(String) attrFreeCode.get(3);
		String FreeCode9 =(String) attrFreeCode.get(4);
		String FreeCode10 =(String) attrFreeCode.get(5);
		FreeCode3Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE3",FreeCode3);
		FreeCode4Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE4",FreeCode4);
		FreeCode5Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE5",FreeCode5);
		FreeCode8Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE8",FreeCode8);
		FreeCode9Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE9",FreeCode9);
		FreeCode10Desc = CommonQueries.getLocaleCatValue(bc,"FREE_CODE10",FreeCode10);
		cData.add(new NameValue("FreeCode3Desc1",FreeCode3Desc));
		cData.add(new NameValue("FreeCode4Desc1",FreeCode4Desc));
		cData.add(new NameValue("FreeCode5Desc1",FreeCode5Desc));
		cData.add(new NameValue("FreeCode8Desc1",FreeCode8Desc));
		cData.add(new NameValue("FreeCode9Desc1",FreeCode9Desc));
		cData.add(new NameValue("FreeCode10Desc1",FreeCode10Desc));

// Recon for call id 372928 and changes for call id 371274 ends
        if(accountID > 0){
			SRMQueryBuilder qbCoreInt =
                                   QueryAssist.singleObjectQuery("CoreInterfaceBO",
                                                                 CoreInterfaceBO.COREINTERFACEID,QB_COREINTERFACEID
                                                                 );
             QueryAssist.addSimpleCondition(qbCoreInt,
                                            "CoreInterfaceBO",
                                             CoreInterfaceBO.ACCOUNTID,
                                             IQuery.ComparisonOperation_EQ,
                                             ""+accountID
                                             );

            SRMQueryResult qrCoreInt = qbCoreInt.runQuery(bc, true, -1);
            Xmlassist.setFormData(qrCoreInt);

		}
		/* CoreInterface Changes:end*/

/* Commented as part of SPE Tuning
//Tracker ID 113276 currency changes start
		keyAttr = PsychographicBO.ACCOUNTID;
		SRMQueryBuilder qb = new SRMQueryBuilder();
		qb.addJoinScope (PsychographicBO.ATTR_URL_);
		qb.addCondition (
				IQuery.LogicalOperation_AND,
				new SRMQueryExpr (new SRMAttributeInfo (PsychographicBO.class, keyAttr)),
				IQuery.ComparisonOperation_EQ,
				new SRMQueryExpr (new Integer(accountID))	);
		SRMRecordSet rs = qb.runQuery (bc, false, 1).getRecordSet();
		if (rs.hasNext()) {
			boPsco = (PsychographicBO)rs.getNext().get(0);
			strPsychoId=boPsco.getPsychographicID().toString();
			Xmlassist.setFormData (boPsco, null, false, "Main");
		//	concurDetex = boPsco.getConcurDetect_X().toString();
		}

Commented as part of SPE Tuning */

		//CRM10.2SPE Changes
		/*
		Xmlassist.addTablePresentation("CurrencyDetRecordSet", "","ascending",
				"",CurrencyDefaultColumnOrder,
				CurrencyMandatoryColumns, "",
				CurrencyIdAttributeColumns,
				CurrencyRowIdentifier
		);*/
		Xmlassist.addTablePresentation("CurrencyDetRecordSet", "","ascending",
				"",CurrencyDefaultColumnOrder,
				CurrencyMandatoryColumns.toString(), "",
				CurrencyIdAttributeColumns.toString(),
				CurrencyRowIdentifier,"","Account_det1"
		);
		//Tracker ID 113276 CIF Changes - Currency Details - End





		String flagRelType="false";

        //Cif changes Minor
       // changes for tracker id :253845 Start
	           if(accountID > 0 && !convToCust.equals("Y")){
		// changes for tracker id :253845 End

/* Modified as part of SPE Tuning -- Begin*/
			ArrayList relShip = new ArrayList();
			relShip.add(QueryAssist.getTransformFn(true,"RelationshipBO", RelationshipBO.CHILDENTITY));
			relShip.add(QueryAssist.getTransformFn(true,"RelationshipBO", RelationshipBO.CONTACTNAME));
			/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Starts*/
			relShip.add(QueryAssist.getTransformFn(true,"RelationshipBO", RelationshipBO.CHILDENTITYTYPE));
			relShip.add(QueryAssist.getTransformFn(true,"RelationshipBO", RelationshipBO.CHILDENTITYID));
			/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Ends */
			//relShip.add( RelationshipBO.RELATIONSHIP);

	                SRMQueryBuilder qbRel = QueryAssist.singleObjectQuery("RelationshipBO",RelationshipBO.ENTITYRELATIONSHIPID,QB_ENTITYRELATIONSHIPID);
					//QueryAssist.selectAttr( qbRel, "RelationshipBO", relShip );
	                QueryAssist.addSimpleCondition(qbRel,
	                                               "RelationshipBO",
	                                                RelationshipBO.PARENTENTITYID,
	                                                IQuery.ComparisonOperation_EQ,
	                                                ""+accountID
	                                                );
		//changes lily
					QueryAssist.addSimpleCondition(qbRel,
														   "RelationshipBO",
															RelationshipBO.PARENTENTITYTYPE,
															IQuery.ComparisonOperation_EQ,
															"Retail");
					/* Ticket 241130*/
					QueryAssist.addSimpleCondition(qbRel,"RelationshipBO",RelationshipBO.PRIMARYINTRODUCER,IQuery.ComparisonOperation_EQ,"Y");
					//QueryAssist.addSimpleCondition(qbRel,"RelationshipBO",RelationshipBO.RELATIONSHIP,IQuery.ComparisonOperation_EQ,"GUARDIAN");
					int noOfAttrs = relShip.size();
					 for (int i=0; i<noOfAttrs; i++) {
						 qbRel.addAttribScope((TransFormFn) relShip.get(i));
					 }

					SRMQueryResult qrRel = qbRel.runQuery(bc, true, -1);

					SRMRecordSet rsRel = qrRel.getRecordSet();
					if(rsRel.hasNext()) {

						flagRelType="true";
					}

/* Modified as part of SPE Tuning -- End */
List finList1 = new ArrayList();
			while(rsRel.hasNext()){
				finList1 = (ArrayList)rsRel.getNext();
		}


			int iArrLength1 = finList1.size();

			//String to hold temporary values while parsing arraylist
			String StrTemp1=null;

			//Loop to parse the entire array list
			//This loop will convert objects in array list to strings
			for(int i = iArrLength1-1;i >= 0 ;i--)
			{
				if(finList1.get(i) == null){
					StrTemp1 = "";
				}
				else{
					StrTemp1 = (finList1.get(i)).toString();
				}
					//Setting the values back to arraylist
					finList1.set(i,StrTemp1);
			}

	 if(iArrLength1 > 0){
			/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Starts */
			cData.add(new NameValue
			("RelationshipBO.Bank_Entity1",finList1.get(0)));
			//cData.add(new NameValue
			//("RelationshipBO.Bank_Entity_Name1",finList1.get(1)));
			/* Change done for ticket 341194 Start */
//changes for callid 439623 starts
		/*	cData.add(new NameValue
			("RelationshipBO.ChildEntityType",finList1.get(2))); */
cData.add(new NameValue
			("RelationshipBO.ChildEntityType",finList1.get(3))); 
//changes for callid 439623 ends

			//Changes for call id call id 428461 and recon of call id 425465,400878 starts
			cData.add(new NameValue
			("RelationshipBO.ChildEntityId",finList1.get(4)));
			//Changes for call id call id 428461 and recon of call id 425465,400878 ends
			/* Change done for ticket 341194 end */
			/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Ends */
		}


/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Starts */

int ichildEntityID = 0;
String banktype="";
String childtype="";

/* Doing NUll check for scenarios where Entity Relation ship was not given to the created customer */

if(finList1!=null && finList1.size()>0){

			ichildEntityID = Integer.parseInt(finList1.get(4).toString());
			//ichildEntityID = (finList1.get(4)).toString();
			banktype = finList1.get(3).toString();
			childtype = finList1.get(0).toString();

	}

if(ichildEntityID > 0){
	List listEntityAttr = new ArrayList();
    	String BoName ="";
							String BoID ="";

	if(banktype.equalsIgnoreCase("RETAIL")){



							if(childtype.equalsIgnoreCase("CONTACT")){

									BoName = "ContactBO";
				 					BoID = ContactBO.CONTACTID;

				 					//Add the required parameters to the array list
													listEntityAttr.add
													(ContactBO.SALUTATION);
													listEntityAttr.add
													(ContactBO.FIRSTNAME);
													listEntityAttr.add
													(ContactBO.LASTNAME);
													listEntityAttr.add
													(ContactBO.MIDDLENAME);
													listEntityAttr.add
													(ContactBO.GENDER);
													listEntityAttr.add
													(ContactBO.DOB);
													listEntityAttr.add
													(ContactBO.CONTACTSKEY);

							} else if (childtype.equalsIgnoreCase("CUSTOMER")){

									BoName = "AccountBO";
									BoID = AccountBO.ACCOUNTID;

													//Add the required parameters to the array list
													listEntityAttr.add
													(AccountBO.SALUTATION);
													listEntityAttr.add
													(AccountBO.CUST_FIRST_NAME);
													listEntityAttr.add
													(AccountBO.CUST_LAST_NAME);
													listEntityAttr.add
													(AccountBO.CUST_MIDDLE_NAME);
													listEntityAttr.add
													(AccountBO.GENDER);
													listEntityAttr.add
													(AccountBO.CUST_DOB);
													listEntityAttr.add
													(AccountBO.ACCOUNTKEY);

							}else {

									BoName = "SuspectBO";
									BoID = SuspectBO.SUSPECTID;

													//Add the required parameters to the array list
													listEntityAttr.add
													(SuspectBO.SALUTATION);
													listEntityAttr.add
													(SuspectBO.FIRSTNAME);
													listEntityAttr.add
													(SuspectBO.LASTNAME);
													listEntityAttr.add
													(SuspectBO.MIDDLENAME);
													listEntityAttr.add
													(SuspectBO.GENDER);
													listEntityAttr.add
													(SuspectBO.SUSPECTS_DOB);
													listEntityAttr.add
													(SuspectBO.SUSPECTSKEY);
						}
}

else{



							BoName = "CorporateBO";
							BoID = CorporateBO.CORP_ID;

													//Add the required parameters to the array list
						listEntityAttr.add
						(CorporateBO.ENTITY_TYPE);
						listEntityAttr.add
						(CorporateBO.CORP_KEY);
						listEntityAttr.add
						(CorporateBO.CORPORATE_NAME);
						listEntityAttr.add
						(CorporateBO.SHORT_NAME);
						listEntityAttr.add
						(CorporateBO.DATE_OF_INCORPORATION);

	}

					//Queryto fetch records
					SRMQueryBuilder qbCont = QueryAssist.singleObjectQuery(BoName,BoID);

					//set the condition to check the child entity ID
					QueryAssist.addSimpleCondition(qbCont, BoName, BoID,IQuery.ComparisonOperation_EQ,""+ ichildEntityID);

					//Select the attributes mentioned in the ArrayList
					QueryAssist.selectAttr(qbCont, BoName, listEntityAttr);

					//Run the query
					SRMQueryResult qrCont = qbCont.runQuery(bc, -1);

					//Get the values into a recordset
					SRMRecordSet rsCont = qrCont.getRecordSet();

					List contList = new ArrayList();

					while(rsCont.hasNext()){
						contList = (ArrayList)rsCont.getNext();
					}

					//Calculating the size of arraylist

					//Variable to strore length of arraylist
					int iArrLength = contList.size();

					//String to hold temporary values while parsing arraylist
					String StrTemp=null;

					//Loop to parse the entire array list
					//This loop will convert abjects in array list to strings
					for(int i = iArrLength-1;i >= 0 ;i--)
						{
							if(contList.get(i) == null){
										StrTemp = "";
									}

							else{
									StrTemp = (contList.get(i)).toString();
								}

							//Setting the values back to arraylist
							contList.set(i,StrTemp);
						}

					//Set the templates in Custom Data
					if(iArrLength > 0){

					//	cData.add(new NameValue
					//	("RelationshipBO.Bank_Entity_Name1",contList.get(0)));
						//Changes for call id 410026 and recon of call id 407523 starts
						if(banktype.equalsIgnoreCase("RETAIL")){
							String IntroSal = contList.get(0).toString();
							String IntroSalCat = CommonQueries.getLocaleCatValue(bc,"PERSONSALUTATION",IntroSal);
							cData.add(new NameValue
							("CatIntroducerSalutation",IntroSalCat));
						}
						//Changes for call id 410026 and recon of call id 407523 ends
						cData.add(new NameValue
						("RelationshipBO.Bank_Entity_Name1",contList.get(2)));

					//	cData.add(new NameValue
					//	("RelationshipBO.Guard_Code",contList.get(2)));

						//Get integer value of Contact Id
					//	if(!(contList.get(3)).equals("")){
					//		ichildEntityID = Integer.parseInt((contList.get(3)).toString());
					//		}

					//	if(!(contList.get(4)).equals("")){
					//		childtype = (contList.get(4)).toString();
					//		}

					//	cData.add(new NameValue
					//	("RelationshipBO.Bank_Entity",contList.get(4)));

					}
		}
}
	// changes for tracker id :253845 Start
	 else if(convToCust.equals("Y")){

		      SRMQueryBuilder qbChkPrimInt = QueryAssist.singleObjectQuery("RelationshipBO",RelationshipBO.ENTITYRELATIONSHIPID);
			  qbChkPrimInt.addAttribScope ( QueryAssist.getTransformFn ("RelationshipBO",  RelationshipBO.PRIMARYINTRODUCER) );
	          QueryAssist.addSimpleCondition(qbChkPrimInt,"RelationshipBO",RelationshipBO.PARENTENTITYID,
		                                     IQuery.ComparisonOperation_EQ,""+entityID);
	          QueryAssist.addSimpleCondition(qbChkPrimInt,"RelationshipBO",RelationshipBO.PARENTENTITY,
		                                     IQuery.ComparisonOperation_EQ,""+convType.toUpperCase());

			  SRMQueryResult qrChkPrimInt = qbChkPrimInt.runQuery(bc,false,-1);
			  SRMRecordSet rsChkPrimInt   = qrChkPrimInt.getRecordSet();

			  while(rsChkPrimInt.hasNext()){
						 String primaryIntro = (String)rsChkPrimInt.getNext().get(0);
				 if(primaryIntro!=null && primaryIntro.equals("Y")){
				   primaryIntroExists = "Y";
				   break;
			   	 }
			  }
		 }/* End of IF convToCust */
	     /* *****   Tracker ID:142437   ***** */
// changes for tracker id :253845 End

/* Modification for Primary Introducer Details by pradeep_sathyamurthy as a part of ticket 318063 - Ends */

//Changes for Account and Currency validation START
//changes for 740489 starts
		/*if(isReadOnly!=null && !isReadOnly.equals("Y")){ //CRM10.2
				List opprList=new ArrayList();
				List acctList=new ArrayList();
				String currList="";
				String curraccList="";
				StringBuilder strbCurrList = new StringBuilder("");
				StringBuilder strbAccCurrList = new StringBuilder("");
				if(accountID>0)//CRM10.2
				{
				opprList=SaleQueries.getOpprDetails (bc,accountID);
		   		acctList= SaleQueries.getAccountsDetails(bc,accountID);
			    }
			    int iOppr =opprList.size();
                for(int iCount=0;iCount<iOppr;iCount++){

					if (currList== ""){
						//currList=currList+(opprList.get(iCount));
						strbCurrList.append(opprList.get(iCount));
					}
					else{
					//currList=currList+","+(opprList.get(iCount));
					    strbCurrList.append(",").append(opprList.get(iCount));
				    }

					}
				currList = strbCurrList.toString();
					int iacct =acctList.size();
			 for(int iCount1=0;iCount1<iacct;iCount1++){
				 //fix  for callid 359328 begins
				if (curraccList== "" && strbAccCurrList.toString() == ""){
					//fix  for callid 359328 ends
					//curraccList=curraccList+(acctList.get(iCount1));
					strbAccCurrList.append(acctList.get(iCount1));
				}
				else{
					//curraccList=curraccList+","+(acctList.get(iCount1));
					strbAccCurrList.append(",").append(acctList.get(iCount1));
				 }
				}
				curraccList = strbAccCurrList.toString();
				cData.add(new NameValue("CurrencyList",currList));
				cData.add(new NameValue("CurrencyAccList",curraccList));
	}
*/


//Changes for Account and Currency validation END
//changes for 740489 ends


	//CRM10.2SOE Changes
	//Xmlassist.addTablePresentation("RecordSet", "","","",requiredColumns,
	//		                                        requiredColumns, "",idAttributeColumns, rowIdentifier) ;
	Xmlassist.addTablePresentation("RecordSet", "","","",requiredColumns,
			                                        requiredColumns, "",idAttributeColumns, rowIdentifier,"","Account_det2") ;
	// CRM GroupHouseHold changes Begin
	//CRM10.2SPE Changes
	/*
			 Xmlassist.addTablePresentation("RowRecordSet", "","","",requiredColumns1,
			                                        requiredColumns1, "",idAttributeColumns1, rowIdentifier1) ;
	*/
	Xmlassist.addTablePresentation("RowRecordSet", "","","",requiredColumns1,
			                                        requiredColumns1, "",idAttributeColumns1, rowIdentifier1,"","Account_det3") ;

	// CRM HouseHold changes End

		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES start

		//CRM10.2SPE Changes
		/*
		Xmlassist.addTablePresentation("EDocRecordSet", "", "",
				"", strIDdetDefaultColumnOrder,
				strIDdetDefaultColumnOrder, "",
				strIDdetIdAttributeColumns, strIDdetRowIdentifier
		);
		*/
		Xmlassist.addTablePresentation("EDocRecordSet", "", "",
						"", strIDdetDefaultColumnOrder,
						strIDdetDefaultColumnOrder, "",
						strIDdetIdAttributeColumns, strIDdetRowIdentifier,
						"","Account_det4"
		);
		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES end



	/* CIF PhoneEmail Changes : Start */
	//CRM10.2SPE Changes
	/*
	Xmlassist.addTablePresentation("PhoneEmailRecordSet", "","","",phoneEmailRequiredColumns,
												  phoneEmailRequiredColumns, "",phoneEmailIdAttributeColumns, phoneEmailRowIdentifier) ;
	*/
	Xmlassist.addTablePresentation("PhoneEmailRecordSet", "","","",phoneEmailRequiredColumns,
												  phoneEmailRequiredColumns, "",phoneEmailIdAttributeColumns, phoneEmailRowIdentifier,"","Account_det5") ;
	/* CIF PhoneEmail Changes : End */
// CRM101UB company changes :Tracker:110963:Begin
	/*
	Xmlassist.addTablePresentation("GroupRecordSet", "","","",companyRequiredColumns,
				                                        companyRequiredColumns, "",companyIdAttributeColumns, companyRowIdentifier) ;
	*/
	//CRM10.2SPE Changes
	Xmlassist.addTablePresentation("GroupRecordSet", "","","",companyRequiredColumns,
				                                        companyRequiredColumns, "",companyIdAttributeColumns, companyRowIdentifier,"","Account_det6") ;
// CRM101UB company changes:Tracker:110963:End
  // for getting all currency details.
	//SRMQueryResult qResultCur = CurrencyAndRateCache.findCurrency(bc);

/* commented out as it is a repetitive code  - SPE Tuning

	SRMQueryResult qResultCur = CurrencyAndRateCache.findCurrency(bc,currencyCode);
	SRMRecordSet recordSetCur = qResultCur.getRecordSet();
	recordSetCur.resetIndex();
        Xmlassist.setFormData(qResultCur,null,false,Currency,CurrencyRecordSet);


        // for getting all exchange rates.
	//SRMQueryResult qResultRate = CommonQueries.getRate (bc);
	SRMQueryResult qResultRate = CurrencyAndRateCache.findExchangeRate(bc);
	SRMRecordSet recordSetRate = qResultRate.getRecordSet();
	recordSetRate.resetIndex();
        Xmlassist.setFormData(qResultRate,null,false,ExRate,ExRateRecordSet);

 commented out as it is a repetitive code */

	// CRM10.2 146762 , cached to get from the category  cache
	/*
        ArrayList assignedBackEndID = new ArrayList();
        assignedBackEndID.add(CategoryBO.CATEGORYID);
        assignedBackEndID.add(CategoryBO.CATEGORY_LANG_CAT_VAL);
        SRMQueryBuilder qb1 = QueryAssist.singleObjectQuery("CategoryBO",
                                CategoryBO.CATEGORYID);
        QueryAssist.addSimpleCondition(qb1, "CategoryBO", CategoryBO.CATEGORYTYPE,
                                IQuery.ComparisonOperation_EQ,
                                "PRODUCT_PROCESSOR");
		QueryAssist.addSimpleCondition(qb1, "CategoryBO", CategoryBO.CATEGORY_LANG_LANG_CODE,
   												IQuery.ComparisonOperation_EQ, locale);
        QueryAssist.selectAttr(qb1, "CategoryBO", assignedBackEndID);
        SRMQueryResult qr1 = qb1.runQuery(bc , -1);*/


//		Categories.getCategories("PRODUCT_PROCESSOR" , bc , locale);

		SRMQueryResult qr1 = Category.findCategory("PRODUCT_PROCESSOR", bc);

        Xmlassist.addDataChoices("Assigned_BackendID",
                                qr1,
                                CategoryBO.CATEGORY_LANG_CAT_VAL,
                                CategoryBO.CATEGORY_LANG_CAT_VAL);





              //Tracker:90196: Changes for attibute masking
							cData.add (new NameValue ("AccessOwnerGroup", AccessOwnerGroup));
			//Tracker:90196: End of changes for attribute masking

            /* NNTM Changes Start*/
            if( (isAutoGenCRM.equals("false")) && (isAutoGenNNTM .equals("false")) ) {
			   isAutoGenCRM = "";
			}
			else{
			   isAutoGenCRM = "true";
			}
			/* NNTM Changes End*/
			cData.add(new NameValue("entityCreflg", entityCreflg));
            // NRE Changes shanmuga in edit mode
			cData.add(new NameValue("PassportId", PassportId));
			cData.add(new NameValue("PassportPlace", PassportPlace));
			cData.add(new NameValue("PassportIdate", PassportIdate));
			cData.add(new NameValue("PassportVdate", PassportVdate));
			cData.add(new NameValue("IntroPrefLocale", IntroPrefLocale));
			/* Ticket id 207511 changes start */
			cData.add(new NameValue("entityDocumentBO_Name","EntityDocumentBO"));
			/* Ticket id 207511 changes end */
			// NRE Changes shanmuga in edit mode

			/**Access Control Changes**/
			cData.add (new NameValue("bcID",priBCID));
			cData.add (new NameValue("bcCode",priBC));
			cData.add (new NameValue("priGrpID",priGrpID));
			cData.add (new NameValue("priSegName",priSegName));
			/**End of Changes**/

			if(isBranch){
				cData.add (new NameValue("bcName",priBCName));
				cData.add (new NameValue("Cat_bcName",catBCName));
			}
			cData.add (new NameValue("MCRequired",IsMCCheckRequired));
			cData.add (new NameValue("mcJNDIFlag",mcJNDIFlag));
			cData.add (new NameValue("isMCEdited",isMCEdited));
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/

			//Changes for Alert server recon in 10.2.14 starts
			cData.add (new NameValue("isAlert2",bIsAlert));

	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
			//Changes for Alert server recon in 10.2.14 ends

            /* NNTM Changes Start*/
            cData.add (new NameValue("isAutoGenKey",isAutoGenCRM));
            /* NNTM Changes End*/

            /* Minor Age Changes: start */
			cData.add (new NameValue("MINOR_YEAR",MINOR_YEAR));
            /* Minor Age Changes: end */
            //Senior Starts
			cData.add (new NameValue("SENIOR_YEAR",SENIOR_YEAR));
		//Senior Ends
            if(isReadOnly!=null && !isReadOnly.equals("")){
                cData.add (new NameValue("IsReadOnly",isReadOnly));
            }
			/* COPY CHANGES : START */
			if(isCopy!=null && !isCopy.equals("")){
				cData.add (new NameValue("IsCopy",isCopy));
			}
			/* COPY CHANGES : END */
            /*Pass a variable for the new Entry : Otherrelationship */
            if(accountID > 0){
                cData.add (new NameValue("NewEntry","N"));
            }

			 cData.add (new NameValue("flagRelType",flagRelType));
			//Changes for call id 348199 STARTS
			  cData.add (new NameValue("flagRelType1",flagRelType1));
			//Changes for call id 348199 ENDS
			 /*doc recieved changes-begin*/
			 cData.add (new NameValue("docRecvd",docRecvd));
			 /*doc recieved changes-end*/
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 starts
			 cData.add (new NameValue("DefaultChannel_Alert",DefaultChannel_Alert));
			  cData.add (new NameValue("Enable_Alerts",Enable_Alerts));
			  cData.add (new NameValue("isAlert2",bIsAlert));
			  cData.add (new NameValue("PreferredMobileAlert_Type",PreferredMobileAlert_Type));

	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert Server Recon in 10.2.14 ends
			 /* Change for ticket 367607 starts */
			 cData.add(new NameValue("prefCode",prefCode));
			 /* Change for ticket 367607 ends */
// Recon of Change for call 391057 start 
			  cData.add(new NameValue("hidprefCode",hidprefCode));	
// Recon of Change for call 391057 end 	
			 /* ***** Tracker# 97236 CIF - Ebanking changes : Start ***** */
			 cData.add (new NameValue("isSMSBanking",isSMSBanking));
			 cData.add (new NameValue("isWAPBanking",isWAPBanking));
			 /* ***** Tracker# 97236 CIF - Ebanking changes : Start ***** */
			 /*CORE Fields Inclusion :start*/
			  cData.add (new NameValue("purgeFlag",purgeFlag));
			  cData.add (new NameValue("tfpartyFlag",tfpartyFlag));
			//Changes for Tracker id: 361921 starts
			  cData.add (new NameValue("Constitution_Code",constitution_code));
			//Changes for Tracker id: 361921 ends

			  //Changes for Tracker id:355038starts
			  cData.add (new NameValue("Sector",sector_code));
			  cData.add (new NameValue("Subsector",subsector_code));
			  //Changes for Tracker id:355038starts
			 /*CORE Fields Inclusion :end*/

			  //Chaneg for card_holder :Start
			  cData.add (new NameValue("card_holder",card_holder));
			  //Chaneg for card_holder :End

			  /*TRACKER ID 113276 CHANGES BEGIN FOR BUG FIXING*/
			  //Set the default value of logged in user in a variable
			  cData.add (new NameValue("rCreatedBy",rCreatedBy));
			  /*TRACKER ID 113276 CHANGES END*/

			/* *** Tracker# 49738, Begin of Changes *** */
			if (accMgr != null)   cData.add (new NameValue("Acc_manager", accMgr));
			 /*Added by Ramsurendar*/
			 if (secMgr != null)   cData.add (new NameValue("Sec_manager", secMgr));
			 if (terMgr != null)   cData.add (new NameValue("Ter_manager", terMgr));
			 /*Added by Ramsurendar*/

			if (relMgr != null)   cData.add (new NameValue("RelationshipMgr", relMgr));
			if (relCreat != null) cData.add (new NameValue("RelationshipCreatedBy", relCreat));
			/* *** Tracker# 49738, End of Changes *** */


            cData.add(new NameValue("AccountBO.ConcurDetect_X", concurDetex));
			cData.add (new NameValue("LastUpdateDate",strDate));
			//changes for callid 613314 starts
			cData.add(new NameValue("boDateCreated",boDateCreated));
			//changes for callid 613314 ends
            /* Fix for 244381 chages begin
             * Commenting the below code
            SRMCurrency currency = SRMCurrencyMgr.getBaseCurrency();
            String baseCurrency = currency.getSymbol();*/
            if(user_Locale!=null) {
				String baseCurrency = user_Locale.getCurrency().toString();
            	cData.add (new NameValue("BaseCurrency",baseCurrency));
              /* changes for call id 406159 recon of 402339 start*/
            	String BaseCurrency_Desc=CommonQueries.getLocaleCatValue(bc,"CURRENCY",baseCurrency);
            	cData.add (new NameValue("BaseCurrency_Desc",BaseCurrency_Desc));
                        /* changes for call id 406159 recon of 402339 start*/
			}
            cData.add (new NameValue("boName","AccountBO"));
            cData.add (new NameValue("boNameCI","CoreInterfaceBO"));
            cData.add (new NameValue("apprFlag",apprFlag));
			//Changes for tracker id 350214 Starts Here
			cData.add(new NameValue("Mgr", Mgr));
			cData.add(new NameValue("Charge", Charge));
			//Changes for tracker id 350214 Ends Here
		//Tracker ID 113276 currency changes start
		cData.add (new NameValue("boName2","PsychographicBO"));
		//Tracker ID 113276 currency changes start

            /************Save & Submit Change: Start*****************/
            cData.add (new NameValue("operationType",operationType));
            /************Save & Submit Change: Ends*****************/
           /* Changes done by Kanika for Cif Deceased starts */
     		cData.add (new NameValue("creFlag",strCreFlag));
     		/* Changes done by Kanika for Cif Deceased ends */
			/************CIF LOS Bypass change:Start*****************/
			cData.add (new NameValue("byPassFlag",byPassFlag));
            /************CIF LOS Bypass change:end*****************/
			cData.add (new NameValue("INTRO_DATE_VALIDATE",INTRO_DATE_VALIDATE));
			// CRM GroupHouseHold Changes Start

			cData.add(new NameValue("GlobalRM", strGlobalRM));
			// CRM HouseHold Changes End
			/* CIF PhoneEmail Changes : Start */
			cData.add(new NameValue("preferredAddressType",preferredAddressType));
			cData.add(new NameValue("preferredPhone",preferredPhone));
			cData.add(new NameValue("preferredEmail",preferredEmail));


			cData.add(new NameValue("LastUpdate_Date",LastUpdate_Date));
			/* CIF PhoneEmail Changes : End*/

			cData.add(new NameValue("defAddress",defAddress));
			//changes for callID 734881 starts
			cData.add(new NameValue("defAddress_Value",defAddress_Value));
			//changes for callID 734881 ends
		/* ERPBOCF1:Minor To Major Conversion changes starts*/
			cData.add(new NameValue("CONV_CALENDAR_TYPE",strConvCalendarType));
			cData.add(new NameValue("ALTCALENDAR_TYPE",strAltCalendarType));
		/* ERPBOCF1:Minor To Major Conversion changes ends*/
		//changes for call id 200023 Ticket: 408152 tracker: 248155 start
			cData.add(new NameValue("countryOfInst",countryOfInst));
		//changes for call id 200023 Ticket: 408152 tracker: 248155 ends

	/**Access Control Changes**/
			cData.add (new NameValue("bcID",priBCID));
			cData.add (new NameValue("bcCode",priBC));
			cData.add (new NameValue("priGrpID",priGrpID));
			cData.add (new NameValue("priSegName",priSegName));
	/**End of Changes**/
			//Tracker No 97042 begin
            cData.add(new NameValue("segmentValues", segmentValues));
            cData.add(new NameValue("segmentRating", segmentRating));
			//Changes starts for TrackerID:235202
			String strSessionCal = sc.getSessionCalendarType();
			cData.add(new NameValue("strSessionCalType",strSessionCal));
			//Changes ends for TrackerID:235202
			//TrackerID:234910 changes starts
			cData.add(new NameValue("code_chargeCode", chargeLevelCode));
			cData.add(new NameValue("serviceLevelCode", serviceLevelCode));
		    cData.add(new NameValue("chargeCode", chargeLevelLang));
			//TrackerID:234910 changes ends
			//changes for tracker 356432 starts
		    cData.add(new NameValue("Custtypecode",CustTCode));
		    cData.add(new NameValue("Custtypelang",custTypeLang));

		    cData.add(new NameValue("CusStatCode",CustStatCode));
		    cData.add(new NameValue("cusStatLang",custStatLang));

		    cData.add(new NameValue("CCode",ConCode));
		    cData.add(new NameValue("CLang",constLang));
			//changes for tracker 356432 ends
            cData.add(new NameValue("subSegmentValues", subSegmentValues));
            cData.add(new NameValue("subSegmentCodeVal", subSegmentCodeVal));
			cData.add(new NameValue("ratingValues", ratingValues));
						//Changes for tracker id: 333740 starts
						cData.add(new NameValue("Segmentation_Class", Segmentation_Class));
						//Changes for tracker id: 333740 ends
						//Changes for tracker id: 333741 starts
						cData.add(new NameValue("Tds_tbl", Tds_tbl));
						//Changes for tracker id: 333741 ends

			//Tracker No 97042 end
			// vasanth's changes start
			CifDetUtils.addBSNFlags(cData,req);
			// vasanth's changes end


			/*Fix for Tracker #: SIDDHARTH Starts*/

		/* Commented as part of SPE Tuning

			ArrayList AccDOB = new ArrayList();
			AccDOB.add(AccountBO.CUST_DOB);
			SRMQueryBuilder qbAcc	= QueryAssist.singleObjectQuery("AccountBO", AccountBO.ACCOUNTID,DOB_CUST);
			QueryAssist.selectAttr( qbAcc, "AccountBO", AccDOB );
			QueryAssist.addSimpleCondition(qbAcc,"AccountBO",AccountBO.ACCOUNTID,IQuery.ComparisonOperation_EQ,""+accountID);
			SRMQueryResult qrAcc	= qbAcc.runQuery(bc, false, -1, java.sql.Connection.TRANSACTION_READ_UNCOMMITTED );
			SRMRecordSet rsAcc = qrAcc.getRecordSet();
			ArrayList dobVal = new ArrayList();
			java.util.Date dob = null;
			String drpYear = null;
			SRMFormatter srmf = sc.getFormatter();
			try
			{
				while(rsAcc.hasNext())
				{
					dobVal = (ArrayList)rsAcc.getNext();
					dob = (java.util.Date) dobVal.get(0);
				}
				String dobStr = srmf.dateToString(dob);
				drpYear = dobStr.substring(dobStr.lastIndexOf("/")+1);
			}
			catch(Exception e)
			{
				throw e;
			}

			Commented as part of SPE Tuning */

			cData.add (new NameValue("drpYear",drpYear));
			// changes for tracker id :253845 Start
						if(convType.equalsIgnoreCase("NonCustomer"))
						{
							cData.add (new NameValue("drpMonth",drpMonth));
							cData.add (new NameValue("drpDay",drpDay));
						}
			// changes for tracker id :253845 End
     		/*String localeType = null ;
			try
			{
				Properties prop1 = EditorUtil.getBusinessRulesInfo();
				localeType 	   = prop1.getProperty(EditorUtil.LOCALE_TYPE).toString();
			}
			catch(Exception e)
			{
				throw e;
			}
			String str = localeType.substring(0,localeType.indexOf(","));
			String str1 = localeType.substring(localeType.indexOf(",")+1);
			Locale local = new Locale(str,str1);*/
			Calendar cal =  Calendar.getInstance(locale);
			int year = cal.get(Calendar.YEAR);
			int mon  = cal.get(Calendar.MONTH);
			int day  = cal.get(Calendar.DATE);
			/* Changes for tracker id 176986 begins */
			String dtMinor = (mon+1)+"/"+day+"/"+year;
			/* Changes for tracker id 176986 ends */
			cData.add (new NameValue("dtMinor",dtMinor));
			/*Begin of changes for tracker 131243 by sneha kaul  - BANKID - */
			cData.add (new NameValue("bank_id",strBank_id));
			/*End of changes for tracker 131243 by sneha kaul  - BANKID - */

			/*Fix for Tracker #: SIDDHARTH Ends*/

			/* Fix for ticket id 624014 start*/
			String sSecurKey = req.getParameter("SECUREHKEY");
			String sFldHashkey = req.getParameter("FLDHASHKEY");
			cData.add (new NameValue("HASHKEY", sSecurKey));
			cData.add (new NameValue("FLDHASHKEY", sFldHashkey));
			/* Fix for ticket id 624014 start*/

			// changes for tracker id :253845 Start
			            /* *****      Tracker ID:142437       ***** */
			            cData.add(new NameValue("convToCust", convToCust));
						cData.add(new NameValue("oldEntityType", convType));
						cData.add(new NameValue("oldEntityID", entityID));
						cData.add(new NameValue("primaryIntroExists", primaryIntroExists));
			            /* *****      Tracker ID:142437       ***** */
			// changes for tracker id :253845 End
			// Fix for Ticket ID 286386
			cData = CifQueries.CifConfigurator(cData,bc);
			// Fix for Ticket ID 286386
			/**Fix for 811198 - reverting the changes done for 735702**/
            Xmlassist.setUserData ("CustomData", cData);
			/**Fix for 811198 - reverting the changes done for 735702**/
            Xmlassist.setSessionContext(sc);

            //Access Control changes
			if(null != bc)
			{
			String operation = bc.getOperation();
			if(null != operation && operation.equals("READ_CHECK"))
			{
			bc.setOperation("READ_DENIED");
			}
        	}
			  //Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
			  if(strAcrossSearch!=null && !(strAcrossSearch.equalsIgnoreCase("null"))){
					 if(strAcrossSearch.equalsIgnoreCase("Y")){
						  com.infy.cis.common.SRMTLVar.sAcrossFlag.set("Y");
					 }
		      }
              //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra
         /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
	//Alert server 10.2.14 starts
		SRMQueryResult defaultChannel_Alert1 = Category.findCategory("DEFAULTCHANNEL_ALERT",bc);

		Xmlassist.addDataChoices( "AccountBO.DefaultChannel_Alert",
			                                    defaultChannel_Alert1,
			                                    CategoryBO.CATEGORY_LANG_CAT_VAL,
                                    CategoryBO.VALUE);



	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
	//Alert server 10.2.14 ends

        /* Fix for ticket id 418104 - Begin*/
		CallHook(req, bc, Xmlassist);
		/* Fix for ticket id 418104 - End*/
            XML xmlFile =   Xmlassist.getXmlDocument();
            // changes for tracker id :253845 Start

						/* *****      Tracker ID:142437        ***** */
						if(convToCust.equals("Y")){
								String chkXML = xmlFile.toString();

							if(convType.equalsIgnoreCase("Prospect")){

								chkXML = ConversionHelper.replaceAttribsForSuspect(chkXML);
								xmlFile.setChangeXMLFromDet();
								xmlFile.setChangedXML(chkXML);

							}else if(convType.equalsIgnoreCase("Contact")){

								chkXML = ConversionHelper.replaceAttribsForContact(chkXML);
					 			xmlFile.setChangeXMLFromDet();
								xmlFile.setChangedXML(chkXML);

							}else if(convType.equalsIgnoreCase("NonCustomer")){

								chkXML = ConversionHelper.replaceAttribsForNonCust(chkXML);

								xmlFile.setChangeXMLFromDet();
								xmlFile.setChangedXML(chkXML);

							}
						}/* End of IF convToCust */
						/* *****      Tracker ID:142437        ***** */



  // changes for tracker id :253845 End
			/*Fix for Tracker #: SIDDHARTH Starts*/
//            Calendar cal =  Calendar.getInstance();
//            cal.setTime(new java.util.Date());
			/*Fix for Tracker #: SIDDHARTH Ends*/
//            locale = sc.getSessionLocale();


// For Caching view, following 3 line3 commented
//            Xmlassist.addCustomChoices (XMLUtils.getYear("AccountBO.Birth_Year",cal.get(Calendar.YEAR)-150,cal.get(Calendar.YEAR)));
//            Xmlassist.addCustomChoices (XMLUtils.getMonth(locale,"AccountBO.Birth_Month"));
//            Xmlassist.addCustomChoices (XMLUtils.getDay("AccountBO.Birth_Day"));

// For Caching view, following 3 lines added
			List nvalues = new ArrayList();
			nvalues.add("viewname");
	    	nvalues.add(viewName);
			nvalues.add("fileName2");
		    nvalues.add(view.getFileName());
			nvalues.add("fileName3");
		    nvalues.add(viewIDforPhoneEmail.getFileName());

		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES start
		nvalues.add("fileNameID");
		nvalues.add(viewEdoc.getFileName());
		//Tracker ID 113276 IDENTIFICATION DOCUMENT CHANGES end
//Changes for 413958 and recon of call id 411963 reopen call starts
//Changes for call id:425507 and recon of call id 413599 starts
viewGrp = ConfigManager.getInstance().findView(ViewNames.CUSTLISTOFGROUP,bc);
viewID2 = ConfigManager.getInstance().findView(ViewNames.LIST_OF_HOUSEHOLD, bc);	
//Changes for call id:425507 and recon of call id 413599 ends	   
//Changes for 413958 and recon of call id 411963 reopen call ends
// CRM101UB changes:Tracker:110963:begin
			nvalues.add("fileName4");
		    nvalues.add(viewGrp.getFileName());
            // Added for call id: 413958 and recon of call id 411963 starts
			//Changes for call id:425507 and recon of call id 413599 starts
		   nvalues.add("fileName5");
		    nvalues.add(viewID2.getFileName());
			//Changes for call id:425507 and recon of call id 413599 ends
		    // Added for call id:413958 and recon of call id  411963 ends
// CRM101UB changes:Tracker:110963:end
// For Caching view, following 1 line changed: nvalues need to be passed
		/*ERPBOCF1:TRACKER:113259:BEGIN OF CHANGES(HIJRI CALENDAR SUPPORT)*/
		    try
			{	
		    	callAccount_detHook("callPopulateNVVlaues",bc,req,nvalues);
			}
			catch(Exception e){
				WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
			}	
		  
		XSLAssist.translate (locale,  xmlFile,xslFileName, xslFilePath, nvalues, out,true,convToCust.equalsIgnoreCase("Y"));

		/*ERPBOCF1:TRACKER:113259:END OF CHANGES(HIJRI CALENDAR SUPPORT)*/
//Tracker ID: 113066 Begin of changes for across Entity Copy by Amit Malhotra
             com.infy.cis.common.SRMTLVar.sAcrossFlag.set("N");
            //Utils.sAcross = "N";
 //Tracker ID: 113066 End of changes for across Entity Copy by Amit Malhotra



    }//end of service method
// CIF Group HouseHold Changes : Start
		/* Fix for ticket id 418104 - Begin*/
		public void CallHook(HttpServletRequest req, SRMBusinessContext bc, XMLFormAssist Xmlassist) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	    {
			String strClassName = this.getClass().getName()+"Hook";
			int subStr = strClassName.lastIndexOf(".");
			String strClass = "com.infy.cis.custom"+strClassName.substring(subStr);

			Class c1  = null;
			Object ob = null;
			Method m = null;

			try
			{
				c1  = Class.forName(strClass);
				ob = c1.newInstance();
				m = c1.getMethod("populateData", new Class[]{SRMBusinessContext.class,XMLFormAssist.class,HttpServletRequest.class});
				m.invoke(ob, new Object[]{bc,Xmlassist,req});

			}
			catch(ClassNotFoundException cfe)
			{
					//nme.printStackTrace();
			}
			catch(NoSuchMethodException nme)
			{
					//nme.printStackTrace();
			}
			catch(InvocationTargetException ite)
			{
					//ite.printStackTrace();
			}
		}
	/* Fix for ticket id 418104 - End*/
	public String getCSVforList(SRMRecordSet RMRecordSet){

		String retVal = "";
		StringBuilder strVal = new StringBuilder("");
		int tmpCnt = 0;
		while(RMRecordSet.hasNext()){
			if(tmpCnt == 0) {
				tmpCnt  = 1;
				retVal = (String)RMRecordSet.getNext().get(0);
				strVal.append(retVal);
			} else {

				//retVal = retVal + "," + RMRecordSet.getNext().get(0);
				strVal.append(",").append(RMRecordSet.getNext().get(0));
			}
		}
		retVal = strVal.toString();
		return retVal;
	}
	/* Change for 374326 and 374328 start */
	public String getPreferredLocaleValue(int accountID, SRMBusinessContext bc) throws  Exception
	{
		ArrayList attr1 = new ArrayList();
		SRMQueryBuilder qbuilder = QueryAssist.singleObjectQuery("PsychographicBO",PsychographicBO.ACCOUNTID);
		QueryAssist.addSimpleCondition(qbuilder,"PsychographicBO",PsychographicBO.ACCOUNTID,IQuery.ComparisonOperation_EQ,accountID);
		attr1.add(PsychographicBO.PREFERRED_LOCALE);
		QueryAssist.selectAttr(qbuilder,"PsychographicBO",attr1);
		SRMQueryResult qresult = qbuilder.runQuery(bc,-1);
		SRMRecordSet psychoRecSet = qresult.getRecordSet();
		attr1 = (ArrayList)psychoRecSet.getNext();
		/*Changes for tracker id 235472:Start*/
		String strLocale = null;
		if(attr1.get(0)!=null){
			strLocale = attr1.get(0).toString();
		}
		/*Changes for tracker id 235472:End*/
		return strLocale;
	}
	/* Change for 374326 and 374328 end */
// CIF Group HouseHold Changes : End
// changes for tracker id :253845 Start
private void setPhoneEmailRecordSuspect(SRMBusinessContext bc,String strlocale,String entityID,XMLFormAssist Xmlassist) throws Exception
{



			SRMQueryResult qrCorporatePhEmail = null;
			ArrayList phEmailAttrList = new ArrayList();

			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONEEMAILID));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_EMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONENO));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONEOREMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONEEMAILTYPE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"CategoryBO",CategoryBO.CATEGORY_LANG_CAT_VAL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONENOCOUNTRYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONENOCITYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_PHONENOLOCALCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"SuspectBO",SuspectBO.PHONEEMAIL_WORKEXTENSION));

			SRMQueryBuilder qbCorporatePhEmail = new SRMQueryBuilder () ;
			QueryAssist.addJoin(qbCorporatePhEmail, "SuspectBO", SuspectBO.ACCOUNTID, "SuspectBO", SuspectBO.ACCOUNTID, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "SuspectBO", SuspectBO.PHONEEMAIL_PHONEEMAILTYPE, "CategoryBO", CategoryBO.VALUE, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORYID, "CategoryBO", CategoryBO.CATEGORYID, IQuery.JoinType_Equi);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "SuspectBO", SuspectBO.SUSPECTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORY_LANG_LANG_CODE, IQuery.ComparisonOperation_EQ, strlocale);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO",CategoryBO.CATEGORYTYPE,
                    IQuery.ComparisonOperation_IN, arrphEmlTypeList);

			int phEmailNoOfAttrs = phEmailAttrList.size();
			for (int i=0; i<phEmailNoOfAttrs; i++) {
					 qbCorporatePhEmail.addAttribScope((TransFormFn) phEmailAttrList.get(i));
			}
			qbCorporatePhEmail.setDistinct(true);
			qrCorporatePhEmail = qbCorporatePhEmail.runQuery(bc,-1);

			SRMRecordSet phEmailRecordSet = qrCorporatePhEmail.getRecordSet();

			if(phEmailRecordSet.hasNext()){
			if(phEmailRecordSet.getNext().get(0)!=null){
				phEmailRecordSet.resetIndex();
				 Xmlassist.setFormData(qrCorporatePhEmail,null,true,"Phone","PhoneEmailRecordSet");
			}
			}
		}

private void setPhoneEmailRecordContact(SRMBusinessContext bc,String strlocale,String entityID,XMLFormAssist Xmlassist) throws Exception
{



			SRMQueryResult qrCorporatePhEmail = null;
			ArrayList phEmailAttrList = new ArrayList();

			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONEEMAILID));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_EMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONENO));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONEOREMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONEEMAILTYPE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"CategoryBO",CategoryBO.CATEGORY_LANG_CAT_VAL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONENOCOUNTRYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONENOCITYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_PHONENOLOCALCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"ContactBO",ContactBO.PHONEEMAIL_WORKEXTENSION));

			SRMQueryBuilder qbCorporatePhEmail = new SRMQueryBuilder () ;
			QueryAssist.addJoin(qbCorporatePhEmail, "ContactBO", ContactBO.ACCOUNTID, "ContactBO", ContactBO.ACCOUNTID, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "ContactBO", ContactBO.PHONEEMAIL_PHONEEMAILTYPE, "CategoryBO", CategoryBO.VALUE, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORYID, "CategoryBO", CategoryBO.CATEGORYID, IQuery.JoinType_Equi);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "ContactBO", ContactBO.CONTACTID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORY_LANG_LANG_CODE, IQuery.ComparisonOperation_EQ, strlocale);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO",CategoryBO.CATEGORYTYPE,
                    IQuery.ComparisonOperation_IN, arrphEmlTypeList);

			int phEmailNoOfAttrs = phEmailAttrList.size();
			for (int i=0; i<phEmailNoOfAttrs; i++) {
					 qbCorporatePhEmail.addAttribScope((TransFormFn) phEmailAttrList.get(i));
			}
			qbCorporatePhEmail.setDistinct(true);
			qrCorporatePhEmail = qbCorporatePhEmail.runQuery(bc,-1);

			SRMRecordSet phEmailRecordSet = qrCorporatePhEmail.getRecordSet();

			if(phEmailRecordSet.hasNext()){
			if(phEmailRecordSet.getNext().get(0)!=null){
				phEmailRecordSet.resetIndex();
				 Xmlassist.setFormData(qrCorporatePhEmail,null,true,"Phone","PhoneEmailRecordSet");
			}
			}
		}
private void setPhoneEmailRecordNonCust(SRMBusinessContext bc,String strlocale,String entityID,XMLFormAssist Xmlassist) throws Exception
{



			SRMQueryResult qrCorporatePhEmail = null;
			ArrayList phEmailAttrList = new ArrayList();

			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONEEMAILID));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_EMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONENO));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONEOREMAIL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONEEMAILTYPE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"CategoryBO",CategoryBO.CATEGORY_LANG_CAT_VAL));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONENOCOUNTRYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONENOCITYCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_PHONENOLOCALCODE));
			phEmailAttrList.add(QueryAssist.getTransformFn(true,"NonCustomerBO",NonCustomerBO.PHONEEMAIL_WORKEXTENSION));

			SRMQueryBuilder qbCorporatePhEmail = new SRMQueryBuilder () ;
			QueryAssist.addJoin(qbCorporatePhEmail, "NonCustomerBO", NonCustomerBO.NONCUSTOMERID, "NonCustomerBO", NonCustomerBO.NONCUSTOMERID, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "NonCustomerBO", NonCustomerBO.PHONEEMAIL_PHONEEMAILTYPE, "CategoryBO", CategoryBO.VALUE, IQuery.JoinType_Equi);
			QueryAssist.addJoin(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORYID, "CategoryBO", CategoryBO.CATEGORYID, IQuery.JoinType_Equi);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "NonCustomerBO", NonCustomerBO.NONCUSTOMERID, IQuery.ComparisonOperation_EQ, new Integer(entityID));
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO", CategoryBO.CATEGORY_LANG_LANG_CODE, IQuery.ComparisonOperation_EQ, strlocale);
			QueryAssist.addSimpleCondition(qbCorporatePhEmail, "CategoryBO",CategoryBO.CATEGORYTYPE,
                    IQuery.ComparisonOperation_IN, arrphEmlTypeList);


			int phEmailNoOfAttrs = phEmailAttrList.size();
			for (int i=0; i<phEmailNoOfAttrs; i++) {
					 qbCorporatePhEmail.addAttribScope((TransFormFn) phEmailAttrList.get(i));
			}
			qbCorporatePhEmail.setDistinct(true);
			qrCorporatePhEmail = qbCorporatePhEmail.runQuery(bc,-1);

			SRMRecordSet phEmailRecordSet = qrCorporatePhEmail.getRecordSet();

			if(phEmailRecordSet.hasNext()){
			if(phEmailRecordSet.getNext().get(0)!=null){
				phEmailRecordSet.resetIndex();
				 Xmlassist.setFormData(qrCorporatePhEmail,null,true,"Phone","PhoneEmailRecordSet");
			}
			}
		}

private void setCurrencyRecord(SRMBusinessContext bc,String Type,String entityID,XMLFormAssist Xmlassist) throws Exception
{

				/* CIF Changes - Currency Details :start*/

					ArrayList CurrencyAttr = new ArrayList();
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_MISCELLANEOUSID);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_STRTEXT10);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT1);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT2);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT3);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DBFLOAT4);
					CurrencyAttr.add( PsychographicBO.MISCELLANEOUSINFO_DTDATE1);


					String ttParentType = "CURRENCY";
					String CompID = "PsychographicBO.ACCOUNTID";


					if(Type.equals("Account")) {
						CompID = PsychographicBO.ACCOUNTID;
					}
					else if(Type.equals("Contact")){
						CompID = PsychographicBO.CONTACTID;
					}
					else if(Type.equals("Prospect")){
						CompID = PsychographicBO.SUSPECTID;

					}
					int idval =0;
					if(entityID !=null && !entityID.equals(""))
					{
						idval=new Integer(entityID).intValue();
					}


					SRMQueryResult qr_CurrencyDet = CommonQueries.getCurrencyDetInfo(bc,
							idval,
							CurrencyAttr,
							ttParentType,
							CompID
					);
					SRMRecordSet rs_CurrencyDet = qr_CurrencyDet.getRecordSet();
					rs_CurrencyDet.resetIndex();
					Xmlassist.setFormData(qr_CurrencyDet, null, true, "CurrencyDetInfo","CurrencyDetRecordSet");


				/* CIF Changes - Currency Details :end*/
			}


private void setEdocRecord(SRMBusinessContext bc,String Type,String entityID,XMLFormAssist Xmlassist) throws Exception

{
			SRMQueryResult qrEDoc = null;
			if(Type.equals("Account"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + entityID, "CIFRetCust", bc);
			}
			else if(Type.equals("Contact"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + entityID, "CIFRetCont", bc);
			}
			else if(Type.equals("Prospect"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + entityID, "CIFRetPros", bc);
			}
			else if(Type.equals("NonCustomer"))
			{
				qrEDoc = Utils.getEDocRecordSet("" + entityID, "CIFRetNonCust", bc);
			}

			Xmlassist.setFormData(qrEDoc, null, true, "EntityDocument" ,"EDocRecordSet");
	}

	//Changes for TOL# 258707 starts
	/* Function written to convert date. This code is moved from line number
	1202 to 1217 and a new funciton is created as the same code is required
	at multiple places */
	private String fnDateConver(String strCurrencyDate) throws Exception
	{
		ArrayList arrReturn = new ArrayList();
		ArrayList arrDate = new ArrayList();
		/*Fix for Ticket ID - 799727 Start*/
		if( strCurrencyDate!=null){
		StringTokenizer tok = new StringTokenizer(strCurrencyDate,  " ");
		while (tok.hasMoreElements()) {
			arrReturn.add(tok.nextElement().toString());
		}
		String strDate1 = arrReturn.get(0).toString();
		StringTokenizer tok1 = new StringTokenizer(strDate1,  "-");
		while (tok1.hasMoreElements()) {
			arrDate.add(tok1.nextElement().toString());
		}
		StringBuilder strbCurrDate = new StringBuilder(arrDate.get(2).toString()).append("/").append(arrDate.get(1).toString())
					 .append("/").append(arrDate.get(0).toString());
		strCurrencyDate = strbCurrDate.toString();
	}
			/*Fix for Ticket ID - 799727 End*/
		return strCurrencyDate;
	}
	//Changes for TOL# 258707 ends
  // changes for tracker id :253845 End
	//Changes for Tracker id: 347074 starts
  private String getCategoryValue(String solId,String categoryType,SRMBusinessContext bc) throws Exception{
  	String strValue = null;
  		String QB_CATEGORYID = "com_infy_cis_ui_cif_BlackListEntity_Det_CategoryID";
  			SRMQueryBuilder qbCategory = new SRMQueryBuilder(QB_CATEGORYID);
  		qbCategory = QueryAssist.singleObjectQuery("CategoryBO",
  			  CategoryBO.CATEGORYID);
  		QueryAssist.addSimpleCondition(qbCategory,"CategoryBO",
  					CategoryBO.VALUE,
  					IQuery.ComparisonOperation_EQ,
  					""+solId
  					);
  					QueryAssist.addSimpleCondition(qbCategory,
  									"CategoryBO",
  									CategoryBO.CATEGORYTYPE,
  									IQuery.ComparisonOperation_EQ,
  									categoryType
  					);
  					ArrayList attrList11=new ArrayList();
  					attrList11.add(QueryAssist.getTransformFn(true,"CategoryBO",CategoryBO.CATEGORY_LANG_CAT_VAL));
  					qbCategory.addAttribScope((TransFormFn) attrList11.get(0));
  					SRMQueryResult qrCategory = qbCategory.runQuery(bc,true, -1);
  					SRMRecordSet rsCategory = qrCategory.getRecordSet();
  					List ls11 = null;

  					if(rsCategory != null && rsCategory.hasNext())
  					{
  						ls11 = rsCategory.getNext();
  					}

  					if (ls11 != null && ls11.get(0) != null) {
  						strValue = ls11.get(0).toString();
  					}
  			return strValue;

}
//Changes for Tracker id: 347074 ends
  public void callAccount_detHook(String methodName,SRMBusinessContext bc, HttpServletRequest req,List nvalues) 
		    throws ClassNotFoundException, WriterHookException, Exception 
	{
		
		ConcurrentHashMap hookParams = new ConcurrentHashMap();
		hookParams.put("Request", req);
		hookParams.put("nvalues", nvalues);
		Utils.invokeHook(HOOK_CUSTOM, methodName,"Account_det", hookParams, bc);	
		
	}
 } //end of class Account_det.java



























