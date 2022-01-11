Feature: Patient Timer

	Background: 
		Given I navigate to patient grid

	@Regression_Timer_disable
	Scenario Outline: Timer should be Disable for other patient if already running for A Patient
		When I search <Patient> using global search
		   * I verify patient is selected
		   * I click on patient timer button
		Then I should see patient <Patient> as patient_name in timer popup
		   * I click on start timer button
		   * I click on minimize button
		   * I search this patient <SecondPatient> as second patient
		   * I select the patient
		   * I should see patient timer button is disabled
		   * I should see patient timer disable button tooltip text
		   * I click on WFB cross button
		   * I click on patient timerBTN
		   * I click on cross button
		   * I should see timer warning message
		   * I click on no discard button


		Examples: 
			| Patient          | SecondPatient      |
			| BABCOX, MICHAEL | MEH, BU |
