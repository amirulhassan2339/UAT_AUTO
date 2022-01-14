Feature: Soap Note - Existing Problems

	Background: 
		Given I navigate to patient grid

@ExistingProblems
	Scenario Outline: Verify Existing Problems
		When I search <Patient> using global search
		 And I click on Clinical tab
		   * I click on Problem List	tab
		   * I click on problem Add button
		   * I enter <Code_Name> in problem name field
		   * I click on problem Save All button
		   * I click on schedule tab
		   * I double click on screen to add appointment
		Then I should see schedule appointment popup
		When I enter <Patient> as appointment patient
		 And I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment success message
		   * I should see already scheduled appointment
		When I click on three dots
		 And I hover over on create soapnotes
		   * I click on based on patient medical record
		   * I click on add Problem existing button
		   * I select the Problem checkbox
		   * I click on procced button
		   * I click on Save button to save SOAP NOTE
		Then I should see problems data in soap note popup

		Examples: 
			| Patient          | Reason    | Code_Name                                                 |
			| Dermo505, Mac505 | Back pain | Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0 |

#	@Smoke_USMM_CreatingProblems
#	Scenario Outline: Verify Creating Problems - Based On Patient's Medical Record
#		When I click on schedule tab
#		Then I should see already scheduled appointment
#		When I click on three dots
#		#* I hover over on create soapnotes
#		#* I click on based on patient medical record
#		   * I click on edit soapnotes
#		Then I should see <Patient> as patient
#		When I click on add Problem existing button
#		 And I select the problem checkbox
#		   * I click on procced button
#
#		Examples: 
#			| ProblemsCode      | Problems_Start_Date | Patient          |
#			| diabetes mellitus |            04162021 | Dermo505, Mac505 |
#
#	Scenario: Verify deleting Scheduled Appointment
#		When I click on schedule tab
#		Then I should see already scheduled appointment
#		When I click on three dots
#		 And I click on delete appointment
#		 And I should see delete appointment message
