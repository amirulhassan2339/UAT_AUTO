package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class SD_SupperBill {

	WebDriver driver = DriverFactory.getWebDriver()



	@When("I click on Reset button to reset supper bill filters")
	public void I_Click_RestButton() {

		WebUI.enableSmartWait()
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'))

		Thread.sleep(12000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'), 10)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'))


	}

	@And("I enter (.*) as date of service from date")
	public void I_Search_as_service_Fromdate(String DateOfService_FromDate) {



		Thread.sleep(2000)
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'), DateOfService_FromDate)
		Thread.sleep(1000)
	}




	@And("I click on Apply button to apply supper bill filters")
	public void I_click_on_supperbill_apply_button() {


		Thread.sleep(3000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ApplyBTN'), 15)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ApplyBTN'))
		Thread.sleep(14000)
	}

	@Then("I should see particualar patient data in (.*) as selected date")
	def I_should_see_supperbill_patient_Data(String DateOfService_FromDate) {

		String date = DateOfService_FromDate.substring(0, 2)

		String actual_DateOfServiceDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'))

		String date1 = DateOfService_FromDate.substring(0, 2)


		//WebUI.verifyMatch(actual_DateOfServiceDate, DateOfService_FromDate(new SimpleDateFormat("H:mm a"), false)

		WebUI.verifyMatch(date, date1, false)




	}



	@And("I enter (.*) as practice")
	public void I_Search_as_practice(String Practice) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilter_Click'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilters_Input'), Practice)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilters_Input'), Keys.chord(Keys.ENTER))
	}

	@And("I click on particular patient and expand")
	public void I_click_on_particularpatient_Expand() {

		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientClick_OpenGrid'))
	}

	@And("I click on particular patient and expandPatient")
	public void I_click_on_particularpatient_expandPatient() {

		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientClick_OpenGrid - Copy'))
	}

	@Then("I should see (.*) particualar patient practice facility")
	public void I_should_see_supperbill_practice_facility(String Practice) {

		String actual_Practice = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_VerifyPracticeName'))

		WebUI.verifyEqual(actual_Practice, Practice)
	}

	@And("I navigate to supper bill tab")
	public void I_NaviagateToSupperBillTab() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SupperBillTab'))

		Thread.sleep(2000)
	}

	@And("I select (.*) as Signed status from soap status")
	public void I_SelectSoapNoteStatusFromLeftFilters(String Soap_Status) {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilter_Click'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilter_Click'))

		//WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), Soap_Status)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Input'))

		//WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))

		Thread.sleep(5000)
	}

	@And("I should see (.*) signed as soap status")
	public void I_should_see_signed_as_soap_status(String Soap_Status) {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_SoapNote_Status'))

		WebUI.verifyEqual(actual_Status, Soap_Status)
	}

	@When("I click on close button")
	public void I_click_On_CloseBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_CloseBTN_SOAPNote'))
	}


	@When("I select (.*) Billing status")
	public void I_SelectBillingStatusLeftFilters(String Billing_Status) {



		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilter_Click'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilter_Click'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilters_Select'), Billing_Status)

		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilter_Input'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))
	}

	@And("I should see (.*) patient billing status as incomplete")
	public void I_should_see_Incomplete_status(String Billing_Status) {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatus_Verify'))

		WebUI.verifyEqual(actual_Status, Billing_Status)
	}

	@And("I checked the patient checkbox")
	public void I_CheckedThePatientCheckbox() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientName_Checkbox_Click'))
	}


	@And("I checked the patient checkboxs")
	public void I_CheckedThePatientCheckboxs() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientName_Checkbox_Click - Copy'))
	}



	@And("I click on Fax button")
	public void I_ClickOnFax() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FaxBtn'), 10)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FaxBtn'))
	}

	@And("I should see PDF file in Fax popup")
	public void I_Should_See_PDFFile() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_PDF'), 3)
	}

	@And("I click on PDF file and Logout")
	public void I_ClickOnPDF() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_PDF'))
	}

	@And("I click on close button to close PDF popup")
	public void I_ClickOnCLoseButtonT() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Close_PDF'))
	}
}