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

class SD_SurgicalFollowUpCall {

	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	UtilityFunctions obj=new UtilityFunctions();


	@And("I click on surgical Follow Up Call")
	public void ClickOnsurgicalFollowUpCall() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Surgical Follow Up Calls/Obj_SurgicalFollowUpCall'))
	}

	@And("I should see transition of surgical Follow Up care form title")
	public void I_should_see_SurgicalFollowUpTitle() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Surgical Follow Up Calls/Obj_SurgicalFollowUpCall_Title'))

		WebUI.verifyEqual(actual_Title, 'Transition of Care - Surgical Follow up')
	}
}