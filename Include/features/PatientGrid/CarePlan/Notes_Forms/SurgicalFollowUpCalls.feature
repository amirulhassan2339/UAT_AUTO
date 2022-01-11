Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Transition Of Care Form - Courtesy Calls
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on surgical Follow Up Call
		   * I should see <Patient> as patient name in form popup
		   * I should see transition of surgical Follow Up care form title
		   * I enter <DateTime> as date of service date and time
		   * I enter <ProviderName> as Provider Name and Contact
		   * I enter <TypeOfSurgery> as type of surgery
		   * I select In general how are you feeling after your surgery:<InGeneralHowAreYouFeeling>
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		   * I should see current date of notes form

		Examples: 
			| Patient        | TypeOfSurgery | InGeneralHowAreYouFeeling | DateTime          | DateOfDischarge | privacy | priority | ProviderName | module | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | Attempt2_DateTime | DischargeLocation | HowAreYouFeeling | AdditionalRecords | DischargeDate | Attempt1_Dropdown | Attempt2_Dropdown | AttemptedTwiceWithoutSuccess | WasLetterMailed | DischargeLocation | HowAreYouFeelingSinceDischarge | HaveYouFilledYourPrescriptions | DoYouHaveFollowUpAppointmentScheduled | AppointmentDate   | KeepingThisAppointment | KeepingThisAppointmentField | DoYouHaveAnyOtherQuestion | DoYouHaveAnyOtherQuestionField | SocialDetermination | AnyBarriersIdentified | AnyBarriersIdentifiedField | AnyFoundConcerns |
			| Dermo505, Mac505 | Surgery Text  | Good                      | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | adding | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM |          04032020 | Ascension         | Much better..!!  | Hospital          |      03152021 | Successful        | Successful        | Yes                          | Yes             | Ascension         | Much better..!!                | Yes                            | Yes                                   | 03152021 03:20 AM | Yes                    | Keeping this appointment    | Yes                       | Do you have any question? No   | Yes                 | Yes                   | Barriers                   | Yes              |
