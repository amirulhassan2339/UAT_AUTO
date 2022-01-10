Feature: Care Plan - BOPMR

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Based On Patient Medical Report
    When I search <Patient> using global search
    Then I am on PWB with <Patient>
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    Then I should see patient <Patient> as patient_name
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP

    Examples: 
      | Patient          | Title          | SucessMessage                           |
      | BABCOX, MICHAEL | TestingPatient | successCare Plan Saved SuccessfullyHide |
      
   