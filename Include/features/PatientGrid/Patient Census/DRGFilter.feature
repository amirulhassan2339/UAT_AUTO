Feature: CM Status - Export - Care Coordination

	Background: 
		Given I navigate to patient census

	@Smoke_USMM
	Scenario Outline: Patient Census - DRG
		Scenario Outline: Applying Enc Program Type Filter
    When I click on patient census reset button
    And I enter <EncProgram> as encounter type
    And I click on patient census apply button
    Then I should see care cordination Encounter <EncProgram> filters

    Examples: 
      | EncProgram |
      | Inpatient      |
