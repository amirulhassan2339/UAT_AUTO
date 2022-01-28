package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import utility_Functions.UtilityFunctions



class SD_BOPMR {

	UtilityFunctions obj=new UtilityFunctions();
	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	TestObject activeProblemobj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_ActiveProblemArrowClick')
	TestObject AllergySubstancesobj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_AllergiesSubstanceArrowClick')


	//	@When("I search (.*) using global search")
	//	public void Search_Patient(String Patient) {
	//
	//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))
	//
	//		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Patient)
	//
	//		Thread.sleep(1000)
	//
	//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))
	//		Thread.sleep(3000)
	//	}


	@Then("I am on PWB")
	public void I_am_on_PWB() {

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'),
				3)
	}

	@And("I click on care plan tab")
	public void click_On_Care_Plan_Tab() {


		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'), 20)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'))


		Thread.sleep(6000)
	}

	@And("I click on add new care plan button")

	public void click_On_Add_New_Care_Plan_Button() {


		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'), 20)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'))

	}


	@And("I click on basedonpatientmedicalrecord")
	public void click_On_BasedOnPatientMedicalRecord() {

		if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'), 3)) {

			WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'), 10)

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'))

			Thread.sleep(10000)
		} else {
			WebUI.takeFullPageScreenshot()
		}
	}

	//	@Then("I should see patient data (.*) and (.*) and (.*) and (.*) and (.*) on care plan")
	//	public void verify_Patient_Data(String Patient_Name, String MRN, String DOB, String LOB, String Enterprise) {
	//
	//		'Verify Save Button'
	//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSave'),
	//				3)
	//
	//		'Verify Save & Close Button'
	//
	//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSaveClose'),
	//				3)
	//
	//		'Verify Cancel Button'
	//
	//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonCancel'),
	//				3)
	//
	//		'Verify Print Button'
	//
	//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ButtonPrint'),
	//				3)
	//
	//		'Verify Component Setting Button'
	//
	//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'),
	//				3)
	//
	//		'Verify Care Plan Name'
	//
	//
	//		//String ActualName = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Name'))
	//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Name'), Patient_Name)
	//
	//		'Verify Care Plan MRN'
	//
	//
	//		//String ActualMRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_MRN'))
	//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_MRN'), MRN)
	//
	//		'Verify Care Plan DOB'
	//
	//
	//		//String ActualDOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_DOB'))
	//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_DOB'), DOB)
	//
	//		'Verify Care Plan Gender'
	//
	//		//String ActualGender = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Male'))
	//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Male'), LOB)
	//
	//		'Verify Enterprise'
	//
	//
	//		//String ActualEnterprise = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Enterprise'))
	//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Enterprise'), Enterprise)
	//
	//
	//	}


	@Then("I should see patient (.*) as patient_name")
	public void verify_Patient_Data(String Patient) {

		//		'Verify Save Button'
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSave'),
		//				3)
		//
		//		'Verify Save & Close Button'
		//
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSaveClose'),
		//				3)
		//
		//		'Verify Cancel Button'
		//
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonCancel'),
		//				3)
		//
		//		'Verify Print Button'
		//
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ButtonPrint'),
		//				3)
		//
		//		'Verify Component Setting Button'
		//
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'),
		//				3)

		'Verify Care Plan Patient Name'


		String ActualName = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Name'))
		WebUI.verifyEqual(ActualName, Patient)


	}


	@When("I enter title (.*)")
	public void user_Enter_Title_TestingPatient(String Title) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGridInput/Input'), Title)
	}

	@When("I enter title2 (.*)")
	public void user_Enter_Title2_TestingPatient(String Title) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGridInput/Input - Copy'), Title)
	}


	@And("I click on save and close button")
	public void click_On_SaveClose_Button() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSaveClose'))

		Thread.sleep(3000)
	}

	@And("Close CP Popup")
	public void CloseCP() {



		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGridInput/Obj_CrossCP'))

		Thread.sleep(5000)
	}

	@Then("I should see success message (.*) of CP")
	public void Close_and_Verify_Alert_Message(String SucessMessage) {

		//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_SuccessMessage'),SucessMessage)

		String actual_Message  = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_SuccessMessage'))

		WebUI.verifyEqual(actual_Message, SucessMessage)
	}

	@And("I should see intial status as (.*) on CP header")
	public void I_should_see_intial_status_as_on_CP_header(String New) {

		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Status_New'))

		WebUI.verifyEqual(Actual_Status, New)
	}


	@And("I select work in progress as no")
	public void I_select_work_in_progress_as_no() {

		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGridLabels/Obj_NO'))
	}

	@And("I click on save button")
	public void I_click_on_save_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSave'))

		Thread.sleep(3000)
	}


	@And("I should see progress status as (.*) on CP header")
	public void I_should_see_WIPprogress_status_as_on_CP_header(String WIP) {


		'Verify WIP Status'
		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Status_WIP'))

		WebUI.verifyEqual(Actual_Status, WIP)
	}

	@And("I should see status as (.*) on CP header")
	public void I_should_see_draft_status_on_CP_header(String Draft) {


		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Status_Draft'))

		WebUI.verifyEqual(Actual_Status, Draft)
	}

	@When("I click on saveapprove button")
	public void I_click_on_saveapprove_button() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_SaveApprove'))

		Thread.sleep(1000)


		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_Review'))
		//
		//		Thread.sleep(1000)
		//
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_SaveApprove'))


	}

	@And("I click on review buttonn")
	public void I_click_on_review_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_Review'))
	}


	@Then("I should see alert popup")
	public void I_should_see_alert_popup() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_AreYouSureWantToApprove'),
				3)
	}

	@And("I click on proceed button")
	public void I_click_on_proceed_button() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonProceed'))

		Thread.sleep(2000)
	}

	@And("I should see approve success message")
	public void I_should_see_approve_success_message() {


		//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		//WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_RejectMessage'),'successCare Plan rejected successfullyHide')

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_ApprovedMessage'), 2)

	}

	@When("I click on title from care plan grid")
	public void I_click_on_title_from_care_plan_grid() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Title'), 15)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Title'))

		Thread.sleep(5000)
	}

	@And("I should see patient data as read only")
	public void I_should_see_patient_data_as_read_only() {


		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonCancel'),
				3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ButtonPrint'),
				3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'),
				3)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonExport'),
				3)

		'Verify Authorized By'
		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_AuthorizedBy'), 2)

		String Actual_AuthorizedBy = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_AuthorizedBy'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_AuthorizedBy'), Actual_AuthorizedBy)



		'Verify Created By'

		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'), 2)


		String Actual_CreatedBy = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'), Actual_CreatedBy)


		'Verify Modified By'

		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_ModifiedBy'), 2)

		String Actual_Modifier = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_ModifiedBy'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_ModifiedBy'), Actual_Modifier)

	}


	@And("I should see approval status as (.*) on CP header")
	public void I_should_see_approval_status_as_on_CP_header(String Approved) {

		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Status_Approve'))

		WebUI.verifyEqual(Actual_Status, Approved)
	}

	@Then("I should see patient data of draft status")
	public void I_should_see_patient_data_of_draft_status() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonDelete'),
				3)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_SaveApprove'),
				3)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonExport'),
				3)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonReject'),
				3)

		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'),
		//		3)

		String Actual_Creator = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'), Actual_Creator)

		WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'))

		Thread.sleep(2000)
	}

	@Then("I should see patient data of WIP status")
	public void I_should_see_patient_data_of_WIP_status() {

		'Verify Created By'
		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'), 2)

		String Actual_Creator1 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedBy'), Actual_Creator1)


		Thread.sleep(2000)
	}

	@And("I close care plan popup")
	public void I_close_care_plan_popup() {

		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Close Popup/Obj_Close'))
	}

	@And("I click on reject button")
	public void I_click_on_reject_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonReject'))

		Thread.sleep(1000)
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_Review'))
		//
		//		Thread.sleep(1000)
		//
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonReject'))

	}

	@And("I should see rejected alert popup")
	public void I_should_see_rejected_alert_popup() {


		'Verify "Are you sure to reject" Validation Message'
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_AreYouSureYouWantToReject'),
				3)
	}

	@And("I should see rejected success message")
	public void I_should_see_rejected_success_message() {



		String Actual = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_RejectMessage'))

		WebUI.verifyEqual(Actual, 'successCare Plan rejected successfully.Hide')

		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		//WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_RejectMessage'), 2)
	}

	@And("I should see reject status as (.*) on CP header")
	public void I_should_see_reject_status_as_on_CP_header(String Rejected) {

		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Status_Reject'))

		WebUI.verifyEqual(Actual_Status, Rejected)
	}

	@And("I should see export button")
	public void I_click_on_export_button() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonExport'))

		Thread.sleep(3000)
	}

	@And("I should see export button and click")
	public void I_click_on_export_button_Click() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonExport'))

		Thread.sleep(10000)
	}

	@And("I should see exported file with (.*) as name")
	public void I_should_see_exportedFile(String Title) {


		File downloadFolder = new File("C:\\Users\\hafiz.amir\\Downloads")
		List namesOfFiles = Arrays.asList(downloadFolder.list())
		if(namesOfFiles.contains(Title))


		{
			println "Success"
		}
		else {
			println "Failure"

		}
	}


	@When("I click on print button")
	public void I_click_on_print_button() {

		Thread.sleep(3000)


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ButtonPrint'))

		//WebUI.switchToDefaultContent()
	}

	@Then("I should see patient care plan")
	public void I_should_see_Patient_Care_Plan() {


		String actual = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_PatientCarePlan'))
		WebUI.verifyEqual(actual, "Patient Care Plan")

		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_PatientCarePlan'))

		//		Thread.sleep(2000)
		//
		//		WebUI.switchToDefaultContent()

	}


	@Then("I should see provide care plan")
	public void I_should_see_provide_care_plan() {


		String actual =WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ProvideCarePlan'))
		WebUI.verifyEqual(actual, "Provider Care Plan")


		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ProvideCarePlan'))

		//		Thread.sleep(2000)
		//
		//		WebUI.switchToDefaultContent()
	}


	@When("I checked multiple checkboxes")
	public void I_checked_multiple_checkboxes() {


		'Verify Component Setting'
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'), 3)) {

			Thread.sleep(2000)
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'))
		}else {
			println("Component Setting Button Is Not Present..!!")
		}

		'Verify "All" Checkbox is checked'
		if(WebUI.verifyElementChecked(	findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'), 3)){

			WebUI.uncheck(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'))
		}else {

			println("Sorry, You're not able to uncheck 'ALL' the checkbox..!!")
		}


		'Verify "Care Provider" Checkbox is checked'
		if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_CareProvider_CheckBox'), 3)) {

			WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_CareProvider_CheckBox'))
		}else {

			print("Sorry, You're not able to check 'Care Provider' the checkbox..!!")
		}

		'Verify "Problem List" Checkbox is checked'
		if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_ProblemList_CheckBox'), 3)) {

			WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_ProblemList_CheckBox'))
		}else {
			println("Sorry, You're not able to check 'ProblemList' the checkbox..!!")
		}

		'Verify "Emergency Contacts" Checkbox is checked'
		if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EmergencyContact_CheckBox'), 3)) {

			WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EmergencyContact_CheckBox'))
		}else {
			println("Sorry, You're not able to check 'Emergency Contacts' the checkbox..!!")
		}

		WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Assessment_CheckBox'), 3)

		'Verify "Assessment" Checkbox is checked'
		if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Assessment_CheckBox'), 3)) {

			WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Assessment_CheckBox'))
		}else {
			println("Sorry, You're not able to check 'Assessment' the checkbox..!!")
		}
	}

	@Then("I click apply button")
	public void I_click_apply_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_Apply_ComponentSetting'))


	}


	@And("I should see add new emergency contact")
	public void I_should_see_add_new_emergency_contact() {


		Thread.sleep(3000)
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EmergencyContact'), 3)
	}

	@When("I hover on add new emergency contact")
	public void I_hover_on_add_new_emergency_contact() {


		WebUI.mouseOver(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EmergencyContact'))
	}

	@When("I click on plussign button")
	public void I_click_on_plussign_button() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_PlusSign'))

		Thread.sleep(2000)
	}


	@And("I enter last name as (.*)")
	public void I_enter_last_name(String LastName) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_LastName'), LastName)
	}


	@And("I enter first name as (.*)")
	public void I_enter_first_name(String FirstName) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_FirstName'), FirstName)
	}


	@And("I enter home phone as (.*)")
	public void I_enter_home_phone(String HomePhone) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_HomePhone'), HomePhone)
	}


	@And("I enter mobile phone as (.*)")
	public void I_enter_mobile_phone(String MobilePhone) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_MobilePhone'), MobilePhone)
	}


	@And("I click on tickbox")
	public void I_click_on_tickbox() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_Tick'))

		Thread.sleep(3000)
	}

	@Then("I should see emergency contact data LastName as (.*) and FirstName as (.*) and HomePhone as (.*) and MobilePhone as (.*) number")
	public void I_should_see_emergency_contact_data(String LastName, String FirstName, String HomePhone, String MobilePhone) {


		String actual_LN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Field_Assertions/Obj_LastName'))

		WebUI.verifyEqual(actual_LN, LastName)

		String actual_FN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Field_Assertions/Obj_FirstName'))

		WebUI.verifyEqual(actual_FN, FirstName)

		String actual_Home = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Field_Assertions/Obj_HomePhone'))

		WebUI.verifyEqual(actual_Home, HomePhone)

		String actual_Mobile = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Field_Assertions/Obj_MobilePhone'))

		WebUI.verifyEqual(actual_Mobile, MobilePhone)

	}

	@And("I unchecked all checkboxes")
	public void I_unchecked_all_checkboxes() {


		'Verify Component Setting'
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'), 3)) {

			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'))
		}else {
			println("Component Setting Button Is Not Present..!!")
		}

		'Verify "All" Checkbox is checked'
		if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'), 3)) {

			WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'))
		}else {

			println("Sorry, You're not able to check 'ALL' the checkbox..!!")
		}

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_Apply_ComponentSetting'))
	}

	@And("I click on assessment")
	public void I_click_on_assessment() {


		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_AssessmentTab'))
	}

	@And("I click on add")
	public void I_click_on_add() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_AddButton'))
		Thread.sleep(2000)
	}

	@And("I click on other assessment tempelate")
	public void I_click_on_other_assessment_tempelate() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obje_OtherAssessmentTemplates'))

		Thread.sleep(2000)
	}

	@And("I click Asthma")
	public void I_checked_Asthma() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_AsthmaCheckbox'))

		Thread.sleep(2000)
	}

	@And("I checked Cellulitis")
	public void I_checked_Cellulitis() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_CellulitisCheckbox'))

		Thread.sleep(2000)
	}

	@And("I click on procced")
	public void I_click_on_procced() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_buttonProceed'))

		Thread.sleep(2000)
	}

	@And("I enter the (.*) as the assessmenttitle")
	public void I_enter_assessmenttitle(String AssesmentTitle) {


		WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_title'))

		Thread.sleep(1000)

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_title'),
				AssesmentTitle)
		Thread.sleep(2000)
	}

	@And("I enter (.*) title")
	public void I_enter_assessment_title(String Title) {


		WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_title'))

		Thread.sleep(1000)

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_title'),
				Title)
		Thread.sleep(1000)
		
		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_title'), Keys.chord(Keys.ENTER))
		
	}

	@And("I enter (.*) as cpt code")
	public void I_enter_CPTCode(String CPTCode) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_input_CPTCode'),
				CPTCode)
		Thread.sleep(2000)
	}

	@And("I click billable radio button")
	public void I_click_billable_radio_button() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_YesNo_Checkbox'))

		Thread.sleep(2000)
	}

	@And("I select dropdown values")
	public void I_select_dropdown_values() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_FirstClick'))


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question1_selection'))

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question2_select'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_ForthClick'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question3_select'))
		//
		//			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_FifthClick'))
		//
		//			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question4_selection'))
	}

	@And("I select the dropdown values")
	public void I_select_thedropdown_values() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_FirstClick'))

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question1_selection'))

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question1_selection'))

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question2_select'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_ForthClick'))
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question3_select'))
		//
		//			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_Dropdown_FifthClick'))
		//
		//			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_question4_selection'))
	}

	@And("I enter (.*) comment")
	public void I_enter_Comment(String Comment) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_textarea_select_notes'), Comment)
	}

	@And("I enter the (.*) as the assessmentcomment")
	public void I_enter_AssessmentComment(String AssesmentComment) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_textarea_select_notes'), AssesmentComment)
	}

	@And("I click save button")
	public void I_click_save_button() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Assessment/OR_Assessment/Obj_button_Save'))

		Thread.sleep(3000)
	}

	@And("I mouse hover on assessment")
	public void I_mouse_hover_on_assessment() {

		//WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Assessment'), 2)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_Hover_Assessment'))
	}

	@And("I click on assessment icon")
	public void I_click_on_assessment_icon() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_SelectAssessmentIcon'))
	}

	@When("I select multiple assessment checkboxes")
	public void I_select_multiple_assessment_checkboxes() {

		'Check assessment from Grid'
		WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentGrid_Checkbox1'))

		//WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_AssessmentGrid_Checkbox2'))
	}

	@When("I click on OK button")
	public void I_click_on_OK_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentOK'))

		Thread.sleep(5000)

	}

	@When("I should see assessment data")
	public void I_should_see_assessment_data() {

		WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_Decline'), 1)

		String Actual_Question = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_Decline'))
		WebUI.verifyEqual(Actual_Question, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry.')

//		String Actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/UnCheck_Assessments/Obj_AssessmentName_AssessmentSection_CP'))
//		WebUI.verifyEqual(Actual_Title, 'Assessment TestingName')
		
	}

	@And("I click on problem plus button")
	public void I_click_ProblemPlus_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_Plus'))

	}

	@And("I hover over on problem")
	public void I_HoverOver_Problem() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_Hover'))

	}



	@And("I select activeproblem as:(.*)")
	public void i_select_ActiveProblem(String ActiveProblem) {
		'I click on ActiveProblem field'
		WebUI.click(activeProblemobj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+ActiveProblem+'"]'
		obj.selectdropdown(frame,xpath)
	}


	@And("I enter (.*) as problemcode")
	public void EnterProblemCode(String ProblemCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_Code'), ProblemCode)
		Thread.sleep(1000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_Code'), Keys.chord(Keys.ENTER))

	}


	@And("I enter (.*) as problemStartDate")
	public void I_EnterProblemStartDate(String StartDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_startDate'),StartDate)

	}


	@And("I click on updated button")
	public void I_click_Update_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_Problem_UpdatedBTN'))

	}


	@And("I should see (.*) and (.*) as updated problem")
	public void I_click_ShouldSeeProblemData(String ProblemCode, String StartDate) {


		String Actual_Problem = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_ProblemValidation_Code'))

		if(!Actual_Problem.contains(ProblemCode)){

			WebUI.verifyMatch(Actual_Problem, ProblemCode, false)

		}


		String date = StartDate.substring(0, 2)

		String actual_DateOfServiceDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDProblem/Obj_ProblemValidation_StartDate'))

		String date1 = StartDate.substring(0, 2)


		//WebUI.verifyMatch(actual_DateOfServiceDate, DateOfService_FromDate(new SimpleDateFormat("H:mm a"), false)

		WebUI.verifyMatch(date, date1, false)

	}


	@And("I click on allergies plus button")
	public void I_click_AllergyPlus_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_Allergies_Plus'))

	}

	@And("I hover over on allergies")
	public void I_HoverOver_Allergy() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_Allergies_Hover'))

	}



	@And("I select allergyType as:(.*)")
	public void i_select_substances(String AllergySubstances) {
		'I click on ActiveProblem field'
		WebUI.click(AllergySubstancesobj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+AllergySubstances+'"]'
		obj.selectdropdown(frame,xpath)
	}


	@And("I enter (.*) as allergycode")
	public void EnterAllergyCode(String AllergyCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_Allergies_Code'), AllergyCode)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_Allergies_Code'), Keys.chord(Keys.ENTER))

	}


	@And("I enter (.*) as allergyStartDate")
	public void I_EnterAllergyStartDate(String StartDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_Allergies_startDate'),StartDate)

	}

	@And("I should see (.*) and (.*) and (.*) as updated allergies")
	public void I_ShouldSeeAllergyData(String AllergySubstances, String AllergyCode, String StartDate) {

		'Verify Substances'
		String actualSubstance = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_AllergiesValidation_Substance'))

		WebUI.verifyEqual(AllergySubstances, AllergySubstances)


		'Verify Allergy Code'
		String Actual_Allergy = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDAllergies/Obj_AllergiesValidation_Code'))

		if(!Actual_Allergy.contains(AllergyCode)){

			WebUI.verifyMatch(Actual_Allergy, AllergyCode, false)

		}


		'Verify Start Date'
		String date = StartDate.substring(0, 2)

		String date1 = StartDate.substring(0, 2)

		WebUI.verifyMatch(date, date1, false)

	}


	@And("I click on medication as per patient plus button")
	public void I_click_medicationPlus_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Plus'))

	}

	@And("I hover over on medication as per patient")
	public void I_HoverOver_medication() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Hover'))

	}


	@And("I enter (.*) as medication as per patient Code")
	public void Entermedicationcode(String MedicationCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Code'), MedicationCode)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Code'), Keys.chord(Keys.ENTER))

	}


	@And("I enter (.*) as medication as per patient")
	public void I_EntermedicationStart_Date(String StartDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_startDate'),StartDate)

	}


	@And("I should see (.*) and (.*) as updated medication as perpatient")
	public void I_click_ShouldSeeMedicationData(String MedicationCode, String StartDate) {


		String Actual_Medication = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_MedicationValidation_Code'))

		if(!Actual_Medication.contains(MedicationCode)){

			WebUI.verifyMatch(Actual_Medication, MedicationCode, false)

		}


		String date = StartDate.substring(0, 2)

		String date1 = StartDate.substring(0, 2)

		WebUI.verifyMatch(date, date1, false)

	}

	@And("I click on medication as per EHR plus button")
	public void I_click_medicationEHRPlus_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per EHR/Obj_Medication_Plus'))

	}

	@And("I hover over on medication as per EHR")
	public void I_HoverOver_medicationEHR() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per EHR/Obj_Medication_Hover'))

	}


	@And("I enter (.*) as medication as per EHR Code")
	public void EntermedicationcodeEHR(String MedicationCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Code'), MedicationCode)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_Code'), Keys.chord(Keys.ENTER))

	}


	@And("I enter (.*) as medication as per EHR")
	public void I_EntermedicationStart_DateEHR(String StartDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per Medication/Obj_Medication_startDate'),StartDate)

	}


	@And("I should see (.*) and (.*) as updated medication as PerEHR")
	public void I_click_ShouldSeeMedicationDataPerEHR(String MedicationCode, String StartDate) {


		String Actual_Medication = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/CP_ADDMedications/As Per EHR/Obj_MedicationValidation_Code'))

		if(!Actual_Medication.contains(MedicationCode)){

			WebUI.verifyMatch(Actual_Medication, MedicationCode, false)

		}


		String date = StartDate.substring(0, 2)

		String date1 = StartDate.substring(0, 2)

		WebUI.verifyMatch(date, date1, false)

	}

}
