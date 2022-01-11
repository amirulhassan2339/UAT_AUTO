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
		   * I enter title2 <Title>
		   * I select work in progress as no
		   * I click on save button
		   * I mouse hover on assessment
		   * I click on assessment icon
		   * I click on assessment name to preview assessment detail
		Then I should see assessment data <Title> in preview window as title
		   * I should see assessment data <Comment> in preview window as comment
		   * I click on OK button
		       * I click on save and close button
		   
		   * I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   * I enter title2 <Title>
		   * I select work in progress as no
		   * I click on save button
		   
		   When I click on saveapprove button
		   * I click on proceed button
		   * I click on title from care plan grid
		   

		Examples: 
			| Patient          | Title                  | Comment                                                                    | CPTCode   |
			| Dermo505, Mac505 | Assessment TestingName | Lorem Ipsum is simply dummy text of the printing and typesetting industry. | Test Code |
