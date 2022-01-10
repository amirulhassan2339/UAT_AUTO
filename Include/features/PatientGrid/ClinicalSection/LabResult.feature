@Labresult
Feature: Add Edit and Delete in Lab Results

Background: 
  Given I navigate to patient grid
    
  @AddLabResult
  @Regression
  @Sanity
    Scenario Outline: Add in lab results with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
	 When I enter lab results <Panel>
		And I click on lab results Add Analyte button
		*   I enter <Analyte> in lab results analyte field
    *   I enter <Date> in lab results date field
    *   I enter <Time> in lab results time field
	  *   I enter <Result_Type> in lab results result_type field
	  *   I enter <Value> in lab results value field
	  *   I enter <Flag> in lab results flag field
	  *   I enter <Normal_Range> in lab results normal range field
	  *   I enter <Status> in lab results status field
	  *   I enter <Notes> in lab results notes field
	  *   I click on lab results Save All button
	 Then I should see success message for added lab results
#		And I should see the newly added lab results on grid
	
   Examples:    
   |    Patient    |   Panel   |               Analyte         |   Date |   Time |Result_Type|            Value             |     Flag     |Normal_Range |Status |      Notes    |
   |Robit, Robit|Lipid Panel|Osteoarthritis composite::0005F|01012021|01:30:00| CD [LOINC]| Amdinocillin Islt KB::1-Sep  |Abnormal alert|     10      |active |Lab results added|
   
   @EditLabResult
   @Regression
   @Sanity
 Scenario Outline: Add in lab results with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
	 When I click on lab result panel first row Edit button
		And I enter <Analyte> in lab results analyte field
    *   I enter <Date> in lab results date field
    *   I enter <Time> in lab results time field
	  *   I enter <Result_Type> in lab results result_type field
	  *   I enter <Value> in lab results value field
	  *   I enter <Flag> in lab results flag field
	  *   I enter <Normal_Range> in lab results normal range field
	  *   I enter <Status> in lab results status field
	  *   I enter <Notes> in lab results notes field
	  *   I click on lab results Save All button
	 Then I should see success message for added lab results
#		And I should see the newly added lab results on grid
	
   Examples:    
   |    Patient    |             Analyte         |   Date |   Time |Result_Type|                            Value                              |  Flag  |Normal_Range |  Status |      Notes     |
   |Robit, Robit|Anesth, blepharoplasty::00103|03132021|02:00:00|CD [SNOMED]|Negative reversibility test to salbutamol (finding):: 391111000|Abnormal|     20      |completed|Lab results edit|
   
   
   @DeleteLabResult
   @Regression
   @Sanity
 Scenario Outline: Delete the specific record in lab results 
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
		*   I enter <Panel> to delete panel in lab results
	 Then I should see success message for deleted lab result panel
	  And I should see the deleted lab results not present on grid
	
   Examples:    
     |    Patient    |   Panel   |   
     |Robit, Robit |Lipid Panel|
   #
 