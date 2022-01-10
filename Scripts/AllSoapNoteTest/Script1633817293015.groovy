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

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/invalid')

WebUI.setText(findTestObject('null'), 'amir@slt.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'em0u++r5ZmAQM4xIcDgVLQ==')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Sign in'))

WebUI.selectOptionByValue(findTestObject('null'), 
    'mhpn', true)

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Schedule'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_verifyMRN'))

WebUI.doubleClick(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/td__1'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Cancel'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.doubleClick(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/td__1'))

WebUI.setText(findTestObject('null'), 
    'dermo')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Dermo505, Mac505MRN EntMerging505'))

WebUI.setText(findTestObject('null'), 
    'Dermo505, Mac505')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_button_Yes_unsign'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Proceed'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Select'))

WebUI.setText(findTestObject('null'), 
    'Non-Urgent')

WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReasonReferral'), 
    'Referral')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_ReasonReferral'), 
    'Referral Reason')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Select'))

WebUI.setText(findTestObject('null'), 
    '0.99')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Select'))

WebUI.setText(findTestObject('null'), 
    '0.89')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/a_Save'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Sign'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Selectselect'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Select'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Sign'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Create_1'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_addendum_validation'), 
    'addendum notes test')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Save'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Close'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_MRNArrowClick'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'EntMerging505')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Filter'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/img_Yes_patientAlert show-mrn'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/caption_CASE MANAGEMENT'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Done'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'dermo')

WebUI.sendKeys(findTestObject('null'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Encounter'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/span_Close'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_span_ViewSOAPNote'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_button_Un-Sign'))

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/Obj_button_Yes_unsign'))

WebUI.switchToWindowTitle('Welcome to Persivia!')

WebUI.click(findTestObject('AllSoapNoteTest/NewHRAFlows_Objects/button_Print'))

