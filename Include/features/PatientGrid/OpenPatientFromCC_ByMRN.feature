@PatientGrid
Feature: Search Patient

	Background: 
		Given I navigate to patient grid

	@SearchByFirstNameANDlastName
	Scenario Outline: Search Patient Using First and Last Name From Patient Grid
		When I click on care cordination
		* I open Patient using <MRN> on care coordination screen

		Examples:
		|MRN|
		|EleanorLincoln|