Feature: Care Plan - ADD Medication

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify That User Is Able To Add Medication As Per EHR
		When I search <Patient> using global search
		 And I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   * I hover over on medication as per EHR
		   * I click on medication as per EHR plus button
		   * I enter <MedicationCode> as medication as per EHR Code
		   * I enter <StartDate> as medication as per EHR
		   * I click on updated button
		   * I enter title <Title>
		   * I click on save and close button
		   * I click on title from care plan grid
		   Then I should see patient <Patient> as patient_name
#		Then I should see <MedicationCode> and <StartDate> as updated medication as PerEHR

		Examples: 
			| Patient          | MedicationCode       | SucessMessage                           | StartDate | Title   |
			| Dermo505, Mac505 | 99 | successCare Plan Saved SuccessfullyHide |  12012020 | Medication as per EHR |
