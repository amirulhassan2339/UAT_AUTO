Feature: Soap Note Creation from Schedule flow

  Background: 
    Given I navigate to CMR_Schedule


  Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
    And I double click on screen to add appointment
    Then I should see schedule appointment popup
    When I enter <Patient> as appointment patient
    And I enter <Reason> as appointment reason
    * I should see <Patient> as actual patient name
    * I drag chat list
    * I click create button to save appointment
    * I click on yes button
    #* I click on proceed button to appointment
    Then I should see appointment success message

    Examples: 
      | Patient          | Reason    |
      | Dermo505, Mac505 | Back pain |

  @Smoke_USMM_CreatingProblems

  Scenario Outline: Verify Creating Problems - Based On Patient's Medical Record
    Then I should see already scheduled appointment
    When I click on three dots
    #* I hover over on create soapnotes
    #* I click on based on patient medical record
    * I click on edit soapnotes
    Then I should see <Patient> as patient
    When I click on add Problems plus button
    And I enter <ProblemsCode> as the problems code
    * I enter <Problems_Start_Date> as problems start date
    * I click on saveclose button to save problems
    Then I should see problems data in soap note popup
    When I click on Save button to save SOAP NOTE
    Then I should see soap note saved message
    When I click on SaveClose button to save SOAP NOTE
    And I click on three dots 
    * I should see Edit Soap Note option
    Then I should see problems data in soap note popup 


    Examples: 
      | ProblemsCode      | Problems_Start_Date | Patient          |
      | diabetes mellitus |            04162021 |Dermo505, Mac505|
      


  Scenario: Verify deleting Scheduled Appointment
    Then I should see already scheduled appointment    
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
