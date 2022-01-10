package clinicalData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When






public class SD_UnCheckAssessment {




	@Then("I should see assessment checkbox is checked")
	public void I_should_see_assessment_Checkbox_Is_Checked() {
		
		WebUI.verifyElementChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentGrid_Checkbox1'), 2, FailureHandling.STOP_ON_FAILURE)

	}
	
	@And("I enter (.*) as assessmentcomment")
	public void I_enter_assessment_comment(String AssessmentComment) {
		
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/UnCheck_Assessments/Obj_AssessmentComment'), AssessmentComment)

	}
	
	@And("I enter title")
	public void user_Enter_Title() {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGridInput/Input'), 'CPTitle')
	}
	
	@And("I uncheck the checkbox now")
	public void I_uncheck_the_checkbox() {

		'Check assessment from Grid'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentGrid_Checkbox1'))

		//WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_AssessmentGrid_Checkbox2'))
	}
	
	@And("I should not see assessment data")
	public void I_should_not_see_assessment_data() {


		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/UnCheck_Assessments/Obj_AssessmentName_AssessmentSection_CP'), 2)
				
	}
	
	@When("I click on Cancel button")
	public void I_click_on_Cancel_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/UnCheck_Assessments/Obj_CancelBTN'))

		Thread.sleep(5000)

	}
	
	@And("I mouse hover on assessment for deletion")
	public void I_MouseHoverOnDelete() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/DeleteAssessment/Obj_AssessmentTitleHover'))

		Thread.sleep(1000)

	}
	
	@And("I click on assessment delete icon")
	public void I_ClickOnDeleteBTN() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/DeleteAssessment/Obj_AssessmentDeleteBTN'))

		Thread.sleep(2000)

	}
	
	
	

}
