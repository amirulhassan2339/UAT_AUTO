package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.aspectj.asm.internal.ProgramElement
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Methods

public class SD_CMStatus_CareCoordination {

	TestObject DOB=findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_DOB_Rearange')
	TestObject Program=findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_EncProgram_Rearange')
	
	
	
	WebDriver driver;

	@And("I select (.*) as cm status")

	public void selectStatus(String CM_Status) {

		Thread.sleep(5000)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Click'))

		if(CM_Status== "Eligible") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Eligible'))
		}

		if(CM_Status== "Active") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Active'))
		}


		if(CM_Status== "Completed") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_CmStatus_Completed'))
		}
	}


	@Then("I should see patients with CM Status as (.*) on care coordination grid")
	public void I_should_see_care_cordination_LOB_filters(String CM_Status) {


		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'),5)
		
		String Actual_CMStatus = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'))
		
		if(!Actual_CMStatus.is(CM_Status)) {

			WebUI.verifyEqual(CM_Status, Actual_CMStatus)
		}else {

			throw new NoSuchElementException("Can't find " + CM_Status + " in Grid");
		}
	}

	@And("I click on CM link")
	public void Click_CMStatus() {

		'Search Patient'

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), 20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), "JOHNSON,TROY V")

		Thread.sleep(4000)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), Keys.chord(Keys.ENTER))

		Thread.sleep(10000)

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_ClickCMStatusLink'),5)
		
		'Click On Hyper Link'
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_ClickCMStatusLink'))

		Thread.sleep(18000)
	}


	@And("I click on CM link again")
	public void Click_CMStatus_again() {


		'Click On Hyper Link'
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_ClickCMStatusLink'))

		Thread.sleep(4000)
	}



	@Then("I should see popup details")
	public void I_should_see_popup_details() {


		'Verify Title'
		String Actual_Title = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyAlertTitle'))

		WebUI.verifyEqual(Actual_Title, "Notification Details")


		'Verify Name'
		String Actual_Name = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_PatientName'))

		String Expected_Name = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_Name'))

		WebUI.verifyEqual(Actual_Name, Expected_Name)

		'Verify MRN'
		String Actual_MRN = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_MRN'))

		String Expected_MRN = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_MRN'))

		WebUI.verifyEqual(Actual_MRN, Expected_MRN)


		Thread.sleep(1000)
		
		'Verify Admitted Date'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_AdmittedDate'),5)
		
		
		String Actual_AdmitDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_AdmittedDate'))

		String Expected_AdmitDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_AdmittedDate'))


		if(Expected_AdmitDate.contains(Actual_AdmitDate)) {

			WebUI.verifyEqual(Actual_AdmitDate, Expected_AdmitDate);
		}


		Thread.sleep(1000)
		
		'Verify Dischare Date'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DischargeDate'),5)
		
		
		String Actual_DischargeDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DischargeDate'))

		String Expected_DischargeDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DischargeDate'))


		if(Expected_DischargeDate.contains(Actual_DischargeDate)) {

			WebUI.verifyEqual(Actual_DischargeDate, Expected_DischargeDate);
		}


//		'Verify Serving Facility'
//		String Actual_Facility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_ServingFacility'))
//
//		String Expected_Facility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_ServingFacility'))
//
//		WebUI.verifyEqual(Actual_Facility, Expected_Facility)


		'Verify Lace'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_Lace'),5)
		
		String Actual_Lace = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_Lace'))

		String Expected_Lace = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_Lace'))

		WebUI.verifyEqual(Actual_Lace, Expected_Lace)
	}

	@When("I enter due date (.*) as DT")
	public void user_Enter_DueDate(String Due_Date) {

		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'), Due_Date)
		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_DueDate'), Due_Date)

		Thread.sleep(2000)
	}

	@When("I select CM Status")
	public void Select_CMStatus() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_Click'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_SelectActive'))
	}

	@When("I select CM Status again")
	public void Select_CMStatusAgain() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_Click'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CMStatus_Updated_SelectEligible'))
	}

	@When("I enter care provider (.*) as CP")
	public void user_Enter_CareProvider(String CareProvider) {



		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), CareProvider)

		Thread.sleep(1000)
		
		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), Keys.chord(Keys.ENTER))

//		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), CareProvider)
//
//		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareProvider'), Keys.chord(Keys.ENTER))
	}

	@When("I enter care coordination (.*) as CC")
	public void user_Enter_CareCoordination(String CareCoordination) {


		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), CareCoordination)

		Thread.sleep(1000)
		
		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), Keys.chord(Keys.ENTER))

