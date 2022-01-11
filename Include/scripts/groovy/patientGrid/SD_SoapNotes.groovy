package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import utility_Functions.UtilityFunctions

class SD_SoapNotes {

	UtilityFunctions obj=new UtilityFunctions();
	TestObject frame=findTestObject('Object Repository/OR_OpenPatient/frame')
	TestObject VisitTypeObj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthClick')
	TestObject SourceObj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_SourceClick')


	WebDriver driver;

	@When("I click on schedule tab")
	public void I_click_on_scheduletab() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ScheduleTab'), 15)

		Thread.sleep(10000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ScheduleTab'))
		Thread.sleep(8000)
	}

	@And("I double click on screen to add appointment")
	public void I_double_click_on_screen_to_add_appointment() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DoubleClick_ScheduleAppointment'), 20)

		WebUI.doubleClick(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DoubleClick_ScheduleAppointment'))
		Thread.sleep(3000)
	}

	@Then("I should see schedule appointment popup")
	public void I_should_see_schedule_appointment_popup() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ScheduleAppointment_Title'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ScheduleAppointment_Title'), actual_Title)
	}

	@When("I enter (.*) as appointment patient")
	public void I_enter_patient_as_appointment(String Patient) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_PatientSearch'), Patient)

		Thread.sleep(5000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_PatientSearch'), Keys.chord(Keys.ENTER))
	}

	@When("I enter (.*) as appointment reason")
	public void I_enter_reason_as_appointment(String Reason) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_ReasonClick'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_ReasonSearch'), Reason)

		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_ReasonSearch'), Keys.chord(Keys.ENTER))

		Thread.sleep(2000)
	}

	@And("I select Visit Type:(.*)")
	public void i_select_VisitType(String VisitType) {
		'I click on privacy field'
		WebUI.click(VisitTypeObj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//div[@id="Appointment-type-list"])[2]//ul//li[text()="'+VisitType+'"]'

		obj.selectdropdown(frame,xpath)
	}

	@And("I should see VisitType Link")
	public void I_should_see_VisitTypeLink() {


		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthLink'),3)
	}

	@And("I should see Send SMS button")
	public void I_should_see_SendSMS() {

		String actual_SMSBTN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthSMSBTN'))
		WebUI.verifyEqual(actual_SMSBTN, "Send SMS")
	}


	@And("I should see Copy button")
	public void I_should_see_CopyBTN() {

		String actual_SMSBTN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthCopyBTN'))
		WebUI.verifyEqual(actual_SMSBTN, "Copy")
	}


	@And("I should not see VisitType Link")
	public void I_should_Notsee_VisitTypeLink() {


		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthLink'),3)
	}

	@And("I should not see Send SMS button")
	public void I_should_Notsee_SendSMS() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthSMSBTN'),3)
	}


	@And("I should not see Copy button")
	public void I_should_Notsee_CopyBTN() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Appointment_TelehealthCopyBTN'),3)
	}


	@Then("I should see (.*) as actual patient name")
	public void I_should_see_patient_Information(String Patient) {

		String actual_patient = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_Name'))
		WebUI.verifyEqual(actual_patient, Patient)
	}

	@And("I drag chat list")
	public void I_drag_chat_list() {

		WebUI.dragAndDropByOffset(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DragChatList'), 30, 50)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DragChatList'))
	}

	@And("I click create button to save appointment")
	public void I_Click_CreateBtn_Appointment() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_CreateBtn_Appointment'))


		Thread.sleep(5000)
	}

	@And("I click on yes button")
	public void I_click_on_yes_button() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_YesBtn'), 10)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_YesBtn'))
		Thread.sleep(2000)

	}

	@And("I click on proceed button to appointment")
	public void I_Click_ProceedBtn() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ProceedBtn'), 10)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_ProceedBtn'))
		Thread.sleep(2000)
	}

	@Then("I should see appointment success message")
	public void I_should_see_appointment_SuccessMessage() {

		String actual_message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AppointmentSuccess_Message'))
		WebUI.verifyEqual(actual_message, "successAppointment created successfully.Hide")
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))
	}

	@Then("I should see appointment updated message")
	public void I_should_see_appointment_UpdatedMessage() {

		String actual_message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AppointmentUpdated_Message'))
		WebUI.verifyEqual(actual_message, "successAppointment updated successfully.Hide")
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))
	}

	@Then("I should see already scheduled appointment")
	public void I_should_see_Already_Added_Appointment() {

		//WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AlreadyAppointment'), 30)

		String actual_message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AlreadyAppointment'))

		//WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AlreadyAppointment'), actual_message)
		WebUI.verifyEqual(actual_message, "Dermo505, Mac505 - Back pain Amir, Hafiz")
	}

	@When("I click on three dots")
	public void I_Click_Three_Dots() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_ThreeDots'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_ThreeDots'))
		Thread.sleep(1000)
	}

	@Then("I click on delete appointment")
	public void I_Click_delete_appointmentBtn() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DeleteAppointmentBtn'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DeleteAppointmentBtn'))
	}
	@Then("I should see delete appointment message")
	public void I_should_see_appointment_DeleteMessage() {

		String actual_message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_AppointmentDelete_Message'))
		WebUI.verifyEqual(actual_message, "successAppointment deleted successfully.Hide")

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))
	}

	@And("I hover over on create soapnotes")
	public void I_hover_over_on_create_soap_notes() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Hover_CreateSoapNotes'))
	}

	@And("I click on edit soapnotes")
	public void I_hover_over_on_edit_soap_notes() {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_EditSoapNotes'), 15)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_EditSoapNotes'))

		Thread.sleep(4000)
	}

	@And("I click on based on patient medical record")
	public void I_click_kon_based_on_patient_medical_record() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_BasedOnPatientMedicalRecord'), 5)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_BasedOnPatientMedicalRecord'))

		Thread.sleep(5000)
	}

	@And("I click on blankSoapNote")
	public void I_click_kon_BlankTab() {

		Thread.sleep(3000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_blank'), 5)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Click_blank'))

		Thread.sleep(4000)
	}


	@Then("I should see (.*) as patient")
	public void I_should_see_patient_data_on_add_notes_Popup(String Patient) {

		String actual_patientName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_PatientName_AddSoapNotePopUP'))

		WebUI.verifyEqual(actual_patientName, Patient)


		//		String actual_MRN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_MRN_AddSoapNotePopUP'))
		//		WebUI.verifyEqual(actual_MRN, "EntMerging505")


		//		String DOB = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_DOB_AddSoapNotePopUP'))
		//		WebUI.verifyEqual(DOB, "09/07/1905")


		//		String Actual_VisitType = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_VisitType'))
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_VisitType'), Actual_VisitType)

		//WebUI.verifyEqual(Actual_VisitType, "Telehealth")

		//
		//		String Actual_AppointmentProvider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_Appointment_Provider'))
		//
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_Appointment_Provider'), Actual_AppointmentProvider)

		//WebUI.verifyEqual(Actual_AppointmentProvider, "Amir, Hafiz")

	}

	@And("I click on add HRA plus button")
	public void I_click_Add_HRA() {


		WebUI.enableSmartWait()

		Thread.sleep(12000)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/Obj_Add_HRA_Hover'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/Obj_Add_HRA_Plus'),20)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/Obj_Add_HRA_Plus'))

		Thread.sleep(10000)
	}

	@Then("I should see HRA popup with all tabs")
	public void I_should_see_ThreeTabs() {

		WebUI.enableSmartWait()
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_HistoryTab'), 3, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_ReviewOfSystem'), 3, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_ExamAndRecomendation'), 3, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I enter (.*) as the patient understands")
	public void i_enter_I_am_not_assuming_any_responsibility_for_their_care_of_providing_direct_treatment_as_the_patient_understands(String ThePatientUnderstands) {

		//WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/Page_Welcome to Persivia/iframe_Assessment_hraIframe'), 0)


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_ThePatientUnderstands_Click'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_ThePatientUnderstands_Select'),ThePatientUnderstands)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_ThePatientUnderstands_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) to add signature for sign button")
	public void I_enter_facility_to_add_signature_forSIgnBTN(String Facility) {

		//WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/Page_Welcome to Persivia/iframe_Assessment_hraIframe'), 0)


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_Facility_Click'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_SearchFacility'),Facility)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_SearchFacility'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as Does the patient have any clinical issues that need to be addressed today")
	public void i_enter_Yes_as_Does_the_patient_have_any_clinical_issues_that_need_to_be_addressed_today(String DoesThePatientHaveAnyClinicalIssuesThatNeedToBeAddressedToday) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Doesthepatienthaveanyclinicalissuesthatneedtobeaddressedtoday_Click'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Doesthepatienthaveanyclinicalissuesthatneedtobeaddressedtoday_Select'),DoesThePatientHaveAnyClinicalIssuesThatNeedToBeAddressedToday)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Doesthepatienthaveanyclinicalissuesthatneedtobeaddressedtoday_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as explain detais of Does the patient have any clinical issues that need to be addressed today")
	public void i_enter_explainDetailsOf_as_Does_the_patient_have_any_clinical_issues_that_need_to_be_addressed_today(String ExplainDetails1) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Doesthepatienthaveanyclinicalissuesthatneedtobeaddressedtoday_ExplainDetails'),ExplainDetails1)
	}

	@Then("I enter (.*) as Was a translator used during today visit")
	public void i_enter_as_Was_translator_usedS_during_today_visit(String WasTranslatorUsedDuringTodayVisit) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Wasatranslatorusedduringtodayvisit_Click'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Wasatranslatorusedduringtodayvisit_Select'),WasTranslatorUsedDuringTodayVisit)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Wasatranslatorusedduringtodayvisit_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as explain detais of Was a translator used during today visit")
	public void i_enter_explainDetails_as_Was_translator_usedS_during_today_visit(String ExplainDetails2) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Wasatranslatorusedduringtodayvisit_ExplainDetails'),ExplainDetails2)
	}

	@Then("I enter (.*) as location of visit")
	public void i_enter_as_location_of_visit(String LocationOfVisit) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Click'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'),LocationOfVisit)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as location of visit1")
	public void i_enter_as_location_of_visit1(String LocationOfVisit1) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Click'))
		Thread.sleep(2000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'),LocationOfVisit1)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as location of visit2")
	public void i_enter_as_location_of_visit2(String LocationOfVisit2) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Click'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'),LocationOfVisit2)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_LocationOfVisit_Select'), Keys.chord(Keys.ENTER))
	}

	@Then("I enter (.*) as pc name")
	public void i_enter_as_pc_name(String PCName) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_PCName'),PCName)
	}

	@Then("I enter (.*) as pc phone number")
	public void i_enter_as_pc_phone_number(String PC_PhoneNumber) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_PC_PhoneNumber'),PC_PhoneNumber)
	}

	@Then("I enter (.*) as patient care team")
	public void i_enter_patient_care_team_notes(String PatientCareTeam_Notes) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_PatientCareTeam_Notes'),PatientCareTeam_Notes)
	}

	//	@Then("I select date when end of life")
	//	public void i_select_date_when_end_of_life() {
	//
	//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Datewhenendoflifewasdiscussed_Click'))
	//
	//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Datewhenendoflifewasdiscussed_Select'))
	//	}

	@Then("I click on save button to save assessment")
	public void I_clickonsavebuttontosaveassessment() {

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Save_BTN'), 30)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_Save_BTN'))
	}

	@Then("I should see assessment saved successfully message")
	public void I_should_see_assessmentSavedSuccessfullyMessage() {

		String actual_patient = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HistoryTab/Obj_AssessmentSuccessMessage'))
		WebUI.verifyEqual(actual_patient, "Assessment Saved Successfully !")

	}

	@Then("I click on Review Of System Tab")
	public void I_click_ReviewSystemTab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_ReviewOfSystem'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_ReviewOfSystem'))
	}

	@Then("I enter (.*) as temprature")
	public void i_enter_temp(String Temp) {

		Thread.sleep(2000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Temp'),Temp)
	}

	@Then("I enter (.*) as pulse")
	public void i_enter_pulse(String Pulse) {

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Pulse'),Pulse)
	}

	@Then("I enter (.*) as repeat pulse")
	public void i_enter_RepeatPulse(String Repeat_Pulse) {

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_RepeatPulse'),Repeat_Pulse)
	}

	@Then("I enter (.*) as resp rate")
	public void i_enter_RespRate(String Resp_Rate) {

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_RespRate'),Resp_Rate)
	}

	@Then("I enter (.*) as pulse ox")
	public void i_enter_PulseOx(String Pulse_Ox) {

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_PulseOx'),Pulse_Ox)
	}

	@Then("I enter (.*) as repeat pulse ox")
	public void i_enter_RepeatPulseOx(String Repeat_Pulse_Ox) {

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_RepeatPulseOx'),Repeat_Pulse_Ox)
	}

	@Then("I select Have you ever been told you have problems with sight")
	public void I_select_Haveyoueverbeentoldyouhaveproblemswithsight() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Haveyoueverbeentoldyouhaveproblemswithsight_Click'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Haveyoueverbeentoldyouhaveproblemswithsight_Select'),"Yes")

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Haveyoueverbeentoldyouhaveproblemswithsight_Select'), Keys.chord(Keys.ENTER))

	}

	@Then("I select Do you have any of the following diagnosis")
	public void I_select_Doyouhaveanyofthefollowingdiagnosis() {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Do you have any of the following diagnosis_Input'),"cataracts")
		Thread.sleep(1000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Do you have any of the following diagnosis_Input'), Keys.chord(Keys.ENTER))

	}

	@Then("I select Diagnosis")
	public void I_select_Diagnosis() {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Select Diagnosis_Input'),"H26.40-Unspecified")
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ReviewOfSystemTab/Obj_Select Diagnosis_Input'), Keys.chord(Keys.ENTER))

	}

	@Then("I click on Exam and Recomendation Tab")
	public void I_click_examandrecomendation() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_ExamAndRecomendation'))

		Thread.sleep(5000)
	}

	@Then("I enter (.*) as constitutional")
	public void i_enter_constitutional(String Constitutional) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_Constitutional'),Constitutional)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_Constitutional'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as pad test today")
	public void i_enter_padTest(String PADTestToday) {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTestClick'))

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTestInput'),
				PADTestToday)
		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTestInput'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as reason or conditon test")
	public void i_enter_Reason(String ReasonTest) {

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_ReasonInput'),ReasonTest)

		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_ReasonInput'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as left results")
	public void i_enter_leftResults(String LeftResults) {

		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_LeftResultsClick'))

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_LeftResulsInupt'),LeftResults)

		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_LeftResulsInupt'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as right result")
	public void i_enter_RightResults(String RightResults) {

		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_RightResultsClick'))

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_RightResultsInput'),RightResults)

		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_PadTest_RightResultsInput'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as ExamAndRecomendation_Comment")
	public void i_enter_ExamAndRecomendation_Comment(String ExamAndRecomendation_Comment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_ExamAndRecomendation'),ExamAndRecomendation_Comment)
	}

	@Then("I select on Referral required")
	public void i_enter_referral() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralClick'))

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralInput'),
				'Yes')
		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralInput'), Keys.chord(Keys.ENTER))

	}

	@Then("I select urgency status as referral")
	public void i_select_ReferralStatus() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralStatusClick'))

		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralStatusInput'),"Non-Urgent")

		WebUI.sendKeys(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReferralStatusInput'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter reason of referralreason")
	public void i_select_ReferralReason() {


		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReasonReferral'),"Test by amir")


	}

	@Then("I click on cross icon to close the popup")
	public void I_click_cross_button() {

		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/ExamAndRecomendation/Obj_CrossBTN_Popup'))
	}

	@Then("I should see added assessment data in soap note popup")
	public void I_should_see_assessment_data_soapNote() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_Constitutional_Question'), 20)

		String Actual_Question1 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_ThePatientUnderstand_Question'))
		WebUI.verifyEqual(Actual_Question1, "The patient understands")

		String Actual_Question2 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_LocatoinOfVisit_Question'))
		WebUI.verifyEqual(Actual_Question2, "Location of visit?")

		String Actual_Question3 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_PCName_Question'))
		WebUI.verifyEqual(Actual_Question3, "PCP Name:")

		//		String Actual_Question4 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_Constitutional_Question'))
		//		WebUI.verifyEqual(Actual_Question4, "Constitutional:")

	}

	@Then("I should see Diagnosis entered data")
	public void I_should_Doagnosis_Question() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_Diagnosis_Question'), 20)

		String Actual_Question = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_HRA/HRA_Table_Verification/Obj_Diagnosis_Question'))
		WebUI.verifyEqual(Actual_Question, "Constitutional:")


	}

	@Then("I click on add Medication plus button")
	public void I_click_On_Medication_PlusBTN() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medicatoin_Hover'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Plus'), 20)

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Plus'))

		Thread.sleep(2000)

	}

	@Then("I click on add Medication existing button")
	public void I_click_On_Medication_existing() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medicatoin_Hover'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Existing'), 20)

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Existing'))

		Thread.sleep(2000)

	}

	@Then("I select the medication checkbox")
	public void SelectMedicationCheckbox() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Existing_UniqueCheckbox'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_Existing_Checkbox'))


	}


	@Then("I enter (.*) as the medication code")
	public void i_enter_MedicationCode(String MedicationCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_Input'),MedicationCode)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_Input'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as medication route")
	public void I_select_MedicationRoute(String Medication_Route) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_RouteClick'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_RouteSearch'),Medication_Route)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_RouteSearch'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as start date")
	public void i_enter_Medication_StartDate(String Medication_Start_Date) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medication_StartDate'),Medication_Start_Date)

	}

	@Then("I enter (.*) as medication reason")
	public void i_enter_MedicationReason(String Medication_Reason) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_Reason'),Medication_Reason)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_Reason'), Keys.chord(Keys.ENTER))

	}


	@Then("I enter (.*) as medication despensed quantity")
	public void i_enter_MedicationDispensedQuantity(String Medication_DispensedQuantity) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_DispensedQuantity'),Medication_DispensedQuantity)

	}

	@Then("I click on saveclose button to save medications")
	public void I_click_On_SaveCloseBTN_Medication() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_SaveClose'))

	}

	@Then("I click on saveclose button to save allergy")
	public void I_click_On_SaveCloseBTN_allergy() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_SaveClose'))

		Thread.sleep(2000)
	}


	@Then("I should see medications existing data in grid")
	public void I_should_see_medication_data_Grid() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_ExistingMedicationRow_Grid'), 20)

		String Actual_Medication = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_ExistingMedicationRow_Grid'))

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_ExistingMedicationRow_Grid'), Actual_Medication, FailureHandling.STOP_ON_FAILURE)

	}

	@Then("I should see medications data in soap note popup")
	public void I_should_see_medication_data_soapNote() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_MedicationCode'), 20)

		String Actual_Medication = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_MedicationCode'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_MedicationCode'), Actual_Medication, FailureHandling.STOP_ON_FAILURE)


		String Actual_Route = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_Route'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_Route'), Actual_Route, FailureHandling.STOP_ON_FAILURE)

		String Actual_StartDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_StartDate'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_StartDate'), Actual_StartDate, FailureHandling.STOP_ON_FAILURE)

		String Actual_Reason = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_Reason'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_Reason'), Actual_Reason, FailureHandling.STOP_ON_FAILURE)


		String Actual_DispensedQuantity = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_DispensedQuantity'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Medication_DataVerification/Obj_Entered_DispensedQuantity'), Actual_DispensedQuantity, FailureHandling.STOP_ON_FAILURE)


	}


	@Then("I click on add Problems plus button")
	public void I_click_On_Problems_PlusBTN() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Hover'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Plus'), 10)

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Plus'))

	}

	@Then("I click on add Problem existing button")
	public void I_click_On_Problems_ExistingBTN() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Hover'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Plus'), 10)

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Plus'))

	}

	@Then("I enter (.*) as the problems code")
	public void i_enter_ProblemsCode(String ProblemsCode) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Input'),ProblemsCode)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_Input'), Keys.chord(Keys.ENTER))

	}

	@Then("I enter (.*) as problems start date")
	public void I_select_ProblemsStartDate(String Problems_Start_Date) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Obj_Problems_StartDate'),Problems_Start_Date)
	}

	@Then("I click on saveclose button to save problems")
	public void I_click_On_SaveCloseBTN_Problems() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Medications/Obj_Medications_SaveClose'))

	}

	@Then("I should see problems data in soap note popup")
	public void I_should_see_problems_data_soapNote() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Problems_DataVerification/Obj_Entered_ProblemsCode'), 20)

		String Actual_Problems = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Problems_DataVerification/Obj_Entered_ProblemsCode'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Problems_DataVerification/Obj_Entered_ProblemsCode'), Actual_Problems, FailureHandling.STOP_ON_FAILURE)


		String Actual_DispensedQuantity = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Problems_DataVerification/Obj_Entered_StartDate'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Problems/Problems_DataVerification/Obj_Entered_StartDate'), Actual_DispensedQuantity, FailureHandling.STOP_ON_FAILURE)


	}


	@When("I click on Save button to save SOAP NOTE")
	public void I_click_On_SaveBTN_toSaveSOAPNOTE() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SaveBTN_SOAPNote'))

		Thread.sleep(4000)

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))


	}

	@When("I click on SaveClose button to save SOAP NOTE")
	public void I_click_On_SaveCloseBTN_toSaveSOAPNOTE() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SaveCloseBTN_SOAPNote'))

		Thread.sleep(4000)

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))


	}

	@Then("I should see soap note saved message")
	public void I_should_see_save_notes_message() {


		String Actual_Message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SOAPNoteSaved_Message'))

		WebUI.verifyEqual(Actual_Message, "successSOAP Note SavedHide")
	}

	@Then("I should see Edit Soap Note option")
	public void I_Click_EditSoapNoteOption() {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_EditSoapNotes'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_EditSoapNotes'))

		Thread.sleep(3000)
	}

	@And("I click on add Lab Results plus button")
	public void I_click_Add_LabResults() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Hover'), 25)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Hover'))

		Thread.sleep(5000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Plus'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Plus'))

		Thread.sleep(2000)
	}

	@And("I enter (.*) as lab results in search and select analyte")
	public void I_enter_labResults(String LabResults) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Input'),LabResults)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_Input'), Keys.chord(Keys.ENTER))

	}

	@And("I click on lab resutls OK button")
	public void I_click_On_LabResultsBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/Obj_LabResults_OK_BTN'))

		Thread.sleep(3000)
	}

	@Then("I should see Lab Resultss data in soap note popup")
	public void I_should_see_LabResutls_Table() {


		String Actual_EnteredValue = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/LabResutls_DataVerification/Obj_Entered_LabResults'))

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_LabResults/LabResutls_DataVerification/Obj_Entered_LabResults'), Actual_EnteredValue, FailureHandling.STOP_ON_FAILURE)
	}



	@And("I click on add diagnosis plus button")
	public void I_click_Add_diagnosis() {


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_Diagnosis_Hover'), 25)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_Diagnosis_Hover'))

		Thread.sleep(5000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_Diagnosis_Plus'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_Diagnosis_Plus'))

		Thread.sleep(2000)
	}

	@And("I enter (.*) as diagnosis")
	public void I_enter_diagnosis(String Diagnosis) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_diagnosis_Input'),Diagnosis)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_diagnosis_Input'), Keys.chord(Keys.ENTER))

	}

	@And("I click on diagnosisSave button")
	public void I_click_On_dianosisSaveBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_Diagnosis/Obj_diagnosisSave_BTN'))

		Thread.sleep(3000)
	}

	@And("I click on super bill edit button")
	public void I_click_On_dianosisEditBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_EditBTN'))

		Thread.sleep(3000)
	}
	@And("I click on diagnosisSaveClose button")
	public void I_click_On_diagnosisSupberSaveClose() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_Diagnosis_SaveClose'))

		Thread.sleep(3000)
	}

	@Then("I should see (.*) as diagnosis data in superbill grid")
	public void I_should_see_diagnosisdatainsuperbillgrid(String Diagnosis) {


		String Actual_EnteredValue = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_DiagnosisValidation'))

		WebUI.verifyEqual(Actual_EnteredValue, Diagnosis)
	}

	@And("I click on Billing Information Edit button")
	public void I_click_On_BillingInformation_EditBTN() {

		Thread.sleep(12000)


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Hover'), 30)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_EditButton'), 15)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Hover'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_EditButton'))

		Thread.sleep(1000)
	}

	@And("I click on Add button to billing info")
	public void I_click_On_BillingInformation_AddBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_AddBTN'))

		Thread.sleep(1000)
	}

	@And("I click on SaveClose button to save billing information")
	public void I_click_On_BillingInformation_SaveCloseBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_SaveCloseBTN'))

		Thread.sleep(1000)
	}

	@And("I enter (.*) as billing information procedure")
	public void I_enter_BillingInformation(String BillingInformation) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Input'),BillingInformation)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Input'), Keys.chord(Keys.ENTER))

	}



	@And("I click on billing information OK button")
	public void I_click_On_BillingInfoBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_OK_BTN'))

		Thread.sleep(1000)
	}

	@Then("I should see Billing Information data in soap note popup")
	public void I_should_see_BillingInformation_Table() {

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Hover'), 30)


		String Actual_EnteredValue = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/BillingInformation_DataVerification/Obj_Entered_BillingInfomation'))

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/BillingInformation_DataVerification/Obj_Entered_BillingInfomation'), Actual_EnteredValue, FailureHandling.STOP_ON_FAILURE)

	}

	@Then("I should see (.*) in Billing Information1")
	public void I_should_see_BillingInformation_Table1(Code1) {

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Hover'), 30)


		String Actual_Billing1 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/BillingInformation_DataVerification/Obj_Entered_BillingInfomation'))

		if(!Actual_Billing1.contains(Code1)){

			WebUI.verifyMatch(Actual_Billing1, Code1, false)

		}

	}

	@Then("I should see (.*) in Billing Information2")
	public void I_should_see_BillingInformation_2(Code2) {

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/Obj_BillingInformation_Hover'), 30)


		String Actual_Billing2 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Add_BillingInformation/BillingInformation_DataVerification/Obj_Entered_BillingInfomation'))

		if(!Actual_Billing2.contains(Code2)) {

			WebUI.verifyMatch(Actual_Billing2, Code2, false)

		}

	}

	@Then("I should see (.*) in Diagnosis section")
	public void I_should_see_Diagnosis(DiagnosisCode) {

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_DiagnosisSection'), 30)


		String Actual_Diagnosis = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_Diagnosis_Validation'))

		if(!Actual_Diagnosis.contains(DiagnosisCode)) {

			WebUI.verifyMatch(Actual_Diagnosis, DiagnosisCode, false)

		}

	}

	@When("I click on Sign button to sign soapnotes")
	public void I_click_On_SignBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SignBTN_SOAPNote'))

		Thread.sleep(1000)
	}


	@When("I click on Create Signature button")
	public void I_click_On_SignatureCreateBtn() {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SignatureCreateBtn'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SignatureCreateBtn'))


		Thread.sleep(1000)
	}


	@When("I set signature")
	public void I_set_SIgnature() {


		WebUI.dragAndDropByOffset(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SignatureCreate_Input'), 25, 40)

		Thread.sleep(1000)
	}


	@When("I click on submit signature button")
	public void I_Click_On_SignatureButton() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SubmitSignature_BTN'))

		Thread.sleep(2000)
	}

	@When("I select Rendering Provider")
	public void I_select_RenderingProvider() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_RenderingProvider_Click'), 15)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_RenderingProvider_Click'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/patient_Info/Obj_RenderingProvider_Select'))


		Thread.sleep(1000)
	}


	@Then("I should see sign saved message")
	public void I_should_see_SignSuccessMessage() {


		String Actual_SignMessage = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_SignBtnSuccess_Message'))

		WebUI.verifyEqual(Actual_SignMessage, "successSOAP Note SignedHide")

	}

	@Then("I should see signature sign")
	public void I_should_see_SignatureImage() {


		Thread.sleep(3000)

		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Verify_Signature'), 5)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_Verify_Signature'), 5)


	}


	@When("I click on Addendum button")
	public void I_click_On_AddendumBTN() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_AddendumBTNClick'))
		Thread.sleep(1000)
	}


	@And("I enter (.*) as addendumNotes")
	public void I_enter_addendumNotes(String AddendumNotes) {


		WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_Addendum_Notes'),AddendumNotes)

	}
	@When("I click on addendum save button to save addendum")
	public void I_click_On_AddendumSaveBTN() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_AddendumSaveBTN'))
		Thread.sleep(1000)
	}

	@Then("I should see (.*) as addendum in addendumsection")
	public void I_should_see_addendumsection(String AddendumNotes) {


		String Actual_AddendumText = WebUI.getText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_addendum_validation'))

		WebUI.verifyEqual(Actual_AddendumText, AddendumNotes)

	}

	@Then("I should see signed status icon on appointment ui page")
	public void I_should_see_SignedStatusinUI() {




	}

	@Given("I open Patient using (.*) on superbill screen")
	void open_Care_Coordination(String MRN) {
		String xpath='//span[@data-mrn="'+MRN+'"]//preceding::td[@class="patient-name-cell"]//span//span'


		Thread.sleep(2000)
		'click on arrow'
		WebUI.waitForElementPresent(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_MRNArrowClick'), 0)
		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_MRNArrowClick'))

		'move to the filter label'
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterlabel'))

		'Input the patient name'
		Thread.sleep(2000)
		WebUI.clearText(findTestObject('Object Repository/OR_OpenPatient/inputPatient'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_OpenPatient/inputPatient'),MRN)

		'Click on filter button'
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterbutton'))


		Thread.sleep(2000)
	}

	@Then("I should see (.*) on superbill grid")
	public void I_should_see_MRNsuperbillGrid(String MRN) {


		String Actual_SignMessage = WebUI.getText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_verifyMRN'))

		WebUI.verifyEqual(Actual_SignMessage, "EntMerging505")

		Thread.sleep(6000)

	}

	@When("I click on referral status three lines")
	public void I_click_On_referralStatus() {

		Thread.sleep(6000)

		//WebUI.click(findTestObject('Object Repository/aaaaaaaaaaaaaaaaaaaaaaaaaa/Page_Welcome to Persivia/img_Yes_patientAlert show-mrn'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_Referral_ClickThreeLines'))
		Thread.sleep(1000)
	}
	@Then("I should see case management popup")
	public void I_should_see_caseManagementPopup() {


		String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_Referral_CaseManagementPopup'))

		WebUI.verifyEqual(Actual_Text, "CASE MANAGEMENT")

	}
	@Then("I should see case management popup data is showing")
	public void I_should_see_caseManagementPopupData() {


		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_Referral_CaseManagementPopup_Data'))

		WebUI.verifyEqual(Actual_Status, "Non-Urgent")

	}

	@When("I click on Done button")
	public void I_click_On_DoneBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_Referral_ClickDoneBTN'))
		Thread.sleep(1000)
	}


	@When("I click on patient tab")
	public void I_click_On_patientTab() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_PatientTabClick'))
		Thread.sleep(1000)
	}
	@Then("I should see signed status on encounter grid")
	public void I_should_see_SignedStatusOnEncounterGrid() {


		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_EncounterGrid_ValidationSignedStatus'))

		WebUI.verifyEqual(Actual_Status, "Signed")

	}

	@When("I click on view soap note")
	public void I_click_On_ViewSoapNoteLink() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_span_ViewSOAPNote'))
		Thread.sleep(1000)
	}

	@When("I click on Unsign button")
	public void I_click_On_UnSignBTN() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_button_Un-Sign'))
		Thread.sleep(1000)
	}

	@When("I click on yes button to unsign")
	public void I_click_On_yesbtntounsign() {


		WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_button_Yes_unsign'))
		Thread.sleep(3000)
	}

	@When("I should see unsigned message")
	public void I_should_see_UnsignedMessage() {


		String Actual_SignMessage = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_UnsignedMessage'))

		WebUI.verifyEqual(Actual_SignMessage, "SuccessSOAP note unsigned successfullyHide")
	}
	@When("I click on print soap note button")
	public void I_click_On_PrintSoapNote() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/HRA New Cases/Obj_PrintBTN'))
		Thread.sleep(1000)
	}

	@Then("I should see success message (.*) of non billable")
	public void Close_and_Verify_nonbillablemessage(String SucessMessage) {


		String actual_Message  = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_SuccessMessage'))

		WebUI.verifyEqual(actual_Message, SucessMessage)
	}
	@Then("I should see success message (.*) of reverted")
	public void Close_and_Verify_Revertedemessage(String RevertedSucessMessage) {


		String actual_Message  = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_RevertSuccessMessage'))

		WebUI.verifyEqual(actual_Message, RevertedSucessMessage)
	}


	@And("I select (.*) as Billing status from leftFilters")
	public void I_SelectBillingStatusFromLeftFilters(String Billing_Status) {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFilterClick'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFilterClick'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFiltersInput'), Billing_Status)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFiltersSelect'))


		//		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))

		Thread.sleep(5000)
	}

	@And("I select (.*) as Billing status from leftFilterss")
	public void I_SelectBillingStatusFromLeftFilterss(String Billing_Status2) {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFilterClick'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFilterClick'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFiltersInput'), Billing_Status2)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_NonBillable_LeftFiltersSelect'))


		//		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))

		Thread.sleep(5000)
	}

	@And("I should see (.*) NonBillable as billing status")
	public void I_should_see_NonBillable_as_billing_status(String Billing_Status) {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillableValidationStatus'))

		WebUI.verifyEqual(actual_Status, Billing_Status)
	}

	@Then("I should see Non_Billable button is visible on superbill screen")
	public void Close_and_see_NonBillableBTN() {

		WebUI.verifyElementVisible(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillableBTN'))

		Thread.sleep(1000)
	}

	@Then("I click on Non billable superbill button")
	public void ClickNonBillableBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillableBTN'))


	}

	@Then("I click on yes non billable button")
	public void ClickNonBillableYESBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillable_YESBTN'))


	}


	@Then("I should not see edit and complete buttons")
	public void ShouldNotSee_BTNs() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillable_YESBTN'), 3)
	}

	@Then("I click on revert to incomplete button")
	public void ClickOnRevertBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_RevertToIncomplete'))


	}

	@Then("I should see Non billable status in grid")
	public void ShouldNotSee_BillableStatus() {

		String actual_billableStatus = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/NewSubperBill_Objects/Obj_SuperBill_NonBillableValidationStatus'))
		WebUI.verifyEqual(actual_billableStatus, "Non-Billable")
	}

	@Then("I click on add Allergies plus button")
	public void ClickOnallergyPlusBTN() {

		Thread.sleep(12000)


		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Hover'), 30)

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Hover'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Plus'))

		Thread.sleep(1000)

	}

	@Then("I enter (.*) as allergyCode")
	public void i_enter_allergyCode(String Allergy) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Input'),Allergy)

		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Input'), Keys.chord(Keys.ENTER))

	}
	@Then("I enter (.*) as allergy_StartDate")
	public void i_enter_allergystartdate(String Allergy_Start_Date) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_tartDate'),Allergy_Start_Date)

	}

	@Then("I enter (.*) as allergy_EndDate")
	public void i_enter_allergyEndDate(String Allergy_End_Date) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_EndDate'),Allergy_End_Date)


	}

	@Then("I should see (.*) and (.*) and (.*) as allergy data in soap note grid")
	public void ShouldNotSee_AllergyData(String Allergy, String Allergy_Start_Date, String Allergy_End_Date) {


		'Allergy'


		String Actual_Allergy = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Allergies_DataVerification/Obj_Entered_Allergies'))

		if(!Actual_Allergy.contains(Allergy)){

			WebUI.verifyMatch(Actual_Allergy, Allergy, false)

		}


		'Verify Start Date'
		String date = Allergy_Start_Date.substring(0, 8)

		String actual_StartDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Allergies_DataVerification/Obj_Entered_Allergies_StartDate'))

		String date1 = Allergy_Start_Date.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)


		'Verify End Date'
		String dateE = Allergy_End_Date.substring(0, 8)

		String actual_EndDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Allergies_DataVerification/Obj_Entered_Allergies_EndDate'))

		String date3 = Allergy_End_Date.substring(0, 8)

		WebUI.verifyMatch(dateE, date3, false)


		Thread.sleep(2000)


	}

	@Then("I click on delete button to delete allergy")
	public void ClickdeleteBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_DeleteBTN'))


	}

	@Then("I click on Yes button to delete")
	public void ClickYesBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_YesBTN'))


	}

	@Then("I should see delete message")
	public void ShouldSeeDeleteAllergyMessage() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_EndDate'))


	}

	@Then("I click on select existing allergies button")
	public void SelectExistingAllergy() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_HoverExisting'))


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_SelectBTN'))


	}

	@Then("I select the existing allergy checkbox")
	public void SelectAllergyCheckbox() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_Checkbox'))


	}

	@Then("I click on procced button")
	public void ClickOnAllergyProceedBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_Allergies_ProccedBTN'))


		Thread.sleep(3000)
	}

	@Then("I should see exiting success message")
	public void ShouldSeeExistingAllergyMessage() {

		String Actual_Message = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Allergies_DataVerification/Obj_AllergiesSuccessMessage'))
		WebUI.verifyEqual(Actual_Message, "successSaved successfully.Hide")


	}

	@And("I select Source as:(.*)")
	public void i_select_Source(String Source) {

		//		Thread.sleep(3000)
		//
		//		'I click on Souece field'
		//		WebUI.click(SourceObj)
		//		Thread.sleep(2000)
		//
		//		WebUI.click(SourceObj)
		//
		//		'I select value from the dropdown'
		//		Thread.sleep(2000);
		//		String xpath='(//div[@class="k-list-container k-popup k-group k-reset"])[33]//div[2]//ul//li[text()="'+Source+'"]'
		//
		//		obj.selectdropdown(frame,xpath)
	}

	@Then("I enter (.*) as encountercode")
	public void i_enter_encounter(String Encounter) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_EncounterInput'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_EncounterInput'),Encounter)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_EncounterInput'), Keys.chord(Keys.ENTER))


	}
	@Then("I verified billable checkbox as checked")
	public void i_VerifiedBillableCheckbox() {

		if(WebUI.verifyElementChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_BillableCheckbox_Checked'), 3)) {

			WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Allergies/Obj_BillableCheckbox_Checked'))
		}else {
			println("Sorry")
		}

	}

}