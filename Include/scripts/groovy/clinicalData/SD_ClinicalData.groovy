package clinicalData

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.Then
import internal.GlobalVariable

public class SD_ClinicalData {




	@Then("I should see all clinical data (.*) and (.*) and (.*) with (.*) in care plan")
	public void I_should_see_clinicalData(String Code_Name,String Name,String Allergy,String Start_Date) {



		String Expected_ProblemCode = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/Obj_ProblemCode'))


		if(!Expected_ProblemCode.contains(Code_Name)) {

			WebUI.verifyMatch(Code_Name, Expected_ProblemCode, true)
		}

		String Expected_MedicationName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/Obj_MedicationName'))


		if(!Expected_MedicationName.contains(Name)) {

			WebUI.verifyMatch(Name, Expected_MedicationName, true)
		}

		String Expected_Allergy = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/Obj_AllergiesName'))


		if(!Expected_Allergy.contains(Allergy)) {

			WebUI.verifyMatch(Allergy, Expected_Allergy, true)
		}


		'Verify Date'
		String date = Start_Date.substring(0, 8)

		String actual_DueDate = Start_Date

		String date1 = Start_Date.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)
	}
}
