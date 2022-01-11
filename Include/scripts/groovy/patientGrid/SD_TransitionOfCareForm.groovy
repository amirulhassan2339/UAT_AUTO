package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import utility_Functions.UtilityFunctions



public class SD_TransitionOfCareForm {

	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	TestObject ContactMethodClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_ContactMethod_Click')
	TestObject DiscussWithClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DiscussedWith_CLick')
	TestObject AdditionalRecordsClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AdditionalRecord_Click')
	TestObject OutreachClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_OutreachDropdown_Click')
	TestObject FormTypeClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FormType_Click')
	
	TestObject InGeneralHowAreYouFeelingClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Surgical Follow Up Calls/Obj_InGeneralHowAreYouFeeling_Click')
	
	
	UtilityFunctions obj=new UtilityFunctions();

	

	@And("I click on Courtesy Call")
	public void I_click_on_Courtesy() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_CourtesyCall'))
	}



	@And("I should see transition of care form title")
	public void I_should_see_transition_Title() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_TransitionOfCareFormTitle'))

		WebUI.verifyEqual(actual_Title, 'Transition of Care - Courtesy Call')

	}

	@And("I enter (.*) as date of service date and time")
	public void i_enter_transition_AM_as_datetime(String DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DateOFService'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DateOFService'), DateTime)
	}



	@And("I enter (.*) as Provider Name and Contact")
	public void i_enter_ProviderNameANDContact(String ProviderName) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_ProviderName'), ProviderName)
	}

	@Then("I select contact method:(.*)")
	public void i_select_contactMethod(String ContactMethod) {
		'I click on privacy field'
		WebUI.click(ContactMethodClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+ContactMethod+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select discussed with:(.*)")
	public void i_select_DiscussWIth(String DiscussWith) {
		'I click on privacy field'
		WebUI.click(DiscussWithClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+DiscussWith+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select Additional records reviewed through:(.*)")
	public void i_select_AdditionalRecord(String AdditionalRecords) {
		'I click on privacy field'
		WebUI.click(AdditionalRecordsClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+AdditionalRecords+'"]'
		obj.selectdropdown(frame,xpath)
	}
	
	@Then("I select form type:(.*)")
	public void i_select_formType(String FormType) {
		'I click on Form Type field'
		WebUI.click(FormTypeClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+FormType+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@And("I click on analytics reset button")
	public void ClickAnalyticsReset() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_ResetBtn_Analytics'))
	}
	
	@And("I click on analytics apply button")
	public void ClickAnalyticsApply() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_ApplyBtn_Analytics'))
	}

	@And("I enter analytics from date")
	public void i_enter_FromDate() {

		//String ToDate = WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_Analytics_ToDate'), 'value')

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_Analytics_FromDate'))
		
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_Analytics_FromDate'), '11022021')
		
//		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_Analytics_FromDate'), ToDate)
//		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_Analytics_FromDate'), ToDate)
		
	}

	
	@And("I enter (.*) as notified name")
	public void i_enter_notificationName(String NotifiedName) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_NotifiedName'), NotifiedName)
	}


	@And("I enter (.*) as notifiedtitle")
	public void i_enter_notifiedTitle(String Title) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_NotifiedTitle'), Title)
	}


	@And("I enter (.*) as notified date and time")
	public void i_enter_notifiedDate(String DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_NotifiedDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_NotifiedDate'), DateTime)
	}


	@And("I enter (.*) as Non Face to Face Completed By")
	public void i_enter_NonFace(String FaceToFaceName) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceName'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceName'), FaceToFaceName)
	}
	@And("I enter (.*) as Non Face to Face Completed By signature")
	public void i_enter_FaceCompleted(String Signature) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceSignature'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceSignature'), Signature)
	}
	@And("I enter (.*) as Non Face to Face Completed By date and time")
	public void i_enter_FaceCompletedDateTime(String DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceDate'), DateTime)
	}

	@And("I enter (.*) as attempt1")
	public void i_enter_attempt1(String Attempt1_DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Date'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Date'), Attempt1_DateTime)
	}
	@And("I select attempt no one dropdown value")
	public void I_select_Attempt1() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Dropdown_Click'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Dropdown_select'))

	}

	@And("I click on save button to save transition of care form data")
	public void I_SaveBtn_Transition() {
		Thread.sleep(2000)
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_SaveBTN'))

		Thread.sleep(2000)
	}

	@And("I enter (.*) as how are you feeling since discharge")
	public void i_enter_HowAreYouFeeling(String HowAreYouFeeling) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_FaceToFaceDate'), HowAreYouFeeling)
	}
	
	
	@Then("I select Transition outreach:(.*)")
	public void i_select_OUtreach(String Outreach) {
		'I click on privacy field'
		WebUI.click(OutreachClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+Outreach+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@And("I enter (.*) as Symptoms leading to Emergency Room visit")
	public void i_enter_LeadingEmgergency(String SymptomsLeadingToEmergency) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/ER Follow Up Calls/Obj_SymptomsLeadingToEmergency'), SymptomsLeadingToEmergency)
	}
	
	@And("I enter (.*) as Emergency Room Treatment received")
	public void i_enter_RoomTreatment(String EmergencyRommTreatment) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/ER Follow Up Calls/Obj_EmergencyRommTreatment'), EmergencyRommTreatment)
	}
	
	@And("I enter (.*) as What lead you to being in the hospital")
	public void i_enter_LeadYouHospital(String WhatLeadYouToBeing) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Hospital Discharge Calls/Obj_WhatLeadYouToBeing'), WhatLeadYouToBeing)
	}
	
	@And("I enter (.*) as Have your symptoms improved worsened or stayed the same since returning home")
	public void i_enter_HaveYOurSymptomsImproved(String HaveYourSymptomsImproved) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Hospital Discharge Calls/Obj_HaveYourSymptomsImproved'), HaveYourSymptomsImproved)
	}

	@Then("I select In general how are you feeling after your surgery:(.*)")
	public void i_select_InGeneralHowAreYouFeeling(String InGeneralHowAreYouFeeling) {
		'I click on privacy field'
		WebUI.click(InGeneralHowAreYouFeelingClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+InGeneralHowAreYouFeeling+'"]'
		obj.selectdropdown(frame,xpath)
	}
	@And("I enter (.*) as type of surgery")
	public void i_enter_typeofsurgery(String TypeOfSurgery) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Surgical Follow Up Calls/Obj_TypeOfSurgery'), TypeOfSurgery)
	}
	
	@And("I should see data in analytics")
	public void i_enter_AnalyticsDate() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Surgical Follow Up Calls/Obj_DateTime'),3)
	}
	

	
}