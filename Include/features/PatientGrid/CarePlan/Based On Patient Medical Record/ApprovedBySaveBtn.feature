Feature: Care Plan - Approved Using Save Button

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify Approve Status Function Using Save Button
		When I search <Patient> using global search
		 And I click on care plan tab
		 And I click on add new care plan button
		 And I click on basedonpatientmedicalrecord
		Then I should see patient <Patient> as patient_name
		 And I should see intial status as <New Status> on CP header
		When I enter title <Title>
		 And I select work in progress as no
		 And I click on save button
		Then I should see success message <SucessMessage> of CP
		* I should see patient <Patient> as patient_name
		 * I should see status as <Draft Status> on CP header
		When I click on saveapprove button
		Then I should see alert popup
		 And I click on proceed button
		Then I should see success message <SucessMessage> of CP
		When I click on title from care plan grid
		Then I should see patient <Patient> as patient_name
		 And I should see patient data as read only
		 And I should see approval status as <Approved Status> on CP header

		Examples: 
			| Patient          | Title           | New Status | Draft Status | Approved Status | SucessMessage                           |
			| BABCOX, MICHAEL | ApprovedPatient | New        | Draft        | Approved        | successCare Plan Saved SuccessfullyHide |
    