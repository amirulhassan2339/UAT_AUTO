Feature: Patient Timer

	Background: 
		Given I navigate to patient grid

	@Regression_Timer_disable
	Scenario Outline: Timer should be Disable for other patient if already running for A Patient
		When I search <Patient> using global search
		   * I click on patient timer button
		Then I should see patient <Patient> as patient_name in timer popup
		   * I click on start timer button
		   * I click on minimize button
		When I click on message tab
		   * I search patient <Patient> in message field
		   * I select searched patient
		   * I click on patient from message box
		Then I should see patient <Patient> as patient_name in timer popup
		   * I click on minimize button
		   * I click on WFB cross button
		When I click on scheduleTab
		   * I double click on screen to add appointment
		   * I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#		   * I click on proceed button to appointment
		   * I click on three dots
		   * I click on view patient record
		Then I should see patient <Patient> as patient_name in timer popup
		   * I click on minimize button
		   * I click on WFB cross button from schedule
		When I click on supberbill tab
		   * I click on Reset button to reset supper bill filters
		   * I enter <DateOfService_FromDate> as date of service from date
		   * I click on Apply button to apply supper bill filters
		   * I select patient from super bill grid
		Then I should see patient <Patient> as patient_name in timer popup
		   * I click on minimize button
		   * I click on WFB cross button from schedule
		When I click on analytics tab
		   * I click on form option
		   * I select the patient from analytics grid
		Then I should see patient <Patient> as patient_name in timer popup		   
		   * I click on stop timer button
		   * I click on update button
		   * I click on WFB cross button from schedule
		When I click on scheduleTab
		And I click on three dots
		 * I click on delete appointment
		 * I should see delete appointment message
		   

		Examples: 
			| Patient          | Reason    | DateOfService_FromDate |
			| Dermo505, Mac505 | Back pain |               12052020 |
		
