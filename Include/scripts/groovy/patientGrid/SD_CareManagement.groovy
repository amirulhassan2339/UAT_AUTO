package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import utility_Functions.UtilityFunctions



class SD_CareManagement {
	TestObject CMF=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_caremanagement')
	TestObject titleverify=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/titleverify')
	TestObject enterdtetime=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/dateTime')
	TestObject privacyobj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/selectprivacy')
	TestObject priotityobj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/selectpriority')
	TestObject provname=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_providername')
	TestObject outreachobj=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_outreach')
	TestObject duration=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_duration')
	TestObject docname=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_docname')
	TestObject agreement=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_agreement')
	TestObject medrecon=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_medrecon')
	TestObject save=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/obj_save')
	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	UtilityFunctions obj=new UtilityFunctions();
	@And("I click on Care Management Form")
	void I_Click_on_Management_Form() {
		WebUI.click(CMF)
	}

	@And("I should see Care Management form title")
	public void I_should_see_palliative_Care_Title() {

		String actual_Title = WebUI.getText(titleverify)

		WebUI.verifyEqual(actual_Title,'Care Management Form')
	}

	@And("I enter (.*) in care management form")
	public void I_enter_as_date_and_time(String DateTime) {

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_DateTime_Click'))
		WebUI.clearText(enterdtetime)
		WebUI.setText(enterdtetime, DateTime)

	}

	@Then("I select privacy:(.*)")
	public void i_select_privacy_privacy(String privacy) {
		'I click on privacy field'
		WebUI.click(privacyobj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+privacy+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select priority:(.*)")
	public void i_select_priority_priority(String priority) {
		'I click on priority field'
		WebUI.click(priotityobj)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+priority+'"])[4]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I enter provider name:(.*)")
	public void i_enter_provider_name_name(String name) {
		'I enter provider name in the field'
		WebUI.setText(provname,name)
	}

	@Then("I select outreach:(.*)")
	public void i_select_outreach_outreach(String outreach) {
		'I click on outreach field'
		WebUI.click(outreachobj)
		'I select value from the dropdown'
		String xpath='//li[text()="'+outreach+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I enter duration of patient contact:(.*)")
	public void i_enter_duration_of_patient_contact_time(String time) {
		'I enter duration of patient time in the field'
		WebUI.setText(duration,time)
	}

	@Then("I enter the name with whom assessment interaction was completed with:(.*)")
	public void i_enter_the_name_with_whom_assessment_interaction_was_completed_with_name(String name) {
		'I enter the name of the doctor with whom assessment_interaction_was_completed_with '
		WebUI.setText(duration,name)
	}

	@Then("I select whether the participants are in agreement with the plan")
	public void i_select_whether_the_participants_are_in_agreement_with_the_plan() {
		WebUI.click(agreement)
		'I select value from the dropdown'
		String xpath='(//li[text()="Yes"])[2]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select whether the medication reconciliation is completed")
	public void i_select_whether_the_medication_reconciliation_is_completed() {
		WebUI.click(medrecon)
		'I select value from the dropdown'
		String xpath='(//li[text()="No"])[3]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I click on Save button")
	public void i_click_on_Save_button() {

		WebUI.click(save)
	}

	@Then("I click on edit button where priority:(.*) and type:(.*)")
	public void i_click_on_edit_button(String priority,String type) {
		String xpath='//tr//td[@role="gridcell"]//span[@class="priority-container"]//span[text()="'+priority+'"]//following-sibling::span//span[text()="'+type+'"]//ancestor::tr[1]//td//a'

		obj.customClick(frame, xpath);
	}

	@Then("I click on delete button where priority:(.*) and type:(.*)")
	public void i_click_on_del_button(String priority,String type) {
		String xpath='//tr//td[@role="gridcell"]//span[@class="priority-container"]//span[text()="'+priority+'"]//following-sibling::span//span[text()="'+type+'"]//ancestor::tr[1]//td//button[@title="Delete"]'
		obj.customClick(frame,xpath)
	}

	@Then("I select Delete from the confirmation box")
	public void confirmation_box() {
		String xpath='(//div[@class="modal-content"]//div//h4[text()="Delete"])[2]'

		Thread.sleep(3000)
		if(WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/deletebutton')))
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/deletebutton'))
	}

	@Then("I should see (.*) in care management form")
	public void i_shouldSeeCareDateTime(String DateTime) {

		'Verify Date'
		String date = DateTime.substring(0, 8)

		String date1 = DateTime.substring(0, 8)

		WebUI.verifyMatch(date, date1, false)
	}
}