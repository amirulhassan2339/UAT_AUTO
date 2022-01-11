Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Transition Of Care Form - Courtesy Calls
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on Courtesy Call
		   * I should see <Patient> as patient name in form popup
		   * I should see transition of care form title
		   * I enter <DateTime> as date of service date and time
		   * I select Coutesy Call privacy:<privacy>
		   * I select Coutesy Call priority:<priority>
		   * I enter <ProviderName> as Provider Name and Contact
		   * I enter <DischargeDate> as dischargeDate
		   * I enter <Attempt1_DateTime> as Attempt1_DateTime
		   * I select Attempt1_DateTime Dropdown:<Attempt1_Dropdown>
		   * I enter <Attempt2_DateTime> as Attempt2_DateTime
		   * I select Attempt2_DateTime Dropdown:<Attempt2_Dropdown>
		   * I select contact method:<ContactMethod>
		   * I click on save button to save patient data
		Then I should see success message for <module> record

		#		When I click on analytics tab
		#		   * I click on form option
		#		   * I click on analytics reset button
		#		   * I enter analytics from date
		#		   * I select form type:<FormType>
		Examples: 
			| Patient          |ProviderName| FormType   | DateTime          | DateOfDischarge | privacy | priority | module | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | Attempt2_DateTime | DischargeLocation | HowAreYouFeeling | AdditionalRecords | DischargeDate | Attempt1_Dropdown | Attempt2_Dropdown | AttemptedTwiceWithoutSuccess | WasLetterMailed | DischargeLocation | HowAreYouFeelingSinceDischarge | HaveYouFilledYourPrescriptions | DoYouHaveFollowUpAppointmentScheduled | AppointmentDate   | KeepingThisAppointment | KeepingThisAppointmentField | DoYouHaveAnyOtherQuestion | DoYouHaveAnyOtherQuestionField | SocialDetermination | AnyBarriersIdentified | AnyBarriersIdentifiedField | AnyFoundConcerns |
			| Dermo505, Mac505 | Amir|SNF Waiver | 03152021 03:20 AM |        03152021 | Private | Low      | adding | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM | 03152021 03:20 AM | Ascension         | Much better..!!  | Hospital          |      03152021 | Successful        | Successful        | Yes                          | Yes             | Ascension         | Much better..!!                | Yes                            | Yes                                   | 03152021 03:20 AM | Yes                    | Keeping this appointment    | Yes                       | Do you have any question? No   | Yes                 | Yes                   | Barriers                   | Yes              |
