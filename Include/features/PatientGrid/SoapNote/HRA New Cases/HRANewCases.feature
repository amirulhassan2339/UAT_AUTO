Feature: Soap Note Creation from Schedule flow

	Background: 
		Given I navigate to CMR_Schedule

	@Smoke_USMM_CreateScheduleAppointment_WithNewHRACases
	Scenario Outline: HRA Soap Notes New Flows
		When I double click on screen to add appointment
		Then I should see schedule appointment popup
		When I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
		#		   * I click on proceed button to appointment
		Then I should see appointment success message
		   * I click on three dots
		#				   * I click on edit soapnotes
		   * I hover over on create soapnotes
		   * I click on based on patient medical record
		   * I click on add HRA plus button
		When I enter <LocationOfVisit1> as location of visit1
		   * I click on save button to save assessment
		   * I click on cross icon to close the popup
		   * I should see <Code1> in Billing Information1
		   * I click on add HRA plus button
		When I enter <LocationOfVisit2> as location of visit2
		   * I click on save button to save assessment
		   * I click on cross icon to close the popup
		   * I should see <Code2> in Billing Information2
		   * I click on add HRA plus button
		When I click on Exam and Recomendation Tab
		   * I enter <PADTestToday> as pad test today
		   * I enter <ReasonTest> as reason or conditon test
		   * I enter <LeftResults> as left results
		   * I enter <RightResults> as right result
		   * I click on save button to save assessment
		   * I click on cross icon to close the popup
		#		   * I should see <ReasonTest> in Recommended Lab section
		When I click on add HRA plus button
		   * I click on Exam and Recomendation Tab
		   * I select on Referral required
		   * I select urgency status as referral
		   * I enter reason of referralreason
		   * I click on save button to save assessment
		   * I click on cross icon to close the popup
		   * I enter <Facility> to add signature for sign button
		   * I select Rendering Provider
		When I click on Sign button to sign soapnotes
		   * I click on Create Signature button
		   * I set signature
		   * I click on submit signature button
		Then I should see sign saved message
		When I click on Addendum button
		   * I enter <AddendumNotes> as addendumNotes
		   * I click on addendum save button to save addendum
		Then I should see <AddendumNotes> as addendum in addendumsection
		   * I click on close button
		   * I should see signed status icon on appointment ui page
		When I navigate to supper bill tab
		   * I click on Reset button to reset supper bill filters
		When I click on referral status three lines
		Then I should see case management popup
		   * I should see case management popup data is showing
		   * I click on Done button
		   * I select <Soap_Status> as Signed status from soap status
		   * I click on Apply button to apply supper bill filters
		   * I open Patient using <MRN> on superbill screen
		Then I should see <MRN> on superbill grid
		When I click on schedule tab
		   * I click on three dots
		   * I click on view soap note
		   * I click on Unsign button
		   * I click on yes button to unsign
		Then I should see unsigned message
		   * I click on print soap note button

		Examples: 
			| Patient          | Reason    | LocationOfVisit1              | Code1 | LocationOfVisit2                 | Code2 | PADTestToday | ReasonTest | LeftResults | RightResults | DiagnosisCode | Facility          | Constitutional       | MRN           | Soap_Status | AddendumNotes |
			| Dermo505, Mac505 | Back pain | Audio only over the telephone | 99443 | Telehealth utilizing audio/video | 99203 | Yes          | Diabetes   | 0.99-0.90   | 0.89-0.60    | Z13.6         | VPA PC WEST ALLIS | In no acute distress | MRN0000014455 | Signed      | Addendum Test |

	Scenario: Verify deleting Scheduled Appointment
		Then I should see already scheduled appointment
		When I click on three dots
		 And I click on delete appointment
		 And I should see delete appointment message
