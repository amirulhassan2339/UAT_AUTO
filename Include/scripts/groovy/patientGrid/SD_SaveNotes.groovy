package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import utility_Functions.UtilityFunctions


public class SD_SaveNotes {

TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
TestObject PrivacyClick=findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Privacy')
TestObject PriorityClick=findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Priority')

UtilityFunctions obj=new UtilityFunctions();
	
	@Then("I click on notes tab")
	public void i_click_on_notes_tab() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/span_Notes'))

		Thread.sleep(8000)
	}

	@Then("I click on plus notes button")
	public void i_click_on_plus_notes_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Notes'), 10)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Notes'))
	}

	@Then("I should see notes popup")
	public void i_should_see_notes_popup() {
		String Actual_Title = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_AddNoteTitle'))

		WebUI.verifyEqual(Actual_Title, 'Add Note')
	}

	@When("I select privacy for save notes:(.*)")
	public void i_select_Private(String privacy) {


		'I click on privacy field'
		WebUI.click(PrivacyClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+privacy+'"]'
		obj.selectdropdown(frame,xpath)
		
		
		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/li_Private'))
	}

	@When("I select priority for save notes:(.*)")
	public void i_select_Medium(String priority) {

//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Priority'))
//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Priority'))
//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Priority'))

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/li_Medium'))
	
		'I click on priority field'
		WebUI.click(PriorityClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+priority+'"])[4]'
		obj.selectdropdown(frame,xpath)
		
		
		}

	@When("I select type")
	public void i_select_CCM() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Type'))
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_TypeSelect'))
		
	}

	@When("I (.*) notes")
	public void i_enter_notes(String Enter_Notes) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_textarea_Notes_noteText'),Enter_Notes)
	}


	@When("I click on save btn")
	public void i_click_on_save_btn() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Save'))
		Thread.sleep(5000)
	}

	@When("I should see record save success message")
	public void I_should_see_record_save_success_message() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_recordSaveSuccessfully'), 3)
	}


	@Then("I should see newly added note")
	public void i_should_see_newly_added() {
		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Date'), 3)

		String ActualName = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Name'))

		WebUI.verifyEqual(ActualName, "Amir, Hafiz")

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Priority'), 3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Privacy'), 3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Type'), 3)
	}

	@And("I verify that the record exists in the notes section having date:(.*),Note Type:(.*),username:(.*) and priority:(.*)")

	void verification(String date,String type,String username,String priority) {

		String datexpath='//td[@role="gridcell"]//span[@class="priority-container"]//span[text()="'+priority+'"]//following-sibling::span//span[text()="'+type+'"]//preceding::strong//span[@class="modified-date"]'
		TestObject frame=findTestObject('Object Repository/ProgramEnrollment/frameObject')
		obj.customVerify(frame,datexpath,date)

		String userxpath='//td[@role="gridcell"]//span[@class="priority-container"]//span[text()="'+priority+'"]//following-sibling::span//span[text()="'+type+'"]//preceding::strong//span[@class="modified-date"]//following-sibling::span[@class="provider"]'
		obj.customVerify(frame,userxpath,username)

		String typexpath='//td[@role="gridcell"]//descendant::span[text()="'+date+'"]//following-sibling::span[text()="'+username+'"]//ancestor::td//span[@class="priority-container"]//*[text()="'+type+'"]'
		obj.customVerify(frame,typexpath,type)
		String priorityxpath='//td[@role="gridcell"]//descendant::span[text()="'+date+'"]//following-sibling::span[text()="'+username+'"]//ancestor::td//span[@class="priority-container"]//span[text()="'+priority+'"]'
		obj.customVerify(frame,priorityxpath,priority)
	}
}


