Feature: Care Plan - Notes

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify Notes
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus notes button
		   * I should see notes popup
		   * I select privacy for save notes:<privacy>
		   * I select priority for save notes:<priority>
		   * I select type
		   * I <Enter_Notes> notes
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		* I should see current date of notes form

		Examples: 
			| Patient          | privacy | priority | Enter_Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
			| Dermo505, Mac505 | Private | Low      | Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. |
