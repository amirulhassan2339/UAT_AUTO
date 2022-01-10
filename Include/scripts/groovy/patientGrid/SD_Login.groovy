package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.After
import cucumber.api.java.Before
import internal.GlobalVariable

class SD_Login {

	WebDriver driver;


	@Before()
	public void Browser() {





		//		System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath());
		//
		//		ChromeOptions options = new ChromeOptions();
		//
		//		options.addArguments("--headless")
		//		options.addArguments("--disable-gpu");
		//		options.addArguments("--window-size=1920,1200");
		//		options.addArguments("--ignore-certificate-errors");
		//		options.addArguments("--disable-extensions");
		//		options.addArguments("--no-sandbox");
		//		options.addArguments("--disable-dev-shm-usage")
		//
		//		driver=new ChromeDriver(options);


		//		ChromeOptions options = new ChromeOptions();
		//		options.addArguments("--headless");
		//		options.addArguments("--disable-gpu");
		//		options.addArguments("--window-size=1920,1200");
		//		options.addArguments("--ignore-certificate-errors");
		//		options.addArguments("--disable-extensions");
		//		options.addArguments("--no-sandbox");
		//		options.addArguments("--disable-dev-shm-usage");
		//		DesiredCapabilities capabilities = new DesiredCapabilities();
		//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		//		options.merge(capabilities);

		//driver = new ChromeDriver(options);



		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		GlobalVariable.url
		GlobalVariable.username
		GlobalVariable.password


		PerformLogin(GlobalVariable.url, GlobalVariable.username, GlobalVariable.password )
	}

	@After()
	public void Logout() throws Throwable {


		Thread.sleep(5000)




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