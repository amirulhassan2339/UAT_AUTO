@MentalStatus
Feature: Add Edit and Delete in mental status

Background: 
  Given I navigate to patient grid
    
    @Add
    @AddMentalStatus
    @Regression
    @Sanity
    Scenario Outline: Add in mental status with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Mental Status tab
	 When I click on Mental status Add button
		And I enter <Condition> in mental status condition field
		*   I enter <Date> in mental status date field
		*   I click on mental status Update button
	 Then I should see success message for added mental status
#		And I should see the newly added mental status on grid
		
		Examples:
		|    Patient   |                       Condition                       |  Date  |
		|Robit, Robit|Spirometry reversibility negative (finding):: 314980001|01032021|
		
	  @Edit
		@EditMentalStatus
	  @Regression
    @Sanity
    Scenario Outline: Edit in mental status with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Mental Status tab
	 When I click on Mental status Edit button
		And I enter <Condition> in mental status condition field
		*   I enter <Date> in mental status date field
		*   I click on mental status Update button
	 Then I should see success message for edit mental status
#		And I should see the newly added mental status on grid
		
		Examples:
		|    Patient   |                            Condition                          |  Date  |
		|Robit, Robit|Negative reversibility test to salbutamol (finding):: 391111000|03142021|
		
		
	  @Delete
	  @DeleteMentalStatus
	  @Regression
    @Sanity
    Scenario Outline: Delete the specific record in mental status
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Mental Status tab
		*   I enter <Condition> to delete record in mental status 
	 Then I should see success message for deleted record
	  And I should see the deleted mental status not present on grid
		
		Examples:
		|    Patient   |                            Condition                          | 
		|Robit, Robit|Negative reversibility test to salbutamol (finding):: 391111000|
		
			