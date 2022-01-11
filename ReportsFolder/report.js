$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/Schedule_Module.feature");
formatter.feature({
  "name": "Scheduled Left Filters flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Visit Type Filters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_VerifyVisitTypeFilter"
    }
  ]
});
formatter.step({
  "name": "I click on schedule left filters reset button",
  "keyword": "When "
});
formatter.step({
  "name": "I Search \u003cVisitType\u003e as schedule visit type",
  "keyword": "* "
});
formatter.step({
  "name": "I click on schedule apply button",
  "keyword": "* "
});
formatter.step({
  "name": "I hover over the created appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I should see \u003cVisitType\u003e as VisitType",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "VisitType"
      ]
    },
    {
      "cells": [
        "Telehealth"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to CMR_Schedule",
  "keyword": "Given "
});
formatter.match({
  "location": "SD_PatientGrid_ScheduleTab.I_navigate_to_patient_grid_Schedule()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Visit Type Filters",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_VerifyVisitTypeFilter"
    }
  ]
});
formatter.step({
  "name": "I click on schedule left filters reset button",
  "keyword": "When "
});
formatter.match({
  "location": "SD_Schedule.I_click_on_reset_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Search Telehealth as schedule visit type",
  "keyword": "* "
});
formatter.match({
  "location": "SD_Schedule.I_Search_VisitType_Schedule(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on schedule apply button",
  "keyword": "* "
});
formatter.match({
  "location": "SD_Schedule.I_click_on_schedule_apply_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hover over the created appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SD_Schedule.I_hover_over_on_Appointment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Telehealth as VisitType",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_Schedule.I_should_see_appointment_Data(String)"
});
