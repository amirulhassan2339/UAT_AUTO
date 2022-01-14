package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class SD_CareCordination_LeftFilters {


	WebDriver driver = null;

	@When("I click on care cordination")
	public void I_click_on_carecordination() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'), 20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'))
		Thread.sleep(12000)
	}


	@And("I click on care cordination reset button")
	public void click_On_Reset_Button() {

		WebUI.waitForElementVisible(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'), 5)
//		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'),20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))
		Thread.sleep(2000)
	}

	@And("I clear before and after dates")
	public void ClearDates() {

		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_ClearDates/Obj_ClearBeforeDate'))
		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_ClearDates/Obj_ClearAfterDate'))
	
		
		}

	@When("I enter (.*) as serving facility")
	public void user_Enter_ServingFacility(String ServingFacility) {
		
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Input'), ServingFacility)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Input'), Keys.chord(Keys.ENTER))
	}

	@When("I enter (.*) as serving facility type")
	public void user_Enter_ServingFacilityType(String Facility) {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Input'), Facility)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Input'), Keys.chord(Keys.ENTER))
	}
	
	@When("I enter (.*) as assign date from")
	public void user_Enter_AssignFromDate(String AssignDateFrom) {

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_AssignDates/Obj_FromDate'),AssignDateFrom )
	}
	@When("I enter (.*) as assign date to")
	public void user_Enter_AssignToDate(String AssignDateTo) {

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_AssignDates/Obj_ToDate'),AssignDateTo )

	}



	@And("I click on care cordination apply button")
	public void click_On_CareCordination_Apply_Button() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'))

		Thread.sleep(22000)
	}




	@Then("I should see care cordination serving facility (.*)")
	public void I_should_see_care_cordination_ServingFacility_filters(String ServingFacility) {

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacility_MHPN3'), 5)
		
		String Actual_ServingFacility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacility_MHPN3'))
		WebUI.verifyEqual(ServingFacility, Actual_ServingFacility)
	}


	@Then("I should see (.*) care cordination Enc program")
	public void I_should_see_care_cordination_patientprogram_filters(String EncProgram) {


		String Actual_PatientProgram = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_Program_TCM'))
		WebUI.verifyEqual(Actual_PatientProgram, EncProgram)
	}


	@Then("I should see (.*) as care cordination LOB")
	public void I_should_see_care_cordination_LOB_filters(String LOB) {


		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_LOB'), 5)
		
		Thread.sleep(2000)
		String Actual_LOB = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_LOB'))

		if(!Actual_LOB.is(LOB)) {

			WebUI.verifyEqual(LOB, Actual_LOB)
		}else {

			throw new NoSuchElementException("Can't find " + LOB + " in Grid");
		}
	}


	@Then("I should see care cordination (.*) as serving facility type")
	public void I_should_see_care_cordination_ServingFacilityType_filters(String Facility) {

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacilityType_HOS'), 5)
		
		String Actual_ServingFacilityType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacilityType_HOS'))

		WebUI.verifyEqual(Actual_ServingFacilityType, Facility)
	}

	@Then("I should see (.*) care cordination Notifications")
	public void I_should_see_care_cordination_Notifications_filters(String NotificationType) {

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_NotificationsType'), 5)
		String Actual_NotificatonType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_NotificationsType'))

		WebUI.verifyEqual(Actual_NotificatonType, NotificationType)
	}

	@Then("I should see care cordination Encounter (.*) filters")
	public void I_should_see_care_cordination_Encounter_filters(String EncounterType) {

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_EncounterType'), 5)
		
		String Actual_EncounterType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_EncounterType'))

		//WebUI.verifyElementText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_EncounterType'), Actual_EncounterType)

		WebUI.verifyEqual(EncounterType, Actual_EncounterType)

	}

	@And("I select (.*) patient program")
	public void Select_PatientProgram(String EncProgram) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'))

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'))

		//		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'), EncProgram)
		//
		//		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'), Keys.chord(Keys.ENTER))

		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_select'))


	}

	@And("I select (.*) as Notification Type")
	public void Select_Notification(String NotificationType) {


		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Click'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Click'))
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Select'))



		//		if(NotificationType== 'Presenting') {
		//
		//			Thread.sleep(2000)
		//			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Select'))
		//
		//		}
		//
		//		if(NotificationType== 'Admitting') {
		//
		//			Thread.sleep(2000)
		//			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Select2'))
		//
		//		}
		//
		//		if(NotificationType== 'Discharge') {
		//
		//			Thread.sleep(2000)
		//			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Select3'))
		//
		//		}
		//
		//		else {
		//
		//			throw new NoSuchElementException("Can't find " + NotificationType + " in dropdown");
		//		}
	}

	@And("I select (.*) as LOB")
	public void Select_LOB(String LOB) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterClick'), 10)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterClick'))

		if(LOB== LOB) {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterSelect'))
		}

		else {

			throw new NoSuchElementException("Can't find " + LOB + " in dropdown");
		}




		//		String xpath = '(//ul[@id="toc_filter_lob_listbox"]/li[text()= "'+LOB+'"])'
		//
		//		TestObject to = new TestObject(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterSelect'))
		//
		//		to.addProperty("xpath", ConditionType.EQUALS, xpath)
		//		WebUI.click(to)








		//		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOB_Click'))
		//		Thread.sleep(2000)
		//		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOB_select'))
	}

	@And("I enter (.*) as encounter type")
	public void Select_Encounter(String EncounterType) {

		Thread.sleep(8000)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Select'), EncounterType)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Select'), Keys.chord(Keys.ENTER))
	}
}

