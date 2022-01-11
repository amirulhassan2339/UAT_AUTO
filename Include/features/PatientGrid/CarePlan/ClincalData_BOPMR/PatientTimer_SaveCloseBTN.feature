Feature: Patient Timer

	Background: 
		Given I navigate to patient grid

	@Regression_Timer_SaveClose
	Scenario Outline: Warning Pop up on clicking 'x' while timer is on - Save & Close
		When I search <Patient> using global search
		   * I verify patient is selected
		   * I click on patient timer button
		Then I should see patient <Patient> as patient_name in timer popup
		   * I should see current date
		   * I click on start timer button
		   * I click on stop timer button
		When I click on cross button
		   * I should see timer warning message
		   * I click on timer save close button
		   * I click on history tab
		Then I should see patient timer history data

		Examples: 
			| Patient          |
			| Dermo505, Mac505 |
			
			@Regression_Timer_No_Discard
	Scenario Outline: Warning Pop up on clicking "x" while timer is on - No Discard
		When I search <Patient> using global search
		   * I verify patient is selected
		   * I click on patient timer button
		Then I should see patient <Patient> as patient_name in timer popup
		   * I should see current date
		   * I click on start timer button
		When I click on cross button
		   * I should see timer warning message
		   * I click on no discard button
		   * I click on history tab
		Then I should not see patient timer history data

		Examples: 
			| Patient          |
			| Dermo505, Mac505 |
