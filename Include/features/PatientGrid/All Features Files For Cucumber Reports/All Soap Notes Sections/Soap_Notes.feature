Feature: Soap Note Creation from Schedule flow

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM_CreateScheduleAppointment
  Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
    When I click on schedule tab
    And I double click on screen to add appointment
    Then I should see schedule appointment popup
    When I enter <Patient> as appointment patient
    And I enter <Reason> as appointment reason
    * I should see <Patient> as actual patient name
    * I drag chat list
    * I click create button to save appointment
    * I click on yes button
    * I click on proceed button to appointment
    Then I should see appointment success message

    Examples: 
      | Patient   | Reason    |
      | ADam, Tom | Back pain |

  @Smoke_USMM_CreateBillingInformation
  Scenario Outline: Verify Creating Billing Information  - Based On Patient's Medical Record
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    * I hover over on create soapnotes
    * I click on based on patient medical record
    Then I should see <Patient> as patient
    When I click on Billing Information Edit button
    And I click on Add button to billing info
    * I enter <BillingInformation> as billing information procedure
    * I click on billing information OK button
    * I click on SaveClose button to save billing information
    Then I should see Billing Information data in soap note popup
    When I click on Save button to save SOAP NOTE
    Then I should see soap note saved message
    When I click on SaveClose button to save SOAP NOTE
    Then I should see soap note saved message
    When I click on three dots
    Then I should see Edit Soap Note option
    * I should see Billing Information data in soap note popup

    Examples: 
      | BillingInformation | Patient   |
      |              99203 | ADam, Tom |

  @Smoke_USMM_VerifyPatientData
  Scenario Outline: Verify That Patient Data Are Showing
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit soapnotes
    Then I should see <Patient> as patient

    Examples: 
      | Patient   |
      | ADam, Tom |

  @Smoke_USMM_HRATabsVerifications
  Scenario Outline: Verify That While Clicking HRA - Three Tabs Are Showing
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit soapnotes
    Then I should see <Patient> as actual patient name
    When I click on add HRA plus button
    Then I should see HRA popup with all tabs
      | Patient   |
      | ADam, Tom |

  @Smoke_USMM_CreateLabResults
  Scenario Outline: Verify Creating Lab Results - Based On Patient's Medical Record
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    #* I hover over on create soapnotes
    #* I click on based on patient medical record
    * I click on edit soapnotes
    Then I should see <Patient> as patient
    When I click on add Lab Results plus button
    And I enter <LabResults> as lab results in search and select analyte
    * I click on lab resutls OK button
    Then I should see Lab Resultss data in soap note popup
    When I click on Save button to save SOAP NOTE
    Then I should see soap note saved message
    When I click on SaveClose button to save SOAP NOTE
    Then I should see soap note saved message
    When I click on three dots
    Then I should see Edit Soap Note option

    #    * I should see Lab Resultss data in soap note popup
    Examples: 
      | LabResults | Patient   |
      | A1C        | ADam, Tom |

  @Smoke_USMM_CreateMedications
  Scenario Outline: Verify Creating Medication - Based On Patient's Medical Record
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit soapnotes
    Then I should see <Patient> as patient
    When I click on add Medication plus button
    And I enter <MedicationCode> as the medication code
    * I enter <Medication_Route> as medication route
    * I enter <Medication_Start_Date> as start date
    * I enter <Medication_Reason> as medication reason
    * I enter <Medication_DispensedQuantity> as medication despensed quantity
    * I click on saveclose button to save medications
    Then I should see medications data in soap note popup

    Examples: 
      | MedicationCode | Medication_Route | Medication_Start_Date | Medication_Reason       | Medication_DispensedQuantity | Patient   |
      | Lipitor Oral   | buccal           |              04162021 | burns of multiple sites |                            2 | ADam, Tom |

  @Smoke_USMM_CreatingProblems
  Scenario Outline: Verify Creating Problems - Based On Patient's Medical Record
    When I click on schedule tab
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
    Then I should see soap note saved message
    When I click on three dots
    Then I should see Edit Soap Note option
    * I should see problems data in soap note popup

    Examples: 
      | ProblemsCode      | Problems_Start_Date | Patient   |
      | diabetes mellitus |            04162021 | ADam, Tom |

  @Smoke_USMM_CreateSN
  Scenario Outline: Verify Creating Soap Notes - Based On Patient's Medical Record
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit soapnotes
    * I click on add HRA plus button
    * I enter <ThePatientUnderstands> as the patient understands
    * I enter <LocationOfVisit> as location of visit
    * I enter <PCName> as pc name
    * I enter <PC_PhoneNumber> as pc phone number
    * I enter <PatientCareTeam_Notes> as patient care team
    #    * I select date when end of life
    * I click on Review Of System Tab
    * I enter <Temp> as temprature
    * I enter <Pulse> as pulse
    * I enter <Repeat_Pulse> as repeat pulse
    * I enter <Resp_Rate> as resp rate
    * I enter <Pulse_Ox> as pulse ox
    * I enter <Repeat_Pulse_Ox> as repeat pulse ox
    * I select Have you ever been told you have problems with sight
    * I select Do you have any of the following diagnosis
    * I select Diagnosis
    * I click on Exam and Recomendation Tab
    * I enter <Constitutional> as constitutional
    * I click on save button to save assessment
    Then I should see assessment saved successfully message
    * I click on cross icon to close the popup
    * I should see added assessment data in soap note popup
    * I should see Diagnosis entered data

    Examples: 
      | ThePatientUnderstands                                                             | LocationOfVisit | PCName | PC_PhoneNumber | PatientCareTeam_Notes                                                             | Temp | Pulse | Repeat_Pulse | Resp_Rate | Pulse_Ox | Repeat_Pulse_Ox | Constitutional       |
      | I am not assuming any responsibility for their care of providing direct treatment | Office          | Amir   |   032545235210 | I am not assuming any responsibility for their care of providing direct treatment |  102 |    50 |           60 |        20 |      100 |              85 | In no acute distress |

  @SmokeUSMM_SignInBTNFunction
  Scenario: Verify Creating Sign Button Turns into SINGED
    When I click on schedule tab
    * I click on three dots
    * I click on edit soapnotes
    * I select Rendering Provider
    When I click on Sign button to sign soapnotes
    * I click on Create Signature button
    * I set signature
    * I click on submit signature button
    Then I should see sign saved message
    * I should see signature sign

  @Smoke_USMM_DelateScheduleAppointment
  Scenario: Verify deleting Scheduled Appointment
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
