Feature: Soap Note Creation from Schedule flow

	Background: 
		Given I navigate to CMR_Schedule

	Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
		 And I double click on screen to add appointment
		Then I should see schedule appointment popup
		When I enter <Patient> as appointment patient
		 And I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
#		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#				   * I click on proceed button to appointment
		Then I should see appointment success message

		Examples: 
			| Patient          | Reason    |
			| Dermo505, Mac505 | Back pain |

	@Smoke_USMM_Allergies
	Scenario Outline: Verify Creating Allergies- Blank
		Then I should see already scheduled appointment
		When I click on three dots
		 And I hover over on create soapnotes
		   * I click on blankSoapNote
		Then I should see soap note saved message
		   * I should see <Patient> as patient
		 And I select Source as:<Source>
		   * I enter <Encounter> as encountercode
		   * I verified billable checkbox as checked
		When I click on add Allergies plus button
		 And I enter <Allergy> as allergyCode
		   * I enter <Allergy_Start_Date> as allergy_StartDate
		   * I enter <Allergy_End_Date> as allergy_EndDate
		   * I click on saveclose button to save allergy
		   * I click on select existing allergies button
		   * I select the existing allergy checkbox
		   * I click on procced button
		   * I click on Save button to save SOAP NOTE
		Then I should see <Allergy> and <Allergy_Start_Date> and <Allergy_End_Date> as allergy data in soap note grid

		Examples: 
			| Allergy | Patient          | Allergy_Start_Date | Allergy_End_Date | Encounter | Source |
			|   10323 | Dermo505, Mac505 |           04162020 |         04162021 |     99344 | C4     |

	Scenario: Verify deleting Scheduled Appointment
		Then I should see already scheduled appointment
		When I click on three dots
		 And I click on delete appointment
		 And I should see delete appointment message
