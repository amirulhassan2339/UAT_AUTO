Feature: Scheduled Left Filters flow

	Background: 
		Given I navigate to CMR_Schedule

	@SmokeUSMM_ScheduleAppointment_Telehealth
	Scenario Outline: Verify Creating Appointment With Telehealth VisitType
		When I double click on screen to add appointment
		   * I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I select Visit Type:<VisitType>
		   * I should see VisitType Link
		   * I should see Send SMS button
		   * I should see Copy button
		   * I should see <Patient> as actual patient name
#		   * I drag chat list
#		   * I click create button to save appointment
#		   * I click on yes button
#		   * I click on proceed button to appointment
#		Then I should see appointment success message
#		* I click on three dots
#		   * I click on delete appointment
#		   * I should see delete appointment message

		Examples: 
			| Patient          | Reason    | VisitType  |
			| Dermo505, Mac505 | Back pain | Telehealth |
			
	@SmokeUSMM_ScheduleAppointment_Without_Telehealth

	Scenario Outline: Verify Creating Appointment WithOut Telehealth VisitType
		When I double click on screen to add appointment
		   * I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I select Visit Type:<VisitType>
		   * I should not see VisitType Link
		   * I should not see Send SMS button
		   * I should not see Copy button
		   * I should see <Patient> as actual patient name
#		   * I drag chat list
#		   * I click create button to save appointment
#		   * I click on yes button
#		   * I click on proceed button to appointment
#		Then I should see appointment success message
#		   * I click on three dots
#		   * I click on delete appointment
#		   * I should see delete appointment message
		   

		Examples: 
			| Patient          | Reason    | VisitType  |
			| Dermo505, Mac505 | Back pain | Phone |

	