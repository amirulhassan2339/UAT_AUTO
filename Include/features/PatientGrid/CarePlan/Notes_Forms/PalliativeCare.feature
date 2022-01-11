Feature: Care Plan - Notes - Forms

	Background: 
		Given I navigate to patient grid

	Scenario Outline: Verify PalliativeCare
		When I search <Patient> using global search
		 And I click on notes tab
		   * I click on plus form
		   * I click on palliative care
		   * I should see <Patient> as patient name in form popup
		   * I should see palliative care form title
		   * I enter <DateTime> as date and time
		   * I enter <DateOfDischarge> as date of discharge
		   * I select payer
		   * I enter <PayerReferralDate> as Payer Referral Date
		   * I select patient type
		   * I select contracted patient
		   * I enter <HealthPlanCareManager> as health plan care manager
		   * I select referral source
		   * I select status
		   * I enter <Call1Date> as call date
		   * I enter <Comments> as palliative comments
		   * I click on save button to save patient data
		Then I should see success message for <module> record
		* I should see current date of notes form
		
		
#		 And I click on edit button where priority:<priority> and type:<type>
#		   * I should see <DateTime> as palliativeCare
#		   * I enter <Comments> as palliative comments
#		   * I click on save button to save patient data
#		When I click on analytics tab
#		   * I click on form option
#		   * I click on analytics reset button
#		   * I enter analytics from date
#		   * I select form type:<FormType>
#		   * I click on analytics apply button
#		   * I select the patient from analytics grid
#		Then I should see data in analytics
#
#		#		When I click on notes tab
#		#		 And I click on delete button where priority:<priority> and type:<type>
#		#		   * I select Delete from the confirmation box
#		#		Then I should see success message for <module> record
		Examples: 
			| Patient          | DateTime          | FormType        | module   | priority | type            | DateOfDischarge | PayerReferralDate | MedicareID | MedicaidID | MarketplaceID | InsuranceID | HealthPlanCareManager | PalliativeCareNursePractitioner | Diagnoses                         | NPPalliativeCareAssessmentDate | PalliativeCareStartDate | NP3rdVisitDate | MostrecentNPPalliativeCareVisitDate | AdvanceCarePlanningDate | IDGDate  | Date_of_Inpatient_admit_or_ER_visit_while_on_PalliativeCareservices_within_the_last30days | ChaplinReferralDate | ChaplinAssessmentDate | MostrecentChaplinVisitDate | SocialWorkReferralDate | SocialWorkAssessmentDate | MostRecentSocialWorkVisitDate | HospiceReferralDate | HospiceAdmitDate | HospiceCompany | Call1OutreachPlacedby | Call1Date | Comments                                                                   |
			| Dermo505, Mac505 | 03152021 03:20 AM | Palliative Care | adding | Low      | Palliative Care |        03152021 |          12032021 |         12 |         15 |            20 |          30 | Mehmood Anjum         | yet, another                    | Cholera due to Vibrio cholerae 01 |                       01032020 |                05032021 |       04032020 |                            05032020 |                06032020 | 07032020 |                                                                                  08032020 |            05022020 |              06022020 |                   07022020 |               08022020 |                 09022020 |                      01022020 |            02022020 |         03022021 | Soliton        | Amir                  |  02092020 | Lorem Ipsum is simply dummy text of the printing and typesetting industry. |

			
#			Dermo505, Mac505