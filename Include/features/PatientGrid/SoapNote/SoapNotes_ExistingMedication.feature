Feature: Soap Note - Existing Medications

	Background: 
		Given I navigate to patient grid

	@ExistingMedications
	Scenario Outline: Verify Existing Medications
		When I search <Patient> using global search
		 And I click on Clinical tab
		   * I click on Medication	tab
		   * I click on medication Add button
		   * I enter <Source_Type> in medication source type field
		   * I enter <Name> in medication name field
		   * I click on medication Save All button
		   * I click on schedule tab
		   * I double click on screen to add appointment
		   * I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#				   * I click on proceed button to appointment
		Then I should see appointment success message
		   * I should see already scheduled appointment
		When I click on three dots
		 And I hover over on create soapnotes
		   * I click on based on patient medical record
		#* I click on edit soapnotes
		   * I click on add Medication existing button
		   * I select the medication checkbox
		   * I click on procced button
		   * I click on Save button to save SOAP NOTE
		Then I should see medications existing data in grid

		Examples: 
			| Patient          | Reason    | Source_Type | Name                                                              |
			| Dermo505, Mac505 | Back pain | MMSL        | Humulin R U-500 KwikPen 500unit/ml Solution for Injection::100034 |

	Scenario: Verify deleting Scheduled Appointment
		Then I should see already scheduled appointment
		When I click on three dots
		 And I click on delete appointment
		 And I should see delete appointment message
