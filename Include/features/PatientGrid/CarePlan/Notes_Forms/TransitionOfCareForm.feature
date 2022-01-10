Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	#	Scenario Outline: Verify Transition Of Care Form - Courtesy Calls
	#		When I search <Patient> using global search
	#		 And I click on notes tab
	#		   * I click on plus form
	#		   * I click on transition of care form
	#		   * I should see <Patient> as patient name in form popup
	#		   * I should see transition of care form title
	#		   * I enter <DateTime> as date of service date and time
	#		   * I select privacy:<privacy>
	#		   * I select priority:<priority>
	#		   * I enter <ProviderName> as Provider Name and Contact
	#		   * I select contact method:<ContactMethod>
	#		   * I select discussed with:<DiscussWith>
	#		   * I select Additional records reviewed through:<AdditionalRecords>
	#		   * I enter <NotifiedName> as notified name
	#		   * I enter <Title> as notifiedtitle
	#		   * I enter <DateTime> as notified date and time
	#		   * I enter <FaceToFaceName> as Non Face to Face Completed By
	#		   * I enter <Signature> as Non Face to Face Completed By signature
	#		   * I enter <DateTime> as Non Face to Face Completed By date and time
	#		   * I enter <Attempt1_DateTime> as attempt1
	#		   * I select attempt no one dropdown value
	#		   * I enter <HowAreYouFeeling> as how are you feeling since discharge
	#		   * I click on save button to save transition of care form data
	#		Then I should see record success message
	#
	#		Examples:
	#			| Patient          | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | Attempt2_DateTime | DischargeLocation | HowAreYouFeeling | AdditionalRecords |
	#			| Dermo505, Mac505 | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM |          04032020 |          05032020 | Much better..!!  | Hospital          |
	#	Scenario Outline: Verify Transition Of Care Form - ER Follow Up Calls
	#		When I search <Patient> using global search
	#		 And I click on notes tab
	#		   * I click on plus form
	#		   * I click on transition of care form
	#		   * I should see <Patient> as patient name in form popup
	#		   * I should see transition of care form title
	#		   * I select Transition outreach:<Outreach>
	#		   * I enter <DateTime> as date of service date and time
	#		   * I select privacy:<privacy>
	#		   * I select priority:<priority>
	#		   * I enter <ProviderName> as Provider Name and Contact
	#		   * I select contact method:<ContactMethod>
	#		   * I select discussed with:<DiscussWith>
	#		   * I select Additional records reviewed through:<AdditionalRecords>
	#		   * I enter <NotifiedName> as notified name
	#		   * I enter <Title> as notifiedtitle
	#		   * I enter <DateTime> as notified date and time
	#		   * I enter <FaceToFaceName> as Non Face to Face Completed By
	#		   * I enter <Signature> as Non Face to Face Completed By signature
	#		   * I enter <DateTime> as Non Face to Face Completed By date and time
	#		   * I enter <HowAreYouFeeling> as how are you feeling since discharge
	#		   * I enter <SymptomsLeadingToEmergency> as Symptoms leading to Emergency Room visit
	#		   * I enter <EmergencyRommTreatment> as Emergency Room Treatment received
	#		   * I click on save button to save transition of care form data
	#		Then I should see record success message
	#
	#		Examples:
	#			| Patient          | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | SymptomsLeadingToEmergency         | DischargeLocation | HowAreYouFeeling | AdditionalRecords | EmergencyRommTreatment   | Outreach           |
	#			| Dermo505, Mac505 | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM | Symptoms Leading To Emergency Text |          05032020 | Much better..!!  | Hospital          | Emergency Treatment Text | ER Follow Up Calls |
	#	Scenario Outline: Verify Transition Of Care Form - Hospital Discharge Calls
	#		When I search <Patient> using global search
	#		 And I click on notes tab
	#		   * I click on plus form
	#		   * I click on transition of care form
	#		   * I should see <Patient> as patient name in form popup
	#		   * I should see transition of care form title
	#		   * I select Transition outreach:<Outreach>
	#		   * I enter <DateTime> as date of service date and time
	#		   * I select privacy:<privacy>
	#		   * I select priority:<priority>
	#		   * I enter <ProviderName> as Provider Name and Contact
	#		   * I select contact method:<ContactMethod>
	#		   * I select discussed with:<DiscussWith>
	#		   * I select Additional records reviewed through:<AdditionalRecords>
	#		   * I enter <NotifiedName> as notified name
	#		   * I enter <Title> as notifiedtitle
	#		   * I enter <DateTime> as notified date and time
	#		   * I enter <FaceToFaceName> as Non Face to Face Completed By
	#		   * I enter <Signature> as Non Face to Face Completed By signature
	#		   * I enter <DateTime> as Non Face to Face Completed By date and time
	#		   * I enter <WhatLeadYouToBeing> as What lead you to being in the hospital
	#		   * I enter <HaveYourSymptomsImproved> as Have your symptoms improved worsened or stayed the same since returning home
	#		   * I click on save button to save transition of care form data
	#		Then I should see record success message
	#		Examples:
	#			| Patient          | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | WhatLeadYouToBeing          | DischargeLocation | HowAreYouFeeling | AdditionalRecords | HaveYourSymptomsImproved         | Outreach                 |
	#			| Dermo505, Mac505 | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM | What Lead You To Being Text |          05032020 | Much better..!!  | Hospital          | Have Your Symptoms Improved Text | Hospital Discharge Calls |
	#	Scenario Outline: Verify Transition Of Care Form - Surgical Follow Up Calls
	#		When I search <Patient> using global search
	#		 And I click on notes tab
	#		   * I click on plus form
	#		   * I click on transition of care form
	#		   * I should see <Patient> as patient name in form popup
	#		   * I should see transition of care form title
	#		   * I select Transition outreach:<Outreach>
	#		   * I enter <DateTime> as date of service date and time
	#		   * I select privacy:<privacy>
	#		   * I select priority:<priority>
	#		   * I enter <ProviderName> as Provider Name and Contact
	#		   * I select contact method:<ContactMethod>
	#		   * I select discussed with:<DiscussWith>
	#		   * I select Additional records reviewed through:<AdditionalRecords>
	#		   * I enter <NotifiedName> as notified name
	#		   * I enter <Title> as notifiedtitle
	#		   * I enter <DateTime> as notified date and time
	#		   * I enter <FaceToFaceName> as Non Face to Face Completed By
	#		   * I enter <Signature> as Non Face to Face Completed By signature
	#		   * I enter <DateTime> as Non Face to Face Completed By date and time
	#		   * I enter <TypeOfSurgery> as type of surgery
	#		   * I select In general how are you feeling after your surgery:<InGeneralHowAreYouFeeling>
	#		   * I click on save button to save transition of care form data
	#
	#		#		Then I should see record success message
	#		Examples:
	#			| Patient          | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | TypeOfSurgery | InGeneralHowAreYouFeeling | HowAreYouFeeling | AdditionalRecords | HaveYourSymptomsImproved         | Outreach                 |
	#			| Dermo505, Mac505 | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM | Surgery Text  |                  Good | Much better..!!  | Hospital          | Have Your Symptoms Improved Text | Surgical Follow Up Calls |
	Scenario Outline: Verify Transition Of Care Form - Edit
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on edit button where priority:<priority> and type:<type>
		   * I should see <Patient> as patient name in form popup
		   * I should see transition of care form title
		   * I select Transition outreach:<Outreach>
		   * I enter <DateTime> as date of service date and time
		   * I select privacy:<privacy>
		   * I select priority:<priority>
		#		   * I enter <ProviderName> as Provider Name and Contact
		#		   * I select contact method:<ContactMethod>
		#		   * I select discussed with:<DiscussWith>
		#		   * I select Additional records reviewed through:<AdditionalRecords>
		#		   * I enter <NotifiedName> as notified name
		#		   * I enter <Title> as notifiedtitle
		#		   * I enter <DateTime> as notified date and time
		#		   * I enter <FaceToFaceName> as Non Face to Face Completed By
		#		   * I enter <Signature> as Non Face to Face Completed By signature
		   * I enter <DateTime> as Non Face to Face Completed By date and time
		   * I enter <TypeOfSurgery> as type of surgery
		   * I select In general how are you feeling after your surgery:<InGeneralHowAreYouFeeling>
		   * I click on save button to save transition of care form data

		#		Then I should see record success message
		Examples: 
			| Patient          | DateTime          | DateOfDischarge | privacy | priority | ProviderName | ContactMethod | DiscussWith | NotifiedName  | Title            | FaceToFaceName | Signature | Attempt1_DateTime | TypeOfSurgery | InGeneralHowAreYouFeeling | HowAreYouFeeling | AdditionalRecords | HaveYourSymptomsImproved         | Outreach                 | type               |
			| Dermo505, Mac505 | 03152021 03:20 AM |        03152021 | Private | Low      | Amir         | PHONE         | Patient     | Mehmood Anjum | Transition Title | Zohaib         | amir      | 03152021 03:20 AM | Surgery Text  | Good                      | Much better..!!  | Hospital          | Have Your Symptoms Improved Text | Surgical Follow Up Calls | Transition of Care |
