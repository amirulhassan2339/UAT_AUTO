Feature: Care Plan - BOPMR

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Based On Patient Medical Report
		When I search <Patient> using global search
		Then I am on PWB
		   * I click on appointment tab
		   * I click on add button to appointment adding
		   * I should see add appointment title
		   * I enter appointment <Reason> as reason
		   * I enter appointment <Time> as time
		   * I select appointment status
		   * I enter appointment <Comment> as appointmentcomment
		   * I click on save button to save appointment
		   * I should see appoitment success message <SucessMessage> of appointment


		Examples: 
			| Patient          | Reason    | Time        | Comment          | SucessMessage                        |
			| Dermo505, Mac505 | Back pain | 08:30:00 AM | Appointment Test | successRecord saved successfully.Hide |
