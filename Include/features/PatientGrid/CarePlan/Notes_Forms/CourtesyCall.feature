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
		   * I select privacy:<privacy>
		   * I select priority:<priority>
		   * I enter <ProviderName> as Provider Name and Contact
		   * I enter <DischargeDate> as dischargeDate
		   * I enter <Attempt1_DateTime> as Attempt1_DateTime
		   * I select Attempt1_DateTime Dropdown:<Attempt1_Dropdown>
		   * I enter <Attempt2_DateTime> as Attempt2_DateTime
		   * I select Attempt2_DateTime Dropdown:<Attempt2_Dropdown>
		   * I select Attempted twice without success:<AttemptedTwiceWithoutSuccess>
		   * I select Was letter mailed:<WasLetterMailed>
		   * I select contact method:<ContactMethod>
		   * I select discussed with:<DiscussWith>
		   * I select Discharge Location:<DischargeLocation>
		   * I enter <HowAreYouFeelingSinceDischarge> as How are you feeling since discharge
		   * I select Have you filled your prescriptions:<HaveYouFilledYourPrescriptions>
		   * I select Do you have a follow up appointment scheduled:<DoYouHaveFollowUpAppointmentScheduled>
		   * I enter <AppointmentDate> as Appointment Date Of Courtesy
		   * I select Is there anything that might prevent you from keeping this appointment:<KeepingThisAppointment>
		   * I enter <KeepingThisAppointmentField> as Is there anything that might prevent you from keeping this appointment
		   * I select Do you have any other questions or concerns at this time:<DoYouHaveAnyOtherQuestion>
		   * I enter <DoYouHaveAnyOtherQuestionField> as Do you have any other questions or concerns at this time
		   * I select Additional records reviewed through:<AdditionalRecords>
		   * I select Social Determinants of Health Screening Completed:<SocialDetermination>
		   * I select Any barriers identified:<AnyBarriersIdentified>
		   * I enter <AnyBarriersIdentifiedField> as any barriers
		   * I select Any found concerns or potential barriers reported to primary care physicians office:<AnyFoundConcerns>
		   * I enter <NotifiedName> as notified name
		   * I enter <Title> as notifiedtitle
		   * I enter <DateTime> as notified date and time
		   * I enter <FaceToFaceName> as Non Face to Face Completed By
		   * I enter <Signature> as Non Face to Face Completed By signature
		#		   * I enter <DateTime> as Non Face to Face Completed By date and time
		   * I click on save button to save transition of care form data
		   
		When I click on analytics tab
		   * I click on form option
		   * I click on analytics reset button
		   * I enter analytics from date
		   * I select form type:<FormType>
		  
		
#		   * I click on edit button of forms
#		   * I should see <Patient> as patient name in form popup
#		   * I should see <DateTime> as courtesy date of service
#		   * I click on save button to save transition of care form data
#		   * I click on delete button to delete form
#		Then I select Delete from the confirmation box

		#		Then I should see record success message
		Examples: 
			| Patient        | FormType   | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | Attempt2_DateTime | DischargeLocation | HowAreYouFeeling | AdditionalRecords | DischargeDate | Attempt1_Dropdown | Attempt2_Dropdown | AttemptedTwiceWithoutSuccess | WasLetterMailed | DischargeLocation | HowAreYouFeelingSinceDischarge | HaveYouFilledYourPrescriptions | DoYouHaveFollowUpAppointmentScheduled | AppointmentDate   | KeepingThisAppointment | KeepingThisAppointmentField | DoYouHaveAnyOtherQuestion | DoYouHaveAnyOtherQuestionField | SocialDetermination | AnyBarriersIdentified | AnyBarriersIdentifiedField | AnyFoundConcerns |
			| Dermo505, Mac505 | SNF Waiver | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM |          04032020 | Ascension         | Much better..!!  | Hospital          |      03152021 | Successful        | Successful        | Yes                          | Yes             | Ascension         | Much better..!!                | Yes                            | Yes                                   | 03152021 03:20 AM | Yes                    | Keeping this appointment    | Yes                       | Do you have any question? No   | Yes                 | Yes                   | Barriers                   | Yes              |
