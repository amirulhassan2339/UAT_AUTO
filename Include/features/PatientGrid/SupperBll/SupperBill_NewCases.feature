Feature: Supper Bill flows

	Background: 
		Given I navigate to CMR_Schedule

	@SmokeUSMM_SupperBill_NewCases
	Scenario Outline: Verify that patients are filtered against the selected soap status signed
		When I double click on screen to add appointment
		 And I enter <Patient> as appointment patient
		   * I enter <Reason> as appointment reason
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
		   * I click on proceed button to appointment
		   * I click on three dots
		   * I hover over on create soapnotes
		   * I click on based on patient medical record
		   * I click on add diagnosis plus button
		   * I enter <Diagnosis> as diagnosis
		   * I click on diagnosisSave button
		   * I enter <Facility> to add signature for sign button
		   * I select Rendering Provider
		   * I click on Sign button to sign soapnotes
		   * I click on Create Signature button
		   * I set signature
		   * I click on submit signature button
		   * I click on close button
		   * I navigate to supper bill tab
		   * I click on Reset button to reset supper bill filters
		   * I select <Soap_Status> as Signed status from soap status
		   * I click on Apply button to apply supper bill filters
		   * I open Patient using <MRN> on superbill screen
		Then I should see <MRN> on superbill grid
		When I click on particular patient and expandPatient
		   * I click on super bill edit button
		   * I click on diagnosisSaveClose button
		Then I should see <Diagnosis> as diagnosis data in superbill grid
		   * I should see Non_Billable button is visible on superbill screen
		When I click on Non billable superbill button
		   * I click on yes non billable button
		Then I should see success message <SucessMessage> of non billable
		   * I should see Non billable status in grid
		When I click on particular patient and expandPatient
		Then I should not see edit and complete buttons
		When I click on schedule tab
		   * I navigate to supper bill tab
		When I select <Billing_Status> as Billing status from leftFilters
		   * I click on Apply button to apply supper bill filters
		Then I should see <Billing_Status> NonBillable as billing status
		When I click on particular patient and expandPatient
		   * I click on revert to incomplete button
		   * I click on yes non billable button
		Then I should see success message <RevertedSucessMessage> of reverted
		   * I click on Reset button to reset supper bill filters
		 And I enter <DateOfService_FromDate> as date of service from date
		   * I enter <Practice> as practice
		   * I select <Soap_Status> as Signed status from soap status
		#		When I select <Billing_Status2> as Billing status from leftFilterss
		   * I click on Apply button to apply supper bill filters
		   * I click on particular patient and expandPatient
		Then I should see <Practice> particualar patient practice facility
		When I click on schedule tab
		   * I navigate to supper bill tab
		   * I click on Reset button to reset supper bill filters
		   * I select <Soap_Status> as Signed status from soap status
		   * I click on Apply button to apply supper bill filters
		   * I checked the patient checkboxs
		   * I click on Fax button
		Then I should see PDF file in Fax popup
		   * I click on PDF file and Logout

		Examples: 
			| Patient          | Reason    | Soap_Status | Facility | Diagnosis                                                 | MRN           | SucessMessage                                   | Billing_Status | Billing_Status2 | RevertedSucessMessage                            | Soap_Status | DateOfService_FromDate | Practice |
			| Dermo505, Mac505 | Back pain | Signed      | MHPN3    | Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0 | EntMerging505 | successBilling Status updated successfully!Hide | Non-Billable   | incomplete      | successBilling status reverted successfully!Hide | Signed      |               12012020 | MHPN3    |

	@SmokeUSMM_SupperBill_ScheduleAppointmentDelete
	Scenario: Verify deleting Scheduled Appointment
		When I click on schedule tab
		Then I should see already scheduled appointment
		When I click on three dots
		 And I click on delete appointment
		 And I should see delete appointment message
