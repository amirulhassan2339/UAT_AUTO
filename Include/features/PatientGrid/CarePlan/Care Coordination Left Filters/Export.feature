Feature: CM Status - Export - Care Coordination

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: CM Status - Exports
		When I click on care cordination tab
		   * I select <Export> as export
		Then I verify that exported file downloaded successfully

		Examples: 
			| Export                    |
			| Export (All Columns)      |
			| Export (Selected Columns) |
