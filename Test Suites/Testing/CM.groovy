import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

import org.seleniumhq.jetty9.util.security.Password

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

/**
 * Some methods below are samples for using SetUp/TearDown in a test suite.
 */

/**
 * Setup test suite environment.
 */
@SetUp(skipped = true) // Please change skipped to be false to activate this method.
def setUp() {
	
	WebUI.openBrowser('')
	WebUI.maximizeWindow()
	
	
			WebUI.navigateToUrl(GlobalVariable.url)
	
			WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), GlobalVariable.username)
	
			WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), GlobalVariable.password)
	
	
			WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))
	
	
	WebUI.waitForElementClickable(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'), 10)
	WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'))

	if(GlobalVariable.Enterprise=='MHPN') {

		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectMHPN'))
	}
	if(GlobalVariable.Enterprise=='Support Test Ent') {

		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectSupportTestEnt'))
	}
	
	
	
	Thread.sleep(3000)
	WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
	WebUI.getUrl()

	String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
	WebUI.verifyEqual(ActualText, 'CMR')


	WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))


	WebUI.click(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_Patients'))

	//		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

	Thread.sleep(3000)

	WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)

	
	


	WebUI.enableSmartWait()
	Thread.sleep(4000)
}

/**
 * Clean test suites environment.
 */
@TearDown(skipped = true) // Please change skipped to be false to activate this method.
def tearDown() {
	
	
		Thread.sleep(5000)
	
	
		WebUI.click(findTestObject('OR_LogoutPage/Obj_Logout'))
	
		WebUI.click(findTestObject('OR_LogoutPage/Obj_Sign Out'))
		WebUI.closeBrowser()
		

}

/**
 * Run before each test case starts.
 */
@SetupTestCase(skipped = true) // Please change skipped to be false to activate this method.
def setupTestCase() {
	
}

/**
 * Run after each test case ends.
 */
@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	
}

/**
 * References:
 * Groovy tutorial page: http://docs.groovy-lang.org/next/html/documentation/
 */