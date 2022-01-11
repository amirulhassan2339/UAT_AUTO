Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify SNF Waiver
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on SNF Waiver
		   * I should see <Patient> as patient name in form popup
		   * I should see SNFWaiver care form title
		   * I enter SNF <DateTime> as datetime
		   * I enter SNF <AprimaID> as aprima id
		   * I select SNF referral source
		   * I enter SNF <ReferralSourceDate> as referral source date
		   * I select nurse navigator
		   * I enter SNF <ReferralName> as referral name
		   * I select VPA office location
		   * I click patient attribute to ACO
		   * I select patient attribute to ACO
		   * I select patient status
		   * I enter SNF <LastSeenByVPAProvider> as last seen by VPA provider
		   * I select patient patient attributeIAH
		   * I enter SNF <Comments> as SNF comments
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		* I should see current date of notes form
		
#		Then I should see record success message

#		When I click on notes tab
#		 And I click on edit button where priority:<priority> and type:<type>
#		   * I should see <DateTime> as SNFWaiver
#		   * I click on save button to save patient data
#		   
#		When I click on analytics tab
#		   * I click on form option
#		   * I click on analytics reset button
#		   * I enter analytics from date
#		   * I select form type:<FormType>
#		   * I click on analytics apply button
#		   * I should see SNF Waiver data

		#* I click on edit button of forms
		#		   * I should see <Patient> as patient name in form popup
		#		   * I should see <DateTime> as courtesy date of service
		#		   * I click on save button to save transition of care form data
		#		   * I click on delete button to delete form
		#		Then I select Delete from the confirmation box
		Examples: 
			| Patient          | FormType   | DateTime          | priority | type       | AprimaID | ReferralSourceDate | ReferralName | LastSeenByVPAProvider | AdmissionDate | Facility | EstimatedLOS | DischargeDate | module | Comments                                                                   |
			| Dermo505, Mac505 | SNF Waiver | 03152021 03:20 AM | Low      | SNF Waiver |      122 |           12022020 | Ali          |              12022020 |      12202021 | MHPN     |           10 |      15092020 |        adding | Lorem Ipsum is simply dummy text of the printing and typesetting industry. |
