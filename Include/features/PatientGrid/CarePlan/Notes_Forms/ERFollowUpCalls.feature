Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Transition Of Care Form - Courtesy Calls
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on ER Follow Up Call
		   * I should see <Patient> as patient name in form popup
		   
		   * I should see transition of ER Follow Up care form title
		   * I enter <DateTime> as date of service date and time
		   * I select privacy:<privacy>
		   * I select priority:<priority>
		   * I enter <ProviderName> as Provider Name and Contact

		   * I enter <SymptomsLeadingToEmergency> as Symptoms leading to Emergency Room visit
		   * I enter <EmergencyRommTreatment> as Emergency Room Treatment received
		   * I click on save button to save transition of care form data
		   * I click on edit button of forms
		   * I should see <Patient> as patient name in form popup
		   * I should see <DateTime> as courtesy date of service
		   * I click on save button to save transition of care form data
		   
		   * I click on delete button to delete form
		   Then I select Delete from the confirmation box

		#		Then I should see record success message
		Examples: 
			| Patient        | EmergencyRommTreatment   | SymptomsLeadingToEmergency         | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | Attempt2_DateTime | DischargeLocation | HowAreYouFeeling | AdditionalRecords | DischargeDate | Attempt1_Dropdown | Attempt2_Dropdown | AttemptedTwiceWithoutSuccess | WasLetterMailed | DischargeLocation | HowAreYouFeelingSinceDischarge | HaveYouFilledYourPrescriptions | DoYouHaveFollowUpAppointmentScheduled | AppointmentDate   | KeepingThisAppointment | KeepingThisAppointmentField | DoYouHaveAnyOtherQuestion | DoYouHaveAnyOtherQuestionField | SocialDetermination | AnyBarriersIdentified | AnyBarriersIdentifiedField | AnyFoundConcerns |
			| Powsen, Powsen | Emergency Treatment Text | Symptoms Leading To Emergency Text | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM |          04032020 | Ascension         | Much better..!!  | Hospital          |      03152021 | Successful        | Successful        | Yes                          | Yes             | Ascension         | Much better..!!                | Yes                            | Yes                                   | 03152021 03:20 AM | Yes                    | Keeping this appointment    | Yes                       | Do you have any question? No   | Yes                 | Yes                   | Barriers                   | Yes              |
