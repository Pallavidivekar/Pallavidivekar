/******************************************************************************
 * Copyright (c) 2000-2005 Infosys Ltd.  All rights reserved.acctKey
 *
 * $Workfile: AccWriter.java $
 *
 * Author: Dalip Singh
 *
 * $Archive: /FCRM62BASE/com/infy/cis/ui/common/AccWriter.java $
 *
 * $History: AccWriter.java $
 ********************  Version 43  *********************
 * User: Vikas Gaba Date: 03/08/07    Time: 4:31p
 * Updated in: $/CRM100_BASELINE/com/infy/cis/ui/common
 * Project Code: ERPBOCF1

 * Comment:  CIF Usability
 *
 * Modified by: Vikas Gaba
 * Reviewed by:
 ********************  Version 42  *********************
 * User: Tarun Bajaj Date: 10/07/07    Time: 3:30p
 * Updated in: $/CRM100_BASELINE/com/infy/cis/ui/common
 * Project Code: ERPBOCF1

 * Comment:  CIF Addition of fields
 *
 * Modified by: Tarun Bajaj
 * Reviewed by:
 ********************  Version 41  *********************
 * User: Suman Kumar Date: 06/03/05    Time: 3:30p
 * Updated in: $/CRM70/com/infy/cis/ui/common
 * Project Code: CRM70CIF
 *
 * Comment:  Saving Demo Field in Accounts
 *
 * Modified by: Suman Kumar
 * Reviewed by: Ruchika Mittal
 ********************  Version 40  *********************
 * User: Sureshanand_m Date: 05/10/05    Time: 3:30p
 * Updated in: $/CRM70/com/infy/cis/ui/common
 * Project Code: CRM70CIF
 *
 * Comment:  CORE-CIF Approval Changes
 *
 * Modified by: Suresh Anand M.
 * Reviewed by:
 * *****************  Version 39  ***************
 * User: Tessa Paul  Date: 05/02/05    Time: 3:21p
 * Updated in $/CRM70/com/infy/cis/ui/common
 *
 * Modified by : Tessa Paul
 * Reviewed by :Deepu Prasad
 * Comments    :Inclusion of CoreInterface Table fields
 *
 * *****************  Version 38  ***************
 * User: Tessa Paul  Date: 04/26/05    Time: 3:21p
 * Updated in $/CRM70/com/infy/cis/ui/common
 *
 * Modified by : Tessa Paul
 * Reviewed by :Deepu Prasad
 * Comments : CORE Fields Inclusion
 *
 * *****************  Version 37  ***************
 * User: Suman Kumar  Date: 04/04/05    Time: 3:21p
 * Updated in $/CRM70/com/infy/cis/ui/common
 *
 * Modified by : Suman Kumar
 * Reviewed by :Ruchika Mittal
 * Comments : Saving Full Name in Address
 *
 * *****************  Version 36  ***************
 * User: Suman Kumar  Date: 3/29/05    Time: 3:21p
 * Updated in $/CRM70/com/infy/cis/ui/common
 *
 * Modified by : Suman Kumar
 * Reviewed by :Ruchika Mittal
 * Comments : Address cleanup
 *
 * *****************  Version 35  ***************
 * User: CT.Venkatachalam  Date: 3/22/05    Time: 3:21p
 * Updated in $/CRM70/com/infy/cis/ui/common
 *
 * Modified by : CT.Venkatachalam
 * Reviewed by :
 * Comments : Changes for checking the CIF IDs
 *	for all the entities before saving
 *
 ********************  Version 34  **************
 * User: Suman Kumar Date: 02/07/05    Time: 5:47p
 * Updated in
 * Project Code: CRM70CIF
 *
 * Changes: Related to Approval
 *
 * Reviewed by:
 *****************  Version 33  *****************
 * User: Suresh Anand M. Date: 12/15/04  Time: 11:21a
 * Updated in $/CRM70CIF/com/infy/cis/ui/common
 *
 * Changes:
 * Added save logic for the newly added fields
 *
 * *****************  Version 32  *****************
 * User: 210598       Date: 4/27/04    Time: 3:21p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker ID: 63926
 * Modified by : Jayanthi
 * Reviewed by : Nixon
 * Comments : Zip field was trimmed
 *
 * *****************  Version 31  *****************
 * User: 210598       Date: 4/16/04    Time: 12:27p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker : 63491
 * Modified by : Jayanthi
 * Reviewed by : Nixon
 * Comments : Added a variable for retrieving accountkey so Custid will be
 * displayed on saving while creating a new customer
 *
 * *****************  Version 30  *****************
 * User: Aniketp_chhatre Date: 1/30/04    Time: 11:19a
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Made provision to save the newly added fields in BO to write to
 * database for customization purpose
 *
 * *****************  Version 29  *****************
 * User: Vinayashri_a Date: 5/01/04    Time: 5:18p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker ID : 60803
 *
 * Changes:
 * Added save logic for the newly added field Priority Code
 *
 * Modified By:
 * Vinayashri
 *
 * Reviewed By:
 * Anand Mandil
 *
 * *****************  Version 28  *****************
 * User: Aniketp_chhatre Date: 1/02/04    Time: 12:07p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Null Pointer Exception problem is resolved
 *
 * *****************  Version 27  *****************
 * User: Pankaj_mhatre Date: 12/24/03   Time: 4:41p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker#60567
 * Changes:
 * Saving relationshipoffer1 and relationshipOffer2.
 *
 * *****************  Version 26  *****************
 * User: Raghavendren_b Date: 11/10/03   Time: 2:17p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * TrackerID: 58470
 * Changes:
 * Added DateOfBecomingNRE field.
 *
 * Modified By:
 * Raghavendren
 *
 * Reviewed By:
 * Priya M. Swarna
 *
 * *****************  Version 25  *****************
 * User: Shashikant_kale Date: 11/10/03   Time: 12:36p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker 59146
 *
 * *****************  Version 24  *****************
 * User: Aniketp_chhatre Date: 11/01/03   Time: 2:58p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * Tracker ID : 58471
 * Changes : Added code to set Domain of Document
 * Changes By : aniketp_chhatre
 *
 * *****************  Version 23  *****************
 * User: Raghavendren_b Date: 11/01/03   Time: 1:47p
 * Updated in $/FCRM62BASE/com/infy/cis/ui/common
 * TrackerID:58778
 * Changes:
 *      The MLUserFields value are obtained and set it into BO before
 * saving.
 *
 * Modified By:
 * Raghavendren
 *
 * Reviewed By:
 * Raghunath R.N.
 *
 * *****************  Version 22  *****************
 * User: Gayasb_moghal Date: 1/16/03    Time: 3:01p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Changes:
 * Saved SSN value into Accounts table.
 *
 * Modified By:
 * Raghavendren
 *
 * Reviewed By:
 * Moghal Gayas Baig.
 *
 * *****************  Version 21  *****************
 * User: Palani_munusamy Date: 1/11/03    Time: 9:44p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Tracker 47635
 *
 * -Palani
 *
 * *****************  Version 20  *****************
 * User: Vinayashri_a Date: 21/12/02   Time: 4:29p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
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
 * *****************  Version 19  *****************
 * User: Vinayashri_a Date: 20/12/02   Time: 4:29p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Defect : Observation- Customer was not saving
 *
 * Changes:
 * Added a validation so that exception do not occur while calling the
 * method .equalsIgnoreCase for LinkDLink changes
 *
 * Modified By:
 * vinayashri
 *
 * Reviewed By:
 * Gayas
 *
 * *****************  Version 18  *****************
 * User: 201324       Date: 12/18/02   Time: 7:04p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Tracker ID: CRM61LR
 * 44575
 *
 * Changes:
 * Added code for LinkDelink validation for  Customer selected from look
 * up
 *
 * Modified By:
 * Kavitha Jayapal
 *
 * Reviewed By:
 * Gayas Baig Moghal
 *
 * *****************  Version 17  *****************
 * User: 201324       Date: 12/18/02   Time: 6:57p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Tracker ID: CRM61LR
 * 44575
 *
 * Changes:
 * Added code for LinkDelink validation for  Customer selected from look
 * up
 *
 * Modified By:
 * Kavitha Jayapal
 *
 * Reviewed By:
 * Gayas Baig Moghal
 *
 * *****************  Version 16  *****************
 * User: Vinayashri_a Date: 16/12/02   Time: 5:00p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Radar Defect:ITPT
 *
 * Changes:
 * Added save function for DtDate1,2,3.
 *
 * Modified By:
 * Vinayashri
 *
 * Reviewed By:
 * Gayas
 *
 * *****************  Version 15  *****************
 * User: Siddhartha_s Date: 12/14/02   Time: 4:50p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Tracker:
 * 44577
 *
 * Changes:
 * Incorporated NCB requirements
 *
 * Modified By:
 * Siddhartha S
 *
 * Reviewed By:
 * Vinayashri
 *
 * *****************  Version 14  *****************
 * User: Vinayashri_a Date: 9/12/02    Time: 12:35p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * Radar Defect : ITPT
 *
 * Changes:
 * Fixed bug in saving the End Date in address
 *
 * Modified By:
 * Vinayashri
 *
 * Reviewed By:
 * Gayas
 *
 * *****************  Version 13  *****************
 * User: Manoj_chodankar Date: 12/05/02   Time: 5:34p
 * Updated in $/CRM61DEV/com/infy/cis/ui/common
 * CRM61SR:SRINBO :TRACKER# 44198
 *
 * Changes:
 * Changed code to pass accountID through allParam.
 *
 * Modified by :
 * Manoj Chodankar
 *
 * *****************  Version 17  *****************
 * User: Anand_mandil Date: 8/23/02    Time: 9:51a
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Tracker ID :
 * 42093
 *
 * Changed (DD/MM/YYYY) to (DD-MMM-YYYY).
 *
 * *****************  Version 16  *****************
 * User: Manoj_chodankar Date: 8/08/02    Time: 9:10p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Tracker ID : 41927
 *
 * Changed the Cust_DOB setting logic (previously it was saving in
 * MM/dd/yyyy now it saves in dd/MM/yyyy)
 *
 * *****************  Version 15  *****************
 * User: Vinayashri_a Date: 8/07/02    Time: 3:27p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Tracker ID: 41932
 *
 * Changes: Added logic to save "Designation"
 *
 * Reviewed By: Anand Mandil
 *
 * *****************  Version 14  *****************
 * User: Mahendra_aher Date: 6/26/02    Time: 10:49a
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Added condition to check the null values of startDate and end Date
 *
 * *****************  Version 13  *****************
 * User: Vinayashri_a Date: 6/22/02    Time: 3:12p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Added logic to pass last name and region to the save frame.
 *
 * Reviewed by Manoj
 *
 * *****************  Version 12  *****************
 * User: Manoj_chodankar Date: 21-06-02   Time: 5:53p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * checking null and empty condition for address line 3
 *
 * *****************  Version 11  *****************
 * User: Manoj_chodankar Date: 21-06-02   Time: 5:43p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Added code for saving address line3 startdate and enddate.
 *
 * *****************  Version 10  *****************
 * User: Palani_munusamy Date: 6/19/02    Time: 9:06p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * added new fields.
 *
 * *****************  Version 8  *****************
 * User: Anand_mandil Date: 6/14/02    Time: 5:28p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Added Supliment Field of DemographicBO.
 *
 *
 * *****************  Version 7  *****************
 * User: Palani_munusamy Date: 6/13/02    Time: 5:48p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Added logic for Customer, Contact and Suspects for tab in tab
 *
 * *****************  Version 6  *****************
 * User: Mahendra_aher Date: 6/03/02    Time: 6:26p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Reconcilation of BO to AR
 *
 * - Mahendra
 *
 * *****************  Version 11  *****************
 * User: Anand_mandil Date: 5/27/02    Time: 3:12p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Removed the import for RelationshipWriter
 *
 * *****************  Version 10  *****************
 * User: Anand_mandil Date: 5/24/02    Time: 10:36a
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * added method calls for relationship.
 *
 * *****************  Version 9  *****************
 * User: Anand_mandil Date: 5/22/02    Time: 12:01p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Uncommented the demo & psycho calls.
 *
 * *****************  Version 8  *****************
 * User: Manoj_chodankar Date: 16-05-02   Time: 8:00p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Modified Files for build to go through.
 *
 * *****************  Version 7  *****************
 * User: Anand_mandil Date: 5/16/02    Time: 12:21p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Added new method calls for demo & psychographic
 *
 * Modified by
 * anand
 *
 * reviewed by
 * mahendra
 *
 * *****************  Version 6  *****************
 * User: Admin        Date: 5/15/02    Time: 3:32p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Comment : Reconciling CRM10BO to CRM10AR.
 *
 * *****************  Version 5  *****************
 * User: Anand_mandil Date: 5/06/02    Time: 1:09p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Changes:
 * Mass change:Removed the organization & person table as inner class from
 * accountbo & contactbo
 * respectively.
 *
 * Modified By:
 * Anand_mandil,Mahendra_aher
 *
 * Reviewed By:
 * Mahendra_aher
 *
 * *****************  Version 5  *****************
 * User: Anand_mandil Date: 4/26/02    Time: 7:28p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 *
 * *****************  Version 4  *****************
 * User: Anuradha_kumar Date: 4/22/02    Time: 6:08p
 * Updated in $/CRM10BO/com/infy/cis/ui/common
 * Synchronizing the CRM10BO repository with CRM10AR repository.
 *
 * *****************  Version 4  *****************
 * User: Anand_mandil Date: 4/12/02    Time: 4:22p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * Tracker:
 * 40734
 *
 * Changes:
 * Mass change "Partner" to "DSA" and "Suspect" to "Prospect" .
 *
 * Modified By:
 * Anand_mandil
 *
 * Reviewed By:
 * Sunil
 *
 * *****************  Version 3  *****************
 * User: Anand_mandil Date: 2/25/02    Time: 1:18p
 * Updated in $/CRM10AR/com/infy/cis/ui/common
 * TrackerId: None
 * Tracker Title: None
 * Changes:Mass change after changing SimpleRM to FinacleCRM
 * Modified By: Anand_mandil
 * Reviewed By :Manoj_chodankar
 * Files: *.java & sourcefile
 *
 * *****************  Version 55  *****************
 * User: Dalip        Date: 11/06/01   Time: 11:16p
 * Updated in $/com/infy/cis/ui/common
 * Added code for saving region also in script
 *
 * *****************  Version 54  *****************
 * User: Paresh       Date: 10/26/01   Time: 12:36a
 * Updated in $/com/infy/cis/ui/common
 * CHG: i18n related processing of request parameters
 *
 * *****************  Version 53  *****************
 * User: Dalip        Date: 10/25/01   Time: 12:27p
 * Updated in $/com/infy/cis/ui/common
 * Removed ShowMessage.showMessage
 *
 * *****************  Version 52  *****************
 * User: Nishad       Date: 10/23/01   Time: 7:27p
 * Updated in $/com/infy/cis/ui/common
 * CHG: These are multiple changes of Internationalization in many files.
 * So not all comments here are applicable everywhere.
 * (Wherever applicable) Handling the resource bundle is locale aware.
 * (Wherever applicable) Concurrent locales are supported there.
 * (Wherever applicable) handleError is now locale-aware
 * (Wherever applicable) getUserMessage that generates a friendly message
 * for an exception is now locale-aware.
 *
 * *****************  Version 51  *****************
 * User: Dalip        Date: 10/19/01   Time: 2:46p
 * Updated in $/com/infy/cis/ui/common
 * Changed SRMBCException to extend it fromSRMBaseException
 *
 * *****************  Version 50  *****************
 * User: Dalip        Date: 10/15/01   Time: 6:43p
 * Updated in $/com/infy/cis/ui/common
 * Added Locale as the first argument in translate and closeTranslation
 * methods in XSLAssist
 *
 * *****************  Version 49  *****************
 * User: Paresh       Date: 10/09/01   Time: 6:41p
 * Updated in $/com/infy/cis/ui/common
 * CHG: i18n changes
 *
 * *****************  Version 48  *****************
 * User: Phaniraju    Date: 8/18/01    Time: 11:35a
 * Updated in $/com/infy/cis/ui/common
 * Bug # 6106 Fixed.
 * Migrated From FinacleCRM21.
 *
 * *****************  Version 47  *****************
 * User: Satya        Date: 5/16/01    Time: 5:47p
 * Updated in $/com/infy/cis/ui/common
 * Fix : esc char in comments
 *
 * *****************  Version 46  *****************
 * User: Satya        Date: 5/16/01    Time: 4:43p
 * Updated in $/com/infy/cis/ui/common
 * CLEANUP : gui to ui
 *
 * *****************  Version 45  *****************
 * User: Sdeva        Date: 5/08/01    Time: 4:35p
 * Updated in $/com/infy/cis/ui/common
 * Migrated from SRM201 Patch 201_001
 * Fix for defect# 4118
 *
 * *****************  Version 44  *****************
 * User: Hima         Date: 4/17/01    Time: 3:48p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 43  *****************
 * User: Vikass       Date: 4/17/01    Time: 11:02a
 * Updated in $/com/infy/cis/ui/common
 * Reference accounts added
 *
 * *****************  Version 42  *****************
 * User: Shiva        Date: 3/02/01    Time: 8:04a
 * Updated in $/com/infy/cis/ui/common
 * FIX: concurrency issue?
 *
 * *****************  Version 41  *****************
 * User: John         Date: 2/23/01    Time: 10:32p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 40  *****************
 * User: Reddy        Date: 2/22/01    Time: 3:28p
 * Updated in $/com/infy/cis/ui/common
 * Unnecessary queries are removed as perfomance fix
 *
 * *****************  Version 39  *****************
 * User: John         Date: 20/02/01   Time: 19:22
 * Updated in $/com/infy/cis/ui/common
 * Fix: 3771
 *
 * *****************  Version 38  *****************
 * User: Hima         Date: 2/11/01    Time: 7:58a
 * Updated in $/com/infy/cis/ui/common
 * Extensibility fix
 *
 * *****************  Version 37  *****************
 * User: John         Date: 2/08/01    Time: 7:21p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 36  *****************
 * User: John         Date: 2/06/01    Time: 3:43p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 35  *****************
 * User: John         Date: 2/04/01    Time: 6:14p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 34  *****************
 * User: John         Date: 1/19/01    Time: 10:07p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 33  *****************
 * User: John         Date: 1/17/01    Time: 7:00p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 32  *****************
 * User: John         Date: 1/17/01    Time: 6:52p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 31  *****************
 * User: Anwar        Date: 1/15/01    Time: 8:21p
 * Updated in $/com/infy/cis/ui/common
 * Bug fixes:
 * #2739
 *
 * *****************  Version 30  *****************
 * User: John         Date: 1/15/01    Time: 6:25p
 * Updated in $/com/infy/cis/ui/common
 * setPartnerType while creating partner
 *
 * *****************  Version 29  *****************
 * User: Raghu        Date: 1/12/01    Time: 3:16p
 * Updated in $/com/infy/cis/ui/common
 * Removed Rating column
 *
 * *****************  Version 28  *****************
 * User: Sdeva        Date: 11-01-01   Time: 4:59p
 * Updated in $/com/infy/cis/ui/common
 * Changes for the new handleError method signature
 *
 * *****************  Version 27  *****************
 * User: John         Date: 12/16/00   Time: 9:16a
 * Updated in $/com/infy/cis/ui/common
 * XSLTProcessor.processor (...) replaced with  XSLAssist.translate (context.getSessionContext(req).getSessionLocale(), ...).
 *
 * Several files are checkin and the lable for these files is
 * BC_XSLTPROCESSOR.
 *
 * *****************  Version 26  *****************
 * User: Shantanu     Date: 12/14/00   Time: 5:07p
 * Updated in $/com/infy/cis/ui/common
 * accountkey existing check..
 *
 * *****************  Version 25  *****************
 * User: Dalip        Date: 12/13/00   Time: 8:48p
 * Updated in $/com/infy/cis/ui/common
 * Corrected the Exception handling .
 *
 * *****************  Version 24  *****************
 * User: Sdeva        Date: 10-12-00   Time: 8:52p
 * Updated in $/com/infy/cis/ui/common
 * Changed to use Transacted Business Context in all the servlets which
 * use BL.
 *
 * *****************  Version 23  *****************
 * User: John         Date: 12/07/00   Time: 9:20p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 22  *****************
 * User: Shantanu     Date: 12/04/00   Time: 7:04p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 21  *****************
 * User: John         Date: 11/27/00   Time: 10:16p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 20  *****************
 * User: John         Date: 11/26/00   Time: 1:40p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 19  *****************
 * User: John         Date: 11/26/00   Time: 1:36p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 18  *****************
 * User: John         Date: 11/25/00   Time: 10:29p
 * Updated in $/com/infy/cis/ui/common
 * new exception handling
 *
 * *****************  Version 17  *****************
 * User: John         Date: 11/24/00   Time: 12:25p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 16  *****************
 * User: Dalip        Date: 11/18/00   Time: 6:59p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 15  *****************
 * User: John         Date: 11/17/00   Time: 10:01p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 14  *****************
 * User: Dalip        Date: 10/27/00   Time: 8:37p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 13  *****************
 * User: Dalip        Date: 10/27/00   Time: 6:16p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 12  *****************
 * User: Raghu        Date: 25/10/00   Time: 3:57p
 * Updated in $/com/infy/cis/ui/common
 * added show message
 *
 * *****************  Version 11  *****************
 * User: Dalip        Date: 10/22/00   Time: 5:23p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 10  *****************
 * User: Dalip        Date: 10/22/00   Time: 12:21p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 9  *****************
 * User: Dalip        Date: 10/21/00   Time: 5:22p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 8  *****************
 * User: Dalip        Date: 10/21/00   Time: 2:47p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 7  *****************
 * User: Dalip        Date: 10/20/00   Time: 3:46p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 6  *****************
 * User: Raghu        Date: 19/10/00   Time: 7:05p
 * Updated in $/com/infy/cis/ui/common
 * Added setUserFields.
 *
 * *****************  Version 5  *****************
 * User: Raghu        Date: 18/10/00   Time: 10:41p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 4  *****************
 * User: Raghu        Date: 18/10/00   Time: 10:10p
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 3  *****************
 * User: Raghu        Date: 18/10/00   Time: 12:40a
 * Updated in $/com/infy/cis/ui/common
 *
 * *****************  Version 2  *****************
 * User: Dalip        Date: 10/13/00   Time: 12:47p
 * Updated in $/com/infy/cis/ui/common
 * Added some error checking
 *
 * *****************  Version 1  *****************
 * User: Dalip        Date: 10/11/00   Time: 7:35p
 * Created in $/com/infy/cis/ui/common
 * Initial version
 *
 *****************************************************************************
 * User: 71920       Date: 10/03/07
 * Updated in $/CRM100/com/infy/cis/ui/cif
 * Changes: Added new identification documents named IDTypeR1,IDTypeR2,IDTypeR3,IDtypeR4 & IDTypeR5
 * TRACKER ID: 113279
 * Modified by : Ashwini Tyagi
 *
 *****************************************************************************/

package com.infy.cis.ui.common;


import com.infy.cis.adaptor.web.WebAdaptor;
// Checksum security recon changes from 10.3 SUPP
import com.infy.cis.arch.SecureHashKeyGeneration;
import com.infy.cis.common.CacheService; /* Changes for WFlow POC */
import com.infy.cis.common.ClassCache;
import com.infy.cis.common.Escaper;
import com.infy.cis.common.KeyGenerationInfo;
import com.infy.cis.common.SRMFormatter;
import com.infy.cis.exception.FCRMGenericException;
import com.infy.cis.exception.CISInvalidArgumentException;
import com.infy.cis.exception.SRMBCException;
import com.infy.cis.exception.SRMBOException;
import com.infy.cis.exception.SRMSecurityException;
import com.infy.cis.exception.SRMTypeConversionException;
import com.infy.cis.exception.WriterHookException;// Changes for 'WFlow' POC
import com.infy.cis.servletruntime.CISHttpServlet;
import com.infy.cis.servletruntime.CISSessionContext;
import com.infy.cis.servletruntime.SRMTypedAttrStringized;
//kiran changes start
import com.infy.cis.srmbo.SRMBOBase;
//kiran changes end
import com.infy.cis.srmbo.security.user.SRMBusinessContext;
import com.infy.cis.srmbo.AccountBO;
import com.infy.cis.srmbo.AccountIDGen;
import com.infy.cis.srmbo.AccountModBO;
import com.infy.cis.srmbo.AgentGroupMgr;
import com.infy.cis.srmbo.AgentBO;
import com.infy.cis.srmbo.Audit;
import com.infy.cis.srmbo.AuditHelper;
//Key Generation changes
import com.infy.cis.srmbo.Cif_id_masterBO;
import com.infy.cis.srmbo.CifmasterIDGen;
//End
import com.infy.cis.srmbo.ContactBO;
import com.infy.cis.srmbo.ContactModBO;
import com.infy.cis.srmbo.Core;
import com.infy.cis.srmbo.CoreInterfaceBO;
import com.infy.cis.srmbo.CoreInterfaceModBO;
import com.infy.cis.srmbo.CorporateBO;
import com.infy.cis.srmbo.CorporateModBO;
import com.infy.cis.srmbo.DemographicBO;
import com.infy.cis.srmbo.DemographicModBO;
import com.infy.cis.srmbo.NNTMIdGen;
import com.infy.cis.srmbo.PartnerBO;
import com.infy.cis.srmbo.PsychographicBO;
//Changes for tracker id :253845-Start
import com.infy.cis.srmbo.SuspectBO;
import com.infy.cis.srmbo.NonCustomerBO;
//Changes for tracker id :253845-End
//Tracker ID 113276 changes start
import com.infy.cis.exception.SRMTypeValidatorException;
import com.infy.cis.srmbo.EntityDocumentBO;
import com.infy.cis.srmbo.EntityDocumentModBO;
import com.infy.cis.srmbo.ExceptThrow;
import com.infy.cis.ui.common.CifDetUtils;
//Tracker ID 113276 changes end

import com.infy.cis.srmbo.PsychographicModBO;
import com.infy.cis.srmbo.RelationshipBO;
import com.infy.cis.srmbo.RelationshipModBO;
import com.infy.cis.srmbo.SRMRecordSet;
import com.infy.cis.srmbo.SRMURLResolver;
import com.infy.cis.srmbo.SRMQueryBuilder;
import com.infy.cis.srmbo.IQuery;
import com.infy.cis.srmbo.TradeFinanceBO;
import com.infy.cis.srmbo.TradeFinanceModBO;
import com.infy.cis.srmbo.TransFormFn;
import com.infy.cis.srmbo.SRMAttributeInfo;
import com.infy.cis.srmbo.SRMCollection;
import com.infy.cis.srmbo.SRMDataObject;
import com.infy.cis.srmbo.SRMQueryExpr;
import com.infy.cis.srmbo.SRMQueryResult;
// Checksum security recon changes from 10.3 SUPP
import com.infy.cis.srmbo.SecureHashKeyGenHelper;
/*AccessControlChanges -ML3	start*/
import com.infy.cis.srmbo.GenericUser;
/*AccessControlChanges -ML3	end*/
import com.infy.cis.ui.logger.ShowMessage;
import com.infy.cis.srmbo.SuspectBO;
import com.infy.cis.ui.logger.AppLogger;
import java.io.PrintWriter;
import java.io.IOException;
/*TrackerID: 161933,Changes Begin */
import java.net.URLEncoder;
/*TrackerID: 161933,Changes End */
/* Changes for 'WFlow' POC -- start */
import java.lang.ClassNotFoundException;
import java.lang.Exception;
import java.lang.reflect.Method;
/* Changes for 'WFlow' POC -- end */
import java.text.SimpleDateFormat;
import java.util.*;
//changes for callid 739410
import com.infosys.insulate.util.concurrent.ConcurrentHashMap;
import com.infosys.insulate.util.HashMap;
import com.infosys.insulate.util.Vector;
import com.infosys.insulate.util.ArrayList;
import com.infosys.insulate.util.HashSet;
import com.infosys.insulate.util.TreeSet;
import com.infosys.insulate.util.IdentityHashMap;
import com.infosys.insulate.util.LinkedHashMap;
import com.infosys.insulate.util.LinkedHashSet;
import com.infosys.insulate.util.LinkedList;
import com.infosys.insulate.util.Stack;
import com.infosys.insulate.util.TreeMap;
import com.infosys.insulate.util.WeakHashMap;
import com.infosys.insulate.util.PriorityQueue;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.infy.cis.common.EditorUtil;
import com.infy.cis.common.SRMDate;
import com.infy.cis.license.LicenseWrapper;
import com.infy.cis.srmbo.AgentCache;
// server side validations import
import com.infy.cis.log.LogType;
import com.infy.cis.common.CRMEJBUtil;
import com.infy.cis.validations.ValidationCalls;
import com.infy.cis.validatorFrmk.ValidationUtil;
import com.infy.cis.validatorFrmk.ErrorObject;
import com.infy.cis.exception.FCRMValidationException;
import com.infy.cis.exception.CRMBusinessException;
import com.infy.cis.exception.CRMSystemException;
/* changes for ticket id 496331 start*/
import com.infy.cis.common.PropertyFileManager;
/* changes for ticket id 496331 end*/




// 113227  Lookup Begin of Changes
import com.infy.cis.ui.*;
// 113227 Lookup End of Changes

// server side validations import
import com.infy.cis.log.LogType;
import com.infy.cis.common.CRMEJBUtil;
import com.infy.cis.validations.ValidationCalls;
import com.infy.cis.validatorFrmk.ValidationUtil;
import com.infy.cis.validatorFrmk.ErrorObject;
import com.infy.cis.exception.FCRMValidationException;
import com.infy.cis.exception.CRMBusinessException;
import com.infy.cis.exception.CRMSystemException;
// Checksum security recon changes from 10.3 SUPP
import com.infy.cis.srmbo.SecureAuditHelper;
//Adhar changes for tracker 375136 start
import com.infy.cis.common.ClientEditorUtil;
//Adhar chnages for tracker 375136 ends

public class AccWriter extends CISHttpServlet{

	private final static String  MODULE_NAME = "common:AccWriter";

	private static final String HOOK_CLASS_NAME = "AccWritHk";// Changes for WFlow POC
    private static final String HOOK_CLASS_WRITER ="CustWritHk";
	public String getModuleName() { return MODULE_NAME; }

	//Changes for CRM10SPE - Using smart QB
	private static final String QB_SMANAGER = "AccWriter_getAgent1";// Changes for querycaching
	private static final String QB_SECRM = "AccWriter_getAgent2";// Changes for querycaching
	private static final String QB_PRIMCONTACT = "AccWriter_getPrimContact";// Changes for querycaching
	private static final String QB_CONTACT2 = "AccWriter_getContact2";// Changes for querycaching
	private static final String QB_CONTACTMOD = "AccWriter_getContactMOD";// Changes for querycaching
	private static final String QB_CONTACTMOD2 = "AccWriter_getContactMOD2";// Changes for querycaching
	private static final String QB_AGENT = "AccWriter_getAgent3";
	//Changes for CRM10SPE - Using smart QB



	public String getUserID() { return ""; }
	/* Changes for the TrackerId:273053 Starts */
	//boolean editFlag=false;

	/* Tracker ID 113276 identification changes start */

	/*List lstIDRemoved;
	List lstEntityDocumentURL = null;
	List lstEDocIsDirty = null;

	EntityDocumentBO objEDoc = null;
	EntityDocumentModBO objEDocMod = null;
	Object objSRMBOBase = null;

	SRMQueryResult qrEDocMod = null;
	SRMQueryBuilder qbEDocMod = null;
	SRMRecordSet rsEDocMod = null;
	int iNoOfEDocs=0;
	String strEDocIsDirty = null;*/
	//License Change - starts
	//	Integer intMAccId = null;
	//License Change - ends

	/* Tracker ID 113276 identification changes end */
    /* Changes for the TrackerId:273053 Ends */
	/*changes for key Generation*/
	//boolean bPopPref;
	/*changes for key Generation*/

/*	public void init() {
		try{
			Properties keyProp = KeyGenerationInfo.getAccountKeyInfo();
			String padding=keyProp.getProperty("isPaddingRequired").trim();

			if (padding!=null && padding.equals("false"))
			{
				bPopPref=false;
			}
			else
			{
				bPopPref=true;
			}
		} catch(Exception e){
			bPopPref=true;
		}

	}*/
	protected  void serviceRequest(HttpServletRequest req, HttpServletResponse resp)
	throws Exception {
     /* Changes for the TrackerId:273053 Starts */
     boolean editFlag=false;

	 		List lstIDRemoved = null;
	 		List lstEntityDocumentURL = null;
	 		List lstEDocIsDirty = null;

	 		//License Change - starts
	 			Integer intMAccId = null;
	 		//License Change - ends

	/* Tracker ID 113276 identification changes end */
	 /* Changes for the TrackerId:273053 Ends */
         boolean bPopPref;
         boolean cdone=false;
try{
			Properties keyProp = KeyGenerationInfo.getAccountKeyInfo();
			String padding=keyProp.getProperty("isPaddingRequired").trim();

			if (padding!=null && padding.equals("false"))
			{
				bPopPref=false;
			}
			else
			{
				bPopPref=true;
			}
		} catch(Exception e){
				bPopPref=true;
		}

		// Server side Validation Changes
		String servrValidation = "";
		//servrValidation = EditorUtil.getBusinessRulesInfo();
		/* Fix for tracker Id 339198 : begin */
		if(EditorUtil.getBusinessRulesInfo().getProperty(EditorUtil.SERVERSIDE_VALIDATION) != null){
			servrValidation = EditorUtil.getBusinessRulesInfo().getProperty(EditorUtil.SERVERSIDE_VALIDATION).trim();
		}
		/* Fix for tracker Id 339198 : end */
		// Server side Validation Changes
		/* ***** 10.3.02 Security Audit ***** */
		HashMap hmSecureHashKeyFields = new HashMap();
		/* ***** 10.3.02 Security Audit ***** */

		//113227 changes start
		String altLocaleActv	=	req.getParameter("altLocaleActv");
		//113227 changes end

		String attachedProducts = req.getParameter("attachedProducts");
		//Tracker:90196: Changes for Attribute Masking
		int mailingIndex =0;
		//Tracker:90196: End Of Changes for Attribute Masking
		String createPartner = req.getParameter("CreatePartner");
		boolean psychoNotLoaded=false;
		if(createPartner == null || createPartner.trim().equals("")) {
			createPartner = "N";
		}
		PrintWriter out = resp.getWriter();
		StringBuilder sb = new StringBuilder();
		sb.append("<SCRIPT language=javascript src=\"../common/js/SSOParameter.js \"></SCRIPT>");
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : Entering AccWriter");

		SRMBusinessContext bc = Utils.getTransactedBusinessContext(req);
		//Changes for call id 378506 starts - Recon for 380203
		try{
		//Changes for call id 378506 ends - Recon for 380203
		/*  FCRM61RECON:TRACKER:45342:BEGINOFCHANGES */
		/*
		 *  Avoid making multiple calls to context.getSessionContext (req).
		 */
		CISSessionContext sc = context.getSessionContext(req);
		/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
		String alterCalenderType=sc.getJNDIAltCalendarType();
		/*********************ERPBOCF1:TRACKER:113259:ENDOFCHANGES ********************************/
		/*  FCRM61RECON:TRACKER:45342:ENDOFCHANGES */
		/****   	Approval Begin		****/
                  /* Changes Begin Tracker Id : 195897 */

		String boNameReq	=	req.getParameter("boName");
		String boName	=	"AccountBO";
		String boNameCI	=	req.getParameter("boNameCI");
		boolean apprFlag=Boolean.valueOf(req.getParameter("apprFlag")).booleanValue();

		if(boNameReq==null) boName="AccountBO";
                  /* Changes End Tracker Id : 195897 */
		if(boNameCI==null) boNameCI="CoreInterfaceBO";
		String byPassFlag = req.getParameter("byPassFlag");
				if ( byPassFlag == null ) {
					byPassFlag = "";
		}
		String copyFlag = req.getParameter("isCopy");
		if(copyFlag == null)
		{
			copyFlag = "";
		}
		// changes for tracker id :253845 Start
				//dummy1();
		    	String convToCust = req.getParameter("convToCust");
				String oldEntityType = req.getParameter("oldEntType");
				String oldEntityID   = req.getParameter("oldEntID");
				if(convToCust == null){
					convToCust = "";
				}
				//if(convToCust.equalsIgnoreCase("Y") && byPassFlag!= null && byPassFlag.equalsIgnoreCase("null")){
					//byPassFlag = "";
				//}
  		 // changes for tracker id :253845 End
		String sDummy = "";
		//Changes for call id 422794-recon for 411952 starts
		String modsDummy = "";
		//Changes for call id 422794-recon for 411952 ends
		boolean chgDummy = false;
		String prevTabs = "";
		String newTabs ="";
		/*changes for key Generation*/
		//Wrong hard coding commenented.
		//boolean bPopPref = true;
		/*changes for key Generation*/
		String updateflag = req.getParameter("hidSt");

		/****   	Approval End		****/
		//Chnages for field based maker checker
		String isMCEditedGeneral = req.getParameter("isMCEditedGeneral");
		String mcJNDIFlag = req.getParameter("mcJNDIFlag");
		if((mcJNDIFlag!=null) && mcJNDIFlag.equals("true")&&isMCEditedGeneral.equals("N")){
			apprFlag=false;
		}
		String acctName = req.getParameter("AccountBO.ACCOUNTNAME");
        String acctKey = req.getParameter("accKey");
        if(acctKey!=null){
			acctKey = acctKey.trim();
		}
		//Key Generation changes
		boolean execute = false;
		String oldCifID = req.getParameter("hid_cifid");
		String flag = req.getParameter("hid_reservestatus");
		boolean cifIDChngd = false;
		if(oldCifID!=null)
		if(!(oldCifID.equals(acctKey))){
			cifIDChngd = true;
		}
		if((oldCifID!=null) && (acctKey!=null))
		if((!(acctKey.equals(oldCifID)))&&(!(oldCifID.equals("")))){
			Cif_id_masterBO cifmaster = (Cif_id_masterBO)
			Utils.getBOFromID( bc, "Cif_id_masterBO",
			Cif_id_masterBO.CIFID, ""+ oldCifID );
			try{
				if(cifmaster!=null){
					if(cifmaster.getRequestReferenceNumber()==(null)){
						SRMDataObject.delete (cifmaster, bc);
					}else{
						cifmaster.setIdType("R");
						SRMDataObject.write (cifmaster, bc);
					}
				}
			}catch (Exception e){
				//e.printStackTrace();
			}
		}
		//End


		String accountID=req.getParameter("accountID");
		String accountURL = req.getParameter("hid_accountURL");
		String coreURL = req.getParameter("hid_coreURL");
		String isTFFlag  = getValueFromRequest(req,boName,"TFPartyFlag");
		String sIntWFID = req.getParameter("IntWFID");/* Changes for 'WFlow' POC */
		/*******************save & submit Changes : Starts *****************************/
		int saveFlag = Integer.parseInt(req.getParameter("saveFlag"));
		int queSubmit = 0;

//Ticket 326932 recon starts
		String isTFFlag_old                     = req.getParameter("isTFFlag");
//Ticket 326932 ends
//Change for TicketId:451745 and TrackerId:237593 -- Start
//Changes for tracker id: 238452 - Start
   String operationType = req.getParameter("operationType");
//Changes for tracker id: 238452 - End
//Change for TicketId:451745 and TrackerId:237593 -- End

		/* Swift Address start tracker 132659 */
		boolean swiftFlag = false;
		String SwiftData = null;
		String SwiftAddressDetails=req.getParameter("SwiftAddressDetails");
		if(SwiftAddressDetails!=null)
		if(SwiftAddressDetails.equals("YYY")){
			if(saveFlag==0){
				swiftFlag = true;
			}
		}
		else{
			swiftFlag = true;
			//Change for TicketId:451745 and TrackerId:237593 -- Start
			//Changes for tracker id: 238452 - Start
			if(saveFlag==1 && operationType.equals("Edit Entity") ){

							swiftFlag = false;
						}
			//Changes for tracker id: 238452 - End
			//Change for TicketId:451745 and TrackerId:237593 -- End
		}
		/* Swift Address end tracker 132659 */
		int iMainacctID=0;
		//Change for TicketId:451745 and TrackerId:237593 -- Start
			//Changes for tracker id: 238452 - Start
                        //String operationType = req.getParameter("operationType");
			//Changes for tracker id: 238452 - End
		//Change for TicketId:451745 and TrackerId:237593 -- End
		//Changes for tracker id :253845- Start
		if (operationType == null && convToCust.equalsIgnoreCase("Y"))
		{
			operationType = "null";
		}
		//Changes for tracker id :253845- End
		/*******************save & submit Changes : Ends *****************************/

		/*****	 CORE-CIF Approval Changes	-start	*****/
		int mainID =0;
		String mainAccId = req.getParameter("mainAccId");
		if(mainAccId!=null)
		if(mainAccId!=null &&!(mainAccId.equalsIgnoreCase(""))&&!(mainAccId.equalsIgnoreCase("null"))){
			mainID = Integer.parseInt(mainAccId);
		}
		/*****	 CORE-CIF Approval Changes	-end	*****/
		int acctId=0;
		if(accountID!=null)
		if(accountID!=null&&!(accountID.equalsIgnoreCase(""))){
			acctId=Integer.parseInt(accountID);
			mainID=acctId;//Save and submit changes
		}
		int modAccId=0;
		AccountModBO busi =null;
		CoreInterfaceModBO coreObj =null;
		TradeFinanceModBO TFObj =null;

		//Check for edit case
                  /* Changes Begin Tracker Id : 195897 */
		if((boNameReq!=null) && (copyFlag!=null))
		if(apprFlag && boNameReq.equalsIgnoreCase("AccountBO")&& !copyFlag.equalsIgnoreCase("Y") && acctId>0){
			editFlag=true;
                  /* Changes End Tracker Id : 195897 */
		}
		/**************Save and Submit Changes : start**********/
		else if((operationType!=null) && operationType.equals("Edit Entity") && ((!apprFlag && saveFlag==1) || (apprFlag && saveFlag==1))){
			editFlag=true;
		}

		//Ticket 326932 recon start
		else if(!apprFlag && (saveFlag==0) && (operationType!=null) && operationType.equals("Edit Entity") && (isTFFlag!=null) && isTFFlag.equals("Y") && (isTFFlag_old!=null) && isTFFlag_old.equals("N")){
		editFlag=true;
		}
		//Ticket 326932 end

		/**************Save and Submit Changes : End**********/
		//else if(copyFlag.equalsIgnoreCase("Y") && ((apprFlag || saveFlag!=0))){
		//					editFlag=true;
		//}
		else editFlag=false;



		//If it its the case of Edit then move the data from Main to Mod
		if(editFlag==true){
			if(byPassFlag!=null)
			if(!byPassFlag.equalsIgnoreCase("Y")){
			modAccId = Core.copyFromMaintoMode(bc,acctId);
			CommonMethodsForPsycoDemo sd = new CommonMethodsForPsycoDemo();
			busi = sd.getExistingBOObject(bc,modAccId, AccountModBO.ACCOUNTID);
		}
			coreObj = (CoreInterfaceModBO)Utils.getBOFromID(bc,"CoreInterfaceModBO",CoreInterfaceModBO.ACCOUNTID,new Integer(modAccId));
			/* CRM10-PT: TRACKER 97228: BEGIN OF CHANGES */
			if(coreObj == null){
				coreObj = new CoreInterfaceModBO();
			}
			/* CRM10-PT: TRACKER 97228: END OF CHANGES */
			TFObj = (TradeFinanceModBO)Utils.getBOFromID(bc,"TradeFinanceModBO",TradeFinanceModBO.ACCOUNTID,new Integer(modAccId));
		}
		/* Tab Validation By Mamta: Start */

		boolean blTabValid = true;
		AccountBO boAccount = null;
		AccountModBO boAccountMod = null;
		String currentTab = "", filledTabs = "", fullList ="",toBeFilled="", tabTitle = "";
		/* Tab Validation String Constants Changes : Start */
		currentTab = Constants.RET_CUST_GEN_TAB; //"Retail_Customer_GE=Y";
		tabTitle = Constants.RET_CUST_TAB_TITLE; //"Retail_Customer";
		/* Tab Validation String Constants Changes : End */
		fullList = CommonQueries.getAllTabList(tabTitle);

		if(isTFFlag!=null)
		if(isTFFlag == null || isTFFlag.equals("N") || isTFFlag == ""){
			String tfTab = Constants.RET_CUST_TRADEFIN_TAB;//"Retail_Customer_TF=Y";
			/***10.2.18***Fix for Techonline call 911465***/
			if (fullList.indexOf(tfTab)>=0){//10.2.18 Fix for Techonline call 774841
			/***10.2.18***Fix for Techonline call 911465***/
			if(fullList.indexOf(tfTab)-1 != -1)
				fullList = (fullList.substring(0,fullList.indexOf(tfTab)-1)) +
				(fullList.substring(fullList.indexOf(tfTab)+tfTab.length(),fullList.length()));
			else if(fullList.indexOf(tfTab) != -1)
				fullList = (fullList.substring(0,fullList.indexOf(tfTab))) +
				(fullList.substring(fullList.indexOf(tfTab)+tfTab.length()+1,fullList.length()));
			}//10.2.18 Fix for Techonline call 774841
		}
		if((copyFlag!=null) && (operationType!=null))
		//Fix for call id: 438919
		if(editFlag == false && copyFlag.equalsIgnoreCase("N") && (operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create")) ){// create screen
			if(saveFlag == 0){//create screen, submit
				boAccount = new AccountBO();
				boAccount.setTabValidator(currentTab); // 760783 TOL Changes
			}
		}
		else{
			if(operationType!=null)
			if(operationType.equals("Queue")){
				boAccountMod = (AccountModBO)SRMURLResolver.getObject(bc, accountURL, true);
				//License Change - starts
				intMAccId = boAccountMod.getMainTableID();
				//License Change - ends
				filledTabs = boAccountMod.getTabValidator();
				if(saveFlag == 1){ //edit screen from entity queue, save
					if(filledTabs != null && !filledTabs.equals("")){
						filledTabs = CommonQueries.removeTab(filledTabs,currentTab);
						boAccountMod.setTabValidator(filledTabs);
					}
				}
				else{//In edit screen from entity queue, submit
					if(fullList != null){
						if(fullList.indexOf(currentTab) != -1){
							if(filledTabs != null && !filledTabs.equals("")){
								if(filledTabs.indexOf(currentTab) == -1){
									filledTabs = filledTabs+"|"+currentTab;
								}
							}
							else{
								filledTabs = currentTab;
							}
						}
						boAccountMod.setTabValidator(filledTabs);
						if(!(CommonQueries.isTabMatching(fullList,filledTabs))){//if all the Mandatory Tabs not filled
							saveFlag = 1;
							queSubmit = 1;
							blTabValid = false;
						}
					}
				}
			}
			else{
				if(byPassFlag!=null)
				if(!byPassFlag.equalsIgnoreCase("Y")){
				boAccountMod = busi;
				if(saveFlag == 1 && editFlag){ //edit screen from edit entity, save
					//boAccountMod = busi;
					filledTabs = boAccountMod.getTabValidator();
					if(filledTabs != null && !filledTabs.equals("")){
						filledTabs = CommonQueries.removeTab(filledTabs,currentTab);
						boAccountMod.setTabValidator(filledTabs);
					}
				}
				//Ticket 326932 recon:starts

				else if((saveFlag==0) && operationType.equals("Edit Entity") && (isTFFlag!=null) && isTFFlag.equals("Y") && (isTFFlag_old!=null) && isTFFlag_old.equals("N")){
							filledTabs = boAccountMod.getTabValidator();
							filledTabs = AccMainHelper.findfilledTabs(filledTabs,currentTab);
							boAccountMod.setTabValidator(filledTabs);
							}//else if close
					//Ticket 326932:ends
			}
		}
}
		Date currDate =new Date();

		/* Tab Validation By Mamta: End */
		/****   	Approval Begin		****/
		//String acctType = getValueFromRequest(req,boName,"Cust_Type");//Commenting unused variables
		/*  CRM62M:TRACKER:67292:BEGINOFCHANGES */
		String accountType = getValueFromRequest(req,boName,"accountType");
		/*  CRM62M:TRACKER:67292:ENDOFCHANGES */
		String acctRevenue = SRMTypedAttrStringized.getIntegerParameter( req,boName+".AnnualRevenue");

		//String acctStatus = getValueFromRequest(req,boName,"status");//Commenting unused variables
		String acctRevenueUnits = getValueFromRequest(req,boName,"revenueUnits");
		String sGender = getValueFromRequest(req,boName,"Gender");

		//String sSalutation = getValueFromRequest(req,boName,"Salutation");//Commenting unused variables
		//String CustomerNREFlg           = getValueFromRequest(req,boName,"CustomerNREFlg");//Commenting unused variables
		String CustomerMinor            = getValueFromRequest(req,boName,"CustomerMinor");




		//String CustomerTrade            = getValueFromRequest(req,boName,"CustomerTrade");
        //String Cust_Staff_Status        = getValueFromRequest(req,boName,"Cust_Staff_Status");
		//String Cust_Staff_Status        = getValueFromRequest(req,boName,"Cust_Staff_Status");

		//String CombinedStatementFlg     = getValueFromRequest(req,boName,"CombinedStatementFlg");//Commenting unused variables
		//String AutoApproval             = getValueFromRequest(req,boName,"AutoApproval");
		//String FreezeProductSale        = getValueFromRequest(req,boName,"FreezeProductSale");
		String Category                 = getValueFromRequest(req,boName,"Category");
		//String Proof_of_Age_Flag        = getValueFromRequest(req,boName,"ProofOfAgeFlag");
		//String Proof_of_Age_Document    = getValueFromRequest(req,boName,"ProofOfAgeDocument");
		//String Staff_Flag               = getValueFromRequest(req,boName,"StaffFlag");

		String acctRegion = getValueFromRequest(req,boName,"region");
        //TrackerID:195897,CHANGES BEGIN
		SRMTypedAttrStringized preferredChannelID       = SRMTypedAttrStringized.getReqParameter( req,"2_AccountBO.preferredChannelID");
		//TrackerID:195897,CHANGES END
		/****   	Approval End		****/

		//String acctFax = req.getParameter("AccountBO.FAX");//Commenting unused variables
		//String acctFaxHome = req.getParameter("AccountBO.Fax_Home");//Commenting unused variables
		String acctIndustry = req.getParameter("AccountBO.industry");
		String acctNotes = req.getParameter("AccountBO.notes");
		//String acctPhone = req.getParameter("AccountBO.PHONE");//Commenting unused variables
		//String acctEmail = req.getParameter("AccountBO.EMAIL");//Commenting unused variables
		//String acctExtension = req.getParameter("AccountBO.EXTENSION");//Commenting unused variables
		//String acctURL = req.getParameter("AccountBO.COMPANYURL");//Commenting unused variables


		String acctCompetitor = req.getParameter("AccountBO.COMPETITOR");

		String acctSICCode = req.getParameter("AccountBO.sicCode");

		String acctTickerSymbol = req.getParameter("AccountBO.tickerSymbol");
		String acctParentAccount = req.getParameter("AccountBO.parentAccount");

		//String acctUserfield1 = req.getParameter("AccountBO.USERFIELD1");//Commenting unused variables
		//String acctUserfield2 = req.getParameter("AccountBO.USERFIELD2");//Commenting unused variables
		//String acctUserfield3 = req.getParameter("AccountBO.USERFIELD3");//Commenting unused variables
		//String acctUserfield4 = req.getParameter("AccountBO.USERFIELD4");//Commenting unused variables
		//String acctUserfield5 = req.getParameter("AccountBO.USERFIELD5");//Commenting unused variables
		//Tracker id 169610 changes start
		// Changes for TOL 669756 starts
		// String sStrUserField6       = req.getParameter(boName+".StrUserField6");
		// Changes for TOL 669756 ends
		//Tracker id 169610 changes end
		//Changes for tracker id 157334 starts
		//Commented unused variables to remove code too large error
		//String sStrUserField20          = req.getParameter("AccountBO.StrUserField20");
		//Changes for tracker id 157334 ends


		//static java.lang.String PARTNERREPID
		SRMTypedAttrStringized acctPrimaryContact = SRMTypedAttrStringized.getReqParameter( req,"AccountBO.PRIMARYCONTACTID");
		String acctPrimaryContURL = req.getParameter("hid_contactURL");

		/*  TRACKER:69692:BEGIN OF CHANGES */
		//Commented unused variables to remove code too large error
		//String sCustLanguage = req.getParameter("AccountBO.Cust_Language");

		// Tracker id 113276 changes start
		/*String sAlert1 = req.getParameter("AccountBO.Alert1");
		String sAlert2 = req.getParameter("AccountBO.Alert2");
		String sAlert3 = req.getParameter("AccountBO.Alert3");
		String sFlg1 = req.getParameter("AccountBO.Flg1");
		String sFlg2 = req.getParameter("AccountBO.Flg2");
		String sFlg3 = req.getParameter("AccountBO.Flg3");
		String sTertiaryRM = req.getParameter("Ter_manager");
		String sNickName = req.getParameter("AccountBO.nick_name");
		String sShortName = req.getParameter("AccountBO.short_name");
		String sFatherHusbandName = req.getParameter("AccountBO.father_husband_name");
		String sPreviousName = req.getParameter("AccountBO.previous_name");
		String sCardHolder = req.getParameter("AccountBO.card_holder");
		String sDsaid = req.getParameter("AccountBO.DSA_ID");
		String sPhotographID = req.getParameter("AccountBO.photograph_id");
		String sMotherName = req.getParameter("AccountBO.mother_name");
		String sAssistant = req.getParameter("AccountBO.Assistant");
		String sRMGroupID = req.getParameter("AccountBO.rm_group_id");
		String sRelationshipType = req.getParameter("AccountBO.relationship_type");
		String CustLevelChargesAcct				= req.getParameter("CoreInterfaceBO.CustLevelChargesAcct");
		String SourceOfIncome					= req.getParameter("CoreInterfaceBO.SourceOfIncome");
		String cust_free_text					= req.getParameter("CoreInterfaceBO.Cust_free_text");
		String PrimarySolID						= req.getParameter("CoreInterfaceBO.PrimarySolID");
		String PrefCode							= getValueFromRequest(req,boNameCI,".PrefCode");
		String PrefCode_code					= getValueFromRequest(req,boNameCI,".PrefCode_code");
		String TreasuryCounterParty				= getValueFromRequest(req,boNameCI,".TreasuryCounterParty");
		String TreasuryCounterPartyMne			= req.getParameter("CoreInterfaceBO.TreasuryCounterPartyMne");
		String Country_of_Birth         = req.getParameter("AccountBO.CountryOfBirth");
		String MaidenName               = req.getParameter("AccountBO.maidenName");
		String SpouseID                 = req.getParameter("AccountBO.spouseID");
		String CreditHistoryRequestedFlag = req.getParameter("AccountBO.creditHistoryRequestedFlag");*/

		// Tracker id 113276 changes end

                  /* Changes Begin Tracker Id : 195897 */
		String sManager = req.getParameter("AccountBO.Manager");


		String sSecondaryRM = req.getParameter("AccountBO.SecondaryRM_ID");
                  /* Changes End Tracker Id : 195897 */
// Changes for 354589
/*		String sRelationshipField1 = req.getParameter("AccountBO.RelationshipField1");
		String sRelationshipField2 = req.getParameter("AccountBO.RelationshipField2");
		String sRelationshipField3 = req.getParameter("AccountBO.RelationshipField3");
		String sCreditBureauScore = req.getParameter("AccountBO.CreditBureauScore");
		String sCreditBureauDescription = req.getParameter("AccountBO.CreditBureauDescription");
		String sInternalScore = req.getParameter("AccountBO.InternalScore");
*/
// Changes for 354589 end
		String accessOwnerGroup=SRMTypedAttrStringized.getIntegerParameter(req,"accessOwnerGroup");
		String accessOwnerSegment=req.getParameter("AccountBO.accessOwnerSegment");
		String accessOwnerBC=SRMTypedAttrStringized.getIntegerParameter(req,"accessOwnerBC");
//// Changes for 354589
//		String sRating = getValueFromRequest(req,boName,"Rating");
// Changes for 354589 end
		/*  TRACKER:69692:END OF CHANGES */

		String acctXMLDATA = req.getParameter("AccountBO.XMLDATA");

		String sCustFirstName = req.getParameter("AccountBO.Cust_First_Name");
		String sCustMiddleName = req.getParameter("AccountBO.Cust_Middle_Name");
		/*      Added For CIF Changes   */

		String sSecureID = req.getParameter("AccountBO.Secure_id");

		//String sPrimaryServiceCentre = req.getParameter("AccountBO.primary_service_centre");

//		String noOfCreditCard=req.getParameter("noOfCreditCard");
		String sPreferredName = req.getParameter("AccountBO.PreferredName");
//		String sLeadSource = req.getParameter("AccountBO.lead_source");
		String sRelationshipLevel = req.getParameter("AccountBO.relationship_level");

		/* CIF Household ID changes -Begin */
		//String househldName = req.getParameter("newHouseVal");
		//String HouseHoldID = req.getParameter("AccountBO.householdID");//Commenting unused variables
		/* CIF Household ID changes -End */

		/*
		 *	Core Fields Inclusion - Begin
		 */
		//String sCore_introd_cust_id 		= req.getParameter("AccountBO.Core_introd_cust_id");
		//String sCore_introd_cust_id = "";
		//String sIntroducerType = "";
		//sIntroducerType = req.getParameter("RelationshipBO.Bank_Entity1");
		String sCore_child_cust_id = "";
		//  String sIntrod_Salutation_code 		= getValueFromRequest(req,boName,".Introd_Salutation_code");

		/*  ERPBOCF1:TRACKER:113259:BEGINOFCHANGES(HIJRI) */
		/*  retrieving the value of preferred calendar into a varaible */
		//String strPreferredCalendar	= getValueFromRequest(req,boName,".preferredCalendar");
		/*  ERPBOCF1:TRACKER:113259:ENDOFCHANGES(HIJRI) */
        //TrackerID:195897,CHANGES BEGIN
		//Commented unused variables to remove code too large error
		//String sIntrod_Salutation_code 		= req.getParameter("AccountBO.Introd_Salutation_code");
		//tracker id 337846 changes starts
		//String sIntroducerName 				= req.getParameter("AccountBO.IntroducerName");
		String sIntroducerName 				= req.getParameter("hid_IntroducerName");
		//tracker id 337846 changes ends
		String sCust_hlth_code 				= getValueFromRequest(req,boName,"Cust_hlth_code");
		String sTds_tbl_code 				= getValueFromRequest(req,boName,"Tds_tbl_code");
		String TDS_CIFID 					= req.getParameter("AccountBO.Tds_cust_id");
		String TDS_CORECUSTID 				= req.getParameter("TDS_CORECUSTID");
		//changes for callid 195762 Ticket: 387004 tracker: 235476 start

		//String sNat_id_card_num 			= req.getParameter("AccountBO.Nat_id_card_num");
		String sNat_id_card_num 			= req.getParameter("National Card Number.txt_ID");

        //changes for callid 195762 Ticket: 387004 tracker: 235476 end
		String sPsprt_det 					= req.getParameter("AccountBO.Psprt_det");
		String sCrncy_code 					= getValueFromRequest(req,boName,"Crncy_code");
		String sPrimary_sol_id 				= req.getParameter("AccountBO.Primary_sol_id");

		/* Changes For Ticketid:- 371367 Begin
      Commenting the changes done for Ticketid:-286305 */

		/*Changes for Ticketid:-286305 Begin
		Pref_Code is basically set in either CoreinterfaceBo or CoreInterfaceModBo.Changes been done accordingly*/
		//String sPref_code					= getValueFromRequest(req,boNameCI,"PrefCode");
		/*Changes for Ticketid:-286305 End*/
		/* Changes For Ticketid:- 371367 End*/


		/* Change for ticket 202257  starts */
/* Recon of Change for Call  391057  starts */
//String sPref_code_rcode				= getValueFromRequest(req,boName,"Pref_code");
String sPref_code_rcode				= req.getParameter("AccountBO.Pref_code_rcode");;

/* Recon of Change for Call  391057    end */
		/* Change for ticket 202257  ends */
		String sIntroducerStatusCode		= getValueFromRequest(req,boName,"IntroducerStatusCode");
		String sName						= req.getParameter("AccountBO.Name");
		String sManagerOpinion 				= req.getParameter("AccountBO.ManagerOpinion");
		String purge_flag                   = getValueFromRequest(req,boName,"PurgeFlag");
		String tfparty_flag                 = req.getParameter("ckTFPartyFlag");
		// String isTFFlag                     = req.getParameter("isTFFlag");
		String sPurgeRemarks 				= req.getParameter("AccountBO.PurgeRemarks");
		String sNativeLangName 				= req.getParameter("AccountBO.NativeLangName");
		String sNativeLangTitle_code 		= getValueFromRequest(req,boName,"NativeLangTitle_code");
		//String sNativeLangCode_code 		= getValueFromRequest(req,boName,"NativeLangCode_code");
		String availableBackendID			= req.getParameter("selAvailBackendID");
		String sDefaultAddressType 			= req.getParameter("DefaultAddressType");

		//  String Core_cust_id 				= req.getParameter("Core_cust_id");
		//  String sCore_cust_id				= acctKey.substring(0,9);
		String sEntity_cre_flag 			= req.getParameter("AccountBO.Entity_cre_flag");
		String sSalutation_code 			= getValueFromRequest(req,boName,"Salutation_code");
		String sGroupid_code 				= req.getParameter("AccountBO.Groupid_code");
		String sOccupation_code 			= req.getParameter("AccountBO.Occupation_code");
		String sSector_code 				= getValueFromRequest(req,boName,"Sector_code");
		String sSubsector_code 				= getValueFromRequest(req,boName,"Subsector_code");
		String sCust_type_code 				= getValueFromRequest(req,boName,"Cust_type_code");
		String sStatus_code 				= getValueFromRequest(req,boName,"Status_code");
		//TrackerID:195897,CHANGES BEGIN
		String sConstitution_ref_code 		= getValueFromRequest(req,boName,"Constitution_ref_code");
		//TrackerID:195897,CHANGES END
		String sCustCreationMode 			= req.getParameter("CustCreationMode");
		/*  Customization changes for dropdown to lookup for tracker id 338696 */
		//String sRating_code 				= req.getParameter("AccountBO.Rating_code");
		String sRating_code = getValueFromRequest(req,boName,"Rating_code");
		//TrackerID:195897,CHANGES BEGIN
		String sCust_community				= getValueFromRequest(req,boName,"Cust_commu_code");

		//String sIntroducerSalutation		= getValueFromRequest(req,boName,".IntroducerSalutation");
		String sIntroducerSalutation		= req.getParameter("AccountBO.Introd_Salutation_code");
				//change for callid 358638
        String sIntroducerSalutation1		= req.getParameter("hid_Introdsalutation");
//		String sIntroducerID				= req.getParameter("AccountBO.IntroducerID");
		/*ML3 changes start*/
		/*ML3 changes end*/
		//String sCust_hlth					= getValueFromRequest(req,boName,"Cust_hlth");
		String sTds_tbl						= getValueFromRequest(req,boName,"Tds_tbl");
		String sIntrod_Status				= getValueFromRequest(req,boName,"IntroducerStatusCode");
		//change for callid 358638
				String sIntrod_Status1      			= req.getParameter("hid_Introdstatus");
		//TrackerID:195897,CHANGES BEGIN
		String sNativeLangTitle				= getValueFromRequest(req,boName,"NativeLangTitle_code");
		String sSector						= getValueFromRequest(req,boName,"Sector");
		String sSubsector					= getValueFromRequest(req,boName,"Subsector");
		//String sRating                      = getValueFromRequest(req,boName,"Rating");
		//Senior Changes Starts
		String SeniorCitizen            = req.getParameter("AccountBO.SeniorCitizen");
		//Senior Changes Ends
		/* FATCA Changes Starts */

		String strForeignAccTaxReportingReq = req.getParameter("AccountBO.ForeignAccTaxReportingReq");

		String strForeignTaxReportingCountry = req.getParameter("AccountBO.ForeignTaxReportingCountry");
		String strForeignTaxReportingStatus = req.getParameter("AccountBO.ForeignTaxReportingStatus");
		//String strLastForeignTaxReviewDate = req.getParameter("3_AccountBO.LastForeignTaxReviewDate");
		//String strNextForeignTaxReviewDate = req.getParameter("3_AccountBO.NextForeignTaxReviewDate");
		String strFatcaRemarks = req.getParameter("AccountBO.FatcaRemarks");


		/* FATCA Changes Ends */
		/*Changes for KYC enhancement start*/
						String strRiskRating      = req.getParameter("AccountBO.riskRating");
				        String strSubmitForKYC      = req.getParameter("AccountBO.submitForKYC");
		                Date KYCReviewDate=null;
			            Date KYCDate=null;


					  if (strRiskRating!= null)
						{
						 if(strSubmitForKYC!=null && strSubmitForKYC.equalsIgnoreCase("Y")) //Changes for call id : 759150
						  {
					    Calendar currentDate = Calendar.getInstance();
						SimpleDateFormat formatter= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
					    String strKYCDate = formatter.format(currentDate.getTime());
				         KYCDate=(Date)formatter.parse(strKYCDate);
				         String bankID = (String)com.infy.cis.common.SRMTLVar.bank_id.get();
						 Properties prop1 = PropertyFileManager.getPropFile("KYC.properties",bankID);
						 /*****10.2.18 Techonline 855343 starts*******/
						String sKeyPrefixKYCPriority = prop1.getProperty(strRiskRating);
						try{
                        int iKeyPrefixKYCMonths = Integer.parseInt(sKeyPrefixKYCPriority);
                        currentDate.add(Calendar.MONTH, iKeyPrefixKYCMonths);
                        }catch(NumberFormatException ne){
                        	WebAdaptor.log(com.infy.cis.log.LogType.PANIC,"AccWriter :Exception occured while setting KYC fields."+ne.getMessage());                        	
                        	
                        }
                        /*****10.2.18 Techonline 855343 ends*******/
						String sKYCReviewDate=formatter.format(currentDate.getTime());
					    KYCReviewDate=(Date)formatter.parse(sKYCReviewDate);

		                }else if (strSubmitForKYC!=null && strSubmitForKYC.equalsIgnoreCase("N")){ // Changes for 772541 TOL start
							  
								  SRMTypedAttrStringized sKYCReviewDate2= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.KYC_ReviewDate");
								  SRMTypedAttrStringized sKYCDate2 = SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.KYC_Date");
								  
								if((sKYCReviewDate2!=null)&&(!sKYCReviewDate2.getValue().equalsIgnoreCase(""))){
									 KYCReviewDate = (sKYCReviewDate2.getFormatter(context).stringToDate(sKYCReviewDate2.getValue()));
								  }
								if((sKYCDate2!=null)&&(!sKYCDate2.getValue().equalsIgnoreCase(""))){
									 KYCDate = (sKYCDate2.getFormatter(context).stringToDate(sKYCDate2.getValue()));
								}
								// Changes for 772541 TOL end
		                	}
						}

       /*Changes for KYC enhancement End*/


		SRMTypedAttrStringized Psprt_issue_date= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.Psprt_issue_date");
		SRMTypedAttrStringized Psprt_exp_date= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.Psprt_exp_date");
		SRMTypedAttrStringized Cust_pref_till_date= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.Cust_pref_till_date");


		/* Change done as a part of ticket 296094 starts, BO fetch for the attribute is wrongly done which was modified accordingly */

		//changes for ticket id 413403 start

		//TrackerID:239165 changes starts
		SRMTypedAttrStringized MinorAttainMajorDate= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.MinorAttainMajorDate");
		//Senior Changes Starts
		SRMTypedAttrStringized SenCitizenApplicableDate= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.SenCitizenApplicableDate");
		//Senior Changes Ends
		/*Changes for tracker id 232324 start */
		//TrackerID:239165 changes ends
		SRMTypedAttrStringized MinorAttainMajorDateForEdit= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.MinorAttainMajorDate");



//TrackerID:253107 changes starts.
//Changes done for improper recon TrackerID:267465 starts
if(CustomerMinor !=null)
//Changes done for improper recon TrackerID:267465 ends
		/* Changes done for ticket id 499037 - Start */
		{

		/* Changes done for ticket id 499037 - End */


		if((CustomerMinor.trim().equals("Y") || CustomerMinor.trim().equals("y")) && (MinorAttainMajorDate==null))
		//TrackerID:253107 changes ends
		{
		MinorAttainMajorDate=MinorAttainMajorDateForEdit;
		}
		/*Changes for tracker id 232324 end*/

		//Changes for Tracker #303247 start
		if((CustomerMinor.trim().equals("N") || CustomerMinor.trim().equals("n")) && (MinorAttainMajorDateForEdit!=null))
		{
			MinorAttainMajorDate=MinorAttainMajorDateForEdit;
		}
		//Changes for Tracker #303247 end
/* Changes done for ticket id 499037 - Start  */
}
/* Changes done for ticket id 499037 - End */

		/* Change done as a part of ticket 296094 ends */
		/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
		SRMTypedAttrStringized RatingDate;//= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.RatingDate");
		//SRMTypedAttrStringized CustStatusChgDate;//= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.CustStatusChgDate");
/* changes for call id 337739 starts		*/		SRMTypedAttrStringized NREBecomingOrdDate= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.NREBecomingOrdDate");

		if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
		{
			NREBecomingOrdDate= SRMTypedAttrStringized.getReqParameter( req,"NREBecomingOrdDate");
			RatingDate= SRMTypedAttrStringized.getReqParameter( req,"RatingDate");
			//CustStatusChgDate = SRMTypedAttrStringized.getReqParameter( req,"CustStatusChgDate");
		}
		else
		{
			NREBecomingOrdDate= SRMTypedAttrStringized.getReqParameter( req,"AccountBO.NREBecomingOrdDate");
			RatingDate= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.RatingDate");
			//CustStatusChgDate = SRMTypedAttrStringized.getReqParameter( req,"AccountBO.CustStatusChgDate");

		}
		/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
//changes for call id 337739 ends

		/* Change done as a part of ticket 296094 starts, BO fetch for the attribute is wrongly done which was modified accordingly */
		//changes for 258636 starts
			// Changes for tracker Id 249891 start here

		SRMTypedAttrStringized Offline_cum_debit_limit= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Offline_cum_debit_limit");
		//changes for 258636 ends
		   // Changes for tracker Id 249891 end here

		/* Change done as a part of ticket 296094 starts, BO fetch for the attribute is wrongly done which was modified accordingly */

		/*89899633...
		 *	Core Fields Inclusion - End
		 */
		/*Native Language Fields added:start*/

		/*String sFirstNameNative = req.getParameter("AccountBO.Cust_First_Name_Native");
		String sMiddleNameNative = req.getParameter("AccountBO.Cust_Middle_Name_Native");
		String sLastNameNative = req.getParameter("AccountBO.Cust_Last_Name_Native");
		String sShortNameNative = req.getParameter("AccountBO.Short_Name_Native");
		String sFirstNameNative1 = req.getParameter("AccountBO.Cust_First_Name_Native1");
		 String sMiddleNameNative1 = req.getParameter("AccountBO.Cust_Middle_Name_Native1");
		 String sLastNameNative1 = req.getParameter("AccountBO.Cust_Last_Name_Native1");
		 String sShortNameNative1 = req.getParameter("AccountBO.Short_Name_Native1"); */

		/*Native Language Fields added:end*/


		/* CoreInterfaceBO changes:start*/


		String sCU_OfflineDebit					= getValueFromRequest(req,boNameCI,"CU_OFFLINECUMDEBITLIMIT");
		//Changes for tracker ID 457671 start
		SRMTypedAttrStringized OfflineCumDebitLimit	= SRMTypedAttrStringized.getReqParameter( req,"3_CoreInterfaceBO.OFFLINECUMDEBITLIMIT");
		//Changes for tracker ID 457671 end


		/* CoreInterfaceBO changes:end*/

		/* ERPBOCF1 -- CIF Addition of Fields changes Tracker ID 113276 start */
		// Retrieving the values of 4 dropdowns
        String entity_cre_flag=null;
		CifDetUtils cifUtils = new CifDetUtils();
		int iNoOfEDocs=0;

		/* ERPBOCF1 -- CIF Addition of Fields changes Tracker ID 113276 start */

		/* CoreInterfaceBO changes:end*/


		// For CIF address saving
		String ScreenName = req.getParameter("screenname");
		if(ScreenName==null) ScreenName="";


		String sCustLastName = req.getParameter("AccountBO.Cust_Last_Name");

		/*WMS Field additions start*/
		SRMTypedAttrStringized RiskProfileScore      = SRMTypedAttrStringized.getReqParameter( req,"2_AccountBO.RiskProfileScore");

		/*WMS Field additions end*/

		/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
		SRMTypedAttrStringized RiskProfileExpiryDate;// = SRMTypedAttrStringized.getReqParameter( req,"AccountBO.RiskProfileExpiryDate");

		if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
		{
			RiskProfileExpiryDate = SRMTypedAttrStringized.getReqParameter( req,"RiskProfileExpiryDate");
		}
		else
		{
			RiskProfileExpiryDate = SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.RiskProfileExpiryDate");
		}
		/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/



		// String HouseHoldID              = req.getParameter("AccountBO.householdID");

		/* TRACKER# 60567 : BEGIN   CHANGES */
		String RelationshipOffer1        = req.getParameter("AccountBO.RelationshipOffer1");
		String RelationshipOffer2        = req.getParameter("AccountBO.RelationshipOffer2");
		/* TRACKER# 60567 : END   CHANGES */

		String DelinkCustDet=req.getParameter("hid_linkDelinkCustDet");

		SRMTypedAttrStringized RelationshipMgrID        = SRMTypedAttrStringized.getReqParameter( req,"AccountBO.RelationshipMgrID");
		//Tracker 195897 changes
		SRMTypedAttrStringized RelationshipCreatedByID  = SRMTypedAttrStringized.getReqParameter( req,"2_AccountBO.RelationshipCreatedByID");


		/* FCRM62ENH: TRACKER# : 58778  BEGIN OF CHANGES */


		String isQDE = req.getParameter("isQDE");
		if(isQDE==null){
			isQDE="";
		}

		/* Field Rationalization changes start*/
		//Changes for the tracker id 296094 for fetching from Cat_AccountBO starts
		String sChargeLevelCode       = req.getParameter("AccountBO.ChargeLevelCode");
		//Changes for the tracker id 296094 for fetching from Cat_AccountBO ends

		SRMTypedAttrStringized SegUpdateDate= SRMTypedAttrStringized.getReqParameter( req,boName+".SegUpdateDate");

		/*changes for doc recieved*/
		String doc_received                = req.getParameter("ckDocument_Received");
		/*changes for doc recieved*/



		//Changes by Suman for Minor

		String contRelation=null;
		String contIntroRelation=null;
		String sChildEntity="";
		String contactSalutation ;
		String contactFirstName;
		//changes Tracker 356525 starts for minor CIF
		String contactLastName  = "";
		//changes Tracker 356525 ends for minor CIF
		String contactMiddleName;

		/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup START  */
		String contactFirstName_alt1;
		String contactLastName_alt1;
		String contactMiddleName_alt1;
		/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup START  */

		String contactGender;
		/* Tracker 129389 Changes Start*/
		String contactDOB=null;
		/* Tracker 129389 Changes End*/
		String guardCode=null ;
		String sChildEntityID=null;
		String ctKey;
		String ctContactURL;
		SRMTypedAttrStringized contactDtOfBirth;
		ContactBO businessObjectCont=null;
		DemographicBO DemoBOMinor = null;
		PsychographicBO PsychoBOMinor = null;

		String isAutoGenKey = req.getParameter("isAutoGenKey");
		//fix CIF ID Prefix going wrong in multi entity scenario,TOL id: 718503 and recon of 713820 - starts
		Properties keyProp = CommonQueries.fetchKeyProperties(EditorUtil.ACCOUNT,bc.getBank_id());
		//Properties keyProp = KeyGenerationInfo.getAccountKeyInfo();
		//fix CIF ID Prefix going wrong in multi entity scenario,TOL id: 718503 and recon of 713820 - end

		String keyPrefix = keyProp.getProperty("Prefix").trim();
		String initCounter = keyProp.getProperty("StartCounter").trim();

		/* NNTM addition - start */
		String codeNNTM = keyProp.getProperty("Code").trim();
		String typeNNTM = keyProp.getProperty("Type").trim();

		String cifId = null;
		String coreCustId = null;

		String initflgCounter = "1";
		// Changes for Ticket id: 777026 starts
		//String keyPrefix2 = "A";
		String keyPrefix2 = getKeyPrefix2();
		// Changes for Ticket id: 777026 ends
		//Key Generation changes
		String scifmasterid = null;
		String keyPrefix1 = "";
		String initflgCounter2 = "1";
		/* Tracker 129389 Changes Start*/
        int contactBirthDay = 0;
        int contactBirthYear = 0;
        String contactBmonth = null;
      	/* Tracker 129389 Changes End*/
		HashMap key = null;
		HashMap params = new HashMap ( );
		params.put("bc",bc);
		params.put("sc",sc);
		params.put("isAutoGenKey",isAutoGenKey);
		params.put("keyPrefix",keyPrefix);
		params.put("codeNNTM",codeNNTM);
		params.put("typeNNTM",typeNNTM);
		params.put("initCounter",initCounter);
		params.put("primary_service_centre",sPrimary_sol_id);
		params.put("keyPrefix2",keyPrefix2);
		Hashtable htCifIds = new Hashtable();
		SRMFormatter srmf=sc.getFormatter();
		if(CifmasterIDGen.isPrefixRegistered(bc, keyPrefix1)) {
			scifmasterid = CifmasterIDGen.getAnother(bc, keyPrefix1);
		} else {
			scifmasterid = CifmasterIDGen.createNew(bc, keyPrefix1, (new Integer(srmf.stringToInt(initflgCounter2)).intValue()));
		}
		Integer cifmasterid = Integer.valueOf(scifmasterid);
		//End
		String agentID_prim=null;
		String agentID_sec=null;

		//IDENTIFICATION DOCUMENT CHANGES  Tracker ID 113276  start
		String strListOfEDocURL			    = req.getParameter("hidEntityDocumentURL");
		String IDRemoved                    = req.getParameter("IDRemoved");
		String EDoc_IsDirty				= req.getParameter("hidEDoc_IsDirty");		//added to update only the dirty records

		/* TRACKER ID 121166 and 202790 CHANGES START */


/****************SIT Fix**************************************/
				/*if(copyFlag.equals("Y")||(editFlag && saveFlag==1))
				{
					strListOfEDocURL = "";
				}*/
/****************SIT Fix**************************************/


		/* TRACKER ID 121166 and 202790 CHANGES END */

		/* TRACKER ID 113276 CHANGES START */
		lstEntityDocumentURL        = Utils.parseString(strListOfEDocURL,',');
		lstEDocIsDirty        			= Utils.parseString(EDoc_IsDirty,',');		//added to update only the dirty records
		if(lstEntityDocumentURL!=null)
			iNoOfEDocs=lstEntityDocumentURL.size();
		/* TRACKER ID 113276 CHANGES END */
		lstIDRemoved  = Utils.parseString(IDRemoved,',');
		/* Changes for the TrackerId:273053 Starts */
		 int iNoOfRemovedEDocs = getNoOfRemovedEdocs1(strListOfEDocURL,IDRemoved, iNoOfEDocs,lstEntityDocumentURL,lstIDRemoved);
		/* Changes for the TrackerId:273053 ends */
		//IDENTIFICATION DOCUMENT CHANGES Tracker ID 113276  end

		/* Fix for Ticket ID 368833 */
		String panID=req.getParameter("PAN.txt_ID");
		 //Adhar changes for tracker 375136 starts
		String UniqueIDNumber=req.getParameter("Unique Identification Number.txt_ID");
		//numeric check
		String strUniqueIDNumEnableFlag = null;
		 try{
				 Properties keyPropUID = EditorUtil.getCIFGeneralInfo();
				  strUniqueIDNumEnableFlag = keyPropUID.getProperty(ClientEditorUtil.UniqueIDNumber_ENABLE);
			}
		 catch(Exception e){
			WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
		}

		if(strUniqueIDNumEnableFlag==null){
				strUniqueIDNumEnableFlag = "false";
			}

		if(!(strUniqueIDNumEnableFlag.equalsIgnoreCase("false"))){
				if(UniqueIDNumber!=null){
					//TOL 974867 start
					//TOL 987319 start
					if(Utils.validateAdhaar(bc,acctKey,UniqueIDNumber)){
					//TOL 987319 end 
						//TOL 974867 end
								//throw new SRMBCException(SRMBCException.INVALID_INPUT_PARAM,null);
								throw new FCRMGenericException( "MSGEXC60580", new Exception( "Unique Identification No. already exists." ) );
					}
				}
		}

		String UniqueIDNumberate=req.getParameter("Unique Identification Number.txt_Issue_Date");
		String UniqueIDNumberVdate=req.getParameter("Unique Identification Number.txt_Valid_Date");
		String UniqueIDNumberPlace=req.getParameter("Unique Identification Number.txt_Issue_Place");
		//Adhar changes for tracker 375136 ends
		/* Fix for Ticket ID 368833 */
       // TRACKER ID: 113279 Begins
        String IDTypeR1=req.getParameter("IDTypeR1.txt_ID");
        String IDTypeR2=req.getParameter("IDTypeR2.txt_ID");
        String IDTypeR3=req.getParameter("IDTypeR3.txt_ID");
        String IDTypeR4=req.getParameter("IDTypeR4.txt_ID");
        String IDTypeR5=req.getParameter("IDTypeR5.txt_ID");
        // TRACKER ID: 113279 Ends
        //ticket id: 452891 tracker 274262 recon for tracker id: 242083 changes starts
       // String ssnID=req.getParameter("SSN_txt_ID");
		String ssnID=req.getParameter("SSN.txt_ID");
		//ticket id: 452891 tracker 274262 recon for tracker id: 242083 changes ends
		// Tracker ID: 132221 Begins
		String dlID=req.getParameter("Driving Licence.txt_ID");
		String pnID=req.getParameter("Passport Number.txt_ID");
		// Tracker ID: 132221 Ends
		Date ppIssueDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Psprt_issue_date"));
		Date ppValidDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Psprt_exp_date"));
		String occupation=req.getParameter("DemographicBO_MiscellaneousInfo_strText2");
				/******************************/
		/*tracker id: 166086 Changes Begin*/
		String uniqueID=req.getParameter("hidUniqueID");
		/*tracker id: 166086 Changes End*/
		/*Changes for ticketid:-333765(Trackerid:-203281) Changes Start The fetching of this uniqueid type was improper*/
		String uniqueIDType=req.getParameter("hidUniqueIDType");
		/*Changes for ticketid:-333765(Trackerid:-203281) Changes End The fetching of this uniqueid type was improper*/
		/*AccessControlChanges -ML3	start*/
		GenericUser user = AgentGroupMgr.getLoggedonUser ( bc );
		/*	BEGIN: CRM_ARCH	*/
		/*	return type of the getAgent() method changed
		 *	to SRMBOBase, hence being typecasted	*/
		AgentBO agent = (AgentBO)user.getAgent();
		/*	END: CRM_ARCH	*/
		Integer iLoggedUser = agent.getAgentID ( );
		/*AccessControlChanges -ML3	end*/
		/*Access Control Changes*/
		if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
			/* 10.2 SPE Changes */
            Integer iAgentID_prim = getAgentIDfromLoginID(bc,sManager);
			if(iAgentID_prim!=null){
				agentID_prim=iAgentID_prim.toString();
			}
            /* SPE Changes */
		}
		/*End of changes*/
		/*AccessControlChanges -ML3	start*/
		if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
			/* 10.2 SPE Changes */
			Integer iAgent_sec = getAgentIDfromLoginID(bc,sSecondaryRM);
			if(iAgent_sec!=null){
				agentID_sec=iAgent_sec.toString();
			}
            /* 10.2 SPE Changes */
		}
		/*AccessControlChanges -ML3	end*/

		//Key Generation changes
		/*if( (!codeNNTM.equals("")) || (!typeNNTM.equals("")) ){
		 htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
		 cifId = (String)htCifIds.get("nextNum");
		 coreCustId = (String)htCifIds.get("addId");
		 }*/


		/*TRACKER ID 121240 CHANGES BEGIN FOR TICKET ID 202399*/
		//Code uncommented so that proper coreCustId of length <= 9 is retreived to be set
		/*Changes for tracker 221902 starts*/
		//if(accountURL!=null)
		/*Changes for tracker 221902 ends*/
		//if((((accountURL==null) || (accountURL.equals("")))) || (copyFlag.equalsIgnoreCase("Y")))
		// {
		 /* CRM102ST:TrackerID:184529:Sanity Changes Starts */

		/**** tracker id - 200628 Changes start ***/
		/* if( (!codeNNTM.equals("")) || (!typeNNTM.equals("")) ){
			htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
			coreCustId = (String)htCifIds.get("addId");
		 }
		 else{
			coreCustId = AccountIDGen.getCoreCustId(bc);
		 }

		*/
		/**** tracker id - 200628 Changes End ***/
		//Changes for Tracker id: 356393 starts
			//changes for call id 375427 and recon of call id 372669 starts
				/*if( (!codeNNTM.equals("")) || (!typeNNTM.equals("")) ){
					htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
					coreCustId = (String)htCifIds.get("addId");
				 }
				 else{
					coreCustId = AccountIDGen.getCoreCustId(bc);
				 }*/
			//changes for call id 375427 and recon of call id 372669 ends
		 //Changes for Tracker id: 356393 ends

		 /* CRM102ST:TrackerID:184529:Sanity Changes Ends */
		 //}
		 //Changes for tracker id: 338439 ends
		 /*TRACKER ID 121240 CHANGES END FOR TICKET ID 202399*/
		//End

		/* NNTM addition - end */

//Changes for call 419509 : Recon of call 416856 starts here
	// Changes for Call id 	938759 Corecustid enhancement
	// Changes for Call id 959916
		String	CORECUSTID_SAME_AS_CIFID =null;
		try
		{
		CORECUSTID_SAME_AS_CIFID = EditorUtil.getCIFGeneralInfo().getProperty(EditorUtil.CORECUSTID_SAME_AS_CIFID).trim();
		}
		catch(NullPointerException e )
		{
				CORECUSTID_SAME_AS_CIFID ="N";
		}
if(convToCust.equalsIgnoreCase("Y") ){
	if ((CORECUSTID_SAME_AS_CIFID != null ) && (CORECUSTID_SAME_AS_CIFID .equalsIgnoreCase("Y")) && (Utils.validateciflength(acctKey)))
	{
		
		
	 coreCustId = acctKey;
	 
		
	}
	else
	{
	 
	 if (oldEntityType.equalsIgnoreCase("Prospect")){
			
			SuspectBO susBO = (SuspectBO)Utils.getBOFromID(bc,"SuspectBO",SuspectBO.SUSPECTID,oldEntityID);
			if(susBO!=null){
				
				coreCustId = AccountIDGen.getCoreCustId(bc);
               }
			}

		if (oldEntityType.equalsIgnoreCase("NonCustomer")){
		  
			NonCustomerBO ncBO = (NonCustomerBO)Utils.getBOFromID(bc,"NonCustomerBO",NonCustomerBO.NONCUSTOMERID,oldEntityID);
			if(ncBO!=null){
				
				// Call id: 662167 - Reverting changes done for Ticket id: 777026
				coreCustId = ncBO.getCore_Cust_ID();
				// Call id: 662167 - Reverting changes done for Ticket id: 777026
				
			}
        }

		if (oldEntityType.equalsIgnoreCase("Contact")){
		
			ContactBO contactBO = (ContactBO)Utils.getBOFromID(bc,"ContactBO",ContactBO.CONTACTID,oldEntityID);
			if(contactBO!=null){
			 
			  coreCustId = AccountIDGen.getCoreCustId(bc);
	       }
        }
		//Changes for call id 418591 starts
		if(coreCustId==null || coreCustId==""){
			if((!codeNNTM.equals("")) || (!typeNNTM.equals("")))
			{
				htCifIds = NNTMIdGen.getCifId(codeNNTM, typeNNTM, sPrimary_sol_id);
				coreCustId = (String)htCifIds.get("addId");
			}
			else
			{
				coreCustId = AccountIDGen.getCoreCustId(bc);
			}
		}
		//Changes for call id 418591 ends
}
}
//Changes for call 419509 : Recon of call 416856 ends here

		/****   	Approval		****/
		ContactModBO businessObjectContMod=null;
		DemographicModBO DemoBOMinorMod = null;
		PsychographicModBO PsychoBOMinorMod = null;
		/****   	Approval		****/

		ctKey      				= req.getParameter("ContactBO.contactsKey");

		if(CustomerMinor!=null && CustomerMinor.equals("Y")){

//changes for call id 371696 and recon for call id 359045 starts
			guardCode= req.getParameter("RelationshipBO.Guard_Code");
			if(guardCode==null || guardCode=="")
			guardCode= req.getParameter("Minor_guard_code");
//changes for call id 371696 and recon for call id 359045 ends
			if(guardCode!=null)
			if(!(guardCode.equalsIgnoreCase(""))){

				sChildEntity      	 	= req.getParameter("RelationshipBO.Bank_Entity");
				contactSalutation        = req.getParameter("ContactBO.salutation");
				contactFirstName       	= req.getParameter("ContactBO.firstName");
				contactLastName       	= req.getParameter("ContactBO.lastName");
				contactMiddleName        = req.getParameter("ContactBO.middleName");

				/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup SRART  */
				contactFirstName_alt1       	= req.getParameter("ContactBO.firstName_alt1");
				contactLastName_alt1       	= req.getParameter("ContactBO.lastName_alt1");
				contactMiddleName_alt1        = req.getParameter("ContactBO.middleName_alt1");
				/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup SRART  */

				contactGender       		= req.getParameter("ContactBO.gender");
				/* Tracker 129389 Changes Start*/
				//contactDOB       		= req.getParameter("3_ContactBO.DOB");
				/* Tracker 129389 Changes End*/
				contRelation			= req.getParameter("RelationshipBO.Relationship");
				//Tracker:90196: Changes for Attribute Masking
				sChildEntityID       = SRMTypedAttrStringized.getIntegerParameter(req,"hid_accountIDvalue");
				//Tracker:90196: End of Changes
				ctContactURL				=req.getParameter("hid_contactURL");
				contactDtOfBirth  = SRMTypedAttrStringized.getReqParameter( req,"3_ContactBO.DOB");
				/* Tracker 129389 Changes Start*/
				if((contactDtOfBirth!=null)&&(!contactDtOfBirth.getValue().equalsIgnoreCase(""))){
				contactDOB       		= contactDtOfBirth.getValue();
			      }
			     /* Tracker 129389 Changes End*/
				/*Tracker ID : 223255, Changes Begins*/
			if(sChildEntity==null||sChildEntity.equals("")){
				/*Tracker ID : 223255, Changes Ends*/

					Calendar cal = Calendar.getInstance();
					java.util.Date tmpDate = null;
					java.util.Date newTmpDate = null;
					long milliSec	;
					// ME TimeZone Changes
					//int deltaTime = sc.getClientTimeDiff();
					//Tracker:90196: Changes for Attribute Masking
		 /* Tracker 129389 Changes Start*/
		if((contactDtOfBirth!=null)&&(!contactDtOfBirth.getValue().equalsIgnoreCase(""))){
					String contactBday = null;
				//	String contactBmonth = null;
					String contactBYear	= null;

					if(contactDOB!=null)
					if(contactDOB.equals(EditorUtil.MASKER)){
						contactBday = "-999999";
						contactBmonth = EditorUtil.MASKER;
						contactBYear	= "-999999";
					}
					//Tracker:90196: End of Changes
					else{
						contactBday=contactDOB.substring(0,2);
						contactBmonth=contactDOB.substring(3,5);
						contactBYear=contactDOB.substring(6,10);
					}


					contactBirthDay = Integer.parseInt(contactBday);
					contactBirthYear =Integer.parseInt(contactBYear);
					/***************** Save and Submit Changes : Start*************/
					//WRITTEN AS A FUNCTION
					contactBmonth = getContactBmonth(contactBmonth);

			}
			/* Tracker 129389 Changes End*/



					/***************** Save and Submit Changes : End*************/
					int iUniqueIdentifierCont = 0;
					/*********** save and submit changes : Start****************/
					if(!apprFlag && saveFlag==0){
						/*********** save and submit changes : End****************/
						if ((ctContactURL!=null)&&(!ctContactURL.equalsIgnoreCase(""))&&(!ctContactURL.equalsIgnoreCase("0"))){

							businessObjectCont = (ContactBO)SRMURLResolver.getObject(bc, ctContactURL, true);
							iUniqueIdentifierCont = businessObjectCont.getContactID().intValue();
							Integer concurNew =  businessObjectCont.getConcurDetect_X();



						}else{
							businessObjectCont = new ContactBO();
							DemoBOMinor = new DemographicBO();
							PsychoBOMinor = new PsychographicBO();

						}

						/* CIF Changes :Autogenerated Contact ID : Start */
						if(ctContactURL!=null)
						if((ctContactURL==null) || (ctContactURL.equals(""))) {
							if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
								/* NNTM Changes start */
								//Key Generation changes
								/* if(!keyPrefix.equals("")){
								 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
								 ctKey = AccountIDGen.getAnother(bc, keyPrefix,bPopPref);
								 } else {
								 ctKey = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()),bPopPref);
								 }
								 }
								 else if(!codeNNTM.equals("")){
								 htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
								 ctKey = (String)htCifIds.get("nextNum");
								 }*/

								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKey,"Retail","","",cifmasterid);
								ctKey = (String)key.get("entityKey");
								//End
								/* NNTM Changes end */
							}
						}

						if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if ( ctKey != null && !ctKey.equals(businessObjectCont.getContactsKey())) {
								//Changes for checking the CIF IDs for all the entities
								//Key Generation changes
								/*boolean keyexists=Utils.checkExistingCIFID(bc,ctKey);

								 if (keyexists) {
								 throw new SRMBCException(
								 SRMBCException.CONTACT_KEY_ALREADY_EXISTS,
								 SRMBCException.MakeReplaceableArg(ctKey),
								 null
								 );
								 }
								 else{*/
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKey,"Retail","","",cifmasterid);
								ctKey = (String)key.get("entityKey");

								businessObjectCont.setContactsKey(ctKey);
								//  }
								//End
							}
						} else {
							businessObjectCont.setContactsKey (ctKey);

						}
						/* CIF Changes :Autogenerated Contact ID : End */


						if((contactDtOfBirth!=null)&&(!contactDtOfBirth.getValue().equalsIgnoreCase(""))){
							/* Tracker 129389 Changes Start*/
						businessObjectCont.setBirth_Day(new Integer(contactBirthDay));
						businessObjectCont.setBirth_Year(new Integer(contactBirthYear));
						businessObjectCont.setBirth_Month(contactBmonth);
							 /* Tracker 129389 Changes End*/
							cal.setTime(contactDtOfBirth.getFormatter2(context).stringToDate(contactDtOfBirth));
							tmpDate = cal.getTime();
							milliSec = tmpDate.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate = new java.util.Date(milliSec);
							businessObjectCont.setDOB(newTmpDate);
						}else{
							businessObjectCont.setDOB(null);
						}
				/*Tracker ID : 223255, Changes Begins*/
					AccMainHelper.setPrefDetails(req,businessObjectCont,contactLastName,contactFirstName,contactMiddleName);
				/*Tracker ID : 223255, Changes Ends*/
						/*tracker id 154769 changes starts*/
						/*Tracker ID 113227  Multilingual changes for Minor lookup START  */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							businessObjectCont.setLastName_alt1 (contactLastName_alt1.trim());
							businessObjectCont.setFirstName_alt1 (contactFirstName_alt1.trim());
							businessObjectCont.setMiddleName_alt1 (contactMiddleName_alt1.trim());
						}
                    	/*tracker id 154769 changes ends*/
						/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup START  */


						businessObjectCont.setGender(contactGender);
						businessObjectCont.setSalutation(contactSalutation);
		setValues(businessObjectCont);
		/*businessObjectCont.setNegated(Constants.ENTITYSTATUS_NO);
						businessObjectCont.setRecordStatus(Constants.RECORDSTATUS_ACTIVE);
						businessObjectCont.setSuspended(Constants.ENTITYSTATUS_NO);
						businessObjectCont.setBlackListed(Constants.ENTITYSTATUS_NO);
						businessObjectCont.setCONVFLAG(Constants.ENTITYSTATUS_NO);*/
						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							businessObjectCont = (com.infy.cis.srmbo.ContactBO)DualFieldSetter.invokeSetterMethods("ContactBO",businessObjectCont,req);
						}
						/*TrackerID: 113227 end of changes */


						/** Access Control Changes**/
						if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

							businessObjectCont.setAccessOwnerGroup(new Integer(accessOwnerGroup));

						}

						if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
							businessObjectCont.setAccessOwnerSegment(accessOwnerSegment);
						}

						if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
							businessObjectCont.setAccessOwnerBC(new Integer((accessOwnerBC)));
						}

						if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
							businessObjectCont.setAccessOwnerAgent(new Integer((agentID_prim)));
						}/*AccessControlChanges -ML3	start*/
						else{
							businessObjectCont.setAccessOwnerAgent(iLoggedUser);
						}
						if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
							businessObjectCont.setAccessAssigneeAgent(new Integer((agentID_sec)));
						}
						/*AccessControlChanges -ML3	end*/
						/*End of Changes**/
					}


					else {


						if ((ctContactURL!=null)&&(!ctContactURL.equalsIgnoreCase(""))&&(!ctContactURL.equalsIgnoreCase("0"))){

							businessObjectContMod = (ContactModBO)SRMURLResolver.getObject(bc, ctContactURL, true);
							iUniqueIdentifierCont = businessObjectContMod.getContactID().intValue();
							Integer concurNew =  businessObjectContMod.getConcurDetect_X();




						}else{
							businessObjectContMod = new ContactModBO();
							DemoBOMinorMod = new DemographicModBO();
							PsychoBOMinorMod = new PsychographicModBO();


						}


						/* CIF Changes :Autogenerated Contact ID : Start */
						if(ctContactURL!=null)
						if((ctContactURL==null) || (ctContactURL.equals(""))) {
							if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
								//Key Generation changes
								/*
								 if(!keyPrefix.equals("")){
								 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
								 ctKey = AccountIDGen.getAnother(bc, keyPrefix,bPopPref);
								 } else {
								 ctKey = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()),bPopPref);
								 }
								 }
								 else if(!codeNNTM.equals("")){
								 htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
								 ctKey = (String)htCifIds.get("nextNum");
								 }*/
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKey,"Retail","","",cifmasterid);
								ctKey = (String)key.get("entityKey");
								//End
							}
						}


						if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if ( ctKey != null && !ctKey.equals(businessObjectContMod.getContactsKey())) {
								//Changes for checking the CIF IDs for all the entities
								//Key Generation changes
								//End
								/*boolean keyexists=Utils.checkExistingCIFID(bc,ctKey);

								 if (keyexists) {
								 throw new SRMBCException(
								 SRMBCException.CONTACT_KEY_ALREADY_EXISTS,
								 SRMBCException.MakeReplaceableArg(ctKey),
								 null
								 );
								 }
								 else{*/
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKey,"Retail","","",cifmasterid);
								ctKey = (String)key.get("entityKey");


								businessObjectContMod.setContactsKey(ctKey);
								//}


								//End
							}
						} else {
							// TrackerID 233665 : callID 193177 (Free-text guardian details issue)changes start
							key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKey,"Retail","","",cifmasterid);
							ctKey = (String)key.get("entityKey");
							// TrackerID 233665 : callID 193177 (Free-text guardian details issue)changes end
							businessObjectContMod.setContactsKey (ctKey);

						}
						/* CIF Changes :Autogenerated Contact ID : End */

						if((contactDtOfBirth!=null)&&(!contactDtOfBirth.getValue().equalsIgnoreCase(""))){
							/* Tracker 129389 Changes Start*/
						businessObjectContMod.setBirth_Day(new Integer(contactBirthDay));
						businessObjectContMod.setBirth_Year(new Integer(contactBirthYear));
						businessObjectContMod.setBirth_Month(contactBmonth);
							/* Tracker 129389 Changes End*/
							cal.setTime(contactDtOfBirth.getFormatter2(context).stringToDate(contactDtOfBirth));
							tmpDate = cal.getTime();
							milliSec = tmpDate.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate = new java.util.Date(milliSec);
							businessObjectContMod.setDOB(newTmpDate);
						}else{
							businessObjectContMod.setDOB(null);
						}

				/*Tracker ID : 223255, Changes Begins*/
						if(contactLastName!=null)
						businessObjectContMod.setLastName (contactLastName.trim());
						if(contactFirstName!=null)
						businessObjectContMod.setFirstName (contactFirstName.trim());
						if(contactMiddleName!=null)
						businessObjectContMod.setMiddleName (contactMiddleName.trim());
					  	/*tracker id 154769 changes starts*/
						/*Tracker ID 113227  Multilingual changes for Minor lookup START  */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							if(contactLastName_alt1!=null)
							businessObjectContMod.setLastName_alt1 (contactLastName_alt1.trim());
							if(contactFirstName_alt1!=null)
							businessObjectContMod.setFirstName_alt1 (contactFirstName_alt1.trim());
							if(contactMiddleName_alt1!=null)
							businessObjectContMod.setMiddleName_alt1 (contactMiddleName_alt1.trim());
						}
				/*Tracker ID : 223255, Changes Ends*/
                        	/*tracker id 154769 changes ends*/
						/*Tracker ID 113227 Ankit Multilingual changes for Minor lookup START  */

						businessObjectContMod.setGender(contactGender);
						businessObjectContMod.setSalutation(contactSalutation);


						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							businessObjectContMod = (com.infy.cis.srmbo.ContactModBO)DualFieldSetter.invokeSetterMethods("ContactModBO",businessObjectContMod,req);

						}
						/*TrackerID: 113227 end of changes */

						/*Changes for Tracker 154769  Begin for code too large issue*/
						/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
						AccModHelper.setValuesForMod(businessObjectContMod);
						/*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/
/*Changes for Tracker 154769 End*/
						/***********CIF Changes:Micor Approval :Start********************/

						/***********CIF Changes:Micor Approval :Start********************/

						/** Access Control Changes**/
						if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

							businessObjectContMod.setAccessOwnerGroup(new Integer(accessOwnerGroup));

						}

						if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
							businessObjectContMod.setAccessOwnerSegment(accessOwnerSegment);
						}

						if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
							businessObjectContMod.setAccessOwnerBC(new Integer((accessOwnerBC)));
						}

						if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
							businessObjectContMod.setAccessOwnerAgent(new Integer((agentID_prim)));
						}/*AccessControlChanges -ML3	start*/
						else{
							businessObjectContMod.setAccessOwnerAgent(iLoggedUser);
						}
						if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
							businessObjectContMod.setAccessAssigneeAgent(new Integer((agentID_sec)));
						}

						/*AccessControlChanges -ML3	end*/
						/*End of Changes**/
					}
				}
			}
		}

//		End of changes by suman for Minor
	/*	   		if(CifmasterIDGen.isPrefixRegistered(bc, keyPrefix1)) {
			scifmasterid = CifmasterIDGen.getAnother(bc, keyPrefix1);
		} else {
			scifmasterid = CifmasterIDGen.createNew(bc, keyPrefix1, (new Integer(srmf.stringToInt(initflgCounter2)).intValue()));
		}
		 cifmasterid = Integer.valueOf(scifmasterid);    67410      */
//		Introducer Changes:start

		/****   	Introducer		****/
		ContactBO businessObjectIntro=null;
		DemographicBO DemoBOIntro = null;
		PsychographicBO PsychoBOIntro = null;
		ContactModBO businessObjectIntroMod = null;
		DemographicModBO DemoBOIntroMod = null;
		PsychographicModBO PsychoBOIntroMod = null;
		/****   	Introducer		****/
		String sChildEntityTypeIntro      	= req.getParameter("RelationshipBO.ChildEntityType");
		String sChildEntityIntro      	= req.getParameter("RelationshipBO.Bank_Entity1");

/******************************************sanity Fix for Customer not saving and submitting****Amit Malhotra*******************/
		if(null==sChildEntityIntro){
			/* Tracker 149707 STARTS
			 * As there is Introducer_EntityType as the name in the Account.xsl
			 * hence, took the value from Introducer_EntityType
			 */
			sChildEntityIntro  = req.getParameter("Introducer_EntityType");
			/* Tracker 149707 ENDS */

/******************************************sanity Fix for Customer not saving and submitting****Amit Malhotra*******************/
			if(null==sChildEntityIntro){
				sChildEntityIntro = "";
			}
		}
		/* TRACKER ID: 150936 CHANGES BEGIN */
		String introSalutation      	= req.getParameter("AccountBO.IntroducerSalutation");
		/* TRACKER ID: 150936 CHANGES END */
		//tracker id 337846 changes starts
		//String introLastName       		= req.getParameter("AccountBO.IntroducerName");
		String introLastName 				= req.getParameter("hid_IntroducerName");
		//tracker id 337846 changes ends
		/*  changes for ticket id 351073 starts*/
		String introFirstName       		= req.getParameter("IntroducerFirstName");
		String introGender       		    = req.getParameter("Gender");
		/*  changes for ticket id 351073 ends*/

		/*  113227 changes for Lookup START*/
		String introLastName_alt1	=	req.getParameter("introLastName_alt1");
		/*  113227 changes for Lookup END*/
		String sChildEntityIDIntro      = req.getParameter("hid_introIDvalue");
		//tracker id 337846 changes starts
		//String ctKeyIntro      			= req.getParameter("AccountBO.IntroducerID");
		String ctKeyIntro      			= req.getParameter("hid_IntroducerId");
		//tracker id 337846 changes ends

		if(accountURL == null || accountURL.trim().equals("")) {

			/*********** save and submit changes : End****************/


   //Changes done for Ticket ID : 244800
            //365731 changes starts
			//if(sChildEntityIntro!=null)
			if((!apprFlag||(sChildEntityIntro.equals("")||sChildEntityIntro.equals("null"))) && saveFlag!=1){
				//365731 changes ends

				/* CRM102ST:TrackerID:180222 Begin of Change */
				if(sChildEntityIntro==null || sChildEntityIntro.equals("")){
				if((introLastName!=null)&&!(introLastName.equals("")))
				{
					businessObjectIntro = new ContactBO();
					DemoBOIntro = new DemographicBO();
					PsychoBOIntro = new PsychographicBO();

					/* CIF Changes :Autogenerated Contact ID : Start */
					if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
						//Key Generation changes
						/*    if(!keyPrefix.equals("")){
						 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
						 ctKeyIntro = AccountIDGen.getAnother(bc, keyPrefix);
						 } else {
						 ctKeyIntro = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()));
						 }
						 }
						 else if(!codeNNTM.equals("")&& ctKeyIntro.equals("")){
						 htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
						 ctKeyIntro = (String)htCifIds.get("nextNum");
						 }*/
						key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
						ctKeyIntro = (String)key.get("entityKey");
						//End


					}

					/*********** save and submit changes : Start****************/
					if(!ctKeyIntro.equals("") && ctKeyIntro!=null){
						/*********** save and submit changes : End****************/

						if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if ( ctKeyIntro != null && (sChildEntityIntro == null||sChildEntityIntro.equals("") )) {
								//Changes for checking the CIF IDs for all the entities
								//Key Generation changes
								/*boolean keyexists=Utils.checkExistingCIFID(bc,ctKeyIntro);

								 if (keyexists) {*/
								/* Fix for tracker#78578 Starts : Message for Introducer Id already exists, added */
								/*              throw new SRMBCException(
								 SRMBCException.INTRODUCER_KEY_ALREADY_EXISTS,
								 SRMBCException.MakeReplaceableArg(ctKeyIntro),
								 null
								 );
								 /* Fix for tracker#78578 Ends  */
								/* }
								 else{*/
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
								ctKeyIntro = (String)key.get("entityKey");
								businessObjectIntro.setContactsKey(ctKeyIntro);
								// }
								//End
							}
						} else {
							businessObjectIntro.setContactsKey (ctKeyIntro);

						}
					}/*********** save and submit changes****************/
					/* CIF Changes :Autogenerated Contact ID : End */
					/******** Save and Submit Changes : start*********/
					if((introLastName!=null) && (!introLastName.equals(""))){
						businessObjectIntro.setLastName (introLastName.trim());
						/* changes for call id 317246 starts */
						//businessObjectIntro.setSalutation(introSalutation);
						if(sIntroducerSalutation!=null){						businessObjectIntro.setSalutation(sIntroducerSalutation);
}
						else{businessObjectIntro.setSalutation(sIntroducerSalutation1);}
			     		/* changes for call id 317246 Ends */
		setValues(businessObjectIntro);
		/*businessObjectIntro.setNegated(Constants.ENTITYSTATUS_NO);
						businessObjectIntro.setRecordStatus(Constants.RECORDSTATUS_ACTIVE);
						businessObjectIntro.setSuspended(Constants.ENTITYSTATUS_NO);
						businessObjectIntro.setBlackListed(Constants.ENTITYSTATUS_NO);
    	businessObjectIntro.setCONVFLAG(Constants.ENTITYSTATUS_NO);*/
					}/******** Save and Submit Changes :End*********/
					/** Access Control Changes**/
					if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

						businessObjectIntro.setAccessOwnerGroup(new Integer(accessOwnerGroup));

					}

					if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
						businessObjectIntro.setAccessOwnerSegment(accessOwnerSegment);
					}

					if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
						businessObjectIntro.setAccessOwnerBC(new Integer((accessOwnerBC)));
					}
					if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
						businessObjectIntro.setAccessOwnerAgent(new Integer((agentID_prim)));
					}
					/*AccessControlChanges -ML3	start*/
					else{
						businessObjectIntro.setAccessOwnerAgent(iLoggedUser);
					}
					if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
						businessObjectIntro.setAccessAssigneeAgent(new Integer((agentID_sec)));
					}
					/*AccessControlChanges -ML3	end*/
					/*End of Changes**/

				}
				}
				/* CRM102ST:TrackerID:180222 End of Change */
			}
			else {

				if(sChildEntityIntro.equals("")||sChildEntityIntro.equals(null)){
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
						businessObjectIntroMod = new ContactModBO();
						DemoBOIntroMod = new DemographicModBO();
						PsychoBOIntroMod = new PsychographicModBO();

						/* CIF Changes :Autogenerated Contact ID : Start */
						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							//Key Generation changes
							/*    if(!keyPrefix.equals("")){
							 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
							 ctKeyIntro = AccountIDGen.getAnother(bc, keyPrefix);
							 } else {
							 ctKeyIntro = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()));
							 }
							 }
							 else if(!codeNNTM.equals("")){
							 htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
							 ctKeyIntro = (String)htCifIds.get("nextNum");
							 }*/
							key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
							ctKeyIntro = (String)key.get("entityKey");
							//End


						}


						if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if ( ctKeyIntro != null && !ctKeyIntro.equalsIgnoreCase("")) {
								//Changes for checking the CIF IDs for all the entities
								//Key Generation changes
								/*boolean keyexists=Utils.checkExistingCIFID(bc,ctKeyIntro);

								 if (keyexists) {*/
								/* Fix for tracker#78578 Starts : Message for Introducer Id already exists, added */
								/*              throw new SRMBCException(
								 SRMBCException.INTRODUCER_KEY_ALREADY_EXISTS,
								 SRMBCException.MakeReplaceableArg(ctKeyIntro),
								 null
								 );*/
								/* Fix for tracker#78578 Ends  */
								/*  }
								 else{*/
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
								ctKeyIntro = (String)key.get("entityKey");
								businessObjectIntroMod.setContactsKey(ctKeyIntro);
								//   }
								//End
							}
						} else {
							businessObjectIntroMod.setContactsKey (ctKeyIntro);

						}
						/* CIF Changes :Autogenerated Contact ID : End */
						/******** Save and Submit Changes : start*********/
						if(!introLastName.equals("") && introLastName!=null){
							businessObjectIntroMod.setLastName (introLastName.trim());
							/* changes for call id 317246 starts */
							//businessObjectIntroMod.setSalutation(introSalutation);
							if(sIntroducerSalutation!=null){							businessObjectIntroMod.setSalutation(sIntroducerSalutation);
}
						else{	businessObjectIntroMod.setSalutation(sIntroducerSalutation1);}
							/* changes for call id 317246 Ends */

							/*Changes for Tracker 154769 Begin Code too large issue*/
							/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
							AccModHelper.setValuesForMod(businessObjectIntroMod);
							/*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/
							/*Changes for Tracker 154769 End */






						}
						/******** Save and Submit Changes : End*********/

						/** Access Control Changes**/
						if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

							businessObjectIntroMod.setAccessOwnerGroup(new Integer(accessOwnerGroup));

						}

						if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerSegment(accessOwnerSegment);
						}

						if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerBC(new Integer((accessOwnerBC)));
						}
						if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerAgent(new Integer((agentID_prim)));
						}
						/*AccessControlChanges -ML3	start*/
						else{
							businessObjectIntroMod.setAccessOwnerAgent(iLoggedUser);
						}
						if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessAssigneeAgent(new Integer((agentID_sec)));
						}
						/*AccessControlChanges -ML3	end*/
						/*End of Changes**/
					}

				}
			}
		}
		//365731 changes starts
		else{
			if(!apprFlag&&(sChildEntityIntro.equals("")||sChildEntityIntro.equals("null")) && saveFlag!=1){
				if(sChildEntityIntro==null || sChildEntityIntro.equals("")){
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
						businessObjectIntro = new ContactBO();
						DemoBOIntro = new DemographicBO();
						PsychoBOIntro = new PsychographicBO();
						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
							ctKeyIntro = (String)key.get("entityKey");
						}
						if(!ctKeyIntro.equals("") && ctKeyIntro!=null){
							if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
								if ( ctKeyIntro != null && (sChildEntityIntro == null||sChildEntityIntro.equals("") )) {
									key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
									ctKeyIntro = (String)key.get("entityKey");
									businessObjectIntro.setContactsKey(ctKeyIntro);
								}
							} else {
								businessObjectIntro.setContactsKey (ctKeyIntro);
							}
						}
						if((introLastName!=null) && (!introLastName.equals(""))){
							businessObjectIntro.setLastName (introLastName.trim());
							businessObjectIntro.setSalutation(introSalutation);
					        setValues(businessObjectIntro);
					    }
					    if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){
							businessObjectIntro.setAccessOwnerGroup(new Integer(accessOwnerGroup));
						}
						if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
							businessObjectIntro.setAccessOwnerSegment(accessOwnerSegment);
						}
						if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
							businessObjectIntro.setAccessOwnerBC(new Integer((accessOwnerBC)));
						}
						if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
							businessObjectIntro.setAccessOwnerAgent(new Integer((agentID_prim)));
						}
						else{
							businessObjectIntro.setAccessOwnerAgent(iLoggedUser);
						}
						if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
							businessObjectIntro.setAccessAssigneeAgent(new Integer((agentID_sec)));
						}

					}
				}
			}
			else {
				if(sChildEntityIntro.equals("")||sChildEntityIntro.equals(null)){
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
						businessObjectIntroMod = new ContactModBO();
						DemoBOIntroMod = new DemographicModBO();
						PsychoBOIntroMod = new PsychographicModBO();
						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if(ctKeyIntro != null && ctKeyIntro.equalsIgnoreCase("")){
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
								ctKeyIntro = (String)key.get("entityKey");
							}
						}
						if(isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) {
							if ( ctKeyIntro != null && ctKeyIntro.equalsIgnoreCase("")) {
								key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,ctKeyIntro,"Retail","","",cifmasterid);
								ctKeyIntro = (String)key.get("entityKey");
							}
							businessObjectIntroMod.setContactsKey(ctKeyIntro);
						} else {
								businessObjectIntroMod.setContactsKey (ctKeyIntro);

						}
						if(!introLastName.equals("") && introLastName!=null){
							businessObjectIntroMod.setLastName (introLastName.trim());
							businessObjectIntroMod.setSalutation(introSalutation);
							AccModHelper.setValuesForMod(businessObjectIntroMod);
						}
						if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerGroup(new Integer(accessOwnerGroup));
						}
						if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerSegment(accessOwnerSegment);
						}
						if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerBC(new Integer((accessOwnerBC)));
						}
						if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessOwnerAgent(new Integer((agentID_prim)));
						}
						else{
							businessObjectIntroMod.setAccessOwnerAgent(iLoggedUser);
						}
						if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
							businessObjectIntroMod.setAccessAssigneeAgent(new Integer((agentID_sec)));
						}
					}

				}
			}
		}
		//365731 changes ends


//		Introducer Changes:end



		/* FCRM62ENH: TRACKER# : 58778  END OF CHANGES */

		/********* Save and Submit Changes : Start*********/
		// CRM101UB changes :start

		String dob = null;
		try
		{
			dob = SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB").getValue();
		}
		catch (Exception e)
		{
			dob = null;
		}
		String birth_Day =null;
		String birth_month = null;
		String birth_Year = null;
		Integer birthDay = new Integer(0);
		Integer birthYear =new Integer(0);
		/*Admin Locale Date Format 330982 issue  correction Start : done by balaji01 (ticketid:363332)*/
		ArrayList alDateDeatils = getDateDetails(dob);
		if ( alDateDeatils != null ) {
			birth_Day = (String)alDateDeatils.get(0);
			birth_month = (String)alDateDeatils.get(1);
			birth_Year = (String)alDateDeatils.get(2);


			birthDay = new Integer(birth_Day);
			birthYear = new Integer(birth_Year);
		}
		/*Admin Locale Date Format 330982 issue correction End*/

		// CRM101UB changes :end

		java.util.Date tmpDate = null;
		java.util.Date newTmpDate = null;
		//CISSessionContext sc = null;
		//sc = context.getSessionContext(req);
		// ME TimeZone Changes
		//int deltaTime = sc.getClientTimeDiff();
		long milliSec;
		Calendar cal = Calendar.getInstance();


		/*  Tracker ID # 45035
		 *  This has been fixed in this release, the dates will go now as is.
		 *  This was happening as the date that was saved as GMT and when it
		 *  gets converted to local time 5.5 hrs. were getting decremented
		 *  and was taking it as the previous day.
		 */


		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int iTest = 0;
		int imonth = 0;



		SRMTypedAttrStringized concurDetect = SRMTypedAttrStringized.getReqParameter( req,"hid_concurDetectX");
		Integer concurOld = null;
		if (concurDetect != null && !concurDetect.trim().equals("")){
			concurOld = new Integer( concurDetect.getFormatter2(context).stringToInt (concurDetect));
		}


		String addType;
		String houseNo=null;
		String premiseNo;
		String building;
		String sCountry;
		String sCity;
		String sState;
		String sStartDate;
		String sZip;
		String sEndDate;
		String addrID=null;
		String streetNo;
		String town;
		String locality;
		String domicile;
		String website;
		String mailstop;
		String streetName;
		String suburb;
		String extension;
		String adrRemoved;
		String IsAddressProofRcvd;

		/* CIF PhoneEmail Changes : Start */
		String preferredFormat;
		String holdMailReason;
		String businessCenter;
		String holdMailInitiatedBy;
		String holdMailFlag;
		String freeTextLabel;
		String phoneEmailType;
		String eMail;
		String phoneOrEmail;
		String phoneNoCountryCode;
		String phoneNoCityCode;
		String phoneNoLocalCode;
		String phoneNo;
//		String emailPalm;
		String phoneEmailID;
		/*413659*/
		String USERFIELD1;	// Changes for Call id: 644068

		String phoneEmailRemoved;
		/* CIF PhoneEmail Changes : End */

		String City_code = null;
		String State_code = null;
		String Country_code = null;

		/*String ADD_MLUSERFIELD1 = null;
		String ADD_MLUSERFIELD2 = null;
		String ADD_MLUSERFIELD3 = null;
		String ADD_MLUSERFIELD4 = null;
		String ADD_MLUSERFIELD5 = null;
		String ADD_MLUSERFIELD6 = null;
		String ADD_MLUSERFIELD7 = null;
		String ADD_MLUSERFIELD8 = null;
		String ADD_MLUSERFIELD9 = null;
		String ADD_MLUSERFIELD10 = null;
		String ADD_MLUSERFIELD11 = null;
		String ADD_MLUSERFIELD12 = null;
		String ADD_MLUSERFIELD13 = null;
		String ADD_MLUSERFIELD14 = null;
		String ADD_MLUSERFIELD15 = null;
		String ADD_MLUSERFIELD16 = null;
		String ADD_MLUSERFIELD17 = null;
		String ADD_MLUSERFIELD18 = null;
		String ADD_MLUSERFIELD19 = null;
		String ADD_MLUSERFIELD20 = null;
		String ADD_MLUSERFIELD21 = null;
		String ADD_MLUSERFIELD22 = null;
		String ADD_MLUSERFIELD23 = null;
		String ADD_MLUSERFIELD24 = null;
		String ADD_MLUSERFIELD25 = null;
		String ADD_MLUSERFIELD26 = null;
		String ADD_MLUSERFIELD27 = null;
		String ADD_MLUSERFIELD28 = null;
		String ADD_MLUSERFIELD29 = null;
		String ADD_MLUSERFIELD30 = null;
		*/
		// HouseHold Changes : Start

		String strHouseHoldName 		= null;
		String strHouseHoldID   		= null;
		String strHouseHoldCode   		= null;
		String strHouseHoldMasterID	    = null;
		String strHouseHoldRemoved 		= null;
		// HouseHold Changes :End


		/*
		 *	MLUSERFIELDS Inclusion - End
		 */


		List lstaddID = null;

		//List lstID = null;
		List lstAddressType=null;
		List lsthouseNo = null;
		List lstpremiseNo = null;
		List lstbuilding = null;
		List lstcountry = null;
		List lstcity = null;
		List lststate = null;
		List lststartDate = null;
		List lstZip = null;
		List lstendDate = null;
		List lststreetNo = null;
		List lsttown = null;
		List lstlocality = null;
		List lstdomicile = null;
//		List lstaddressProof = null;
		List lsthomePhone = null;
		List lstworkPhone = null;
		List lstcellNo = null;
		List lstfaxNo = null;

		List lstwebsite = null;
		List lstmailstop = null;
		List lststreetName = null;
		List lstsuburb = null;
		List lstIsAddressProofRcvd = null;

//		AdressLine changes: START
		List lstAddressLine1 = null;
		List lstAddressLine2 = null;
		List lstAddressLine3 = null;
//		AdressLine changes: END
		/* CIF PhoneEmail Changes : Start */
		List lstpreferredFormat = null;
		List lstholdMailReason = null;
		List lstbusinessCenter = null;
		List lstholdMailInitiatedBy = null;
		List lstholdMailFlag = null;
		List lstfreeTextLabel = null;

		List lstPhoneEmailType = null;
		List lstPhoneorEmail = null;
		List lsteMail = null;
//		List lstEmailPalm =null;
		List lstPhoneEmailID = null;
		/*413659*/
		List lstUSERFIELD1 = null;	// Changes for Call id: 644068
		List lstPhone = null;
		List lstPhoneCountryCode = null;
		List lstPhoneCityCode = null;
		List lstPhoneLocalCode = null;
		List lstPhoneEmailRemoved = null;
		/* CIF PhoneEmail Changes : End*/
		List lstextension = null;
		List lstUpdateDateFlag =null;
		List lstadrRemoved = null;

		List lstCity_code = null;
		List lstState_code = null;
		List lstCountry_code = null;
		/*List lstSalutation_code = null;*/
		/*
		 *	Core Fields Inclusion - End
		 */
		/* 10.2 SPE Changes */
		int addrTypeSize=0;
		int strtDateSize=0;
		int endDateSize=0;
		int houseNoSize=0;
		int buildingSize=0;
		int premiseNoSize=0;
		int countrySize=0;
		int citySize=0;
		int stateSize=0;
		int zipSize=0;
		int streetNoSize=0;
		int townSize=0;
		int localitySize=0;
		int domicileSize=0;
		int websiteSize=0;
		int mailstopSize=0;
		int streetNameSize=0;
		int suburbSize=0;
		int addrProofSize=0;
		int prefFormatSize=0;
		int holdMailSize=0;
		int bizcenterSize=0;
		int holdMailInitSize=0;
		int holdMailFlagSize=0;
		int freeTxtLabelSize=0;
		int addrLine1Size=0;
		int addrLine2Size=0;
		int addrLine3Size=0;

		int phorEmailSize=0;
		int phEmailTypeSize=0;
		int eMailSize=0;
		int phnEmailIDSize=0;
		int phoneSize=0;
		int phnCntrySize=0;
		/*413659*/
		int USERFIELD1Size=0;	// Changes for Call id: 644068
		int phnCitySize=0;
		int phnLocalSize=0;
		int phnEmailRemSize=0;
		int extnSize=0;
		int upDtFlagSize=0;
		int adrRemSize=0;
		int cityCodeSize=0;
		int stateCodeSize=0;
		int cntryCodeSize=0;
		/* 10.2 SPE Changes */

		/* Swift Adress changes */
        String SwiftAddr2=null;
        /* Swift Adress changes */
		String strEnd_Date="";
		String stStart_Date="";
		String strHouse_No="";
		String strBuilding_Level="";
		String strStreet_No="";
		String strStreet_Name="";
		String strSuburb="";
		String strLocality_Name="";
		String strTown="";
		String strCity="";
		String strState="";
		String strCountry="";
		String strZip="";
		String Addr1="";
		String Addr2="";
		String Addr3="";
		String AddressFields="";
		String strMail_Stop="";
		String currMailingCellPhone="";
		String currMailingEmailPalm="";
		String currMailingCity="";
		/*Changes for Ticketid:-326876 Changes Begin*/
		String currMailingState="";
		String currMailingCountry="";
		String currMailingZip="";
		/*Changes for Ticketid:-326876 Changes Begin*/
		String currWorkWorkPhone="";
		String currWorkFaxNo="";
		String currWorkEmail="";
		String currWorkURL="";
		String currWorkExtension="";
		String currHomeHomePhone="";
		String currHomeEmail="";
		String strOtherTFFields="";
		String strCity_code="";
		String strCountry_code="";
		String strIsAddressProofRcvd = "";

		/* CIF Changes for Address Line Fields : Start */
		String strAL_Addr1="";
		String strAL_Addr2="";
		String strAL_Addr3="";
		/* CIF Changes for Address Line Fields : End */


		// HouseHold Changes : Start
		List lstHouseHoldName = null;
		List lstHouseHoldID   = null;
		List lstHouseHoldCode   	= null;
		List lstHouseHoldMasterID   = null;
		List lstHouseHoldRemoved = null;

		// HouseHold Changes : End

//		CRM101UB Group changes :start
		List lstGrpName			= null;
		List lstGrpID 			= null;
		List lstGrpCode 		= null;
		List lstGrpMasID 		= null;
		List lstGrpURL			= null;
		List lstGrpRem     		= null;
		List lstPerShare		= null;
		List lstGroup_ID		= null;
		List lstPrimary			= null;
//		CRM101UB Group changes : end
		/* 10.2 SPE Changes */
		int hshldNameSize = 0;
		int hshldIDSize = 0;
		int hshldCodeSize = 0;
		int hshldMasterIDSize = 0;
		int hshldRemSize = 0;
		int grpNameSize = 0;
		int grpIDSize = 0;
		int grpCodeSize = 0;
		int grpMasIDSize = 0;
		int grpURLSize = 0;
		int grpRemSize = 0;
		int perShareSize = 0;
		int grp_IDSize = 0;
		int primarySize = 0;
		/* 10.2 SPE Changes */
		/* CIF PhoneEmail Changes : Start */
		String preferredAddress = "";
		String preferredPhone = "";
		String preferredEmail = "";

                 /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert Server recon in 10.2.14 starts
		String strPreferred_Mbl_Alert="";
		String strEnable_Alerts="";
		String strDefaultChannel_Alert="";
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert Server recon in 10.2.14 ends
		/* CIF PhoneEmail Changes : End */

		if(ScreenName!=null)
		if(ScreenName.trim().equalsIgnoreCase("CIF")){

			//CIF Address additions- begin

			addType = req.getParameter("address_type");
			houseNo = req.getParameter("houseno");
			premiseNo = req.getParameter("premiseno");
			building = req.getParameter("building");
			sCountry = req.getParameter("country");
			sCity = req.getParameter("city");
			sState = req.getParameter("state");
			sStartDate = req.getParameter("start_date");
			sZip = req.getParameter("zip");
			sEndDate = req.getParameter("end_date");
			addrID = req.getParameter("addrID");
			streetNo = req.getParameter("streetno");
			town = req.getParameter("town");
			locality = req.getParameter("locality");
			domicile = req.getParameter("domicile");
			website = req.getParameter("website");
			mailstop = req.getParameter("mailstop");
			streetName = req.getParameter("streetname");
			suburb = req.getParameter("suburb");
			extension = req.getParameter("extension");
			adrRemoved = req.getParameter("AdrRemoved");
			IsAddressProofRcvd = req.getParameter("IsAddressProofRcvd");

			/* CIF PhoneEmail Changes : Start */
			preferredAddress = req.getParameter("PreferredAddress");
			preferredPhone = req.getParameter("PreferredPhone");
			if(preferredPhone!=null)
			preferredPhone.trim();
			preferredEmail = req.getParameter("PreferredEmail");
			preferredFormat = req.getParameter("PreferredFormat");
			holdMailReason = req.getParameter("HoldMailReason");
			businessCenter = req.getParameter("BusinessCenter");
			holdMailInitiatedBy = req.getParameter("HoldMailInitiatedBy");
			holdMailFlag = req.getParameter("HoldMailFlag");

			//changes for tracker 159095 start
			freeTextLabel = req.getParameter("FreeTextLabel");
			//changes for tracker 159095 end

                 /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
		//Changes for Alert Server recon in 10.2.14 starts
	            strPreferred_Mbl_Alert			   =req.getParameter(boName+".Preferred_Mobile_Alert_Type");
				strEnable_Alerts                   =req.getParameter(boName+".Enable_Alerts");
//changes for call-id 417828 -- start
				//strDefaultChannel_Alert            =req.getParameter(boName+"DefaultChannel_Alert");
strDefaultChannel_Alert            =req.getParameter("DefaultChannel_Alert");
//changes for call-id 417828 -- end
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
		//Changes for Alert Server recon in 10.2.14 ends
			phoneOrEmail = req.getParameter("PhoneOrEmail");
			phoneEmailType = req.getParameter("PhoneEmailType");
			phoneNoCountryCode = req.getParameter("PhoneNoCountryCode");
			phoneNoCityCode = req.getParameter("PhoneNoCityCode");
			phoneNoLocalCode = req.getParameter("PhoneNoLocalCode");
			phoneNo = req.getParameter("PhoneNo");
			eMail = req.getParameter("Email");
//			emailPalm = req.getParameter("EmailPalm");
			phoneEmailID = req.getParameter("PhoneEmailID");
			/*413659*/
			USERFIELD1 = req.getParameter("USERFIELD1");	// Changes for Call id: 644068
			phoneEmailRemoved = req.getParameter("PhoneEmailRemoved");

			City_code 			= req.getParameter("city_code");
			State_code 				= req.getParameter("state_code");
			Country_code 			= req.getParameter("country_code");

			strHouseHoldName        = req.getParameter("HouseHoldName");
			strHouseHoldCode        = req.getParameter("HouseHoldCode");
			strHouseHoldMasterID    = req.getParameter("HouseHoldMasterID");
			strHouseHoldID          = req.getParameter("HouseHoldID");

			strHouseHoldRemoved    	= req.getParameter("HouseHoldRemoved");


			lstaddID 				= Utils.parseString(addrID,',');
			lstAddressType 			= Utils.parseString(addType,',');
            /* 10.2 SPE Changes for size Start */
            if(lstAddressType!=null){
			addrTypeSize		= lstAddressType.size();
			}
			/*Tracker 159095 :Sonali begin of changes*/
			lsthouseNo				= Utils.parseString(houseNo,'%');
			if(lsthouseNo!=null){
			houseNoSize			= lsthouseNo.size();
			}
			lstpremiseNo			= Utils.parseString(premiseNo,'%');
			if(lstpremiseNo!=null){
			premiseNoSize		= lstpremiseNo.size();
			}
			lstbuilding				= Utils.parseString(building,'%');
			/*Tracker 159095 : Sonali end of changes*/
			if(lstbuilding!=null){
			buildingSize		= lstbuilding.size();
			}
			lstcountry				= Utils.parseString(sCountry,',');
			if(lstcountry!=null){
			countrySize		    = lstcountry.size();
			}
			lstcity			    	= Utils.parseString(sCity,',');
			if(lstcity!=null){
			citySize		    = lstcity.size();
			}
			lststate			    = Utils.parseString(sState,',');
			if(lststate!=null){
			stateSize		    = lststate.size();
			}
			lststartDate			= SRMTypedAttrStringized.parseString(req,sStartDate,',');
			if(lststartDate!=null){
			strtDateSize		= lststartDate.size();
			}
			lstZip					= Utils.parseString(sZip,',');
			if(lstZip!=null){
			zipSize		   		= lstZip.size();
			}
			//List lstendDate			= Utils.parseString(endDate,',');
			lstendDate				= SRMTypedAttrStringized.parseString(req,sEndDate,',');
			if(lstendDate!=null){
			endDateSize			= lstendDate.size();
			}
			/*Tracker 159095 :Sonali begin of changes*/
			lststreetNo				= Utils.parseString(streetNo,'%');
			if(lststreetNo!=null){
			streetNoSize	   	= lststreetNo.size();
			}
			lsttown					= Utils.parseString(town,'%');
			if(lsttown!=null){
			townSize	   		= lsttown.size();
			}
			lstlocality				= Utils.parseString(locality,'%');
			if(lstlocality!=null){
			localitySize   		= lstlocality.size();
			}
			lstdomicile				= Utils.parseString(domicile,'%');
			if(lstdomicile!=null){
			domicileSize   		= lstdomicile.size();
			}
			lstwebsite				= Utils.parseString(website,'%');
			//Changes for Call Id 352100 Starts
			if(lstwebsite!=null){
			//Changes for Call Id 352100 Ends
			websiteSize   		= lstwebsite.size();
			}
			lstmailstop				= Utils.parseString(mailstop,'%');
			if(lstmailstop!=null){
			mailstopSize   		= lstmailstop.size();
			}
			lststreetName			= Utils.parseString(streetName,'%');
			if(lststreetName!=null){
			streetNameSize 		= lststreetName.size();
			}
			lstsuburb				= Utils.parseString(suburb,'%');
			/*Tracker 159095 : Sonali end of changes*/
			if(lstsuburb!=null){
			suburbSize 			= lstsuburb.size();
			}
			lstIsAddressProofRcvd	= Utils.parseString(IsAddressProofRcvd,',');
			if(lstIsAddressProofRcvd!=null){
			addrProofSize		= lstIsAddressProofRcvd.size();
			}
			/* CIF PhoneEmail Changes : Start */
			lstpreferredFormat = Utils.parseString(preferredFormat,',');
			if(lstpreferredFormat!=null){
			prefFormatSize = lstpreferredFormat.size();
			}
			lstholdMailReason = Utils.parseString(holdMailReason,',');
			if(lstholdMailReason!=null){
			holdMailSize  = lstholdMailReason.size();
			}
			lstbusinessCenter = Utils.parseString(businessCenter,',');
			if(lstbusinessCenter!=null){
			bizcenterSize  = lstbusinessCenter.size();
			}
			lstholdMailInitiatedBy = Utils.parseString(holdMailInitiatedBy,',');
			if(lstholdMailInitiatedBy!=null){
			holdMailInitSize  = lstholdMailInitiatedBy.size();
			}
			lstholdMailFlag = Utils.parseString(holdMailFlag,',');
			if(lstholdMailFlag!=null){
			holdMailFlagSize = lstholdMailFlag.size();
			}
			/*Tracker 159095 :Sonali begin of changes*/
			lstfreeTextLabel = Utils.parseString(freeTextLabel,'%');
			/*Tracker 159095 : sonali end of changes*/
			if(lstfreeTextLabel!=null){
			freeTxtLabelSize = lstfreeTextLabel.size();
			}
			lstPhoneEmailType = Utils.parseString(phoneEmailType,',');
			if(lstPhoneEmailType!=null)
			phEmailTypeSize = lstPhoneEmailType.size();
			lstPhoneorEmail			= Utils.parseString(phoneOrEmail,',');
			if(lstPhoneorEmail!=null)
			phorEmailSize = lstPhoneorEmail.size();
			lstPhoneCountryCode = Utils.parseString(phoneNoCountryCode,',');
			if(lstPhoneCountryCode!=null)
			phnCntrySize = lstPhoneCountryCode.size();
			/*413659*/
			// Changes for Call id: 644068 starts
			lstUSERFIELD1 =  Utils.parseString(USERFIELD1,',');
			if(lstUSERFIELD1!=null)
			USERFIELD1Size = lstUSERFIELD1.size();
			// Changes for Call id: 644068 ends
			lstPhoneCityCode = Utils.parseString(phoneNoCityCode,',');
			if(lstPhoneCityCode!=null)
			phnCitySize = lstPhoneCityCode.size();
			lstPhoneLocalCode = Utils.parseString(phoneNoLocalCode,',');
			if(lstPhoneLocalCode!=null)
			phnLocalSize = lstPhoneLocalCode.size();
//			AdressLine changes: START
			/*Tracker 159095 :Sonali begin of changes*/
			String addressLine1 = req.getParameter("AddressLine1");
			String addressLine2 = req.getParameter("AddressLine2");
			String addressLine3 = req.getParameter("AddressLine3");

			lstAddressLine1 = Utils.parseString(addressLine1,'%');
			if(lstAddressLine1!=null){
			addrLine1Size=lstAddressLine1.size();
			}
		        lstAddressLine2 = Utils.parseString(addressLine2,'%');
		    if(lstAddressLine2!=null){
			addrLine2Size=lstAddressLine2.size();
			}
			lstAddressLine3 = Utils.parseString(addressLine3,'%');
			/*Tracker 159095 : sonali end of changes*/
			if(lstAddressLine3!=null){
			addrLine3Size=lstAddressLine3.size();
			}
//			AdressLine changes: END


			lstPhoneEmailID			= Utils.parseString(phoneEmailID,',');
//			lstEmailPalm			= Utils.parseString(emailPalm,',');
			lsteMail				= Utils.parseString(eMail,',');
			if(lsteMail!=null)
			eMailSize= lsteMail.size();
			lstPhone				= Utils.parseString(phoneNo,',');
			if(lstPhone!=null)
			phoneSize	= lstPhone.size();

			lstPhoneEmailRemoved	= Utils.parseString(phoneEmailRemoved,',');
			if(lstPhoneEmailRemoved!=null)
			phnEmailRemSize			= lstPhoneEmailRemoved.size();
			lstextension			= Utils.parseString(extension,',');
			if(lstextension!=null)
			extnSize				= lstextension.size();
			lstUpdateDateFlag		= Utils.parseString(updateflag,',');
			if(lstUpdateDateFlag!=null)
			upDtFlagSize			= lstUpdateDateFlag.size();
			lstadrRemoved			= Utils.parseString(adrRemoved,',');
			if(lstadrRemoved!=null)
			adrRemSize				= lstadrRemoved.size();
			lstCity_code 			= Utils.parseString(City_code,',');
			if(lstCity_code!=null)
			cityCodeSize			= lstCity_code.size();
			lstState_code 			= Utils.parseString(State_code,',');
			if(lstState_code!=null)
			stateCodeSize			= lstState_code.size();
			lstCountry_code 		= Utils.parseString(Country_code,',');
			if(lstCountry_code!=null)
			cntryCodeSize			= lstCountry_code.size();

			//HouseHold Changes : Start

			lstHouseHoldName 			= Utils.parseString(strHouseHoldName,'$');
			lstHouseHoldCode   			= Utils.parseString(strHouseHoldCode,'$');
			lstHouseHoldID   			= Utils.parseString(strHouseHoldID,'$');
			lstHouseHoldMasterID   		= Utils.parseString(strHouseHoldMasterID,'$');
			lstHouseHoldRemoved   		= Utils.parseString(strHouseHoldRemoved,',');
			if(lstHouseHoldName!=null)
			hshldNameSize				= lstHouseHoldName.size();
			//hshldIDSize 				= lstHouseHoldID.size();
			if(lstHouseHoldCode!=null)
			hshldCodeSize 				= lstHouseHoldCode.size();
			if(lstHouseHoldMasterID!=null)
			hshldMasterIDSize			= lstHouseHoldMasterID.size();
			if(lstHouseHoldRemoved!=null)
			hshldRemSize 				= lstHouseHoldRemoved.size();
			//HouseHold Changes : End
//			CRM101UB Group changes : Start
			String strGrpName 		= req.getParameter("GroupName");
			String strGrpID 		= req.getParameter("GroupID");
			String strGrpCode 		= req.getParameter("GroupCode");
			String strGrpMasID 		= req.getParameter("GroupMasterID");
			String strGrpURL		= req.getParameter("GroupURL");
			String strGrpRem		= req.getParameter("GroupRemoved");
			String strPercentShare	= req.getParameter("PercentShare");
			String strGroup_ID		= req.getParameter("Group_ID");
			String strPrimary		= req.getParameter("Prim_Grp_ID");
			lstGrpName			= Utils.parseString(strGrpName,'$');
			lstGrpID 			= Utils.parseString(strGrpID,'$');
			lstGrpCode 		= Utils.parseString(strGrpCode,'$');
			lstGrpMasID 		= Utils.parseString(strGrpMasID,'$');
			lstGrpURL			= Utils.parseString(strGrpURL,'$');
			lstGrpRem     		= Utils.parseString(strGrpRem,',');
			lstPerShare		= Utils.parseString(strPercentShare,'$');
			lstGroup_ID		= Utils.parseString(strGroup_ID,'$');
			lstPrimary			= Utils.parseString(strPrimary,'$');
            if(lstGrpName!=null)
			grpNameSize 	= lstGrpName.size();
			 if(lstGrpID!=null)
			grpIDSize 		= lstGrpID.size();
			if(lstGrpCode!=null)
			grpCodeSize	    = lstGrpCode.size();
			if(lstGrpMasID!=null)
			grpMasIDSize 	= lstGrpMasID.size();
			if(lstGrpRem!=null)
			grpRemSize 		= lstGrpRem.size();
			if(lstPerShare!=null)
			perShareSize 	= lstPerShare.size();
			if(lstGroup_ID!=null)
			grp_IDSize 		= lstGroup_ID.size();
			if(lstPrimary!=null)
			primarySize		= lstPrimary.size();
			/* 10.2 SPE Changes for size End*/
//			CRM101UB Group changes : End

			Date dt1= new Date();
			int k=0;


			int addrIndexWork = -1;
			int addrIndexHome = -1;
			int indexFax = -1;
			int indexPhoneWork=-1;
			int indexPhoneHome=-1;
			int indexPhoneMobile=-1;
			int indexPhoneFax=-1;
			int indexEmailWork=-1;
			int indexEmailHome=-1;
			int indexEmailPalm=-1;
			/* Core Dependency Changes*/
			int indexCommPhone1= -1;
			/* Core Dependency Changes*/

			/* CIF PhoneEmail Changes : End*/
			long milliSec1=0;
			long milliSec2=0;
			long milliSec3=0;
			java.util.Date tmpDate1 = null;
			java.util.Date tmpDate2 = null;







			/*** tracker 132659 start*/
			long swiftDate = 0;
			/**** tracker 132659 end*/

			for(int j =0;j < addrTypeSize;j++)
			{

				String strAddrType = (((StringBuffer)lstAddressType.get(j)).toString());
				if(j<strtDateSize && is_valid_req_arg(((StringBuffer)lststartDate.get(j)).toString()))
				{
					stStart_Date = (((StringBuffer)lststartDate.get(j)).toString());
				}

				//if(j<lstendDate.size() && is_valid_req_arg(((StringBuffer)lstendDate.get(j)).toString()))
				if(j<endDateSize)
				{
					strEnd_Date = (((StringBuffer)lstendDate.get(j)).toString());
				}

				Calendar cal2 = Calendar.getInstance();
				// ME TimeZone Changes : Start
				//int deltaTime2 = sc.getClientTimeDiff();

				SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
				/* CRM70t-ST: TRACKER# : 80505	BEGIN OF CHANGES */
				if((stStart_Date!=null)&&(!stStart_Date.equalsIgnoreCase(""))&&(!stStart_Date.equalsIgnoreCase(" "))){
					cal2.setTime((Date)srfm.stringToDate(stStart_Date));
					tmpDate1 = cal2.getTime();
					/*milliSec1 = tmpDate1.getTime();
					 milliSec1 -= deltaTime2 * 1000 * 60;*/
					milliSec1 = (SRMDate.getGMT(tmpDate1)).getTime();
					milliSec1 +=(24*60*60*1000);
				} else {
					cal2.setTime(new Date());
					tmpDate1 = cal2.getTime();
					/*milliSec1 = tmpDate1.getTime();
					 milliSec1 -= deltaTime2 * 1000 * 60;*/
					milliSec1 = (SRMDate.getGMT(tmpDate1)).getTime();
					milliSec1 +=(24*60*1000);
				}
				/* CRM70t-ST: TRACKER# : 80505	END OF CHANGES */

				if ((strEnd_Date!=null)&&(!strEnd_Date.trim().equals("")))
				{
					cal.setTime((Date)srfm.stringToDate(strEnd_Date));
					tmpDate2 = cal.getTime();
					/*milliSec2 = tmpDate2.getTime();
					 milliSec2 -= deltaTime2 * 1000 * 60;*/
					milliSec2 = (SRMDate.getGMT(tmpDate2)).getTime();
					milliSec2 +=(24*60*60*1000);
				}
				else
				{
					milliSec2=0;
				}

				/*milliSec3=dt1.getTime();
				 milliSec3 -= deltaTime2 * 1000 * 60;*/
				milliSec3 = (SRMDate.getGMT(dt1)).getTime();
				milliSec3 +=(24*60*60*1000);
				// ME TimeZone Changes : End
				if(strAddrType!=null)
				if(((strAddrType.trim()).equalsIgnoreCase("MAILING"))&&((milliSec2 == 0)&&(milliSec3>milliSec1)||(milliSec2 != 0)&&(milliSec3<milliSec2)&&(milliSec3>milliSec1)))
				{
					k=j;
					//Tracker:90196: Changes for Attribute Masking
					mailingIndex = j;
					//Tracker:90196: End of Changes for Attribute Masking

				}
				/************************ SwiftAddress start tracker : 132659 ***************************************/
				if(strAddrType!=null)
				if((strAddrType.trim()).equalsIgnoreCase(preferredAddress))
				{
					if(swiftDate==0){
						swiftDate = milliSec1;
						SwiftData = setSwiftFields(req,j);
					}else if(swiftDate<milliSec1){
						swiftDate = milliSec1;
						SwiftData = setSwiftFields(req,j);
					}
				}
				/************************ SwiftAddress End tracker : 132659 ***************************************/
				if(strAddrType!=null)
				if(((strAddrType.trim()).equalsIgnoreCase("Work")))
				{
					/* CIF PhoneEmail Changes : Start*/
					addrIndexWork=j;
					/* CIF PhoneEmail Changes : End*/
				}
				if(strAddrType!=null)
				if(((strAddrType.trim()).equalsIgnoreCase("HOME")))
				{
					/* CIF PhoneEmail Changes : Start*/
					addrIndexHome=j;
					/* CIF PhoneEmail Changes : End*/
				}
				//Changes for 417311 Starts
				//Changes for call id 418886, 421565 STARTS
				if (strAddrType!=null && strAddrType.trim().equalsIgnoreCase(preferredAddress) && ((milliSec2 == 0)&&(milliSec3>milliSec1)||(milliSec2 != 0)&&(milliSec3<milliSec2)&&(milliSec3>milliSec1)||(milliSec2 != 0)&&(milliSec1==milliSec2))){
				//Changes for call id 418886, 421565 ENDS
					if(j<lstcity.size() && is_valid_req_arg(((StringBuffer)lstcity.get(j)).toString()))
					{
						currMailingCity = (((StringBuffer)lstcity.get(j)).toString());
					}
					if(j<lststate.size() && is_valid_req_arg(((StringBuffer)lststate.get(j)).toString()))
					{
						currMailingState = (((StringBuffer)lststate.get(j)).toString());
					}
					if(j<lstcountry.size() && is_valid_req_arg(((StringBuffer)lstcountry.get(j)).toString()))
					{
						currMailingCountry = (((StringBuffer)lstcountry.get(j)).toString());
					}
					if(j<lstZip.size() && is_valid_req_arg(((StringBuffer)lstZip.get(j)).toString()))
					{
						currMailingZip = (((StringBuffer)lstZip.get(j)).toString());
					}
					break;
				}
				//Changes for 417311 Ends
			}

			/* CIF PhoneEmail Changes : Start */
			for(int phEm =0;phEm < phEmailTypeSize;phEm++)
			{

				String strPhoneEmailType1 = (((StringBuffer)lstPhoneEmailType.get(phEm)).toString());
				if(strPhoneEmailType1!=null){

				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.WORKPH1)))
				{
					indexPhoneWork=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.HOMEPH1)))
				{
					indexPhoneHome=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.FAX1)))
				{
					indexPhoneFax=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase("MOBILE")))
				{
					indexPhoneMobile=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.HOMEEML)))
				{
					indexEmailHome=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.PALMEML)))
				{
					indexEmailPalm=phEm;
				}
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.WORKEML)))
				{
					indexEmailWork=phEm;
				}
				/* Core Dependency Changes*/
				if(((strPhoneEmailType1.trim()).equalsIgnoreCase(Constants.CELLPH)))
				{
					indexCommPhone1=phEm;
				}
				}
				/* Core Dependency Changes*/
			}
			/* CIF PhoneEmail Changes : End*/

			if(k<houseNoSize && is_valid_req_arg(((StringBuffer)lsthouseNo.get(k)).toString()))
			{
				strHouse_No = (((StringBuffer)lsthouseNo.get(k)).toString());
			}
			if(k<buildingSize && is_valid_req_arg(((StringBuffer)lstbuilding.get(k)).toString()))
			{
				strBuilding_Level = (((StringBuffer)lstbuilding.get(k)).toString());
			}
			if(k<streetNoSize && is_valid_req_arg(((StringBuffer)lststreetNo.get(k)).toString()))
			{
				strStreet_No = (((StringBuffer)lststreetNo.get(k)).toString());
			}
			if(k<streetNameSize && is_valid_req_arg(((StringBuffer)lststreetName.get(k)).toString()))
			{
				strStreet_Name = (((StringBuffer)lststreetName.get(k)).toString());
			}
			if(k<addrProofSize && is_valid_req_arg(((StringBuffer)lstIsAddressProofRcvd.get(k)).toString()))
			{
				strIsAddressProofRcvd = (((StringBuffer)lstIsAddressProofRcvd.get(k)).toString());
			}
			if(k<suburbSize && is_valid_req_arg(((StringBuffer)lstsuburb.get(k)).toString()))
			{
				strSuburb = (((StringBuffer)lstsuburb.get(k)).toString());
			}
			if(k<localitySize && is_valid_req_arg(((StringBuffer)lstlocality.get(k)).toString()))
			{
				strLocality_Name = (((StringBuffer)lstlocality.get(k)).toString());
			}
			if(k<townSize && is_valid_req_arg(((StringBuffer)lsttown.get(k)).toString()))
			{
				strTown = (((StringBuffer)lsttown.get(k)).toString());
			}
			if(k<citySize && is_valid_req_arg(((StringBuffer)lstcity.get(k)).toString()))
			{
				strCity = (((StringBuffer)lstcity.get(k)).toString());
			}
			if(k<stateSize && is_valid_req_arg(((StringBuffer)lststate.get(k)).toString()))
			{
				strState = (((StringBuffer)lststate.get(k)).toString());
			}
			if(k<countrySize && is_valid_req_arg(((StringBuffer)lstcountry.get(k)).toString()))
			{
				strCountry = (((StringBuffer)lstcountry.get(k)).toString());
			}
			if(k<zipSize && is_valid_req_arg(((StringBuffer)lstZip.get(k)).toString()))
			{
				strZip = (((StringBuffer)lstZip.get(k)).toString());
			}
			if(k<mailstopSize && is_valid_req_arg(((StringBuffer)lstmailstop.get(k)).toString()))
			{
				strMail_Stop = (((StringBuffer)lstmailstop.get(k)).toString());
			}
			if(k<cityCodeSize && is_valid_req_arg(((StringBuffer)lstCity_code.get(k)).toString()))
			{
				strCity_code = (((StringBuffer)lstCity_code.get(k)).toString());
			}
			if(k<cntryCodeSize && is_valid_req_arg(((StringBuffer)lstCountry_code.get(k)).toString()))
			{
				strCountry_code = (((StringBuffer)lstCountry_code.get(k)).toString());
			}
			/* Ticket ID:251109: Haripriya */

			/*Changes for Ticketid:-326876 Changes End*/
			/* CIF PhoneEmail Changes : Start */
			if(indexPhoneWork>=0){
				if(indexPhoneWork<phoneSize && is_valid_req_arg(((StringBuffer)lstPhone.get(indexPhoneWork)).toString()))
				{
					currWorkWorkPhone = (((StringBuffer)lstPhone.get(indexPhoneWork)).toString());
				}
				if(indexPhoneWork<extnSize && is_valid_req_arg(((StringBuffer)lstextension.get(indexPhoneWork)).toString()))
				{
					currWorkExtension = (((StringBuffer)lstextension.get(indexPhoneWork)).toString());
				}

			}

			if(indexPhoneHome>=0){
				if(indexPhoneHome<phoneSize && is_valid_req_arg(((StringBuffer)lstPhone.get(indexPhoneHome)).toString()))
				{
					currHomeHomePhone = (((StringBuffer)lstPhone.get(indexPhoneHome)).toString());
				}
			}

			if(indexPhoneFax>=0){

				if(indexPhoneFax<websiteSize && is_valid_req_arg(((StringBuffer)lstPhone.get(indexPhoneFax)).toString()))
				{
					currWorkFaxNo = (((StringBuffer)lstPhone.get(indexPhoneFax)).toString());
				}
			}
			if(indexEmailWork>=0){
				if(indexEmailWork<eMailSize && is_valid_req_arg(((StringBuffer)lsteMail.get(indexEmailWork)).toString()))
				{
					currWorkEmail = (((StringBuffer)lsteMail.get(indexEmailWork)).toString());
				}
			}
			if(indexEmailPalm>=0){
				if(indexEmailPalm<eMailSize && is_valid_req_arg(((StringBuffer)lsteMail.get(indexEmailPalm)).toString()))
				{
					currMailingEmailPalm = (((StringBuffer)lsteMail.get(indexEmailPalm)).toString());
				}
			}
			if(indexEmailHome>=0){
				if(indexEmailHome<eMailSize && is_valid_req_arg(((StringBuffer)lsteMail.get(indexEmailHome)).toString()))
				{
					currHomeEmail = (((StringBuffer)lsteMail.get(indexEmailHome)).toString());
				}

			}
			if(addrIndexWork>=0){
				if(addrIndexWork<websiteSize && is_valid_req_arg(((StringBuffer)lstwebsite.get(addrIndexWork)).toString()))
				{
					currWorkURL = (((StringBuffer)lstwebsite.get(addrIndexWork)).toString());
				}
			}
			/* Core Dependency Changes*/
			if(indexCommPhone1>=0){
				if(indexCommPhone1<phoneSize && is_valid_req_arg(((StringBuffer)lstPhone.get(indexCommPhone1)).toString()))
				{
					currMailingCellPhone = (((StringBuffer)lstPhone.get(indexCommPhone1)).toString());
				}
			}
			/* Core Dependency Changes*/
			/* CIF PhoneEmail Changes : End*/
			/**********Search on Address field :Start***********/


			if(strHouse_No.length()>5){
				strHouse_No=strHouse_No.substring(0,4);
			}
			if(strBuilding_Level.length()>5){
				strBuilding_Level=strBuilding_Level.substring(0,4);
			}
			if(strStreet_No.length()>10){
				strStreet_No=strStreet_No.substring(0,9);
			}
			if(strStreet_Name.length()>20){
				strStreet_Name=strStreet_Name.substring(0,19);
			}
			if(strSuburb.length()>40){
				strSuburb=strSuburb.substring(0,39);
			}
			if(strLocality_Name.length()>15){
				strLocality_Name=strLocality_Name.substring(0,14);
			}
			if(strTown.length()>15){
				strTown=strTown.substring(0,14);
			}
			if(strMail_Stop.length()>12){
				strMail_Stop=strMail_Stop.substring(0,11);
			}
			if(strCity.length()>50){
				strCity=strCity.substring(0,49);
			}
			if(strState.length()>50){
				strState=strState.substring(0,49);
			}
			if(strCountry.length()>50){
				strCountry=strCountry.substring(0,49);
			}
			if(strZip.length()>10){
				strZip=strZip.substring(0,9);
			}

			if(!(((strHouse_No).trim().equals(""))||((strBuilding_Level).trim().equals(""))||(strHouse_No==null)||(strBuilding_Level==null))){
				strHouse_No=(strHouse_No).trim()+"-";
			}
			if(!(((strStreet_No).trim().equals(""))||((strStreet_Name).trim().equals(""))||(strStreet_No==null)||(strStreet_Name==null))){
				strStreet_No=(strStreet_No).trim()+" ";
			}
			if((((!((strHouse_No).trim().equals("")))&&((strHouse_No!=null)))||((!((strBuilding_Level).trim().equals("")))&&(strBuilding_Level!=null)))&&(((!((strStreet_No).trim().equals("")))&&(strStreet_No!=null))||((!((strStreet_Name).trim().equals("")))&&(strStreet_Name!=null)))){
				if((!((strHouse_No).trim().equals("")))&&((strBuilding_Level).trim().equals("")))
				{
					strHouse_No=(strHouse_No).trim()+",";
				}
				else
				{
					strBuilding_Level=(strBuilding_Level).trim()+",";
				}
			}

			if((!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)))&&((strTown==null)||((strTown).trim().equals("")))){
				strLocality_Name=(strLocality_Name).trim()+",";
			}
			else if((!(((strTown).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strTown==null)||(strMail_Stop==null)))&&((strLocality_Name==null)||((strLocality_Name).trim().equals("")))){
				strMail_Stop=(strMail_Stop).trim()+",";
			}
			else if((!(((strLocality_Name).trim().equals(""))||((strTown).trim().equals(""))||(strLocality_Name==null)||(strTown==null)))&&((strMail_Stop==null)||((strMail_Stop).trim().equals("")))){
				strLocality_Name=(strLocality_Name).trim()+",";
			}
			else if(!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)||(strTown==null)||((strTown).trim().equals("")))){
				strLocality_Name=(strLocality_Name).trim()+",";
				strMail_Stop=(strMail_Stop).trim()+",";
			}
			/*Tracker 159095 : Sonali begin of changes*/
			/* AdressLine changes: START */
			Addr1 =  req.getParameter("AddressLine1");
			Addr2 =  req.getParameter("AddressLine2");
			Addr3 =  req.getParameter("AddressLine3");
			/* AdressLine changes: END */
			/*Tracker 159095 : Sonali end of changes*/
			if(Addr1!=null && Addr2!=null && Addr3!=null){
			StringBuilder strbAddrFields = new StringBuilder(Addr1).append("$").append(Addr2).append("$").append(Addr3).append("$").append(strCity.trim()).append("$").append(strState.trim())
																   .append("$").append(strCountry.trim()).append("$").append(strZip.trim()).append("$").append(strCity_code.trim())
																   .append("$").append(strCountry_code.trim());
			//AddressFields = Addr1+"$"+Addr2+"$"+Addr3+"$"+strCity.trim()+"$"+strState.trim()+"$"+strCountry.trim()+"$"+strZip.trim()+"$"+strCity_code.trim()+"$"+strCountry_code.trim();
			AddressFields = strbAddrFields.toString();
			}
			strHouse_No="";
			strBuilding_Level="";
			strStreet_No="";
			strStreet_Name="";
			strSuburb="";
			strLocality_Name="";
			strTown="";
			strMail_Stop="";

		}
		//Ticket 367108 changes
		SRMBOBase introBusinessObject = null;
		String manualRouting = req.getParameter("AccountBO.ManualRouting");
		String assignedGroupID = req.getParameter("AccountBO.AssignedToGroup");
		String assign_transfer = req.getParameter("assign_transfer");
		String assignedLocID = req.getParameter("AccountBO.AssignedLocationID");
		String manual_partnerID = req.getParameter("PartnerBO.partnerID");
		String manual_agentID = req.getParameter("AgentBO.agentID");

		final Integer  agentID1 = sc.getAgentId();
		HashMap agentInfo=new HashMap(4);
		agentInfo=CommonQueries.getLoggedinAgentInfo(agentID1,bc);
		String priBCID=agentInfo.get("BCID").toString();
		Integer iBCID = new Integer(priBCID);
		/***************************************/



		//If Approval Flag is not Enabled.
		String isCopy = req.getParameter("isCopy");
		/*********** save and submit changes : Start****************/
		//changes for tracker id :253845 starts
		if((!apprFlag ||accountURL == null || accountURL.trim().equals("")
				||isCopy.equalsIgnoreCase("Y")||
				    convToCust.equalsIgnoreCase("Y")|| mainID>0)
		&& saveFlag!=1
		&& ( !operationType.equals("Queue")&& !editFlag)
		|| byPassFlag.equalsIgnoreCase("Y")){
		//changes for tracker id :253845 ends

			AccountBO businessObject = null;
			CoreInterfaceBO coreObject = null;
			businessObject = new AccountBO();
			coreObject = new CoreInterfaceBO();
			ContactBO contBO = null;
			DemographicBO DemoBO = new DemographicBO();
			//Tracker ID 113276 changes start
			PsychographicBO PsychoBO = new PsychographicBO();

			//Tracker ID 113276 changes end

			TradeFinanceBO TFBO = null;
			int iUniqueIdentifier = 0;

			//construct the NV Pairs and populate an AccountBO
			/* CIF COPY CHANGES : START */
			if(isCopy == null)
			{
				isCopy = "";
			}
			if(isCopy!=null)
			//changes for tracker id :253845 starts
			if(isCopy.equalsIgnoreCase("Y")||convToCust.equalsIgnoreCase("Y")){

			//changes for tracker id :253845 ends
				businessObject = new AccountBO();
				coreObject = new CoreInterfaceBO();
				/* CRM6206RECON:TRACKER# 59146 **BEGIN   CHANGES*/
				String isDemandLoaded = req.getParameter("isDemoLoaded");

				/*if(null != isDemandLoaded && isDemandLoaded.equals("false")){
					DemoBO = new DemographicBO();
				}*/
				isDemandLoaded = req.getParameter("isPsychoLoaded");

				if(null != isDemandLoaded && isDemandLoaded.equals("false")){

					psychoNotLoaded = true;
				}

				isDemandLoaded = req.getParameter("isTFLoaded");

				if(null != isDemandLoaded && isDemandLoaded.equals("false")){

					TFBO = new TradeFinanceBO();

				}
				/* CRM6206RECON:TRACKER# 59146 **END   CHANGES*/
			}

			else{

				//Tracker ID 113276 identification changes start

				/* Changes for the TrackerId:273053 Starts */
						delEdoc1(iNoOfRemovedEDocs,bc,lstIDRemoved);
				/* Changes for the TrackerId:273053 ends */

				//Tracker ID 113276 identification changes end
				if(operationType!=null)
				if(operationType.equals("Edit Entity")){
					if ((accountURL!=null)&&(!accountURL.equals("")))
					{


						if(mainID>0){
							businessObject= (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,new Integer(mainID));
							prevTabs = businessObject.getTabValidator();

							coreObject= (CoreInterfaceBO)Utils.getBOFromID(bc,"CoreInterfaceBO",CoreInterfaceBO.ACCOUNTID,new Integer(mainID));
							if(coreObject==null){
								coreObject=new CoreInterfaceBO();
							}
							//Tracker ID 113276 identification changes start
							PsychoBO= (PsychographicBO)Utils.getBOFromID(bc,"PsychographicBO",PsychographicBO.ACCOUNTID,new Integer(mainID));
							if(PsychoBO==null){
								PsychoBO=new PsychographicBO();
							}
							//Tracker ID 113276 identification changes end
							iUniqueIdentifier = businessObject.getAccountID().intValue();
							TFBO= (TradeFinanceBO)Utils.getBOFromID(bc,"TradeFinanceBO",TradeFinanceBO.ACCOUNTID, businessObject.getAccountID());

							if (TFBO==null){
								TFBO = new TradeFinanceBO();
							}
							DemoBO= (DemographicBO)Utils.getBOFromID(bc,"DemographicBO",DemographicBO.ACCOUNTID,new Integer(mainID));
							if(DemoBO==null){
								DemoBO=new DemographicBO();
							}
						} else {
							businessObject = (AccountBO)SRMURLResolver.getObject(bc, accountURL, true);
							coreObject= (CoreInterfaceBO)Utils.getBOFromID(bc,"CoreInterfaceBO",CoreInterfaceBO.ACCOUNTID, businessObject.getAccountID());
							if(coreObject==null){
								coreObject=new CoreInterfaceBO();
							}
							//Tracker ID 113276 identification changes start
							PsychoBO= (PsychographicBO)Utils.getBOFromID(bc,"PsychographicBO",
									PsychographicBO.ACCOUNTID, businessObject.getAccountID());
							if(PsychoBO==null){
								PsychoBO=new PsychographicBO();
							}
							//Tracker ID 113276 identification changes end
							iUniqueIdentifier = businessObject.getAccountID().intValue();
							TFBO= (TradeFinanceBO)Utils.getBOFromID(bc,"TradeFinanceBO",TradeFinanceBO.ACCOUNTID, businessObject.getAccountID());

							if (TFBO==null){
								TFBO = new TradeFinanceBO();
							}
						}
						iUniqueIdentifier = businessObject.getAccountID().intValue();
						coreCustId = businessObject.getCore_cust_id();

						Integer concurNew =  businessObject.getConcurDetect_X();
						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							acctKey = businessObject.getAccountKey();
						}


						if (concurNew != null && concurOld != null && mainID==0) {
							if(concurNew!=null)
							if ( !concurNew.equals(concurOld) ) {
								throw new SRMBCException(
										SRMBCException.RECORD_UPDATED_BY_OTHER,
										null
								);
							}
						}

					}
				}
				else{

					/* Tab Validation By Mamta: Start */
					//businessObject = new AccountBO();
					/*TrackerID: 161933,Changes Begin */
					if(boAccount!=null){
					businessObject = boAccount;
				    }
				    /*TrackerID: 161933,Changes Begin */
					/* Tab Validation By Mamta: End */
					coreObject = new CoreInterfaceBO();
					/* CRM6206RECON:TRACKER# 59146 **BEGIN   CHANGES*/
					String isDemandLoaded = req.getParameter("isDemoLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false")){

						DemoBO = new DemographicBO();
					}
					isDemandLoaded = req.getParameter("isPsychoLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false")){

						PsychoBO = new PsychographicBO();
						psychoNotLoaded=true;
					}
					isDemandLoaded = req.getParameter("isTFLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false") ){

						TFBO = new TradeFinanceBO();
					}
					/* CRM6206RECON:TRACKER# 59146 **END   CHANGES*/
				}
			}
//Changes for tracker id: 338439 starts
		 if (( isCopy!=null && (((accountURL==null) || (accountURL.equals(""))|| isCopy.equalsIgnoreCase("Y")) && (acctKey!=null)))
||	(((isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) && ( acctKey != null && !acctKey.equals(businessObject.getAccountKey()) ) )  ||   (acctKey==null))){
					//Changes for tracker 356435 starts


					if(!convToCust.equalsIgnoreCase("Y") ){
						//Changes for tracker 356435 ends
					key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);
					//Changes for Tracker id: 356393 starts
			//changes for call id 375427 and recon of call id 372669 starts
						//Changes for ticket 690992 starts
						//coreCustId = AccountIDGen.getCoreCustId(bc);	// Commented for Ticket id: 777026
					 if(coreCustId==null || (coreCustId!=null && coreCustId.equalsIgnoreCase("") )){
					coreCustId = (String)key.get("coreCustId");
					//coreCustId = generateCoreCustIdForReservedCIF(codeNNTM, typeNNTM, htCifIds, sPrimary_sol_id, bc);
				}
					//Changes for ticket 690992 ends
			//changes for call id 375427 and recon of call id 372669 ends
					//Changes for Tracker id: 356393 ends
					}
				}
					//Changes for tracker id: 338439 ends

			/* CIF COPY CHANGES : END */
			// Tracker id 113276 CURRENCY CHANGES START
			//PsychoBO = cifUtils.CurrencyDetInfo(PsychoBO, req,coreCustId, context,entity_cre_flag, apprFlag,editFlag);
			//Tracker ID 113276 CURRENCY CHANGES END

			setPhoneDetails(businessObject,currWorkWorkPhone,currHomeHomePhone, currMailingCellPhone, currWorkFaxNo,
			currWorkURL, currWorkEmail, currHomeEmail, currMailingEmailPalm, currMailingCity, currWorkExtension,currMailingState,currMailingCountry,currMailingZip,byPassFlag);

			/*****Address Serach field :Start***********/
			/*businessObject.setPhone(currWorkWorkPhone);
			businessObject.setPhone_Home(currHomeHomePhone);
			businessObject.setPhone_Cell(currMailingCellPhone);
			businessObject.setFax(currWorkFaxNo);
			businessObject.setCompanyURL(currWorkURL);
			businessObject.setEmail(currWorkEmail);
			businessObject.setEmail_Home(currHomeEmail);
			businessObject.setEmail_Palm(currMailingEmailPalm);
			/* Changes for tracker id 273347 start */
			businessObject.setCity(currMailingCity.trim());
			/*Changes for Ticketid:-326876 Changes Begin*/
			businessObject.setState(currMailingState.trim());
			businessObject.setCountry(currMailingCountry.trim());
			businessObject.setZip(currMailingZip.trim());
			/*Changes for Ticketid:-326876 Changes End*/
			/* Changes for tracker id 273347 end */
			//businessObject.setExtension(currWorkExtension);



			/*****Address Serach field :End***********/
			/** Access Control Changes**/
			if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

				businessObject.setAccessOwnerGroup(new Integer(accessOwnerGroup));

			}

			if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerSegment(accessOwnerSegment);
			}

			if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerBC(new Integer((accessOwnerBC)));
			}
			if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerAgent(new Integer((agentID_prim)));
			}
			/*AccessControlChanges -ML3	start*/
			else{
				businessObject.setAccessOwnerAgent(iLoggedUser);
			}
			if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
				businessObject.setAccessAssigneeAgent(new Integer((agentID_sec)));
			}
			/*AccessControlChanges -ML3	end*/
			/**End of Changes**/

			//Alok changes strats

			//businessObject.setAccountName (acctName);

			//businessObject.setOrgType ("Account");
			businessObject.setBackEndID(availableBackendID);

			//businessObject.setManager(sManager);
			/*Native Language Fields added:start*/
			//businessObject.setSecondaryRM_ID(sSecondaryRM);
			//businessObject.setTertiaryRM_ID(sTertiaryRM);

			//businessObject.setShort_name(sShortName);
			// Tracker id 113276 changes start
			//businessObject.setNick_name(sNickName);

			//businessObject.setMother_name(sMotherName);
			//	businessObject.setFather_husband_name(sFatherHusbandName);
		    //businessObject.setPrimary_service_centre(sPrimaryServiceCentre);
		    //businessObject.setPrevious_name(sPreviousName);
		    //businessObject.setCIN(sCIN);
			//businessObject.setCreatedUserID(ValidateIntFields(SRMTypedAttrStringized.getReqParameter( req,"AccountBO.createdUserID")));
			//businessObject.setMaidenName(MaidenName);
			//businessObject.setSpouseID(SpouseID);
			//businessObject.setCreditHistoryRequestedFlag(CreditHistoryRequestedFlag);
			// Tracker id 113276 changes end
		//	businessObject.setSecure_id(sSecureID);



			/*  TRACKER:69692:END OF CHANGES */

			/*New added field in Account Table : Begin*/
			//if(sCustFirstName!=null){
			//businessObject.setCust_First_Name(sCustFirstName.trim());	}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		//else{   businessObject.setCust_First_Name(null);}
			//Rak Changes for tracker id 201544 ends -Recon for Tracker 242199
		//	if(sCustMiddleName!=null){
			//businessObject.setCust_Middle_Name(sCustMiddleName.trim());}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		//else{businessObject.setCust_Middle_Name(null);	}
		        //Rak Changes for tracker id 201544 ends -Recon for Tracker 242199
			businessObject=accountValset(businessObject,acctName,sManager,sSecondaryRM,sCustFirstName,sCustMiddleName,sSecureID);
			//Alok changes ends
			/*if(!noOfCreditCard.equals("")&&!noOfCreditCard.equals(null)){
			 int noCreditCard=Integer.parseInt(noOfCreditCard);
			 if(noCreditCard>2){
			 businessObject.setCard_holder("Y");
			 }else{
			 businessObject.setCard_holder("N");
			 }
			 }*/
			/*Approval Changes:start*/
			//changes for call id 405767 and recon of call id 402792 starts
			if(operationType!=null)
			//Fix for call id: 438919
			if(!editFlag && (operationType.equalsIgnoreCase("null")||operationType.equalsIgnoreCase("ConvtoCust")||operationType.equalsIgnoreCase("Create")))
			{
			//changes for call id 405767 and recon of call id 402792 ends
				businessObject.setLastOperPerformed("C");

			}else if((operationType!=null) && (operationType.equalsIgnoreCase("Edit Entity")))
			{
				businessObject.setLastOperPerformed("E");
			}
//Changes for TOL ID 738938 starts
			if((operationType!=null) &&(operationType.equalsIgnoreCase("ConvtoCust")))
			{
				businessObject.setLastOperPerformed("C");
			}
//Changes for TOL ID 738938 ends
			/*Approval Changes:end*/
			//Fix for call id: 438919
			if(!editFlag && (operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create"))){

				businessObject.setCreatedLocationID(iBCID);
			}
			else if((operationType!=null) && (operationType.equalsIgnoreCase("Edit Entity"))){

				businessObject.setEditedLocationID(iBCID);
			}

			if(manualRouting != null && manualRouting.equalsIgnoreCase("Y")){

				businessObject.setManualRouting(manualRouting);
				if(assign_transfer!=null && assign_transfer.equalsIgnoreCase("Assign")){

					businessObject.setOwnedUserID(agentID1);

					if(!((manual_partnerID.trim()).equalsIgnoreCase(""))){
						businessObject.setAssignedTo(new Integer(manual_partnerID));
					}
					else if (!(manual_agentID.equalsIgnoreCase(""))){
						businessObject.setAssignedTo(new Integer(manual_agentID));
					}else{
						businessObject.setAssignedToGroup(new Integer(assignedGroupID));
						businessObject.setAssignedLocationID(new Integer(assignedLocID));
					}

				}
				else if (assign_transfer!=null && assign_transfer.equalsIgnoreCase("Transfer")){
					if(!(manual_partnerID.equalsIgnoreCase(""))){
						businessObject.setOwnedUserID(new Integer(manual_partnerID));
					}
					else if (!(manual_agentID.equalsIgnoreCase(""))){
						businessObject.setOwnedUserID(new Integer(manual_agentID));
					}else{
						businessObject.setOwnerGroup(new Integer(assignedGroupID));
						businessObject.setOwnedLocationID(new Integer(assignedLocID));
					}
				} //transfer loop ends

			}//END OF MANUAL ROUTING 'IF'
			else{
				businessObject.setManualRouting(manualRouting);
			//Fix for call id: 438947
				if(operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create")){
					businessObject.setAssignedTo(agentID1);
					businessObject.setOwnedUserID(agentID1);
				}
			}

			/********Fix for Tracker No.85405***********/
			/*if(cust_free_text.equals("")||cust_free_text.equals(null)){
				businessObject.setCard_holder("N");
			}else{
				businessObject.setCard_holder("Y");
			}*/
			/********Fix for Tracker No.85405***********/
			if(sPreferredName != null && (!sPreferredName.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
			//changes for call id 345046 and recon for 341423 start
			businessObject.setPreferredName(sPreferredName.trim());
			//changes for call id 345046 and recon for 341423 ends
			//businessObject.setLead_source(sLeadSource);

            if(sCustLastName!=null){
			businessObject.setCust_Last_Name(sCustLastName.trim());
		}

			businessObject.setGender(sGender);
                  /* Changes Begin Tracker Id : 195897 */
			businessObject.setSalutation(sSalutation_code);
                  /* Changes End Tracker Id : 195897 */
//			businessObject.setBirth_Month(sBirth_Month);


			/* Changes For Ticketid:- 371367 Begin
            Commenting the changes done for Ticketid:-286305 */

			/*Changes for Ticketid:-286305 Begin
				Setting the value of pref in the boobject after checking the proper conditions*/
			/*if((sPref_code!=null)&&(!sPref_code.equalsIgnoreCase(""))){
					businessObject.setPref_code(sPref_code);
				}else{
								businessObject.setPref_code("");
			}*/
			/*Changes for Ticketid:-286305 End*/
			/* Changes For Ticketid:- 371367 End*/

			/* Change for ticket 367607 starts */
			 /* Recon of Change for call  391057  starts */
			if((sPref_code_rcode!=null)&&(!sPref_code_rcode.equalsIgnoreCase(""))){
					businessObject.setPref_code(sPref_code_rcode);
				}else{
								businessObject.setPref_code("");
			}
 /* Recon of Change for call  391057  end */
			/* Change for ticket 367607 ends */
			// CRM101UB changes :start

			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
			Date tmpDateDOB=null;// = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB"));
			if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
			{
				tmpDateDOB = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Cust_DOB"));
			}
			else
			{
				if(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB")!=null)
				{
					tmpDateDOB  = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB"));
				}
			}
			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
//			Last Edited Page change
               /* Begin of changes by tracker : 142081 */
               SRMTypedAttrStringized dttmpDateDOB=null;;
			   if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h")))){
			   		dttmpDateDOB=SRMTypedAttrStringized.getReqParameter( req,"Cust_DOB");
			   	}
			   	else
			   	{
			   		if(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB")!=null)
			   		{
			   			dttmpDateDOB=SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB");
			   		}
			   	}

			if(dttmpDateDOB != null){
			businessObject.setCust_DOB(dttmpDateDOB.getFormatter(context).stringToDate(dttmpDateDOB.getValue()));
			}
			//businessObject.setCust_DOB(tmpDateDOB);
			/* End of changes by tracker : 142081 */

			/********* Save and Submit Changes : Starts**********/
			if(tmpDateDOB != null && !(tmpDateDOB.equals(""))){
				String str1 = tmpDateDOB.toString();
				String strYr = str1.substring(str1.lastIndexOf(" ")+1);
				Integer year = new Integer(strYr);
				businessObject.setBirth_Year( year );

				businessObject.setBirth_Day(birthDay);
				businessObject.setBirth_Month(birth_month);
			}
			// CRM101UB changes : end

			/*	hardcoded entries for CIF */
			/*tracker id 166051 changes starts*/
			if ((apprFlag)&& (!(editFlag))){
				businessObject.setRecordStatus(Constants.RECORDSTATUS_INACTIVE);
			}else{
			businessObject.setRecordStatus(Constants.RECORDSTATUS_ACTIVE);
			}
			/*tracker id 166051 changes ends*/
			/* CRM70t-ST: TRACKER# : 78590	BEGIN OF CHANGES */
			//Tracker:90196: Changes for Attribute Masking

			String fullName=null;
			//SSV changes for code too large
//changes for tracker 401769 fullname alteration begin
			if(sName!=null && !sName.equalsIgnoreCase("")){
				fullName=sName;
			}
			else{
				fullName = setFullNameMain(businessObject);
			}
			//SSV changes for code too large

			if(fullName!=null && fullName.length()>80){

				throw new FCRMGenericException( "MSGEXC60661", new Exception( "Full Name cannot be more than 80 characters" ) );
			}

//changes for tracker 401769 fullname alteration ends
			if(fullName != null) {
			businessObject.setName(fullName.trim());
			
		} else {
			businessObject.setName(null);}
			//Tracker:90196: End of Changes for Attribute Masking

			//changes for tracker id :253845 starts
			//if((accountURL==null) || (accountURL.equals("")) || isCopy.equalsIgnoreCase("Y")) {
			if((accountURL==null) || (accountURL.equals("")) || isCopy.equalsIgnoreCase("Y")|| convToCust.equalsIgnoreCase("Y")) {
			//changes for tracker id :253845 ends
				/*Changes for Tracker Begin 154769  for Code too large issue*/
				setValuesForAcc(businessObject);
				/*Changes for Tracker End 154769 */
			}
			/* CRM70t-ST: TRACKER# : 78590	END OF CHANGES */
			/* 	end of changes */

			/*changes for doc recieved*/
			if(doc_received==null) {
				businessObject.setDocument_Received("N");
			}else {
				businessObject.setDocument_Received("Y");
			}
			/*changes for doc recieved*/
			if(!(acctId>0))
			{
				businessObject.setAlreadyCreatedInEBanking("N");
			}
			/* ***** Tracker# 97236 CIF - Ebanking changes : End ***** */
			/* change by pradeep_satyamurthy for Tracker 204430 - Starts */
			businessObject = AccMainHelper.setTheMainBOobj(businessObject,req,boName,bc,sChildEntityTypeIntro,byPassFlag);
			/* change by pradeep_satyamurthy for Tracker 204430 - Ends */


			businessObject.setAccountType(ValidateStringFields(accountType));

			/* Changes for Ticketid:(348768)callid:-171991 :Changes Start */
			if((sPurgeRemarks!=null)&&(!sPurgeRemarks.equalsIgnoreCase(""))){
				businessObject.setPurgeRemarks(sPurgeRemarks);
			}else{
				businessObject.setPurgeRemarks("");
			}
            /* Changes for Ticketid:(348768)callid:-171991 :Changes End */
			//businessObject.setHouseholdID(ValidateStringFields(HouseHoldID));
			/*WMS fields start*/
			if((RiskProfileScore!=null)&&(!RiskProfileScore.getValue().equalsIgnoreCase(""))){
				businessObject.setRiskProfileScore(new Integer(RiskProfileScore.getFormatter2(context).stringToInt(RiskProfileScore)));
			}
			/* Changes for Tracker id:(260591)callid:-225164 :Changes Start */
			else {
						businessObject.setRiskProfileScore(null);
				 }
			/* Changes for Tracker id:(260591)callid:-225164 :Changes End */
			businessObject.setRiskProfileExpiryDate(ValidateDateFields(RiskProfileExpiryDate));
			/*WMS fields  end*/

              /*Changes for KYC enhancement start*/
			  				businessObject.setRiskRating(strRiskRating);
			  				businessObject.setKYC_ReviewDate(KYCReviewDate);
			  				businessObject.setSubmitForKYC(strSubmitForKYC);
			  				businessObject.setKYC_Date(KYCDate);
			/*Changes for KYC enhancement end*/
			  			   	/*FATCA changes starts */
							businessObject.setForeignAccTaxReportingReq(strForeignAccTaxReportingReq);

							businessObject.setForeignTaxReportingCountry(strForeignTaxReportingCountry);
							businessObject.setForeignTaxReportingStatus(strForeignTaxReportingStatus);
							SRMTypedAttrStringized LastForeignTaxReviewDate	= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.LastForeignTaxReviewDate");
							SRMTypedAttrStringized NextForeignTaxReviewDate	= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.NextForeignTaxReviewDate");
							 businessObject.setLastForeignTaxReviewDate(ValidateDateFields(LastForeignTaxReviewDate));
					         businessObject.setNextForeignTaxReviewDate(ValidateDateFields(NextForeignTaxReviewDate));
					         businessObject.setFatcaRemarks(strFatcaRemarks);


							/*FATCA changes ends */

	//Changes done by Ekta for Cif Deceased Starts

	SRMTypedAttrStringized DateOfDeath= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.DateOfDeath");
	SRMTypedAttrStringized DateOfNotification= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.DateOfNotification");

			//Senior Changes Starts
			if(SeniorCitizen!=null){
			businessObject.setSeniorCitizen(SeniorCitizen);
			if(SeniorCitizen.equalsIgnoreCase("Y")){
				businessObject.setSenCitizenConversionFlag("N");
			}else{
				businessObject.setSenCitizenConversionFlag("");
			}}
			//Senior Changes Ends
			businessObject.setDateOfDeath(ValidateDateFields(DateOfDeath));
			businessObject.setDateOfNotification(ValidateDateFields(DateOfNotification));
	//Changes done by Ekta for Cif Deceased ends
			if(isQDE!=null)
			if(isQDE.equalsIgnoreCase("Y")){
				if(businessObject.getCreated_From()==null){
					businessObject.setCreated_From("Q");
				}
			}
			else{
				businessObject.setCreated_From("A");
			}

			/*  CRM62M:TRACKER:67292:BEGINOFCHANGES */
			businessObject.setConstitution_Code(ValidateStringFields(req.getParameter(boName+".Constitution_ref_code")));
			businessObject.setRelationshipOffer1(RelationshipOffer1);
			businessObject.setRelationshipOffer2(RelationshipOffer2);
/*  Customization: changes for dropdown to lookup for tracker id 338696 */
businessObject.setRating(sRating_code);
			//Tracker 151893
			businessObject.setConstitution_ref_code(sConstitution_ref_code);


			/*End of changes 22/1/2004*/

                  /* Changes Begin Tracker Id : 195897 */
			if(sCust_type_code != null && !sCust_type_code.trim().equals("")) {
				businessObject.setCust_Type (sCust_type_code);
			} else {
				businessObject.setCust_Type (null);
			}
                  /* Changes End Tracker Id : 195897 */
			businessObject.setXmlData(Utils.convertStrToByteArray(acctXMLDATA));
			if((acctRevenue!=null)&&(!acctRevenue.equals(""))){
				businessObject.setAnnualRevenue(new Double(acctRevenue));
			} else {
				businessObject.setAnnualRevenue (null);
			}

			businessObject.setCompetitor (acctCompetitor);

			if(acctIndustry != null && !acctIndustry.trim().equals("")) {
				businessObject.setIndustry (acctIndustry);
			} else {
				businessObject.setIndustry (null);
			}

			if(acctRegion != null && !acctRegion.trim().equals("")) {
				businessObject.setRegion (acctRegion);
			} else {
				businessObject.setRegion (null);
			}

			businessObject.setNotes (acctNotes);

			// businessObject.setPhone (acctPhone);
			if(acctRevenueUnits != null && !acctRevenueUnits.trim().equals("")) {
				businessObject.setRevenueUnits (acctRevenueUnits);
			} else {
				businessObject.setRevenueUnits (null);
			}


			if(acctSICCode != null && !acctSICCode.trim().equals("")) {
				businessObject.setSicCode(acctSICCode);
			} else {
				businessObject.setSicCode(null);
			}

                  /* Changes Begin Tracker Id : 195897 */
			if(sStatus_code != null && !sStatus_code.trim().equals("")) {
				businessObject.setStatus (sStatus_code);
			} else {
				businessObject.setStatus (null);
			}
                  /* Changes End Tracker Id : 195897 */


			if((RelationshipMgrID!=null)&&(!RelationshipMgrID.getValue().equalsIgnoreCase(""))){
				businessObject.setRelationshipMgrID(new Integer(RelationshipMgrID.getFormatter2(context).stringToInt(RelationshipMgrID)));
			}

			//Changes for field based maker checker
			businessObject.setIsMCEdited(isMCEditedGeneral);

			if((RelationshipCreatedByID!=null)&&(!RelationshipCreatedByID.getValue().equalsIgnoreCase(""))){
				try{
					Integer agentID=null;
					/* 10.2 SPE Changes */
					agentID = getAgentIDfromLoginID(bc,RelationshipCreatedByID.getValue());
					/* 10.2 SPE Changes */
					businessObject.setRelationshipCreatedByID(agentID);
				}catch(Exception e){
				}
			}

			if((preferredChannelID!=null)&&(!preferredChannelID.getValue().equalsIgnoreCase(""))){
				businessObject.setPreferredChannelID(new Integer(preferredChannelID.getFormatter2(context).stringToInt(preferredChannelID)));
			}

			if(acctTickerSymbol != null && !acctTickerSymbol.trim().equals("")) {
				businessObject.setTickerSymbol(acctTickerSymbol);
			} else {
				businessObject.setTickerSymbol(null);
			}


			/*
			 *	Core Fields Inclusion - Begin
			 */
			 /* Tracker id 113276 changes start for sanity fixing */
        /*if(accountURL == null || accountURL.trim().equals(""))
        {
			if(sIntroducerType.equalsIgnoreCase("CUSTOMER"))
			{
				if (sChildEntityTypeIntro.equalsIgnoreCase("Retail")) {
					AccountBO introBusObj = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTKEY,ctKeyIntro);
					sCore_introd_cust_id = introBusObj.getCore_cust_id();
				} else {
					CorporateBO introBusObj = (CorporateBO)Utils.getBOFromID(bc,"CorporateBO",CorporateBO.CORP_KEY,ctKeyIntro);
					sCore_introd_cust_id = introBusObj.getCore_Cust_ID();
				}
			//sCore_introd_cust_id = introBusObj.getCore_cust_id();
			businessObject.setCore_introd_cust_id(sCore_introd_cust_id);
			}
		}*/
		/* Tracker id 113276 changes end for sanity fixing */
		//reverting changes for Tracker ID: 334984
			if(apprFlag){
								//tracker id 336786 issue fix starts
							if(businessObject.getEntity_cre_flag()==null || businessObject.getEntity_cre_flag().equalsIgnoreCase("N") || businessObject.getEntity_cre_flag().equalsIgnoreCase("")){
								businessObject.setEntity_cre_flag("N");
								}
							else{
								businessObject.setEntity_cre_flag("Y");
								}
								//tracker id 336786 issue fix ends
			}
			//save and submit changes inclusion of saveFlag
			/*
			 * Fix for 265137, approval disabled scenario
			 * If saved, tyhe entity cre flag shud go as N
			 */
			else if(saveFlag==1) {
				//tracker id 336786 issue fix starts
				if(businessObject.getEntity_cre_flag()==null || businessObject.getEntity_cre_flag().equalsIgnoreCase("N") || businessObject.getEntity_cre_flag().equalsIgnoreCase("")){
					businessObject.setEntity_cre_flag("N");
					}
					else{
						businessObject.setEntity_cre_flag("Y");
						}
				//tracker id 336786 issue fix ends
			/* END OF CHANGES */
			}
			else {
				businessObject.setEntity_cre_flag("Y");
			}
			//businessObject.setSalutation_code(sSalutation_code);

			// Changes for tracker Id 249891 start here

			businessObject.setCust_community(sCust_community);

			// Changes for tracker Id 249891 end here
			businessObject.setCore_cust_id(coreCustId);
			//changes for 258708 starts
			businessObject.setCust_community(sCust_community);
			//changes for 258708 ends

			businessObject.setPurgeFlag(purge_flag);
			/*if(purge_flag==null) {
			 businessObject.setPurgeFlag("N");
			 }else {
			 businessObject.setPurgeFlag("Y");
			 }*/

			if(isTFFlag==null) {
				businessObject.setTFPartyFlag("N");
			}else {
				businessObject.setTFPartyFlag(isTFFlag);
			}

			/*
			 *	Core Fields Inclusion - End
			 */


			/* CoreInterfaceBO changes*/


			coreObject.setORGKEY(acctKey);

			/*if(acctKey.length() > 9){
			 coreObject.setCore_cust_id(acctKey.substring(0,9));
			 }else{
			 coreObject.setCore_cust_id(acctKey);
			 }*/

			coreObject.setCore_cust_id(coreCustId);

			coreObject = AccMainHelper.setCoreObj(coreObject,req,boNameCI,apprFlag);

			//coreObject.setCust_free_text(cust_free_text);

			/*********** Saving HouseHold ****************/
			SRMCollection houseHold = businessObject.getGroupHouseHold();



			/****************************/
			//CIF HouseHold SAVING - begin
			/****************************/

			/*************HouseHold cleanup::Start**************************************/
			if(ScreenName!=null)
			if(ScreenName.trim().equalsIgnoreCase("CIF")){

				//CIFHouseHold additions- begin

				ArrayList AvailableHouseHold =  new ArrayList();
				for(int iCount=0; iCount < houseHold.size(); iCount++) {
					AvailableHouseHold.add(((AccountBO.GroupHouseHold)houseHold.get(iCount)).getGroupHouseHoldID().toString());


				}



				for(int j =0;j < hshldCodeSize;j++){ // the list of all Address from the view

					AccountBO.GroupHouseHold NewHouseHoldDet = null;
					boolean found = false;
					String tempHouseHoldID = null;
					if(isCopy!=null)
					if(!isCopy.equalsIgnoreCase("Y"))
						tempHouseHoldID = lstHouseHoldID.get(j).toString().trim();
					AccountBO.GroupHouseHold tempHouseHoldDet = null;
					for(int n =0; n<houseHold.size();n++){// for all existing list of HouseHold
						if(tempHouseHoldID == null || (tempHouseHoldID!=null && tempHouseHoldID.equals("null")) || tempHouseHoldID.equals("")){
							found = false;
							break;
						}
						tempHouseHoldDet = (AccountBO.GroupHouseHold)houseHold.get(n);

						if(tempHouseHoldDet.getGroupHouseHoldID()!=null){
							if(((tempHouseHoldDet.getGroupHouseHoldID()).toString()).equals(tempHouseHoldID.toString())){
								found = true;
								break;
							}
							continue;
						}

					}

					if(found){
						NewHouseHoldDet = tempHouseHoldDet;

					}
					else{
						NewHouseHoldDet = (AccountBO.GroupHouseHold)businessObject.getInstance("GroupHouseHold");
					}
					if( j<hshldCodeSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldCode.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldCode((((StringBuffer)lstHouseHoldCode.get(j)).toString()).trim());

					}else{
						NewHouseHoldDet.setGroupHouseHoldCode(null);
					}
					if( j<hshldNameSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldName.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldName((((StringBuffer)lstHouseHoldName.get(j)).toString()).trim());

					}else{
						NewHouseHoldDet.setGroupHouseHoldName(null);
					}

					if( j<hshldMasterIDSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldMasterID.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldMasterID(new Integer((lstHouseHoldMasterID.get(j)).toString()));

					}else{
						NewHouseHoldDet.setGroupHouseHoldMasterID(null);
					}

					NewHouseHoldDet.setFlag("H");

					//Changes for tracker id :253845- Start
					setNewHouseHoldDetParams(req,NewHouseHoldDet,j);

					/*if(null !=lstGh_Text1 && j<lstGh_Text1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text1.get(j)).toString())) {
						NewHouseHoldDet.setText1((((StringBuffer)lstGh_Text1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText1(null);
					}
					if(null !=lstGh_Text2 && j<lstGh_Text2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text2.get(j)).toString())) {
						NewHouseHoldDet.setText2((((StringBuffer)lstGh_Text2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText2(null);
					}
					if(null !=lstGh_Text3 && j<lstGh_Text3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text3.get(j)).toString())) {
						NewHouseHoldDet.setText3((((StringBuffer)lstGh_Text3.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText3(null);
					}
					if(null !=lstGh_Dropdown1 && j<lstGh_Dropdown1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
						NewHouseHoldDet.setDropdown1((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown1(null);
					}
					if(null !=lstGh_Dropdown2 && j<lstGh_Dropdown2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown2.get(j)).toString())) {
						NewHouseHoldDet.setDropdown2((((StringBuffer)lstGh_Dropdown2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown2(null);
					}
					if(null !=lstGh_Dropdown3 && j<lstGh_Dropdown3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
						NewHouseHoldDet.setDropdown3((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown3(null);
					}
					if(null !=lstGh_Lookup1 && j<lstGh_Lookup1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup1.get(j)).toString())) {
						NewHouseHoldDet.setLookup1((((StringBuffer)lstGh_Lookup1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup1(null);
					}
					if(null !=lstGh_Lookup2 && j<lstGh_Lookup2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup2.get(j)).toString())) {
						NewHouseHoldDet.setLookup2((((StringBuffer)lstGh_Lookup2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup2(null);
					}
					if(null !=lstGh_Lookup3 && j<lstGh_Lookup3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup3.get(j)).toString())) {
						NewHouseHoldDet.setLookup3((((StringBuffer)lstGh_Lookup3.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup3(null);
					}*/
					//Changes for tracker id :253845- End




					if(!found){
						houseHold.add(NewHouseHoldDet);
					}

				}

				if(lstHouseHoldRemoved != null) {
					for(int iCnt=0; iCnt < hshldRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstHouseHoldRemoved.get(iCnt));
						int index = AvailableHouseHold.indexOf(sdelAsset);
						if(index != -1) {
							AccountBO.GroupHouseHold delAsset = (AccountBO.GroupHouseHold)houseHold.get(index);
							if(delAsset.getGroupHouseHoldID() != new Integer(lstHouseHoldRemoved.get(iCnt).toString())){
								houseHold.remove(index);
								AvailableHouseHold.remove(index);
							}

						}
					}
				}

//				CRM101UB CIF Changes Start : Group
				//10.6 Changes Starts
				// for(int j =0;j < grpCodeSize;j++){ // the list of all Groups from the view
				for (int j = 0; j < grpNameSize; j++) { // the list of all Groups from the view
				//10.6 Changes Ends

					AccountBO.GroupHouseHold NewGroupDet = null;
					boolean found = false;

					String tempGroupID = null;
					if(isCopy!=null)
					if(!isCopy.equalsIgnoreCase("Y"))
						tempGroupID = lstGrpID.get(j).toString().trim();

					AccountBO.GroupHouseHold tempGroupDet = null;
					for(int n =0; n<houseHold.size();n++){// for all existing list of Groups
						if(tempGroupID == null || tempGroupID.equals("null") || tempGroupID.equals("")){
							found = false;
							break;
						}
						tempGroupDet = (AccountBO.GroupHouseHold)houseHold.get(n);
						if(tempGroupDet.getGroupHouseHoldID()!=null && ((tempGroupDet.getGroupHouseHoldID()).toString()).equals(tempGroupID.toString())){
							found = true;
							break;
						}
						continue;
					}
					String primaryGrp=null;
					String groupID = null;
					String grpName = null;

					if(found){
						NewGroupDet = tempGroupDet;
					}
					else{
						NewGroupDet = (AccountBO.GroupHouseHold)businessObject.getInstance("GroupHouseHold");
					}

					//10.6 Changes Starts
					/*if( j<grpCodeSize &&
							is_valid_req_arg(((StringBuffer)lstGrpCode.get(j)).toString())) {
						NewGroupDet.setGroupHouseHoldCode((((StringBuffer)lstGrpCode.get(j)).toString()).trim());
					}else{
						NewGroupDet.setGroupHouseHoldCode(null);
					}*/
					//10.6 Changes Ends
					//}
					if( j<grpNameSize &&
							is_valid_req_arg(((StringBuffer)lstGrpName.get(j)).toString())) {
						grpName = 	(((StringBuffer)lstGrpName.get(j)).toString()).trim();
						NewGroupDet.setGroupHouseHoldName(grpName);
					}else{
						NewGroupDet.setGroupHouseHoldName(null);
					}

					//10.6 Changes Starts
					/*if( j<grpMasIDSize &&
							is_valid_req_arg(((StringBuffer)lstGrpMasID.get(j)).toString())) {
						NewGroupDet.setGroupHouseHoldMasterID(new Integer((lstGrpMasID.get(j)).toString()));
					}else{
						NewGroupDet.setGroupHouseHoldMasterID(null);
					}*/
					if (j < grpMasIDSize
							&& is_valid_req_arg(((StringBuffer) lstGrpMasID
									.get(j)).toString())) {
						NewGroupDet.setGrpID(new Integer(
								(lstGrpMasID.get(j)).toString()));
					} else {
						NewGroupDet.setGrpID(null);
					}
					//10.6 Changes Ends
					if( j<perShareSize &&
							is_valid_req_arg(((StringBuffer)lstPerShare.get(j)).toString())) {
						NewGroupDet.setShareholding_in_percentage(new Double((lstPerShare.get(j)).toString()));
					}else{
						NewGroupDet.setShareholding_in_percentage(new Double("0"));
					}

					/* CRM101UB Changes:start*/
					if( j<grp_IDSize &&
							is_valid_req_arg(((StringBuffer)lstGroup_ID.get(j)).toString())) {
						groupID = (((StringBuffer)lstGroup_ID.get(j)).toString()).trim();
						NewGroupDet.setGROUP_ID(groupID);
					}else{
						NewGroupDet.setGROUP_ID(null);
					}
					if( j<primarySize &&
							is_valid_req_arg(((StringBuffer)lstPrimary.get(j)).toString())) {
						primaryGrp =(((StringBuffer)lstPrimary.get(j)).toString()).trim();
						NewGroupDet.setPRIMARY_GROUP_INDICATOR(primaryGrp);
/*Tracker:110963: CODE COMMENT START : INSERT INTO CATEGORY TABLE IS NOW DONE FROM CORE.JAVA WHEN GROUP IS CREATED-NIKHIL*/
					/*	//CRM101BUB for category insert START
						if(primaryGrp.equalsIgnoreCase("Y") ){
							if((groupID!=null)&&(!groupID.equalsIgnoreCase(""))){
								businessObject.setGroupid_code(groupID);
							}else{
								businessObject.setGroupid_code("");
							}
							CommonQueries.Cat_Grp_Insert( bc,  groupID,  grpName);

						}
						//CRM101BUB for category insert END		*/
/*Tracker:110963: CODE COMMENT END-NIKHIL*/
					}else{
						NewGroupDet.setPRIMARY_GROUP_INDICATOR(null);
					}
					/* CRM101UB Changes:start*/

					NewGroupDet.setFlag("G");

					if(!found){
						houseHold.add(NewGroupDet);
					}

				}
				if(lstGrpRem != null) {
					for(int iCnt=0; iCnt < grpRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstGrpRem.get(iCnt));
						int index = AvailableHouseHold.indexOf(sdelAsset);
						if(index != -1) {
							AccountBO.GroupHouseHold delAsset = (AccountBO.GroupHouseHold)houseHold.get(index);
							if(delAsset.getGroupHouseHoldID() != new Integer(lstGrpRem.get(iCnt).toString())){
								houseHold.remove(index);
								AvailableHouseHold.remove(index);
							}

						}
					}
				}
//				CRM101UB CIF Group changes End
			}
			/***************** SAVING ADDRESS START ***********/
			SRMCollection address = businessObject.getAddress();
			int addressSize = address.size();


			/****************************/
			//CIF ADDRESS SAVING - begin
			/****************************/

			/*************Address cleanup::Start**************************************/
			if(ScreenName!=null)
			if(ScreenName.trim().equalsIgnoreCase("CIF")){

				//CIF Address additions- begin

				ArrayList AvailableAddress =  new ArrayList();
				for(int iCount=0; iCount < addressSize; iCount++) {
					AvailableAddress.add(((AccountBO.Address)address.get(iCount)).getAddressID().toString());
				}



				for(int j =0;j < addrTypeSize;j++){ // the list of all Address from the view
				/* Change for ticket 366907 start */
				/* Change for tracker 344720 start */
				//if(!(lstAddressType.get(j).toString().trim().equals("Swift")))
				if(!(lstAddressType.get(j).toString().trim().equals("Swift"))||(operationType.equalsIgnoreCase("Edit Entity")))
				{
				/* Change for ticket 366907 end */

					AccountBO.Address NewAddressDet = null;
					boolean found = false;
					String tempAddressID = null;
					if(isCopy!=null && lstaddID!=null)
					if(!isCopy.equalsIgnoreCase("Y") && lstaddID.size()>0)
						tempAddressID = lstaddID.get(j).toString().trim();
					AccountBO.Address tempAddressDet = null;
					for(int n =0; n<addressSize;n++){// for all existing list of Address
						if(tempAddressID == null || tempAddressID.equals("null") || tempAddressID.equals("")){
							found = false;
							break;
						}
						tempAddressDet = (AccountBO.Address)address.get(n);
						/*****Fix For Tracker No.85901****Start*******/
						if(tempAddressDet.getAddressID()!=null){
							if(((tempAddressDet.getAddressID()).toString()).equals(tempAddressID.toString())){
								found = true;
								break;
							}
							continue;
						}
						/*****Fix For Tracker No.85901****End*******/
					}

					if(found){
						NewAddressDet = tempAddressDet;
					}
					else{
						NewAddressDet = (AccountBO.Address)businessObject.getInstance("Address");
					}
					/************************ SwiftAddress start tracker : 132659 ***************************************/
					if(null!=NewAddressDet.getAddressCategory() && NewAddressDet.getAddressCategory().equalsIgnoreCase("Swift")){
						swiftFlag = false;
						//NewAddressDet = addSwiftAddress(NewAddressDet,req,SwiftData,fullName);
						/* Changes for the TrackerId:273053 Starts */
						addSwiftAddress(NewAddressDet,null,req,SwiftData,fullName,editFlag);
						/* Changes for the TrackerId:273053 ends */
					}else{
					/********************** SwiftAddress End tracker : 132659 *******************************************/

					if( j<addrTypeSize &&
							is_valid_req_arg(((StringBuffer)lstAddressType.get(j)).toString())) {
						NewAddressDet.setAddressCategory((((StringBuffer)lstAddressType.get(j)).toString()).trim());
					}else{
						NewAddressDet.setAddressCategory(null);
					}
					if( j<countrySize &&
							is_valid_req_arg(((StringBuffer)lstcountry.get(j)).toString())) {
						NewAddressDet.setCountry((((StringBuffer)lstcountry.get(j)).toString()).trim());
					}else{
						NewAddressDet.setCountry(null);
					}
					if( j<citySize &&
							is_valid_req_arg(((StringBuffer)lstcity.get(j)).toString())) {
						NewAddressDet.setCity((((StringBuffer)lstcity.get(j)).toString()).trim());
					}else{
						NewAddressDet.setCity(null);
					}
					if( j<stateSize &&
							is_valid_req_arg(((StringBuffer)lststate.get(j)).toString())) {
						NewAddressDet.setState((((StringBuffer)lststate.get(j)).toString()).trim());
					}else{
						NewAddressDet.setState(null);
					}
					if( j<zipSize &&
							is_valid_req_arg(((StringBuffer)lstZip.get(j)).toString())) {
						NewAddressDet.setZip((((StringBuffer)lstZip.get(j)).toString()).trim());
					}else{
						NewAddressDet.setZip(null);
					}
					if( j<houseNoSize &&
							is_valid_req_arg(((StringBuffer)lsthouseNo.get(j)).toString())) {
						NewAddressDet.setHouse_no((((StringBuffer)lsthouseNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHouse_no(null);
					}
					if( j<premiseNoSize &&
							is_valid_req_arg(((StringBuffer)lstpremiseNo.get(j)).toString())) {
						NewAddressDet.setPremise_name((((StringBuffer)lstpremiseNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setPremise_name(null);
					}
					if( j<buildingSize &&
							is_valid_req_arg(((StringBuffer)lstbuilding.get(j)).toString())) {
						NewAddressDet.setBuilding_level((((StringBuffer)lstbuilding.get(j)).toString()).trim());
					}else{
						NewAddressDet.setBuilding_level(null);
					}
					if( j<streetNoSize &&
							is_valid_req_arg(((StringBuffer)lststreetNo.get(j)).toString())) {
						NewAddressDet.setStreet_no((((StringBuffer)lststreetNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setStreet_no(null);
					}
					if( j<townSize &&
							is_valid_req_arg(((StringBuffer)lsttown.get(j)).toString())) {
						NewAddressDet.setTown((((StringBuffer)lsttown.get(j)).toString()).trim());
					}else{
						NewAddressDet.setTown(null);
					}
					if( j<localitySize &&
							is_valid_req_arg(((StringBuffer)lstlocality.get(j)).toString())) {
						NewAddressDet.setLocality_name((((StringBuffer)lstlocality.get(j)).toString()).trim());
					}else{
						NewAddressDet.setLocality_name(null);
					}
					if( j<domicileSize &&
							is_valid_req_arg(((StringBuffer)lstdomicile.get(j)).toString())) {
						NewAddressDet.setDomicile((((StringBuffer)lstdomicile.get(j)).toString()).trim());
					}else{
						NewAddressDet.setDomicile(null);
					}
					/*			if( j<lstaddressProof.size() &&
					 is_valid_req_arg(((StringBuffer)lstaddressProof.get(j)).toString())) {
					 NewAddressDet.setAddress_proof_doc_id((((StringBuffer)lstaddressProof.get(j)).toString()).trim());
					 }else{
					 NewAddressDet.setAddress_proof_doc_id(null);
					 }*/
					if( j<suburbSize &&
							is_valid_req_arg(((StringBuffer)lstsuburb.get(j)).toString())) {
						NewAddressDet.setSuburb((((StringBuffer)lstsuburb.get(j)).toString()).trim());
					}else{
						NewAddressDet.setSuburb(null);
					}
					if( j<streetNameSize &&
							is_valid_req_arg(((StringBuffer)lststreetName.get(j)).toString())) {
						NewAddressDet.setStreet_name((((StringBuffer)lststreetName.get(j)).toString()).trim());
					}else{
						NewAddressDet.setStreet_name(null);
					}
					if( j<addrProofSize &&
							is_valid_req_arg(((StringBuffer)lstIsAddressProofRcvd.get(j)).toString())) {
						NewAddressDet.setIsAddressProofRcvd((((StringBuffer)lstIsAddressProofRcvd.get(j)).toString()).trim());
					}else{
						NewAddressDet.setIsAddressProofRcvd(null);
					}
					/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x begin*/
					setIsAddrVerFlagVal(req,NewAddressDet,null,j);
					/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x end*/
					if( j<mailstopSize &&
							is_valid_req_arg(((StringBuffer)lstmailstop.get(j)).toString())) {
						NewAddressDet.setMailStop((((StringBuffer)lstmailstop.get(j)).toString()).trim());
					}else{
						NewAddressDet.setMailStop(null);
					}
					if( j<websiteSize &&
							is_valid_req_arg(((StringBuffer)lstwebsite.get(j)).toString())) {
						NewAddressDet.setURL((((StringBuffer)lstwebsite.get(j)).toString()).trim());
					}else{
						NewAddressDet.setURL(null);
					}

					if( j<upDtFlagSize &&
							is_valid_req_arg(((StringBuffer)lstUpdateDateFlag.get(j)).toString())) {

						String flagvalue =(((StringBuffer)lstUpdateDateFlag.get(j)).toString());
						if(flagvalue!=null)
						if(flagvalue.equals("Y"))
						{
							Date lastupdatedate= new Date();
							NewAddressDet.setLastUpdate_Date(lastupdatedate);
						}
					}
					/* CIF PhoneEmail Changes : Start */
					if( j<addrTypeSize && preferredAddress !=null && !preferredAddress.equalsIgnoreCase("undefined"))
					{
//						NewAddressDet.setPreferredAddress(preferredAddress.trim());
						String addresstype = (String)lstAddressType.get(j).toString().trim();
						if(addresstype!=null)
						if(addresstype.equalsIgnoreCase(preferredAddress))
						{
							NewAddressDet.setPreferredAddress("Y");
						}
						else
						{
							NewAddressDet.setPreferredAddress("N");
						}
					}
					else
					{
						NewAddressDet.setPreferredAddress(null);
					}
					if( j<prefFormatSize &&
							is_valid_req_arg(((StringBuffer)lstpreferredFormat.get(j)).toString())) {
						NewAddressDet.setPreferredFormat((((StringBuffer)lstpreferredFormat.get(j)).toString()).trim());
					}else{
						NewAddressDet.setPreferredFormat(null);
					}
					if( j<holdMailSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailReason.get(j)).toString())) {
						NewAddressDet.setHoldMailReason((((StringBuffer)lstholdMailReason.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailReason(null);
					}
					if( j<bizcenterSize &&
							is_valid_req_arg(((StringBuffer)lstbusinessCenter.get(j)).toString())) {
						NewAddressDet.setBusinessCenter((((StringBuffer)lstbusinessCenter.get(j)).toString()).trim());
					}else{
						NewAddressDet.setBusinessCenter(null);
					}
					if( j<holdMailInitSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailInitiatedBy.get(j)).toString())) {
						NewAddressDet.setHoldMailInitiatedBy((((StringBuffer)lstholdMailInitiatedBy.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailInitiatedBy(null);
					}
					if( j<holdMailFlagSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailFlag.get(j)).toString())) {
						NewAddressDet.setHoldMailFlag((((StringBuffer)lstholdMailFlag.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailFlag(null);
					}
					if( j<freeTxtLabelSize &&
							is_valid_req_arg(((StringBuffer)lstfreeTextLabel.get(j)).toString())) {
						NewAddressDet.setFreeTextLabel((((StringBuffer)lstfreeTextLabel.get(j)).toString()).trim());
					}else{
						NewAddressDet.setFreeTextLabel(null);
					}
					/* CIF PhoneEmail Changes : End*/

					/* CIF Changes for Address Line Fields : Start */
					//Tracker:90196: Changes for Attribute Masking
					if(NewAddressDet.getHouse_no() != null)
					{
						if(mailingIndex == j)
						{
							strHouse_No = NewAddressDet.getHouse_no();
						}
					}
					if(NewAddressDet.getBuilding_level() != null)
					{
						if(mailingIndex == j)
						{
							strBuilding_Level = NewAddressDet.getBuilding_level();
						}
					}
					if(NewAddressDet.getStreet_no() != null)
					{
						if(mailingIndex == j)
						{
							strStreet_No = NewAddressDet.getStreet_no();
						}
					}
					if(NewAddressDet.getStreet_name() != null)
					{
						if(mailingIndex == j)
						{
							strStreet_Name = NewAddressDet.getStreet_name();
						}
					}
					if(NewAddressDet.getSuburb() != null)
					{
						if(mailingIndex == j)
						{
							strSuburb = NewAddressDet.getSuburb();
						}
					}
					if(NewAddressDet.getLocality_name() != null)
					{
						if(mailingIndex == j)
						{
							strLocality_Name = NewAddressDet.getLocality_name();
						}
					}
					if(NewAddressDet.getTown() != null)
					{
						if(mailingIndex == j)
						{
							strTown = NewAddressDet.getTown();
						}
					}
					if(NewAddressDet.getMailStop() != null)
					{
						if(mailingIndex == j)
						{
							strMail_Stop = NewAddressDet.getMailStop();
						}
					}
					//Tracker:90196: End of Changes for Attribute Masking
					/* AdressLine changes: START */
					if( j<prefFormatSize &&
							is_valid_req_arg(((StringBuffer)lstpreferredFormat.get(j)).toString())) {
						NewAddressDet.setPreferredFormat((((StringBuffer)lstpreferredFormat.get(j)).toString()).trim());
					}else{
						NewAddressDet.setPreferredFormat(null);
					}
					if(NewAddressDet.getPreferredFormat() != null && !NewAddressDet.getPreferredFormat().equals("STRUCTURED_FORMAT")){
						if( j<addrLine1Size &&
								is_valid_req_arg(((StringBuffer)lstAddressLine1.get(j)).toString())) {
							NewAddressDet.setAddress_Line1((((StringBuffer)lstAddressLine1.get(j)).toString()).trim());
						}else{
							NewAddressDet.setAddress_Line1(null);
						}
						if( j<addrLine2Size &&
								is_valid_req_arg(((StringBuffer)lstAddressLine2.get(j)).toString())) {
							NewAddressDet.setAddress_Line2((((StringBuffer)lstAddressLine2.get(j)).toString()).trim());
						}else{
							NewAddressDet.setAddress_Line2(null);
						}
						if( j<addrLine3Size &&
								is_valid_req_arg(((StringBuffer)lstAddressLine3.get(j)).toString())) {
							NewAddressDet.setAddress_Line3((((StringBuffer)lstAddressLine3.get(j)).toString()).trim());
						}else{
							NewAddressDet.setAddress_Line3(null);
						}
					}
					if(mailingIndex == j){
						if(NewAddressDet.getPreferredFormat() != null && !NewAddressDet.getPreferredFormat().equals("STRUCTURED_FORMAT")){
							Addr1 = NewAddressDet.getAddress_Line1();
							Addr2 = NewAddressDet.getAddress_Line2();
							Addr3 = NewAddressDet.getAddress_Line3();
						}
						else{
							boolean ifPrevPresent = false;
							Addr1= "";
							Addr2= "";
							Addr3= "";
							if(!(strHouse_No == null)){
								Addr1 = Addr1 + strHouse_No.trim();
								ifPrevPresent = true;
							}
							if(!(strBuilding_Level==null)){
								if(ifPrevPresent == true){
									Addr1 = Addr1 + ",";
								}
								else{
									ifPrevPresent = true;
								}
								Addr1 = Addr1 + strBuilding_Level.trim();
							}
							if(!(NewAddressDet.getPremise_name() ==null)){
								if(ifPrevPresent == true){
									Addr1 = Addr1 + ",";
								}
								Addr1 = Addr1 + NewAddressDet.getPremise_name().trim();
							}
							ifPrevPresent = false;
							if(!(strStreet_No ==null)){
								Addr2 = Addr2 + strStreet_No.trim();
								ifPrevPresent = true;
							}
							if(!(strStreet_Name ==null)){
								if(ifPrevPresent == true){
									Addr2 = Addr2 + ",";
								}
								else{
									ifPrevPresent = true;
								}
								Addr2 = Addr2 + strStreet_Name.trim();
							}
							if(!(strLocality_Name==null)){
								if(ifPrevPresent == true){
									Addr2 = Addr2 + ",";
								}
								Addr2 = Addr2 + strLocality_Name.trim();
							}
							ifPrevPresent = false;
							if(!(strSuburb==null)){
								Addr3 = Addr3 + strSuburb.trim();
								ifPrevPresent = true;
							}
							if(!(strTown==null)){
								if(ifPrevPresent == true){
									Addr3 = Addr3 + ",";
								}
								Addr3 = Addr3 + strTown.trim();
							}
						}
					}
					/* AdressLine changes: END */

					strAL_Addr1="";
					strAL_Addr2="";
					strAL_Addr3="";

					/* CIF Changes for Address Line Fields : End */


					NewAddressDet.setCore_cust_id(coreCustId);

					/*Changes by Ramsurendar S. BEGIN*/
					//NewAddressDet.setSalutation_code(sSalutation_code);
					//if(sSalutation.length() > 5)
					//NewAddressDet.setSalutation_code(((sSalutation).substring(1,5)));
					//NewAddressDet.setSalutation_code((sSalutation));
					/*Changes by Ramsurendar S. END*/
					//Changes for tracker id :253845- Start

					setHouseholdAddrfields(req,NewAddressDet,j,sc);
					
					if( j<strtDateSize &&
							is_valid_req_arg(((StringBuffer)lststartDate.get(j)).toString())) {
						String StartDate1 = (((StringBuffer)lststartDate.get(j)).toString().trim());

						java.util.Date tmpDate_cif = null;
						Calendar cal_cif = Calendar.getInstance();
						//long milliSec;
						// ME TimeZone Changes : Start
						//int deltaTime_cif = sc.getClientTimeDiff();
						java.util.Date newTmpDate_cif = null;
						SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
						if((StartDate1!=null)&&(!StartDate1.equalsIgnoreCase(""))&&(!StartDate1.equalsIgnoreCase(" "))){
							cal_cif.setTime((Date)srfm.stringToDate(StartDate1));
							tmpDate_cif = cal_cif.getTime();
							/*milliSec = tmpDate_cif.getTime();
							 milliSec -= deltaTime_cif * 1000 * 60;*/
					//milliSec = (SRMDate.getGMT(tmpDate_cif)).getTime();
							// ME TimeZone Changes : End
					milliSec = tmpDate_cif.getTime();
						//	milliSec +=(12*60*60*1000); //Fix for recon callid 159921-Ticket 306685

							newTmpDate_cif = new java.util.Date(milliSec);
                            /*tracker id 159807 changes starts*/
							NewAddressDet.setStart_Date(tmpDate_cif);
                            /*tracker id 159807 changes ends*/
						}else{
							NewAddressDet.setStart_Date(null);
						}
					}else{
						NewAddressDet.setStart_Date(null);
					}
//Changes for ticket :366882  start
					if( j<endDateSize &&
							is_valid_req_arg(((StringBuffer)lstendDate.get(j)).toString().trim())) {
//Changes for ticket :366882  end
						String endDate1 = (((StringBuffer)lstendDate.get(j)).toString());
						if(endDate1!=(null)){
							if (!endDate1.trim().equals("")){
								java.util.Date tmpDate_cif = null;
								Calendar cal_cif = Calendar.getInstance();
								//long milliSec;

								// ME TimeZone Changes : Start
								//int deltaTime_cif = sc.getClientTimeDiff();
								java.util.Date newTmpDate_cif = null;

								SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
								cal_cif.setTime((Date)srfm.stringToDate(endDate1));
								tmpDate_cif = cal_cif.getTime();
								/*milliSec = tmpDate_cif.getTime();
								 milliSec -= deltaTime_cif * 1000 * 60;*/
								milliSec = (SRMDate.getGMT(tmpDate_cif)).getTime();
								// ME TimeZone Changes : End
								milliSec +=(12*60*60*1000);
								newTmpDate_cif = new java.util.Date(milliSec);
	                           /*tracker id 159807 changes starts*/
                               NewAddressDet.setEnd_Date(tmpDate_cif);
							  /*tracker id 159807 changes ends*/

							}
						}

					}else{
						java.util.Date tmpDate_cif = null;
						Calendar cal_cif = Calendar.getInstance();

						//int deltaTime_cif = sc.getClientTimeDiff();
						java.util.Date newTmpDate_cif = null;
						/*Fix for Tracker #: SIDDHARTH Starts*/
						/*
						 String localeType = null;
						 try
						 {
						 Properties prop1 = EditorUtil.getBusinessRulesInfo();
						 localeType 	   = prop1.getProperty(EditorUtil.LOCALE_TYPE).toString();
						 }
						 catch(Exception e)
						 {
						 throw e;
						 }
						 */
						SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());


						/* Created a Date object of date "31/12/2099" in GMT format as per core requirement.
						 This date is not converted basedon locale amd will be saved inGMT format in database.*/

						//SimpleDateFormat smplDF = new SimpleDateFormat("dd/MM/yyyy");
						Date hdCodedEndDate = null;
						//try {
							//hdCodedEndDate = smplDF.parse("31/12/2099");
							hdCodedEndDate=srfm.getStdUpperDate();
						//} catch (java.text.ParseException e ) {
							//throw new FCRMGenericException("MSGEXC0200",new Exception("Error During creation of Date Object"));
						//}
						//cal_cif.setTime((Date)srfm.stringToDate(strAddEndDate));

						cal_cif.setTime(hdCodedEndDate);
						/*Fix for Tracker #: SIDDHARTH Ends*/

						tmpDate_cif = cal_cif.getTime();
						milliSec = tmpDate_cif.getTime();
						//milliSec -= deltaTime_cif * 1000 * 60;
						//milliSec +=(12*60*60*1000);
						newTmpDate_cif = new java.util.Date(milliSec);
						  /*tracker id 159807 changes starts*/
						NewAddressDet.setEnd_Date(tmpDate_cif);
						  /*tracker id 159807 changes ends*/
					}
					/**** CIF changes:Saving name in Address:Start*************/
					//NewAddressDet.setName(fullName.trim());
					/**** CIF changes:Saving name in Address:End*************/
					}

					if(!found){
						address.add(NewAddressDet);
					}
				}
				/* Change for ticket 366907 start */
				}
				/* Change for ticket 366907 end */
				/************************ SwiftAddress start tracker : 132659 ***************************************/
				if(swiftFlag){

					AccountBO.Address NewSwiftAddress= (AccountBO.Address)businessObject.getInstance("Address");
					//NewSwiftAddress = addSwiftAddress(NewSwiftAddress,req,SwiftData,fullName);
					/* Changes for the TrackerId:273053 Starts */
					addSwiftAddress(NewSwiftAddress,null,req,SwiftData,fullName,editFlag);
					/* Changes for the TrackerId:273053 ends */
					address.add(NewSwiftAddress);

				}
				/************************ SwiftAddress End tracker : 132659 ***************************************/

				/* CIF PhoneEmail Changes : Start */
				SRMCollection phoneEmail = businessObject.getPhoneEmail();
				ArrayList AvailablePhone_Email =  new ArrayList();
				for(int iCount=0; iCount < phoneEmail.size(); iCount++) {
					AvailablePhone_Email.add(((AccountBO.PhoneEmail)phoneEmail.get(iCount)).getPhoneEmailID().toString());
				}

				for(int j =0;j < phEmailTypeSize;j++)// the list of all Phone/Email from the view
				{
					AccountBO.PhoneEmail NewPhoneEmailDet = null;
					boolean found = false;
					String tempPhoneEmailID = null;
					if(isCopy!=null)
					if(!isCopy.equalsIgnoreCase("Y"))
						tempPhoneEmailID = lstPhoneEmailID.get(j).toString().trim();
					AccountBO.PhoneEmail tempPhoneEmailDet = null;
					for(int n =0; n<phoneEmail.size();n++){// for all existing list of Phone/Email
						if(tempPhoneEmailID == null || tempPhoneEmailID.equals("null") || tempPhoneEmailID.equals("")){
							found = false;
							break;
						}
						tempPhoneEmailDet = (AccountBO.PhoneEmail)phoneEmail.get(n);
						if(tempPhoneEmailDet.getPhoneEmailID()!= null){
							if(tempPhoneEmailDet!=null)
							if(((tempPhoneEmailDet.getPhoneEmailID()).toString()).equals(tempPhoneEmailID.toString())){
								found = true;
								break;
							}
							continue;
						}
					}

					if(found){
						NewPhoneEmailDet = tempPhoneEmailDet;
					}
					else{
						NewPhoneEmailDet = (AccountBO.PhoneEmail)businessObject.getInstance("PhoneEmail");
					}
					//changes for tracker 230987 starts
					if( j<phEmailTypeSize && ((preferredPhone !=null && !preferredPhone.equalsIgnoreCase("undefined")) || (preferredEmail !=null && !preferredEmail.equalsIgnoreCase("undefined"))))
					{
					//changes for tracker 230987 ends
//						NewAddressDet.setPreferredAddress(preferredAddress.trim());
						String currPhoneEmailType = (String)lstPhoneEmailType.get(j).toString().trim();
					//Recon Changes for callid 733030 starts
						if (((StringBuffer)lstPhoneorEmail.get(j)).toString().equalsIgnoreCase("Phone"))
						{
							if((currPhoneEmailType!=null) && (currPhoneEmailType.equalsIgnoreCase(preferredPhone)))
								NewPhoneEmailDet.setPreferredFlag("Y");
							else
								NewPhoneEmailDet.setPreferredFlag("N");
						}
						else
						{
						 if((currPhoneEmailType!=null) && (currPhoneEmailType.equalsIgnoreCase(preferredEmail)))
							NewPhoneEmailDet.setPreferredFlag("Y");
						else
							NewPhoneEmailDet.setPreferredFlag("N");
						}
					//Recon Changes for callid 733030 ends
					}
					else
					{
						NewPhoneEmailDet.setPreferredFlag(null);
					}
					/*			if( j<lstPhoneEmailType.size() && preferredEmail !=null && !preferredEmail.equalsIgnoreCase("undefined"))
					 {
					 //				NewAddressDet.setPreferredAddress(preferredAddress.trim());
					  String currPhoneEmailType = (String)lstPhoneEmailType.get(j).toString().trim();
					  if(currPhoneEmailType.equalsIgnoreCase(preferredEmail))
					  {
					  NewPhoneEmailDet.setPreferredFlag("Y");
					  }
					  else
					  {
					  NewPhoneEmailDet.setPreferredFlag("N");
					  }
					  }
					  else
					  {
					  NewPhoneEmailDet.setPreferredFlag(null);
					  }*/
					if( j<phEmailTypeSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneEmailType.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneEmailType((((StringBuffer)lstPhoneEmailType.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneEmailType(null);
					}

					if( j<phoneSize &&
							is_valid_req_arg(((StringBuffer)lstPhone.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNo((((StringBuffer)lstPhone.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNo(null);
					}

					if( j<phorEmailSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneorEmail.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneOrEmail(((StringBuffer)lstPhoneorEmail.get(j)).toString().trim());
//						NewPhoneEmailDet.setPhoneOrEmail("P");
					}else{
						NewPhoneEmailDet.setPhoneOrEmail(null);
					}

					if( j<eMailSize &&
							is_valid_req_arg(((StringBuffer)lsteMail.get(j)).toString())) {
						NewPhoneEmailDet.setEmail((((StringBuffer)lsteMail.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setEmail(null);
					}
					/*			if( j<lstEmailPalm.size() &&
					 is_valid_req_arg(((StringBuffer)lstEmailPalm.get(j)).toString())) {
					 NewPhoneEmailDet.setEmailPalm((((StringBuffer)lstEmailPalm.get(j)).toString()).trim());
					 }else{
					 NewPhoneEmailDet.setEmailPalm(null);
					 }*/
					if( j<phnCntrySize &&
							is_valid_req_arg(((StringBuffer)lstPhoneCountryCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoCountryCode((((StringBuffer)lstPhoneCountryCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoCountryCode(null);
					}
					/*413659*/
					// Changes for Call id: 644068 starts
					if( j<USERFIELD1Size && is_valid_req_arg(((StringBuffer)lstUSERFIELD1.get(j)).toString())) {						
						NewPhoneEmailDet.setUSERFIELD1((((StringBuffer)lstUSERFIELD1.get(j)).toString()).trim());
					// Changes for Call id: 644068 ends
					}else{
						NewPhoneEmailDet.setUSERFIELD1(null);
					/*413659 ends */
					}
					if( j<phnCitySize &&
							is_valid_req_arg(((StringBuffer)lstPhoneCityCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoCityCode((((StringBuffer)lstPhoneCityCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoCityCode(null);
					}
					if( j<phnLocalSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneLocalCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoLocalCode((((StringBuffer)lstPhoneLocalCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoLocalCode(null);
					}
					if( j<extnSize &&
							is_valid_req_arg(((StringBuffer)lstextension.get(j)).toString())) {
						NewPhoneEmailDet.setWorkExtension((((StringBuffer)lstextension.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setWorkExtension(null);
					}
					/*recon tracker id 144966 Ticket 348922 changes starts*/
					NewPhoneEmailDet=AccMainHelper.setMethods(NewPhoneEmailDet,req,j);
					/*recon tracker id 144966 Ticket 348922 changes ends*/
					if(!found){
						phoneEmail.add(NewPhoneEmailDet);
					}
				}

				/* CIF PhoneEmail Changes : End */

				/**********Code For Deleting Address:Start***************/
				if(lstadrRemoved != null) {
					for(int iCnt=0; iCnt < adrRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstadrRemoved.get(iCnt));
						int index = AvailableAddress.indexOf(sdelAsset);
						if(index != -1) {
							AccountBO.Address delAsset = (AccountBO.Address)address.get(index);
							if(delAsset.getAddressID() != new Integer(lstadrRemoved.get(iCnt).toString())){
								address.remove(index);
								AvailableAddress.remove(index);
							}

						}
					}
				}
				/**********Code For Deleting Address:End***************/

				/* CIF PhoneEmail Changes : Start */ // Code For deleting Phone/Email


				if(lstPhoneEmailRemoved != null) {
					for(int iCnt=0; iCnt < phnEmailRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstPhoneEmailRemoved.get(iCnt));
						int index = AvailablePhone_Email.indexOf(sdelAsset);
						if(index != -1) {
							AccountBO.PhoneEmail delAsset = (AccountBO.PhoneEmail)phoneEmail.get(index);


							if(delAsset.getPhoneEmailID() != new Integer(lstPhoneEmailRemoved.get(iCnt).toString())){

								phoneEmail.remove(index);
								AvailablePhone_Email.remove(index);
							}

						}
					}
				}
				/* CIF PhoneEmail Changes : End */
			}

			/****************************/
			//CIF ADDRESS SAVING -end
			/****************************/

			/*************Address cleanup::End**************************************/
			else{
				ArrayList avilableAddrCats = new ArrayList();
				//SRMCollection address = businessObject.getAddress();


				for (int i = 0; i < addressSize; i++){
					avilableAddrCats.add(((AccountBO.Address)address.get(i)).getAddressCategory());
				}

				SRMQueryResult qrAddr=CommonQueries.getCategories(bc,"ORG_ADDRESS_TYPE");
				SRMRecordSet  rs = qrAddr.getRecordSet();

				while(rs.hasNext()) {
					// assuming the first item in the result set is category value
					// second item in category id
					String addrCat = ((List)rs.getNext()).get(0).toString();
					boolean allFieldsEmpty = false;
					String addr1 = req.getParameter(addrCat + ".txt_Address1");
					String addr2 = req.getParameter(addrCat + ".txt_Address2");
					String addr3 = req.getParameter(addrCat + ".txt_Address3");
					String city = req.getParameter(addrCat + ".txt_City");
					String country = req.getParameter(addrCat + ".txt_Country");
					String mailStop = req.getParameter(addrCat + ".txt_MailStop");
					String state = req.getParameter(addrCat + ".txt_State");
					String zip = req.getParameter(addrCat + ".txt_Zip");

					String userField1 = req.getParameter(addrCat + ".txt_userField1");
					String userField2 = req.getParameter(addrCat + ".txt_userField2");
					String userField3 = req.getParameter(addrCat + ".txt_userField3");
					String userField4 = req.getParameter(addrCat + ".txt_userField4");
					String residentialStatus = req.getParameter(addrCat + ".txt_residentialStatus");

					SRMTypedAttrStringized userDateField1 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField1");
					SRMTypedAttrStringized userDateField2 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField2");


					SRMTypedAttrStringized startDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_Start_Date");
					SRMTypedAttrStringized endDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_End_Date");

					Calendar cal1 = Calendar.getInstance();
					java.util.Date tmpDate1 = null;
					java.util.Date newTmpDate1 = null;

					if( (addr1 == null || addr1.trim().equals("")) &&
							(addr2 == null || addr2.trim().equals("")) &&
							(addr3 == null || addr3.trim().equals("")) &&
							(city == null || city.trim().equals("")) &&
							(country == null || country.trim().equals("")) &&
							(mailStop == null || mailStop.trim().equals("")) &&
							(state == null || state.trim().equals("")) &&
							(zip == null || zip.trim().equals("")) &&
							(userField1 == null || userField1.trim().equals("")) &&
							(userField2 == null || userField2.trim().equals("")) &&
							(userField3 == null || userField3.trim().equals("")) &&
							(userField4 == null || userField4.trim().equals("")) &&
							(residentialStatus == null || residentialStatus.trim().equals("")) &&
							(startDate == null || startDate.getValue().equalsIgnoreCase("")) &&
							(endDate == null || endDate.getValue().equalsIgnoreCase(""))  &&
							(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase("")) &&
							(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))) {
						allFieldsEmpty = true;
					}

					int index = avilableAddrCats.indexOf(addrCat);
					if(index != -1) { // address exists, update it
						if(allFieldsEmpty) { // remove the address from the db;
							address.remove(index);
							avilableAddrCats.remove(index);
						} else { // update the existing address

							AccountBO.Address tempAddr = (AccountBO.Address)address.get(index);
							setUpdateExistingAddress(tempAddr,addr1,addr2,addr3,city,country,mailStop,state,zip.trim(),userField1,userField2,userField3,userField4,residentialStatus);
							/*tempAddr.setAddress_Line1(addr1);
							tempAddr.setAddress_Line2(addr2);
							tempAddr.setAddress_Line3(addr3);
							tempAddr.setCity(city);
							tempAddr.setCountry(country);
							tempAddr.setMailStop(mailStop);
							tempAddr.setState(state);
							tempAddr.setZip(zip.trim());
							tempAddr.setUserField1(userField1);
							tempAddr.setUserField2(userField2);
							tempAddr.setUserField3(userField3);
							tempAddr.setUserField4(userField4);
							tempAddr.setResidentialStatus(residentialStatus);*/

							if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
						   /*tracker id 159807 changes starts*/
								tmpDate1 = null;
							}

							tempAddr.setStart_Date(tmpDate1);
						 /*tracker id 159807 changes ends*/


							if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
						   /*tracker id 159807 changes starts*/
								tmpDate1 = null;
							}
							tempAddr.setEnd_Date(tmpDate1);
						 /*tracker id 159807 changes ends*/


							if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField1(newTmpDate1);

							if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField2(newTmpDate1);

							if (tempAddr.isExtensible()){
								tempAddr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
							}
						}
					} else if( !allFieldsEmpty) { // create the new address
						AccountBO.Address addr = (AccountBO.Address)businessObject.getInstance("Address");
						addr.setAddress_Line1(addr1);
						addr.setAddress_Line2(addr2);
						addr.setAddress_Line3(addr3);
						addr.setCity(city);
						addr.setCountry(country);
						addr.setAddressCategory(addrCat);
						addr.setMailStop(mailStop);
						addr.setState(state);
						addr.setZip(zip.trim());
						addr.setUserField1(userField1);
						addr.setUserField2(userField2);
						addr.setUserField3(userField3);
						addr.setUserField4(userField4);
						addr.setResidentialStatus(residentialStatus);

						if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
							tmpDate = cal1.getTime();
							milliSec = tmpDate.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
						/*tracker id 159807 changes starts*/
							tmpDate = null;
						}

						addr.setStart_Date(tmpDate);
						/*tracker id 159807 changes ends*/


						if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
					   /*tracker id 159807 changes starts*/
							tmpDate1 = null;
						}
						addr.setEnd_Date(tmpDate1);
						/*tracker id 159807 changes ends*/


						if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField1(newTmpDate1);

						if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField2(newTmpDate1);

						if (addr.isExtensible()){
							addr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
						}
						address.add(addr);
					}
				}
			}
			/***************** SAVING ADDRESS END ***********/

			/*added for extensibility
			 */
			if (businessObject.isExtensible()){
				businessObject.setExtendedAttribs(Utils.convertExtendValuesToObject(req,"AccountBO"));
			}
			/*added for extensibility
			 */

			/****	******** DONT MOVE THE FOLLOWING CODE UP: START *****************/
			if(isCopy!=null)
			if((accountURL==null) || (accountURL.equals(""))|| isCopy.equalsIgnoreCase("Y")) {
				//Key Generation changes

				/* fix during sanity testing start*/
				if(acctKey!=null){
/* fix during sanity testing end */
//changes for tracker id :253845 starts
					if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")&& !convToCust.equals("Y")) {
//changes for tracker id :253845 ends
						/*if(!keyPrefix.equals("")){
						 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
						 acctKey = AccountIDGen.getAnother(bc, keyPrefix,bPopPref);
						 } else {
						 acctKey = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()),bPopPref);
						 }
						 }
						 else if(!codeNNTM.equals("")){
						 acctKey = cifId;
						 }*/
					 //Changes for tracker id: 338439 starts
					//	key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);
					//Changes for tracker id: 338439 ends
						acctKey = (String)key.get("entityKey");
						/* Changes for tracker 180240 start */
						/*Begin Changes TrackerID: 178897*/
						//coreCustId = (String)key.get("coreCustId");
						/*End Changes TrackerID: 178897*/
						/* Changes for tracker 180240 end */
				businessObject.setCore_cust_id(coreCustId);

				execute = true;


					}
				}
				//End
			}

			//changes for tracker id :253845 starts
			if((isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true"))&& !convToCust.equalsIgnoreCase("Y")) {

			//changes for tracker id :253845 ends
				if ( acctKey != null && !acctKey.equals(businessObject.getAccountKey()) ) {
					//Changes for checking the CIF IDs for all the entities
					//Key Generation changes
					/*boolean keyexists=Utils.checkExistingCIFID(bc,acctKey);

					 if (keyexists) {
					 throw new SRMBCException(
					 SRMBCException.ACCOUNT_KEY_ALREADY_EXISTS,
					 SRMBCException.MakeReplaceableArg(acctKey),
					 null
					 );
					 }
					 else{*/
					 //Changes for tracker id: 338439 starts
				//	key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);
				//Changes for tracker id: 338439 ends
					acctKey = (String)key.get("entityKey");

				//coreCustId = (String)key.get("coreCustId");
				businessObject.setCore_cust_id(coreCustId);
					businessObject.setAccountKey (acctKey);
					//  businessObject.setGroupID (groupId);
					// }
					//End
				}
			} else {
				//Tracker 195897 changes
                if(acctKey==null){
				//Changes for tracker id: 338439 starts
				//	key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);
				//Changes for tracker id: 338439 ends
				    acctKey = (String)key.get("entityKey");
				}
				businessObject.setCore_cust_id(coreCustId);
				businessObject.setAccountKey (acctKey);
				//   businessObject.setGroupID (groupId);
			}


            // Tracker id 113276 CURRENCY CHANGES START
            //SIT Fix For setting CoreCustID in MiscellaneousInfo Table Start
            /* Change for 374326 and 374328 start */
            String prefloc = req.getParameter("hid_preflocale");
            //232111 changes starts
			            if(prefloc != null && !prefloc.equalsIgnoreCase("")){
						PsychoBO.setPreferred_Locale(prefloc);
					}
		//232111 changes ends
			/* Change for 374326 and 374328 end */
			PsychoBO = cifUtils.CurrencyDetInfo(PsychoBO, req,coreCustId, context,entity_cre_flag, apprFlag,editFlag);
			//SIT Fix For setting CoreCustID in MiscellaneousInfo Table End
			//Tracker ID 113276 CURRENCY CHANGES END

						// Tracker ID: 132221 Begins
                        businessObject.setSsn(ssnID);
						businessObject.setPAN(panID);
		 //Adhar changes for tracker 375136 moved call
						businessObject.setUniqueIDNumber(UniqueIDNumber);
						//197567
					    businessObject.setLicenseNo(dlID);
						if(pnID != null && (!pnID.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
						businessObject.setPassportNo(pnID);
						businessObject.setIDTypeR1(IDTypeR1);
						businessObject.setIDTypeR2(IDTypeR2);
						businessObject.setIDTypeR3(IDTypeR3);
						businessObject.setIDTypeR4(IDTypeR4);
						businessObject.setIDTypeR5(IDTypeR5);
						if(uniqueID != null && (!uniqueID.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
						businessObject.setUniqueId(uniqueID);
						if(uniqueIDType != null && (!uniqueIDType.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
			            businessObject.setUniqueIdType(uniqueIDType);
			            businessObject.setOccupation(occupation);
						// Tracker ID: 132221 Ends
						//changes for callid 195762 Ticket: 387004 tracker: 235476 start
						businessObject.setNat_id_card_num(sNat_id_card_num);
						//changes for callid 195762 Ticket: 387004 tracker: 235476 end

			/* Duplication of Demographic Value*/


			/*Hashtable hTable = CommonMethodsForPsycoDemo.supplimentFill(req);
			businessObject.setPAN(RevertHashObj((String)hTable.get("PAN")));
			businessObject.setSsn(RevertHashObj((String)hTable.get("SSN")));
			businessObject.setLicenseNo(RevertHashObj((String)hTable.get("Licence")));
			businessObject.setPassportNo(RevertHashObj((String)hTable.get("Passport")));
			// Tracker 85215
			businessObject.setNat_id_card_num(RevertHashObj((String)hTable.get("NationCard")));
			businessObject.setEducation(RevertHashObj((String)hTable.get("Qualification")));
			businessObject.setOccupation(RevertHashObj((String)hTable.get("Profession")));
			businessObject.setDesignation(RevertHashObj((String)hTable.get("Designation")));
			businessObject.setIndustry(RevertHashObj((String)hTable.get("Industry")));
			SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
			if ((String)hTable.get("PPIssueDate")!=null)
			{
				businessObject.setPsprt_issue_date((Date)srfm.stringToDate((String)hTable.get("PPIssueDate")));
			}
			if ((String)hTable.get("PPExpDate")!=null)
			{
				businessObject.setPsprt_exp_date((Date)srfm.stringToDate((String)hTable.get("PPExpDate")));

			}*/
			/************ DONT MOVE THE FOLLOWING CODE UP: END *****************/

			/*
			 * vishal datasetincrement changes
			 */
			psprt_issue_exp(req,businessObject,Psprt_issue_date,Psprt_exp_date);  //Changes for call id 422914 
			int datasetFlag = 0;

			if (businessObject.isFilled()){
				AuditHelper helpr = new AuditHelper();

				helpr.compare (businessObject, Audit.getOldBO (businessObject, bc));

				String entityType = "Customer";



				datasetFlag = helpr.compareCif(entityType);



				if( datasetFlag == 1 )
				{

					businessObject.setIncrementalDate ( new Date() );
				}
			}
			else
			{
				businessObject.setIncrementalDate ( new Date() );
			}

			/* end of changes vishal */

			// vasanth's changes start


			if(prevTabs != null && !prevTabs.equals("")){
				if(prevTabs.indexOf(currentTab) == -1){
					newTabs = prevTabs+"|"+currentTab;
				}else{
					newTabs = prevTabs;
				}
			}else{
				prevTabs = currentTab;
				newTabs = currentTab;

			}


			String sIsDummy = businessObject.getIsDummy();
			if(sIsDummy != null && sIsDummy.equalsIgnoreCase("Y")){
				businessObject.setTabValidator(newTabs);
				sDummy = sIsDummy;
				if((CommonQueries.isTabMatching(fullList,newTabs))){//if all the Mandatory Tabs not filled
					if(!apprFlag){

						businessObject.setIsDummy("N");
					}
					chgDummy = true;

				}
			}else{
				businessObject.setIsDummy("N");
			}

			// vasanth's changes end
			businessObject.setIntroducerID(ctKeyIntro);
			//Added by Seema starts
			/** Setting  PreferredPhoneType, PreferredEmailType, PreferredAddressType
			 PreferredPhoneNumber, PreferredEmail**/
			if(preferredPhone != null && (!preferredPhone.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
			businessObject.setPreferredPhoneType(preferredPhone);
			if(preferredEmail != null && (!preferredEmail.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
			businessObject.setPreferredEmailType(preferredEmail);
			if(preferredAddress != null && (!preferredAddress.equalsIgnoreCase("")) && (!byPassFlag.equalsIgnoreCase("Y")))
			businessObject.setDefaultAddressType(preferredAddress);
			if(lstPhoneEmailType!=null && lstPhone!=null && preferredPhone!=null )
			//Changes for call id 419613 starts here
			businessObject.setPreferredPhone(Utils.getPreferredPhoneNumber(lstPhoneEmailType,lstPhone,preferredPhone).trim());
		   // Changes for call id 419613 ends here
			//Changes for tracker id 260212 start
			//if(lstPhoneEmailType!=null && lsteMail!=null && preferredEmail!=null )
			//Changes for tracker id 260212 end
			// Changes for call id 419613 starts here
			if(lstPhoneEmailType!=null && lsteMail!=null && preferredEmail!=null)
			businessObject.setPreferredEmail(Utils.getPreferredEmail(lstPhoneEmailType,lsteMail,preferredEmail).trim());
			// Changes for call id 419613 ends here
                 /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
			//Changes for Alert Server recon in 10.2.14 starts
			if(strPreferred_Mbl_Alert != null && !strPreferred_Mbl_Alert.equals("")){
				businessObject.setPreferred_Mobile_Alert_Type(strPreferred_Mbl_Alert);
			   /* Code added to get the value of Preferred Mobile Alert Number Which is present in the List
				  Box With The Help of the Method getPreferredPhoneNumber present in the com.infy.cis.ui.common utils class
				  by passing the Preferred Mobile  Alert  value By the Customer
			   */
				/*** LT 50 changes ***/
				businessObject.setPreferred_Mobile_Alert_No(Utils.getPreferredPhoneNumber(lstPhoneEmailType,lstPhone,strPreferred_Mbl_Alert));
			}
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
			//Changes for Alert Server recon in 10.2.14 ends
			//Added by Seema Ends
			if(saveFlag == 0){
				businessObject.setLastSubmittedDate(currDate);
			}
			/*TrackerID: 113227 start of changes */
			if(altLocaleActv!=null)
			if (altLocaleActv.equalsIgnoreCase("true") ){
                  /* Changes Begin Tracker Id : 195897 */
				businessObject = (com.infy.cis.srmbo.AccountBO)DualFieldSetter.invokeSetterMethods(boNameReq,businessObject,req);
                  /* Changes End Tracker Id : 195897 */
				/*TrackerID: 113227 end of changes */
			}
			// changes for tracker id :253845 Start
						/* Tracker ID:142437 */


					if(convToCust.equals("Y")){

						checkConversion(bc,oldEntityType,oldEntityID,businessObject);

//Changes for recon 391178,Call id:383869 starts
			businessObject.setConverted_Date(currDate);
//Changes for  recon 391178,Call id:383869 ends
					}		/* Tracker ID:142437 */
						 // changes for tracker id :253845 End
			//Tracket id 200178 starts
			if (TFBO==null){
					TFBO = new TradeFinanceBO();
			}
			//Tracket id 200178 ends
			if(TFBO!=null && isTFFlag!=null && isTFFlag.equals("Y"))
			{
				TFBO.setAccountID(0);// Set to 0 till server side validation is done

				TFBO.setName(businessObject.getName());
				TFBO.setOrgKey(businessObject.getAccountKey());
				String acctKeyTF=businessObject.getAccountKey();
				TFBO.setCore_Cust_ID(coreCustId);

				if(apprFlag){
					TFBO.setEntity_cre_flg("N");
				}
				else{
					TFBO.setEntity_cre_flg("Y");
				}
				//Tracker:90196: Changes for Attribute Masking
				if(strHouse_No.length()>5){
					strHouse_No=strHouse_No.substring(0,4);
				}
				if(strBuilding_Level.length()>5){
					strBuilding_Level=strBuilding_Level.substring(0,4);
				}
				if(strStreet_No.length()>10){
					strStreet_No=strStreet_No.substring(0,9);
				}
				if(strStreet_Name.length()>20){
					strStreet_Name=strStreet_Name.substring(0,19);
				}
				if(strSuburb.length()>40){
					strSuburb=strSuburb.substring(0,39);
				}
				if(strLocality_Name.length()>15){
					strLocality_Name=strLocality_Name.substring(0,14);
				}
				if(strTown.length()>15){
					strTown=strTown.substring(0,14);
				}
				if(strMail_Stop.length()>12){
					strMail_Stop=strMail_Stop.substring(0,11);
				}
				if(!(((strHouse_No).trim().equals(""))||((strBuilding_Level).trim().equals(""))||(strHouse_No==null)||(strBuilding_Level==null))){
					strHouse_No=(strHouse_No).trim()+"-";
				}
				if(!(((strStreet_No).trim().equals(""))||((strStreet_Name).trim().equals(""))||(strStreet_No==null)||(strStreet_Name==null))){
					strStreet_No=(strStreet_No).trim()+" ";
				}
				if((((!((strHouse_No).trim().equals("")))&&((strHouse_No!=null)))||((!((strBuilding_Level).trim().equals("")))&&(strBuilding_Level!=null)))&&(((!((strStreet_No).trim().equals("")))&&(strStreet_No!=null))||((!((strStreet_Name).trim().equals("")))&&(strStreet_Name!=null)))){
					if((!((strHouse_No).trim().equals("")))&&((strBuilding_Level).trim().equals("")))
					{
						strHouse_No=(strHouse_No).trim()+",";
					}
					else
					{
						strBuilding_Level=(strBuilding_Level).trim()+",";
					}
				}

				if((!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)))&&((strTown==null)||((strTown).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
				}
				else if((!(((strTown).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strTown==null)||(strMail_Stop==null)))&&((strLocality_Name==null)||((strLocality_Name).trim().equals("")))){
					strMail_Stop=(strMail_Stop).trim()+",";
				}
				else if((!(((strLocality_Name).trim().equals(""))||((strTown).trim().equals(""))||(strLocality_Name==null)||(strTown==null)))&&((strMail_Stop==null)||((strMail_Stop).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
				}
				else if(!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)||(strTown==null)||((strTown).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
					strMail_Stop=(strMail_Stop).trim()+",";
				}

				clearstrFields();
				//Tracker:90196: End of Changes for Attribute Masking
				/* AdressLine changes: START */
				/*Changes for tracker id 206905:Start*/
				if(Addr1!=null && Addr2!=null && Addr3!=null){
				StringBuilder strbAddrFields = new StringBuilder(Addr1).append("$").append(Addr2).append("$").append(Addr3).append("$").append(strCity.trim()).append("$").append(strState.trim())
																	   .append("$").append(strCountry.trim()).append("$").append(strZip.trim()).append("$").append(strCity_code.trim())
																	   .append("$").append(strCountry_code.trim());
				//AddressFields = Addr1+"$"+Addr2+"$"+Addr3+"$"+strCity.trim()+"$"+strState.trim()+"$"+strCountry.trim()+"$"+strZip.trim()+"$"+strCity_code.trim()+"$"+strCountry_code.trim();
				AddressFields = strbAddrFields.toString();
				}
				/*Changes for tracker id 206905:End*/
				//Chnages for TOL 709277
				Utils.truncateAddFields(TFBO, Addr1, Addr2, Addr3);
				//TFBO.setAddr_1(Addr1);
				//TFBO.setAddr_2(Addr2);
				//TFBO.setAddr_3(Addr3);
				/* AdressLine changes: END */
				TFBO.setCity(strCity.trim());
				TFBO.setState_Desc(strState.trim());
				TFBO.setCntry_Desc(strCountry.trim());
				//TFBO.setCity_Code(strCity_code.trim());
				//TFBO.setCntry_Code(strCountry_code.trim());
				TFBO.setZip(strZip);

			}

/****************************TFBO details set here*************/
//SSV changes-End

//SSV changes-Start
RelationshipBO relBO=null;
RelationshipModBO relModBO=null;
Integer iChildEntityID;
boolean newCont =false;
/*****************Minor Code Moved up***********************/
			//Added by Suman for Minor
			if(CustomerMinor!=null)
			if(CustomerMinor.equals("Y")){
				//Tracker 217990 null check
				if(guardCode!=null && !(guardCode.equalsIgnoreCase(""))){
					/*********** save and submit changes : Start****************/
					/****** Fix for ticket 169621 *******************/
//changes start for 356525 tracker
					businessObject.setMinor_guard_code(guardCode.substring(0, 1));
					businessObject.setMinor_guard_name(contactLastName);
					//changes end for 356525 tracker


			if((!apprFlag && (accountURL == null || accountURL.trim().equals(""))) && saveFlag!=1){


						/****** Fix for ticket 169621 *******************/
				/*Tracker ID : 223255, Changes Begins*/
						if(sChildEntity==null || sChildEntity.equals("")){
				/*Tracker ID : 223255, Changes Ends*/
							DemoBOMinor = new DemographicBO();
							DemoBOMinor.setOrgKey(ctKey);
							PsychoBOMinor.setOrgKey(ctKey);
							//Tracker 147144 changes starts here
							businessObjectCont.setEntity_cre_flag("Y");
							//Tracker 147144 changes ends here
				/*Tracker ID : 223255, Changes Begins*/
							businessObjectCont.setContactsKey (ctKey);
				/*Tracker ID : 223255, Changes Ends*/
							/*//Will be saved after SSV
							com.infy.cis.srmbo.Core.SaveContact(
									bc,
									businessObjectCont,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOMinor,
									PsychoBOMinor);
							com.infy.cis.srmbo.Core.saveDefaultEventsCont(businessObjectCont,bc);
							*///Will be saved after SSV
							iChildEntityID= businessObjectCont.getContactID();
							sChildEntity="CONTACT";

						}

						else{

							int iChildEntityId =  Integer.parseInt(sChildEntityID);
							iChildEntityID=new Integer(iChildEntityId);

						}

						Integer iParentEntityID=businessObject.getAccountID();
						String sParentEntity="CUSTOMER";

						relBO=new RelationshipBO();
						/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
//changes for tracker 378509
						//AccModHelper.setRelBOObject(relBO, sParentEntity,sChildEntity,iParentEntityID,iChildEntityID,contRelation,guardCode,coreCustId,acctKey,businessObjectCont);
						/*contRelation="Guardian";
						relBO.setParentEntity(sParentEntity);
						relBO.setChildEntity(sChildEntity);
						relBO.setParentEntityID(iParentEntityID);
						relBO.setChildEntityID(iChildEntityID);
						relBO.setRelationship(contRelation);
						relBO.setGuard_Code(guardCode);
						relBO.setCore_cust_id(coreCustId);
						relBO.setOrgKey(acctKey);*/

						//added for ticket id 209650: relationship category was not set.
					/*	relBO.setRelationship_Category("Social");
						relBO.setParentEntityType("Retail");
						relBO.setChildEntityType("Retail");*/

						/*Fix for ticket 380741 starts*/
						relBO.setParentCIFID(acctKey);
						relBO.setChildCIFID(ctKey);
						/*Fix for ticket 380741 ends*/


                       /*tracker id 154769 changes starts*/
                       /*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/
						if(ctKey !=null){
							if(ctKey.length() > 9){
							 relBO.setCore_child_cust_id((ctKey.trim()).substring(0,9));
							 } else {
							 relBO.setCore_child_cust_id(ctKey);
							 }
						}
                        /*tracker id 154769 changes ends*/
                        if(sChildEntity!=null)
						if(sChildEntity.equalsIgnoreCase("CUSTOMER"))
						{
							introBusinessObject = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,sChildEntityID);
							//Ticket 367108 changes
                            sCore_child_cust_id = ((AccountBO)introBusinessObject).getCore_cust_id();
							relBO.setCore_child_cust_id(sCore_child_cust_id);
						}

						Vector vSavingObj = new Vector();
						vSavingObj.addElement(relBO);
						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							relBO = (com.infy.cis.srmbo.RelationshipBO)DualFieldSetter.invokeSetterMethods("RelationshipBO",relBO,req);
						}
						/*TrackerID: 113227 end of changes */
						//Will be saved after SSV
						//com.infy.cis.srmbo.Core.saveRelationship( bc, vSavingObj,"N");
						// copy relationship only if Psycho is not Loaded
						//if(apprFlag && psychoNotLoaded){
						//	com.infy.cis.srmbo.Core.copyFromMaintoModRelVector( bc,iParentEntityID.intValue() ,accModBO.getAccountID().intValue());
						//}
					} else {

				/*Tracker ID : 223255, Changes Begins*/
						if(sChildEntity==null || sChildEntity.equals("")){{
				/*Tracker ID : 223255, Changes Ends*/
							DemoBOMinorMod.setOrgKey(ctKey);
							PsychoBOMinorMod.setOrgKey(ctKey);
							//Will be saved after SSV
							/*com.infy.cis.srmbo.Core.SaveContactMod(         bc,
									businessObjectContMod,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOMinorMod,
									PsychoBOMinorMod);
							*/
							//Changes for Tracker id 356403 Starts Here
							/*iChildEntityID= businessObjectContMod.getContactID();
							sChildEntity="CONTACT";
							newCont =true;*/

						}
	/*ticket id: 272220 Changes start */

						/*else{
							int iChildEntityId =  Integer.parseInt(sChildEntityID);
							iChildEntityID=new Integer(iChildEntityId);
						}*/
	/*ticket id: 272220 Changes End */

						Integer iParentEntityID=0;//Set to 0 till SSV is done
						String sParentEntity="CUSTOMER";
						relModBO=new RelationshipModBO();
						/*	AccModHelper.setRelBOModObject(relModBO, sParentEntity,sChildEntity,iParentEntityID,iChildEntityID,contRelation,coreCustId,acctKey,businessObjectContMod);
						/*contRelation="Guardian";
						relModBO.setParentEntity(sParentEntity);
						relModBO.setChildEntity(sChildEntity);
						relModBO.setParentEntityID(iParentEntityID);
						relModBO.setChildEntityID(iChildEntityID);
						relModBO.setRelationship(contRelation);
						relModBO.setOrgKey(acctKey);
						relModBO.setParentEntityType("Retail");
						relModBO.setChildEntityType("Retail");
						/*if(acctKey.length() > 9){
						 relModBO.setCore_cust_id(acctKey.substring(0,9));
						 } else {
						 relModBO.setCore_cust_id(acctKey);
						 }

						relModBO.setParentCIFID(acctKey);
						relModBO.setChildCIFID(ctKey);


					relModBO.setCore_cust_id(coreCustId);

                       */
                       //Changes for Tracker id 356403 Ends Here
						//relBO.setRelationship_Category("Social");
						 /*tracker id 351073 changes ends*/
                       	/*tracker id 154769 changes ends*/
                       	if(sChildEntity!=null)
						if(sChildEntity.equalsIgnoreCase("CUSTOMER"))
						{
							introBusinessObject = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,sChildEntityID);
							//Ticket 367108 changes
							sCore_child_cust_id = ((AccountBO)introBusinessObject).getCore_cust_id();
							relModBO.setCore_child_cust_id(sCore_child_cust_id);
						}
                    	/*tracker id 154769 changes starts*/
						if(ctKey !=null && !ctKey.equals("")){
							if(ctKey.length() > 9){
						 relModBO.setCore_child_cust_id(ctKey.substring(0,9));
						 } else {
						 relModBO.setCore_child_cust_id(ctKey);
							 }
						}
                     	/*tracker id 154769 changes ends*/
						relModBO.setGuard_Code(guardCode);
						/***********CIF Changes:Minor Approval :Start********************/
						if(newCont){
							relModBO.setIsContactGuard("Y");
						}
						/***********CIF Changes:Minor Approval :End********************/


						Vector vSavingObj = new Vector();
						vSavingObj.addElement(relModBO);
						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							relModBO = (com.infy.cis.srmbo.RelationshipModBO)DualFieldSetter.invokeSetterMethods("RelationshipBO",relModBO,req);
						}
						/*TrackerID: 113227 end of changes */
						//Will be saved after SSV
						//com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");

					}
					/*ticket id: 272220 Changes start */
											else{
												Integer iParentEntityID=businessObject.getAccountID();
												//Will be set after SSV
												/*setValuesForMinorCust(bc,introBusinessObject,sChildEntityID,iParentEntityID,
						                                            sChildEntity,acctKey,coreCustId,apprFlag,req,sCore_child_cust_id,
						                                            ctKey,guardCode,altLocaleActv,accModBO);
						                        */
				}
					 			   			}
					/*ticket id: 272220 Changes end */

				}
			}
/*****************Minor Code Moved up***********************/
//SSV Changes -End

//SSV Changes-Start
ArrayList arrEntyDoc = AccMainHelper.getEdocArrayForSSV1(copyFlag,bc,sc,req,iNoOfEDocs,acctKey,lstEntityDocumentURL,lstEDocIsDirty,coreCustId);

if(servrValidation.equalsIgnoreCase("true")){


//changes for Tracker ID 457963 - TOL 454651
	if ( ( !apprFlag && (accountURL!=null) && (!accountURL.equals("")) && operationType.equals("Edit Entity") ) || (isCopy.equalsIgnoreCase("Y")) ||  operationType.equals("null") || operationType.equals("Create")||(operationType.equals("Queue")) ){
		//changes for Tracker ID 457963 - TOL 454651	
		if(saveFlag==0){//SUBMIT from Edit Entity - Approval Disabled
			
				HashMap hmBOList_3 = new HashMap();
				if((!apprFlag && (accountURL == null || accountURL.trim().equals(""))) && saveFlag!=1)
				{
					hmBOList_3.put("RelationshipBO",relBO);
				}
				else
				{
					hmBOList_3.put("RelationshipModBO",relModBO);
				}
				hmBOList_3.put("AccountBO",businessObject);hmBOList_3.put("DemographicBO",DemoBO);hmBOList_3.put("PsychographicBO",PsychoBO);
				hmBOList_3.put("CoreInterfaceBO",coreObject);hmBOList_3.put("TradeFinanceBO",TFBO);


				doServerSideValidation(hmBOList_3,arrEntyDoc,bc,"main");
			}
		 }
 }

//SSV Changes-End


			if(DemoBO != null ){
             //tracker id 113227 starts here
	            // DemoBO.setOrgKey(acctKey);
            //tracker id 113227 ends here
/*Changes for Ticket#355435 begin*/
		//Changes for tracker ID 457671 start
		businessObject.setOffline_cum_debit_limit(ValidateDoubleFields(Offline_cum_debit_limit));
		//Changes for tracker ID 457671 end
/*Changes for Ticket#355435 end*/

		// 113227 for Lookup Begin of Changes
		businessObject= (com.infy.cis.srmbo.AccountBO)DualFieldSetter.invokeSetterMethods("AccountBO",businessObject,req);
		// 113227 for Lookup End of Changes
				/*SPE 10.5 CHANGES*/
				if(convToCust.equals("Y")){
					if(oldEntityType.equals("Prospect")){
						businessObject.setReqOrigin("CreateAccountFromSuspect");

						}
					else if(oldEntityType.equals("Contact")){
						businessObject.setReqOrigin("CreateAccountFromContact");

					}
					else if(oldEntityType.equals("NonCustomer")){
						businessObject.setReqOrigin("CreateAccountFromNonCustomer");

					}



				}
				else{
				businessObject.setReqOrigin("AccWriter");
			    }

				/*com.infy.cis.srmbo.Core.SaveAccount(bc,
						(AccountBO) businessObject,
						AgentGroupMgr.getLoggedonUser(bc),
						(DemographicBO)DemoBO,
						(PsychographicBO) PsychoBO ,isCopy);
				*/
				//changes for 738935 starts
				 if(convToCust.equals("Y") && businessObject!=null && (businessObject.getCore_cust_id()==null || (businessObject.getCore_cust_id()!=null && !businessObject.getCore_cust_id().equalsIgnoreCase("")))){
					 if(coreCustId!=null && !coreCustId.equalsIgnoreCase(""))
				{
					businessObject.setCore_cust_id(coreCustId);
				}
				else
				{
					String tempcustid = null;
					tempcustid = AccountIDGen.getCoreCustId(bc);
					businessObject.setCore_cust_id(tempcustid);
				}
					//changes for 738935 ends
				}
				//665901 changes starts 
				try{
					//changes for Call id 842140
					callCustomHook_Main(bc,(AccountBO) businessObject,req,(CoreInterfaceBO)coreObject,null);					
				}//catch(Exception e){e.printStackTrace();}
				catch(Exception e){
					WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
				}
				//665901 changes ends 
				com.infy.cis.srmbo.Core.SaveAccount(bc,
						(AccountBO) businessObject,
						AgentGroupMgr.getLoggedonUser(bc),
						null,
				 (PsychographicBO) PsychoBO,isCopy);
				//Changes for Call id 842140
					callCustomHook_Main(bc,(AccountBO) businessObject,req,(CoreInterfaceBO)coreObject,(DemographicBO)DemoBO);
						//Changes done by Kanika For Cif Deceased starts
						//CALL SP
				//Changes for call id 378506 starts - Recon for 380203
				String strCustStatus=businessObject.getStatus();
				String strOldCustStatus = req.getParameter("hidOldCustStatus");
				if((strCustStatus != null && strCustStatus.equalsIgnoreCase("DCSED")) ||(strOldCustStatus != null && strOldCustStatus.equalsIgnoreCase("DCSED") && ((strCustStatus == null)||!(strCustStatus.equalsIgnoreCase("DCSED"))))){
						bc.terminate(true);
						bc=Utils.getTransactedBusinessContext(req);
						AccMainHelper.callSP_CIF_DECEASED(businessObject,bc,req);
				}
					   //Changes done by Kanika For Cif Deceased ends
			}else{



		// 113227 for Lookup Begin of Changes
		businessObject= (com.infy.cis.srmbo.AccountBO)DualFieldSetter.invokeSetterMethods("AccountBO",businessObject,req);
		// 113227 for Lookup End of Changes
				/*SPE 10.5 CHANGES*/
				//665901 changes starts
				/*if(convToCust.equals("Y")){
					if(oldEntityType.equals("Prospect")){
						businessObject.setReqOrigin("CreateAccountFromSuspect");

						}
					else if(oldEntityType.equals("Contact")){
						businessObject.setReqOrigin("CreateAccountFromContact");

					}
					else if(oldEntityType.equals("NonCustomer")){
						businessObject.setReqOrigin("CreateAccountFromNonCustomer");

					}
			 	}
				else{
					businessObject.setReqOrigin("AccWriter");
				}*/
			setReqOriginConvToCust_Main(businessObject,oldEntityType,convToCust);

				try{
					//changes for Call id 842140
					callCustomHook_Main(bc,(AccountBO) businessObject,req,(CoreInterfaceBO)coreObject,null);					
				}
				catch(Exception e){
					WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
				}

				//665901 changes ends
				com.infy.cis.srmbo.Core.SaveAccount(bc,
						(AccountBO) businessObject,
						AgentGroupMgr.getLoggedonUser(bc),
						null,
						null ,isCopy);
			}
			coreObject.setAccountID(businessObject.getAccountID());
			coreObject.setORGKEY(acctKey);
			com.infy.cis.srmbo.Core.SaveCoreInterface(	bc,
					businessObject.getAccountID(),
					(CoreInterfaceBO) coreObject,
					AgentGroupMgr.getLoggedonUser(bc)
			);

			//Tracker ID 113276 changes start
			int accoId = businessObject.getAccountID().intValue();
			/* Changes for tracker 180240 start */
			/* Begin Changes Tracker id: 178897*/
			saveEdoc1(copyFlag,bc,sc,req,accoId, iNoOfEDocs,acctKey,lstEntityDocumentURL,lstEDocIsDirty,coreCustId);
		    /* End Changes Tracker id: 178897*/
		    /* Changes for tracker 180240 end */
			//Tracker ID 113276 changes end

			com.infy.cis.srmbo.Core.saveDefaultEvents(businessObject,bc);
			strOtherTFFields=businessObject.getName()+"$"+businessObject.getAccountKey();

//SSV changes
/*******************TFBO set moved up save Tfin BO *******************/
			if(TFBO!=null && isTFFlag!=null && isTFFlag.equals("Y"))
			{
				TFBO.setAccountID(businessObject.getAccountID());


				String sTemp2=(businessObject.getAccountID()).toString();
				int iTemp2=Integer.parseInt(sTemp2);
				//Start of tracker id: 233699
				//com.infy.cis.srmbo.Core.SaveRetailTradeFinance(	bc,
				//		iTemp2,
				//		AgentGroupMgr.getLoggedonUser(bc),
				//		(TradeFinanceBO) TFBO,"Account");
				//End of tracker id: 233699
			}
/*******************TFBO set moved up save Tfin BO *******************/
//SSV changes

			AccountModBO accModBO =null;
			TradeFinanceModBO tfModBO =null;
				int iaccModID=0;
			if(apprFlag){
				int demoID = 0;
				int psychoID =0;
				if(copyFlag.equalsIgnoreCase("Y")) acctId = 0;
				//SPE 10.2.02 to remove save of DemoBO from accWriter
				/*if(DemoBO!=null && PsychoBO!=null){
					demoID =DemoBO.getDemographicID().intValue();
					psychoID = PsychoBO.getPsychographicID().intValue();
					DemoBO.setOrgKey(acctKey);
					PsychoBO.setOrgKey(acctKey);
					if(demoID != 0 && psychoID!= 0){
						accModBO = Core.copyFromMaintoModeGeneral(businessObject,bc,acctId,demoID,psychoID);
					}
				}*/
				if(PsychoBO!=null){

					psychoID = PsychoBO.getPsychographicID().intValue();

					PsychoBO.setOrgKey(acctKey);
					if(psychoID!= 0){
						accModBO = Core.copyFromMaintoModeGeneral(businessObject,bc,acctId,0,psychoID);
					}
				}
				/* Fix for ticket 200298 start*/
				//accModBO = Core.copyFromMaintoModeGeneral(businessObject,bc);
				int accModId=0;
				if(accModBO != null)
				{
				accModId = accModBO.getAccountID().intValue();
				}
				iaccModID=accModId;
				/* Fix for ticket 200298 ends*/
				if(TFBO!=null)
				{
					//Start of tracker id: 233699
					//Core.copyFromMaintoModeTF(TFBO,bc,accModId,"Account");
					//End of tracker id: 233699
			    }
			}
				if(isCopy.equalsIgnoreCase("Y")){
						cdone=AccMainHelper.copyBasel(bc,apprFlag,businessObject,iaccModID,req);
			}

			if ((acctPrimaryContact!=null)&&(!acctPrimaryContact.equals(""))){
				try{
					int pContactID = acctPrimaryContact.getFormatter2(context).stringToInt(acctPrimaryContact);

					if ((businessObject.getPrimaryContactID()==null)
							|| (!(businessObject.getPrimaryContactID()).equals(new Integer(pContactID)))){
						//Change in primery contact
						SRMQueryBuilder qbContact = QueryAssist.singleObjectQuery("ContactBO",ContactBO.CONTACTID,QB_PRIMCONTACT);
						QueryAssist.addSimpleCondition(qbContact, "ContactBO",ContactBO.CONTACTID, IQuery.ComparisonOperation_EQ, ""+pContactID);
						SRMQueryResult qrContact = qbContact.runQuery(bc, true, -1);
						SRMRecordSet recordSet = qrContact.getRecordSet();
						contBO = (ContactBO)((ArrayList)recordSet.getNext()).get(0);

						Core.SaveContact(bc,contBO, businessObject,true);
						Core.saveDefaultEventsCont(contBO,bc);
					}
				}catch (NumberFormatException e){ //todo write in log
					if(WebAdaptor.willLog(com.infy.cis.log.LogType.MINOR)) {
						WebAdaptor.log(com.infy.cis.log.LogType.MINOR,
								"AccWriter : Invalid Contact ID=" + acctPrimaryContact );
					}
					throw new SRMBCException(
							SRMBCException.INVALID_CONTACT,
							null
					);

				}
			} else if(acctPrimaryContURL != null && !acctPrimaryContURL.trim().equals("")) {
				contBO =(ContactBO)SRMURLResolver.getObject(bc, acctPrimaryContURL, true);
				if((businessObject.getPrimaryContactID()==null)||
						(!(businessObject.getPrimaryContactID()).equals(contBO.getContactID()))){
					//Change in primery contact

					Core.SaveContact(bc,contBO, businessObject,true);
					Core.saveDefaultEventsCont(contBO,bc);
				}
			} else {
				if(accountURL != null && !accountURL.trim().equals("")) {

					Integer tempContID = businessObject.getPrimaryContactID();
					if(tempContID != null) {
						SRMQueryBuilder qbContact = QueryAssist.singleObjectQuery("ContactBO",ContactBO.CONTACTID,QB_CONTACT2);
						QueryAssist.addSimpleCondition(qbContact, "ContactBO",ContactBO.CONTACTID, IQuery.ComparisonOperation_EQ, ""+tempContID);
						SRMQueryResult qrContact = qbContact.runQuery(bc, true, -1);
						SRMRecordSet recordSet = qrContact.getRecordSet();
						ContactBO tempContBO = (ContactBO)((ArrayList)recordSet.getNext()).get(0);
						Core.DetachContactFromAccount(bc, businessObject, tempContBO);
						Core.AttachContactToAccount(bc, businessObject, tempContBO, false);
					}
				}
			}

			List prodList = new ArrayList();
			SRMCollection exist_Products = businessObject.getProducts();

			if ((attachedProducts!=null) && (!attachedProducts.equals(""))){
				prodList = Utils.parseString(attachedProducts);
			}

			for (int j = exist_Products.size(); j > 0; j--) {
				boolean removeFlag = true;
				Integer compId = ((AccountBO.Products)exist_Products.get(j-1)).getProductID();
				if(0!=prodList.size()) {
					for(int l = 0; l < prodList.size(); l++) {
//						formatting independant of i18n type.
						if(compId!=null)
						if (compId.equals(new Integer(srmf.stringToInt((prodList.get(l)).toString())))) {
							prodList.remove(l);
							l--;
							removeFlag = false;
							break;
						}
					}
					if(removeFlag) {
						Core.DetachProductFromAccount(bc, businessObject, Utils.getProductBO(compId, bc));
					}
				} else {
					Core.DetachProductFromAccount(bc, businessObject, Utils.getProductBO(compId, bc));
				}
			}

			if(0!=prodList.size()) {
				for (int i = 0;i<prodList.size();i++) {
//					formatting independant of i18n type.
					Core.AttachProductToAccount(bc, businessObject, Utils.getProductBO(new Integer(srmf.stringToInt(prodList.get(i).toString())), bc));
				}
			}
			if(createPartner!=null)
			if(createPartner.equals("Y")) {

				/* CRM10BO:40734:MassChange BEGINOFCHANGE  */

				boolean keyexists = Utils.checkAttribExist(bc, "PartnerBO", PartnerBO.PARTNERKEY, "CUSTOMER_DSA_" + acctKey, PartnerBO.PARTNERID) ;

				/* CRM10BO:40734:MassChange ENDOFCHANGE  */
				if (keyexists) {
					throw new SRMBCException(
							SRMBCException.PARTNER_ALREADY_CREATED,
							SRMBCException.MakeReplaceableArg(acctKey),
							null
					);
				}

				/************ START - New CODE for partner creation ****************/

				/* a) Create a partner with the account details.
				 */

				/* START a) */
				PartnerBO partnerBO = new PartnerBO();
				SRMCollection accAddr = businessObject.getAddress();
				SRMCollection partnerAddr = partnerBO.getAddress();

				for(int a = 0;  a < accAddr.size(); a++) {
					partnerAddr.add(accAddr.get(a));
				}


				/***************** NEW CODE END ADDR) ***********/

				//create the main PartnerBO
				if((acctRevenue!=null)&&(!acctRevenue.trim().equals(""))){

					partnerBO.setAnnualRevenue(new Double(acctRevenue));            }
				partnerBO.setCompetitor(acctCompetitor);

				partnerBO = AccMainHelper.setPartnerObj(partnerBO,req);

				partnerBO.setIndustry(acctIndustry);
				partnerBO.setNotes(acctNotes);

				partnerBO.setPartnerKey("CUSTOMER_DSA_" + acctKey);
				partnerBO.setPartnerName(acctName);
				partnerBO.setPartnerType("CUSTOMER_DSA");

				if((acctRevenueUnits!=null)&&(!acctRevenueUnits.trim().equals(""))){
					partnerBO.setRevenueUnits(acctRevenueUnits);
				}
				partnerBO.setSicCode(acctSICCode);
                  /* Changes Begin Tracker Id : 195897 */
				partnerBO.setStatus(sStatus_code);
                  /* Changes End Tracker Id : 195897 */
				partnerBO.setTickerSymbol(acctTickerSymbol);
				partnerBO.setXmlData(Utils.convertStrToByteArray(acctXMLDATA));

				/***************** NEW CODE FOR Updating Partner ADDR) ***********/

				SRMCollection accAddress = businessObject.getAddress();
				SRMCollection partnerAddress = partnerBO.getAddress();
				for (int i = 0; i < accAddress.size(); i++){
					PartnerBO.Address partAddr = (PartnerBO.Address)partnerBO.getInstance("Address");
					AccountBO.Address tempAccAddr = (AccountBO.Address)accAddress.get(i);
					partAddr.setAddress_Line1(tempAccAddr.getAddress_Line1());
					partAddr.setAddress_Line2(tempAccAddr.getAddress_Line2());
					partAddr.setCity(tempAccAddr.getCity());
					partAddr.setCountry(tempAccAddr.getCountry());
					partAddr.setAddressCategory(tempAccAddr.getAddressCategory());
					partAddr.setMailStop(tempAccAddr.getMailStop());
					partAddr.setState(tempAccAddr.getState());
					partAddr.setZip(tempAccAddr.getZip().trim());
					partnerAddress.add(partAddr);

				}

				/***************** NEW CODE END Updating Partner ADDR) ***********/
				Core.SavePartner(bc,partnerBO);
			}
//SSV Changes-Start
/*************Minor Code move above*********************/
			//Added by Suman for Minor
			if(CustomerMinor!=null)
			if(CustomerMinor.equals("Y")){
				//Tracker 217990 null check
				if(guardCode!=null && !(guardCode.equalsIgnoreCase(""))){
					/*********** save and submit changes : Start****************/
					/****** Fix for ticket 169621 *******************/


			if((!apprFlag && (accountURL == null || accountURL.trim().equals(""))) && saveFlag!=1){


						/****** Fix for ticket 169621 *******************/
				/*Tracker ID : 223255, Changes Begins*/
						if(sChildEntity==null || sChildEntity.equals("")){
				/*Tracker ID : 223255, Changes Ends*/
							com.infy.cis.srmbo.Core.SaveContact(
									bc,
									businessObjectCont,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOMinor,
									PsychoBOMinor);
							com.infy.cis.srmbo.Core.saveDefaultEventsCont(businessObjectCont,bc);

							iChildEntityID= businessObjectCont.getContactID();
							sChildEntity="CONTACT";

						}

						else{

							int iChildEntityId =  Integer.parseInt(sChildEntityID);
							iChildEntityID=new Integer(iChildEntityId);

						}

						Integer iParentEntityID=businessObject.getAccountID();
						String sParentEntity="CUSTOMER";
//changes for tracker 378509
						relBO=new RelationshipBO();
						AccModHelper.setRelBOObject(relBO, sParentEntity,sChildEntity,iParentEntityID,iChildEntityID,contRelation,guardCode,coreCustId,acctKey,businessObjectCont);

//changes for tracker 419294 vector clean up begin
						ArrayList vSavingObj = new ArrayList();
						vSavingObj.add(relBO);
//changes for tracker 419294 vector clean up ends
						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							relBO = (com.infy.cis.srmbo.RelationshipBO)DualFieldSetter.invokeSetterMethods("RelationshipBO",relBO,req);
						}
						/*TrackerID: 113227 end of changes */

						com.infy.cis.srmbo.Core.saveRelationship( bc, vSavingObj,"N");
						// copy relationship only if Psycho is not Loaded
						if(apprFlag && psychoNotLoaded){
							com.infy.cis.srmbo.Core.copyFromMaintoModRelVector( bc,iParentEntityID.intValue() ,accModBO.getAccountID().intValue());
						}
					} else {

				/*Tracker ID : 223255, Changes Begins*/
						if(sChildEntity==null || sChildEntity.equals("")){{
				/*Tracker ID : 223255, Changes Ends*/
							com.infy.cis.srmbo.Core.SaveContactMod(         bc,
									businessObjectContMod,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOMinorMod,
									PsychoBOMinorMod);

							iChildEntityID= businessObjectContMod.getContactID();
							sChildEntity="CONTACT";
							newCont =true;

						}
	/*ticket id: 272220 Changes start */

						/*else{
							int iChildEntityId =  Integer.parseInt(sChildEntityID);
							iChildEntityID=new Integer(iChildEntityId);
						}*/
	/*ticket id: 272220 Changes End */

						Integer iParentEntityID=accModBO.getAccountID();
						String sParentEntity="CUSTOMER";
						//Changes for Tracker id 356403 Starts Here
						AccModHelper.setRelBOModObject(relModBO, sParentEntity,sChildEntity,iParentEntityID,iChildEntityID,contRelation,coreCustId,acctKey,businessObjectContMod);
						relModBO.setParentCIFID(acctKey);
						relModBO.setChildCIFID(ctKey);
						relModBO.setCore_cust_id(coreCustId);
						//Changes for Tracker id 356403 Ends Here
                       	if(sChildEntity!=null)
						if(sChildEntity.equalsIgnoreCase("CUSTOMER"))
						{
							introBusinessObject = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,sChildEntityID);
							//Ticket 367108 changes
							sCore_child_cust_id = ((AccountBO)introBusinessObject).getCore_cust_id();
							relModBO.setCore_child_cust_id(sCore_child_cust_id);
						}
                    	/*tracker id 154769 changes starts*/
						if(ctKey !=null && !ctKey.equals("")){
							if(ctKey.length() > 9){
						 relModBO.setCore_child_cust_id(ctKey.substring(0,9));
						 } else {
						 relModBO.setCore_child_cust_id(ctKey);
							 }
						}
                     	/*tracker id 154769 changes ends*/
						relModBO.setGuard_Code(guardCode);
						/***********CIF Changes:Minor Approval :Start********************/
						if(newCont){
							relModBO.setIsContactGuard("Y");
						}
						/***********CIF Changes:Minor Approval :End********************/


//changes for tracker 419294 vector clean up begin
						ArrayList vSavingObj = new ArrayList();
						vSavingObj.add(relModBO);
//changes for tracker 419294 vector clean up ends
						/*TrackerID: 113227 start of changes */
						if(altLocaleActv!=null)
						if (altLocaleActv.equalsIgnoreCase("true") )
						{
							relModBO = (com.infy.cis.srmbo.RelationshipModBO)DualFieldSetter.invokeSetterMethods("RelationshipBO",relModBO,req);
						}
						/*TrackerID: 113227 end of changes */
						com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");

					}
					/*ticket id: 272220 Changes start */
											else{
												Integer iParentEntityID=businessObject.getAccountID();

												//changes for ticket id 574503 start
												//changes for ticket id 574503 ends
												setValuesForMinorCust(bc,introBusinessObject,sChildEntityID,iParentEntityID,
						                                            sChildEntity,acctKey,coreCustId,apprFlag,req,sCore_child_cust_id,
						                                            ctKey,guardCode,altLocaleActv,accModBO);
				}
					 			   			}
					/*ticket id: 272220 Changes end */

				}
			}
/*********************Minor Code moved above**************************/
//SSV Changes-End


//			Introducer Changes:start
			if(accountURL == null || accountURL.trim().equals(""))  {
				Integer iChildEntityIDIntro;
				/*********** Save and Submit Chahges :End**********/

				//Changes done for Tikcet ID  244800 or Tracker ID 148132

				/*Change for ticket 332591 : BADRI*/
				/* The if condition is commented as it was entering only for disabled approval scenario.
				For approval enabled mode it was behaving as if is a save scenario and was making entry only to the mod table.
				Modified if condition will allow entry irrespective of approval flag.*/
				//if((!apprFlag|| ( sChildEntityIntro.equals("")||sChildEntityIntro.equals("null"))) && saveFlag!=1){
					if(saveFlag!=1){
				/*End of changes : 332591 */
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
						if(sChildEntityIntro.equals("")||sChildEntityIntro.equals(null)){


							DemoBOIntro.setOrgKey(ctKeyIntro);
							PsychoBOIntro.setOrgKey(ctKeyIntro);

							com.infy.cis.srmbo.Core.SaveContact(  bc,
									businessObjectIntro,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOIntro,
									PsychoBOIntro);
							com.infy.cis.srmbo.Core.saveDefaultEventsCont(businessObjectIntro,bc);
							iChildEntityIDIntro= businessObjectIntro.getContactID();
							sChildEntityIntro="CONTACT";
							sChildEntityTypeIntro="Retail";

						}

						else{
                            int ichildID = 0;
                            if(sChildEntityIDIntro!=null){
							ichildID =  Integer.parseInt(sChildEntityIDIntro);
						    }
							iChildEntityIDIntro=new Integer(ichildID);
							//365731 changes starts
							if(sChildEntityIntro!=null && sChildEntityIntro.equalsIgnoreCase("CONTACT") && sChildEntityTypeIntro==null){
								sChildEntityTypeIntro="Retail";
							}
							//365731 changes ends

						}

						Integer iParentEntityID=businessObject.getAccountID();
						String sParentEntity="CUSTOMER";
						relBO=new RelationshipBO();
					contIntroRelation="INTRODUCER";
						relBO.setParentEntity(sParentEntity);
						relBO.setChildEntity(sChildEntityIntro);
						relBO.setParentEntityID(iParentEntityID);
						relBO.setChildEntityID(iChildEntityIDIntro);
						relBO.setRelationship(contIntroRelation);
						relBO.setParentEntityType("Retail");
						relBO.setChildEntityType(sChildEntityTypeIntro);
						relBO.setOrgKey(acctKey);
						//added for TRACKER:149826  relationship category was not set.
						relBO.setRelationship_Category("Banking");
						// CHANGES TRACKER:149826 END
						/*if(acctKey.length() > 9){
						 relBO.setCore_cust_id(acctKey.substring(0,9));
						 } else {
						 relBO.setCore_cust_id(acctKey);
						 }*/
						relBO.setCore_cust_id(coreCustId);

				//changes done by aditya starts
						relBO.setParentCIFID(acctKey);
						HashMap introDetails = new HashMap();
						introDetails.put("IntroducerKey",ctKeyIntro);
						introDetails.put("IntroducerChildType",sChildEntityTypeIntro);
						introDetails.put("IntroducerType",sChildEntityIntro);
						introDetails.put("Salutation",introSalutation);
						introDetails.put("LastName",introLastName);
						//changes for tkt 351073 starts
						introDetails.put("FirstName",introFirstName);
						introDetails.put("Gender",introGender);
						//changes for tkt 351073 ends
					    relBO = AccMainHelper.saveIntroducerDetails(relBO,introDetails,bc);
                        //changes done by aditya ends

//changes for tracker 419294 vector clean up begin
						ArrayList vSavingObj = new ArrayList();
						vSavingObj.add(relBO);
//changes for tracker 419294 vector clean up ends
						com.infy.cis.srmbo.Core.saveRelationship( bc, vSavingObj,"N");
						// copy relationship only if Psycho is not Loaded
						if(apprFlag && psychoNotLoaded){
							com.infy.cis.srmbo.Core.copyFromMaintoModRelVector( bc,iParentEntityID.intValue() ,accModBO.getAccountID().intValue());
						}
					}
				} else {
					newCont =false;
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
						if(sChildEntityIntro.equals("")||sChildEntityIntro.equals(null)){
							DemoBOIntroMod.setOrgKey(acctKey);
							PsychoBOIntroMod.setOrgKey(acctKey);
							com.infy.cis.srmbo.Core.SaveContactMod( bc,
									businessObjectIntroMod,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOIntroMod,
									PsychoBOIntroMod);

							iChildEntityIDIntro= businessObjectIntroMod.getContactID();
							sChildEntityIntro="CONTACT";
							sChildEntityTypeIntro="Retail";
							newCont=true;

						}

						else{

							//365371 changes starts
							int ichildID = 0;
							if(sChildEntityIDIntro!=null){
								ichildID =  Integer.parseInt(sChildEntityIDIntro);
							}
							//365371 changes ends
							iChildEntityIDIntro=new Integer(ichildID);
							//365371 changes starts
							if(sChildEntityIntro!=null && sChildEntityIntro.equalsIgnoreCase("CONTACT") && sChildEntityTypeIntro==null){
								sChildEntityTypeIntro="Retail";
							}
							//365371 changes ends

						}

						Integer iParentEntityID=accModBO.getAccountID();
						String sParentEntity="CUSTOMER";
						 relModBO=new RelationshipModBO();
					contIntroRelation="INTRODUCER";
						relModBO.setParentEntity(sParentEntity);
						relModBO.setChildEntity(sChildEntityIntro);
						relModBO.setParentEntityID(iParentEntityID);
						relModBO.setChildEntityID(iChildEntityIDIntro);
						relModBO.setRelationship(contIntroRelation);
						relModBO.setParentEntityType("Retail");
						relModBO.setChildEntityType(sChildEntityTypeIntro);

						/*if(acctKey.length() > 9){
						 relBO.setCore_cust_id(acctKey.substring(0,9));
						 } else {
						 relBO.setCore_cust_id(acctKey);
						 }*/
						relModBO.setCore_cust_id(coreCustId);
						relModBO.setOrgKey(acctKey);
						/* CRM102ST: TrackerID:180467 Begin of Change */
						relModBO.setRelationship_Category("Banking");
						/* CRM102ST: TrackerID:180467 End of Change */
                      // changes done by aditya starts
						 relModBO.setParentCIFID(acctKey);
						HashMap introDetails = new HashMap();
						introDetails.put("IntroducerKey",ctKeyIntro);
						introDetails.put("IntroducerChildType",sChildEntityTypeIntro);
						introDetails.put("IntroducerType",sChildEntityIntro);
						introDetails.put("Salutation",introSalutation);
						introDetails.put("LastName",introLastName);
						relModBO = AccModHelper.saveIntroducerDetailsMod(relModBO,introDetails,bc);

                        // changes done by aditya ends
//changes for tracker 419294 vector clean up begin
						ArrayList vSavingObj = new ArrayList();
						vSavingObj.add(relModBO);
//changes for tracker 419294 vector clean up ends
						com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");
					}
				}

//				Introducer Changes:end
			}
			// changes for tracker id :253845 Start
			//Tracker 142437 changes Start

					if(convToCust.equals("Y"))
					{

						setConvFlags(oldEntityID,bc,oldEntityType,businessObject);
					}

			//Tracker 142437 changes END
		// changes for tracker id :253845 End


			//Changes for call id 418591 starts
			if(bc != null)
			{
				bc.terminate(true);
			}
			//Changes for call id 418591 ends
			if(sDummy != null && sDummy.equals("Y") && !(saveFlag==1) && !chgDummy){
				/*Fix for compilation issue of ServiceRequest Method starts*/
				sb=getScript(sb);
				/*Fix for compilation issue of ServiceRequest Method ends*/
				/*CRM102ST:TrackerID:177977 Being of Change */
				out.println(sb.toString());
				/*CRM102ST:TrackerID:177977 End of Change */
				String strError = CommonQueries.getUnfilledTabList(newTabs,tabTitle,isTFFlag);
				throw new FCRMGenericException("MSGEXC50029",new Exception("Following Mandatory Tabs are not filled : {0}"),strError);
			}
			sb.append("<SCRIPT>");
			sb.append(" var allParam = new Array();");

			/*Region should always be first in array */

			if(acctRegion != null && !acctRegion.equals("")){
				sb.append(" allParam[allParam.length]  = '" + Escaper.escape(acctRegion, '\\', Constants.HTML_ESC_CHAR) + "';");
			}else{
				sb.append(" allParam[allParam.length]  = '';");
			}
			/* CRM61SR:SRINBO :TRACKER# 44198 **BEGIN  CHANGES** */
			sb.append(" allParam[allParam.length]  = '" + Escaper.escape(businessObject.getAccountID().toString(), '\\', Constants.HTML_ESC_CHAR) + "';");
			/* CRM61SR:SRINBO :TRACKER# 44198 **END  CHANGES** */

			/* CRM61LR : Tracker ID # 44575 : Added for LinkDelink Validation */
			if(!((DelinkCustDet==null) || (DelinkCustDet.equals(""))) &&
					DelinkCustDet.equalsIgnoreCase("LinkDelinkCustDet")){
				sb.append(" savedValue = '"
						+ Escaper.escape(businessObject.getCust_Last_Name().toString(), '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			}else{

				sb.append(" savedValue = '"
						+ Escaper.escape(businessObject.getAccountID().toString(), '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			}


			if(apprFlag){
				sb.append(" savedModID = '"
						+ Escaper.escape(accModBO.getAccountID().toString(), '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			}
			else {
				sb.append(" savedModID = '';");
			}



			sb.append(" savedLastName = '"
					+ Escaper.escape(businessObject.getCust_Last_Name().toString(), '\\', Constants.HTML_ESC_CHAR)
					+ "';");


			sb.append(" savedURL = '"
					+ Escaper.escape(businessObject.getUrl(), '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" AddressFields = '"
					+ Escaper.escape(AddressFields, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" OtherTFFields = '"
					+ Escaper.escape(strOtherTFFields, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" CoreCustID = '"
					+ Escaper.escape(coreCustId, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			if((accountURL==null) || (accountURL.equals("")) &&
					(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true"))) {
				sb.append(" extraParam = ' Account Key - "
						+ Escaper.escape(acctKey, '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			} else {
				sb.append(" extraParam = '"
						+ "';");
			}
			sb.append("ackey = \" "+businessObject.getAccountKey()+"\";");
			/* CIF Changes for Tabs on Demand starts */
			sb.append("savedKey = \""+businessObject.getAccountKey()+"\";");
			sb.append("savedType = \""+businessObject.getOrgType()+"\";");
			sb.append(" copyValue = '" + Escaper.escape(isCopy, '\\', Constants.HTML_ESC_CHAR) + "';");
			sb.append("cdone = \""+cdone+"\";");
			/* CIF Changes for Tabs on Demand ends */

				/*Change done for  Swift Address Defaulting message START */
					sb.append(" SwiftAddressDetails = '"+ Escaper.escape(SwiftAddressDetails, '\\', Constants.HTML_ESC_CHAR)+ "';");
				/*Change done for  Swift Address Defaulting message END */

			if(isQDE!=null && isQDE.equalsIgnoreCase("Y")){
				req.setAttribute("AccountID",businessObject.getAccountID().toString());
			}
        
				callCustWriterHook(businessObject,DemoBO,PsychoBO,TFBO,coreObject,req,bc);
		
			//Checksum recon, 10.3.02 security audit changes
			SecureAuditHelper objSecHash = new SecureAuditHelper();
			if(apprFlag){
				hmSecureHashKeyFields=objSecHash.getSecurKeyAndFldKey("AccountModBO",accModBO, sc);
			}else
			{
				hmSecureHashKeyFields=objSecHash.getSecurKeyAndFldKey("AccountBO",businessObject, sc);
			}
			//Checksum recon, 10.3.02 security audit changes

		}
		else{//the other condition--approval enabled


			AccountModBO businessObject = null;
			businessObject = new AccountModBO();

			if(prevTabs != null && !prevTabs.equals("")){
				if(prevTabs.indexOf(currentTab) == -1){
					newTabs = prevTabs+"|"+currentTab;
				}else{
					newTabs = prevTabs;
				}
			}else{
				prevTabs = currentTab;
				newTabs = currentTab;

			}

			// Changes for CRM10SPE



			// TRACKER 113276 CHANGES START
			if(mainID>0){
				AccountBO boAcc= (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,new Integer(mainID),false);

				// Changes for CRM10SPE

				if(boAcc != null){
					sDummy = boAcc.getIsDummy();
				}
				//Changes for call id 422794-recon for 411952 starts
				if(boAccountMod!= null){
					modsDummy = boAccountMod.getIsDummy();
				}
				//Changes for call id 422794-recon for 411952 ends
				if(sDummy != null && sDummy.equalsIgnoreCase("Y")){
					businessObject.setStrUserField1("N");

					if((CommonQueries.isTabMatching(fullList,newTabs))){//if all the Mandatory Tabs not filled
						chgDummy = true;
					}
				}
			}

			// TRACKER 113276 CHANGES END
			// Ticket 268911  and Tracker 162384: begin of changes
						/* Changes for the TrackerId:273053 Starts */
		/***10.2.18 TechOnline call: 801741 : starts***/			
		//removeDelIdDoc(bc, IDRemoved,operationType,lstIDRemoved,iNoOfRemovedEDocs,req); /* Commented for the Call id: 793932 */
		/***10.2.18 TechOnline call: 801741 : ends***/	
		     /* Changes for the TrackerId:273053 ends */
			//Tracker ID 113276  identification changes end


			CoreInterfaceModBO coreObject = null;
			coreObject = new CoreInterfaceModBO();
			ContactModBO contBO = null;
			DemographicModBO DemoBO = null;
			PsychographicModBO PsychoBO = null;
			TradeFinanceModBO TFBO = null;
			int iUniqueIdentifier = 0;
			// Tracker ID 113276  currency changes start
		 	/* CRM102ST: TrackerID:163399 Being of Change*/
			/*if(!editFlag)
         	{
				PsychoBO = new PsychographicModBO();

	     	}

	 		else
	 		{
		 		PsychoBO= (PsychographicModBO)Utils.getBOFromID(bc,"PsychographicModBO",PsychographicModBO.ACCOUNTID, new Integer(modAccId));
		 	}*/
			// Tracker ID 113276  currency changes end
			/*Changes for Ticketid:-326876(Begin for code too large issue)Calling from AccModHelper*/
			PsychoBO = (PsychographicModBO)AccModHelper.findPsychographicModBO(bc,editFlag,accountURL,boAccountMod,modAccId);
			DemoBO = (DemographicModBO)AccModHelper.findDemographicModBO(bc,editFlag,accountURL,boAccountMod,modAccId);
			/*Changes for Ticketid:-326876(End for code too large issue)*/
			/* CRM102ST: TrackerID:163399 End of Change*/
			//construct the NV Pairs and populate an AccountModBO
			/* CIF COPY CHANGES : START */
			if(isCopy == null)
			{
				isCopy = "";
			}

			if(isCopy!=null && isCopy.equalsIgnoreCase("Y")){
				businessObject = new AccountModBO();
				coreObject = new CoreInterfaceModBO();
				/* CRM6206RECON:TRACKER# 59146 **BEGIN   CHANGES*/
				String isDemandLoaded = req.getParameter("isDemoLoaded");

				if(null != isDemandLoaded && isDemandLoaded.equals("false")){
					DemoBO = new DemographicModBO();
				}
				isDemandLoaded = req.getParameter("isPsychoLoaded");

				if(null != isDemandLoaded && isDemandLoaded.equals("false")){

					PsychoBO = new PsychographicModBO();
				}
				isDemandLoaded = req.getParameter("isTFLoaded");

				if(null != isDemandLoaded && isDemandLoaded.equals("false")){

					TFBO = new TradeFinanceModBO();
				}
				/* CRM6206RECON:TRACKER# 59146 **END   CHANGES*/
			}

			else{

				//construct the NV Pairs and populate an AccountModBO
				if ((accountURL!=null)&&(!accountURL.equals(""))&&!editFlag)
				{
					queSubmit = 1;
					/* Tab Validation By Mamta: Start */
					//businessObject = (AccountModBO)SRMURLResolver.getObject(bc, accountURL, true);
					businessObject = boAccountMod;
					/* Tab Validation By Mamta: End */
					if(coreURL != null && !coreURL.equals("")){
						coreObject = (CoreInterfaceModBO)SRMURLResolver.getObject(bc, coreURL, true);
					}
					/* CRM10-PT: TRACKER 97228: BEGIN OF CHANGES */
					if(coreObject==null){
						coreObject=new CoreInterfaceModBO();
					}
					/* CRM10-PT: TRACKER 97228: END OF CHANGES */
					iUniqueIdentifier = businessObject.getAccountID().intValue();
					coreCustId = businessObject.getCore_cust_id();
					TFBO= (TradeFinanceModBO)Utils.getBOFromID(bc,"TradeFinanceModBO",TradeFinanceModBO.ACCOUNTID, businessObject.getAccountID());
					if (TFBO==null)
					{
						TFBO = new TradeFinanceModBO();
					}

					Integer concurNew =  businessObject.getConcurDetect_X();

					//Key Generation changes
					if(!cifIDChngd){

						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							acctKey = businessObject.getAccountKey();
						}
					}
					//End


					if (concurNew != null && concurOld != null) {
						if ( !concurNew.equals(concurOld) ) {
							throw new SRMBCException(
									SRMBCException.RECORD_UPDATED_BY_OTHER,
									null
							);
						}
					}

				}else if(editFlag){


					/* Tab Validation By Mamta: Start */
					//businessObject=busi;
					businessObject = boAccountMod;
					/* Tab Validation By Mamta: End */

					coreObject = coreObj;
					TFBO=TFObj;
					iUniqueIdentifier = busi.getAccountID().intValue();
					coreCustId = businessObject.getCore_cust_id();

					//Key Generation changes
					if(!cifIDChngd){
						if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
							acctKey = busi.getAccountKey();
						}
					}
					//End


				}else{
					businessObject = new AccountModBO();
					coreObject = new CoreInterfaceModBO();
					/* CRM6206RECON:TRACKER# 59146 **BEGIN   CHANGES*/
					String isDemandLoaded = req.getParameter("isDemoLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false")){

						DemoBO = new DemographicModBO();


					}
					isDemandLoaded = req.getParameter("isPsychoLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false")){

						PsychoBO = new PsychographicModBO();

					}
					isDemandLoaded = req.getParameter("isTFLoaded");

					if(null != isDemandLoaded && isDemandLoaded.equals("false")){

						TFBO = new TradeFinanceModBO();

					}
					/* CRM6206RECON:TRACKER# 59146 **END   CHANGES*/
				}
			}

//Changes for tracker id: 338439 starts
	//Changes for Tracker id : 356535 Starts Here
		 if ((((accountURL==null) || (accountURL.equals(""))|| isCopy.equalsIgnoreCase("Y")) && (acctKey!=null))
			||	((((isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) && (!execute)) &&	( acctKey != null && !acctKey.equals(businessObject.getAccountKey()) )) || acctKey==null )){
					//Changes for Call Id: 310755 ends

					if(!convToCust.equalsIgnoreCase("Y")){

					key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);
					//Changes for ticket 690992 starts
					//coreCustId = AccountIDGen.getCoreCustId(bc);	// Commented for Ticket id: 777026
					if(coreCustId==null || (coreCustId!=null && coreCustId.equalsIgnoreCase("") )){
						coreCustId = (String)key.get("coreCustId");
						//coreCustId = generateCoreCustIdForReservedCIF(codeNNTM, typeNNTM, htCifIds, sPrimary_sol_id, bc);
					}
					//Changes for ticket 690992 ends
				}
					}
//Changes for Tracker id : 356535 Ends Here
			/* Tracker id 113276 changes start *//*,apprFlag, *//*, editFlag*/
//Changes for ticket id 345356 starts
if (PsychoBO!=null){
//Changes for ticket id 345356 ends
				/* Change for 374326 and 374328 start */
				String prefmodloc = req.getParameter("hid_preflocale");
				//232111 changes starts
								if(prefmodloc != null && !prefmodloc.equalsIgnoreCase("")) {
								PsychoBO.setPreferred_Locale(prefmodloc);
							}
			//232111 changes ends
			/* Change for 374326 and 374328 end */
			//Changes for call id 422794-recon for 411952 starts
			if((sDummy != null && sDummy.equalsIgnoreCase("Y"))|| (modsDummy!= null && modsDummy.equalsIgnoreCase("Y"))){
				PsychoBO = (PsychographicModBO)cifUtils.CurrencyDetModInfo(PsychoBO, req, coreCustId, context, entity_cre_flag,apprFlag, editFlag,sDummy);
			}else{
				PsychoBO = (PsychographicModBO)cifUtils.CurrencyDetModInfo(PsychoBO, req, coreCustId, context, entity_cre_flag,apprFlag, editFlag);
			}
			//Changes for call id 422794-recon for 411952 ends
	/* Tracker id 113276 changes end */
}


			/* CIF COPY CHANGES : END */

			/*****Address Serach field :Start***********/




			//changes for field based maker checker
			businessObject.setIsMCEdited(isMCEditedGeneral);
			setPhoneDetails(businessObject,currWorkWorkPhone,currHomeHomePhone, currMailingCellPhone, currWorkFaxNo,
			currWorkURL, currWorkEmail, currHomeEmail, currMailingEmailPalm, currMailingCity, currWorkExtension,currMailingState,currMailingCountry,currMailingZip);


			/*businessObject.setPhone(currWorkWorkPhone);
			businessObject.setPhone_Home(currHomeHomePhone);
			businessObject.setPhone_Cell(currMailingCellPhone);
			businessObject.setFax(currWorkFaxNo);
			businessObject.setCompanyURL(currWorkURL);
			businessObject.setEmail(currWorkEmail);
			businessObject.setEmail_Home(currHomeEmail);
			businessObject.setEmail_Palm(currMailingEmailPalm);
			/* Changes for tracker id 273347 start */
			businessObject.setCity(currMailingCity.trim());
			/*Changes for Ticketid:-326876 Changes Begin*/
			businessObject.setState(currMailingState.trim());
			businessObject.setCountry(currMailingCountry.trim());
			businessObject.setZip(currMailingZip.trim());
			/*Changes for Ticketid:-326876 Changes End*/
			/* Changes for tracker id 273347 end */
//			businessObject.setExtension(currWorkExtension);
			/*****Address Serach field :Start***********/
			//ALok changes starts

			//businessObject.setAccountName (acctName);

			//businessObject.setOrgType ("Account");

			//businessObject.setManager(sManager);
			/*Native Language Fields added:start*/
			//businessObject.setSecondaryRM_ID(sSecondaryRM);
			//businessObject.setTertiaryRM_ID(sTertiaryRM);
			/*Native Language Fields added:end*/
			/*New added field in Account Table : Begin*/
			//if(sCustFirstName!=null){
			//businessObject.setCust_First_Name(sCustFirstName.trim());}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
			//else{   businessObject.setCust_First_Name(null);}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		//if(sCustMiddleName!=null){
			//businessObject.setCust_Middle_Name(sCustMiddleName.trim());}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
			//else{businessObject.setCust_Middle_Name(null);	}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
			// Tracker id 113276 changes start
			/*businessObject.setShort_name(sShortName);
			businessObject.setNick_name(sNickName);
			businessObject.setFather_husband_name(sFatherHusbandName);
			businessObject.setPrimary_service_centre(sPrimaryServiceCentre);
			businessObject.setMother_name(sMotherName);
			businessObject.setPrevious_name(sPreviousName);*/
			//Tracker id 113276 changes end
			//businessObject.setSecure_id(sSecureID);
businessObject=accountValModset(businessObject,acctName,sManager,sSecondaryRM,sCustFirstName,sCustMiddleName,sSecureID);
//Alok changes ends

			/* Changes for WFlow POC -- start */
			if ((sIntWFID != null)&&(!sIntWFID.equals(""))&&(!sIntWFID.equals("null"))) {
				businessObject.setIntWFID(new Integer(sIntWFID));
			} else {
				businessObject.setIntWFID(null);
			}
			/* Changes for WFlow POC -- end */
			/*Approval Changes:start*/
			//Fix for call id: 438919
			if(!editFlag && (operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create")))
			{
				businessObject.setLastOperPerformed("C");

			}else if(editFlag && "Y".equalsIgnoreCase(businessObject.getEntity_cre_flag()))
			{
				businessObject.setLastOperPerformed("E");
				businessObject.setOwnedUserID(agentID1); //change for call id 750593
			}
//Changes for TOL ID 738938 starts
			if((operationType!=null) &&(operationType.equalsIgnoreCase("ConvtoCust")))
			{
				businessObject.setLastOperPerformed("C");
			}
//Changes for TOL ID 738938 ends
			/*Approval Changes:end*/
			//Fix for call id: 438919
			if(!editFlag && (operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create"))){

				businessObject.setCreatedLocationID(iBCID);
			}
			else {

				businessObject.setEditedLocationID(iBCID);
			}
			if(manualRouting != null && manualRouting.equalsIgnoreCase("Y")){

				businessObject.setManualRouting(manualRouting);
				if(assign_transfer!=null && assign_transfer.equalsIgnoreCase("Assign")){

					businessObject.setOwnedUserID(agentID1);

					if(!((manual_partnerID.trim()).equalsIgnoreCase(""))){
						businessObject.setAssignedTo(new Integer(manual_partnerID));
					}
					else if (!(manual_agentID.equalsIgnoreCase(""))){
						businessObject.setAssignedTo(new Integer(manual_agentID));
					}else{
						businessObject.setAssignedToGroup(new Integer(assignedGroupID));
						businessObject.setAssignedLocationID(new Integer(assignedLocID));
					}

				}
				else if (assign_transfer!=null && assign_transfer.equalsIgnoreCase("Transfer")){
					if(!(manual_partnerID.equalsIgnoreCase(""))){
						businessObject.setOwnedUserID(new Integer(manual_partnerID));
					}
					else if (!(manual_agentID.equalsIgnoreCase(""))){
						businessObject.setOwnedUserID(new Integer(manual_agentID));
					}else{
						businessObject.setOwnerGroup(new Integer(assignedGroupID));
						businessObject.setOwnedLocationID(new Integer(assignedLocID));
					}
				} //transfer loop ends

			}//END OF MANUAL ROUTING 'IF'
			else{
				businessObject.setManualRouting(manualRouting);
			//Fix for call id: 438947
				if(operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create")){
					businessObject.setAssignedTo(agentID1);
					businessObject.setOwnedUserID(agentID1);
				}
			}
			/********Fix for Tracker No.85405***********/
			/*if(cust_free_text.equals("")||cust_free_text.equals(null)){
				businessObject.setCard_holder("N");
			}else{
				businessObject.setCard_holder("Y");
			}*/
			/********Fix for Tracker No.85405***********/
			//changes for call id 345046 and recon for 341423 start
        		if(sPreferredName!= null && (!sPreferredName.trim().equals(""))) {
        		businessObject.setPreferredName(sPreferredName.trim());
        		} else {
            			businessObject.setPreferredName(null);
        		}
			//changes for call id 345046 and recon for 341423 ends
			//businessObject.setLead_source(sLeadSource);

			// Tracker id 113276 changes start
			/*businessObject.setDSA_ID(sDsaid);
			businessObject.setPhotograph_id(sPhotographID);
			businessObject.setRelationship_type(sRelationshipType);
			businessObject.setCIN(sCIN);
			businessObject.setRm_group_id(sRMGroupID);*/
			// Tracker id 113276 changes end


			businessObject.setRelationship_level(sRelationshipLevel);

            if(sCustLastName!=null){
			businessObject.setCust_Last_Name(sCustLastName.trim());
			}

	//Changes done by Ekta for Cif Deceased starts

	SRMTypedAttrStringized DateOfDeath= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.DateOfDeath");
	SRMTypedAttrStringized DateOfNotification= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.DateOfNotification");
	//Changes done by Ekta for Cif Deceased ends
		   	/*FATCA changes starts */
			businessObject.setForeignAccTaxReportingReq(strForeignAccTaxReportingReq);
			businessObject.setForeignTaxReportingCountry(strForeignTaxReportingCountry);
			businessObject.setForeignTaxReportingStatus(strForeignTaxReportingStatus);
			SRMTypedAttrStringized LastForeignTaxRevDate	= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.LastForeignTaxReviewDate");
			SRMTypedAttrStringized NextForeignTaxRevDate	= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.NextForeignTaxReviewDate");
			 businessObject.setLastForeignTaxReviewDate(ValidateDateFields(LastForeignTaxRevDate));
	         businessObject.setNextForeignTaxReviewDate(ValidateDateFields(NextForeignTaxRevDate));
	         businessObject.setFatcaRemarks(strFatcaRemarks);
			/* FATCA changes ends */

			//Senior Changes Starts
			if(SeniorCitizen!=null){
						businessObject.setSeniorCitizen(SeniorCitizen);
						if(SeniorCitizen.equalsIgnoreCase("Y")){
												businessObject.setSenCitizenConversionFlag("N");
									}else{
										businessObject.setSenCitizenConversionFlag("");
			}
		}
	//Changes done by Ekta for Cif Deceased starts
			businessObject.setDateOfDeath(ValidateDateFields(DateOfDeath));
			businessObject.setDateOfNotification(ValidateDateFields(DateOfNotification));
	//Changes done by Ekta for Cif Deceased ends
			//Senior Changes Ends
			businessObject.setGender(sGender);
			businessObject.setBackEndID(availableBackendID);
                  /* Changes Begin Tracker Id : 195897 */
			businessObject.setSalutation(sSalutation_code);
                  /* Changes End Tracker Id : 195897 */

			// CRM101UB changes :start
			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
			Date tmpDateDOB = null;// = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB"));
			if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
			{
				tmpDateDOB = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Cust_DOB"));
			}
			else
			{
				if(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB")!=null)
				{
					tmpDateDOB  = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB"));
				}
			}
			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/
			//Last Edited Page change
			/* Begin of changes by tracker : 142081 */
			//businessObject.setCust_DOB(tmpDateDOB);
			SRMTypedAttrStringized dttmpDateDOB=null;
			if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
			{
				dttmpDateDOB=SRMTypedAttrStringized.getReqParameter( req,"Cust_DOB");
			}
			else
			{
				if(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB")!=null)
				{
					dttmpDateDOB=SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.Cust_DOB");
				}
			}

			if(dttmpDateDOB != null) {
			businessObject.setCust_DOB(dttmpDateDOB.getFormatter(context).stringToDate(dttmpDateDOB.getValue()));
			}
			/* End of changes by tracker : 142081 */
			/********* Save and Submit Changes : Starts**********/
			if(tmpDateDOB != null && !(tmpDateDOB.equals(""))){
				String str1 = tmpDateDOB.toString();
				String strYr = str1.substring(str1.lastIndexOf(" ")+1);
				Integer year = new Integer(strYr);
				businessObject.setBirth_Year( year );

				businessObject.setBirth_Day(birthDay);
				businessObject.setBirth_Month(birth_month);
			}
			// CRM101UB changes : end

			//Tracker:90196: Changes for Attribute Masking

			String fullName=null;
			//SSV changes for code too large
//changes for tracker 401769 fullname alteration begin
			if(sName!=null && !sName.equalsIgnoreCase("null") && !sName.equalsIgnoreCase("")){
				fullName = sName;
			}
			else{
			fullName = setFullNameMod(businessObject);
			}
			//SSV changes for code too large
			if(fullName!=null && fullName.length()>80){

				throw new FCRMGenericException( "MSGEXC60661", new Exception( "Full Name cannot be more than 80 characters" ) );
			}

//changes for tracker 401769 fullname alteration ends
			if (fullName!=null) {
			businessObject.setName(fullName.trim());}
			else {businessObject.setName(null);}
			//Tracker:90196: End of Changes for Attribute Masking
			/** Access Control Changes**/
			if((accessOwnerGroup!=null)&&(!accessOwnerGroup.equalsIgnoreCase(""))){

				businessObject.setAccessOwnerGroup(new Integer(accessOwnerGroup));

			}
			/*AccessControlChanges -ML3	start*/
			if((accessOwnerSegment!=null)&&(!accessOwnerSegment.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerSegment(accessOwnerSegment);
			}

			if((accessOwnerBC!=null)&&(!accessOwnerBC.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerBC(new Integer((accessOwnerBC)));
			}
			if((sManager!=null)&&(!sManager.equalsIgnoreCase(""))){
				businessObject.setAccessOwnerAgent(new Integer((agentID_prim)));
			}
			else{
				businessObject.setAccessOwnerAgent(iLoggedUser);
			}
			if((sSecondaryRM!=null)&&(!sSecondaryRM.equalsIgnoreCase(""))){
				businessObject.setAccessAssigneeAgent(new Integer((agentID_sec)));
			}
			/*AccessControlChanges -ML3	end*/


			businessObject.setRecordStatus("D");
			//Changes for Tracker id: 356590 starts
			if(businessObject.getRecordStatus().equals("D")){
			businessObject.setAssignedTo(iLoggedUser);
		}
			//Changes for Tracker id: 356590 ends

			/* CRM70t-ST: TRACKER# : 78590	BEGIN OF CHANGES */
			if((accountURL==null) || (accountURL.equals("")) || isCopy.equalsIgnoreCase("Y")) {
					 /*Changes for Tracker 154769 Begin  for code too large issue*/
			/*Changes for Ticketid:-326876(Begin for code too large issue)Method moved to AccModHelper*/

			AccModHelper.setValuesForAccMod(businessObject);
			/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
				/*Changes for Tracker 154769 End */
			}
			/* CRM70t-ST: TRACKER# : 78590	END OF CHANGES */
			/* 	end of changes */

			/*changes for doc recieved*/
			if(doc_received==null) {
				businessObject.setDocument_Received("N");
			}else {
				businessObject.setDocument_Received("Y");
			}
			/*changes for doc recieved*/
			/* change by pradeep_satyamurthy for Tracker 204430 - Starts */

			businessObject = AccModHelper.setTheModBOobj(businessObject,req,boName,bc,sChildEntityTypeIntro);
			/* change by pradeep_satyamurthy for Tracker 204430 - Ends */
			/* ***** Tracker# 97236 CIF - Ebanking changes : Start ***** */

			/* ***** Tracker# 97236 CIF - Ebanking changes : End ***** */

			if (strSubmitForKYC != null && strSubmitForKYC.equalsIgnoreCase("N")){ // Changes for 692923 TOL start
				  
				  SRMTypedAttrStringized sKYCReviewDate2= SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.KYC_ReviewDate");
				  SRMTypedAttrStringized sKYCDate2 = SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.KYC_Date");
				  
				if((sKYCReviewDate2!=null)&&(!sKYCReviewDate2.getValue().equalsIgnoreCase(""))){
					 KYCReviewDate = (sKYCReviewDate2.getFormatter(context).stringToDate(sKYCReviewDate2.getValue()));
				  }
				if((sKYCDate2!=null)&&(!sKYCDate2.getValue().equalsIgnoreCase(""))){
					 KYCDate = (sKYCDate2.getFormatter(context).stringToDate(sKYCDate2.getValue()));
				}
				businessObject.setKYC_Date(KYCDate);
				businessObject.setKYC_ReviewDate(KYCReviewDate);
				// Changes for 692923 TOL end
      	}
			businessObject.setCustomerMinor(CustomerMinor);
			//businessObject.setCombinedStatementFlg(CombinedStatementFlg);
			businessObject.setCategory(Category);

			// Tracker id 113276 changes start

			/*WMS fields start*/
			if((RiskProfileScore!=null)&&(!RiskProfileScore.getValue().equalsIgnoreCase(""))){
				businessObject.setRiskProfileScore(new Integer(RiskProfileScore.getFormatter2(context).stringToInt(RiskProfileScore)));
			}
			/* Changes for Tracker id:(260591)callid:-225164 :Changes Start */
						else {
									businessObject.setRiskProfileScore(null);
							 }
			/* Changes for Tracker id:(260591)callid:-225164 :Changes End */
			businessObject.setRiskProfileExpiryDate(ValidateDateFields(RiskProfileExpiryDate));
			/*WMS fields  end*/

			businessObject.setAccountType(ValidateStringFields(accountType));
			/*  CRM62M:TRACKER:67292:ENDOFCHANGES */

					// Changes for TOL 669756 starts
					// businessObject.setStrUserField6(sStrUserField6);
					// Changes for TOL 669756 ends
			// businessObject.setHouseholdID(ValidateStringFields(HouseHoldID));
			/* CIFGroupHouseHold Changes start */

			/* CIF GrouphouseHold changes end */
			if(isQDE!=null && isQDE.equalsIgnoreCase("Y")){
				if(businessObject.getCreated_From()==null){
					businessObject.setCreated_From("Q");
				}
			}
			else{
				businessObject.setCreated_From("A");
			}
			/*  CRM62M:TRACKER:67292:BEGINOFCHANGES */
			businessObject.setConstitution_Code(ValidateStringFields(req.getParameter(boName+".Constitution_ref_code")));
			/*  CRM62M:TRACKER:67292:BEGINOFCHANGES */
			/* TRACKER# 60567 : BEGIN   CHANGES */
			businessObject.setRelationshipOffer1(RelationshipOffer1);
			businessObject.setRelationshipOffer2(RelationshipOffer2);
			/* TRACKER# 60567 : END   CHANGES */

			// Tracker id 113276 changes start
			/*businessObject.setCustomerProfitability(ValidateDoubleFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.customerProfitability")));
			businessObject.setCurrentCrExposure(ValidateDoubleFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.currentCrExposure")));
			businessObject.setTotalCrExposure(ValidateDoubleFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.totalCrExposure")));
			businessObject.setPotentialCrLine(ValidateDoubleFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.potentialCrLine")));
			businessObject.setAvailableCrLimit(ValidateDoubleFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.availableCrLimit")));*/

			// Tracker id 113276 changes end
			//following added for CIF
			businessObject.setLead_source(req.getParameter("AccountBO.lead_source"));
			//end of change



			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/

			//businessObject.setRelationshipOpeningDate(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"AccountBO.RelationshipOpeningDate")));

			/* FCRM62ENH: TRACKER# : 58470 BEGIN OF CHANGES */
			//businessObject.setDateOfBecomingNRE(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"AccountBO.DateOfBecomingNRE")));
			/* FCRM62ENH: TRACKER# : 58470 END OF CHANGES */
//changes for call id 337739 starts
			if(((null!=alterCalenderType))&&((alterCalenderType.trim().equals("H"))||(alterCalenderType.trim().equals("h"))))
			{
				businessObject.setDateOfBecomingNRE(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"DateOfBecomingNRE")));
				businessObject.setNREBecomingOrdDate(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"NREBecomingOrdDate")));
				//Changes for tracker ID 457143 start
				businessObject.setRelationshipOpeningDate(ValidateDateTimeFields(SRMTypedAttrStringized.getReqParameter( req,"RelationshipOpeningDate")));

			}
			else
			{
				businessObject.setDateOfBecomingNRE(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.DateOfBecomingNRE")));
				businessObject.setNREBecomingOrdDate(ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"AccountBO.NREBecomingOrdDate")));
				businessObject.setRelationshipOpeningDate(ValidateDateTimeFields(SRMTypedAttrStringized.getReqParameter( req,"3_AccountBO.RelationshipOpeningDate")));
				//Changes for tracker ID 457143 end

			}
//changes for call id 337739 ends
		/*Changes done for Recon for tracker id 201511 241578 Start*/
			SRMTypedAttrStringized DateUserField1 = SRMTypedAttrStringized.getReqParameter(req,"3_AccountBO.DateUserField1");

			if((DateUserField1!=null)&&!(DateUserField1.equals("null"))&&(!DateUserField1.getValue().equalsIgnoreCase("")))
			{
			businessObject.setDateUserField1(ValidateDateFields(DateUserField1));
			}
		/*Changes done for Recon for tracker id 201511 241578 End*/
			/*********************ERPBOCF1:TRACKER:113259:STARTOFCHANGES ********************************/


			/*********** Save and Submit Changes : Start*************/
			try{
				//    businessObject.setCust_DOB(new Date(tempStrDate));



				/*    for (iTest=0; iTest<months.length; iTest++) {
				 if (months[iTest].toUpperCase().equals(month.toUpperCase())) {
				 imonth = iTest+1;
				 }
				 }*/

                  /* Changes Begin Tracker Id : 195897 */
				if(sCust_type_code != null && !sCust_type_code.trim().equals("")) {
                  /* Changes End Tracker Id : 195897 */
					businessObject.setCust_Type (sCust_type_code);
				} else {
					businessObject.setCust_Type (null);
				}
				businessObject.setXmlData(Utils.convertStrToByteArray(acctXMLDATA));
				if((acctRevenue!=null)&&(!acctRevenue.equals(""))){
					businessObject.setAnnualRevenue(new Double(acctRevenue));
				} else {
					businessObject.setAnnualRevenue (null);
				}
				//        businessObject.setCompanyURL (acctURL);
				businessObject.setCompetitor (acctCompetitor);

				if(acctIndustry != null && !acctIndustry.trim().equals("")) {
					businessObject.setIndustry (acctIndustry);
				} else {
					businessObject.setIndustry (null);
				}

				if(acctRegion != null && !acctRegion.trim().equals("")) {
					businessObject.setRegion (acctRegion);
				} else {
					businessObject.setRegion (null);
				}

				businessObject.setNotes (acctNotes);
				if(acctParentAccount != null && !acctParentAccount.trim().equals("")) {
					businessObject.setParentAccount (acctParentAccount);
				} else {
					businessObject.setParentAccount (null);
				}
				//        businessObject.setPhone (acctPhone);
				if(acctRevenueUnits != null && !acctRevenueUnits.trim().equals("")) {
					businessObject.setRevenueUnits (acctRevenueUnits);
				} else {
					businessObject.setRevenueUnits (null);
				}


				if(acctSICCode != null && !acctSICCode.trim().equals("")) {
					businessObject.setSicCode(acctSICCode);
				} else {
					businessObject.setSicCode(null);
				}

                  /* Changes Begin Tracker Id : 195897 */
				if(sStatus_code != null && !sStatus_code.trim().equals("")) {
					businessObject.setStatus (sStatus_code);
				} else {
					businessObject.setStatus (null);
				}
                  /* Changes End Tracker Id : 195897 */


				if((RelationshipMgrID!=null)&&(!RelationshipMgrID.getValue().equalsIgnoreCase(""))){
					businessObject.setRelationshipMgrID(new Integer(RelationshipMgrID.getFormatter2(context).stringToInt(RelationshipMgrID)));
				}

				if((RelationshipCreatedByID!=null)&&(!RelationshipCreatedByID.getValue().equalsIgnoreCase(""))){
					/* Tracker # 93931 Begin of changes */
					Integer agentID=null;
					/* 10.2 SPE Changes */
					agentID = getAgentIDfromLoginID(bc,RelationshipCreatedByID.getValue());
					/* 10.2 SPE Changes */
					businessObject.setRelationshipCreatedByID(agentID);
					//businessObject.setRelationshipCreatedByID(new Integer(RelationshipCreatedByID.getFormatter2(context).stringToInt(RelationshipCreatedByID)));
					/* Tracker # 93931 End of changes */
				}

				if((preferredChannelID!=null)&&(!preferredChannelID.getValue().equalsIgnoreCase(""))){
					businessObject.setPreferredChannelID(new Integer(preferredChannelID.getFormatter2(context).stringToInt(preferredChannelID)));
				}

				if(acctTickerSymbol != null && !acctTickerSymbol.trim().equals("")) {
					businessObject.setTickerSymbol(acctTickerSymbol);
				} else {
					businessObject.setTickerSymbol(null);
				}



				/*
				 *	Core Fields Inclusion - Begin
				 */

				/* Introducer Loop Commented By Tracker ID 113276  for CIF Usability */
				/*
				 if(accountURL == null || accountURL.trim().equals(""))
				 {
				 if(sIntroducerType.equalsIgnoreCase("CUSTOMER"))
				 {
				 if (sChildEntityTypeIntro.equalsIgnoreCase("Retail")) {
				 AccountBO introBusObj = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTKEY,ctKeyIntro);
				 sCore_introd_cust_id = introBusObj.getCore_cust_id();
				 } else {
				 CorporateBO introBusObj = (CorporateBO)Utils.getBOFromID(bc,"CorporateBO",CorporateBO.CORP_KEY,ctKeyIntro);
				 sCore_introd_cust_id = introBusObj.getCore_Cust_ID();
				 }
				 businessObject.setCore_introd_cust_id(sCore_introd_cust_id);
				 }
				 }*/

				/* Introducer Loop Commented By Tracker ID 113276  for CIF Usability */


				//businessObject.setIntrod_Salutation_code(sIntrod_Salutation_code);
				businessObject.setIntroducerName(sIntroducerName);
				// businessObject.setCust_hlth_code(sCust_hlth_code);
				//businessObject.setTds_tbl_code(sTds_tbl_code);
				//changes for callid 757351
				if((!((TDS_CIFID ==null)||(TDS_CIFID.equalsIgnoreCase("")))) && ((TDS_CORECUSTID ==null)||(TDS_CORECUSTID.equalsIgnoreCase("")))){
					TDS_CORECUSTID=Utils.getCoreCustIdForTdsCifId(TDS_CIFID,bc);
					}
				businessObject.setTds_cust_id(TDS_CORECUSTID);
				businessObject.setTDS_CIFID(TDS_CIFID);
				businessObject.setNat_id_card_num(sNat_id_card_num);
				if(Psprt_issue_date != null && !Psprt_issue_date.trim().equals("")) //Changes for call id 422914
				businessObject.setPsprt_issue_date(ValidateDateFields(Psprt_issue_date));
				businessObject.setPsprt_det(sPsprt_det);
				if(Psprt_exp_date != null && !Psprt_exp_date.trim().equals("")) //Changes for call id 422914
				businessObject.setPsprt_exp_date(ValidateDateFields(Psprt_exp_date));
				businessObject.setCust_pref_till_date(ValidateDateFields(Cust_pref_till_date));
				businessObject.setCrncy_code(sCrncy_code);
				businessObject.setPrimary_sol_id(sPrimary_sol_id);
				//Changes for tracker ID 457671 start
				businessObject.setOffline_cum_debit_limit(ValidateDoubleFields(Offline_cum_debit_limit));
				//Changes for tracker ID 457671 start

				/* Changes For Ticketid:- 371367 Begin
                 Commenting the changes done for Ticketid:-286305 */

				/*Changes for Ticketid:-286305 Begin
				Setting the value of pref in the boobject after checking the proper conditions*/
				/*if((sPref_code!=null)&&(!sPref_code.equalsIgnoreCase(""))){
					businessObject.setPref_code(sPref_code);
				}else{
					businessObject.setPref_code("");
				}*/
				/*Changes for Ticketid:-286305 End*/
				/* Changes For Ticketid:- 371367 End */

				/* Change for ticket 367607 starts */
 /* Recon of Change for call  391057  starts */
				if((sPref_code_rcode!=null)&&(!sPref_code_rcode.equalsIgnoreCase(""))){
						businessObject.setPref_code(sPref_code_rcode);
					}else{
						businessObject.setPref_code("");
				}
 /* Recon of Change for call  391057  end */
				/* Change for ticket 367607 ends */

				/*  ERPBOCF1:TRACKER:113259:BEGINOFCHANGES(HIJRI) */
				/*   setting the value into BO  */
				//businessObject.setPreferredCalendar(strPreferredCalendar);
//changes for call id 337739 starts
				businessObject.setNREBecomingOrdDate(ValidateDateFields(NREBecomingOrdDate));
//changes for call id 337739 ends
				//businessObject.setCustStatusChgDate(ValidateDateFields(CustStatusChgDate));
				/*  ERPBOCF1:TRACKER:113259:ENDOFCHANGES(HIJRI) */

                /*Changes start for callid 413816*/
 // Recon of Change for call  391057
				//businessObject.setPref_code_rcode(sPref_code_rcode);
				//businessObject.setIntroducerStatusCode(sIntroducerStatusCode);
				//businessObject.setName(sName.trim());
				businessObject.setRatingDate(ValidateDateFields(RatingDate));
				businessObject.setManagerOpinion(sManagerOpinion);

				businessObject.setPurgeRemarks(sPurgeRemarks);
				businessObject.setNativeLangName(sNativeLangName);
				businessObject.setMinorAttainMajorDate(ValidateDateFields(MinorAttainMajorDate));

				//Senior Starts
				businessObject.setSenCitizenApplicableDate(ValidateDateFields(SenCitizenApplicableDate));
				//Senior Ends
				businessObject.setDefaultAddressType(sDefaultAddressType);

				/*if(acctKey.length() > 9){
				 businessObject.setCore_cust_id(acctKey.substring(0,9));
				 }else{
				 businessObject.setCore_cust_id(acctKey);
				 }*/
				businessObject.setCore_cust_id(coreCustId);

				/*
				 * Fix for 265137, approval disabled scenario
				 * If getting edited and saved then value shud go as Y
				 */
				//if(editFlag || saveFlag==1)
				if(editFlag && saveFlag==1){
				/* END OF CHANGES */
					businessObject.setEntity_cre_flag("Y");
					//Changes for call id 379942 starts
				} else if(businessObject.getEntity_cre_flag()==null || businessObject.getEntity_cre_flag().equalsIgnoreCase("N") || businessObject.getEntity_cre_flag().equalsIgnoreCase("")){
					businessObject.setEntity_cre_flag("N");
					//Changes for call id 379942 ends
				}else {
					businessObject.setEntity_cre_flag("Y");
				}
				//businessObject.setSalutation_code(sSalutation_code);
				//changes for call-id 452991 begins
				if(sGroupid_code != null){
					businessObject.setGroupid_code(sGroupid_code);
				}
				//changes for call-id 452991 ends
				//changes for call id::573394 begins
				else{
				businessObject.setGroupid_code("");
				}
				//changes for call id::573394 ends
				
				
				businessObject.setOccupation_code(sOccupation_code);
				//businessObject.setSector_code(sSector_code);
				//businessObject.setSubsector_code(sSubsector_code);
				//businessObject.setCust_type_code(sCust_type_code);
				// businessObject.setStatus_code(sStatus_code);
				//Tracker 151893
				businessObject.setConstitution_ref_code(sConstitution_ref_code);
				businessObject.setCustCreationMode(sCustCreationMode);
                  /* Changes Begin Tracker Id : 195897 */
				businessObject.setRating(sRating_code);
                  /* Changes End Tracker Id : 195897 */
				businessObject.setCust_community(sCust_community);
				                                    //change for callid 358638 begins

if(sIntroducerSalutation!=null){				businessObject.setIntroducerSalutation(sIntroducerSalutation);
}
				else{businessObject.setIntroducerSalutation(sIntroducerSalutation1);
			}
			                                    //change for callid 358638 ends
				//  businessObject.setIntroducerID(sIntroducerID);
                  /* Changes Begin Tracker Id : 195897 */
				businessObject.setCust_hlth(sCust_hlth_code);
				businessObject.setTds_tbl(sTds_tbl_code);
                  /* Changes End Tracker Id : 195897 */
                                    //change for callid 358638 begins

				if(sIntrod_Status!=null){				businessObject.setIntrod_Status(sIntrod_Status);
				}
			else{	businessObject.setIntrod_Status(sIntrod_Status1);}
			                  //change for callid 358638 ends
				businessObject.setNativeLangTitle(sNativeLangTitle);
                  /* Changes Begin Tracker Id : 195897 */
				businessObject.setSector(sSector_code);
				businessObject.setSubsector(sSubsector_code);
                  /* Changes End Tracker Id : 195897 */

				businessObject.setPurgeFlag(purge_flag);
				/*if(purge_flag==null) {
				 businessObject.setPurgeFlag("N");
				 }else {
				 businessObject.setPurgeFlag("Y");
				 }*/
				if(isTFFlag==null) {
					businessObject.setTFPartyFlag("N");
				}else {
					businessObject.setTFPartyFlag(isTFFlag);
				}

				// Changes for call id 457246 starts here
				// Changes for call id 776881 starts here
				if(convToCust.equals("Y")){
					businessObject.setConverted_Date(currDate);
					businessObject.setOldEntityType(oldEntityType.toUpperCase());
					businessObject.setOldEntityID(oldEntityID);
					businessObject.setLastOperPerformed("C"); 
						if (oldEntityType.equalsIgnoreCase("NonCustomer") && apprFlag ){
						NonCustomerBO ncBO = (NonCustomerBO)Utils.getBOFromID(bc,"NonCustomerBO",NonCustomerBO.NONCUSTOMERID,oldEntityID);
						if(ncBO!=null){
						ncBO.setRecordStatus("I");
						//ncBO.setCONVDATE(currDate);
						SRMDataObject.write(ncBO, bc);
						}
						}
				}
				// Changes for call id 776881 ends here
				// Changes for call id 457246 ends here
				/*
				 *	Core Fields Inclusion - End
				 */
				if(operationType!=null && operationType.equals("Queue")) {
					businessObject.setLastEditedPage("General");
				}
				else if((operationType!=null) && (operationType.equals("Edit Entity"))){
					businessObject.setLastEditedPage("General");
				}
				else {
					businessObject.setLastEditedPage("Normal");
				}


				/* CoreInterfaceBO changes*/


				coreObject.setORGKEY(acctKey);
				coreObject.setCore_cust_id(coreCustId);
				coreObject = AccModHelper.setCoreObj(coreObject,req,boNameCI,apprFlag);
				//665901 changes starts
				/*if (editFlag){
					coreObject.setEntity_cre_flg("Y");
				} else if(businessObject.getEntity_cre_flag() ==null || businessObject.getEntity_cre_flag().equalsIgnoreCase("N") || businessObject.getEntity_cre_flag().equalsIgnoreCase("")){
					coreObject.setEntity_cre_flg("N");
				}
				else{
					coreObject.setEntity_cre_flg("Y");
				}*/
				setCoreInterfaceFields(coreObject,editFlag,businessObject);
				//665901 changes ends
			}catch(Exception e){}

			/*********** Saving HouseHold ****************/
			SRMCollection houseHold = businessObject.getGroupHouseHold();



			/****************************/
			//CIF HOUSEHOLD SAVING - begin
			/****************************/

			/*************HouseHold cleanup::Start**************************************/
			if(ScreenName!=null && ScreenName.trim().equalsIgnoreCase("CIF")){

				//CIF HouseHold additions- begin

				ArrayList AvailableHouseHold =  new ArrayList();
				if(editFlag){
					for(int iCount=0; iCount < houseHold.size(); iCount++) {
						AvailableHouseHold.add(((AccountModBO.GroupHouseHold)houseHold.get(iCount)).getMainTableID().toString());
					}
				}else{
					for(int iCount=0; iCount < houseHold.size(); iCount++) {
						AvailableHouseHold.add(((AccountModBO.GroupHouseHold)houseHold.get(iCount)).getGroupHouseHoldID().toString());
					}
				}
				for(int j =0;j < hshldCodeSize;j++){ // the list of all Address from the view

					AccountModBO.GroupHouseHold NewHouseHoldDet = null;
					boolean found = false;
					String tempHouseHoldID = null;
					if(isCopy!=null)
					if(!isCopy.equals("Y"))
						tempHouseHoldID = lstHouseHoldID.get(j).toString().trim();
					AccountModBO.GroupHouseHold tempHouseHoldDet = null;
					for(int n =0; n<houseHold.size();n++){// for all existing list of Address
						if(tempHouseHoldID == null || tempHouseHoldID.equals("null") || tempHouseHoldID.equals("")){
							found = false;
							break;
						}
						tempHouseHoldDet = (AccountModBO.GroupHouseHold)houseHold.get(n);
						if(editFlag){
							if(tempHouseHoldDet!=null)
							if(((tempHouseHoldDet.getMainTableID()).toString()).equals(tempHouseHoldID.toString())){
								found = true;
								break;
							}
						}else{
							if(tempHouseHoldDet!=null)
							if(((tempHouseHoldDet.getGroupHouseHoldID()).toString()).equals(tempHouseHoldID.toString())){
								found = true;
								break;
							}
							continue;
						}
					}

					for(int iCount=0; iCount < houseHold.size(); iCount++) {
					//Changes for 413958 and recon of call id 411963 reopen call starts
					//Changes for call id:425507 and recon of call id 413599 starts
					if ((((AccountModBO.GroupHouseHold)houseHold.get(iCount)).getGroupHouseHoldCode())!=null &&((AccountModBO.GroupHouseHold)houseHold.get(iCount)).getFlag().equalsIgnoreCase("H")){//fix for callid:439794 
						AvailableHouseHold.add(((AccountModBO.GroupHouseHold)houseHold.get(iCount)).getGroupHouseHoldCode().toString());
					}
					//Changes for call id:425507 and recon of call id 413599 ends
					//Changes for 413958 and recon of call id 411963 reopen call ends
					}

					if(found){
						NewHouseHoldDet = tempHouseHoldDet;

					}
					else{
						NewHouseHoldDet = (AccountModBO.GroupHouseHold)businessObject.getInstance("GroupHouseHold");
					}
					if( j<hshldCodeSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldCode.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldCode((((StringBuffer)lstHouseHoldCode.get(j)).toString()).trim());

					}else{
						NewHouseHoldDet.setGroupHouseHoldCode(null);
					}
					if( j<hshldNameSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldName.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldName((((StringBuffer)lstHouseHoldName.get(j)).toString()).trim());

					}else{
						NewHouseHoldDet.setGroupHouseHoldName(null);
					}

					if( j<hshldMasterIDSize &&
							is_valid_req_arg(((StringBuffer)lstHouseHoldMasterID.get(j)).toString())) {
						NewHouseHoldDet.setGroupHouseHoldMasterID(new Integer((lstHouseHoldMasterID.get(j)).toString()));

					}else{
						NewHouseHoldDet.setGroupHouseHoldMasterID(null);
					}


					NewHouseHoldDet.setFlag("H");

					//Changes for tracker id :253845- Start
					setNewHouseHoldDetParams(req,NewHouseHoldDet,j);
					/*if(null !=lstGh_Text1 && j<lstGh_Text1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text1.get(j)).toString())) {
						NewHouseHoldDet.setText1((((StringBuffer)lstGh_Text1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText1(null);
					}
					if(null !=lstGh_Text2 && j<lstGh_Text2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text2.get(j)).toString())) {
						NewHouseHoldDet.setText2((((StringBuffer)lstGh_Text2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText2(null);
					}
					if(null !=lstGh_Text3 && j<lstGh_Text3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Text3.get(j)).toString())) {
						NewHouseHoldDet.setText3((((StringBuffer)lstGh_Text3.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setText3(null);
					}
					if(null !=lstGh_Dropdown1 && j<lstGh_Dropdown1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
						NewHouseHoldDet.setDropdown1((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown1(null);
					}
					if(null !=lstGh_Dropdown2 && j<lstGh_Dropdown2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown2.get(j)).toString())) {
						NewHouseHoldDet.setDropdown2((((StringBuffer)lstGh_Dropdown2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown2(null);
					}
					if(null !=lstGh_Dropdown3 && j<lstGh_Dropdown3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
						NewHouseHoldDet.setDropdown3((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setDropdown3(null);
					}
					if(null !=lstGh_Lookup1 && j<lstGh_Lookup1.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup1.get(j)).toString())) {
						NewHouseHoldDet.setLookup1((((StringBuffer)lstGh_Lookup1.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup1(null);
					}
					if(null !=lstGh_Lookup2 && j<lstGh_Lookup2.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup2.get(j)).toString())) {
						NewHouseHoldDet.setLookup2((((StringBuffer)lstGh_Lookup2.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup2(null);
					}
					if(null !=lstGh_Lookup3 && j<lstGh_Lookup3.size() &&
							is_valid_req_arg(((StringBuffer)lstGh_Lookup3.get(j)).toString())) {
						NewHouseHoldDet.setLookup3((((StringBuffer)lstGh_Lookup3.get(j)).toString()).trim());
					}else{
						NewHouseHoldDet.setLookup3(null);
					}*/

					//Changes for tracker id :253845- End
					if(!found){
						houseHold.add(NewHouseHoldDet);
					}

				}

				if(lstHouseHoldRemoved != null) {
					for(int iCnt=0; iCnt < hshldRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstHouseHoldRemoved.get(iCnt));
						int index = AvailableHouseHold.indexOf(sdelAsset);
						if(index != -1) {
							AccountModBO.GroupHouseHold delAsset = (AccountModBO.GroupHouseHold)houseHold.get(index);
							if(editFlag){
								if(delAsset.getMainTableID() != new Integer(lstHouseHoldRemoved.get(iCnt).toString())){
									houseHold.remove(index);
									AvailableHouseHold.remove(index);
								}
							}else{
								if(delAsset.getGroupHouseHoldID() != new Integer(lstHouseHoldRemoved.get(iCnt).toString())){
									houseHold.remove(index);
									AvailableHouseHold.remove(index);
								}

							}
						}
					}

				}
//				CRM101UB CIF Changes Start : Group
					//10.6 Changes Starts
					//for(int j =0;j < grpCodeSize;j++){ // the list of all Groups from the view
					for (int j = 0; j < grpNameSize; j++) { // the list of all Groups from the view
					//10.6 Changes Ends
					AccountModBO.GroupHouseHold NewGroupDet = null;
					boolean found = false;

					String tempGroupID = null;
					if(isCopy!=null && !isCopy.equalsIgnoreCase("Y"))
						tempGroupID = lstGrpID.get(j).toString().trim();
					AccountModBO.GroupHouseHold tempGroupDet = null;
					for(int n =0; n<houseHold.size();n++){// for all existing list of Groups
						if(tempGroupID == null || tempGroupID.equals("null") || tempGroupID.equals("")){
							found = false;
							break;
						}
						tempGroupDet = (AccountModBO.GroupHouseHold)houseHold.get(n);
						/*TRACKER ID:159269 CHANGES BEGIN*/
/*Fix for 297571*/
					if(editFlag){
						if(tempGroupDet.getMainTableID()!=null && ((tempGroupDet.getMainTableID()).toString()).equals(tempGroupID.toString())){
							found = true;
							break;
						}
					}else{
						if(tempGroupDet.getGroupHouseHoldID()!= null){
							if(((tempGroupDet.getGroupHouseHoldID()).toString()).equals(tempGroupID.toString())){
							found = true;
								break;
							}
						}
/*Fix for 297571*/
						}
						continue;
					}


					if(found){
						NewGroupDet = tempGroupDet;
					}
					else{
						NewGroupDet = (AccountModBO.GroupHouseHold)businessObject.getInstance("GroupHouseHold");
					}
					String primaryGrp=null;
					String groupID = null;
					String grpName = null;
					//10.6 Changes Starts
					/*if( j<grpCodeSize &&
							is_valid_req_arg(((StringBuffer)lstGrpCode.get(j)).toString())) {
						NewGroupDet.setGroupHouseHoldCode((((StringBuffer)lstGrpCode.get(j)).toString()).trim());
					}else{
						NewGroupDet.setGroupHouseHoldCode(null);
					}*/
					//10.6 Changes Ends
					if( j<grpNameSize &&
							is_valid_req_arg(((StringBuffer)lstGrpName.get(j)).toString())) {
						grpName = 	(((StringBuffer)lstGrpName.get(j)).toString()).trim();
						NewGroupDet.setGroupHouseHoldName(grpName);
					}else{
						NewGroupDet.setGroupHouseHoldName(null);
					}
					//10.6 Changes Starts
					/*if( j<grpMasIDSize &&
							is_valid_req_arg(((StringBuffer)lstGrpMasID.get(j)).toString())) {
						NewGroupDet.setGroupHouseHoldMasterID(new Integer((lstGrpMasID.get(j)).toString()));
					}else{
						NewGroupDet.setGroupHouseHoldMasterID(null);
					}*/
					if( j<grpMasIDSize &&
							is_valid_req_arg(((StringBuffer)lstGrpMasID.get(j)).toString())) {
						NewGroupDet.setGrpID(new Integer((lstGrpMasID.get(j)).toString()));
					}else{
						NewGroupDet.setGrpID(null);
					}
					//10.6 Changes Ends
					if( j<perShareSize &&
							is_valid_req_arg(((StringBuffer)lstPerShare.get(j)).toString())) {
						NewGroupDet.setShareholding_in_percentage(new Double((lstPerShare.get(j)).toString()));
					}else{
						NewGroupDet.setShareholding_in_percentage(new Double("0"));
					}

					/* CRM101UB Changes & 10.2.14 changes:start*/
					//Changes for 413958 and recon of call id 411963 reopen call starts
					//Changes for call id:425507 and recon of call id 413599 starts
					/*if( j<grpIDSize &&
							is_valid_req_arg(((StringBuffer)lstGrpID.get(j)).toString())) {
						groupID = (((StringBuffer)lstGrpID.get(j)).toString()).trim();
						NewGroupDet.setGROUP_ID(groupID);
					}else{
						NewGroupDet.setGROUP_ID(null);
					}*/
					if( j<grp_IDSize &&
							is_valid_req_arg(((StringBuffer)lstGroup_ID.get(j)).toString())) {
						groupID = (((StringBuffer)lstGroup_ID.get(j)).toString()).trim();
						NewGroupDet.setGROUP_ID(groupID);
					}else{
						NewGroupDet.setGROUP_ID(null);
					}
					//Changes for call id:425507 and recon of call id 413599 ends
					//Changes for 413958 and recon of call id 411963 reopen call ends
					if( j<primarySize &&
							is_valid_req_arg(((StringBuffer)lstPrimary.get(j)).toString())) {
						primaryGrp =(((StringBuffer)lstPrimary.get(j)).toString()).trim();
						NewGroupDet.setPRIMARY_GROUP_INDICATOR(primaryGrp);
/*Tracker:110963: CODE COMMENT START : INSERT INTO CATEGORY TABLE IS NOW DONE FROM CORE.JAVA WHEN GROUP IS CREATED-NIKHIL*/
					/*	//CRM101BUB for category insert START
						if(primaryGrp.equalsIgnoreCase("Y") ){
							if((groupID!=null)&&(!groupID.equalsIgnoreCase(""))){
								businessObject.setGroupid_code(groupID);
							}else{
								businessObject.setGroupid_code("");
							}
							CommonQueries.Cat_Grp_Insert( bc,  groupID,  grpName);

						}
						//CRM101BUB for category insert END	 */
/*Tracker:110963: CODE COMMENT END -NIKHIL*/
					}else{
						NewGroupDet.setPRIMARY_GROUP_INDICATOR(null);
					}
					/* CRM101UB Changes:start*/

					NewGroupDet.setFlag("G");

					if(!found){
						houseHold.add(NewGroupDet);
					}

				}
				if(lstGrpRem != null) {
					for(int iCnt=0; iCnt < grpRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstGrpRem.get(iCnt));
						int index = AvailableHouseHold.indexOf(sdelAsset);
						if(index != -1) {
							AccountModBO.GroupHouseHold delAsset = (AccountModBO.GroupHouseHold)houseHold.get(index);
							if(delAsset.getGroupHouseHoldID() != new Integer(lstGrpRem.get(iCnt).toString())){
								houseHold.remove(index);
								AvailableHouseHold.remove(index);
							}

						}
					}
				}
//				CRM101UB CIF Group changes End
			}

			/***************** SAVING ADDRESS START ***********/
			SRMCollection address = businessObject.getAddress();
			int addressSize =  address.size();
			/*************Address cleanup::Start**************************************/

			/****************************/
			//CIF ADDRESS SAVING -begin
			/****************************/
			if(ScreenName!=null && ScreenName.trim().equalsIgnoreCase("CIF")){

				ArrayList AvailableAddress =  new ArrayList();
				if(editFlag){
					for(int iCount=0; iCount < addressSize; iCount++) {
						AvailableAddress.add(((AccountModBO.Address)address.get(iCount)).getMainTableID().toString());
					}
				}else{
					for(int iCount=0; iCount < addressSize; iCount++) {
						AvailableAddress.add(((AccountModBO.Address)address.get(iCount)).getAddressID().toString());
					}
				}
				for(int j =0;j < addrTypeSize;j++){ // the list of all Address from the view

					AccountModBO.Address NewAddressDet = null;
					boolean found = false;
					String tempAddressID = null;
					if((isCopy!=null) && (lstaddID!=null))
					if(!isCopy.equals("Y") && lstaddID.size()>0)
						tempAddressID = lstaddID.get(j).toString().trim();
					AccountModBO.Address tempAddressDet = null;
					for(int n =0; n<addressSize;n++){// for all existing list of Address
						if(tempAddressID == null || tempAddressID.equals("null") || tempAddressID.equals("")){
							found = false;
							break;
						}
						tempAddressDet = (AccountModBO.Address)address.get(n);
						if(editFlag){
							if(tempAddressDet!=null)
							if(((tempAddressDet.getMainTableID()).toString()).equals(tempAddressID.toString())){
								found = true;
								break;
							}
						}else{

							/* Tracker id 146326 Changes start*/
							if(tempAddressDet.getAddressID()!=null){
							/* Tracker id 146326 Changes end*/
							if(((tempAddressDet.getAddressID()).toString()).equals(tempAddressID.toString())){
								found = true;
								break;
							}
							continue;
							/* Tracker id 146326 Changes start*/
							}
							/* Tracker id 146326 Changes end*/
						}
					}

					if(found){
						NewAddressDet = tempAddressDet;
					}
					else{
						NewAddressDet = (AccountModBO.Address)businessObject.getInstance("Address");
					}
					/************************ SwiftAddress start tracker : 132659 ***************************************/
					if(null!=NewAddressDet.getAddressCategory() && NewAddressDet.getAddressCategory().equalsIgnoreCase("Swift")){
						swiftFlag = false;
						//NewAddressDet = addSwiftAddressMod(NewAddressDet,req,SwiftData,fullName);
						/* Changes for the TrackerId:273053 Starts */
						addSwiftAddress(null,NewAddressDet,req,SwiftData,fullName,editFlag);
						/* Changes for the TrackerId:273053 ends */
					}else{
					/************************ SwiftAddress End tracker : 132659 ***************************************/
					if( j<addrTypeSize&&
							is_valid_req_arg(((StringBuffer)lstAddressType.get(j)).toString())) {
						NewAddressDet.setAddressCategory((((StringBuffer)lstAddressType.get(j)).toString()).trim());
					}else{
						NewAddressDet.setAddressCategory(null);
					}
					if( j<countrySize &&
							is_valid_req_arg(((StringBuffer)lstcountry.get(j)).toString())) {
						NewAddressDet.setCountry((((StringBuffer)lstcountry.get(j)).toString()).trim());
					}else{
						NewAddressDet.setCountry(null);
					}
					if( j<citySize &&
							is_valid_req_arg(((StringBuffer)lstcity.get(j)).toString())) {
						NewAddressDet.setCity((((StringBuffer)lstcity.get(j)).toString()).trim());
					}else{
						NewAddressDet.setCity(null);
					}
					if( j<stateSize &&
							is_valid_req_arg(((StringBuffer)lststate.get(j)).toString())) {
						NewAddressDet.setState((((StringBuffer)lststate.get(j)).toString()).trim());
					}else{
						NewAddressDet.setState(null);
					}
					if( j<zipSize &&
							is_valid_req_arg(((StringBuffer)lstZip.get(j)).toString())) {
						NewAddressDet.setZip((((StringBuffer)lstZip.get(j)).toString()).trim());
					}else{
						NewAddressDet.setZip(null);
					}
					if( j<houseNoSize &&
							is_valid_req_arg(((StringBuffer)lsthouseNo.get(j)).toString())) {
						NewAddressDet.setHouse_no((((StringBuffer)lsthouseNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHouse_no(null);
					}
					if( j<premiseNoSize &&
							is_valid_req_arg(((StringBuffer)lstpremiseNo.get(j)).toString())) {
						NewAddressDet.setPremise_name((((StringBuffer)lstpremiseNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setPremise_name(null);
					}
					if( j<buildingSize &&
							is_valid_req_arg(((StringBuffer)lstbuilding.get(j)).toString())) {
						NewAddressDet.setBuilding_level((((StringBuffer)lstbuilding.get(j)).toString()).trim());
					}else{
						NewAddressDet.setBuilding_level(null);
					}
					if( j<streetNoSize &&
							is_valid_req_arg(((StringBuffer)lststreetNo.get(j)).toString())) {
						NewAddressDet.setStreet_no((((StringBuffer)lststreetNo.get(j)).toString()).trim());
					}else{
						NewAddressDet.setStreet_no(null);
					}
					if( j<townSize &&
							is_valid_req_arg(((StringBuffer)lsttown.get(j)).toString())) {
						NewAddressDet.setTown((((StringBuffer)lsttown.get(j)).toString()).trim());
					}else{
						NewAddressDet.setTown(null);
					}
					if( j<localitySize &&
							is_valid_req_arg(((StringBuffer)lstlocality.get(j)).toString())) {
						NewAddressDet.setLocality_name((((StringBuffer)lstlocality.get(j)).toString()).trim());
					}else{
						NewAddressDet.setLocality_name(null);
					}
					if( j<domicileSize &&
							is_valid_req_arg(((StringBuffer)lstdomicile.get(j)).toString())) {
						NewAddressDet.setDomicile((((StringBuffer)lstdomicile.get(j)).toString()).trim());
					}else{
						NewAddressDet.setDomicile(null);
					}
					if( j<suburbSize &&
							is_valid_req_arg(((StringBuffer)lstsuburb.get(j)).toString())) {
						NewAddressDet.setSuburb((((StringBuffer)lstsuburb.get(j)).toString()).trim());
					}else{
						NewAddressDet.setSuburb(null);
					}
					if( j<streetNameSize &&
							is_valid_req_arg(((StringBuffer)lststreetName.get(j)).toString())) {
						NewAddressDet.setStreet_name((((StringBuffer)lststreetName.get(j)).toString()).trim());
					}else{
						NewAddressDet.setStreet_name(null);
					}
					if( j<addrProofSize &&
							is_valid_req_arg(((StringBuffer)lstIsAddressProofRcvd.get(j)).toString())) {
						NewAddressDet.setIsAddressProofRcvd((((StringBuffer)lstIsAddressProofRcvd.get(j)).toString()).trim());
					}else{
						NewAddressDet.setIsAddressProofRcvd(null);
					}
					/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x begin*/
					setIsAddrVerFlagVal(req,null,NewAddressDet,j);
					/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x end*/
					if( j<mailstopSize &&
							is_valid_req_arg(((StringBuffer)lstmailstop.get(j)).toString())) {
						NewAddressDet.setMailStop((((StringBuffer)lstmailstop.get(j)).toString()).trim());
					}else{
						NewAddressDet.setMailStop(null);
					}
					if( j<websiteSize &&
							is_valid_req_arg(((StringBuffer)lstwebsite.get(j)).toString())) {
						NewAddressDet.setURL((((StringBuffer)lstwebsite.get(j)).toString()).trim());
					}else{
						NewAddressDet.setURL(null);
					}



					if( j<upDtFlagSize &&
							is_valid_req_arg(((StringBuffer)lstUpdateDateFlag.get(j)).toString())) {

						String flagvalue =(((StringBuffer)lstUpdateDateFlag.get(j)).toString());
						if(flagvalue!=null)
						if(flagvalue.equals("Y"))
						{
							Date lastupdatedate= new Date();
							NewAddressDet.setLastUpdate_Date(lastupdatedate);
						}
					}
					//Tracker:90196: Changes for Attribute Masking
					if(NewAddressDet.getHouse_no() != null)
					{
						if(mailingIndex == j)
						{
							strHouse_No = NewAddressDet.getHouse_no();
						}
					}
					if(NewAddressDet.getBuilding_level() != null)
					{
						if(mailingIndex == j)
						{
							strBuilding_Level = NewAddressDet.getBuilding_level();
						}
					}
					if(NewAddressDet.getStreet_no() != null)
					{
						if(mailingIndex == j)
						{
							strStreet_No = NewAddressDet.getStreet_no();
						}
					}
					if(NewAddressDet.getStreet_name() != null)
					{
						if(mailingIndex == j)
						{
							strStreet_Name = NewAddressDet.getStreet_name();
						}
					}
					if(NewAddressDet.getSuburb() != null)
					{
						if(mailingIndex == j)
						{
							strSuburb = NewAddressDet.getSuburb();
						}
					}
					if(NewAddressDet.getLocality_name() != null)
					{
						if(mailingIndex == j)
						{
							strLocality_Name = NewAddressDet.getLocality_name();
						}
					}
					if(NewAddressDet.getTown() != null)
					{
						if(mailingIndex == j)
						{
							strTown = NewAddressDet.getTown();
						}
					}
					if(NewAddressDet.getMailStop() != null)
					{
						if(mailingIndex == j)
						{
							strMail_Stop = NewAddressDet.getMailStop();
						}
					}

					//Tracker:90196:End of Changes for Attribute Masking

					/* AdressLine changes: START */
					if(mailingIndex == j)
					{
						Addr1=strHouse_No.trim()+strBuilding_Level.trim()+strStreet_No+strStreet_Name.trim();
						Addr2=strSuburb.trim();
						Addr3=strLocality_Name.trim()+strMail_Stop.trim()+strTown.trim();
					}
					//Changes for Ticket 362425/Axis ticket 374862
					preferredFormat = req.getParameter("PreferredFormat");
					if(preferredFormat != null && !(((StringBuffer)lstpreferredFormat.get(j)).toString()).trim().equals("STRUCTURED_FORMAT")){
						/*Tracker 159095 :  Sonali begin of changes*/
						strAL_Addr1 =  req.getParameter("AddressLine1");
						strAL_Addr2 =  req.getParameter("AddressLine2");
						strAL_Addr3 =  req.getParameter("AddressLine3");
							List	lstAddress1 = Utils.parseString(strAL_Addr1,'%');
							List	lstAddress2 = Utils.parseString(strAL_Addr2,'%');
							List	lstAddress3 = Utils.parseString(strAL_Addr3,'%');
						/*Tracker 159095 : Sonali end of changes*/
						/* Changes for Tracker #303252 Start*/
						ValidateFreeTextAddress(lstAddress1, lstAddress2, lstAddress3, j, lstAddressLine1, lstAddressLine2,lstAddressLine3, NewAddressDet );



								//Changes for 260508 starts
								/*if(null !=lstAddress1 && j<lstAddress1.size()) {
								NewAddressDet.setAddress_Line1((((StringBuffer)lstAddress1.get(j)).toString()).trim());
								}else{
								NewAddressDet.setAddress_Line1(null);
								}
								if(null !=lstAddress2 && j<lstAddress2.size()) {
									NewAddressDet.setAddress_Line2((((StringBuffer)lstAddress2.get(j)).toString()).trim());
								}else{
									NewAddressDet.setAddress_Line2(null);
								}
								if(null !=lstAddress3 && j<lstAddress3.size()) {
									NewAddressDet.setAddress_Line3((((StringBuffer)lstAddress3.get(j)).toString()).trim());
								}else{
									NewAddressDet.setAddress_Line3(null);
								}*/
						/* Changes for Tracker #303252 End*/

                     // ticket 282118

					}
					/* AdressLine changes: END */

					strAL_Addr1="";
					strAL_Addr2="";
					strAL_Addr3="";
					/* CIF Changes for Address Line Fields : End */

					NewAddressDet.setCore_cust_id(coreCustId);

					/*Changes by Ramsurendar S. BEGIN*/
					//NewAddressDet.setSalutation_code(sSalutation_code);
					//if(sSalutation.length() > 5)
					//NewAddressDet.setSalutation_code(((sSalutation).substring(1,5)));
					//NewAddressDet.setSalutation_code((sSalutation));
					/*Changes by Ramsurendar S. END*/

					/*
					 *	Core Fields Inclusion - End
					 */
					 //Changes for tracker id :253845- Start
					 setHouseholdAddrfields(req,NewAddressDet,j,sc);
					
					/* CIF PhoneEmail Changes : Start */
					if( j<addrTypeSize && preferredAddress !=null && !preferredAddress.equalsIgnoreCase("undefined"))
					{
//						NewAddressDet.setPreferredAddress(preferredAddress.trim());
						String addresstype = (String)lstAddressType.get(j).toString().trim();
						if(addresstype!=null)
						if(addresstype.equalsIgnoreCase(preferredAddress))
						{
							NewAddressDet.setPreferredAddress("Y");
						}
						else
						{
							NewAddressDet.setPreferredAddress("N");
						}
					}
					else
					{
						NewAddressDet.setPreferredAddress(null);
					}
					if( j<prefFormatSize &&
							is_valid_req_arg(((StringBuffer)lstpreferredFormat.get(j)).toString())) {
						NewAddressDet.setPreferredFormat((((StringBuffer)lstpreferredFormat.get(j)).toString()).trim());
					}else{
						NewAddressDet.setPreferredFormat(null);
					}
					if( j<holdMailSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailReason.get(j)).toString())) {
						NewAddressDet.setHoldMailReason((((StringBuffer)lstholdMailReason.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailReason(null);
					}
					if( j<bizcenterSize &&
							is_valid_req_arg(((StringBuffer)lstbusinessCenter.get(j)).toString())) {
						NewAddressDet.setBusinessCenter((((StringBuffer)lstbusinessCenter.get(j)).toString()).trim());
					}else{
						NewAddressDet.setBusinessCenter(null);
					}
					if( j<holdMailInitSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailInitiatedBy.get(j)).toString())) {
						NewAddressDet.setHoldMailInitiatedBy((((StringBuffer)lstholdMailInitiatedBy.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailInitiatedBy(null);
					}
					if( j<holdMailFlagSize &&
							is_valid_req_arg(((StringBuffer)lstholdMailFlag.get(j)).toString())) {
						NewAddressDet.setHoldMailFlag((((StringBuffer)lstholdMailFlag.get(j)).toString()).trim());
					}else{
						NewAddressDet.setHoldMailFlag(null);
					}
					if( j<freeTxtLabelSize &&
							is_valid_req_arg(((StringBuffer)lstfreeTextLabel.get(j)).toString())) {
						NewAddressDet.setFreeTextLabel((((StringBuffer)lstfreeTextLabel.get(j)).toString()).trim());
					}else{
						NewAddressDet.setFreeTextLabel(null);
					}
					/* CIF PhoneEmail Changes : End*/

					if( j<strtDateSize &&
							is_valid_req_arg(((StringBuffer)lststartDate.get(j)).toString())) {
						String StartDate1 = (((StringBuffer)lststartDate.get(j)).toString().trim());

						java.util.Date tmpDate_cif = null;
						Calendar cal_cif = Calendar.getInstance();
						//long milliSec;
						// ME TimeZone Changes : Start
						//int deltaTime_cif = sc.getClientTimeDiff();
						java.util.Date newTmpDate_cif = null;
						SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
						if((StartDate1!=null)&&(!StartDate1.equalsIgnoreCase(""))&&(!StartDate1.equalsIgnoreCase(" "))){
							cal_cif.setTime((Date)srfm.stringToDate(StartDate1));
							tmpDate_cif = cal_cif.getTime();
							/*milliSec = tmpDate_cif.getTime();
							 milliSec -= deltaTime_cif * 1000 * 60;*/
					//milliSec = (SRMDate.getGMT(tmpDate_cif)).getTime();
							// ME TimeZone Changes : End
					milliSec = tmpDate_cif.getTime();
							milliSec +=(12*60*60*1000);
							newTmpDate_cif = new java.util.Date(milliSec);
							/*tracker id 159807 changes starts*/
							NewAddressDet.setStart_Date(tmpDate_cif);
						   /*tracker id 159807 changes ends*/
						}else{
							NewAddressDet.setStart_Date(null);
						}
					}else{
						NewAddressDet.setStart_Date(null);
					}
//Changes for ticket :366882  start
					if( j<endDateSize &&
							is_valid_req_arg(((StringBuffer)lstendDate.get(j)).toString().trim()))
					{
//Changes for ticket :366882  end
						String endDate1 = (((StringBuffer)lstendDate.get(j)).toString());
						if(endDate1!=(null)){
							if (!endDate1.trim().equals("")){
								java.util.Date tmpDate_cif = null;
								Calendar cal_cif = Calendar.getInstance();
								//long milliSec;

								// ME TimeZone Changes : Start
								//int deltaTime_cif = sc.getClientTimeDiff();
								java.util.Date newTmpDate_cif = null;

								SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
								cal_cif.setTime((Date)srfm.stringToDate(endDate1));
								tmpDate_cif = cal_cif.getTime();
								milliSec = tmpDate_cif.getTime();
								// Fix for ticket 204571 and tracker 122535 starts
								 /*milliSec -= deltaTime_cif * 1000 * 60;*/
								//milliSec = (SRMDate.getGMT(tmpDate_cif)).getTime();
								// ME TimeZone Changes : End
								milliSec +=(12*60*60*1000);
								newTmpDate_cif = new java.util.Date(milliSec);
								// Fix for ticket 204571 and tracker 122535 ends
	                            /*tracker id 159807 changes starts*/
                               NewAddressDet.setEnd_Date(tmpDate_cif);
							  /*tracker id 159807 changes ends*/

							}
						}

					}else{
						java.util.Date tmpDate_cif = null;
						Calendar cal_cif = Calendar.getInstance();
						SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
						//long milliSec;

						//int deltaTime_cif = sc.getClientTimeDiff();
						java.util.Date newTmpDate_cif = null;
						/*Fix for Tracker #: SIDDHARTH Starts*/
						/*
						 String localeType = null;
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

						 */
						/* Created a Date object of date "31/12/2099" in GMT format as per core requirement.
						 This date is not converted basedon locale amd will be saved inGMT format in database.*/

						//SimpleDateFormat smplDF = new SimpleDateFormat("dd/MM/yyyy");
						Date hdCodedEndDate = null;
						//try {
							//hdCodedEndDate = smplDF.parse("31/12/2099");
							hdCodedEndDate=srfm.getStdUpperDate();
						//} catch (java.text.ParseException e ) {
						//	throw new FCRMGenericException("MSGEXC0200",new Exception("Error During creation of Date Object"));
						//}
						cal_cif.setTime(hdCodedEndDate);
						tmpDate_cif = cal_cif.getTime();
						milliSec = tmpDate_cif.getTime();
						newTmpDate_cif = new java.util.Date(milliSec);
						/*tracker id 159807 changes starts*/
						NewAddressDet.setEnd_Date(tmpDate_cif);
						/*tracker id 159807 changes ends*/
					}
					/**** CIF changes:Saving name in Address:Start*************/
					//NewAddressDet.setName(fullName.trim());
					/**** CIF changes:Saving name in Address:End*************/
				}
					if(!found){
						address.add(NewAddressDet);
					}
				}
				/************************ SwiftAddress start tracker : 132659 ***************************************/
				//Recon for 699689 starts
				if(swiftFlag && !(null != isCopy && isCopy.equalsIgnoreCase("y"))  && !(convToCust.equalsIgnoreCase("Y"))){ // 690990 TOL changes
					//Recon for 699689 ends
					AccountModBO.Address NewSwiftAddress= (AccountModBO.Address)businessObject.getInstance("Address");
					//NewSwiftAddress = addSwiftAddressMod(NewSwiftAddress,req,SwiftData,fullName);
					/* Changes for the TrackerId:273053 Starts */
					addSwiftAddress(null,NewSwiftAddress,req,SwiftData,fullName,editFlag);
					/* Changes for the TrackerId:273053 ends */
					address.add(NewSwiftAddress);
				}
				/************************ SwiftAddress End tracker : 132659 ***************************************/
				/* CIF PhoneEmail Changes : Start AccountModBo*/
				SRMCollection phoneEmail = businessObject.getPhoneEmail();
				ArrayList AvailablePhone_Email =  new ArrayList();
				if(editFlag){
					for(int iCount=0; iCount < phoneEmail.size(); iCount++) {
						AvailablePhone_Email.add(((AccountModBO.PhoneEmail)phoneEmail.get(iCount)).getMainTableID().toString());
					}
				}
				else{
					for(int iCount=0; iCount < phoneEmail.size(); iCount++) {
						AvailablePhone_Email.add(((AccountModBO.PhoneEmail)phoneEmail.get(iCount)).getPhoneEmailID().toString());
					}
				}
				for(int j =0;j < phEmailTypeSize;j++)// the list of all Phone/Email from the view
				{
					AccountModBO.PhoneEmail NewPhoneEmailDet = null;
					boolean found = false;
					String tempPhoneEmailID = null;
					if(isCopy!=null)
					if(!isCopy.equalsIgnoreCase("Y"))
						tempPhoneEmailID = lstPhoneEmailID.get(j).toString().trim();
					AccountModBO.PhoneEmail tempPhoneEmailDet = null;
					for(int n =0; n<phoneEmail.size();n++){// for all existing list of Phone/Email
						if(tempPhoneEmailID == null || tempPhoneEmailID.equals("null") || tempPhoneEmailID.equals("")){
							found = false;
							break;
						}
						tempPhoneEmailDet = (AccountModBO.PhoneEmail)phoneEmail.get(n);


						if(editFlag){
							if(tempPhoneEmailDet.getMainTableID()!= null){
								if(((tempPhoneEmailDet.getMainTableID()).toString()).equals(tempPhoneEmailID.toString())){
									found = true;
									break;
								}
							}
						}
						else{
							if(tempPhoneEmailDet.getPhoneEmailID()!= null){
								if(((tempPhoneEmailDet.getPhoneEmailID()).toString()).equals(tempPhoneEmailID.toString())){
									found = true;
									break;
								}
							}
						}
						continue;
					}
					if(found){
						NewPhoneEmailDet = tempPhoneEmailDet;
					}
					else{
						NewPhoneEmailDet = (AccountModBO.PhoneEmail)businessObject.getInstance("PhoneEmail");
					}
					//Changes for tracker 230989 starts
					if( j<phEmailTypeSize && ((preferredPhone !=null && !preferredPhone.equalsIgnoreCase("undefined")) || (preferredEmail !=null && !preferredEmail.equalsIgnoreCase("undefined"))))
					{
					//Changes for tracker 230989 ends
						String currPhoneEmailType = (String)lstPhoneEmailType.get(j).toString().trim();
					  //Recon Changes for callid 733030 starts
						if (((StringBuffer)lstPhoneorEmail.get(j)).toString().equalsIgnoreCase("Phone"))
						{
							if((currPhoneEmailType!=null) && (currPhoneEmailType.equalsIgnoreCase(preferredPhone)))
								NewPhoneEmailDet.setPreferredFlag("Y");
							else
								NewPhoneEmailDet.setPreferredFlag("N");
						}
						else
						{
						 if((currPhoneEmailType!=null) && (currPhoneEmailType.equalsIgnoreCase(preferredEmail)) )	
							NewPhoneEmailDet.setPreferredFlag("Y");
						 else
							NewPhoneEmailDet.setPreferredFlag("N");
						}
					//Recon Changes for callid 733030 ends
					}
					else
					{
						NewPhoneEmailDet.setPreferredFlag(null);
					}

					if( j<phEmailTypeSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneEmailType.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneEmailType((((StringBuffer)lstPhoneEmailType.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneEmailType(null);
					}

					if( j<phoneSize &&
							is_valid_req_arg(((StringBuffer)lstPhone.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNo((((StringBuffer)lstPhone.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNo(null);
					}

					if( j<phorEmailSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneorEmail.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneOrEmail(((StringBuffer)lstPhoneorEmail.get(j)).toString().trim());
//						NewPhoneEmailDet.setPhoneOrEmail("P");
					}else{
						NewPhoneEmailDet.setPhoneOrEmail(null);
					}

					if( j<eMailSize &&
							is_valid_req_arg(((StringBuffer)lsteMail.get(j)).toString())) {
						NewPhoneEmailDet.setEmail((((StringBuffer)lsteMail.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setEmail(null);
					}
					if( j<phnCntrySize &&
							is_valid_req_arg(((StringBuffer)lstPhoneCountryCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoCountryCode((((StringBuffer)lstPhoneCountryCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoCountryCode(null);
					}
					/*413659*/
					// Changes for Call id: 644068 starts
					if( j<USERFIELD1Size &&
						is_valid_req_arg(((StringBuffer)lstUSERFIELD1.get(j)).toString())) {
						NewPhoneEmailDet.setUSERFIELD1((((StringBuffer)lstUSERFIELD1.get(j)).toString()).trim());
					// Changes for Call id: 644068 ends
					}else{
						NewPhoneEmailDet.setUSERFIELD1(null);
					}
					if( j<phnCitySize &&
							is_valid_req_arg(((StringBuffer)lstPhoneCityCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoCityCode((((StringBuffer)lstPhoneCityCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoCityCode(null);
					}
					if( j<phnLocalSize &&
							is_valid_req_arg(((StringBuffer)lstPhoneLocalCode.get(j)).toString())) {
						NewPhoneEmailDet.setPhoneNoLocalCode((((StringBuffer)lstPhoneLocalCode.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setPhoneNoLocalCode(null);
					}
					if( j<extnSize &&
							is_valid_req_arg(((StringBuffer)lstextension.get(j)).toString())) {
						NewPhoneEmailDet.setWorkExtension((((StringBuffer)lstextension.get(j)).toString()).trim());
					}else{
						NewPhoneEmailDet.setWorkExtension(null);
					}
					/*recon tracker id 144966 Ticket 348922 changes starts*/
					NewPhoneEmailDet=AccModHelper.setMethods(NewPhoneEmailDet,req,j);
					/*recon tracker id 144966 Ticket 348922 changes ends*/
					if(!found){
						phoneEmail.add(NewPhoneEmailDet);
					}
				}

				/* CIF PhoneEmail Changes : End */

				if(lstadrRemoved != null) {
					for(int iCnt=0; iCnt < adrRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstadrRemoved.get(iCnt));
						int index = AvailableAddress.indexOf(sdelAsset);
						if(index != -1) {
							AccountModBO.Address delAsset = (AccountModBO.Address)address.get(index);
							if(editFlag){
								if(delAsset.getMainTableID() != new Integer(lstadrRemoved.get(iCnt).toString())){
									address.remove(index);
									AvailableAddress.remove(index);
								}
							}else{
								if(delAsset.getAddressID() != new Integer(lstadrRemoved.get(iCnt).toString())){
									address.remove(index);
									AvailableAddress.remove(index);
								}
							}
						}
					}
				}

				/* CIF PhoneEmail Changes : Start AccountModBo*/ // Code For deleting Phone/Email

				if(lstPhoneEmailRemoved != null) {
					for(int iCnt=0; iCnt < phnEmailRemSize; iCnt++){
						String sdelAsset = new String((StringBuffer)lstPhoneEmailRemoved.get(iCnt));
						int index = AvailablePhone_Email.indexOf(sdelAsset);
						if(index != -1) {
							AccountModBO.PhoneEmail delAsset = (AccountModBO.PhoneEmail)phoneEmail.get(index);
							if(editFlag){
								if(delAsset.getMainTableID() != new Integer(lstPhoneEmailRemoved.get(iCnt).toString())){

									phoneEmail.remove(index);
									AvailablePhone_Email.remove(index);
								}
							}
							else{
								if(delAsset.getPhoneEmailID() != new Integer(lstPhoneEmailRemoved.get(iCnt).toString())){

									phoneEmail.remove(index);
									AvailablePhone_Email.remove(index);
								}
							}
						}
					}
				}

				/* CIF PhoneEmail Changes : End*/


			}

			/****************************/
			//CIF ADDRESS SAVING -end
			/****************************/
			/*************Address cleanup::End**************************************/
			else{
				ArrayList avilableAddrCats = new ArrayList();
				//SRMCollection address = businessObject.getAddress();
				for (int i = 0; i < addressSize; i++){
					avilableAddrCats.add(((AccountModBO.Address)address.get(i)).getAddressCategory());
				}

				SRMQueryResult qrAddr=CommonQueries.getCategories(bc,"ORG_ADDRESS_TYPE");
				SRMRecordSet  rs = qrAddr.getRecordSet();

				while(rs.hasNext()) {

					//SSV changes code too large
					setAddressFields(req,businessObject,rs,boName,tmpDate,avilableAddrCats,address);
					//SSV changes code too large

					/*// assuming the first item in the result set is category value
					// second item in category id
					String addrCat = ((List)rs.getNext()).get(0).toString();
					boolean allFieldsEmpty = false;
					String addr1 = req.getParameter(addrCat + ".txt_Address1");
					String addr2 = req.getParameter(addrCat + ".txt_Address2");
					String addr3 = req.getParameter(addrCat + ".txt_Address3");
					String city = req.getParameter(addrCat + ".txt_City");
					String country = req.getParameter(addrCat + ".txt_Country");
					String mailStop = req.getParameter(addrCat + ".txt_MailStop");
					String state = req.getParameter(addrCat + ".txt_State");
					String zip = req.getParameter(addrCat + ".txt_Zip");

					String userField1 = req.getParameter(addrCat + ".txt_userField1");
					String userField2 = req.getParameter(addrCat + ".txt_userField2");
					String userField3 = req.getParameter(addrCat + ".txt_userField3");
					String userField4 = req.getParameter(addrCat + ".txt_userField4");
					String residentialStatus = req.getParameter(addrCat + ".txt_residentialStatus");

					SRMTypedAttrStringized userDateField1 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField1");
					SRMTypedAttrStringized userDateField2 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField2");


					SRMTypedAttrStringized startDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_Start_Date");
					SRMTypedAttrStringized endDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_End_Date");

					Calendar cal1 = Calendar.getInstance();
					java.util.Date tmpDate1 = null;
					java.util.Date newTmpDate1 = null;

					if( (addr1 == null || addr1.trim().equals("")) &&
							(addr2 == null || addr2.trim().equals("")) &&
							(addr3 == null || addr3.trim().equals("")) &&
							(city == null || city.trim().equals("")) &&
							(country == null || country.trim().equals("")) &&
							(mailStop == null || mailStop.trim().equals("")) &&
							(state == null || state.trim().equals("")) &&
							(zip == null || zip.trim().equals("")) &&
							(userField1 == null || userField1.trim().equals("")) &&
							(userField2 == null || userField2.trim().equals("")) &&
							(userField3 == null || userField3.trim().equals("")) &&
							(userField4 == null || userField4.trim().equals("")) &&
							(residentialStatus == null || residentialStatus.trim().equals("")) &&
							(startDate == null || startDate.getValue().equalsIgnoreCase("")) &&
							(endDate == null || endDate.getValue().equalsIgnoreCase(""))  &&
							(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase("")) &&
							(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))) {
						allFieldsEmpty = true;
					}

					int index = avilableAddrCats.indexOf(addrCat);
					if(index != -1) { // address exists, update it
						if(allFieldsEmpty) { // remove the address from the db;
							address.remove(index);
							avilableAddrCats.remove(index);
						} else { // update the existing address

							AccountModBO.Address tempAddr = (AccountModBO.Address)address.get(index);
							tempAddr.setAddress_Line1(addr1);
							tempAddr.setAddress_Line2(addr2);
							tempAddr.setAddress_Line3(addr3);
							tempAddr.setCity(city);
							tempAddr.setCountry(country);
							tempAddr.setMailStop(mailStop);
							tempAddr.setState(state);
							tempAddr.setZip(zip.trim());
							tempAddr.setUserField1(userField1);
							tempAddr.setUserField2(userField2);
							tempAddr.setUserField3(userField3);
							tempAddr.setUserField4(userField4);
							tempAddr.setResidentialStatus(residentialStatus);

							if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
							/*tracker id 159807 changes starts*/
							/*	tmpDate1 = null;
							}

							tempAddr.setStart_Date(tmpDate1);
						   /*tracker id 159807 changes ends*/


						/*	if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
							/*tracker id 159807 changes starts*/
							/*	tmpDate1 = null;
							}
							tempAddr.setEnd_Date(tmpDate1);
							/*tracker id 159807 changes ends*/


							/*if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField1(newTmpDate1);

							if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField2(newTmpDate1);

							if (tempAddr.isExtensible()){
								tempAddr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
							}
						}
					} else if( !allFieldsEmpty) { // create the new address
						AccountModBO.Address addr = (AccountModBO.Address)businessObject.getInstance("Address");
						addr.setAddress_Line1(addr1);
						addr.setAddress_Line2(addr2);
						addr.setAddress_Line3(addr3);
						addr.setCity(city);
						addr.setCountry(country);
						addr.setAddressCategory(addrCat);
						addr.setMailStop(mailStop);
						addr.setState(state);
						addr.setZip(zip.trim());
						addr.setUserField1(userField1);
						addr.setUserField2(userField2);
						addr.setUserField3(userField3);
						addr.setUserField4(userField4);
						addr.setResidentialStatus(residentialStatus);

						if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
							tmpDate = cal1.getTime();
							milliSec = tmpDate.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
						 /*tracker id 159807 changes starts*/
						/*	tmpDate = null;
						}

						addr.setStart_Date(tmpDate);
					   /*tracker id 159807 changes ends*/

						/*if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
						/*tracker id 159807 changes starts*/
						/*	tmpDate1 = null;
						}
						addr.setEnd_Date(tmpDate1);
					   /*tracker id 159807 changes ends*/


						/*if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField1(newTmpDate1);

						if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField2(newTmpDate1);

						if (addr.isExtensible()){
							addr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
						}
						address.add(addr);
					}*/
				}
			}
			/***************** SAVING ADDRESS END ***********/

			/*added for extensibility
			 */
			if (businessObject.isExtensible()){
				businessObject.setExtendedAttribs(Utils.convertExtendValuesToObject(req,"AccountModBO"));
			}
			/*added for extensibility
			 */

			/****	******** DONT MOVE THE FOLLOWING CODE UP: START *****************/
			if((accountURL==null) || (accountURL.equals(""))|| isCopy.equalsIgnoreCase("Y"))
			{
				//Key Generation changes
				//changes made for the tracker id :253845
				if(acctKey!=null && !convToCust.equalsIgnoreCase("Y")){
					/*if(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true")) {
					 if(!keyPrefix.equals("")){
						 if(AccountIDGen.isPrefixRegistered(bc, keyPrefix)) {
						 acctKey = AccountIDGen.getAnother(bc, keyPrefix,bPopPref);
						 } else {
						 acctKey = AccountIDGen.createNew(bc, keyPrefix, (new Integer(srmf.stringToInt(initCounter)).intValue()),bPopPref);
						 }
					 }
					 else if(!codeNNTM.equals("")){
						 acctKey = cifId;
					 }
					 }*/

					//key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid); //Changes for tracker id: 338439
					acctKey = (String)key.get("entityKey");
					/*TRACKER ID 121240 CHANGES BEGIN FOR TICKET ID 202399*/
					//coreCustId will be retreived using methods of AccountIDGen class.
					//That will be set in business object
					//coreCustId = (String)key.get("coreCustId");
					/*TRACKER ID 121240 CHANGES END FOR TICKET ID 202399*/
				businessObject.setCore_cust_id(coreCustId);
					execute = true;
				}
			}
			//End
			//changes made for the tracker id :253845
			if((isAutoGenKey == null || !isAutoGenKey.trim().equalsIgnoreCase("true")) && !convToCust.equalsIgnoreCase("Y") && (!execute)) {
				if ( acctKey != null && !acctKey.equals(businessObject.getAccountKey()) ) {
					//Changes for checking the CIF IDs for all the entities
					//Key Generation changes
					/*boolean keyexists=Utils.checkExistingCIFID(bc,acctKey);

					 if (keyexists) {
					 throw new SRMBCException(
					 SRMBCException.ACCOUNT_KEY_ALREADY_EXISTS,
					 SRMBCException.MakeReplaceableArg(acctKey),
					 null
					 );
					 }
					 else{*/
					//key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);	//Changes for tracker id: 338439
					acctKey = (String)key.get("entityKey");

						coreCustId = (String)key.get("coreCustId");
						businessObject.setCore_cust_id(coreCustId);
					businessObject.setAccountKey (acctKey);
					//CRM61LR:TRACKER:44575:BEGINOFCHANGES
					//   businessObject.setGroupID (groupId);
					//CRM61LR:TRACKER:44575:BEGINOFCHANGES
					// }
					//End
				}
			} else {
				//Tracker 195897 changes
				if(acctKey==null){
				//key = Utils.saveCifIdMaster(bc,sc,flag,params,bPopPref,acctKey,"Retail","","",cifmasterid);	//Changes for tracker id: 338439
					acctKey = (String)key.get("entityKey");
					 }
				businessObject.setAccountKey (acctKey);
				//CRM61LR:TRACKER:44575:BEGINOFCHANGES
				//    businessObject.setGroupID (groupId);
				//CRM61LR:TRACKER:44575:BEGINOFCHANGES
			}

                        businessObject.setSsn(ssnID);
						businessObject.setPAN(panID);
						//Adhar changes for tracker 375136 starts
						businessObject.setUniqueIDNumber(UniqueIDNumber);
						//Adhar changes for tracker 375136 ends
						//197567
					    businessObject.setLicenseNo(dlID);
						businessObject.setPassportNo(pnID);
						// TRACKER ID: 113279 Begins
						businessObject.setIDTypeR1(IDTypeR1);
						businessObject.setIDTypeR2(IDTypeR2);
						businessObject.setIDTypeR3(IDTypeR3);
						businessObject.setIDTypeR4(IDTypeR4);
						businessObject.setIDTypeR5(IDTypeR5);
						businessObject.setOccupation(occupation);
                 /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
						//Changes for Alerts server recon in 10.2.14 starts
						businessObject.setEnable_Alerts(strEnable_Alerts);
						businessObject.setDefaultChannel_Alert(strDefaultChannel_Alert);
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
						//Changes for Alerts server recon in 10.2.14 ends
						// TRACKER ID: 113279 Ends

			//			IDENTIFICATION DOCUMENT CHANGES saving identtype in entity table end

						businessObject.setUniqueId(uniqueID);
			            businessObject.setUniqueIdType(uniqueIDType);
			             //ticket id: 452891 tracker 274262 recon for tracker id: 242083 changes start
						businessObject.setNat_id_card_num(sNat_id_card_num);
			            //ticket id: 452891 tracker 274262 recon for tracker id: 242083 changes ends

			/* Duplication of Demographic Value*/

            //businessObject.setUniqueId(uniqueID);
		    //businessObject.setUniqueIdType(uniqueIDType);
			/*Hashtable hTable = CommonMethodsForPsycoDemo.supplimentFill(req);

			businessObject.setPAN(RevertHashObj((String)hTable.get("PAN")));
			businessObject.setSsn(RevertHashObj((String)hTable.get("SSN")));
			businessObject.setLicenseNo(RevertHashObj((String)hTable.get("Licence")));
			businessObject.setPassportNo(RevertHashObj((String)hTable.get("Passport")));
			// Tracker 85215
			businessObject.setUniqueId(RevertHashObj((String)hTable.get("uniqueID")));
			businessObject.setNat_id_card_num(RevertHashObj((String)hTable.get("NationCard")));
			businessObject.setEducation(RevertHashObj((String)hTable.get("Qualification")));
			businessObject.setOccupation(RevertHashObj((String)hTable.get("Profession")));
			businessObject.setDesignation(RevertHashObj((String)hTable.get("Designation")));
			businessObject.setIndustry(RevertHashObj((String)hTable.get("Industry")));
			SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
			if ((String)hTable.get("PPIssueDate")!=null)
			{
				businessObject.setPsprt_issue_date((Date)srfm.stringToDate((String)hTable.get("PPIssueDate")));
			}
			if ((String)hTable.get("PPExpDate")!=null)
			{
				businessObject.setPsprt_exp_date((Date)srfm.stringToDate((String)hTable.get("PPExpDate")));

			}*/
			/************ DONT MOVE THE FOLLOWING CODE UP: END *****************/
			psprt_issue_exp_mod(req,businessObject,Psprt_issue_date,Psprt_exp_date);  //Changes for call id 422914


			businessObject.setIntroducerID(ctKeyIntro);

			/*  ERPBOCF1:TRACKER:113259:BEGINOFCHANGES(HIJRI) */
			/*   setting the value into BO  */
			//businessObject.setPreferredCalendar(strPreferredCalendar);
			/*  ERPBOCF1:TRACKER:113259:ENDOFCHANGES(HIJRI) */




			//Added by Seema starts
			/** Setting  PreferredPhoneType, PreferredEmailType, PreferredAddressType
			 PreferredPhoneNumber, PreferredEmail**/
			 //Changes for Tracker Id 273030 Begin
			 			 businessObject.setPreferredPhone(null);
			 		     businessObject.setPreferredEmail(null);
		     //Changes for Tracker Id 273030 end
			businessObject.setPreferredPhoneType(preferredPhone);
			businessObject.setPreferredEmailType(preferredEmail);
			businessObject.setDefaultAddressType(preferredAddress);
			if(lstPhoneEmailType!=null && lstPhone!=null && preferredPhone!=null)
			{
			// Changes for call id 419613 starts here
				//changes for the recon call 989529 starts
				String strPreferredPhoneNumber = Utils.getPreferredPhoneNumber(lstPhoneEmailType,lstPhone,preferredPhone);
				if(strPreferredPhoneNumber != null)
				{
				 businessObject.setPreferredPhone(strPreferredPhoneNumber.trim());
				}
				//changes for the recon call 989529 ends
			
			}// Changes for call id 419613 ends here
			//Changes for tracker id 260212 start
			//if(lstPhoneEmailType!=null && lsteMail!=null && preferredEmail!=null)
			//Changes for tracker id 260212 end
			// Changes for call id 419613 starts here
			if(lstPhoneEmailType!=null && lsteMail!=null && preferredEmail!=null)
			{
				//changes for the recon call 989529 starts
			  String strpreferredEmail=Utils.getPreferredEmail(lstPhoneEmailType,lsteMail,preferredEmail);
			  if(strpreferredEmail != null)
			  {
			   businessObject.setPreferredEmail(strpreferredEmail.trim());
			  }
						//changes for the recon call 989529 ends
			}// Changes for call id 419613 ends here
			//Changes for Tracker Id 273030  Begin
				setPreferredPhoneEmailType(businessObject);
			//Changes for Tracker Id 273030 end
			//Added by Seema Ends
                 /**** Alert server recon to 10.2.14 Start Tracker ID 378548 ****/
			//Changes for Alert Server recon in 10.2.14 starts
			if(strPreferred_Mbl_Alert != null && !strPreferred_Mbl_Alert.equals(""))
			{
				businessObject.setPreferred_Mobile_Alert_Type(strPreferred_Mbl_Alert);
			   /* Code added to get the value of Preferred Mobile Alert Number Which is present in the List
					   Box With The Help of the Method getPreferredPhoneNumber present in the com.infy.cis.ui.common utils class
					   by passing the Preferred Mobile  Alert  value By the Customer
			   */
				businessObject.setPreferred_Mobile_Alert_No(Utils.getPreferredPhoneNumber(lstPhoneEmailType,lstPhone,strPreferred_Mbl_Alert));
			}
	/**** Alert server recon to 10.2.14 End    Tracker ID 378548 ****/
			//Changes for Alert Server recon in 10.2.14 ends
			if(businessObject.getEntity_cre_flag()==null || businessObject.getEntity_cre_flag().equals("null"))
			{
				businessObject.setEntity_cre_flag("Y");
			}


         /*For setting entity create flag as Y in mod table while submitting from entity queue
			in approval disabled scenario*/


			if(!apprFlag && saveFlag==0 && operationType.equals("Queue"))
			{
				businessObject.setEntity_cre_flag("Y");
			}
			if(sDummy != null && sDummy.equals("Y") && (operationType!=null) && operationType.equals("Edit Entity"))
			{
				if(businessObject != null){
					if(saveFlag == 0){
						businessObject.setTabValidator(newTabs);
					}
				}
			}
			businessObject.setIsDummy("N");
			if(saveFlag == 0){
				businessObject.setLastSubmittedDate(currDate);
			}

			/*TrackerID: 113227 start of changes */
			if (altLocaleActv!=null && altLocaleActv.equalsIgnoreCase("true") )
			{
                  /* Changes Begin Tracker Id : 195897 */
				businessObject= (com.infy.cis.srmbo.AccountModBO)DualFieldSetter.invokeSetterMethods(boNameReq,businessObject,req);
                  /* Changes End Tracker Id : 195897 */
			}
			/*TrackerID: 113227 end of changes */




			//Key Generation changes
			if(cifIDChngd){
				if(DemoBO == null){
					DemoBO = (DemographicModBO)Utils.getBOFromID(bc,"DemographicModBO",DemographicModBO.ACCOUNTID,businessObject.getAccountID());
					if(DemoBO!=null){
						DemoBO.setOrgKey(acctKey);
					}
				}else {
					DemoBO.setOrgKey(acctKey);
				}
				if(PsychoBO == null){
					PsychoBO = (PsychographicModBO)Utils.getBOFromID(bc,"PsychographicModBO",PsychographicModBO.ACCOUNTID,businessObject.getAccountID());
					if(PsychoBO!=null){
						SRMCollection campdepend = PsychoBO.getCampaignDependency();
						PsychographicModBO.CampaignDependency cmpdep = null;
						int campCnt = campdepend.size();

						for(int i = 0;i < campCnt ; i++) {
							cmpdep =
								(PsychographicModBO.CampaignDependency)campdepend.get(i);
							String freq =cmpdep.getContactFrequency();
							cmpdep.setContactFrequency(freq);
						}
						SRMCollection interests = (SRMCollection)PsychoBO.getInterests();
						PsychographicModBO.Interests interestObj = null;
						int noOfInterests = interests.size();
						for(int i = 0;i < noOfInterests ; i++) {
							interestObj =
								(PsychographicModBO.Interests)interests.get(i);
							String intr =interestObj.getInterest();
							interestObj.setInterest(intr);
						}
						SRMCollection  cAsset = PsychoBO.getMiscellaneousInfo();
						PsychographicModBO.MiscellaneousInfo misc = null;
						int noOfmisc = cAsset.size();
						for(int i = 0;i < noOfmisc ; i++) {
							misc =
								(PsychographicModBO.MiscellaneousInfo)cAsset.get(i);
							String str =misc.getStrText1();
							misc.setStrText1(str);
						}
						SRMCollection  productPref = PsychoBO.getProductPref();
						PsychographicModBO.ProductPref prdtpref = null;
						int noOfprod = productPref.size();
						for(int i = 0;i < noOfprod ; i++) {
							prdtpref =
								(PsychographicModBO.ProductPref)productPref.get(i);
							String type =prdtpref.getInterestType();
							prdtpref.setInterestType(type);
						}

						SRMCollection  creditBeur = PsychoBO.getCreditBureauPref();
						PsychographicModBO.CreditBureauPref crdtpref = null;
						int noOfcrdt = creditBeur.size();
						for(int i = 0;i < noOfcrdt ; i++) {
							crdtpref =
								(PsychographicModBO.CreditBureauPref)creditBeur.get(i);
							Integer str =crdtpref.getSeq_of_pref();
							crdtpref.setSeq_of_pref(str);
						}
						PsychoBO.setOrgKey(acctKey);
					}
				}else {
					PsychoBO.setOrgKey(acctKey);
				}

			}
			//End
				/*  TrackerID 113227 changes for Lookup START  */
                  /* Changes Begin Tracker Id : 195897 */
				businessObject= (com.infy.cis.srmbo.AccountModBO)DualFieldSetter.invokeSetterMethods(boNameReq,businessObject,req);
                  /* Changes End Tracker Id : 195897 */
				/*  TrackerID 113227 changes for Lookup END  */
				//365731 changes starts
				//changes for Ticket 718904 begin
				if(convToCust!=null && convToCust.equals("Y")){
						if(oldEntityType!=null){
							if(oldEntityType.equals("Prospect")){
								businessObject.setReqOrigin("CreateAccountFromSuspect");

								}
							else if(oldEntityType.equals("Contact")){
								businessObject.setReqOrigin("CreateAccountFromContact");

							}
							else if(oldEntityType.equals("NonCustomer")){
								businessObject.setReqOrigin("CreateAccountFromNonCustomer");
							}
						}

					}
					else{
						businessObject.setReqOrigin("AccWriter");
					}
			    //changes for ticket 718904 ends
				//Changes for Ticket 728284 begin
				//Commenting code as below saveaccountMod is called again
				/*com.infy.cis.srmbo.Core.SaveAccountMod(bc,
					  (AccountModBO) businessObject,
					  AgentGroupMgr.getLoggedonUser(bc),
					  (DemographicModBO) DemoBO,
					  (PsychographicModBO) PsychoBO,isCopy );
			    coreObject.setAccountID(businessObject.getAccountID());*/
				//Changes for Ticket 728284 ends
			    //365731 changes ends

//SSV Changes-Start
/***********************TF Code moved up here********************/
			if(TFBO!=null && isTFFlag!=null && isTFFlag.equals("Y"))
			{
				TFBO.setAccountID(0);//Set to 0 till SSV is done

				TFBO.setName(businessObject.getName());
				TFBO.setOrgKey(businessObject.getAccountKey());
				String acctKeyTF=businessObject.getAccountKey();
				/*if(acctKeyTF.length() > 9){
				 TFBO.setCore_Cust_ID(acctKeyTF.substring(0,9));
				 }else{
				 TFBO.setCore_Cust_ID(acctKeyTF);
				 }*/
				TFBO.setCore_Cust_ID(coreCustId);

				//Changes for Ticket 728284 begin
				//String stemp1=(businessObject.getAccountID()).toString();
				//int itemp1=Integer.parseInt(stemp1);
				//Changes for Ticket 728284 ends

				if (editFlag){
					TFBO.setEntity_cre_flg("Y");
				}else if(TFBO.getEntity_cre_flg() ==null || TFBO.getEntity_cre_flg().equalsIgnoreCase("N") || TFBO.getEntity_cre_flg().equalsIgnoreCase("")){
					TFBO.setEntity_cre_flg("N");
				}
				else{
					TFBO.setEntity_cre_flg("Y");
				}
				//Tracker:90196: Changes for Attribute Masking
				if(strHouse_No.length()>5){
					strHouse_No=strHouse_No.substring(0,4);
				}
				if(strBuilding_Level.length()>5){
					strBuilding_Level=strBuilding_Level.substring(0,4);
				}
				if(strStreet_No.length()>10){
					strStreet_No=strStreet_No.substring(0,9);
				}
				if(strStreet_Name.length()>20){
					strStreet_Name=strStreet_Name.substring(0,19);
				}
				if(strSuburb.length()>40){
					strSuburb=strSuburb.substring(0,39);
				}
				if(strLocality_Name.length()>15){
					strLocality_Name=strLocality_Name.substring(0,14);
				}
				if(strTown.length()>15){
					strTown=strTown.substring(0,14);
				}
				if(strMail_Stop.length()>12){
					strMail_Stop=strMail_Stop.substring(0,11);
				}
				if(!(((strHouse_No).trim().equals(""))||((strBuilding_Level).trim().equals(""))||(strHouse_No==null)||(strBuilding_Level==null))){
					strHouse_No=(strHouse_No).trim()+"-";
				}
				if(!(((strStreet_No).trim().equals(""))||((strStreet_Name).trim().equals(""))||(strStreet_No==null)||(strStreet_Name==null))){
					strStreet_No=(strStreet_No).trim()+" ";
				}
				if((((!((strHouse_No).trim().equals("")))&&((strHouse_No!=null)))||((!((strBuilding_Level).trim().equals("")))&&(strBuilding_Level!=null)))&&(((!((strStreet_No).trim().equals("")))&&(strStreet_No!=null))||((!((strStreet_Name).trim().equals("")))&&(strStreet_Name!=null))))
				{
					if((!((strHouse_No).trim().equals("")))&&((strBuilding_Level).trim().equals("")))
					{
						strHouse_No=(strHouse_No).trim()+",";
					}
					else
					{
						strBuilding_Level=(strBuilding_Level).trim()+",";
					}
				}

				if((!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)))&&((strTown==null)||((strTown).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
				}
				else if((!(((strTown).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strTown==null)||(strMail_Stop==null)))&&((strLocality_Name==null)||((strLocality_Name).trim().equals("")))){
					strMail_Stop=(strMail_Stop).trim()+",";
				}
				else if((!(((strLocality_Name).trim().equals(""))||((strTown).trim().equals(""))||(strLocality_Name==null)||(strTown==null)))&&((strMail_Stop==null)||((strMail_Stop).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
				}
				else if(!(((strLocality_Name).trim().equals(""))||((strMail_Stop).trim().equals(""))||(strLocality_Name==null)||(strMail_Stop==null)||(strTown==null)||((strTown).trim().equals("")))){
					strLocality_Name=(strLocality_Name).trim()+",";
					strMail_Stop=(strMail_Stop).trim()+",";
				}

				strHouse_No="";
				strBuilding_Level="";
				strStreet_No="";
				strStreet_Name="";
				strSuburb="";
				strLocality_Name="";
				strTown="";
				strMail_Stop="";
				//Tracker:90196: End of Changes for Attribute Masking
				/* AdressLine changes: START */
		/* Commented And Added for Call Id : 561175 Start*/
			/*	preferredFormat = req.getParameter("PreferredFormat");
				if(preferredFormat != null && !preferredFormat.equals("STRUCTURED_FORMAT")){
					Addr1 = req.getParameter("AddressLine1");
					Addr2 = req.getParameter("AddressLine2");
					Addr3 = req.getParameter("AddressLine3");
					TFBO.setAddr_1(Addr1);
					TFBO.setAddr_2(Addr2);
					TFBO.setAddr_3(Addr3);
				}
				else{
					Addr1=strHouse_No.trim()+strBuilding_Level.trim()+strStreet_No+strStreet_Name.trim();
					Addr2=strSuburb.trim();
					Addr3=strLocality_Name.trim()+strMail_Stop.trim()+strTown.trim();
					TFBO.setAddr_1(Addr1);
					TFBO.setAddr_2(Addr2);
					TFBO.setAddr_3(Addr3);
				}*/
                    List         lstTFAddress1 = Utils.parseString(req.getParameter("AddressLine1"),'%');
                    List         lstTFAddress2 = Utils.parseString(req.getParameter("AddressLine2"),'%');
                    List         lstTFAddress3 = Utils.parseString(req.getParameter("AddressLine3"),'%');
                    List         lstTFAddr     = Utils.parseString(req.getParameter("address_type"),','); 
                    
                    int PrefAddrIndex = 0;
					//changes for callid 658234 starts
					if(lstTFAddr!=null)
					{
									

                    for(int j =0;j < lstTFAddr.size();j++){
                    //Finding out the Index of the Preferred Address
                    String TFAddrType = (String)lstTFAddr.get(j).toString().trim();
                    if (TFAddrType.equalsIgnoreCase(preferredAddress)){
                        PrefAddrIndex = j; }
			} 
								

}			
                       if(lstTFAddress1!=null)
                    TFBO.setAddr_1(((StringBuffer)lstTFAddress1.get(PrefAddrIndex)).toString());
										

					if(lstTFAddress2!=null)            
                    TFBO.setAddr_2(((StringBuffer)lstTFAddress2.get(PrefAddrIndex)).toString());
					
										
					if(lstTFAddress3!=null)           
                    TFBO.setAddr_3(((StringBuffer)lstTFAddress3.get(PrefAddrIndex)).toString());         
					//changes for callid 658234 ends
         
	        /*Commented And Added for Call Id : 561175 Ends*/
				/* AdressLine changes: END */
				TFBO.setCity(strCity.trim());
				TFBO.setState_Desc(strState.trim());
				TFBO.setCntry_Desc(strCountry.trim());
				//TFBO.setCity_Code(strCity_code.trim());
				//TFBO.setCntry_Code(strCountry_code.trim());
				TFBO.setZip(strZip);

				//Key Generation changes
				if(cifIDChngd){
					if(TFBO == null){
						TFBO = (TradeFinanceModBO)Utils.getBOFromID(bc,"TradeFinanceModBO",TradeFinanceModBO.ACCOUNTID,businessObject.getAccountID());
						TFBO.setOrgKey(acctKey);
					}else {
						TFBO.setOrgKey(acctKey);
					}
				}
				//End

				//Start of tracker id: 233699
				//com.infy.cis.srmbo.Core.SaveRetailTradeFinanceMod(bc,
				//		itemp1,
				//		AgentGroupMgr.getLoggedonUser(bc),
				//		(TradeFinanceModBO) TFBO,"Account");
				//End of tracker id: 233699

			}
/***********************TF Code moved up here********************/
		/*SPE 10.5 CHANGES*/
			//665901 changes starts
			/*if(convToCust.equals("Y")){
					if(oldEntityType.equals("Prospect")){
						businessObject.setReqOrigin("CreateAccountFromSuspect");

						}
					else if(oldEntityType.equals("Contact")){
						businessObject.setReqOrigin("CreateAccountFromContact");

					}
					else if(oldEntityType.equals("NonCustomer")){
						businessObject.setReqOrigin("CreateAccountFromNonCustomer");

					}



				}
				else{
				businessObject.setReqOrigin("AccWriter");
			    	}*/
			setReqOriginConvToCust(businessObject,oldEntityType,convToCust);
			try{
				callCustomHook(bc,(AccountModBO) businessObject,AgentGroupMgr.getLoggedonUser(bc),(DemographicModBO) DemoBO,(PsychographicModBO) PsychoBO,req,(CoreInterfaceModBO)coreObject); //Changes for call id : 755173
			}
			catch(Exception e){
				WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
			}
			//665901 changes ends
			//changes for ticket id 574503 start
			com.infy.cis.srmbo.Core.SaveAccountMod(bc,
					(AccountModBO) businessObject,
					AgentGroupMgr.getLoggedonUser(bc),
					(DemographicModBO) DemoBO,
					(PsychographicModBO) PsychoBO,isCopy );
				/* Changes for the Call id: 793932 starts */
		  		removeDelIdDoc(bc, IDRemoved,operationType,lstIDRemoved,iNoOfRemovedEDocs,req);
		  		/* Changes for the Call id: 793932 ends */
			coreObject.setAccountID(businessObject.getAccountID());
			
				//changes for ticket id 574503 end
//SSV Changes-Start
/*******************Minor details saved here*********************/
			//Added by Suman for Minor
			RelationshipModBO relBO=null;
			DemoBOMinor = new DemographicBO();
			Integer iChildEntityID;
			boolean newCont =false;

			if(CustomerMinor!=null && CustomerMinor.equals("Y")){
				if(guardCode!=null && !(guardCode.equalsIgnoreCase(""))){
				/*Tracker ID : 223255, Changes Begins*/
				contactFirstName       	= req.getParameter("ContactBO.firstName");
				contactLastName       	= req.getParameter("ContactBO.lastName");
				contactMiddleName        = req.getParameter("ContactBO.middleName");
					if(sChildEntity==null || sChildEntity.equals(""))
					{

						AccModHelper.setPrefModDetails(req,businessObjectContMod,contactLastName,contactFirstName,contactMiddleName);
				/*Tracker ID : 223255, Changes Ends*/

						DemoBOMinorMod.setOrgKey(ctKey);
						PsychoBOMinorMod.setOrgKey(ctKey);
						/*com.infy.cis.srmbo.Core.SaveContactMod(         bc,
								businessObjectContMod,
								null,
								AgentGroupMgr.getLoggedonUser(bc),
								false,
								DemoBOMinorMod,
								PsychoBOMinorMod);*/

						iChildEntityID= businessObjectContMod.getContactID();
						sChildEntity="CONTACT";
						newCont =true;
					}

					else{

						int iChildEntityId =  Integer.parseInt(sChildEntityID);
						iChildEntityID=new Integer(iChildEntityId);

					}

					Integer iParentEntityID=businessObject.getAccountID();
					String sParentEntity="CUSTOMER";
					relBO=new RelationshipModBO();
					/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
					AccModHelper.setRelBOModObject(relBO, sParentEntity,sChildEntity,iParentEntityID,iChildEntityID,contRelation,coreCustId,acctKey,businessObjectContMod);
					/*contRelation="Guardian";
					relBO.setParentEntity(sParentEntity);
					relBO.setChildEntity(sChildEntity);
					relBO.setParentEntityID(iParentEntityID);
					relBO.setChildEntityID(iChildEntityID);
					relBO.setRelationship(contRelation);
					relBO.setOrgKey(acctKey);*/

				// added for ticket id 209650 :relationship category was not set.
/*					relBO.setRelationship_Category("Social");
					relBO.setParentEntityType("Retail");
					relBO.setChildEntityType("Retail"); */
					/*TrackerID: 113227 start of changes */
					//changes for callid 739410 starts
					try{
						if(businessObjectContMod==null)
						callAccWriterHook_RelationAndDOC(req,null,null,-1,null,null,relBO,bc);
				      }
				      catch(Exception e)
						{
							WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
						}
						//changes for callid 739410 ends
					if(altLocaleActv!=null)
					if (altLocaleActv.equalsIgnoreCase("true") )
					{
						relBO = (com.infy.cis.srmbo.RelationshipModBO)DualFieldSetter.invokeSetterMethods("RelationshipModBO",relBO,req);
					}
					/*TrackerID: 113227 end of changes */
					/*if(acctKey.length() > 9){
					 relBO.setCore_cust_id(acctKey.substring(0,9));
					 } else {
					 relBO.setCore_cust_id(acctKey);
					 }*/
					 //351073
					//relBO.setCore_cust_id(coreCustId);
					/*Fix for ticket 380741 begin*/
					relBO.setParentCIFID(acctKey);
					relBO.setChildCIFID(ctKey);
					/*Fix for ticket 380741 end*/
					if(sChildEntity!=null)
					if(sChildEntity.equalsIgnoreCase("CUSTOMER"))
					{
						introBusinessObject = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,sChildEntityID);
						//Ticket 367108 changes
						sCore_child_cust_id = ((AccountBO)introBusinessObject).getCore_cust_id();
						relBO.setCore_child_cust_id(sCore_child_cust_id);
					}
					/*if(ctKey.length() > 9){
					 relBO.setCore_child_cust_id(ctKey.substring(0,9));
					 } else {
					 relBO.setCore_child_cust_id(ctKey);
					 }*/
					relBO.setGuard_Code(guardCode);
					/***********CIF Changes:Minor Approval :Start********************/
					if(newCont){
						relBO.setIsContactGuard("Y");
					}
					/***********CIF Changes:Minor Approval :End********************/


					Vector vSavingObj = new Vector();
					vSavingObj.addElement(relBO);
					//Saved after SSV
					//com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");

				}

			}
/*******************Minor details saved here**********************/
//SSV Changes-Start
/*******************Introducer details saved here**********************/
//			Introducer Changes:start
			RelationshipModBO relIntroBO=new RelationshipModBO();
			Integer iChildEntityIDIntro;
			boolean newCont1 = false;

			if((accountURL == null || (accountURL!=null && accountURL.trim().equals("")))&& ( ctKeyIntro!=null && !ctKeyIntro.equals("")))
			{
				if((introLastName!=null)&&!(introLastName.equals("")))
				{
					newCont1 =false;
					if((sChildEntityIntro.equals("")||sChildEntityIntro.equals(null)) && (businessObjectIntroMod.getContactsKey() != null))
					{
						/*com.infy.cis.srmbo.Core.SaveContactMod( bc,
								businessObjectIntroMod,
								null,
								AgentGroupMgr.getLoggedonUser(bc),
								false,
								DemoBOIntroMod,
								PsychoBOIntroMod);*/

						iChildEntityIDIntro= 0;//Set to 0 till SSV is done
						sChildEntityIntro="CONTACT";
						sChildEntityTypeIntro="Retail";
						newCont1=true;
					}

					else{

						//365731 changes starts
						int ichildID =  0;
						if(sChildEntityIDIntro!=null){
							ichildID =  Integer.parseInt(sChildEntityIDIntro);
						}
						//365731 changes ends
						iChildEntityIDIntro=new Integer(ichildID);
						//365731 changes starts
						if(sChildEntityIntro!=null && sChildEntityIntro.equalsIgnoreCase("CONTACT") && sChildEntityTypeIntro==null){
							sChildEntityTypeIntro="Retail";
						}
						//365731 changes ends

					}

					Integer iParentEntityID=businessObject.getAccountID();
					String sParentEntity="CUSTOMER";
					contIntroRelation="INTRODUCER";
					relIntroBO.setParentEntity(sParentEntity);
					relIntroBO.setChildEntity(sChildEntityIntro);
					relIntroBO.setParentEntityID(iParentEntityID);
					relIntroBO.setChildEntityID(iChildEntityIDIntro);
					relIntroBO.setRelationship(contIntroRelation);
					relIntroBO.setParentEntityType("Retail");
					relIntroBO.setChildEntityType(sChildEntityTypeIntro);
					 /*tracker id 154769 changes starts*/
					 /* CRM102ST: TrackerID:180467 Begin of Change */
                     relIntroBO.setRelationship_Category("Banking");
                    relIntroBO.setOrgKey(acctKey);
                     /* CRM102ST: TrackerID:180467 End of Change */
                     	/*tracker id 154769 changes ends*/
					/*if(acctKey.length() > 9){
					 relIntroBO.setCore_cust_id(acctKey.substring(0,9));
					 } else {
					 relIntroBO.setCore_cust_id(acctKey);
					 }*/
					 //351073
					//relIntroBO.setCore_cust_id(coreCustId);
//changes by aditya starts
					 relIntroBO.setParentCIFID(acctKey);
					HashMap introDetails = new HashMap();
					introDetails.put("IntroducerKey",ctKeyIntro);
					introDetails.put("IntroducerChildType",sChildEntityTypeIntro);
					introDetails.put("IntroducerType",sChildEntityIntro);
					introDetails.put("Salutation",introSalutation);
					introDetails.put("LastName",introLastName);
					relIntroBO = AccModHelper.saveIntroducerDetailsMod(relIntroBO,introDetails,bc);

					//changes by aditya ends
//changes for tracker 419294 vector clean up begin
					ArrayList vSavingObj = new ArrayList();
					vSavingObj.add(relIntroBO);
//changes for tracker 419294 vector clean up ends
					com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");
				}
			}

//			Introducer Changes:end
/*******************Introducer details saved here**********************/
//SSV Changes -End

ArrayList arrEntyDoc = AccModHelper.getEdocArrayForSSV2(businessObject,mainID,apprFlag ,bc,sc,req,iNoOfEDocs,acctKey,operationType,lstEntityDocumentURL,lstEDocIsDirty);
if(servrValidation.equalsIgnoreCase("true")){
	if (  (accountURL!=null) && (!accountURL.equals("")) && (editFlag || operationType.equals("Queue")) ){
			if(apprFlag && saveFlag==0)//SUBMIT from Edit Entity - Approval Enabled
			{
				HashMap hmBOList_1 = new HashMap();
				hmBOList_1.put("AccountModBO",businessObject);hmBOList_1.put("DemographicModBO",DemoBO);hmBOList_1.put("PsychographicModBO",PsychoBO);
				hmBOList_1.put("CoreInterfaceModBO",coreObject);hmBOList_1.put("TradeFinanceModBO",TFBO);hmBOList_1.put("RelationshipModBO",relBO);
				doServerSideValidation(hmBOList_1,arrEntyDoc,bc,"mod");

			}else if((apprFlag && saveFlag==0 && operationType.equals("Queue") && queSubmit==1)//SUBMIT from Entity Q- Approval Enabled
				|| (!editFlag && !apprFlag && saveFlag==0 && operationType.equals("Queue") && queSubmit==1)// SUBMIT from Entity Q-approval disabled
				|| (!blTabValid && !editFlag && !apprFlag && saveFlag==1 && operationType.equals("Queue") && queSubmit==1) //SUBMIT from Entity Q-approval disabled and  tabvalidator is false
				|| (!blTabValid && !editFlag && apprFlag && saveFlag==1 && operationType.equals("Queue") && queSubmit==1) )//SUBMIT from Entity Q-approval enabled and  tabvalidator is false
			{
				HashMap hmBOList_2 = new HashMap();
				hmBOList_2.put("AccountModBO",businessObject);hmBOList_2.put("DemographicModBO",DemoBO);hmBOList_2.put("PsychographicModBO",PsychoBO);
				hmBOList_2.put("CoreInterfaceModBO",coreObject);hmBOList_2.put("TradeFinanceModBO",TFBO);hmBOList_2.put("RelationshipModBO",relBO);
				doServerSideValidation(hmBOList_2,arrEntyDoc,bc,"mod");
			}


		 }
    }

//SSV Changes-End

			
				//changes for ticket id 574503 start
			/*com.infy.cis.srmbo.Core.SaveAccountMod(bc,
					(AccountModBO) businessObject,
					AgentGroupMgr.getLoggedonUser(bc),
					(DemographicModBO) DemoBO,
					(PsychographicModBO) PsychoBO,isCopy );

			coreObject.setAccountID(businessObject.getAccountID());*/
				//changes for ticket id 574503 end
			//Tracker ID 113276  identification changes start
			// int accoId =  Integer.parseInt(businessObject.getAccountID());
			int accoId = businessObject.getAccountID().intValue();
			if(isCopy.equalsIgnoreCase("Y")){
				cdone=AccModHelper.copyBaselMod(bc,businessObject,req);
			}
			//Ticket Id 201736 : Begin
			//Passing AccountModBo object, mainId,apprFalg,copyFlag
            //saveEdoc2(bc,sc,req,accoId,iNoOfEDocs,acctKey);
/* Ticket id 207511 changes start */
			/* Changes for tracker 180240 start */
			/* Begin Changes Tracker id: 178897*/
			saveEdoc2(businessObject,mainID,apprFlag ,bc,sc,req,accoId,iNoOfEDocs,acctKey,operationType,lstEntityDocumentURL,lstEDocIsDirty,coreCustId);
			/* End Changes Tracker id: 178897*/
			/* Changes for tracker 180240 end */
/* Ticket id 207511 changes end */
			//Ticket Id 201736 : End
			// Tracker ID 113276  identification changes end
			//Key Generation changes
			if(cifIDChngd){
				if(coreObject == null){
					coreObject = (CoreInterfaceModBO)Utils.getBOFromID(bc,"CoreInterfaceModBO",CoreInterfaceModBO.ACCOUNTID,businessObject.getAccountID());
					coreObject.setORGKEY(acctKey);
				}else {coreObject.setORGKEY(acctKey);}
			}
			else{
				coreObject.setORGKEY(acctKey);
			}
			//End

			com.infy.cis.srmbo.Core.SaveCoreInterfaceMod(bc,
					businessObject.getAccountID(),
					(CoreInterfaceModBO) coreObject,
					AgentGroupMgr.getLoggedonUser(bc)
			);
			strOtherTFFields=businessObject.getName()+"$"+businessObject.getAccountKey();
			//Key Generation changes
			if(cifIDChngd){
		RelationshipModBO relBO1 = (RelationshipModBO)Utils.getBOFromID(bc,"RelationshipModBO",RelationshipModBO.PARENTENTITYID,businessObject.getAccountID());
		if(relBO1!=null){
			relBO1.setOrgKey(acctKey);
//changes for tracker 419294 vector clean up begin
			ArrayList vSavingObj = new ArrayList();
			vSavingObj.add(relBO1);
//changes for tracker 419294 vector clean up ends
					com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");
				}
			}
			//End
//SSV Changes-Start
/************************************TradeFinance code moved up***********/
//Only saving is done here
			if(TFBO!=null && isTFFlag!=null && isTFFlag.equals("Y"))
			{
				TFBO.setAccountID(businessObject.getAccountID());

			}
/************************************TradeFinance code moved up***********/
			if ((acctPrimaryContact!=null)&&(!acctPrimaryContact.equals(""))){
				try{
					int pContactID = acctPrimaryContact.getFormatter2(context).stringToInt(acctPrimaryContact);

					if ((businessObject.getPrimaryContactID()==null)
							|| (!(businessObject.getPrimaryContactID()).equals(new Integer(pContactID)))){
						//Change in primery contact
						SRMQueryBuilder qbContact = QueryAssist.singleObjectQuery("ContactModBO",ContactModBO.CONTACTID,QB_CONTACTMOD);
						QueryAssist.addSimpleCondition(qbContact, "ContactModBO",ContactModBO.CONTACTID, IQuery.ComparisonOperation_EQ, ""+pContactID);
						SRMQueryResult qrContact = qbContact.runQuery(bc, true, -1);
						SRMRecordSet recordSet = qrContact.getRecordSet();
						contBO = (ContactModBO)((ArrayList)recordSet.getNext()).get(0);
						Core.SaveContactMod(bc,contBO, businessObject,true);
					}
				}catch (NumberFormatException e){ //todo write in log
					if(WebAdaptor.willLog(com.infy.cis.log.LogType.MINOR)) {
						WebAdaptor.log(com.infy.cis.log.LogType.MINOR,
								"AccWriter : Invalid Contact ID=" + acctPrimaryContact );
					}
					throw new SRMBCException(
							SRMBCException.INVALID_CONTACT,
							null
					);

				}
			} else if(acctPrimaryContURL != null && !acctPrimaryContURL.trim().equals("")) {
				contBO =(ContactModBO)SRMURLResolver.getObject(bc, acctPrimaryContURL, true);
				if((businessObject.getPrimaryContactID()==null)||
						(!(businessObject.getPrimaryContactID()).equals(contBO.getContactID()))){
					//Change in primery contact
					Core.SaveContactMod(bc,contBO, businessObject,true);
				}
			} else {
				if(accountURL != null && !accountURL.trim().equals("")) {

					Integer tempContID = businessObject.getPrimaryContactID();
					if(tempContID != null) {
						SRMQueryBuilder qbContact = QueryAssist.singleObjectQuery("ContactModBO",ContactModBO.CONTACTID,QB_CONTACTMOD2);
						QueryAssist.addSimpleCondition(qbContact, "ContactModBO",ContactModBO.CONTACTID, IQuery.ComparisonOperation_EQ, ""+tempContID);
						SRMQueryResult qrContact = qbContact.runQuery(bc, true, -1);
						SRMRecordSet recordSet = qrContact.getRecordSet();
						ContactModBO tempContBO = (ContactModBO)((ArrayList)recordSet.getNext()).get(0);
						// Core.DetachContactFromAccount(bc, businessObject, tempContBO);
						// Core.AttachContactToAccount(bc, businessObject, tempContBO, false);
					}
				}
			}

/*10.5 SPE CHANGES*/
businessObject.setReqOrigin("AccWriter");
/*10.5 SPE CHANGES*/

			List prodList = new ArrayList();
			SRMCollection exist_Products = businessObject.getProducts();

			if ((attachedProducts!=null) && (!attachedProducts.equals(""))){
				prodList = Utils.parseString(attachedProducts);
			}

			for (int j = exist_Products.size(); j > 0; j--) {
				boolean removeFlag = true;
				Integer compId = ((AccountModBO.Products)exist_Products.get(j-1)).getProductID();
				if(0!=prodList.size()) {
					for(int l = 0; l < prodList.size(); l++) {
						// formatting independant of i18n type.
						if(compId!=null)
						if (compId.equals(new Integer(srmf.stringToInt((prodList.get(l)).toString())))) {
							prodList.remove(l);
							l--;
							removeFlag = false;
							break;
						}
					}
					if(removeFlag) {
						// Core.DetachProductFromAccount(bc, businessObject, Utils.getProductBO(compId, bc));
					}
				} else {
					// Core.DetachProductFromAccount(bc, businessObject, Utils.getProductBO(compId, bc));
				}
			}

			if(0!=prodList.size()) {
				for (int i = 0;i<prodList.size();i++) {
					// formatting independant of i18n type.
					//Core.AttachProductToAccount(bc, businessObject, Utils.getProductBO(new Integer(srmf.stringToInt(prodList.get(i).toString())), bc));
				}
			}

//SSV Changes
/************************Minor code moved up. Only saving done here************/
			//Added by Suman for Minor
			if(CustomerMinor!=null && CustomerMinor.equals("Y")){
				if(guardCode!=null && !(guardCode.equalsIgnoreCase(""))){
					if(sChildEntity==null || sChildEntity.equals(""))
					{
						com.infy.cis.srmbo.Core.SaveContactMod(         bc,
								businessObjectContMod,
								null,
								AgentGroupMgr.getLoggedonUser(bc),
								false,
								DemoBOMinorMod,
								PsychoBOMinorMod);

						iChildEntityID= businessObjectContMod.getContactID();
						sChildEntity="CONTACT";
						newCont =true;
					}

					else{
							//changes for ticket id 574503 start
						//com.infy.cis.srmbo.Core.SaveContactMod( bc,
								//businessObjectContMod,
								//null,
								//AgentGroupMgr.getLoggedonUser(bc),
								//false,
								//DemoBOMinorMod,
								//PsychoBOMinorMod);

					//int	iChildEntityId= businessObjectContMod.getContactID();
						int iChildEntityId =  Integer.parseInt(sChildEntityID);
						iChildEntityID=new Integer(iChildEntityId);

					}

					Integer iParentEntityID=businessObject.getAccountID();
//changes for tracker 419294 vector clean up begin
					ArrayList vSavingObj = new ArrayList();
					vSavingObj.add(relBO);
//changes for tracker 419294 vector clean up ends
					com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");
				}

			}
//SSV Changes
/************************Minor code moved up. Only saving done here************/

//SSV Changes
/*******************Introducer details moved up. Only Saving done here**********************/

				//Introducer Changes:start
            //tracker id 337846 changes starts
                           //changes for call id 429139 starts
			if((accountURL == null || accountURL.trim().equals(""))&& (ctKeyIntro!=null && !ctKeyIntro.equals(""))){
				//tracker id 338143 changes starts
				// Changes for call id 445736 recon starts here
				if(!editFlag && operationType.equalsIgnoreCase("null")){
				//if((ctKeyIntro!=null && !ctKeyIntro.equals(""))) {
                          //changes for call id 429139 ends
					//tracker id 338143 changes ends
					//tracker id 337846 changes ends
					//573155 changes starts
					ArrayList vDelObj = getExistingRelationshipMod(acctKey,bc);
					Core.DeleteRelationshipMod(bc, vDelObj);
					//573155 changes ends
					if((introLastName!=null)&&!(introLastName.equals("")))
					{
					//tracker id 338143 changes starts
				    if((sChildEntityIntro==null || sChildEntityIntro.equals("")) && (businessObjectIntroMod.getContactsKey() != null)){
						//tracker id 338143 changes ends

							com.infy.cis.srmbo.Core.SaveContactMod( bc,
									businessObjectIntroMod,
									null,
									AgentGroupMgr.getLoggedonUser(bc),
									false,
									DemoBOIntroMod,
									PsychoBOIntroMod);

							iChildEntityIDIntro= businessObjectIntroMod.getContactID();
						}

						else{
                            //changes for call id 336171,337446 start
							//365731 changes starts
							int ichildID = 0;
							if(sChildEntityIDIntro!=null){
								ichildID =  Integer.parseInt(sChildEntityIDIntro);
							} //365731 changes ends
                            //changes for call id 336171,337446 end
							iChildEntityIDIntro=new Integer(ichildID);

						}

					Integer iParentEntityID=businessObject.getAccountID();
											relIntroBO=new RelationshipModBO();
						relIntroBO.setParentEntityID(iParentEntityID);
						relIntroBO.setChildEntityID(iChildEntityIDIntro);
//change for callid 358638 begins
						String sParentEntity="CUSTOMER";
											contIntroRelation="INTRODUCER";
											relIntroBO.setParentEntity(sParentEntity);
											relIntroBO.setChildEntity(sChildEntityIntro);
											//relIntroBO.setParentEntityID(iParentEntityID);
											//relIntroBO.setChildEntityID(iChildEntityIDIntro);
											relIntroBO.setRelationship(contIntroRelation);
											relIntroBO.setParentEntityType("Retail");
											relIntroBO.setChildEntityType(sChildEntityTypeIntro);
											 /*tracker id 154769 changes starts*/
											 /* CRM102ST: TrackerID:180467 Begin of Change */
						                     relIntroBO.setRelationship_Category("Banking");
						                    relIntroBO.setOrgKey(acctKey);
											 relIntroBO.setParentCIFID(acctKey);
											HashMap introDetails = new HashMap();
											introDetails.put("IntroducerKey",ctKeyIntro);
											introDetails.put("IntroducerChildType",sChildEntityTypeIntro);
											introDetails.put("IntroducerType",sChildEntityIntro);
											introDetails.put("Salutation",introSalutation);
											introDetails.put("LastName",introLastName);
											relIntroBO = AccModHelper.saveIntroducerDetailsMod(relIntroBO,introDetails,bc);
//change for callid 358638 ends
											relIntroBO.setPrimaryIntroducer("Y");

						//changes by aditya ends
//changes for tracker 419294 vector clean up begin
						ArrayList vSavingObj = new ArrayList();
						vSavingObj.add(relIntroBO);
//changes for tracker 419294 vector clean up ends
						com.infy.cis.srmbo.Core.saveRelationshipMod( bc, vSavingObj,"N");
					}
					 // Changes for call id 445736 ends here
			}
			/*****10.2.18:Techonline Fix:856144:Removing the else block which saves the primary introducer details in relationship table:Editing of primary introducer details is no more supported from Edit - General Details menu in the current system.(10.2.18-ref call id: 828552 ).Kindly DO NOT enable it.Reach out to Babu_Jayabalan/ Kriti_Guleria for enabling.***/
			}
				//Key Generation changes

				//End


			/*********** Save and Submit Changes : End****************/
			//Fix for TOL id: 819734 - Starts
			try
			{
			if(operationType!=null && !apprFlag && saveFlag==0 && operationType.equals("Queue")){
				AccountModBO accModBO = (AccountModBO)SRMURLResolver.getObject(bc, accountURL, true);
				int accModID = accModBO.getAccountID().intValue();
				//Key Generation changes
				//iMainacctID = Core.copyFromModtoMain(bc,accModID);
				/* Tracker id 276037 recon changes : begin */
				/* tracker id 231984 changes : begin */
				iMainacctID = Core.copyFromModtoMain(bc,accModID,cifIDChngd,apprFlag);
				/* tracker id 231984 changes : end */
				/* Tracker id 276037 recon changes : end */
				//End
				//Changes done by Kanika For Cif Deceased starts
				//Changes for call id 418591 starts
				if(bc == null)
				{
					bc=Utils.getTransactedBusinessContext(req);
				}
				//Changes for call id 418591 ends
				//Changes done by Kanika For Cif Deceased ends
				com.infy.cis.srmbo.Core.deleteModCustomer(bc,"Account",new Integer(accModID));
			}
			else if(apprFlag && saveFlag==0 && (operationType!=null) && (operationType.equals("Queue"))){
				AccountModBO accModBO = (AccountModBO)SRMURLResolver.getObject(bc, accountURL, true);
				int accModID = accModBO.getAccountID().intValue();
 			    /*Tracker id: 161182 changes begin
 			    In case approval enabled and Entity is edited instead of created, it should not copy the changes from mod to main
 			    else previous data will be overwritten in main table itself and wont be recovered in case of Close or reject decision
 			    */
				String strEntCreFlag=accModBO.getEntity_cre_flag();
				if(strEntCreFlag!=null)
                  //changes for tracker id 343669 starts
				if(strEntCreFlag.equals("N")&& (accModBO.getMainTableID() == null)){
				 //changes for tracker id 343669 ends
				/* Tracker id 276037 recon changes : begin */
				/* tracker id 231984 changes : begin */
					iMainacctID=Core.copyFromModtoMain(bc,accModID,cifIDChngd,apprFlag);
				/* tracker id 231984 changes : end */
				/* Tracker id 276037 recon changes : end */
				}
				/*Tracker id: 161182 changes End*/

			}
			}
			catch(SRMBOException e){
				if(e.getErrorCode() == SRMBOException.ERROR_ADDRESS_NORECORD)
				{
					WebAdaptor.log(LogType.PANIC,  e.toString());
					WebAdaptor.log(LogType.PANIC,  "AccWriter:::::::approval disabled scenario():::::::Address details are not present");
					ExceptThrow.Throw(new SRMBOException(SRMBOException.ERROR_ADDRESS_NORECORD,e)); 
				}
				else if(e.getErrorCode()==SRMBOException.ERROR_ENTITYDOC_NORECORD)
				{
					WebAdaptor.log(LogType.PANIC,  e.toString());
					WebAdaptor.log(LogType.PANIC,  "AccWriter:::::::approval disabled scenario():::::::Entitydocument details are not present");
					ExceptThrow.Throw(new SRMBOException(SRMBOException.ERROR_ENTITYDOC_NORECORD,e));			
				}
				else
				{
					WebAdaptor.log(LogType.PANIC,  e.toString());
					ExceptThrow.Throw(new SRMBOException(SRMBOException.ERROR_INTERNAL, e));
				}
			}
			catch(Exception e)
			{
				WebAdaptor.log(LogType.PANIC,  e.toString());
				ExceptThrow.Throw(new SRMBOException(SRMBOException.ERROR_INTERNAL, e));
			}
			//Fix for TOL id: 819734 - ends	
			/*********** Save and Submit Changes : Start****************/
			//Changes for call id 418591 starts
			try {
				if(convToCust.equals("Y"))
				{

					setConvFlags(oldEntityID,bc,oldEntityType,new AccountBO());
				}
			} catch (Exception e) {
				WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
			}
			if(bc != null)
			{
				bc.terminate(true);
			}
			//Changes for call id 418591 ends
			/* Tab Validation By Mamta: Start */
			/* Tracker ID:96102 */
//Ticket 326932 recon:starts
			//if(blTabValid == false || (sDummy != null && sDummy.equals("Y") && !(saveFlag==1)  && !chgDummy))
if((blTabValid == false || (sDummy != null && sDummy.equals("Y") && !(saveFlag==1)  && !chgDummy)) ||((saveFlag==0) && operationType.equals("Edit Entity") && (isTFFlag!=null) && isTFFlag.equals("Y") && (isTFFlag_old!=null) && isTFFlag_old.equals("N"))){
				/*Fix for compilation issue of ServiceRequest Method starts*/
				//sb=getScript(sb); //commenting and moving code down-10.2.18 Fix for Techonline call 774841
				/*Fix for compilation issue of ServiceRequest Method ends*/

				/*CRM102ST:TrackerID:177977 Being of Change */
				//out.println(sb.toString());//changes by tarun commenting and moving code down-10.2.18 Fix for Techonline call 774841
				/*CRM102ST:TrackerID:177977 End of Change */
				String strError = "";
				if(sDummy != null && sDummy.equals("Y")){
					//strError = CommonQueries.getUnfilledTabList(prevTabs,tabTitle,currentTab);
					strError = CommonQueries.getUnfilledTabList(newTabs,tabTitle,isTFFlag);
				}else{
					strError = CommonQueries.getUnfilledTabList(filledTabs,tabTitle,isTFFlag);
				}
				//adding condition--10.2.18 Fix for Techonline call 774841
				if(strError !=null && !strError.equalsIgnoreCase("")  )
				{
					sb=getScript(sb);
					out.println(sb.toString());
				throw new FCRMGenericException("MSGEXC50029",new Exception("Following Mandatory Tabs are not filled : {0}"),strError);
				}//10.2.18 Fix for Techonline call 774841
			}
			/* Tab Validation By Mamta: End */
			sb.append("<SCRIPT>");
			sb.append(" var allParam = new Array();");

			/*Region should always be first in array */

			if(acctRegion != null && !acctRegion.equals("")){
				sb.append(" allParam[allParam.length]  = '" + Escaper.escape(acctRegion, '\\', Constants.HTML_ESC_CHAR) + "';");
			}else{
				sb.append(" allParam[allParam.length]  = '';");
			}
			/* CRM61SR:SRINBO :TRACKER# 44198 **BEGIN  CHANGES** */
			sb.append(" allParam[allParam.length]  = '" + Escaper.escape(businessObject.getAccountID().toString(), '\\', Constants.HTML_ESC_CHAR) + "';");
			/* CRM61SR:SRINBO :TRACKER# 44198 **END  CHANGES** */

			/* CRM61LR : Tracker ID # 44575 : Added for LinkDelink Validation */
			if(!((DelinkCustDet==null) || (DelinkCustDet.equals(""))) &&
					DelinkCustDet.equalsIgnoreCase("LinkDelinkCustDet")){
				sb.append(" savedValue = '"
						+ Escaper.escape(businessObject.getCust_Last_Name().toString(), '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			}
			if(!apprFlag && saveFlag==0 && (operationType!=null) && (operationType.equals("Queue"))){
				sb.append(" savedValue = '"+ Escaper.escape(new Integer(iMainacctID).toString(), '\\', Constants.HTML_ESC_CHAR)+ "';");
			}
			else{

				sb.append(" savedValue = '"
						+ Escaper.escape(businessObject.getAccountID().toString(), '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			}
			sb.append(" savedModID = '';");

			sb.append(" savedLastName = '"
					+ Escaper.escape(businessObject.getCust_Last_Name().toString(), '\\', Constants.HTML_ESC_CHAR)
					+ "';");


			sb.append(" savedURL = '"
					+ Escaper.escape(businessObject.getUrl(), '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" AddressFields = '"
					+ Escaper.escape(AddressFields, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" OtherTFFields = '"
					+ Escaper.escape(strOtherTFFields, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			sb.append(" CoreCustID = '"
					+ Escaper.escape(coreCustId, '\\', Constants.HTML_ESC_CHAR)
					+ "';");

			if((accountURL==null) || (accountURL.equals("")) &&
					(isAutoGenKey != null && isAutoGenKey.trim().equalsIgnoreCase("true"))) {
				sb.append(" extraParam = ' Account Key - "
						+ Escaper.escape(acctKey, '\\', Constants.HTML_ESC_CHAR)
						+ "';");
			} else {
				sb.append(" extraParam = '"
						+ "';");
			}
			sb.append("ackey = \" "+businessObject.getAccountKey()+"\";");
			/* CIF Changes for Tabs on Demand starts */
			sb.append("savedKey = \""+businessObject.getAccountKey()+"\";");
			sb.append("savedType = \""+businessObject.getOrgType()+"\";");
			sb.append(" copyValue = '" + Escaper.escape(isCopy, '\\', Constants.HTML_ESC_CHAR) + "';");
			sb.append("cdone = \""+cdone+"\";");
			/* CIF Changes for Tabs on Demand ends */


			if(isQDE!=null && isQDE.equalsIgnoreCase("Y")){
				req.setAttribute("AccountID",businessObject.getAccountID().toString());
			}
			/* Changes for WFlow POC -- start */
			
				if (businessObject.getIntWFID() != null) {
					callAccWriterHook(businessObject,DemoBO,PsychoBO,TFBO,coreObject,req,bc);
		
			}
			/* Changes for WFlow POC -- end */
			//Checksum recon, 10.3.02 security audit changes
			SecureAuditHelper objSecHash = new SecureAuditHelper();
			hmSecureHashKeyFields=objSecHash.getSecurKeyAndFldKey("AccountModBO",businessObject, sc);
            //Checksum recon, 10.3.02 security audit changes
		}// end of else -Other condition
	   //Checksum recon, 10.3.02 security audit changes
			String strSecureHKey= (String)hmSecureHashKeyFields.get(SecureHashKeyGeneration.HASHKEY);
			String strFldHashKey = (String)hmSecureHashKeyFields.get(SecureHashKeyGeneration.KEYFIELD);
	   //Checksum recon, 10.3.02 security audit changes

		// CIF changes - Tabbing & Saving -->
		//out.println("try{parent.parent.parent.parent.setButtonsVisible(false);}catch(e){} ");
		// CIF changes - Tabbing & Saving -->
        //Checksum recon, 10.3.02 security audit changes
		sb.append("try{");
		sb.append("parent.frames[0].document.getElementsByName(\"SECUREHKEY\")[0].value='"+strSecureHKey+"';");
		sb.append("parent.frames[0].document.getElementsByName(\"FLDHASHKEY\")[0].value='"+strFldHashKey+"';");
		sb.append("}catch(e){}");
		//Checksum recon, 10.3.02 security audit changes
		sb.append(" executionStatus = 'SUCCESS'");
		sb.append("</SCRIPT>");
		out.println(sb.toString());
		incrementCount(saveFlag,acctId,operationType,bc.getBank_id(),intMAccId);
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : Exiting AccWriter");
		//Changes for call id 378506 starts - Recon for 380203
		}catch (Exception e) {
					bc.terminate (false);
					throw e;

		}
		//Changes for call id 378506 ends - Recon for 380203
	}
	/***10.2.18 TechOnline call: 801741 : starts***/
	private void removeDelIdDoc(SRMBusinessContext bc,String IDRemoved,String operationType,List lstIDRemoved,int iNoOfRemovedEDocs,HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		String copyFlag = req.getParameter("isCopy");
		if(!("Y").equalsIgnoreCase(copyFlag)){
		getNoOfRemovedEdocs2(bc, IDRemoved,operationType,lstIDRemoved );
		delEdoc2(bc,iNoOfRemovedEDocs,lstIDRemoved);
		}
	}
	/***10.2.18 TechOnline call: 801741 : ends***/

	private String generateCoreCustIdForReservedCIF(String codeNNTM, String typeNNTM, Hashtable htCifIds, String sPrimary_sol_id, SRMBusinessContext bc) throws Exception {
		// TODO Auto-generated method stub
		String coreCustId="";
		if((!codeNNTM.equals("")) || (!typeNNTM.equals(""))) {
			htCifIds =  NNTMIdGen.getCifId(codeNNTM, typeNNTM,sPrimary_sol_id);
			coreCustId = (String)htCifIds.get("addId");
		} else {
			coreCustId = AccountIDGen.getCoreCustId(bc);
		}
		return coreCustId;
	}
	
	private void clearstrFields() {
		// TODO Auto-generated method stub
		String strHouse_No="";
		String strBuilding_Level="";
		String strStreet_No="";
		String strStreet_Name="";
		String strSuburb="";
		String strLocality_Name="";
		String strTown="";
		String strMail_Stop="";
	}

	//665901 changes starts
	private void setReqOriginConvToCust_Main(AccountBO businessObject,
			String oldEntityType, String convToCust) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		try{
		if(convToCust.equals("Y")){
			if(oldEntityType.equals("Prospect")){
				businessObject.setReqOrigin("CreateAccountFromSuspect");

				}
			else if(oldEntityType.equals("Contact")){
				businessObject.setReqOrigin("CreateAccountFromContact");

			}
			else if(oldEntityType.equals("NonCustomer")){
				businessObject.setReqOrigin("CreateAccountFromNonCustomer");

			}
		}
		else{
		businessObject.setReqOrigin("AccWriter");
	    	}
		}
		catch(Exception e){
			WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
		}
	}
	private void setReqOriginConvToCust(AccountModBO businessObject,
			String oldEntityType, String convToCust) {
		// TODO Auto-generated method stub
		try{
		if(convToCust.equals("Y")){
			if(oldEntityType.equals("Prospect")){
				businessObject.setReqOrigin("CreateAccountFromSuspect");

				}
			else if(oldEntityType.equals("Contact")){
				businessObject.setReqOrigin("CreateAccountFromContact");

			}
			else if(oldEntityType.equals("NonCustomer")){
				businessObject.setReqOrigin("CreateAccountFromNonCustomer");

			}
		}
		else{
		businessObject.setReqOrigin("AccWriter");
	    	}
		}
		catch(Exception e){
			WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
		}
		
	}

	private void callCustomHook(SRMBusinessContext bc,
			AccountModBO businessObject, GenericUser loggedonUser,
			DemographicModBO demoBO, PsychographicModBO psychoBO,
			HttpServletRequest req,CoreInterfaceModBO coreObject) throws ClassNotFoundException, WriterHookException, Exception { //Changes for call id : 755173

		// TODO Auto-generated method stub
		try{
			
			Object classOb = getFromCache("AccWriterHook");
		Class DDECustWritHkClass = null;

		if (classOb == null) {
			DDECustWritHkClass = Class.forName("com.infy.cis.custom.AccWriterHook");
			classOb = DDECustWritHkClass.newInstance();
			putInCache("AccWriterHook",classOb);
		} else {
			DDECustWritHkClass = classOb.getClass();
		}
	
		if (classOb != null) {
			HashMap HookParams = new HashMap();			
			HookParams.put("Request", req);
			HookParams.put("DemographicModBO", demoBO);
			HookParams.put("AccountModBO", businessObject);
			HookParams.put("PsychographicModBO", psychoBO);
			HookParams.put("CoreInterfaceModBO", coreObject); //Changes for call id : 755173
			Method QDECustWritHkMeth = DDECustWritHkClass.getMethod("callDDECust_Method_Writer",  new Class[]{HashMap.class, SRMBusinessContext.class});
			if (QDECustWritHkMeth == null) {
				throw new WriterHookException("MSGEXC0206","Writer Hook method not obtained");
			}
			try {
				QDECustWritHkMeth.invoke(classOb, new Object[]{HookParams, bc});
			}
			catch(Exception e) {
				throw new WriterHookException("MSGEXC0206","Not able to invoke Writer Hook method ");
			}
		}
	}
	catch(ClassNotFoundException cle) {
		
	}
	catch(WriterHookException whe) {
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : WriterHookException"+whe);

	}
	catch(Exception e) {
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccModHelper : Exception"+e);
		
	}
		
	}
	
	
	private void callCustomHook_Main(SRMBusinessContext bc,
			AccountBO businessObject, 
			HttpServletRequest req,CoreInterfaceBO coreObject,DemographicBO DemoBO) throws ClassNotFoundException, WriterHookException, Exception {

		// TODO Auto-generated method stub
		try{
			
			
		Object classOb = getFromCache("AccWriterHook");
		Class DDECustWritHkClass = null;

		if (classOb == null) {
			DDECustWritHkClass = Class.forName("com.infy.cis.custom.AccWriterHook");
			classOb = DDECustWritHkClass.newInstance();
			putInCache("AccWriterHook",classOb);
		} else {
			DDECustWritHkClass = classOb.getClass();
		}
	
		if (classOb != null) {
			HashMap HookParams = new HashMap();			
			HookParams.put("Request", req);
			HookParams.put("AccountBO", businessObject);
			HookParams.put("CoreInterfaceBO", coreObject); //Changes for call id : 755173
			//changes for Call id 842140
			Method QDECustWritHkMeth =null;
			if (DemoBO == null)
			{
			QDECustWritHkMeth = DDECustWritHkClass.getMethod("callDDECust_Method_Writer",  new Class[]{HashMap.class, SRMBusinessContext.class});
			}
		  else
			{
			  HookParams.put("DemographicBO", DemoBO);
			QDECustWritHkMeth = DDECustWritHkClass.getMethod("callDDECustDemo_Method_Writer",  new Class[]{HashMap.class, SRMBusinessContext.class});

			}
			
			if (QDECustWritHkMeth == null) {
				throw new WriterHookException("MSGEXC0206","Writer Hook method not obtained");
			}
			try {
				QDECustWritHkMeth.invoke(classOb, new Object[]{HookParams, bc});
			}
			catch(Exception e) {
				throw new WriterHookException("MSGEXC0206","Not able to invoke Writer Hook method ");
			}
		}
	}
	catch(ClassNotFoundException cle) {
	}
	catch(WriterHookException whe) {
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : WriterHookException"+whe);
	}
	catch(Exception e) {
		WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccModHelper : Exception"+e);
	}
		
	}
	
	private void setCoreInterfaceFields(CoreInterfaceModBO coreObject,
			boolean editFlag, AccountModBO businessObject) throws Exception {
		// TODO Auto-generated method stub
		
		if (editFlag){
		coreObject.setEntity_cre_flg("Y");
	} else if(businessObject.getEntity_cre_flag() ==null || businessObject.getEntity_cre_flag().equalsIgnoreCase("N") || businessObject.getEntity_cre_flag().equalsIgnoreCase("")){
		coreObject.setEntity_cre_flg("N");
	}
	else{
		coreObject.setEntity_cre_flg("Y");
	}
	}
	//665901 changes ends
// Changes for Ticket id: 777026 start
private String getKeyPrefix2() throws Exception {
		// TODO Auto-generated method stub
		String bankID1 = (String)com.infy.cis.common.SRMTLVar.bank_id.get();
		Properties prop2 = PropertyFileManager.getPropFile("KeyPrefix.properties",bankID1);
		String keyPrefix2 = prop2.getProperty("PREFIXRETAILCORECUSTID");
		return keyPrefix2;
	}
//Changes for Ticket id: 777026 ends
/*Fix for compilation issue of ServiceRequest Method starts*/
	private StringBuilder getScript(StringBuilder sb) {
		sb.append("<SCRIPT>");
		sb.append("var selTabId = parent.parent.parent.parent.tabViewFrm.getSelectedTabId();");
		sb.append("var selTabName = new Array();");
		sb.append("selTabName[0] = parent.parent.parent.parent.tabViewFrm.getSelectedTabName();");
		sb.append("var  msg = parent.frames[0].getUserMessage('MSG024',selTabName);");
		sb.append("parent.parent.parent.parent.messageFrm.addMessage(selTabId,msg, null, 'NO_HLINK');");
		sb.append("parent.parent.parent.parent.messageFrm.showMessages(selTabId);");
		sb.append("parent.parent.parent.parent.parent.tempFrm.disableSaveButton('true');");
		sb.append("parent.parent.parent.parent.parent.tempFrm.disableSubmitButton('true');");
		sb.append("var frm = top.opener.parent.frames[1];");
		sb.append("frm.navigate (frm.location.href);");
		sb.append("</SCRIPT>");
		 return(sb);
	}
	/*Fix for compilation issue of ServiceRequest Method ends*/
	
	//Changes for call id 422914 STARTS
	private void psprt_issue_exp(HttpServletRequest req,AccountBO businessObject,SRMTypedAttrStringized Psprt_issue_date,SRMTypedAttrStringized Psprt_exp_date)throws Exception
	{
		Date psprtIssueDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Passport Number.txt_Issue_Date")); 
		Date psprtValidDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Passport Number.txt_Valid_Date")); 
	    if(Psprt_issue_date != null && !Psprt_issue_date.trim().equals("")) { 
	    businessObject.setPsprt_issue_date(ValidateDateFields(Psprt_issue_date)); 
	    }else{ 
	    businessObject.setPsprt_issue_date(psprtIssueDate); 
	    } 
	    if(Psprt_exp_date != null && !Psprt_exp_date.trim().equals("")) { 
	    businessObject.setPsprt_exp_date(ValidateDateFields(Psprt_exp_date)); 
	    }else{ 
	    businessObject.setPsprt_exp_date(psprtValidDate); 
	    } 
	}
	private void psprt_issue_exp_mod(HttpServletRequest req,AccountModBO businessObject,SRMTypedAttrStringized Psprt_issue_date,SRMTypedAttrStringized Psprt_exp_date)throws Exception
	{
		Date psprtIssueDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Passport Number.txt_Issue_Date")); 
		Date psprtValidDate = ValidateDateFields(SRMTypedAttrStringized.getReqParameter( req,"Passport Number.txt_Valid_Date")); 
	    if(Psprt_issue_date != null && !Psprt_issue_date.trim().equals("")) { 
	    businessObject.setPsprt_issue_date(ValidateDateFields(Psprt_issue_date)); 
	    }else{ 
	    businessObject.setPsprt_issue_date(psprtIssueDate); 
	    } 
	    if(Psprt_exp_date != null && !Psprt_exp_date.trim().equals("")) { 
	    businessObject.setPsprt_exp_date(ValidateDateFields(Psprt_exp_date)); 
	    }else{ 
	    businessObject.setPsprt_exp_date(psprtValidDate); 
	    } 
	}
	//Changes for call id 422914 ENDS
	
	private void incrementCount(int saveFlag,int acctId,String operationType,String bankID,Integer intMAccId)throws Exception
	{
		//Changes Done for Volume based Licensing - Starts
				//Fix for call id: 438919
				if (saveFlag==0 && acctId==0 && ((operationType.equalsIgnoreCase("null") ||operationType.equalsIgnoreCase("Create")) || operationType.equals("")))
				{
					LicenseWrapper.incrementRetail(bankID);
				}else if (saveFlag == 0 && (operationType!=null) && (operationType.equalsIgnoreCase("Queue")) && !(intMAccId != null && intMAccId.intValue() > 0))
				{
					LicenseWrapper.incrementRetail(bankID);
				}
		//Changes Done for Volume based Licensing - Ends
	}

	/************************ SwiftAddress start tracker : 132659 ***************************************/
	private String setSwiftFields(HttpServletRequest req,int k){


		String swiftData = null;
		swiftData=Utils.setGenericSwiftFields(req,k,',',"building","premiseno","locality");

		return swiftData;


}

		//End of method setSwiftFields()

//Changes for Tracker #303252 begin
	private void ValidateFreeTextAddress(List lstAddress1,List lstAddress2,List lstAddress3, int j, List lstAddressLine1, List lstAddressLine2, List lstAddressLine3, AccountModBO.Address NewAddressDet) throws SRMTypeValidatorException{
		if(lstAddressLine1 != null && j<lstAddress1.size()) {
			NewAddressDet.setAddress_Line1((((StringBuffer)lstAddress1.get(j)).toString()).trim());
		}else{
			NewAddressDet.setAddress_Line1(null);
		}

		if(lstAddressLine2 != null && j<lstAddress2.size()) {
			NewAddressDet.setAddress_Line2((((StringBuffer)lstAddress2.get(j)).toString()).trim());
		}else{
			NewAddressDet.setAddress_Line2(null);
		}
		if(lstAddressLine3 != null && j<lstAddress3.size()) {
			NewAddressDet.setAddress_Line3((((StringBuffer)lstAddress3.get(j)).toString()).trim());
		}else{
			NewAddressDet.setAddress_Line3(null);
		}
	}

//Changes for Tracker #303252 end

		//Changes for TrackerId 273030 begin
				public void setPreferredPhoneEmailType(AccountModBO businessObject)throws SRMTypeValidatorException{
								if(businessObject.getPreferredPhone() == null)
									businessObject.setPreferredPhoneType(null);

								if(businessObject.getPreferredEmail() == null)
									businessObject.setPreferredEmailType(null);
				}
		//Changes for TrackerId 273030 end
/* Changes for the TrackerId:273053 Starts */
private void addSwiftAddress(AccountBO.Address swiftAddressMain,AccountModBO.Address swiftAddressMod,
				HttpServletRequest req,String swiftData,String fullName,boolean editFlag) throws SRMTypeValidatorException{
/* Changes for the TrackerId:273053 ends */
		String swiftAddrType=null;
		String SwiftAddressDetails=null;
		String SwiftAddrLine2=null;
		String SwiftAddrLine3=null;
		String SwiftAddrLine1=null;
		// Rak Customization Changes for tracker id 193185 starts :Recon Ticket id :381295 Tracker id:232791
		String SwiftName=null;
		// Rak Customization Changes for tracker id 193185 ends: Recon Ticket id :381295 Tracker id:232791
		SwiftAddressDetails=req.getParameter("SwiftAddressDetails");

		//Changes for tracker id 251081 START---------------------------------------------------
			//We are putting this here because for Edit Entity, the old Swift Address was always
			//getting saved, since SwiftAddressDetails is got from parameters and that has the previous
			//Swift Address only. SwiftData that is passed to this function has the new one.
			//The function Utils.addGenericSwiftAddress will use the SwiftData only is SwiftAddressDetails
			//is "YYY", but this is only in case of making a new swift. So in case we are editing
			//I will just make SwiftAddressDetails=swiftData, so EDITED swift details are getting saved.
			/*Also, we have to append fullName to swiftData, since in case of SwiftAddressDetails, the
			first item in the list is supposed to be SwiftName.*/

			//changes for tracker 385462
			//swift details can be edited only from swift details button as per the functionality on higher urls
			/*if(editFlag){
			SwiftAddressDetails=fullName+"|"+swiftData;}*/
		//Changes for tracker id 251081 END-----------------------------------------------------

		ArrayList swiftList = Utils.addGenericSwiftAddress(SwiftAddressDetails,swiftData,fullName);

// Rak Customization Changes for tracker id 193185 starts--Added Null Checks :Recon Ticket id :381295 Tracker id:232791
		if(swiftList!=null){
			if(swiftList.get(0)!=null) {
			SwiftName=swiftList.get(0).toString();
	       }
// Rak Customization Changes for tracker id 193185 ends -- Added Null Checks :Recon Ticket id :381295 Tracker id:232791
		if(swiftList.get(1)!=null) {
		SwiftAddrLine1=swiftList.get(1).toString();
	}
		if(swiftList.get(2)!=null) {
			SwiftAddrLine2=swiftList.get(2).toString();
		}
		if(swiftList.get(3)!=null) {
			SwiftAddrLine3=swiftList.get(3).toString();
		   }
		}


	swiftAddrType="Swift";
	if(null!=swiftAddressMain){
		swiftAddressMain.setAddressCategory(swiftAddrType);
		if(is_valid_req_arg(SwiftName)){
			swiftAddressMain.setSwift_Name(SwiftName);
		}else{
			swiftAddressMain.setSwift_Name(null);
		}
		if(is_valid_req_arg(SwiftAddrLine1)){
			swiftAddressMain.setAddress_Line1(SwiftAddrLine1);
		}else{
			swiftAddressMain.setAddress_Line1(null);
		}
		if(is_valid_req_arg(SwiftAddrLine2)){
			swiftAddressMain.setAddress_Line2(SwiftAddrLine2);
		}else{
			swiftAddressMain.setAddress_Line2(null);
		}
		if(is_valid_req_arg(SwiftAddrLine3)){
			swiftAddressMain.setAddress_Line3(SwiftAddrLine3);
		}else{
			swiftAddressMain.setAddress_Line3(null);
		}
	}
	else if(null!=swiftAddressMod){
		swiftAddressMod.setAddressCategory(swiftAddrType);
		if(is_valid_req_arg(SwiftName)){
			swiftAddressMod.setSwift_Name(SwiftName);
		}else{
			swiftAddressMod.setSwift_Name(null);
		}
		if(is_valid_req_arg(SwiftAddrLine1)){
			swiftAddressMod.setAddress_Line1(SwiftAddrLine1);
		}else{
			swiftAddressMod.setAddress_Line1(null);
		}
		if(is_valid_req_arg(SwiftAddrLine2)){
			swiftAddressMod.setAddress_Line2(SwiftAddrLine2);
		}else{
			swiftAddressMod.setAddress_Line2(null);
		}
		if(is_valid_req_arg(SwiftAddrLine3)){
			swiftAddressMod.setAddress_Line3(SwiftAddrLine3);
		}else{
			swiftAddressMod.setAddress_Line3(null);
		}
	}
}//End of Method addSwiftAddress()
/************************ SwiftAddress End tracker : 132659 ***************************************/
	public void handleError(HttpServletResponse  resp, java.util.Locale locale, Throwable e,
			String module, String user)
	throws IOException, ServletException{
		PrintWriter out = resp.getWriter();
		if (resp.containsHeader("isQDE"))
		{
			throw new ServletException(e);
		}
		out.println("<SCRIPT language=javascript src=\"../common/js/SSOParameter.js \"></SCRIPT>");
		out.println("<SCRIPT>");
		e.printStackTrace();
		char[] escChars = {'"', '\''};
		out.println(" executionStatus = 'ERROR : " + Escaper.escape(MessageProvider.getUserMessage(e,locale), '\\', escChars) + "'");
		out.println("</SCRIPT>");
	}

	public  String RevertHashObj(String str){
		if(str == null){
			return null;
		}else if(str.equals("")){
			return null;
		}
		return str;
	}


	public static Date ValidateDateFields(SRMTypedAttrStringized srmTypedVar)
	throws SRMTypeConversionException{
		java.util.Date tmpDate = null;
		java.util.Date newTmpDate = null;
		long milliSec;
		Calendar cal = Calendar.getInstance();

		if((srmTypedVar!=null)&&(!srmTypedVar.equals(""))){
			cal.setTime(srmTypedVar.getFormatter2(context).stringToDate(srmTypedVar));
			tmpDate = cal.getTime();
			milliSec = tmpDate.getTime();
			milliSec += 12*60*60*1000;
			newTmpDate = new java.util.Date(milliSec);
		}else{
			newTmpDate = null;
		}
		return (newTmpDate);
	}
//Changes for tracker ID 457143 start
	public static Date ValidateDateTimeFields(SRMTypedAttrStringized srmTypedVar)
	throws SRMTypeConversionException{
		java.util.Date tmpDate = null;
		java.util.Date newTmpDate = null;
		long milliSec;
		Calendar cal = Calendar.getInstance();

		if((srmTypedVar!=null)&&(!srmTypedVar.equals(""))){
			cal.setTime(srmTypedVar.getFormatter2(context).stringToDate(srmTypedVar));
			tmpDate = cal.getTime();
			milliSec = tmpDate.getTime();

			newTmpDate = new java.util.Date(milliSec);
		}else{
			newTmpDate = null;
		}
		return (newTmpDate);
	}
//Changes for tracker ID 457143 end


	public static Integer ValidateIntFields(SRMTypedAttrStringized srmTypedVar)
	throws SRMTypeConversionException{
		if((srmTypedVar!=null)&&(!srmTypedVar.equals(""))){
			return (new Integer(srmTypedVar.getFormatter2(context).stringToInt(srmTypedVar)));
		} else {
			return null;
		}
	}


	public static Double ValidateDoubleFields(SRMTypedAttrStringized srmTypedVar)
	throws SRMTypeConversionException{
		if((srmTypedVar!=null)&&(!srmTypedVar.equals(""))){
			return (new Double(srmTypedVar.getFormatter2(context).stringToDouble(srmTypedVar)));
		} else {
			return null;
		}
	}

	public static String ValidateStringFields(String sVar){
		if(sVar != null && !sVar.trim().equals("")) {
			return sVar;
		} else {
			return null;
		}
	}
	public SRMRecordSet retreiveBO(SRMBusinessContext bc,String cls,String attrInfo,Object entityID) throws SRMBOException,SRMSecurityException,CISInvalidArgumentException
	{


		SRMRecordSet rs=null;
		try {
			SRMQueryBuilder qb = new SRMQueryBuilder();
			SRMQueryResult qr = null;
			Class cl=null;
			cl = ClassCache.getFromCache(boFullClassName(cls));
			SRMAttributeInfo ai = new SRMAttributeInfo(
					cl,
					attrInfo);

			qb.addJoinScope(IQuery.LogicalOperation_AND,
					ai,
					IQuery.JoinType_Equi,
					ai);

			TransFormFn tf = null; // for the lhs
			tf = new TransFormFn(ai); // for the lhs
			SRMQueryExpr lh = new SRMQueryExpr(tf);
			SRMQueryExpr rh = new SRMQueryExpr(entityID);
			qb.addCondition(IQuery.LogicalOperation_AND,
					lh,
					IQuery.ComparisonOperation_EQ,
					rh
			);
			qr = qb.runQuery(bc,true, 1);

			rs = qr.getRecordSet() ;
		}
		catch(CISInvalidArgumentException e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, e.getMessage());
			throw e;
		}
		catch(SRMSecurityException e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, e.getMessage());
			throw e;

		}
		catch(SRMBOException e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, e.getMessage());
			throw e;

		}
		return rs;
	}

	//This function returns the BO full class name.
	public String boFullClassName(String boName) {
		return "com.infy.cis.srmbo." + boName;
	}
	/***************** Save and Submit Changes : Start*************/
	public String getContactBmonth(String contactBmonth) {
		if(contactBmonth!=null){
		if(contactBmonth.equals("01")){
			contactBmonth="January";
		}
		else if(contactBmonth.equals("02")){
			contactBmonth="February";
		}
		else if(contactBmonth.equals("03")){
			contactBmonth="March";
		}
		else if(contactBmonth.equals("04")){
			contactBmonth="April";
		}
		else if(contactBmonth.equals("05")){
			contactBmonth="May";
		}

		else if(contactBmonth.equals("06")){
			contactBmonth="June";
		}
		else if(contactBmonth.equals("07")){
			contactBmonth="July";
		}
		else if(contactBmonth.equals("08")){
			contactBmonth="August";
		}

		else if(contactBmonth.equals("09")){
			contactBmonth="September";
		}
		else if(contactBmonth.equals("10")){
			contactBmonth="October";
		}
		else if(contactBmonth.equals("11")){
			contactBmonth="November";
		}
		else if(contactBmonth.equals("12")){
			contactBmonth="December";
		}
	}

		return contactBmonth;
	}
	/***************** Save and Submit Changes : End*************/


	//Tracker ID 113276 changes start
	/* Changes for the TrackerId:273053 Starts */
	public int getNoOfRemovedEdocs1(String strListOfEDocURL, String IDRemoved,int iNoOfEDocs,List lstEntityDocumentURL,List lstIDRemoved){
		lstEntityDocumentURL        = Utils.parseString(strListOfEDocURL,',');
		if(lstEntityDocumentURL!=null)
			iNoOfEDocs=lstEntityDocumentURL.size();
		//lstIDRemoved                = Utils.parseString(IDRemoved,',');
		int iNoOfRemovedEDocs			 = 0;
		if(lstIDRemoved != null)
		{
			iNoOfRemovedEDocs=lstIDRemoved.size();
		}
		return iNoOfRemovedEDocs;
	}
         /* Changes for the TrackerId:273053 ends */
		 // Ticket 268911 and Tracker 162384 : begin of changes
		/* Changes for the TrackerId:273053 Starts */
				public void getNoOfRemovedEdocs2( SRMBusinessContext bc,String IDRemoved,String operationType,List lstIDRemoved ){	//Fix for ticket 296275

	     /* Changes for the TrackerId:273053 ends */


				List lstIDRemovedTemp                = Utils.parseString(IDRemoved,',');
				int iNoOfRemovedEDocs			 = 0;
				String strDelID;
				String strDocModId;
				EntityDocumentModBO objEDocModNew;

                if(lstIDRemoved!=null)
				lstIDRemoved.clear();

				if(lstIDRemovedTemp != null)
				{
					iNoOfRemovedEDocs=lstIDRemovedTemp.size();
				}
				try{
				for(int i=0;i<iNoOfRemovedEDocs; i++){
				strDelID = (lstIDRemovedTemp.get(i)).toString();

				SRMQueryBuilder qbEDocModNew = new SRMQueryBuilder();
				//Fix for ticket 296275 starts
				QueryAssist.addJoin(qbEDocModNew, "EntityDocumentModBO", EntityDocumentModBO.ENTITYDOCUMENTID, "EntityDocumentModBO", EntityDocumentModBO.ENTITYDOCUMENTID, IQuery.JoinType_Equi);
				if(operationType!=null)
				if (operationType.equals("Queue")){
				QueryAssist.addSimpleCondition(qbEDocModNew, "EntityDocumentModBO", EntityDocumentModBO.ENTITYDOCUMENTID, IQuery.ComparisonOperation_EQ, strDelID);
					}
				else{
				QueryAssist.addSimpleCondition(qbEDocModNew, "EntityDocumentModBO", EntityDocumentModBO.MAIN_TABLE_ID, IQuery.ComparisonOperation_EQ, strDelID);
				}
				//Fix for ticket 296275 ends


				SRMQueryResult qrEDocModNew = qbEDocModNew.runQuery(bc , -1 );
				SRMRecordSet rsEDocModNew=qrEDocModNew.getRecordSet();

					if(rsEDocModNew.hasNext())
					{
					objEDocModNew=(EntityDocumentModBO)rsEDocModNew.getNext().get(0);
					strDocModId = objEDocModNew.getEntityDocumentID().toString();
					lstIDRemoved.add(strDocModId);

					}
				}
				}
				catch(Exception e)
				{
					lstIDRemoved = lstIDRemovedTemp;
				}



		}
	// Ticket 268911  and Tracker 162384: end of changes
	/* Changes for the TrackerId:273053 Starts */
		public void delEdoc1(int iNoOfRemovedEDocs,SRMBusinessContext bc,List lstIDRemoved)  throws Exception{
	/* Changes for the TrackerId:273053 ends */
		// this removes the already existing records from the db when deleted in edit mode
		if(lstIDRemoved != null && lstIDRemoved.size() > 0)
		{
			for(int iCnt=0; iCnt < iNoOfRemovedEDocs; iCnt++)
			{
				String strDelID = (lstIDRemoved.get(iCnt)).toString();
				//Core.deleteEntityDocumentMod (bc, new Integer(strDelID)); //204095
				Core.deleteEntityDocument (bc, new Integer(strDelID)); //204095
			}
		}
	}
	//Tracker ID 113276  identification changes end
		/* Changes for tracker 180240 start */
		/* Begin Changes Tracker id: 178897*/
		public void saveEdoc1(String copyFlag,SRMBusinessContext bc,CISSessionContext sc,HttpServletRequest req, int accoId,int iNoOfEDocs, String acctKey,List lstEntityDocumentURL,List lstEDocIsDirty,String coreCustId) throws Exception{
		/* End Changes Tracker id: 178897*/
		/* Changes for tracker 180240 end */
		EntityDocumentBO objEDoc = null;
        /* Changes for the TrackerId:273053 Starts */
				Object objSRMBOBase = null;
				EntityDocumentModBO objEDocMod = null;
		/* Changes for the TrackerId:273053 ends */
		for(int iCnt=0; iCnt < iNoOfEDocs; iCnt++)
		{

			String strEDocURL = new String((StringBuffer)lstEntityDocumentURL.get(iCnt)).trim();

			/* Changes for the TrackerId:273053 Starts */
						String strEDocIsDirty = new String((StringBuffer)lstEDocIsDirty.get(iCnt)).trim();
			/* Changes for the TrackerId:273053 ends */
			if(!(strEDocURL.equals("") || strEDocURL==null || strEDocURL.equals("null")||copyFlag.equalsIgnoreCase("Y")))
			{
				if(strEDocIsDirty!=null)
				if(strEDocIsDirty.equalsIgnoreCase("Y"))//strEDocIsDirty.equalsIgnoreCase("Y") added to update only the dirty records
				{
					objSRMBOBase = SRMURLResolver.getObject(bc, strEDocURL);
					if(objSRMBOBase instanceof EntityDocumentBO)
					{
						objEDoc = (EntityDocumentBO)objSRMBOBase;
					}
					else if(objSRMBOBase instanceof EntityDocumentModBO)
					{
						StringBuffer sbEDocURL=new StringBuffer("srmBOObj:EntityDocumentBO/EntityDocumentBO.EntityDocumentID:");
						sbEDocURL.append(((EntityDocumentModBO)objSRMBOBase).getMain_Table_ID().toString());
						objEDoc = (EntityDocumentBO)SRMURLResolver.getObject(bc, sbEDocURL.toString());
					}
				}
				//Tracker -165088 START
				else if(copyFlag!=null && copyFlag.equalsIgnoreCase("Y"))
				{
						objEDocMod= new EntityDocumentModBO();
				}
				//Tracker -165088 END
			}
			else
			{

				objEDoc= new EntityDocumentBO();
			}
			if(objEDoc!=null)
			{

				/*Core Dependency changes*/

				Utils.populateEntityDocument(objEDoc,
						new Integer(accoId),
						"CIFRetCust",
						req,
						acctKey,
						iCnt,sc,bc);
				/*Core Dependency changes*/
				/* Changes for tracker 180240 start */
				/* Begin Changes Tracker id: 178897*/
				objEDoc.setCore_Cust_ID(coreCustId);
				/* End Changes Tracker id: 178897*/
				/* Changes for tracker 180240 end */
                 //changes for callid 739410 starts
					try{
					callAccWriterHook_RelationAndDOC(req,objEDoc,null,iCnt,sc,null,null,bc);
			      }
			      catch(Exception e)
					{
						WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
					}
					//changes for callid 739410 ends
				Core.saveEntityDocument(bc, objEDoc);
				objEDoc=null;
			}
		}
	}



	//Tracker ID 113276  identification changes start
	/* Changes for the Trackerid:273053 Starts */
		public void delEdoc2(SRMBusinessContext bc, int iNoOfRemovedEDocs,List lstIDRemoved)  throws Exception{
	/* Changes for the Trackerid:273053 ends */
		// this removes the already existing records from the db when deleted in edit mode
		if(lstIDRemoved != null && lstIDRemoved.size() > 0)
		{
			for(int iCnt=0; iCnt < iNoOfRemovedEDocs; iCnt++)
			{
				String strDelID = (lstIDRemoved.get(iCnt)).toString();
				//Core.deleteEntityDocument (bc, new Integer(strDelID)); //204095
				Core.deleteEntityDocumentMod (bc, new Integer(strDelID)); //204095
			}
		}
	}
/* Changes for tracker 180240 start */
/* Ticket id 207511 changes start */
/* Begin Changes Tracker id: 178897*/
public void saveEdoc2(AccountModBO accModBO , int mainID , boolean apprFlag ,SRMBusinessContext bc,CISSessionContext sc, HttpServletRequest req, int accoId, int iNoOfEDocs, String acctKey, String operationType,List lstEntityDocumentURL,List lstEDocIsDirty,String coreCustId) throws Exception{
	/* End Changes Tracker id: 178897*/
/* Ticket id 207511 changes end */
/* Changes for tracker 180240 end */
			String copyFlag = req.getParameter("isCopy");
	EntityDocumentModBO objEDocMod = null;
	/* Changes for the Trackerid:273053 Starts */
		EntityDocumentBO objEDoc = null;
		String strEDocIsDirty = "";
		SRMQueryBuilder qbEDocMod = null;
		SRMQueryResult qrEDocMod = null;
		SRMRecordSet rsEDocMod = null;
		Object objSRMBOBase = null;
	/* Changes for the Trackerid:273053 ends */
		for(int iCnt=0; iCnt < iNoOfEDocs; iCnt++)
		{
			String strEDocURL = new String((StringBuffer)lstEntityDocumentURL.get(iCnt)).trim();
			//Tracker 195897 changes
           if(lstEDocIsDirty!=null)
			strEDocIsDirty = new String((StringBuffer)lstEDocIsDirty.get(iCnt)).trim();

			if(!(strEDocURL.equals("") || strEDocURL==null || strEDocURL.equals("null")))
			{
				if(strEDocIsDirty!=null)
				if(strEDocIsDirty.equalsIgnoreCase("Y"))//strEDocIsDirty.equalsIgnoreCase("Y") added to update only the dirty records
				{
					objSRMBOBase = SRMURLResolver.getObject(bc, strEDocURL);

					if(objSRMBOBase instanceof EntityDocumentBO)
					{
						objEDoc = (EntityDocumentBO)objSRMBOBase;
	//checking exisiting mod EntityDocument
						qbEDocMod = new SRMQueryBuilder();
						QueryAssist.addJoin(qbEDocMod, "EntityDocumentModBO", EntityDocumentModBO.ENTITYDOCUMENTID, "EntityDocumentModBO", EntityDocumentModBO.ENTITYDOCUMENTID, IQuery.JoinType_Equi);
						QueryAssist.addSimpleCondition(qbEDocMod, "EntityDocumentModBO", EntityDocumentModBO.MAIN_TABLE_ID, IQuery.ComparisonOperation_EQ, objEDoc.getEntityDocumentID().toString());
						qrEDocMod = qbEDocMod.runQuery(bc , -1 );
						rsEDocMod=qrEDocMod.getRecordSet();
						if(rsEDocMod.hasNext())
						{
							objEDocMod=(EntityDocumentModBO)rsEDocMod.getNext().get(0);
							objEDocMod=Core.getShadowBO(objEDoc, objEDocMod);
						}
	//checking exisiting mod EntityDocument

					}
					else if(objSRMBOBase instanceof EntityDocumentModBO)
					{
						objEDocMod = (EntityDocumentModBO)objSRMBOBase;
					}
				}
				//Tracker -165088 START
					else if(copyFlag!=null && copyFlag.equalsIgnoreCase("Y"))
					{
						objEDocMod= new EntityDocumentModBO();
					}
				//Tracker -165088 END
			}
			else
			{

				objEDocMod= new EntityDocumentModBO();
			}
			//Ticket Id 201736 : Begin
			//In case apprFlag is false and copy flag is true , saveEntityDocumentMod is called above from copyFromMainToModEDoc function
			if(objEDocMod!=null)

			{

				//Ticket Id 201736 : End
				/*Core Dependency changes*/

				Utils.populateEntityDocumentMod(objEDocMod,
						new Integer(accoId),
						"CIFRetCust",
						req,
						acctKey,
						iCnt,sc,bc);
				/*Core Dependency changes*/
				/* Changes for tracker 180240 start */
				/* Begin Changes Tracker id: 178897*/
				objEDocMod.setCore_Cust_ID(coreCustId);
				/* End Changes Tracker id: 178897*/
				/* Changes for tracker 180240 end */
                //changes for callid 739410 starts
					try{
					callAccWriterHook_RelationAndDOC(req,null,objEDocMod,iCnt,sc,null,null,bc);
			      }
			      catch(Exception e)
					{
						WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
					}
					//changes for callid 739410 ends
				Core.saveEntityDocumentMod(bc, objEDocMod);
				objEDocMod=null;
			}
		}
	}



	/* Tracker ID 113276 changes start */




	/* Changes for WFlow POC -- start */
	public void callAccWriterHook(AccountModBO businessObjectMod, DemographicModBO DemoModBOMinor, PsychographicModBO PsychoModBOMinor, TradeFinanceModBO TFModBO, CoreInterfaceModBO coreObjectMod, HttpServletRequest req, SRMBusinessContext bc)  throws ClassNotFoundException, WriterHookException, Exception {

		try {
			//SRMBusinessContext bc = Utils.getTransactedBusinessContext(req);
			Object classOb = getFromCache(HOOK_CLASS_NAME);
			Class AccWritHkClass = null;

			if (classOb == null) {
				AccWritHkClass = Class.forName("com.infy.cis.custom.QDECustomerWriter_Hook");
				classOb = AccWritHkClass.newInstance();
				putInCache(HOOK_CLASS_NAME,classOb);
			} else {
				AccWritHkClass = classOb.getClass();
			}


			if (classOb != null) {
				HashMap HookParams = new HashMap();
				HookParams.put("AccountModBO", businessObjectMod);
				HookParams.put("DemographicModBO", DemoModBOMinor);
				HookParams.put("PsychographicModBO", PsychoModBOMinor);
				HookParams.put("TradeFinanceModBO", TFModBO);
				HookParams.put("CoreInterfaceModBO", coreObjectMod);
				Method CustWritHkMeth = AccWritHkClass.getMethod("callQDECustWriter_Hook", new Class[]{HashMap.class, SRMBusinessContext.class});
				if (CustWritHkMeth == null) {
					throw new WriterHookException("MSGEXC0206","Writer Hook method not obtained");
				}
				try {
					CustWritHkMeth.invoke(classOb, new Object[]{HookParams, bc});
				}
				catch(Exception e) {
					throw new WriterHookException("MSGEXC0206","Not able to invoke writer hook method "+e);
				}
			}
		}
		catch(ClassNotFoundException cle) {
		}
		catch(WriterHookException whe) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : WriterHookException"+whe);
		}
		catch(Exception e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : Exception"+e);
		}

	}
	/* Changes for WFlow POC -- end */
	/* Changes for CIF CORE POC -- start */
	//changes for callid 739410 starts
	public static void callAccWriterHook_RelationAndDOC(HttpServletRequest req,EntityDocumentBO objEDoc,EntityDocumentModBO objEDocMod,int  iCnt,CISSessionContext sc,RelationshipBO.MiscellaneousInfo MiscellInfo_New,RelationshipModBO RelModBO,SRMBusinessContext bc) throws ClassNotFoundException, WriterHookException, Exception {
		try {
			//SRMBusinessContext bc = Utils.getTransactedBusinessContext(req);

			Object classOb = getFromCache(HOOK_CLASS_NAME);
			Class AccWriterHkClass = null;

			if (classOb == null) {
				AccWriterHkClass = Class.forName("com.infy.cis.custom.AccWriterHook");
				classOb = AccWriterHkClass.newInstance();
				putInCache(HOOK_CLASS_NAME,classOb);
			} else {
				AccWriterHkClass = classOb.getClass();
			}

			if (classOb != null) {
					ConcurrentHashMap HookParams = new ConcurrentHashMap();

					HookParams.put("req", req);
					HookParams.put("EntityDocumentBO", objEDoc);
					HookParams.put("EntityDocumentModBO", objEDocMod);
					HookParams.put("iCnt", iCnt);
					HookParams.put("RelationshipBO.MiscellaneousInfo", MiscellInfo_New);
					HookParams.put("RelationshipModBO", RelModBO);
					Method AccWriterHkMeth=null;
					if(MiscellInfo_New!=null)
					AccWriterHkMeth = AccWriterHkClass.getMethod("SubmitMinorField", new Class[]{ConcurrentHashMap.class, SRMBusinessContext.class, CISSessionContext.class});
			        else if(objEDoc!=null)
					AccWriterHkMeth = AccWriterHkClass.getMethod("SaveEntityDocument", new Class[]{ConcurrentHashMap.class, SRMBusinessContext.class, CISSessionContext.class});
                    else if(objEDocMod!=null)
                    AccWriterHkMeth = AccWriterHkClass.getMethod("SaveEntityDocumentMod", new Class[]{ConcurrentHashMap.class, SRMBusinessContext.class, CISSessionContext.class});
					else if(RelModBO!=null)
                    AccWriterHkMeth = AccWriterHkClass.getMethod("saveMinorRelationMod", new Class[]{ConcurrentHashMap.class, SRMBusinessContext.class, CISSessionContext.class});


					if (AccWriterHkMeth == null) {
						throw new WriterHookException("MSGEXC0206","Writer Hook method not obtained");
					}
					try {
						AccWriterHkMeth.invoke(classOb, new Object[]{HookParams,bc,sc});
					}
					catch(Exception e) {
						throw new WriterHookException("MSGEXC0206","Not able to invoke Writer Hook method");
					}
			}
		}
		catch(ClassNotFoundException cle) {
			
		}
		catch(WriterHookException whe) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : WriterHookException"+whe);
		}
		catch(Exception e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : Exception"+e);
		}
	}
	//changes for callid 739410 ends
	public void callCustWriterHook(AccountBO businessObject, DemographicBO DemoBO, PsychographicBO PsychoBO, TradeFinanceBO TFBO, CoreInterfaceBO coreObject, HttpServletRequest req, SRMBusinessContext bc)  throws ClassNotFoundException, WriterHookException, Exception {

		try {
			//SRMBusinessContext bc = Utils.getTransactedBusinessContext(req);
			Object classOb = getFromCache(HOOK_CLASS_WRITER);
			Class CustWritHkClass = null;

			if (classOb == null) {
				CustWritHkClass = Class.forName("com.infy.cis.custom.CustomerWriterHook");
				classOb = CustWritHkClass.newInstance();
				putInCache(HOOK_CLASS_WRITER,classOb);
			} else {
				CustWritHkClass = classOb.getClass();
			}

			if (classOb != null) {
					HashMap objParams = new HashMap();
					//665901 changes starts
					objParams.put("req",req);
					//665901 changes ends
					objParams.put("AccountBO", businessObject);
					objParams.put("DemographicBO", DemoBO);
					objParams.put("PsychographicBO", PsychoBO);
					objParams.put("TradeFinanceBO", TFBO);
					objParams.put("CoreInterfaceBO", coreObject);
					Method CustWritHkMeth = CustWritHkClass.getMethod("callFItoCore", new Class[]{HashMap.class, SRMBusinessContext.class});
					if (CustWritHkMeth == null) {
						throw new WriterHookException("MSGEXC0206","Writer Hook method not obtained");
					}
					try {
						CustWritHkMeth.invoke(classOb, new Object[]{objParams, bc});
				    }
				    catch(Exception e) {
						throw new WriterHookException("MSGEXC0206","Not able to invoke writer hook method "+e);
					}
			}
		}
		catch(ClassNotFoundException cle) {
		}
		catch(WriterHookException whe) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : WriterHookException"+whe);
		}
		catch(Exception e) {
			WebAdaptor.log(com.infy.cis.log.LogType.DEBUG, "AccWriter : Exception"+e);
		}

	}
	/* Changes for CIF CORE POC -- end */

	/**
	 * @semantics 	        putInCache - caches the AccWriter hook's instance
	 * @param hookClassName	String which is going to be the ObjectId while caching the *                       AccWriter hook's instance
	 * @param classObj	    AccWriter hook's instance
	 * @return Object		AccWriter hook's instance
	 * @throws 		        none
	 * @see			        n/a
	 */
	private static Object putInCache(String hookClassName, Object classObj) {
		return (Object)CacheService.getHandle().put(hookClassName, classObj);
	}

	/**
	 * @semantics 	        getFromCache - gets the cached AccWriter hook's
	 *                       instance using the hookclass name
	 * @param hookClassName	String which is used to retrive the cached
	 *                       AccWriter hook's instance
	 * @return Object		AccWriter hook's instance
	 * @throws 		        none
	 * @see			        n/a
	 */
	private static Object getFromCache(String hookClassName) {
		return (Object)CacheService.getHandle().get(hookClassName);
	}




	private static Date getParsedDate(String userDate1,CISSessionContext sc) throws Exception
	{

		java.util.Date tmpDate_cif = null;
		Calendar cal_cif = Calendar.getInstance();
		long milliSec;
		int deltaTime_cif = sc.getClientTimeDiff();
		java.util.Date newTmpDate_cif = null;
		SRMFormatter srfm = SRMFormatter.getObjectInstance(java.util.Locale.getDefault());

		cal_cif.setTime((Date)srfm.stringToDate(userDate1));
		tmpDate_cif = cal_cif.getTime();
		milliSec = tmpDate_cif.getTime();
		milliSec -= deltaTime_cif * 1000 * 60;
		milliSec +=(12*60*60*1000);
		newTmpDate_cif = new java.util.Date(milliSec);

		return newTmpDate_cif;




	}
    public static void setValues(ContactBO businessObjectCont) throws Exception {
		businessObjectCont.setNegated(Constants.ENTITYSTATUS_NO);
		businessObjectCont.setRecordStatus(Constants.RECORDSTATUS_ACTIVE);
		businessObjectCont.setSuspended(Constants.ENTITYSTATUS_NO);
    	businessObjectCont.setBlackListed(Constants.ENTITYSTATUS_NO);
    	businessObjectCont.setCONVFLAG(Constants.ENTITYSTATUS_NO);
    }
/*Changes for Tracker 154769 Begin for Code merge code too large issue*/
/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
 	/*private static void setValuesForMod(ContactModBO businessObjectContMod) throws Exception {
		businessObjectContMod.setRecordStatus("M");
		businessObjectContMod.setNegated(Constants.ENTITYSTATUS_NO);
		businessObjectContMod.setSuspended(Constants.ENTITYSTATUS_NO);
		businessObjectContMod.setBlackListed(Constants.ENTITYSTATUS_NO);
    }*/
/*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/
	private static void setValuesForAcc(AccountBO businessObjectAcc) throws Exception {

		businessObjectAcc.setNegated(Constants.ENTITYSTATUS_NO);
		businessObjectAcc.setSuspended(Constants.ENTITYSTATUS_NO);
		businessObjectAcc.setBlackListed(Constants.ENTITYSTATUS_NO);

	}

/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
	/*private static void setValuesForAccMod(AccountModBO businessObjectAccMod) throws Exception {

			businessObjectAccMod.setNegated(Constants.ENTITYSTATUS_NO);
			businessObjectAccMod.setSuspended(Constants.ENTITYSTATUS_NO);
			businessObjectAccMod.setBlackListed(Constants.ENTITYSTATUS_NO);*/
		/*Changes for Tracker 154769  End*/
//	}
/*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/

	/*ticket id: 272220 Changes start */
	 //Ticket 367108 changes signature changed
		private static void setValuesForMinorCust(SRMBusinessContext bc, SRMBOBase introBusinessObject,
		String sChildEntityID,Integer iParentEntityID,String sChildEntity, String acctKey,
		String coreCustId, Boolean apprFlag, HttpServletRequest req,String sCore_child_cust_id,
		String ctKey,String guardCode, String altLocaleActv,AccountModBO accModBO) throws Exception {

					int iChildEntityId =  Integer.parseInt(sChildEntityID);
					RelationshipBO relBO=new RelationshipBO();
                    //Ticket 367108 changes begin
					String strLastName = "";
					String strFistName = "";
					String strGender = "";
					Date dtDOB = new Date() ;
					//Ticket 367108 changes	end
					relBO.setParentEntity("CUSTOMER");
					relBO.setChildEntity(sChildEntity);
					relBO.setParentEntityID(iParentEntityID);
					relBO.setChildEntityID(new Integer(iChildEntityId));
					relBO.setRelationship("Guardian");
					relBO.setOrgKey(acctKey);
					/*Fix for ticket 380741 begin*/
					relBO.setParentCIFID(acctKey);
					relBO.setChildCIFID(ctKey);
					/*Fix for ticket 380741 end*/
					relBO.setParentEntityType("Retail");
					relBO.setChildEntityType("Retail");
					relBO.setCore_cust_id(coreCustId);
				    relBO.setRelationship_Category("Social");

					if(sChildEntity!=null)
					if(sChildEntity.equalsIgnoreCase("CUSTOMER"))
					{
					//Ticket 367108 changes begin
                        introBusinessObject = (AccountBO)Utils.getBOFromID(bc,"AccountBO",AccountBO.ACCOUNTID,sChildEntityID);
						sCore_child_cust_id = ((AccountBO)introBusinessObject).getCore_cust_id();
						relBO.setCore_child_cust_id(sCore_child_cust_id);
						strLastName=	((AccountBO)introBusinessObject).getCust_Last_Name ();
						 strFistName=	((AccountBO)introBusinessObject).getCust_First_Name();
						 strGender  =	((AccountBO)introBusinessObject).getGender();
					 	dtDOB  	=	((AccountBO)introBusinessObject).getCust_DOB();
					}

					else if(sChildEntity.equalsIgnoreCase("PROSPECT"))
					{
						introBusinessObject = (SuspectBO)Utils.getBOFromID(bc,"SuspectBO",SuspectBO.SUSPECTID,sChildEntityID);
						 strLastName=	((SuspectBO)introBusinessObject).getLastName();
						 strFistName=	((SuspectBO)introBusinessObject).getFirstName();
						 strGender  =	((SuspectBO)introBusinessObject).getGender();
						 dtDOB  	=	((SuspectBO)introBusinessObject).getSuspects_DOB();
					}

					else if(sChildEntity.equalsIgnoreCase("CONTACT"))
					{
						introBusinessObject = (ContactBO)Utils.getBOFromID(bc,"ContactBO",ContactBO.CONTACTID,sChildEntityID);
						 strLastName=	((ContactBO)introBusinessObject).getLastName();
						 strFistName=	((ContactBO)introBusinessObject).getFirstName();
						 strGender  =	((ContactBO)introBusinessObject).getGender();
						 dtDOB  	=	((ContactBO)introBusinessObject).getDOB();

					 //Ticket 367108 changes end
					}
					/*Changes for tracker 221902 starts*/
					/*if(ctKey !=null && !ctKey.equals("")){
						if(ctKey.length() > 9){
					 relBO.setCore_child_cust_id(ctKey.substring(0,9));
					 } else {
					 relBO.setCore_child_cust_id(ctKey);
						 }
					}*/
					/*Changes for tracker 221902 ends*/
					relBO.setGuard_Code(guardCode);

					if(altLocaleActv!=null)
					if (altLocaleActv.equalsIgnoreCase("true") )
					{
						relBO = (com.infy.cis.srmbo.RelationshipBO)DualFieldSetter.invokeSetterMethods("RelationshipBO",relBO,req);
					}
					/*ticket id: 351073 Changes start */


					SRMCollection MiscellInfo = relBO.getMiscellaneousInfo();
				    RelationshipBO.MiscellaneousInfo MiscellInfo_New = (RelationshipBO.MiscellaneousInfo)relBO.getInstance("MiscellaneousInfo");

					MiscellInfo_New.setType("Guardian");
					relBO.setGuard_Code(guardCode);

					if(strLastName != null) {
					MiscellInfo_New.setStrText3(strLastName);
										    }
					if(strFistName != null) {
					MiscellInfo_New.setStrText2(strFistName);
											}
					if(strGender != null)   {
					MiscellInfo_New.setStrText4(strGender);
											}
					if(dtDOB != null)       {
					MiscellInfo_New.setDtDate3(dtDOB);
											}
       //changes for callid 739410 starts
						try{
							
					callAccWriterHook_RelationAndDOC(req,null,null,-1,null,MiscellInfo_New,null,bc);
			      }
			      catch(Exception e)
					{
						WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,e.getMessage());
					}
					//changes for callid 739410  ends
					MiscellInfo.add(MiscellInfo_New);

			//changes for tracker 419294 vector clean up begin
					ArrayList vSavingObj = new ArrayList();
					vSavingObj.add(relBO);
				//changes for tracker 419294 vector clean up ends
					com.infy.cis.srmbo.Core.saveRelationship( bc, vSavingObj,"N");


		}
	/*ticket id: 272220 Changes End */

	/* CRM102ST: TrackerID:163399 Being of Change*/
	/*Changes for Ticketid:-326876(Begin for code too large issue)Code moved to AccModHelper*/
	/*private PsychographicModBO findPsychographicModBO(SRMBusinessContext bc,boolean editFlag,String accountURL,AccountModBO boAccountMod,int modAccId ) throws Exception{
		PsychographicModBO PsychoBO = null;
		if(!editFlag)
		{
			if((accountURL!=null)&&(!accountURL.equals("") && boAccountMod!=null))
			{
				PsychoBO= (PsychographicModBO)Utils.getBOFromID(bc,"PsychographicModBO",PsychographicModBO.ACCOUNTID, boAccountMod.getAccountID());
			}else{
				PsychoBO = new PsychographicModBO();
			}
		}
		else{
			PsychoBO= (PsychographicModBO)Utils.getBOFromID(bc,"PsychographicModBO",PsychographicModBO.ACCOUNTID, new Integer(modAccId));
		}
		return PsychoBO;
	}*/
	/* CRM102ST: TrackerID:163399 End of Change*/
	/*Changes for Ticketid:-326876(End for code too large issue)Code moved to AccModHelper*/

/* below method added to remove defect in Techonline 136690 */
		
		//Chnages for TOL 709277
/*	private TradeFinanceBO truncateAddFields(TradeFinanceBO TFBO, String Addr1, String Addr2, String Addr3)
	throws com.infy.cis.exception.SRMTypeValidatorException
	{
		if(Addr1.length()>45)			Addr1 = Addr1.substring(0,44);
		if(Addr2.length()>45)			Addr2 = Addr2.substring(0,44);
		if(Addr3.length()>45)			Addr3 = Addr3.substring(0,44);
		TFBO.setAddr_1(Addr1);
		TFBO.setAddr_2(Addr2);
		TFBO.setAddr_3(Addr3);

		return TFBO;
	}

	private TradeFinanceModBO truncateAddFields(TradeFinanceModBO TFBO, String Addr1, String Addr2, String Addr3)
	throws com.infy.cis.exception.SRMTypeValidatorException
	{
		if(Addr1.length()>45)			Addr1 = Addr1.substring(0,44);
		if(Addr2.length()>45)			Addr2 = Addr2.substring(0,44);
		if(Addr3.length()>45)			Addr3 = Addr3.substring(0,44);
		TFBO.setAddr_1(Addr1);
		TFBO.setAddr_2(Addr2);
		TFBO.setAddr_3(Addr3);

		return TFBO;
	}*
	/* above method added to remove defect in Techonline 136690 */
	/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x begin*/
	public void setIsAddrVerFlagVal(HttpServletRequest req, AccountBO.Address addrInst, AccountModBO.Address addrInstMod,  int iCounter)throws Exception{
		String IsAddressVerified = req.getParameter("IsAddressVerified");
		List lstIsAddressVerified 	= Utils.parseString(IsAddressVerified,',');
		if (addrInst != null) {
			if( null != lstIsAddressVerified && iCounter<lstIsAddressVerified.size() &&
						is_valid_req_arg(((StringBuffer)lstIsAddressVerified.get(iCounter)).toString())) {
					addrInst.setIsAddressVerified((((StringBuffer)lstIsAddressVerified.get(iCounter)).toString()).trim());
			} else {
					addrInst.setIsAddressVerified(null);
			}
		} else if (addrInstMod != null) {
			if( null != lstIsAddressVerified && iCounter<lstIsAddressVerified.size() &&
						is_valid_req_arg(((StringBuffer)lstIsAddressVerified.get(iCounter)).toString())) {
					addrInstMod.setIsAddressVerified((((StringBuffer)lstIsAddressVerified.get(iCounter)).toString()).trim());
			} else {
					addrInstMod.setIsAddressVerified(null);
			}
		}

	}
	/*Tracker Id: 267465, Changes for PAF enhancement from 10.3.x end*/
	/* 10.2 SPE Changes - Method to query for Agent ID from Login ID and cache the same */
	public Integer getAgentIDfromLoginID(SRMBusinessContext bc, String sLoginID) throws Exception {

		Integer iAgentID = AgentCache.getAgentIDFromCache(sLoginID);
		if(iAgentID == null){
			ArrayList attrList = new ArrayList();
			attrList.add(QueryAssist.getTransformFn("AgentBO",AgentBO.AGENTID));

			SRMQueryBuilder qbAgentID = QueryAssist.singleObjectQuery("AgentBO",AgentBO.AGENTID,QB_AGENT);
			QueryAssist.addSimpleCondition(qbAgentID,"AgentBO", AgentBO.LOGINID,IQuery.ComparisonOperation_EQ, sLoginID);
			qbAgentID.addAttribScope((TransFormFn) attrList.get(0));
			SRMQueryResult qrAgentID = qbAgentID.runQuery(bc, false, -1);
			SRMRecordSet rsAgentID= qrAgentID.getRecordSet();

			if(rsAgentID.hasNext()){
				ArrayList agentIDLst = (ArrayList)rsAgentID.getNext();
				if(!agentIDLst.isEmpty()){
					iAgentID = (Integer)agentIDLst.get(0);
				}
			}
			if(iAgentID!=null){
				AgentCache.putInAgentIDCache(sLoginID,iAgentID);
			}
		}
		return iAgentID;

	}

private void setPhoneDetails(AccountBO businessObject, String currWorkWorkPhone, String currHomeHomePhone, String currMailingCellPhone, String currWorkFaxNo,
String currWorkURL, String currWorkEmail, String currHomeEmail, String currMailingEmailPalm, String currMailingCity, String currWorkExtension,String currMailingState, String currMailingCountry, String currMailingZip,String byPassFlag) throws Exception
{

			if((currWorkWorkPhone!=null)&&(!currWorkWorkPhone.equalsIgnoreCase(""))&&(!currWorkWorkPhone.equalsIgnoreCase("null")) && (!byPassFlag.equalsIgnoreCase("Y")))
			// Changes for call id 422173 starts here
			businessObject.setPhone(currWorkWorkPhone.trim());
			// Changes for call id 422173 ends here
			 else
			businessObject.setPhone("");
			if((currHomeHomePhone!=null)&&(!currHomeHomePhone.equalsIgnoreCase(""))&&(!currHomeHomePhone.equalsIgnoreCase("null")) && (!byPassFlag.equalsIgnoreCase("Y")))
			// Changes for call id 419613 starts here
			businessObject.setPhone_Home(currHomeHomePhone.trim());
			// Changes for call id 419613 ends here
			else
			businessObject.setPhone_Home("");
			if((currMailingCellPhone!=null)&&(!currMailingCellPhone.equalsIgnoreCase(""))&&(!currMailingCellPhone.equalsIgnoreCase("null")) && (!byPassFlag.equalsIgnoreCase("Y")))
			//Changes for call id 419613 starts here
			businessObject.setPhone_Cell(currMailingCellPhone.trim());
			// Changes for call id 419613 ends here
			else
			businessObject.setPhone_Cell("");
			if((currWorkFaxNo!=null)&&(!currWorkFaxNo.equalsIgnoreCase(""))&&(!currWorkFaxNo.equalsIgnoreCase("null")) && (!byPassFlag.equalsIgnoreCase("Y")))
			businessObject.setFax(currWorkFaxNo);
           else
			businessObject.setFax("");
			if((currWorkURL!=null)&&(!currWorkURL.equalsIgnoreCase(""))&&(!currWorkURL.equalsIgnoreCase("null")))
			businessObject.setCompanyURL(currWorkURL);
           else
			businessObject.setCompanyURL("");
			if((currWorkEmail!=null)&&(!currWorkEmail.equalsIgnoreCase(""))&&(!currWorkEmail.equalsIgnoreCase("null")))
			// Changes for call id 422173 starts here
			businessObject.setEmail(currWorkEmail.trim());
			// Changes for call id 422173 ends here
            else
			businessObject.setEmail("");
			if((currHomeEmail!=null)&&(!currHomeEmail.equalsIgnoreCase(""))&&(!currHomeEmail.equalsIgnoreCase("null")))
			// Changes for call id 419613 starts here
			businessObject.setEmail_Home(currHomeEmail.trim());
			// Changes for call id 419613 ends here
            else
			   businessObject.setEmail_Home("");
			if((currMailingEmailPalm!=null)&&(!currMailingEmailPalm.equalsIgnoreCase(""))&&(!currMailingEmailPalm.equalsIgnoreCase("null")))
			businessObject.setEmail_Palm(currMailingEmailPalm);
	else
			businessObject.setEmail_Palm("");
			//Changes for Ticket id 416778 and Tracker id 253211 Recon tracker id 207032 starts
			if((currMailingCity!=null)&&(!currMailingCity.equalsIgnoreCase(""))&&(!currMailingCity.equalsIgnoreCase("null")))
			businessObject.setCity(currMailingCity.trim());
			if((currWorkExtension!=null)&&(!currWorkExtension.equalsIgnoreCase(""))&&(!currWorkExtension.equalsIgnoreCase("null")))
			businessObject.setExtension(currWorkExtension);

			if((currMailingState!=null)&&(!currMailingState.equalsIgnoreCase(""))&&(!currMailingState.equalsIgnoreCase("null")))
			businessObject.setState(currMailingState.trim());
			if((currMailingCountry!=null)&&(!currMailingCountry.equalsIgnoreCase(""))&&(!currMailingCountry.equalsIgnoreCase("null")))
			businessObject.setCountry(currMailingCountry.trim());
			if((currMailingZip!=null)&&(!currMailingZip.equalsIgnoreCase(""))&&(!currMailingZip.equalsIgnoreCase("null")))
			businessObject.setZip(currMailingZip.trim());
			//Changes for Ticket id 416778 and Tracker id 253211 Recon tracker id 207032 ends

}


private void setPhoneDetails(AccountModBO businessObject, String currWorkWorkPhone, String currHomeHomePhone, String currMailingCellPhone, String currWorkFaxNo,
String currWorkURL, String currWorkEmail, String currHomeEmail, String currMailingEmailPalm, String currMailingCity, String currWorkExtension,String currMailingState, String currMailingCountry, String currMailingZip) throws Exception
{
			//Changes for call id 313902 STARTS
			if((currWorkWorkPhone!=null)&&(!currWorkWorkPhone.equalsIgnoreCase(""))&&(!currWorkWorkPhone.equalsIgnoreCase("null")))
			// Changes for call id 422173 starts here
			{businessObject.setPhone(currWorkWorkPhone.trim());}
			// Changes for call id 422173 ends here
			else{businessObject.setPhone(null);}
			if((currHomeHomePhone!=null)&&(!currHomeHomePhone.equalsIgnoreCase(""))&&(!currHomeHomePhone.equalsIgnoreCase("null")))
			// Changes for call id 419613 starts here
			{businessObject.setPhone_Home(currHomeHomePhone.trim());}
			//Changes for call id 419613 ends here
			else{businessObject.setPhone_Home(null);}
			if((currMailingCellPhone!=null)&&(!currMailingCellPhone.equalsIgnoreCase(""))&&(!currMailingCellPhone.equalsIgnoreCase("null")))
			// Changes for call id 419613 starts here
			{businessObject.setPhone_Cell(currMailingCellPhone.trim());}
			// Changes for call id 419613 ends here
			else{businessObject.setPhone_Cell(null);}
			if((currWorkFaxNo!=null)&&(!currWorkFaxNo.equalsIgnoreCase(""))&&(!currWorkFaxNo.equalsIgnoreCase("null")))
			{businessObject.setFax(currWorkFaxNo);}
			else{businessObject.setFax(null);}
			if((currWorkURL!=null)&&(!currWorkURL.equalsIgnoreCase(""))&&(!currWorkURL.equalsIgnoreCase("null")))
			{businessObject.setCompanyURL(currWorkURL);}
			else{businessObject.setCompanyURL(null);}
			if((currWorkEmail!=null)&&(!currWorkEmail.equalsIgnoreCase(""))&&(!currWorkEmail.equalsIgnoreCase("null")))
			// Changes for call id 422173 starts here
			{businessObject.setEmail(currWorkEmail.trim());}
			// Changes for call id 422173 ends here
			else{businessObject.setEmail(null);}
			if((currHomeEmail!=null)&&(!currHomeEmail.equalsIgnoreCase(""))&&(!currHomeEmail.equalsIgnoreCase("null")))
			// Changes for call id 419613 starts here
			{businessObject.setEmail_Home(currHomeEmail.trim());}
			// Changes for call id 419613 ends here
			else{businessObject.setEmail_Home(null);}
			if((currMailingEmailPalm!=null)&&(!currMailingEmailPalm.equalsIgnoreCase(""))&&(!currMailingEmailPalm.equalsIgnoreCase("null")))
			{businessObject.setEmail_Palm(currMailingEmailPalm);}
			else{businessObject.setEmail_Palm(null);}
			//Changes for Ticket id 416778 and Tracker id 253211 Recon tracker id 207032 starts
			if((currMailingCity!=null)&&(!currMailingCity.equalsIgnoreCase(""))&&(!currMailingCity.equalsIgnoreCase("null")))
			{businessObject.setCity(currMailingCity.trim());}
			else{businessObject.setCity(null);}
			if((currWorkExtension!=null)&&(!currWorkExtension.equalsIgnoreCase(""))&&(!currWorkExtension.equalsIgnoreCase("null")))
			{businessObject.setExtension(currWorkExtension);}
			else{businessObject.setExtension(null);}
			if((currMailingState!=null)&&(!currMailingState.equalsIgnoreCase(""))&&(!currMailingState.equalsIgnoreCase("null")))
			{businessObject.setState(currMailingState.trim());}
			else{businessObject.setState(null);}
			if((currMailingCountry!=null)&&(!currMailingCountry.equalsIgnoreCase(""))&&(!currMailingCountry.equalsIgnoreCase("null")))
			{businessObject.setCountry(currMailingCountry.trim());}
			else{businessObject.setCountry(null);}
			if((currMailingZip!=null)&&(!currMailingZip.equalsIgnoreCase(""))&&(!currMailingZip.equalsIgnoreCase("null")))
			{businessObject.setZip(currMailingZip.trim());}
			else{businessObject.setZip(null);}
			//Changes for call id 313902 ENDS
			//Changes for Ticket id 416778 and Tracker id 253211 Recon tracker id 207032 ends

}
 private  void setUpdateExistingAddress(AccountBO.Address tempAddr,String addr1,String addr2,String addr3,String city,String country,String mailStop,String state,String zip,String userField1,String userField2,String userField3,String userField4,String residentialStatus)throws Exception{
	 tempAddr.setAddress_Line1(addr1);
	 							tempAddr.setAddress_Line2(addr2);
	 							tempAddr.setAddress_Line3(addr3);
	 							tempAddr.setCity(city);
	 							tempAddr.setCountry(country);
	 							tempAddr.setMailStop(mailStop);
	 							tempAddr.setState(state);
	 							tempAddr.setZip(zip.trim());
	 							tempAddr.setUserField1(userField1);
	 							tempAddr.setUserField2(userField2);
	 							tempAddr.setUserField3(userField3);
	 							tempAddr.setUserField4(userField4);
							tempAddr.setResidentialStatus(residentialStatus);
	 }

	/* 10.2 SPE Changes -  To avoid object creation due to string concatenation */
	public String getValueFromRequest(HttpServletRequest req,String sBOName, String sAttribName) throws Exception {

		StringBuilder fullAttribName = null;
		String attrValue = "";
		if(sBOName!=null && sAttribName!=null){
			fullAttribName = new StringBuilder(sBOName).append(".").append(sAttribName);
			attrValue = req.getParameter(fullAttribName.toString());
		}
		return attrValue;
	}
 /***Fix for Call id 340526 begins******/
//changes for tracker 419294 vector clean up begin
         public ArrayList getExistingRelationship(String acctKey, SRMBusinessContext bc) throws Exception
//changes for tracker 419294 vector clean up ends
         {

                 SRMQueryBuilder qbRels =
                                                                                    QueryAssist.singleObjectQuery("RelationshipBO",
                                                                                                                                                  RelationshipBO.ENTITYRELATIONSHIPID
                                                                                                                                                  );
                                          QueryAssist.addSimpleCondition(qbRels,
                                                                                                         "RelationshipBO",
                                                                                                          RelationshipBO.ORGKEY,
                                                                                                          IQuery.ComparisonOperation_EQ,
                                                                                                          ""+acctKey
                                                                                                          );

                                         QueryAssist.addSimpleCondition(qbRels,
                                                                                                         "RelationshipBO",
                                                                                                          RelationshipBO.PRIMARYINTRODUCER,
                                                                                                          IQuery.ComparisonOperation_EQ,
                                                                                                          "Y"
                                                                                                          );


                                         SRMQueryResult qrRels= qbRels.runQuery(bc, true, -1);
                                         SRMRecordSet rsRels = qrRels.getRecordSet();

						//changes for tracker 419294 vector clean up begin
                                         ArrayList vDelObj = new ArrayList();
//changes for tracker 419294 vector clean up ends


                                         while(rsRels.hasNext()){
                                                  RelationshipBO tempAcc = (RelationshipBO)rsRels.getNext().get(0);

                                                         vDelObj.add(tempAcc);

                                         }
                         return vDelObj;

 }

//changes for tracker 419294 vector clean up begin
 public ArrayList getExistingRelationshipMod(String acctKey, SRMBusinessContext bc) throws Exception
//changes for tracker 419294 vector clean up ends
         {

                 SRMQueryBuilder qbRels =
                                                                                    QueryAssist.singleObjectQuery("RelationshipModBO",
                                                                                                                                                  RelationshipModBO.ENTITYRELATIONSHIPID
                                                                                                                                                  );
                                          QueryAssist.addSimpleCondition(qbRels,
                                                                                                         "RelationshipModBO",
                                                                                                          RelationshipModBO.ORGKEY,
                                                                                                          IQuery.ComparisonOperation_EQ,
                                                                                                          ""+acctKey
                                                                                                          );

                                         QueryAssist.addSimpleCondition(qbRels,
                                                                                                         "RelationshipModBO",
                                                                                                          RelationshipModBO.PRIMARYINTRODUCER,
                                                                                                          IQuery.ComparisonOperation_EQ,
                                                                                                          "Y"
                                                                                                          );


                                         SRMQueryResult qrRels= qbRels.runQuery(bc, true, -1);
                                         SRMRecordSet rsRels = qrRels.getRecordSet();

					//changes for tracker 419294 vector clean up begin
                                         ArrayList vDelObj = new ArrayList();
				//changes for tracker 419294 vector clean up ends


                                         while(rsRels.hasNext()){
                                                  RelationshipModBO tempAcc = (RelationshipModBO)rsRels.getNext().get(0);

//changes for tracker 419294 vector clean up begin
                                                         vDelObj.add(tempAcc);
//changes for tracker 419294 vector clean up ends

                                         }
                         return vDelObj;

 }

 /***Fix for call ID 340526 ends******/

	// changes for tracker id :253845 Start
			private void setConvFlags(String oldEntityID,SRMBusinessContext bc,String oldEntityType,AccountBO businessObject) throws Exception
			{



						if (oldEntityType.equalsIgnoreCase("Prospect")){
							SuspectBO susBO = (SuspectBO)Utils.getBOFromID(bc,"SuspectBO",SuspectBO.SUSPECTID,oldEntityID);
							if(susBO!=null){
								Core.setConvFlagSuspect(bc,susBO,businessObject);
							}

						}
						// Start of callid: 150091
						if (oldEntityType.equalsIgnoreCase("NonCustomer")){
										NonCustomerBO ncBO = (NonCustomerBO)Utils.getBOFromID(bc,"NonCustomerBO",NonCustomerBO.NONCUSTOMERID,oldEntityID);
										if(ncBO!=null){
											Core.setConvFlagNonCustomer(bc,ncBO,businessObject);
										}

						}
						if (oldEntityType.equalsIgnoreCase("Contact")){
													ContactBO contactBO = (ContactBO)Utils.getBOFromID(bc,"ContactBO",ContactBO.CONTACTID,oldEntityID);
													if(contactBO!=null){
														Core.setConvFlagContact(bc,contactBO,businessObject);
													}

						}
						// End of callid: 150091
						SRMQueryBuilder qbRel = QueryAssist.singleObjectQuery("RelationshipBO",RelationshipBO.ENTITYRELATIONSHIPID);
						QueryAssist.addSimpleCondition(qbRel,"RelationshipBO",RelationshipBO.CHILDENTITYID,
													   IQuery.ComparisonOperation_EQ,""+oldEntityID);
						QueryAssist.addSimpleCondition(qbRel,"RelationshipBO",RelationshipBO.CHILDENTITY,
													   IQuery.ComparisonOperation_EQ,oldEntityType.toUpperCase());
						SRMQueryResult qrRel = qbRel.runQuery(bc,false,-1);
						SRMRecordSet rsRel = qrRel.getRecordSet();
						while(rsRel.hasNext()){
							RelationshipBO relBO = (RelationshipBO)rsRel.getNext().get(0);
							if(relBO!=null){
								relBO.setChildEntityID(businessObject.getAccountID());
								relBO.setChildEntity("CUSTOMER");
								SRMDataObject.write(relBO,bc);
							}
						}

				}


		private void checkConversion(SRMBusinessContext bc,String oldEntityType,String oldEntityID,AccountBO businessObject) throws Exception
		{
					businessObject.setOldEntityType(oldEntityType.toUpperCase());
					businessObject.setOldEntityID(oldEntityID);

					SRMQueryBuilder qbChkCIF = QueryAssist.singleObjectQuery("AccountBO",AccountBO.ACCOUNTID);
					qbChkCIF.addAttribScope(QueryAssist.getTransformFn ("AccountBO",  AccountBO.ACCOUNTKEY));
					QueryAssist.addSimpleCondition(qbChkCIF,"AccountBO", AccountBO.OLDENTITYTYPE,
												   IQuery.ComparisonOperation_EQ, oldEntityType.toUpperCase());
					QueryAssist.addSimpleCondition(qbChkCIF,"AccountBO", AccountBO.OLDENTITYID,
												   IQuery.ComparisonOperation_EQ, oldEntityID);
					SRMQueryResult qrChkCIF = qbChkCIF.runQuery(bc,false,1);
					SRMRecordSet rsChkCIF   = qrChkCIF.getRecordSet();
					if(rsChkCIF.hasNext()){
						throw new SRMBCException(SRMBCException.ALREADY_CONVERTED,null);
					}
		}

	 private void setNewHouseHoldDetParams(HttpServletRequest req,AccountBO.GroupHouseHold NewHouseHoldDet,int j)throws Exception
	 {
	 		String gh_Text1                 = req.getParameter("GH_TEXT1");
	 		String gh_Text2                 = req.getParameter("GH_TEXT2");
	 		String gh_Text3                 = req.getParameter("GH_TEXT3");
	 		String gh_Date1                 = req.getParameter("GH_DATE1");
	 		String gh_Date2                 = req.getParameter("GH_DATE2");
	 		String gh_Date3                 = req.getParameter("GH_DATE3");
	 		String gh_Dropdown1             = req.getParameter("GH_DROPDOWN1");
	 		String gh_Dropdown2             = req.getParameter("GH_DROPDOWN2");
	 		String gh_Dropdown3             = req.getParameter("GH_DROPDOWN3");
	 		String gh_Lookup1               = req.getParameter("GH_LOOKUP1");
	 		String gh_Lookup2               = req.getParameter("GH_LOOKUP2");
	 		String gh_Lookup3               = req.getParameter("GH_LOOKUP3");





	 		List lstGh_Text1                =        Utils.parseString(gh_Text1                ,'$');
	 		List lstGh_Text2                =        Utils.parseString(gh_Text2                ,'$');
	 		List lstGh_Text3                =        Utils.parseString(gh_Text3                ,'$');
	 		List lstGh_Date1                =        Utils.parseString(gh_Date1                ,'$');
	 		List lstGh_Date2                =        Utils.parseString(gh_Date2                ,'$');
	 		List lstGh_Date3                =        Utils.parseString(gh_Date3                ,'$');
	 		List lstGh_Dropdown1            =        Utils.parseString(gh_Dropdown1            ,'$');
	 		List lstGh_Dropdown2            =        Utils.parseString(gh_Dropdown2            ,'$');
	 		List lstGh_Dropdown3            =        Utils.parseString(gh_Dropdown3            ,'$');
	 		List lstGh_Lookup1              =        Utils.parseString(gh_Lookup1              ,'$');
	 		List lstGh_Lookup2              =        Utils.parseString(gh_Lookup2              ,'$');
	 		List lstGh_Lookup3              =        Utils.parseString(gh_Lookup3              ,'$');

			if(null !=lstGh_Text1 && j<lstGh_Text1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text1.get(j)).toString())) {
				NewHouseHoldDet.setText1((((StringBuffer)lstGh_Text1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText1(null);
			}
			if(null !=lstGh_Text2 && j<lstGh_Text2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text2.get(j)).toString())) {
				NewHouseHoldDet.setText2((((StringBuffer)lstGh_Text2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText2(null);
			}
			if(null !=lstGh_Text3 && j<lstGh_Text3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text3.get(j)).toString())) {
				NewHouseHoldDet.setText3((((StringBuffer)lstGh_Text3.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText3(null);
			}
			if(null !=lstGh_Dropdown1 && j<lstGh_Dropdown1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
				NewHouseHoldDet.setDropdown1((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown1(null);
			}
			if(null !=lstGh_Dropdown2 && j<lstGh_Dropdown2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown2.get(j)).toString())) {
				NewHouseHoldDet.setDropdown2((((StringBuffer)lstGh_Dropdown2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown2(null);
			}
			if(null !=lstGh_Dropdown3 && j<lstGh_Dropdown3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
				NewHouseHoldDet.setDropdown3((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown3(null);
			}
			if(null !=lstGh_Lookup1 && j<lstGh_Lookup1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup1.get(j)).toString())) {
				NewHouseHoldDet.setLookup1((((StringBuffer)lstGh_Lookup1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup1(null);
			}
			if(null !=lstGh_Lookup2 && j<lstGh_Lookup2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup2.get(j)).toString())) {
				NewHouseHoldDet.setLookup2((((StringBuffer)lstGh_Lookup2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup2(null);
			}
			if(null !=lstGh_Lookup3 && j<lstGh_Lookup3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup3.get(j)).toString())) {
				NewHouseHoldDet.setLookup3((((StringBuffer)lstGh_Lookup3.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup3(null);
			}


		}
		private void setHouseholdAddrfields(HttpServletRequest req,AccountBO.Address NewAddressDet, int j,CISSessionContext sc) throws Exception
		{
			long milliSec;
			String addr_UserField1          = req.getParameter("ADDR_USERFIELD1");
			String addr_UserField2          = req.getParameter("ADDR_USERFIELD2");
			String addr_UserField3          = req.getParameter("ADDR_USERFIELD3");
			String addr_UserField4          = req.getParameter("ADDR_USERFIELD4");
			String addr_UserField5          = req.getParameter("ADDR_USERFIELD5");
			String addr_UserField6          = req.getParameter("ADDR_USERFIELD6");
			String addr_UserField7          = req.getParameter("ADDR_USERFIELD7");
			String addr_UserDateField1      = req.getParameter("ADDR_USERDATEFIELD1");
			String addr_UserDateField2      = req.getParameter("ADDR_USERDATEFIELD2");
			List lstAddUSERFIELD1                   =    Utils.parseString(addr_UserField1         ,',');
			List lstAddUSERFIELD2                   =    Utils.parseString(addr_UserField2         ,',');
			List lstAddUSERFIELD3                   =    Utils.parseString(addr_UserField3         ,',');
			List lstAddUSERFIELD4                   =    Utils.parseString(addr_UserField4         ,',');
			List lstAddUSERFIELD5                   =    Utils.parseString(addr_UserField5         ,',');
			List lstAddUSERFIELD6                   =    Utils.parseString(addr_UserField6         ,',');
			List lstAddUSERFIELD7                   =    Utils.parseString(addr_UserField7         ,',');
			List lstAddUSERDATEFIELD1               =    Utils.parseString(addr_UserDateField1     ,',');
			List lstAddUSERDATEFIELD2               =    Utils.parseString(addr_UserDateField2     ,',');


				if(null !=lstAddUSERFIELD1 && j<lstAddUSERFIELD1.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD1.get(j)).toString())) {
					NewAddressDet.setUserField1((((StringBuffer)lstAddUSERFIELD1.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField1(null);
				}
				if(null !=lstAddUSERFIELD2 && j<lstAddUSERFIELD2.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD2.get(j)).toString())) {
					NewAddressDet.setUserField2((((StringBuffer)lstAddUSERFIELD2.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField2(null);
				}
				if(null !=lstAddUSERFIELD3 && j<lstAddUSERFIELD3.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD3.get(j)).toString())) {
					NewAddressDet.setUserField3((((StringBuffer)lstAddUSERFIELD3.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField3(null);
				}
				if(null !=lstAddUSERFIELD4 && j<lstAddUSERFIELD4.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD4.get(j)).toString())) {
					NewAddressDet.setUserField4((((StringBuffer)lstAddUSERFIELD4.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField4(null);
				}
				if(null !=lstAddUSERFIELD5 && j<lstAddUSERFIELD5.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD5.get(j)).toString())) {
					NewAddressDet.setUserField5((((StringBuffer)lstAddUSERFIELD5.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField5(null);
				}
				if(null !=lstAddUSERFIELD6 && j<lstAddUSERFIELD6.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD6.get(j)).toString())) {
					NewAddressDet.setUserField6((((StringBuffer)lstAddUSERFIELD6.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField6(null);
				}
				if(null !=lstAddUSERFIELD7 && j<lstAddUSERFIELD7.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD7.get(j)).toString())) {
					NewAddressDet.setUserField7((((StringBuffer)lstAddUSERFIELD7.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField7(null);
				}
				if(null !=lstAddUSERDATEFIELD1 && j<lstAddUSERDATEFIELD1.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERDATEFIELD1.get(j)).toString())) {
					String userDate1 = (((StringBuffer)lstAddUSERDATEFIELD1.get(j)).toString().trim());

					java.util.Date tmpDate_cif = null;
					Calendar cal_cif = Calendar.getInstance();
					//long milliSec;
					int deltaTime_cif = sc.getClientTimeDiff();
					java.util.Date newTmpDate_cif = null;
					SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
					if((userDate1!=null)&&(!userDate1.equalsIgnoreCase(""))&&(!userDate1.equalsIgnoreCase(" "))){
						cal_cif.setTime((Date)srfm.stringToDate(userDate1));
						tmpDate_cif = cal_cif.getTime();
						milliSec = tmpDate_cif.getTime();
						milliSec -= deltaTime_cif * 1000 * 60;
						milliSec +=(12*60*60*1000);
						newTmpDate_cif = new java.util.Date(milliSec);

						NewAddressDet.setUserDateField1(newTmpDate_cif);
					}else{
						NewAddressDet.setUserDateField1(null);
					}
				}else{
					NewAddressDet.setUserDateField1(null);
				}
				if(null !=lstAddUSERDATEFIELD2 && j<lstAddUSERDATEFIELD2.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERDATEFIELD2.get(j)).toString())) {
					String userDate2 = (((StringBuffer)lstAddUSERDATEFIELD2.get(j)).toString().trim());
					/* Change for ticket 366907 start */

					NewAddressDet = AccMainHelper.setUserDateField2(NewAddressDet,userDate2,sc);
					/* Change for ticket 366907 end */
				}else{
					NewAddressDet.setUserDateField2(null);
		}
				
				/*
				 *	MLUSERfIELD  Inclusion - Begin
				 */
				List lstMLUSERFIELD1 = null;
				List lstMLUSERFIELD2 = null;
				List lstMLUSERFIELD3 = null;
				List lstMLUSERFIELD4 = null;
				List lstMLUSERFIELD5 = null;
				List lstMLUSERFIELD6 = null;
				List lstMLUSERFIELD7 = null;
				List lstMLUSERFIELD8 = null;
				List lstMLUSERFIELD9 = null;
				List lstMLUSERFIELD10 = null;
				List lstMLUSERFIELD11 = null;
				List lstMLUSERFIELD12 = null;
				List lstMLUSERFIELD13 = null;
				List lstMLUSERFIELD14 = null;
				List lstMLUSERFIELD15 = null;
				List lstMLUSERFIELD16 = null;
				List lstMLUSERFIELD17 = null;
				List lstMLUSERFIELD18 = null;
				List lstMLUSERFIELD19 = null;
				List lstMLUSERFIELD20 = null;
				List lstMLUSERFIELD21 = null;
				List lstMLUSERFIELD22 = null;
				List lstMLUSERFIELD23 = null;
				List lstMLUSERFIELD24 = null;
				List lstMLUSERFIELD25 = null;
				List lstMLUSERFIELD26 = null;
				List lstMLUSERFIELD27 = null;
				List lstMLUSERFIELD28 = null;
				List lstMLUSERFIELD29 = null;
				List lstMLUSERFIELD30 = null;
				
				String ADD_MLUSERFIELD1 		= req.getParameter("MLUSERFIELD1");
				String ADD_MLUSERFIELD2 		= req.getParameter("MLUSERFIELD2");
				String ADD_MLUSERFIELD3 		= req.getParameter("MLUSERFIELD3");
				String ADD_MLUSERFIELD4 		= req.getParameter("MLUSERFIELD4");
				String ADD_MLUSERFIELD5 		= req.getParameter("MLUSERFIELD5");
				String ADD_MLUSERFIELD6 		= req.getParameter("MLUSERFIELD6");
				String ADD_MLUSERFIELD7 		= req.getParameter("MLUSERFIELD7");
				String ADD_MLUSERFIELD8 		= req.getParameter("MLUSERFIELD8");
				String ADD_MLUSERFIELD9 		= req.getParameter("MLUSERFIELD9");
				String ADD_MLUSERFIELD10 		= req.getParameter("MLUSERFIELD10");
				String ADD_MLUSERFIELD11 		= req.getParameter("MLUSERFIELD11");
				String ADD_MLUSERFIELD12 		= req.getParameter("MLUSERFIELD12");
				String ADD_MLUSERFIELD13 		= req.getParameter("MLUSERFIELD13");
				String ADD_MLUSERFIELD14 		= req.getParameter("MLUSERFIELD14");
				String ADD_MLUSERFIELD15 		= req.getParameter("MLUSERFIELD15");
				String ADD_MLUSERFIELD16 		= req.getParameter("MLUSERFIELD16");
				String ADD_MLUSERFIELD17 		= req.getParameter("MLUSERFIELD17");
				String ADD_MLUSERFIELD18 		= req.getParameter("MLUSERFIELD18");
				String ADD_MLUSERFIELD19 		= req.getParameter("MLUSERFIELD19");
				String ADD_MLUSERFIELD20 		= req.getParameter("MLUSERFIELD20");
				String ADD_MLUSERFIELD21 		= req.getParameter("MLUSERFIELD21");
				String ADD_MLUSERFIELD22 		= req.getParameter("MLUSERFIELD22");
				String ADD_MLUSERFIELD23 		= req.getParameter("MLUSERFIELD23");
				String ADD_MLUSERFIELD24 		= req.getParameter("MLUSERFIELD24");
				String ADD_MLUSERFIELD25 		= req.getParameter("MLUSERFIELD25");
				String ADD_MLUSERFIELD26 		= req.getParameter("MLUSERFIELD26");
				String ADD_MLUSERFIELD27 		= req.getParameter("MLUSERFIELD27");
				String ADD_MLUSERFIELD28 		= req.getParameter("MLUSERFIELD28");
				String ADD_MLUSERFIELD29 		= req.getParameter("MLUSERFIELD29");
				String ADD_MLUSERFIELD30 		= req.getParameter("MLUSERFIELD30");
				
				lstMLUSERFIELD1 			= Utils.parseString(ADD_MLUSERFIELD1,',');
				lstMLUSERFIELD2 			= Utils.parseString(ADD_MLUSERFIELD2,',');
				lstMLUSERFIELD3 			= Utils.parseString(ADD_MLUSERFIELD3,',');
				lstMLUSERFIELD4 			= Utils.parseString(ADD_MLUSERFIELD4,',');
				lstMLUSERFIELD5 			= Utils.parseString(ADD_MLUSERFIELD5,',');
				lstMLUSERFIELD6 			= Utils.parseString(ADD_MLUSERFIELD6,',');
				lstMLUSERFIELD7 			= Utils.parseString(ADD_MLUSERFIELD7,',');
				lstMLUSERFIELD8 			= Utils.parseString(ADD_MLUSERFIELD8,',');
				lstMLUSERFIELD9 			= Utils.parseString(ADD_MLUSERFIELD9,',');
				lstMLUSERFIELD10 			= Utils.parseString(ADD_MLUSERFIELD10,',');
				lstMLUSERFIELD11 			= Utils.parseString(ADD_MLUSERFIELD11,',');
				lstMLUSERFIELD12 			= Utils.parseString(ADD_MLUSERFIELD12,',');
				lstMLUSERFIELD13 			= Utils.parseString(ADD_MLUSERFIELD13,',');
				lstMLUSERFIELD14 			= Utils.parseString(ADD_MLUSERFIELD14,',');
				lstMLUSERFIELD15 			= Utils.parseString(ADD_MLUSERFIELD15,',');
				lstMLUSERFIELD16 			= Utils.parseString(ADD_MLUSERFIELD16,',');
				lstMLUSERFIELD17 			= Utils.parseString(ADD_MLUSERFIELD17,',');
				lstMLUSERFIELD18 			= Utils.parseString(ADD_MLUSERFIELD18,',');
				lstMLUSERFIELD19 			= Utils.parseString(ADD_MLUSERFIELD19,',');
				lstMLUSERFIELD20 			= Utils.parseString(ADD_MLUSERFIELD20,',');
				lstMLUSERFIELD21 			= Utils.parseString(ADD_MLUSERFIELD21,',');
				lstMLUSERFIELD22 			= Utils.parseString(ADD_MLUSERFIELD22,',');
				lstMLUSERFIELD23 			= Utils.parseString(ADD_MLUSERFIELD23,',');
				lstMLUSERFIELD24 			= Utils.parseString(ADD_MLUSERFIELD24,',');
				lstMLUSERFIELD25 			= Utils.parseString(ADD_MLUSERFIELD25,',');
				lstMLUSERFIELD26 			= Utils.parseString(ADD_MLUSERFIELD26,',');
				lstMLUSERFIELD27 			= Utils.parseString(ADD_MLUSERFIELD27,',');
				lstMLUSERFIELD28 			= Utils.parseString(ADD_MLUSERFIELD28,',');
				lstMLUSERFIELD29 			= Utils.parseString(ADD_MLUSERFIELD29,',');
				lstMLUSERFIELD30 			= Utils.parseString(ADD_MLUSERFIELD30,',');
				
				if( lstMLUSERFIELD1!=null && j<lstMLUSERFIELD1.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD1.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD1((((StringBuffer)lstMLUSERFIELD1.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD1(null);
				}
				if( lstMLUSERFIELD2!=null && j<lstMLUSERFIELD2.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD2.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD2((((StringBuffer)lstMLUSERFIELD2.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD2(null);
				}
				if( lstMLUSERFIELD3!=null && j<lstMLUSERFIELD3.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD3.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD3((((StringBuffer)lstMLUSERFIELD3.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD3(null);
				}
				if( lstMLUSERFIELD4!=null && j<lstMLUSERFIELD4.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD4.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD4((((StringBuffer)lstMLUSERFIELD4.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD4(null);
				}
				if( lstMLUSERFIELD5!=null && j<lstMLUSERFIELD5.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD5.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD5((((StringBuffer)lstMLUSERFIELD5.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD5(null);
				}
				if( lstMLUSERFIELD6!=null && j<lstMLUSERFIELD6.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD6.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD6((((StringBuffer)lstMLUSERFIELD6.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD6(null);
				}
				if( lstMLUSERFIELD7!=null && j<lstMLUSERFIELD7.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD7.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD7((((StringBuffer)lstMLUSERFIELD7.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD7(null);
				}
				if( lstMLUSERFIELD8!=null && j<lstMLUSERFIELD8.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD8.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD8((((StringBuffer)lstMLUSERFIELD8.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD8(null);
				}
				if( lstMLUSERFIELD9!=null && j<lstMLUSERFIELD9.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD9.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD9((((StringBuffer)lstMLUSERFIELD9.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD9(null);
				}
				if( lstMLUSERFIELD10!=null && j<lstMLUSERFIELD10.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD10.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD10((((StringBuffer)lstMLUSERFIELD10.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD10(null);
				}
				if( lstMLUSERFIELD11!=null && j<lstMLUSERFIELD11.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD11.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD11((((StringBuffer)lstMLUSERFIELD11.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD11(null);
				}
				if( lstMLUSERFIELD12!=null && j<lstMLUSERFIELD12.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD12.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD12((((StringBuffer)lstMLUSERFIELD12.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD12(null);
				}
				if( lstMLUSERFIELD13!=null && j<lstMLUSERFIELD13.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD13.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD13((((StringBuffer)lstMLUSERFIELD13.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD13(null);
				}
				if( lstMLUSERFIELD14!=null && j<lstMLUSERFIELD14.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD14.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD14((((StringBuffer)lstMLUSERFIELD14.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD14(null);
				}
				if( lstMLUSERFIELD15!=null && j<lstMLUSERFIELD15.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD15.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD15((((StringBuffer)lstMLUSERFIELD15.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD15(null);
				}
				if( lstMLUSERFIELD16!=null && j<lstMLUSERFIELD16.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD16.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD16((((StringBuffer)lstMLUSERFIELD16.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD16(null);
				}
				if( lstMLUSERFIELD17!=null && j<lstMLUSERFIELD17.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD17.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD17((((StringBuffer)lstMLUSERFIELD17.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD17(null);
				}
				if( lstMLUSERFIELD18!=null && j<lstMLUSERFIELD18.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD18.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD18((((StringBuffer)lstMLUSERFIELD18.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD18(null);
				}
				if( lstMLUSERFIELD19!=null && j<lstMLUSERFIELD19.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD19.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD19((((StringBuffer)lstMLUSERFIELD19.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD19(null);
				}
				if( lstMLUSERFIELD20!=null && j<lstMLUSERFIELD20.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD20.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD20((((StringBuffer)lstMLUSERFIELD20.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD20(null);
				}
				if( lstMLUSERFIELD21!=null && j<lstMLUSERFIELD21.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD21.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD21((((StringBuffer)lstMLUSERFIELD21.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD21(null);
				}
				if( lstMLUSERFIELD22!=null && j<lstMLUSERFIELD22.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD22.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD22((((StringBuffer)lstMLUSERFIELD22.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD22(null);
				}
				if( lstMLUSERFIELD23!=null && j<lstMLUSERFIELD23.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD23.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD23((((StringBuffer)lstMLUSERFIELD23.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD23(null);
				}
				if( lstMLUSERFIELD24!=null && j<lstMLUSERFIELD24.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD24.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD24((((StringBuffer)lstMLUSERFIELD24.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD24(null);
				}
				if( lstMLUSERFIELD25!=null && j<lstMLUSERFIELD25.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD25.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD25((((StringBuffer)lstMLUSERFIELD25.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD25(null);
				}
				if( lstMLUSERFIELD26!=null && j<lstMLUSERFIELD26.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD26.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD26((((StringBuffer)lstMLUSERFIELD26.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD26(null);
				}
				if( lstMLUSERFIELD27!=null && j<lstMLUSERFIELD27.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD27.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD27((((StringBuffer)lstMLUSERFIELD27.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD27(null);
				}
				 if( lstMLUSERFIELD28!=null && j<lstMLUSERFIELD28.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD28.get(j)).toString())) {
						 NewAddressDet.setMLUSERFIELD28((((StringBuffer)lstMLUSERFIELD28.get(j)).toString()).trim());
				 }else{
						 NewAddressDet.setMLUSERFIELD28(null);
				 }
				if( lstMLUSERFIELD29!=null && j<lstMLUSERFIELD29.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD29.get(j)).toString())) {
						 NewAddressDet.setMLUSERFIELD29((((StringBuffer)lstMLUSERFIELD29.get(j)).toString()).trim());
				 }else{
						 NewAddressDet.setMLUSERFIELD29(null);
				 }

				if( lstMLUSERFIELD30!=null && j<lstMLUSERFIELD30.size() &&
						is_valid_req_arg(((StringBuffer)lstMLUSERFIELD30.get(j)).toString())) {
					NewAddressDet.setMLUSERFIELD30((((StringBuffer)lstMLUSERFIELD30.get(j)).toString()).trim());
				}else{
					NewAddressDet.setMLUSERFIELD30(null);
				}
				/*
				 *	MLUSERfIELD  Inclusion - End
				 */
	}

	private void setNewHouseHoldDetParams(HttpServletRequest req,AccountModBO.GroupHouseHold NewHouseHoldDet,int j)throws Exception
	 {

	 		String gh_Text1                 = req.getParameter("GH_TEXT1");
	 		String gh_Text2                 = req.getParameter("GH_TEXT2");
	 		String gh_Text3                 = req.getParameter("GH_TEXT3");
	 		String gh_Date1                 = req.getParameter("GH_DATE1");
	 		String gh_Date2                 = req.getParameter("GH_DATE2");
	 		String gh_Date3                 = req.getParameter("GH_DATE3");
	 		String gh_Dropdown1             = req.getParameter("GH_DROPDOWN1");
	 		String gh_Dropdown2             = req.getParameter("GH_DROPDOWN2");
	 		String gh_Dropdown3             = req.getParameter("GH_DROPDOWN3");
	 		String gh_Lookup1               = req.getParameter("GH_LOOKUP1");
	 		String gh_Lookup2               = req.getParameter("GH_LOOKUP2");
	 		String gh_Lookup3               = req.getParameter("GH_LOOKUP3");





	 		List lstGh_Text1                =        Utils.parseString(gh_Text1                ,'$');
	 		List lstGh_Text2                =        Utils.parseString(gh_Text2                ,'$');
	 		List lstGh_Text3                =        Utils.parseString(gh_Text3                ,'$');
	 		List lstGh_Date1                =        Utils.parseString(gh_Date1                ,'$');
	 		List lstGh_Date2                =        Utils.parseString(gh_Date2                ,'$');
	 		List lstGh_Date3                =        Utils.parseString(gh_Date3                ,'$');
	 		List lstGh_Dropdown1            =        Utils.parseString(gh_Dropdown1            ,'$');
	 		List lstGh_Dropdown2            =        Utils.parseString(gh_Dropdown2            ,'$');
	 		List lstGh_Dropdown3            =        Utils.parseString(gh_Dropdown3            ,'$');
	 		List lstGh_Lookup1              =        Utils.parseString(gh_Lookup1              ,'$');
	 		List lstGh_Lookup2              =        Utils.parseString(gh_Lookup2              ,'$');
	 		List lstGh_Lookup3              =        Utils.parseString(gh_Lookup3              ,'$');

			if(null !=lstGh_Text1 && j<lstGh_Text1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text1.get(j)).toString())) {
				NewHouseHoldDet.setText1((((StringBuffer)lstGh_Text1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText1(null);
			}
			if(null !=lstGh_Text2 && j<lstGh_Text2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text2.get(j)).toString())) {
				NewHouseHoldDet.setText2((((StringBuffer)lstGh_Text2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText2(null);
			}
			if(null !=lstGh_Text3 && j<lstGh_Text3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Text3.get(j)).toString())) {
				NewHouseHoldDet.setText3((((StringBuffer)lstGh_Text3.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setText3(null);
			}
			if(null !=lstGh_Dropdown1 && j<lstGh_Dropdown1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
				NewHouseHoldDet.setDropdown1((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown1(null);
			}
			if(null !=lstGh_Dropdown2 && j<lstGh_Dropdown2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown2.get(j)).toString())) {
				NewHouseHoldDet.setDropdown2((((StringBuffer)lstGh_Dropdown2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown2(null);
			}
			if(null !=lstGh_Dropdown3 && j<lstGh_Dropdown3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Dropdown1.get(j)).toString())) {
				NewHouseHoldDet.setDropdown3((((StringBuffer)lstGh_Dropdown1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setDropdown3(null);
			}
			if(null !=lstGh_Lookup1 && j<lstGh_Lookup1.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup1.get(j)).toString())) {
				NewHouseHoldDet.setLookup1((((StringBuffer)lstGh_Lookup1.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup1(null);
			}
			if(null !=lstGh_Lookup2 && j<lstGh_Lookup2.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup2.get(j)).toString())) {
				NewHouseHoldDet.setLookup2((((StringBuffer)lstGh_Lookup2.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup2(null);
			}
			if(null !=lstGh_Lookup3 && j<lstGh_Lookup3.size() &&
					is_valid_req_arg(((StringBuffer)lstGh_Lookup3.get(j)).toString())) {
				NewHouseHoldDet.setLookup3((((StringBuffer)lstGh_Lookup3.get(j)).toString()).trim());
			}else{
				NewHouseHoldDet.setLookup3(null);
			}


		}
		private void setHouseholdAddrfields(HttpServletRequest req,AccountModBO.Address NewAddressDet, int j,CISSessionContext sc) throws Exception
		{
			long milliSec;
			String addr_UserField1          = req.getParameter("ADDR_USERFIELD1");
			String addr_UserField2          = req.getParameter("ADDR_USERFIELD2");
			String addr_UserField3          = req.getParameter("ADDR_USERFIELD3");
			String addr_UserField4          = req.getParameter("ADDR_USERFIELD4");
			String addr_UserField5          = req.getParameter("ADDR_USERFIELD5");
			String addr_UserField6          = req.getParameter("ADDR_USERFIELD6");
			String addr_UserField7          = req.getParameter("ADDR_USERFIELD7");
			String addr_UserDateField1      = req.getParameter("ADDR_USERDATEFIELD1");
			String addr_UserDateField2      = req.getParameter("ADDR_USERDATEFIELD2");
			List lstAddUSERFIELD1                   =    Utils.parseString(addr_UserField1         ,',');
			List lstAddUSERFIELD2                   =    Utils.parseString(addr_UserField2         ,',');
			List lstAddUSERFIELD3                   =    Utils.parseString(addr_UserField3         ,',');
			List lstAddUSERFIELD4                   =    Utils.parseString(addr_UserField4         ,',');
			List lstAddUSERFIELD5                   =    Utils.parseString(addr_UserField5         ,',');
			List lstAddUSERFIELD6                   =    Utils.parseString(addr_UserField6         ,',');
			List lstAddUSERFIELD7                   =    Utils.parseString(addr_UserField7         ,',');
			List lstAddUSERDATEFIELD1               =    Utils.parseString(addr_UserDateField1     ,',');
			List lstAddUSERDATEFIELD2               =    Utils.parseString(addr_UserDateField2     ,',');


				if(null !=lstAddUSERFIELD1 && j<lstAddUSERFIELD1.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD1.get(j)).toString())) {
					NewAddressDet.setUserField1((((StringBuffer)lstAddUSERFIELD1.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField1(null);
				}
				if(null !=lstAddUSERFIELD2 && j<lstAddUSERFIELD2.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD2.get(j)).toString())) {
					NewAddressDet.setUserField2((((StringBuffer)lstAddUSERFIELD2.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField2(null);
				}
				if(null !=lstAddUSERFIELD3 && j<lstAddUSERFIELD3.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD3.get(j)).toString())) {
					NewAddressDet.setUserField3((((StringBuffer)lstAddUSERFIELD3.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField3(null);
				}
				if(null !=lstAddUSERFIELD4 && j<lstAddUSERFIELD4.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD4.get(j)).toString())) {
					NewAddressDet.setUserField4((((StringBuffer)lstAddUSERFIELD4.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField4(null);
				}
				if(null !=lstAddUSERFIELD5 && j<lstAddUSERFIELD5.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD5.get(j)).toString())) {
					NewAddressDet.setUserField5((((StringBuffer)lstAddUSERFIELD5.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField5(null);
				}
				if(null !=lstAddUSERFIELD6 && j<lstAddUSERFIELD6.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD6.get(j)).toString())) {
					NewAddressDet.setUserField6((((StringBuffer)lstAddUSERFIELD6.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField6(null);
				}
				if(null !=lstAddUSERFIELD7 && j<lstAddUSERFIELD7.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERFIELD7.get(j)).toString())) {
					NewAddressDet.setUserField7((((StringBuffer)lstAddUSERFIELD7.get(j)).toString()).trim());
				}else{
					NewAddressDet.setUserField7(null);
				}
				if(null !=lstAddUSERDATEFIELD1 && j<lstAddUSERDATEFIELD1.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERDATEFIELD1.get(j)).toString())) {
					String userDate1 = (((StringBuffer)lstAddUSERDATEFIELD1.get(j)).toString().trim());

					java.util.Date tmpDate_cif = null;
					Calendar cal_cif = Calendar.getInstance();
					//long milliSec;
					int deltaTime_cif = sc.getClientTimeDiff();
					java.util.Date newTmpDate_cif = null;
					SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
					if((userDate1!=null)&&(!userDate1.equalsIgnoreCase(""))&&(!userDate1.equalsIgnoreCase(" "))){
						cal_cif.setTime((Date)srfm.stringToDate(userDate1));
						tmpDate_cif = cal_cif.getTime();
						milliSec = tmpDate_cif.getTime();
						milliSec -= deltaTime_cif * 1000 * 60;
						milliSec +=(12*60*60*1000);
						newTmpDate_cif = new java.util.Date(milliSec);

						NewAddressDet.setUserDateField1(newTmpDate_cif);
					}else{
						NewAddressDet.setUserDateField1(null);
					}
				}else{
					NewAddressDet.setUserDateField1(null);
				}

				if(null !=lstAddUSERDATEFIELD2 && j<lstAddUSERDATEFIELD2.size() &&
						is_valid_req_arg(((StringBuffer)lstAddUSERDATEFIELD2.get(j)).toString())) {
					String userDate2 = (((StringBuffer)lstAddUSERDATEFIELD2.get(j)).toString().trim());

					java.util.Date tmpDate_cif = null;
					Calendar cal_cif = Calendar.getInstance();
					//long milliSec;
					int deltaTime_cif = sc.getClientTimeDiff();
					java.util.Date newTmpDate_cif = null;
					SRMFormatter srfm = SRMFormatter.getObjectInstance(Locale.getDefault());
					if((userDate2!=null)&&(!userDate2.equalsIgnoreCase(""))&&(!userDate2.equalsIgnoreCase(" "))){
						cal_cif.setTime((Date)srfm.stringToDate(userDate2));
						tmpDate_cif = cal_cif.getTime();
						milliSec = tmpDate_cif.getTime();
						milliSec -= deltaTime_cif * 1000 * 60;
						milliSec +=(12*60*60*1000);
						newTmpDate_cif = new java.util.Date(milliSec);

						NewAddressDet.setUserDateField2(newTmpDate_cif);
					}else{
						NewAddressDet.setUserDateField2(null);
					}
				}else{
					NewAddressDet.setUserDateField2(null);
					}

	}
	 //Changes for tracker id :253845- End


	/* 10.2 SPE Changes */
	//Alok changes starts
private AccountModBO accountValModset(AccountModBO businessObject,String acctName,String sManager,String sSecondaryRM,String sCustFirstName,String sCustMiddleName,String sSecureID)throws Exception
 {
  			businessObject.setAccountName (acctName);

			businessObject.setOrgType ("Account");


			businessObject.setManager(sManager);

			businessObject.setSecondaryRM_ID(sSecondaryRM);
                        businessObject.setSecure_id(sSecureID);
			if(sCustFirstName!=null){
			businessObject.setCust_First_Name(sCustFirstName.trim());	}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		else{   businessObject.setCust_First_Name(null);}
			//Rak Changes for tracker id 201544 ends -Recon for Tracker 242199
			if(sCustMiddleName!=null){
			businessObject.setCust_Middle_Name(sCustMiddleName.trim());}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		else{businessObject.setCust_Middle_Name(null);	}

		return businessObject;


}

private AccountBO accountValset(AccountBO businessObject,String acctName,String sManager,String sSecondaryRM,String sCustFirstName,String sCustMiddleName,String sSecureID)throws Exception
 {
  			businessObject.setAccountName (acctName);

			businessObject.setOrgType ("Account");


			businessObject.setManager(sManager);

			businessObject.setSecondaryRM_ID(sSecondaryRM);
                        businessObject.setSecure_id(sSecureID);
			if(sCustFirstName!=null){
			businessObject.setCust_First_Name(sCustFirstName.trim());	}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		else{   businessObject.setCust_First_Name(null);}
			//Rak Changes for tracker id 201544 ends -Recon for Tracker 242199
			if(sCustMiddleName!=null){
			businessObject.setCust_Middle_Name(sCustMiddleName.trim());}
			//Rak Changes for tracker id 201544 starts -Recon for Tracker 242199
		else{businessObject.setCust_Middle_Name(null);	}

		return businessObject;


}
//Alok changes ends

//SSV Changes-Start
private static void doServerSideValidation(HashMap hmBOs,ArrayList arrEdoc, SRMBusinessContext  bc,String flag)
throws Exception{
	HashMap hmInput = new HashMap();	// Main hashmap
	HashMap hmListofBO = new HashMap();	// related BOS
	ArrayList arrErrorList = new ArrayList();
	try{




		if(arrEdoc != null && flag.equals("mod")){
			//Putting EntityDocumentModBO into hashmap
			hmListofBO.put(ValidationUtil.ENTITYDOCUMENTMODBO, arrEdoc);
		}else if(arrEdoc != null && flag.equals("main")){
			//Putting EntityDocumentBO into hashmap
			hmListofBO.put(ValidationUtil.ENTITYDOCUMENTBO, arrEdoc);
		}

			//Call to put other BOs into HashMap
		AccMainHelper.getValidationList(hmBOs,hmListofBO);

		hmInput.put(CRMEJBUtil.MAPSERVICENAME, CRMEJBUtil.CIFRET_EDITCUST_GENERAL);
		hmInput.put(CRMEJBUtil.MAPERRORLIST,arrErrorList);
		hmInput.put(CRMEJBUtil.MAPBOS, hmListofBO);

		ValidationCalls.validateEntity(hmInput, bc);

	}
	catch(CRMBusinessException e)
	{

		StringBuilder sErrString =new StringBuilder();
		ArrayList  arrErr = (ArrayList)hmInput.get(CRMEJBUtil.MAPERRORLIST);
		int iErrSz = arrErr.size();


		if (iErrSz > 0) {

			for (int i =0 ; i<iErrSz;i++)
			{
				ErrorObject errObj = (ErrorObject)arrErr.get(i);

				sErrString.append(errObj.getErrorMessage());

			}
			throw new FCRMValidationException(sErrString.toString(),
									new Exception(sErrString.toString()));
		}
	}
	catch(Exception ex)
	{
		//ex.printStackTrace();
		WebAdaptor.log(LogType.DEBUG, "Exception in SSV"+"AccWriter");
		WebAdaptor.logTrace(com.infy.cis.log.LogType.DEBUG,ex.getMessage());
		throw new CRMSystemException("CRMEJB0025",ex);
	}

}

public void handleMultiError(HttpServletResponse  resp, java.util.Locale locale, Throwable e,
					String module, String user)
			throws IOException, ServletException{
				PrintWriter out = resp.getWriter();
				out.println("<SCRIPT language=javascript src=\"../common/js/SSOParameter.js \"></SCRIPT>");
				out.println("<SCRIPT>");
				char[] escChars = {'"', '\''};
				out.println("try{");
				out.println(" executionStatus = 'SERVERR : " + e.getMessage() + "'");
				out.println("}catch(e){alert(e);}");
				out.println("</SCRIPT>");

		}

private String setFullNameMain(AccountBO businessObject) throws Exception{

		String fullName = null;
		int lCustLastName=0;
		int indexCustLastName=0;
		String sFirstName = "";
		String sMiddleName = "";
		String sLastName ="";
		if(businessObject.getCust_First_Name()  != null)
		{
			sFirstName =   businessObject.getCust_First_Name();
		}
		if(businessObject.getCust_Middle_Name() != null)
		{
			sMiddleName =   businessObject.getCust_Middle_Name();
		}
		if(businessObject.getCust_Last_Name() != null)
		{
			sLastName =   businessObject.getCust_Last_Name();
		}
//changes for tracker 401769 fullname alteration begin
		if(sFirstName != null && !sFirstName.equals("null")&&!sFirstName.equals("")){
			if(sFirstName.length()>=80){
				fullName=sFirstName.substring(0,80);
			}
			else{
				fullName=sFirstName;
			}
		}
		if(sMiddleName != null && !sMiddleName.equals("null")&&!sMiddleName.equals("")){
			if(fullName!=null && !(fullName.length()>=80)){
					fullName=fullName+" "+sMiddleName.substring(0,1);
			}
			else{
				if(fullName==null){
					fullName=sMiddleName.substring(0,1);
				}
			}
		}

		if(sLastName != null && !sLastName.equals("null")&&!sLastName.equals("")){
			if(fullName!=null && !(fullName.length()>=80)){
				lCustLastName=sLastName.length();
				fullName=fullName+" "+sLastName;
			}
			else{
				if(fullName==null){
				fullName = sLastName;
				}
			}
		}
		if(fullName!=null && (fullName.length()>=80)){
			fullName=fullName.substring(0,80);
			}
//changes for tracker 401769 fullname alteration ends
	return fullName;

	}

private String setFullNameMod(AccountModBO businessObject) throws Exception{

	String fullName = null;
	int lCustLastName=0;
	int indexCustLastName=0;
	String sFirstName = "";
	String sMiddleName = "";
	String sLastName ="";
	if(businessObject.getCust_First_Name() != null)
	{
		sFirstName =   businessObject.getCust_First_Name();
	}
	if(businessObject.getCust_Middle_Name() != null)
	{
		sMiddleName =   businessObject.getCust_Middle_Name();
	}
	if(businessObject.getCust_Last_Name() != null)
	{
		sLastName =   businessObject.getCust_Last_Name();
	}
//changes for tracker 401769 fullname alteration begin
	if(sFirstName != null && !sFirstName.equals("null")&&!sFirstName.equals("")){
		if(sFirstName.length()>=80){
			fullName=sFirstName.substring(0,80);
		}
		else{
			fullName=sFirstName;
		}
	}
	if(sMiddleName != null && !sMiddleName.equals("null")&&!sMiddleName.equals("")){
		if(fullName!=null && !(fullName.length()>=80)){
				fullName=fullName+" "+sMiddleName.substring(0,1);
		}
		else{
			if(fullName==null){
				fullName=sMiddleName.substring(0,1);
			}
		}
	}

	if(sLastName != null && !sLastName.equals("null")&&!sLastName.equals("")){
		if(fullName!=null && !(fullName.length()>=80)){
			lCustLastName=sLastName.length();
			fullName=fullName+" "+sLastName;
		}
		else{
			if(fullName==null){
				fullName = sLastName;
			}
		}
	}

	if(fullName!=null && (fullName.length()>=80)){
		fullName=fullName.substring(0,80);
		}
	return fullName;

//changes for tracker 401769 fullname alteration ends
}

/*Admin Locale Date Format 330982 issue correction Start : done by balaji01(ticketid:363332) */
public ArrayList getDateDetails(String dob) {

				ArrayList alDateDetails = new ArrayList ();

				if(dob == null || dob.equals(""))
				{
					return null;
				}
			    //The Locale Type nad its corresponding date Format is passed as a default param(en_US), hence it is taken from Session Context
			    final SRMFormatter srmFormatter =SRMFormatter.getObjectInstance(((com.infy.cis.servletruntime.CISSessionContext)com.infy.cis.common.SRMTLVar.sc.get()).getSessionLocale());
			    Date dtDOB = null;
			    try {
			    	dtDOB = srmFormatter.stringToDate(dob);
				} catch (SRMTypeConversionException e) {
					return null;
				}
			    Calendar cal = Calendar.getInstance();
			    cal.setTime(dtDOB);

				int nBirth_Day = cal.get (Calendar.DATE);
				int nbirth_month = cal.get (Calendar.MONTH);
				int nbirth_Year = cal.get (Calendar.YEAR);

				alDateDetails.add("" +  nBirth_Day);
				alDateDetails.add("" + (nbirth_month + 1));
				alDateDetails.add("" + nbirth_Year);

				return alDateDetails;
	}
/*Admin Locale Date Format 330982 issue correction End*/

private void setAddressFields(HttpServletRequest req,AccountModBO businessObject,SRMRecordSet rs,String boName,Date tmpDate,ArrayList avilableAddrCats, SRMCollection address) throws Exception{

					// assuming the first item in the result set is category value
					// second item in category id
					String addrCat = ((List)rs.getNext()).get(0).toString();
					boolean allFieldsEmpty = false;
					String addr1 = req.getParameter(addrCat + ".txt_Address1");
					String addr2 = req.getParameter(addrCat + ".txt_Address2");
					String addr3 = req.getParameter(addrCat + ".txt_Address3");
					String city = req.getParameter(addrCat + ".txt_City");
					String country = req.getParameter(addrCat + ".txt_Country");
					String mailStop = req.getParameter(addrCat + ".txt_MailStop");
					String state = req.getParameter(addrCat + ".txt_State");
					String zip = req.getParameter(addrCat + ".txt_Zip");

					String userField1 = req.getParameter(addrCat + ".txt_userField1");
					String userField2 = req.getParameter(addrCat + ".txt_userField2");
					String userField3 = req.getParameter(addrCat + ".txt_userField3");
					String userField4 = req.getParameter(addrCat + ".txt_userField4");
					String residentialStatus = req.getParameter(addrCat + ".txt_residentialStatus");

					SRMTypedAttrStringized userDateField1 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField1");
					SRMTypedAttrStringized userDateField2 = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_userDateField2");


					SRMTypedAttrStringized startDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_Start_Date");
					SRMTypedAttrStringized endDate = SRMTypedAttrStringized.getReqParameter( req, addrCat+".txt_End_Date");

					Calendar cal1 = Calendar.getInstance();
					java.util.Date tmpDate1 = null;
					java.util.Date newTmpDate1 = null;
					long milliSec = 0;

					if( (addr1 == null || addr1.trim().equals("")) &&
							(addr2 == null || addr2.trim().equals("")) &&
							(addr3 == null || addr3.trim().equals("")) &&
							(city == null || city.trim().equals("")) &&
							(country == null || country.trim().equals("")) &&
							(mailStop == null || mailStop.trim().equals("")) &&
							(state == null || state.trim().equals("")) &&
							(zip == null || zip.trim().equals("")) &&
							(userField1 == null || userField1.trim().equals("")) &&
							(userField2 == null || userField2.trim().equals("")) &&
							(userField3 == null || userField3.trim().equals("")) &&
							(userField4 == null || userField4.trim().equals("")) &&
							(residentialStatus == null || residentialStatus.trim().equals("")) &&
							(startDate == null || startDate.getValue().equalsIgnoreCase("")) &&
							(endDate == null || endDate.getValue().equalsIgnoreCase(""))  &&
							(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase("")) &&
							(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))) {
						allFieldsEmpty = true;
					}

					int index = avilableAddrCats.indexOf(addrCat);
					if(index != -1) { // address exists, update it
						if(allFieldsEmpty) { // remove the address from the db;
							address.remove(index);
							avilableAddrCats.remove(index);
						} else { // update the existing address

							AccountModBO.Address tempAddr = (AccountModBO.Address)address.get(index);
							tempAddr.setAddress_Line1(addr1);
							tempAddr.setAddress_Line2(addr2);
							tempAddr.setAddress_Line3(addr3);
							tempAddr.setCity(city);
							tempAddr.setCountry(country);
							tempAddr.setMailStop(mailStop);
							tempAddr.setState(state);
							tempAddr.setZip(zip.trim());
							tempAddr.setUserField1(userField1);
							tempAddr.setUserField2(userField2);
							tempAddr.setUserField3(userField3);
							tempAddr.setUserField4(userField4);
							tempAddr.setResidentialStatus(residentialStatus);

							if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
							/*tracker id 159807 changes starts*/
								tmpDate1 = null;
							}

							tempAddr.setStart_Date(tmpDate1);
						   /*tracker id 159807 changes ends*/


							if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
								cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
							/*tracker id 159807 changes starts*/
								tmpDate1 = null;
							}
							tempAddr.setEnd_Date(tmpDate1);
							/*tracker id 159807 changes ends*/


							if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField1(newTmpDate1);

							if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
								cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
								tmpDate1 = cal1.getTime();
								milliSec = tmpDate1.getTime();
								milliSec += 12*60*60*1000;
								newTmpDate1 = new java.util.Date(milliSec);
							}else{
								newTmpDate1 = null;
							}
							tempAddr.setUserDateField2(newTmpDate1);

							if (tempAddr.isExtensible()){
								tempAddr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
							}
						}
					} else if( !allFieldsEmpty) { // create the new address
						AccountModBO.Address addr = (AccountModBO.Address)businessObject.getInstance("Address");
						addr.setAddress_Line1(addr1);
						addr.setAddress_Line2(addr2);
						addr.setAddress_Line3(addr3);
						addr.setCity(city);
						addr.setCountry(country);
						addr.setAddressCategory(addrCat);
						addr.setMailStop(mailStop);
						addr.setState(state);
						addr.setZip(zip.trim());
						addr.setUserField1(userField1);
						addr.setUserField2(userField2);
						addr.setUserField3(userField3);
						addr.setUserField4(userField4);
						addr.setResidentialStatus(residentialStatus);

						if(!(startDate == null || startDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(startDate.getFormatter2(context).stringToDate(startDate));
							tmpDate = cal1.getTime();
							milliSec = tmpDate.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
						 /*tracker id 159807 changes starts*/
							tmpDate = null;
						}

						addr.setStart_Date(tmpDate);
					   /*tracker id 159807 changes ends*/

						if(!(endDate == null || endDate.getValue().equalsIgnoreCase(""))){
							cal1.setTime(endDate.getFormatter2(context).stringToDate(endDate));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
						/*tracker id 159807 changes starts*/
							tmpDate1 = null;
						}
						addr.setEnd_Date(tmpDate1);
					   /*tracker id 159807 changes ends*/


						if(!(userDateField1 == null || userDateField1.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField1.getFormatter2(context).stringToDate(userDateField1));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField1(newTmpDate1);

						if(!(userDateField2 == null || userDateField2.getValue().equalsIgnoreCase(""))){
							cal1.setTime(userDateField2.getFormatter2(context).stringToDate(userDateField2));
							tmpDate1 = cal1.getTime();
							milliSec = tmpDate1.getTime();
							milliSec += 12*60*60*1000;
							newTmpDate1 = new java.util.Date(milliSec);
						}else{
							newTmpDate1 = null;
						}
						addr.setUserDateField2(newTmpDate1);

						if (addr.isExtensible()){
							addr.setExtendedAttribs(Utils.convertExtendValuesToObject(req,boName+".Address",addrCat));
						}
						address.add(addr);
					}
}
//SSV Changes-End

}//end of AccWriter Class