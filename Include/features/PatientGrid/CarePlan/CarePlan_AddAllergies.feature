Feature: Care Plan - ADD Allergies

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify That User Is Able To Add Allergies
		When I search <Patient> using global search
		 And I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   * I hover over on allergies
		   * I click on allergies plus button
		   * I select allergyType as:<AllergySubstances>
		   * I enter <AllergyCode> as allergycode
		   * I enter <StartDate> as allergyStartDate
		   * I click on updated button
		   * I enter title <Title>
		   * I click on save and close button
		   * I click on title from care plan grid
	  Then I should see patient <Patient> as patient_name
#		Then I should see <AllergySubstances> and <AllergyCode> and <StartDate> as updated allergies

		Examples: 
			| Patient          | AllergyCode | SucessMessage                           | AllergySubstances    | StartDate | Title           |
			| Dermo505, Mac505 |   293586001 | successCare Plan Saved SuccessfullyHide | Allergy to substance |  12012020 | Known Allergies |
