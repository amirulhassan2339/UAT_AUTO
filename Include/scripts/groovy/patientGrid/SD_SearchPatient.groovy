package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import utility_Functions.UtilityFunctions



class SD_SearchPatient {

	UtilityFunctions obj=new UtilityFunctions();
	TestObject frame=findTestObject('Object Repository/OR_OpenPatient/frame')


	@When("I search (.*) using global search")
	public void search_Patient(String Patient) {

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))



		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 20)

		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Patient)

		Thread.sleep(4000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Keys.chord(Keys.ENTER))


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'), 10)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))
		Thread.sleep(14000)
	}


	@When("I search this patient (.*) as second patient")
	public void search_SecondPatient(String SecondPatient) {


		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

		WebUI.clearText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))


		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), SecondPatient)

		Thread.sleep(4000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Keys.chord(Keys.ENTER))

		Thread.sleep(14000)
	}




	@Then("I should see (.*) as patient with (.*) as MRN and (.*) as DOB and (.*) as Status on patient grid")
	public void Patient_should_be_verified(String Patient_Name, String MRN, String DOB, String Patient_Status) {

		String Actual_FirstLastName = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
		WebUI.verifyEqual(Actual_FirstLastName, Patient_Name)



		//		String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
		//		WebUI.verifyEqual(Actual_MRN, MRN)
		//
		//
		//		String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
		//		WebUI.verifyEqual(Actual_DOB, DOB)
		//
		//		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'))
		//		WebUI.verifyEqual(Actual_Status, Patient_Status)
	}


	@Then("I should see (.*) as patient Name")
	public void PatientName_should_be_verified(String Patient_Name) {

		String Actual_FirstLastName = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
		WebUI.verifyEqual(Actual_FirstLastName, Patient_Name)



		//		String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
		//		WebUI.verifyEqual(Actual_MRN, MRN)
		//
		//
		//		String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
		//		WebUI.verifyEqual(Actual_DOB, DOB)
		//
		//		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'))
		//		WebUI.verifyEqual(Actual_Status, Patient_Status)
	}


	@Given("I search (.*) using global search and verify dob:(.*),mrn:(.*) and facility:(.*)")
	public void search_Patient_plus_verify(String Patient,String dob,String mrn,String facility) {

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))


		Thread.sleep(30000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Patient)

		Thread.sleep(10000)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/VerifySearchedPatient/name'),Patient)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/VerifySearchedPatient/dob'),dob)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/VerifySearchedPatient/mrn'),mrn)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/VerifySearchedPatient/facility'),facility)

		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))



		Thread.sleep(4000)
	}

	@Given("I open (.*) from the patient grid")
	public void open_patient(String Patient) {
		String xpath='//td[@role="gridcell"]//*[text()="'+Patient+'"]'

		'click on reset button'
		Thread.sleep(10000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))
		Thread.sleep(2000)
		'click on arrow'
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_OpenPatient/clickArrow'), 0)
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/clickArrow'))

		'move to the filter label'
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterlabel'))

		'Input the patient name'
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_OpenPatient/inputPatient'),Patient)

		'Click on filter button'
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterbutton'))

		'Click on patient name'
		Thread.sleep(5000)
		obj.customClick(frame,xpath)

		Thread.sleep(2000)
	}

	@Given("I open Patient using (.*) on care coordination screen")
	void open_Care_Coordination(String MRN) {
		String xpath='//span[@data-mrn="'+MRN+'"]//preceding::td[@class="patient-name-cell"]//span//span'
		'click on reset button'
		Thread.sleep(10000)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/cc_resetbtn'))
		Thread.sleep(2000)
		'click on arrow'
		WebUI.waitForElementPresent(findTestObject('Object Repository/CareCordination_LeftFilters/filterArrow'), 0)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/filterArrow'))

		'move to the filter label'
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterlabel'))

		'Input the patient name'
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_OpenPatient/inputPatient'),MRN)

		'Click on filter button'
		WebUI.click(findTestObject('Object Repository/OR_OpenPatient/filterbutton'))

		'Click on patient name'
		Thread.sleep(10000)
		obj.customClick(frame,xpath)

		Thread.sleep(2000)
	}
}

