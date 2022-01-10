Feature: Care Cordination Left Filters

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Applying Assign Date Filter
		When I click on care cordination
		   * I clear before and after dates
		   * I click on care cordination reset button
		   * I clear before and after dates
		   * I enter <AssignDateFrom> as assign date from
		   * I enter <AssignDateTo> as assign date to
		   * I click on care cordination apply button
		Then I should see care cordination <AssignDateFrom> as assignDate

		Examples: 
			| AssignDateFrom | AssignDateTo |
			|       09242021 |     10012021 |
