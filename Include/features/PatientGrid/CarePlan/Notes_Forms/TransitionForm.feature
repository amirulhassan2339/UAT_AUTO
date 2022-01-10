Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Transition Of Care Form - Courtesy Calls
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on Transition Form
		   * I should see <Patient> as patient name in form popup
		   * I should see transition form title
		   * I select privacy:<privacy>
		   * I select priority:<priority>
		   * I enter <NotificationDate> as notificationDate
		   * I enter <DischargeDate> as discharge Date
		   * I enter <TransitionDate> as transitionDate
		   * I click on save button to save transition of care form data
		   * I click on edit button of forms
		   * I should see <Patient> as patient name in form popup
		   * I should see <NotificationDate> and <DischargeDate> and <TransitionDate> transition dates
		   * I click on save button to save transition of care form data
		   * I click on delete button to delete form
		   Then I select Delete from the confirmation box

		#		Then I should see record success message
		Examples: 
			| Patient        | NotificationDate  | DischargeDate     | privacy | priority | ProviderName | TransitionDate    |type|
			| Powsen, Powsen | 03152021 03:20 AM | 03152021 11:45 PM | Private | Low      | Amir         | 03152021 03:20 AM |patient Transition|
