Feature: Scheduled Left Filters flow

	Background: 
		Given I navigate to CMR_Schedule

@Schedule_LeftFilters_Status
	Scenario Outline: Verify Appoitnment Status Filters
		When I click on schedule left filters reset button
		 And I select Appt Status as:<ApptStatus>
		   * I click on schedule apply button
		   * I click on three dots
		   * I click on edit appointment button
		   * I click on current appointment
		Then I should see <ApptStatus> as apptStatus
		   * I click on cancel appointment button
		When I click on specific date
		Then I should see record is showing
		When I click on week button
		Then I should see record as per weekView
		When I click on month button
		Then I should see record as per monthView

		Examples: 
			| ApptStatus |  | Patient          | Reason    | VisitType  | CheckIn_Comment | CheckOut_Comment | CheckEdit_Comment |
			| Scheduled  |  | Dermo505, Mac505 | Back pain | Telehealth | Checking in     | Checking out     | Update            |

@Schedule_VerifyViewAppointment
	Scenario Outline: Verify View Appointment
		When I double click on screen to add appointment
		Then I should see schedule appointment popup
		When I enter <Patient> as appointment patient
		 And I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment success message
		When I click on three dots
		   * I click on edit appointment button
		Then I should see schedule UI status
		   * I click on cancel appointment button
		When I click on three dots
		 And I click on View Patient Record button
		   * I click on appointment tab
		Then I should see created appointment data is showing
		   * I click on logout button
		When I enter login credentials
		 And I navigate to CMR_Schedule
		   * I click on three dots
		   * I click on delete appointment
		Then I should see delete appointment message

		Examples: 
			| Patient          | Reason    | VisitType  |
			| Dermo505, Mac505 | Back pain | Telehealth |

@Schedule_AppointmentFiltersRetains
	Scenario Outline: Verify Appoitnment Filters retains
		When I click on schedule left filters reset button
		   * I Search <VisitType> as schedule visit type
		   * I Search <ApptProvider> as schedule appt provider
		   * I click on schedule apply button
		   * I click on logout button
		   * I enter login credentials
		   * I navigate to CMR_Schedule
		Then I should see <VisitType> and <ApptProvider> as ScheduleLeftFilters
		   * I should see default time
		   * I click on schedule left filters reset button

		Examples: 
			| ApptProvider | Patient          | VisitType  |
			| Amir, Hafiz  | Dermo505, Mac505 | Telehealth |

@Schedule_Status_Filters_CheckinOut
	Scenario Outline: Verify Appoitnment Status Filters
		When I double click on screen to add appointment
		Then I should see schedule appointment popup
		When I enter <Patient> as appointment patient
		 And I enter <Reason> as appointment reason
		   * I should see <Patient> as actual patient name
		   * I drag chat list
		   * I click create button to save appointment
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment success message
		When I click on three dots
		   * I click on checkIn button
		Then I should see checkIn title
		   * I should see <Patient> as actual patient name
		When I enter <CheckIn_Comment> as CheckInComment
		 And I click on appointment update button
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment updated message
		   * I click on schedule left filters reset button
		   * I select Appt Status as:<ApptStatus>
		   * I click on three dots
		When I click on check edit button
		Then I should see check edit title
		When I enter <CheckEdit_Comment> as CheckEditComment
		 And I click on appointment update button
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment updated message
		   * I click on three dots
		When I click on check out button
		Then I should see check out title
		When I enter <CheckOut_Comment> as CheckOutComment
		 And I click create button to save appointment
		   * I click on yes button
#		   * I click on proceed button to appointment
		Then I should see appointment updated message
		When I click on three dots
		 And I click on View Patient Record button
		   * I click on appointment tab
		   * I click on delete icon button to delete appointment

		Examples: 
			| ApptStatus |  | Patient          | Reason    | VisitType  | CheckIn_Comment | CheckOut_Comment | CheckEdit_Comment |
			| Checked-In |  | Dermo505, Mac505 | Back pain | Telehealth | Checking in     | Checking out     | Update            |

	@Schedule_AddBlock
	Scenario Outline: Verify Add Block By Adding
		When I click on Add Block button
		Then I should see add block title
		When I enter <BlockName> as blockname
		 And I enter <StartDate> as block_StartDate
		   * I enter <Time> as block_Time
		   * I enter <Comment> as block_comment
		   * I click on save block button
		Then I should see block successful save message
		When I click on three dots
		 And I click on delete block button

		Examples: 
			| BlockName | Time    | StartDate | Comment            |
			| Amir      | 1:30 AM |  01072021 | Adding block notes |
