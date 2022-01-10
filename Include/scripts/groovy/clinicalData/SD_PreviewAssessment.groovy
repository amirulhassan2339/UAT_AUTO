package clinicalData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.java.swing.plaf.motif.MotifInternalFrameTitlePane.Title
import com.sun.org.apache.xalan.internal.xsltc.compiler.Comment

import cucumber.api.java.en.Then
import cucumber.api.java.en.When





public class SD_PreviewAssessment {




	@When("I click on assessment name to preview assessment detail")
	public void I_select_multiple_assessment_checkboxes() {

		'Check assessment from Grid'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/PreviewAssessment/Obj_ClickAssessmentNameToPreview'))

	}
	
	
	@Then("I should see assessment data (.*) in preview window as title")
	public void I_should_see_assessment_previewTitle(String Title) {


		String Actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/PreviewAssessment/Obj_AssessmentNameInPreviewWindow'))
		Thread.sleep(1000)
		
		WebUI.verifyEqual(Actual_Title, Title)
		
	}
	
	@Then("I should see assessment data (.*) in preview window as comment")
	public void I_should_see_assessment_previewComment(String Comment) {


		
		String Actual_Comment = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Clinical_Data/AllAssessment_Cases/PreviewAssessment/Obj_PreviewComment'))
		Thread.sleep(2000)
		
		WebUI.verifyEqual(Actual_Comment, Comment)

		
	}
}
