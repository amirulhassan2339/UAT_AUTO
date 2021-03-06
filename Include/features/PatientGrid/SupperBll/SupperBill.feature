Feature: Supper Bill flows

  Background: 
    Given I navigate to patient grid With Supper Bill

@SmokeUSMM_SupperBill_DateRange
  Scenario Outline: Verify that patient soap notes are shown on superbill UI in particular date range
  When I click on Reset button to reset supper bill filters
  And I enter <DateOfService_FromDate> as date of service from date
  * I click on Apply button to apply supper bill filters
  Then I should see particualar patient data in <DateOfService_FromDate> as selected date
  
  Examples:
  | DateOfService_FromDate |
  |               12052020 |
  
  
  @SmokeUSMM_SupperBill_PracticeFacility
  Scenario Outline: Verify that patients are filtered from left filter against specific practice facility
  When I click on Reset button to reset supper bill filters
  And I enter <DateOfService_FromDate> as date of service from date
  * I enter <Practice> as practice
  * I click on Apply button to apply supper bill filters
  * I click on particular patient and expand
  Then I should see <Practice> particualar patient practice facility
  
  Examples:
  | DateOfService_FromDate | Practice |
  |               12012020 | VPA PC WEST ALLIS    |
  
  @SmokeUSMM_SupperBill_Status_Signed
  Scenario Outline: Verify that patients are filtered against the selected soap status signed
  When I click on schedule tab
  And I double click on screen to add appointment
  When I enter <Patient> as appointment patient
  And I enter <Reason> as appointment reason
  * I should see <Patient> as actual patient name
  * I drag chat list
  * I click create button to save appointment
  * I click on yes button
  #* I click on proceed button to appointment
  Then I should see appointment success message
  When I click on three dots
  * I hover over on create soapnotes
  * I click on based on patient medical record
  * I click on add HRA plus button
  * I enter <ThePatientUnderstands> as the patient understands
  * I enter <LocationOfVisit> as location of visit
  * I click on save button to save assessment
  Then I should see assessment saved successfully message
  * I click on cross icon to close the popup
  * I enter <Facility> to add signature for sign button
  * I select Rendering Provider
  When I click on Sign button to sign soapnotes
  * I click on Create Signature button
  * I set signature
  * I click on submit signature button
  Then I should see sign saved message
  When I click on close button
  * I navigate to supper bill tab
  * I select <Soap_Status> as Signed status from soap status
  * I click on Apply button to apply supper bill filters
  Then I should see <Soap_Status> signed as soap status
  
  Examples:
  | Patient          | Reason    | ThePatientUnderstands                                                             | LocationOfVisit | PCName | PC_PhoneNumber | PatientCareTeam_Notes                                                             | Temp | Pulse | Repeat_Pulse | Resp_Rate | Pulse_Ox | Repeat_Pulse_Ox | Constitutional       |Soap_Status|Facility|
  | Dermo505, Mac505 | Back pain | I am not assuming any responsibility for their care of providing direct treatment | Office          | Amir   |   032545235210 | I am not assuming any responsibility for their care of providing direct treatment |  102 |    50 |           60 |        20 |      100 |              85 | In no acute distress |Signed|VPA PC WEST ALLIS|
  
  @SmokeUSMM_SupperBill_Status_Incomplete
  Scenario Outline: Verify that patients are filtered against Billing status Incomplete
  
  When I select <Billing_Status> Billing status
  * I click on Apply button to apply supper bill filters
  Then I should see <Billing_Status> patient billing status as incomplete
  
  Examples:
  
  |Billing_Status|
  |Incomplete|
  
  @SmokeUSMM_SupperBill_PDFView_ParticularPatient
  Scenario Outline: Verify that on superbill UI User is able view soap note in PDF while selecting particular patient
    When I click on Reset button to reset supper bill filters
    * I select <Soap_Status> as Signed status from soap status
    * I click on Apply button to apply supper bill filters
    * I checked the patient checkbox
    * I click on Fax button
    Then I should see PDF file in Fax popup
  * I click on PDF file and Logout
  #* I click on close button to close PDF popup
  
  Examples:
  |Soap_Status|
  |Signed|
  
  #@SmokeUSMM_SupperBill_MRN
  #Scenario Outline: Verify that patient is filtered  by MRN 
  #When I click on Reset button to reset supper bill filters
  #And I enter <DateOfService_FromDate> as date of service from date
  #* I click on Apply button to apply supper bill filters
  #* I click on MRN arrow filters
  #* I hover over on filters option
  #* I enter <MRN> as MRN value
  #* I click on filter button
  #Then I should see filtered MRN in the table
  #
  #Examples:
  #| DateOfService_FromDate |MRN|
  #|               12012020 |PE05E6ECEF0E46443B887BA108B24D9049|
  #
  
  @SmokeUSMM_SupperBill_ScheduleAppointmentDelete
  Scenario: Verify deleting Scheduled Appointment
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
