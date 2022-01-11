package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import org.testng.annotations.BeforeTest

import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.After
import cucumber.api.java.Before
import internal.GlobalVariable

class SD_Login {

	WebDriver driver;


	@Before
	public void Browser() {


		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		GlobalVariable.url
		GlobalVariable.username
		GlobalVariable.password


		PerformLogin(GlobalVariable.url, GlobalVariable.username, GlobalVariable.password )
	}


	@After()

	public void Logout() throws Throwable {


		Thread.sleep(7000)




		WebUI.click(findTestObject('OR_LogoutPage/Obj_Logout'))

		WebUI.click(findTestObject('OR_LogoutPage/Obj_Sign Out'))

		WebUI.closeBrowser()
	}


	public void PerformLogin(String URL, String Email, String Password) {


		WebUI.navigateToUrl(URL)

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), Email)

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), Password)


		WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))


		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)
	}
}