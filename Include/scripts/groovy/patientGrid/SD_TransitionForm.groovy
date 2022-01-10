package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import org.testng.annotations.BeforeTest

import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import internal.GlobalVariable
import utility_Functions.UtilityFunctions

class SD_TransitionForm {

	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	UtilityFunctions obj=new UtilityFunctions();


	@And("I click on Transition Form")
	public void ClickOnTransitionForm() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_TransitionForm'))
	}

	@And("I should see transition form title")
	public void I_should_see_transitionTitle() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_TransitionFormTitle'))

		WebUI.verifyEqual(actual_Title, 'Transition Form')
	}

	@And("I enter (.*) as notificationDate")
	public void notificationDate(String NotificationDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_NotificationDate'), NotificationDate)
	}

	@And("I enter (.*) as discharge Date")
	public void dischargeDate(String DischargeDate) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_DischargeDate'), DischargeDate)
	}

	@And("I enter (.*) as transitionDate")
	public void transitionDate(String TransitionDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_TransitionDate'), TransitionDate)
	}

	@Then("I should see (.*) and (.*) and (.*) transition dates")
	public void VerifyTransitionDates(String NotificationDate, String DischargeDate, String TransitionDate) {


		'Verify NotificationDate'
		String date = NotificationDate.substring(0, 8)

		String date1 = NotificationDate.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)


		'Verify DischargeDate'
		String date2 = DischargeDate.substring(0, 8)

		String date3 = DischargeDate.substring(0, 8)

		WebUI.verifyMatch(date2, date3, false)


		'Verify TransitionDate'
		String date4 = TransitionDate.substring(0, 8)

		String date5 = TransitionDate.substring(0, 8)

		WebUI.verifyMatch(date4, date5, false)
	}

	@And("I click on edit button of forms")
	public void EditForm() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_EditBtn'))
	}

	@And("I click on delete button to delete form")
	public void DeleteForm() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/TransitionForm/Obj_DeleteBtn'))
	}
}