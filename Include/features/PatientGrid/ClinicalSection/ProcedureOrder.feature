@ProcedureOrder
Feature: Add Edit and Delete in Procedure Order

Background: 
  Given I navigate to patient grid
    
  @Add
  @AddProcedureOrder
  @Regression
  @Sanity
    Scenario Outline: Add in procedure order with all fields
     
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 When I click on Procedure order Add button
    And I enter <Order_Provider> in procedure order order provider field
    *   I enter <Date> in procedure order date field
    *   I enter <Procedure_Test_Type> in procedure order procedure test type field
    *   I enter <Procedure_Test> in procedure order procedure test field
    *   I enter <Effective_Date> in procedure order effective date field
    *   I enter <Diagnoses> in procedure order diagnoses field
    *   I enter <Body_Site> in procedure order body site field
    *   I enter <Comments> in procedure order comments field
    *   I click on procedure order Save button
	 Then I should see success message for added procedure order
#		And I should see the newly added procedure order on grid
		
    Examples:
    |    Patient   |Order_Provider|    Date      |Procedure_Test_Type|          Procedure_Test           |Effective_Date|                      Diagnoses                     |            Body_Site             |    Comments   |
    |Robit, Robit|Latif, Zohaib |02012021 21:38|        HPC        |Outside state ambulance serv::A0021|02012021 21:38|(Cholera due to Vibrio cholerae 01, biovar cholerae)|Abnormal hematopoietic cell (cell)|Procedure Order|
     
  @Edit
  @EditProcedureOrder
  @Regression
  @Sanity
     Scenario Outline: Edit in imaging order with all fields
     
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 When I click on Procedure order Edit button
		And I click on procedure order panel remove button
    *   I enter <Order_Provider> in procedure order order provider field
    *   I enter <Date> in procedure order date field
    *   I enter <Procedure_Test_Type> in procedure order procedure test type field
    *   I enter <Procedure_Test> in procedure order procedure test field
    *   I enter <Effective_Date> in procedure order effective date field
    *   I enter <Diagnoses> in procedure order diagnoses field
    *   I enter <Body_Site> in procedure order body site field
    *   I enter <Comments> in procedure order comments field
    *   I click on procedure order Save button
	 Then I should see success message for edit procedure order
#		And I should see the newly added procedure order on grid
		
    Examples:
    |    Patient   |Order_Provider|    Date      |Procedure_Test_Type|         Procedure_Test      |Effective_Date|          Diagnoses           |                Body_Site                |       Comments     |
    |Robit, Robit|Latif, Zohaib |02012021 21:38|       LOINC       |Amdinocillin Islt KB::1-Sep  |03112021 21:38| (Cholera, unspecified)       |Bone structure of tarsus (body structure)|Edit Procedure Order|
    
    @Delete
    @DeleteProcedureOrder
    @Regression
    @Sanity
    Scenario Outline: Delete the specific record in procedure orders
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 	*   I enter <Order_Provider> to delete record in procedure order
	 Then I should see success message for deleted procedure order
	  And I should see the deleted procedure order not present on grid
		
    Examples:
    |    Patient   |Order_Provider|   
    |Robit, Robit|Latif, Zohaib |
    #
    