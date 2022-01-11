Feature: Care Cordination Left Filters

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Applying Notification Type Filter
		When I click on care cordination
		 And I clear before and after dates
		   * I click on care cordination reset button
		   * I clear before and after dates
		   * I select <NotificationType> as Notification Type
		   * I click on care cordination apply button
		Then I should see <NotificationType> care cordination Notifications

		Examples: 
			| NotificationType |
			| Admitted         |
