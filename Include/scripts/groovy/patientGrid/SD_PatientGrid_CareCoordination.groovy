package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import internal.GlobalVariable


public class SD_PatientGrid_CareCoordination {



	@Given("I navigate to patient grid Care Coordination")
	public void I_navigate_to_patient_grid_CareCoordination() {





		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'), 10)
		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_Enterprise'))

		if(GlobalVariable.Enterprise=='US Medical Management ACO') {

			WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectUSMedical'))
		}


		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
		WebUI.getUrl()

		String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.verifyEqual(ActualText, 'CMR')


		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))


		WebUI.click(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_SelectPatients_ForCareCoordinationOnly'))

		//		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		Thread.sleep(14000)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)




		WebUI.enableSmartWait()
		Thread.sleep(4000)

	}
}
