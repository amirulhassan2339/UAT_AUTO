Feature: Soap Note Creation from Schedule flow

	Background: 
		Given I navigate to CMR_Schedule

	@SmokeUSMM_SignInBTNFunction
	Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
		Then I should see already scheduled appointment
		When I click on three dots
		 And I click on edit soapnotes
		   * I click on add HRA plus button
		   * I enter <ThePatientUnderstands> as the patient understands
		   * I enter <LocationOfVisit> as location of visit
		   * I enter <PCName> as pc name
		   * I enter <PC_PhoneNumber> as pc phone number
		   * I enter <PatientCareTeam_Notes> as patient care team
		   * I click on Review Of System Tab
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
		When I click on add Lab Results plus button
		 And I enter <LabResults> as lab results in search and select analyte
		   * I click on lab resutls OK button
		Then I should see Lab Resultss data in soap note popup
		When I click on Billing Information Edit button
		 And I click on Add button to billing info
		   * I enter <BillingInformation> as billing information procedure
		   * I click on billing information OK button
		   * I click on SaveClose button to save billing information
		Then I should see Billing Information data in soap note popup
		   * I enter <Facility> to add signature for sign button
		   * I select Rendering Provider
		When I click on Sign button to sign soapnotes
		   * I click on Create Signature button
		   * I set signature
		   * I click on submit signature button
		Then I should see sign saved message
		   * I should see signature sign

		Examples: 
			| Patient          | Reason    | ThePatientUnderstands                                                             | LocationOfVisit | PCName | PC_PhoneNumber | PatientCareTeam_Notes                                                             | Temp | Pulse | Repeat_Pulse | Resp_Rate | Pulse_Ox | Repeat_Pulse_Ox | Constitutional       | MedicationCode | Medication_Route | Medication_Start_Date | Medication_Reason       | Medication_DispensedQuantity | ProblemsCode      | Problems_Start_Date | LabResults | BillingInformation | Facility |
			| Dermo505, Mac505 | Back pain | I am not assuming any responsibility for their care of providing direct treatment | Office          | Amir   |   032545235210 | I am not assuming any responsibility for their care of providing direct treatment |  102 |    50 |           60 |        20 |      100 |              85 | In no acute distress | Lipitor Oral   | buccal           |              04162021 | burns of multiple sites |                            2 | diabetes mellitus |            04162021 | A1C        |              99203 | MHPN3    |

#	Scenario: Verify deleting Scheduled Appointment
#		When I click on schedule tab
#		Then I should see already scheduled appointment
#		When I click on three dots
#		 And I click on delete appointment
#		 And I should see delete appointment message
