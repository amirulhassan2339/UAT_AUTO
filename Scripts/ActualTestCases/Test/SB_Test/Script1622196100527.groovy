import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.maximizeWindow()

 


WebUI.navigateToUrl("https://carespace.persivia.net/PersiviaPortal/newLogin")

WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), "Hafiz.amir@sltn.net")

WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), "Hafizamir1234")
WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))
WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)



WebUI.waitForElementClickable(findTestObject('OR_HomePage/Obj_QAmhpn'), 2)

		'Select Support Test Ent Enterprise'
		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectSupportTestEnt'))


		//		WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))
		//		WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))


		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
		WebUI.getUrl()

		String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.verifyEqual(ActualText, 'CMR')


		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))

		WebUI.enableSmartWait()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SupperBillMenu'))

		//		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		WebUI.enableSmartWait()
		
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'), 4)
		
		Thread.sleep(2000)
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'), "05102021")
		Thread.sleep(1000)
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ApplyBTN'))
		Thread.sleep(3000)
		
		
		String actual_DateOfServiceDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'))
		
			
			//WebUI.verifyMatch(actual_DateOfServiceDate, DateOfService_FromDate(new SimpleDateFormat("H:mm a"), false)
				
				WebUI.verifyEqual(actual_DateOfServiceDate, "05102021")
				
				
				