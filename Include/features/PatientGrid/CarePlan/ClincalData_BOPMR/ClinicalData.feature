Feature: Care Plan - Clinical Data - Based On Patient Medical Record

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify Clinical Data i.e. Problems, Medications, Known Elergies & Care Gabs
		When I search <Patient> using global search
		   * I click on Clinical tab
		   * I click on Problem List	tab
		   * I click on problem Add button
		   * I enter <Code_Name> in problem name field
		   * I enter <Start_Date> in problem start date field
		   * I click on problem Save All button
		When I click on Medication	tab
		   * I click on medication Add button
		   * I enter <Name> in medication name field
		   * I enter <Start_Date> in medication start date field
		   * I click on medication Save All button
		When I click on Allergies tab
		   * I click on allergies Add button
		   * I enter <Type> in allergies type field
		   * I enter <Source> in allergies source field
		   * I enter <Allergy> in allergies allergy field
		   * I enter <Start_Date> in allergies start date field
		   * I click on allergies Update button
		   * I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		Then I should see all clinical data <Code_Name> and <Name> and <Allergy> with <Start_Date> in care plan

		Examples: 
			| Patient          | Code_Name                   | Start_Date | Name            | Type                 | Source | Allergy    |
			| Dermo505, Mac505 | Cholera, unspecified::A00.9 |   01072021 | ABC to Z::10287 | Allergy to substance | SNOMED | oxitropium |
