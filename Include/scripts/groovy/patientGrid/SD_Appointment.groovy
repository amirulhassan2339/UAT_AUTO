package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then


public class SD_Appointment {

	@And("I click on appointment tab")
	public void click_On_appointment_Tab() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentTab'), 20)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentTab'))


		Thread.sleep(6000)
	}

	@And("I click on add button to appointment adding")

	public void click_On_Add_appointment_Button() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_button_AddNew_Appointment'), 20)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_button_AddNew_Appointment'))
	}

	@Then("I should see add appointment title")
	public void Verify_Appointment_Title() {


		String actual_Message  = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_VerifyTitle'))

		WebUI.verifyEqual(actual_Message, "Add Appointment")
	}


	@And("I enter appointment (.*) as reason")
	public void I_enter_reason_as_appointmentReason(String Reason) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentReason_Click'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentReason'), Reason)

		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentReason'), Keys.chord(Keys.ENTER))

		Thread.sleep(2000)
	}

	@And("I enter appointment (.*) as time")
	public void I_enter_as_appointmentTime(String Time) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentTime'), Time)

		Thread.sleep(2000)
	}

	@And("I enter appointment (.*) as timess")
	public void I_enter_as_appointmentTimess(String Time) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentTime'), Time)

		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentCacle'))

		Thread.sleep(3000)
	}

	@And("I select appointment status")

	public void I_Select_Status() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Click'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Select'))
	}

	@And("I select the appointment status")

	public void I_Select_theStatus() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Click'))

		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Select'))
		//
		//
		//			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Click'))
		//
		//			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Select'))
		//			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentStatus_Select'))

	}

	@And("I enter appointment (.*) as appointmentcomment")
	public void I_enter__as_appointmentComment(String Comment) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentComment'), Comment)
	}

	@And("I enter appointmentComment (.*) as appointmentcomment")
	public void I_enteras_appointmentComment(String AppointmentComment) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentComment'), AppointmentComment)
	}

	@And("I click on save button to save appointment")

	public void I_ClickOnSaveBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Appointment/Obj_AppointmentSave'))

		Thread.sleep(3000)
	}


	@Then("I should see appoitment success message (.*) of appointment")
	public void AppointmentSuccessMessage(String SucessMessage) {

		String actual_Message  = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_recordSaveSuccessfully'))

		WebUI.verifyEqual(actual_Message, SucessMessage)
	}


	@Then("I should see appoitment_success (.*) of appointmentSuccess")
	public void AppointmentMessage(String AppointmentSucessMessage) {

		String actual_Message  = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_recordSaveSuccessfully'))

		WebUI.verifyEqual(actual_Message, AppointmentSucessMessage)
	}
}
