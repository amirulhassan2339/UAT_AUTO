Feature: LOB and LOBType- PWFB - Based On Patient Medical Record

	Background: 
		Given I navigate to patient grid

	@Smoke_USMM
	Scenario Outline: Verify LOB & LOB Type - Based On Patient Medical Record
		When I search <Patient> using global search
		Then I am on PWB
		   * I click on care plan tab
		   * I click on add new care plan button
		   * I click on basedonpatientmedicalrecord
		   Then I should see patient <Patient> as patient_name
		   * I should see patient with LOB and LOBType

		Examples: 
			| Patient            |
			| Cameroon, Cameroon |
