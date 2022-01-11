Feature: Care Plan - ADD Problem 

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify That User Is Able To Add Problem
		When I search <Patient> using global search
		 And I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   * I hover over on problem
		   * I click on problem plus button
		   * I select activeproblem as:<ActiveProblem>
		   * I enter <ProblemCode> as problemcode
		   * I enter <StartDate> as problemStartDate
		   * I click on updated button
		   * I enter title <Title>
		   * I click on save and close button
		   * I click on title from care plan grid
		   Then I should see patient <Patient> as patient_name
#		   Then I should see <ProblemCode> and <StartDate> as updated problem
		   

		Examples: 
			| Patient          | ProblemCode | SucessMessage                           | ActiveProblem |StartDate|Title|
			| Dermo505, Mac505 |    010.01 | successCare Plan Saved SuccessfullyHide | ICD-9         |12012020|Problem|
