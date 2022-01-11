Feature: Care Plan - Export While WIP Status

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify Export function while WIP status
    When I search <Patient> using global search
    * I click on care plan tab
    * I click on add new care plan button
    * I click on basedonpatientmedicalrecord
    * I enter title <Title>
    * I click on save button
    * I should see export button and click
    Then I should see exported file with <Title> as name

    Examples: 
      | Patient          | Title      | New Status | WIP Status | SucessMessage                           |
      | Dermo505, Mac505 | ExportFile | New        | WIP        | successCare Plan Saved SuccessfullyHide |
