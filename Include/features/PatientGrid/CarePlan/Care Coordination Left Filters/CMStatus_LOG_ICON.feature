Feature: CM Status - Care Coordination

	Background: 
		Given I navigate to patient grid


	@Smoke_USMM
	Scenario Outline: CM Status hyperlink - Popup and verification on pop up as well as grid
		When I click on care cordination
		   * I click on CM link
		   * I enter due date <Due_Date> as DT
		   * I select CM Status
		   * I click on save button to save notification details
		   * I click on CM link again
		   When I click on LOG icon button
		   Then I should see LOG Title
		   * I should see updated LOGS with <Due_Date> as updatedDate
		   * I select CM Status again
	     * I click on save button to save notification details
	     
		   

		Examples: 
			| Due_Date          | 
			| 09162021 12:00 AM | 
