package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SD_LeftFilters {

	@And("I click on reset button")
	public void click_On_Reset_Button() {


		Thread.sleep(4000)
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'), 20)

		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))
		Thread.sleep(2000)
	}

	@When("I enter facility (.*)")
	public void user_Enter_Facility(String Facility) {


		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_Facility'))


		WebUI.enableSmartWait()

		WebUI.setText(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_InputFacility'), Facility)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_InputFacility'), Keys.chord(Keys.ENTER))
	}

	@And("I select program")
	public void user_select_Program() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_Program'))

		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_SelectProgram'))
	}

	@And("I click on apply button")
	public void click_On_Apply_Button() {


		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'))
		Thread.sleep(4000)
	}


	@And("I select enrollment")
	public void user_select_Enrollment() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Enrollment/Obj_Enrollment'))

		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Enrollment/Obj_SelectEnrollment'))
	}



	@Then("I should see (.*) as Facility")
	public void Facility_and_Program_filters_should_be_updated(String Facility) {


		String Actual_Text = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_MHPN'))
		WebUI.verifyEqual(Actual_Text, Facility)
	}

	@Then("I should see (.*) as Program")
	public void I_Should_see_Programy(String Program) {


		String Actual_Program = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_VerifyProgram'))

		//		if(!Actual_Program.contains(Program)) {
		//
		//			KeywordUtil.markFailed("Your searched program does not have expected program.")
		//		}

		if(!Actual_Program.contains(Program)) {

			WebUI.verifyEqual(Actual_Program, Program);

		}

	}


	@Then("I should see (.*) as Enrollment")
	public void I_Should_see_Enrollment(String Enrollment) {


		String Actual_Enrollment = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_VerifyEnrollment'))

		//		if(!Actual_Program.contains(Program)) {
		//
		//			KeywordUtil.markFailed("Your searched program does not have expected program.")
		//		}

		if(!Actual_Enrollment.contains(Enrollment)) {

			WebUI.verifyEqual(Actual_Enrollment, Enrollment);

		}

	}

}