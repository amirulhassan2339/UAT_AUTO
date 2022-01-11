Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Telephonic Outreach
		When I search <Patient> using global search
		 And I click on notes tab
		   * I verify that the record exists in the notes section having date:<date>,Note Type:<type>,username:<username> and priority:<priority>

		Examples: 
			| Patient        | date                | type                | priority | username    |
			| Powell, Powell | 09/30/2021 10:05 AM | Telephonic Outreach | High     | Amir, Hafiz |

	Scenario Outline: Verify PalliativeCare
		When I search <Patient> using global search
		 And I click on notes tab
		   * I verify that the record exists in the notes section having date:<date>,Note Type:<type>,username:<username> and priority:<priority>

		Examples: 
			| Patient        | date                | type            | priority | username    |
			| Powell, Powell | 09/30/2021 10:05 AM | Palliative Care | Medium   | Amir, Hafiz |

	Scenario Outline: Verify SNF Waiver
		When I search <Patient> using global search
		 And I click on notes tab
		   * I verify that the record exists in the notes section having date:<date>,Note Type:<type>,username:<username> and priority:<priority>

		Examples: 
			| Patient        | date                | type       | priority | username    |
			| Powell, Powell | 09/30/2021 10:05 AM | SNF Waiver | Low      | Amir, Hafiz |
