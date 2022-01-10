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

WebUI.setText(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/input_Welcome to_username'), 'amir@slt.com')

WebUI.setEncryptedText(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/input_Welcome to_userpwd'), 'em0u++r5ZmAQM4xIcDgVLQ==')

WebUI.sendKeys(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/input_Welcome to_userpwd'), Keys.chord(
        Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/select_Aprima Enterprise_1MHPNPrime Healthcare'), 
    'mhpn', true)

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_Schedule'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/i_Dermo505, Mac505 -Back painAmir, Hafiz_fa fa-ellipsis-h'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/a_Edit SOAP Note'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_HRA_k-icon k-add'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/a_Exam and Recommendations'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_Select'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_Yes'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_Select_1'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/span_Non-Urgent'))

WebUI.setText(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/input_Non-Urgent_panel46Columns13Text'), 
    'Test')

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/a_Save'))

WebUI.click(findTestObject('Object Repository/SoapTest/Page_Welcome to Persivia/button_'))

WebUI.closeBrowser()

