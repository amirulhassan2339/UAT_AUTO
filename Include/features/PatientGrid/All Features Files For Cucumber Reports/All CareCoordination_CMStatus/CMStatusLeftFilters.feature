Feature: CM Status - Care Coordination

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: CM Status Left Filters Verification
		When I click on care cordination
		   * I clear before and after dates
		   * I click on care cordination reset button
		   * I clear before and after dates
		   * I select <CM_Status> as cm status
		   * I click on care cordination apply button
		Then I should see patients with CM Status as <CM_Status> on care coordination grid

		Examples: 
			| CM_Status |
			| Eligible  |
			| Active    |
			| Completed |

#	@Smoke_USMM
#	Scenario Outline: CM Status hyperlink - Popup and verification on pop up as well as grid
#		When I click on care cordination
#		   * I click on CM link
#		   * I should see popup details
#		   * I enter due date <Due_Date> as DT
#		   * I select CM Status
#		   * I enter care provider <CareProvider> as CP
#		   * I enter care coordination <CareCoordination> as CC
#		   * I click on save button to save notification details
#		Then I should see this message <SuccessMessage> as Notification
#		   * I should see patient details including <CareCoordination> AND <CareProvider> AND <Due_Date> AND CM_Status after updating data from popup
#		   * I click on CM link again
#		   * I select CM Status again
#		   * I click on save button to save notification details
#
#		Examples: 
#			| Due_Date          | CareProvider     | CareCoordination | SuccessMessage                               |
#			| 09162021 12:00 AM | mehmood, mehmood | Member, Mohsin   | successNotification updated successfullyHide |
