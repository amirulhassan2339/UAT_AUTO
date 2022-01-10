@PatientGrid
Feature: Search Patient

	Background: 
		Given I navigate to patient grid

	@SearchByFirstNameANDlastName
	Scenario Outline: Search Patient Using First and Last Name From Patient Grid
		
		
		And I open <Patient> from the patient grid
		
		Examples:
		|Patient|
		|Dermo505, Mac505|