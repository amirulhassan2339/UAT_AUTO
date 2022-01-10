@PatientGrid
Feature: Search Patient

	Background: 
		Given I navigate to patient grid

	@SearchByFirstNameANDlastName
	Scenario Outline: Search Patient Using First and Last Name From Patient Grid
		When I search <Patient> using global search
		Then I should see <Patient_Name> as patient Name

		Examples: 
			| Patient          | Patient_Name     | MRN                                | DOB        | Patient_Status |
			| Dermo505, Mac505 | Dermo505, Mac505 | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
			| Mac505           | Dermo505, Mac505 | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
			| Mac505 Dermo505  | Dermo505, Mac505 | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
			| Dermo505         | Dermo505, Mac505 | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
			| EntMerging505    | Dermo505, Mac505 | PE05E6ECEF0E46443B887BA108B24D9049 | 02/02/2000 | Active         |
  