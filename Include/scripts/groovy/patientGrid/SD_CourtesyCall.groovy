package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import utility_Functions.UtilityFunctions



public class SD_CourtesyCall {

	TestObject frame=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/CareManagementForm/Obj_CCMFrame')
	TestObject Attempt1Dropdown=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Dropdown_Click')
	TestObject Attempt2Dropdown=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt2Dropdown_Click')
	TestObject WasLetterMailedClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_WasLaterDropdown_Click')
	TestObject AttemptedTwiceWithoutSuccessClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_TwiseDropdown_Click')
	TestObject DischargeLocationClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DischargeLocation_Click')
	TestObject HaveYouFilledYourPrescriptionsClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_HaveYouFilledYourPrescriptions_Click')
	TestObject KeepingThisAppointmentClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_KeepingThisAppointment_Click')
	TestObject DoYouHaveAnyOtherQuestionClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DoYouHaveAnyOtherQuestion_Click')
	TestObject SocialDeterminationClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_SocialDetermination_Click')
	TestObject AnyBarriersIdentifiedClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AnyBarriersIdentified_Click')
	TestObject AnyFoundConcernsClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AnyFoundConcerns_Click')


	TestObject DoYouHaveFollowUpAppointmentScheduledClick=findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DoYouHaveFollowUpAppointmentScheduled_Click')


	UtilityFunctions obj=new UtilityFunctions();




	@And("I enter (.*) as dischargeDate")
	public void i_enter_DischargeDate(String DischargeDate) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DischargeDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DischargeDate'), DischargeDate)
	}



	@And("I enter (.*) as Attempt1_DateTime")
	public void i_enter_Attempt1_DateTime(String Attempt1_DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Date'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt1Date'), Attempt1_DateTime)
	}

	@Then("I select Attempt1_DateTime Dropdown:(.*)")
	public void i_select_Attempt1_Dropdown(String Attempt1_Dropdown) {
		'I click on privacy field'
		WebUI.click(Attempt1Dropdown)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+Attempt1_Dropdown+'"]'
		obj.selectdropdown(frame,xpath)
	}

	@And("I enter (.*) as Attempt2_DateTime")
	public void i_enter_Attempt2_DateTime(String Attempt2_DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt2Date'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_attempt2Date'), Attempt2_DateTime)
	}

	@Then("I select Attempt2_DateTime Dropdown:(.*)")
	public void i_select_Attempt2_Dropdown(String Attempt2_Dropdown) {
		'I click on privacy field'
		WebUI.click(Attempt2Dropdown)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+Attempt2_Dropdown+'"])[2]'
		obj.selectdropdown(frame,xpath)
	}



	@Then("I select Attempted twice without success:(.*)")
	public void i_select_Attemptedtwice(String AttemptedTwiceWithoutSuccess) {
		'I click on privacy field'
		WebUI.click(AttemptedTwiceWithoutSuccessClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+AttemptedTwiceWithoutSuccess+'"])[2]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select Was letter mailed:(.*)")
	public void i_select_WasLetterMailed(String WasLetterMailed) {
		'I click on privacy field'
		WebUI.click(WasLetterMailedClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+WasLetterMailed+'"])[3]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select Discharge Location:(.*)")
	public void i_select_DischargeLocation(String DischargeLocation) {
		'I click on privacy field'
		WebUI.click(DischargeLocationClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='//li[text()="'+DischargeLocation+'"]'
		obj.selectdropdown(frame,xpath)
	}



	@And("I enter (.*) as How are you feeling since discharge")
	public void i_enter_HowAreYouFeelingSinceDischarge(String HowAreYouFeelingSinceDischarge) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_HowAreYouFeelingSinceDischarge'), HowAreYouFeelingSinceDischarge)
	}

	@Then("I select Have you filled your prescriptions:(.*)")
	public void i_select_HaveYouFilledYourPrescriptions(String HaveYouFilledYourPrescriptions) {
		'I click on privacy field'
		WebUI.click(HaveYouFilledYourPrescriptionsClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+HaveYouFilledYourPrescriptions+'"])[4]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select Do you have a follow up appointment scheduled:(.*)")
	public void i_select_DoYouHaveFollowUpAppointmentScheduled(String DoYouHaveFollowUpAppointmentScheduled) {
		'I click on privacy field'
		WebUI.click(DoYouHaveFollowUpAppointmentScheduledClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+DoYouHaveFollowUpAppointmentScheduled+'"])[5]'
		obj.selectdropdown(frame,xpath)
	}


	@And("I enter (.*) as Appointment Date Of Courtesy")
	public void i_enter_AppointmentDate(String AppointmentDate) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AppointmentDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AppointmentDate'), AppointmentDate)
	}


	@And("I enter (.*) as Is there anything that might prevent you from keeping this appointment")
	public void i_enter_KeepingThisAppointmentField(String KeepingThisAppointmentField) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_KeepingThisAppointmentField'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_KeepingThisAppointmentField'), KeepingThisAppointmentField)
	}


	@Then("I select Is there anything that might prevent you from keeping this appointment:(.*)")
	public void i_select_KeepingThisAppointment(String KeepingThisAppointment) {
		'I click on privacy field'
		WebUI.click(KeepingThisAppointmentClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+KeepingThisAppointment+'"])[6]'
		obj.selectdropdown(frame,xpath)
	}


	@Then("I select Do you have any other questions or concerns at this time:(.*)")
	public void i_select_DoYouHaveAnyOtherQuestion(String DoYouHaveAnyOtherQuestion) {
		'I click on privacy field'
		WebUI.click(DoYouHaveAnyOtherQuestionClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+DoYouHaveAnyOtherQuestion+'"])[7]'
		obj.selectdropdown(frame,xpath)
	}

	@And("I enter (.*) as Do you have any other questions or concerns at this time")
	public void i_enter_DoYouHaveAnyOtherQuestionField(String DoYouHaveAnyOtherQuestionField) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_DoYouHaveAnyOtherQuestionField'), DoYouHaveAnyOtherQuestionField)
	}

	@Then("I select Social Determinants of Health Screening Completed:(.*)")
	public void i_select_SocialDetermination(String SocialDetermination) {
		'I click on privacy field'
		WebUI.click(SocialDeterminationClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+SocialDetermination+'"])[8]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I select Any barriers identified:(.*)")
	public void i_select_AnyBarriersIdentified(String AnyBarriersIdentified) {
		'I click on privacy field'
		WebUI.click(AnyBarriersIdentifiedClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+AnyBarriersIdentified+'"])[9]'
		obj.selectdropdown(frame,xpath)
	}

	@And("I enter (.*) as any barriers")
	public void i_enter_AnyBarriersIdentifiedField(String AnyBarriersIdentifiedField) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TransitionOfCareForm/Courtesy Calls/Obj_AnyBarriersIdentifiedField'), AnyBarriersIdentifiedField)
	}

	@Then("I select Any found concerns or potential barriers reported to primary care physicians office:(.*)")
	public void i_select_AnyFoundConcerns(String AnyFoundConcerns) {
		'I click on privacy field'
		WebUI.click(AnyFoundConcernsClick)
		'I select value from the dropdown'
		Thread.sleep(2000);
		String xpath='(//li[text()="'+AnyFoundConcerns+'"])[10]'
		obj.selectdropdown(frame,xpath)
	}

	@Then("I should see (.*) as courtesy date of service")
	public void VerifyDateOfServices(String DateTime) {
		'Verify date of services'
		String date4 = DateTime.substring(0, 8)

		String date5 = DateTime.substring(0, 8)

		WebUI.verifyMatch(date4, date5, false)
	}
}