//		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), CareCoordination)
//
//		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_CareCoordination'), Keys.chord(Keys.ENTER))
	}

	@When("I click on save button to save notification details")
	public void ClickOnSaveBTNTO_() {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_SaveBTN'))

		Thread.sleep(3000)
	}

	@Then("I should see this message (.*) as Notification")
	public void I_should_see_notificationSuccessMessage(String SuccessMessage) {


		'Verify Notification Message'
		String Actual_Message = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_NotificationMessage'))

		WebUI.verifyEqual(Actual_Message, SuccessMessage)

		Thread.sleep(20000)
	}

	@Then("I should see patient details including (.*) AND (.*) AND (.*) AND CM_Status after updating data from popup")
	public void I_should_see_patientDataFromPopup(String CareCoordination, String CareProvider, String Due_Date) {


		'Verify Care Coordination'

		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareCoordination'),5)
		
		String Expected_CareCoordination = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareCoordination'))


		if(!Expected_CareCoordination.contains(CareCoordination)) {

			WebUI.verifyMatch(CareCoordination, Expected_CareCoordination, true)
		}


		'Verify Care Provider'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareProvider'),5)
		
		
		String Actual_CareProvider = CareProvider

		String Expected_CareProvider = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_CareProvider'))


		WebUI.verifyEqual(Actual_CareProvider, Expected_CareProvider);



		'Verify Due Date'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DueDate'),5)
		
		
		String date = Due_Date.substring(0, 8)

		String actual_DueDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Grid_Verification/Obj_DueDate'))

		String date1 = Due_Date.substring(0, 8)


		//WebUI.verifyMatch(actual_DateOfServiceDate, DateOfService_FromDate(new SimpleDateFormat("H:mm a"), false)

		WebUI.verifyMatch(date, date1, false)


		'Verify Status'
		
		WebUI.scrollToElement(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'),5)
		
		
		String Actual_CM_Status = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_VerifyCMStatus'))

		String Expected_CM_Status = "Active"

		WebUI.verifyEqual(Actual_CM_Status, Expected_CM_Status)

	}

	@When("I click on LOG icon button")
	public void Click_LogIconBTN() {

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LogIcon_Click'))
		Thread.sleep(6000)
	}

	@Then("I should see LOG Title")
	public void VerifyLOGTitle() {

		'Verify LOG Change Title'
		String Actual_Title = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOGTitle'))

		WebUI.verifyEqual(Actual_Title, "CM Status Change Log")
	}


	@Then("I should see updated LOGS with (.*) as updatedDate")
	public void I_should_see_updatedLogs(String Due_Date) {



		'Verify Updated BY'
		String Actual_UpdatedBY = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedBY'))

		String Expected_UpdatedBY = "Hafiz,Amir"

		WebUI.verifyEqual(Actual_UpdatedBY, Expected_UpdatedBY)



		'Verify Date'
		String date = Due_Date.substring(0, 8)

		String actual_DueDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedDate'))

		String date1 = Due_Date.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)

		WebUI.verifyElementPresent(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedStatus'), 3)



		'Verify Status'
		String Actual_CM_Status = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedStatus'))

		String Expected_CM_Status = "Active"



		WebUI.verifyEqual(Actual_CM_Status, Expected_CM_Status)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_Popup_Close'))
	}




	@Then("I should see LOGS including (.*) as Date")
	public void I_should_see_LOGS(String Due_Date) {


		'Verify Updated BY'
		String Actual_Updatedby = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedBY'))

		String Expected_UpdatedbY = "Hafiz,Amir"

		WebUI.verifyEqual(Actual_Updatedby, Expected_UpdatedbY)



		'Verify Date'
		String date = Due_Date.substring(0, 8)

		String actual_DueDate = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedDate'))

		String date1 = Due_Date.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)

		WebUI.verifyElementPresent(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedStatus'), 3)


		'Verify Status'
		String Actual_CM_Status = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_UpdatedStatus'))

		String Expected_CM_Status = "Eligible"

		WebUI.verifyEqual(Actual_CM_Status, Expected_CM_Status)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/Popup_Verification/Obj_LOG_Popup_Close'))
	}

	@When("I click on care cordination tab")
	public void I_click_on_carecordinationtab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'), 20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'))
		Thread.sleep(2000)

		'Search Patient'

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), 20)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'))

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), "JOHNSON,TROY V")

		Thread.sleep(4000)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Left Filters/Obj_inputSearchCareCooridnation'), Keys.chord(Keys.ENTER))

		Thread.sleep(10000)
	}

	@When("I swap DOB with Enc Program")
	public void I_swapDOBwithProgram() {

		
		WebUI.dragAndDropToObject(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_DOB_Rearange'), findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_EncProgram_Rearange'))
		Thread.sleep(10000)

	}
	
	@Then("I select (.*) as export")
	public void ClickExportOptions(String Export) {

		//Thread.sleep(5000)

		WebUI.waitForElementVisible(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_Export_BTNCLick'), 5)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_Export_BTNCLick'))

		if(Export== "Export (All Columns)") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_Export_AllColms'))
			Thread.sleep(5000)
		}

		if(Export== "Export (Selected Columns)") {

			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/CM Status/CM Grid/Obj_Export_SelectedColms'))
			Thread.sleep(5000)
		}
	}

	@Then("I verify that exported file downloaded successfully")
	public void VerifyExportedFileDownloaded() {

		Methods.verifyDownloadedfile("C:\\Users\\hafiz.amir\\Downloads", ".xls")
	}
}
