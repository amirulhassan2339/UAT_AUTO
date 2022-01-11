Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

@CareManagementForm
	Scenario Outline: Add Care Management Form
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on Care Management Form
		   * I should see <Patient> as patient name in form popup
		   * I should see Care Management form title
		   * I enter <DateTime> in care management form
		   * I select privacy:<privacy>
		   * I select priority:<priority>
		   * I enter provider name:<name>
		   * I select outreach:<outreach>
		   * I enter duration of patient contact:<time>
		   * I enter the name with whom assessment interaction was completed with:<name>
		   * I select whether the participants are in agreement with the plan
		   * I select whether the medication reconciliation is completed
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		* I should see current date of notes form

		Examples: 
			| Patient        | DateTime          | privacy | priority | outreach        | time   | name   | module |
			| Dermo505, Mac505 | 03152021 03:20 AM | Private | Low      | Initial Contact | 15 min | Doctor | adding |

#	Scenario Outline: Edit Care Management Form
#		When I search <Patient> using global search
#		 And I click on notes tab
#		Then I click on edit button where priority:<priority> and type:<type>
#		   * I should see <Patient> as patient name in form popup
#		   * I should see <DateTime> in care management form
#		   * I click on save button to save patient data
#		Then I should see success message for <module> record
#
#		Examples: 
#			| Patient        | DateTime          | privacy | priority | outreach        | time   | name   | module | type                 |
#			| Dermo505, Mac505 | 03152021 03:20 AM | Private | Low      | Initial Contact | 15 min | Doctor | adding | Care Management Form |
#
#	Scenario Outline: Delete Care Management Form
#		When I search <Patient> using global search
#		 And I click on notes tab
#		Then I click on delete button where priority:<priority> and type:<type>
#		Then I select Delete from the confirmation box
#		Then I should see success message for <module> record
#
#		Examples: 
#			| Patient        | DateTime          | privacy | priority | outreach        | time   | name   | module   | type                 | dynamicid                    | message                                 |
#			| Dermo505, Mac505 | 03152021 03:20 AM | Private | Low      | Initial Contact | 15 min | Doctor | deleting | Care Management Form | Record deleted successfully! | successRecord deleted successfully!Hide |
