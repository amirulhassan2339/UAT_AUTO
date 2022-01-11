Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Telephonic Outreach
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on telephonic outreach
		   * I should see <Patient> as patient name in form popup
		   * I should see TelephonicOutreach care form title
		   * I enter telephonic outreach <DateTime> as datetime
		   * I enter telephonic outreach <Provider> as provider
		   * I select outreach office location
		   * I select outreach spoke with
		   * I select outreach call type
		   * I select outreach status
		   * I enter telephonic outreach <Follow_Up_Plan> as follow up plan
		   * I enter <Comments> as outreach comments
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		   * I should see current date of notes form

		Examples: 
			| Patient        | module | DateTime          | Provider | Duration | Follow_Up_Plan | Comments                                                                   |
			| Dermo505, Mac505 | adding | 03152021 03:20 AM | mason,   | 10:15:20 | Education      | Lorem Ipsum is simply dummy text of the printing and typesetting industry. |
