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

public class SD_LOBandLOBType {




	@Then("I should see patient with LOB and LOBType")
	public void I_should_see_LOBandType() {


		String Actual_LOBGrid = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/LOB_LOBType/Obj_LOB_GRID'))

		String Expected_LOB_CP = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/LOB_LOBType/Obj_LOB_CP'))
		

		if(!Expected_LOB_CP.contains(Actual_LOBGrid)) {

			WebUI.verifyEqual(Actual_LOBGrid, Expected_LOB_CP)
			
			
			String Actual_LOBTypeGrid = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/LOB_LOBType/Obj_LOBType_GRID'))
			
					String Expected_LOBType_CP = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/LOB_LOBType/Obj_LOBType_CP'))
					
			
					if(!Expected_LOBType_CP.contains(Actual_LOBTypeGrid)) {
			
						WebUI.verifyEqual(Actual_LOBTypeGrid, Expected_LOBType_CP);
					}
		}

		
	}
}
