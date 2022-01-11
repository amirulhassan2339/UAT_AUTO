Feature: Care Plan - Preview Assessment - Based On Patient Medical Record

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Preview assessment by clicking name of assessment when we are on careplan and selecting assessments
		When I search <Patient> using global search
				 And I click on assessment
				   * I click on add
				   * I click on other assessment tempelate
				   * I click Asthma
				   * I click on procced
				   * I enter <Title> title
				   * I click billable radio button
				   * I enter <CPTCode> as cpt code
				   * I select dropdown values
				   * I enter <Comment> comment
				   * I click save button
		   * I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   * I mouse hover on assessment
		   * I click on assessment icon
		   * I select multiple assessment checkboxes
		   * I click on OK button
		Then I should see assessment data
		When I mouse hover on assessment
		   * I click on assessment icon
		Then I should see assessment checkbox is checked
		   * I uncheck the checkbox now
		   * I click on OK button
		   * I click on Cancel button
		   * I should not see assessment data
		   * I mouse hover on assessment
		   * I click on assessment icon
		   * I select multiple assessment checkboxes
		   * I click on OK button
		Then I should see assessment data
		When I enter <AssessmentComment> as assessmentcomment
		 And I enter title2 <Title>
		   * I click on save button
		   * I should see assessment data
		   * I click on save and close button
		   * I click on title from care plan grid
		   * I should see assessment data
		   * I mouse hover on assessment for deletion
		   * I click on assessment delete icon
		   * I should not see assessment data
		   * I click on save button
		   * I should not see assessment data
		   * I click on save and close button
		   * I click on title from care plan grid
		Then I should not see assessment data

		Examples: 
			| Patient          | Title                  | Comment                                                                    | CPTCode   | AssessmentComment |
			| Dermo505, Mac505 | Assessment TestingName | Lorem Ipsum is simply dummy text of the printing and typesetting industry. | Test Code | AssessentTest     |
