package patientGrid
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import utility_Functions.UtilityFunctions

class SD_Schedule {

	UtilityFunctions obj=new UtilityFunctions();
	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	TestObject ApptStatusClickobj=findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ApptStatusClick')



	@And("I hover over the created appointment")
	public void I_hover_over_on_Appointment() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DoubleClick_ScheduleAppointment'))
		Thread.sleep(2000)
	}

	@Then("I should see (.*) as VisitType")
	public void I_should_see_appointment_Data(String VisitType) {


		WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'), VisitType)


		//		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'))
		//		WebUI.verifyEqual(actual_VisitTypeName, VisitType.contains("Telehealth"))


		//		String actual_ReasonName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ReasonVerify'))
		//		WebUI.verifyEqual(actual_ReasonName, "Reason: Back pain")
		//
		//		String actual_PatientName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_PatientVerify'))
		//		WebUI.verifyEqual(actual_PatientName, "Patient: Dermo505, Mac505")
		//
		//		String actual_ProviderName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ApptProviderVerify'))
		//		WebUI.verifyEqual(actual_ProviderName, "Appt. Provider: Amir, Hafiz")

		//		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'))
		//		WebUI.verifyEqual(actual_VisitTypeName, "Visit Type: Telehealth")




	}



	@Then("I should see (.*) as Provider")
	public void I_should_see_appointmentProvider_Data(String ApptProvider) {

		WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ApptProviderVerify'), ApptProvider)
	}




	@When("I click on schedule left filters reset button")
	public void I_click_on_reset_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ResetBTN'))
		Thread.sleep(8000)
	}

	@When("I click on edit appointment button")
	public void I_click_on_EditAppointment_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_EditAppointment'))
		Thread.sleep(2000)
	}


	@When("I Search (.*) as schedule visit type")
	public void I_Search_VisitType_Schedule(String VisitType) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_VisitTypeLeftFilters'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_VisitTypeLeftFilters'), VisitType)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_VisitTypeLeftFilters'), Keys.chord(Keys.ENTER))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ProviderLeftFilters'))

		Thread.sleep(3000)
	}

	@When("I Search (.*) as schedule appt provider")
	public void I_Search_Provider_Schedule(String ApptProvider) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ProviderLeftFilters'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_ProviderLeftFilters'), ApptProvider)
		Thread.sleep(1000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_ProviderLeftFilters'), Keys.chord(Keys.ENTER))

		Thread.sleep(1000)
	}



	@When("I click on schedule apply button")
	public void I_click_on_schedule_apply_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ApplyBTN'))
		Thread.sleep(3000)
	}


	@Then("I should see patient data same as excel")
	public void I_should_see_patient_ExcelData() {


		String actual_PatientName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyPatientName'))
		WebUI.verifyEqual(actual_PatientName, findTestData('DF_CMRData/TD_SUI').getValue(1, 2))


		String actual_MRN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyMRN'))
		WebUI.verifyEqual(actual_MRN, findTestData('DF_CMRData/TD_SUI').getValue(2, 2))


		String actual_Reason = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyReason'))
		WebUI.verifyEqual(actual_Reason, findTestData('DF_CMRData/TD_SUI').getValue(3, 2))

		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyVisitType'))
		WebUI.verifyEqual(actual_VisitTypeName, findTestData('DF_CMRData/TD_SUI').getValue(4, 2))


		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyStatus'))
		WebUI.verifyEqual(actual_Status, findTestData('DF_CMRData/TD_SUI').getValue(5, 2))

		String actual_ApptProvider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyProvider'))
		WebUI.verifyEqual(actual_ApptProvider, findTestData('DF_CMRData/TD_SUI').getValue(6, 2))

		String actual_Gender = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyGender'))
		WebUI.verifyEqual(actual_Gender, findTestData('DF_CMRData/TD_SUI').getValue(7, 1))
	}

	@Then("I should see (.*) as apptStatus")
	public void I_should_see_appointmentStatus_Data(String ApptStatus) {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyStatus'))
		WebUI.verifyEqual(actual_Status, ApptStatus)
	}

	@When("I click on current appointment")
	public void I_click_on_currentAppt_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ApptStatus_CurrentApptBtn'))
	}

	@And("I select Appt Status as:(.*)")
	public void i_select_ApptStatus(String ApptStatus) {
		'I click on ActiveProblem field'
		WebUI.click(ApptStatusClickobj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+ApptStatus+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@When("I click on specific date")
	public void I_click_on_date() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_SpecificDate'))
	}

	@When("I should see record is showing")
	public void RecordByDate() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ThreeDots'),3)
	}


	@When("I click on week button")
	public void WeekBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_WeekBtn'))
	}


	@When("I should see record as per weekView")
	public void RecordWeekView() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ThreeDots'),3)
	}


	@When("I click on month button")
	public void MonthBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_MonthBtn'))
	}

	@When("I should see record as per monthView")
	public void RecordMonthView() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ThreeDots'),3)
	}

	@When("I click on checkIn button")
	public void CheckInBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckInBtn'))
	}


	@When("I should see checkIn title")
	public void CheckInTitle() {

		String actual_checkTitle = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckIn_Title'))
		WebUI.verifyEqual(actual_checkTitle, "Check-In")
		Thread.sleep(1000)
	}

	@When("I enter (.*) as CheckInComment")
	public void CheckInComment(String CheckIn_Comment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_scheduleComment'), CheckIn_Comment)
	}
	@When("I click on appointment update button")
	public void UpdatedAppoitnemtnBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_UpdatedBtn'))
	}
	@When("I click on check edit button")
	public void CheckEditBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckInBtn'))
	}
	@When("I should see check edit title")
	public void CheckEditTitle() {

		String actual_checkTitle = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckIn_Title'))
		WebUI.verifyEqual(actual_checkTitle, "Edit Check-In")
	}

	@When("I click on check out button")
	public void CheckOutBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckOutBtn'))
	}
	@When("I should see check out title")
	public void CheckOutTitle() {

		String actual_checkTitle = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CheckIn_Title'))
		WebUI.verifyEqual(actual_checkTitle, "Check-Out")
	}
	@When("I enter (.*) as CheckOutComment")
	public void CheckOutComment(String CheckOut_Comment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_scheduleComment'), CheckOut_Comment)
	}

	@When("I enter (.*) as CheckEditComment")
	public void CheckEditComment(String CheckEdit_Comment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_scheduleComment'), CheckEdit_Comment)
	}

	@When("I click on cancel appointment button")
	public void CancelBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_CancelBTN'))
	}


	@When("I click on logout button")
	public void Logout() {

		WebUI.click(findTestObject('OR_LogoutPage/Obj_Logout'))

		WebUI.click(findTestObject('OR_LogoutPage/Obj_Sign Out'))
	}

	@When("I enter login credentials")
	public void Login() {

		String Email = "ha@slt.com"
		String Password = "Hafiz12"

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), Email)

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), Password)


		WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))
	}


	@When("I should see (.*) and (.*) as ScheduleLeftFilters")
	public void ScheduleLeftFilters(String VisitType, String ApptProvider) {

		String actual_VisitType = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VisitTypeValidation'))
		WebUI.verifyEqual(actual_VisitType, VisitType)

		String actual_ApptProvider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ApptProviderValidation'))
		WebUI.verifyEqual(actual_ApptProvider, ApptProvider)
	}

	@When("I should see default time")
	public void defaultTime() {

		String DefaultTime = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_defaultTime'))
		WebUI.verifyEqual(DefaultTime, "8:00 AM")
	}

	@When("I click on ViewPatientRecord button")
	public void ViewPatientRecord() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ViewPatientRecord'))
	}

	@When("I should see created appointment data is showing")
	public void appointmentData() {

		String actualPatient = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Appointment_PatientName'))
		WebUI.verifyEqual(actualPatient, "Dermo505, Mac505")

		String actualReason = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Appointment_Reason'))
		WebUI.verifyEqual(actualReason, "Back pain")

		String actualProvider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_AppointmentTab_Participant'))
		WebUI.verifyEqual(actualProvider, "Amir, Hafiz")


		String actualAppointmentStatus = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Appointment_Status'))
		WebUI.verifyEqual(actualAppointmentStatus, "Scheduled")
	}

	@When("I click on View Patient Record button")
	public void ViewPatientRecordBtn() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ViewPatientRecord_UpdatedPath'))
	}

	@When("I click on delete icon button to delete appointment")
	public void DeleteAppt() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_deleteAppointment'))
	}

	@When("I should see schedule UI status")
	public void ScheduletUIStatus() {

		String actuaSchedulelStatus = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ScheduleStatusValidation'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ScheduleStatusValidation'), actuaSchedulelStatus)
	}

	@When("I select BlockName")
	public void SelectBlockName() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_NameClick'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_NameSelect'))
	}

	@When("I click on Add Block button")
	public void AddBlockBTn() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_BTN'))
	}

	@When("I should see add block title")
	public void BlockTitle() {

		String actuaTitle = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_TitleVerify'))
		WebUI.verifyEqual(actuaTitle, "Add Block")
	}

	@When("I enter (.*) as blockname")
	public void SetBlockName(String BlockName) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_Name'), BlockName)
		Thread.sleep(1000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_Name'),Keys.chord(Keys.ENTER))
	}

	@When("I enter (.*) as block_StartDate")
	public void SetBlockStartDate(String StartDate) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_StartDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_StartDate'),StartDate)
	}

	@When("I enter (.*) as block_Time")
	public void SetBlockTime(String Time) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_StartTime'),Time)
	}
	@When("I enter (.*) as block_comment")
	public void SetBlockComment(String Comment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_Note'),Comment)
	}

	@When("I click on save block button")
	public void ClickSaveBlockBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_SaveBtn'))
	}

	@When("I click on delete block button")
	public void ClickDeleteBlockBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_Delete'))
	}

	@When("I should see block successful save message")
	public void ValidateBlockSuccessMessage() {


		String actual_message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Block_SuccessMessage'))
		WebUI.verifyEqual(actual_message, "successAppointment block saved successfully.Hide")
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))
	}
}