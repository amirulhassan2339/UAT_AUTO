$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/CarePlan/Blank.feature");
formatter.feature({
  "name": "Care Plan - Blank",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Blank"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify WIP status function using save \u0026 close button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_WIPSaveCloseBtn_Blank"
    }
  ]
});
formatter.step({
  "name": "I search \u003cPatient\u003e using global search",
  "keyword": "When "
});
formatter.step({
  "name": "I am on PWB with \u003cPatient\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on care plan tab",
  "keyword": "And "
});
formatter.step({
  "name": "I click on add new care plan button",
  "keyword": "And "
});
formatter.step({
  "name": "I click on blank",
  "keyword": "And "
});
formatter.step({
  "name": "I should see patient \u003cPatient\u003e as patient_name",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see intial status as \u003cNew Status\u003e on CP header",
  "keyword": "And "
});
formatter.step({
  "name": "I enter title \u003cTitle\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on save and close button",
  "keyword": "And "
});
formatter.step({
  "name": "I should see success message \u003cSucessMessage\u003e of CP",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on title from care plan grid",
  "keyword": "When "
});
formatter.step({
  "name": "I should see patient \u003cPatient\u003e as patient_name",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see patient data of WIP status",
  "keyword": "And "
});
formatter.step({
  "name": "I should see progress status as \u003cWIP Status\u003e on CP header",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Patient",
        "Title",
        "New Status",
        "WIP Status",
        "SucessMessage"
      ]
    },
    {
      "cells": [
        "BABCOX, MICHAEL",
        "WIPPatient",
        "New",
        "WIP",
        "successCare Plan Saved SuccessfullyHide"
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
  "name": "I navigate to patient grid",
  "keyword": "Given "
});
formatter.match({
  "location": "SD_PatientGrid.I_navigate_to_patient_grid()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify WIP status function using save \u0026 close button",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Blank"
    },
    {
      "name": "@SmokeUSMM_WIPSaveCloseBtn_Blank"
    }
  ]
});
formatter.step({
  "name": "I search BABCOX, MICHAEL using global search",
  "keyword": "When "
});
formatter.match({
  "location": "SD_SearchPatient.search_Patient(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on PWB with BABCOX, MICHAEL",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click on care plan tab",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.click_On_Care_Plan_Tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on add new care plan button",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.click_On_Add_New_Care_Plan_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on blank",
  "keyword": "And "
});
formatter.match({
  "location": "SD_Blank.I_click_on_blank()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see patient BABCOX, MICHAEL as patient_name",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_BOPMR.verify_Patient_Data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see intial status as New on CP header",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.I_should_see_intial_status_as_on_CP_header(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter title WIPPatient",
  "keyword": "When "
});
formatter.match({
  "location": "SD_BOPMR.user_Enter_Title_TestingPatient(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on save and close button",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.click_On_SaveClose_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see success message successCare Plan Saved SuccessfullyHide of CP",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_BOPMR.Close_and_Verify_Alert_Message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on title from care plan grid",
  "keyword": "When "
});
formatter.match({
  "location": "SD_BOPMR.I_click_on_title_from_care_plan_grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see patient BABCOX, MICHAEL as patient_name",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_BOPMR.verify_Patient_Data(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see patient data of WIP status",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.I_should_see_patient_data_of_WIP_status()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see progress status as WIP on CP header",
  "keyword": "And "
});
formatter.match({
  "location": "SD_BOPMR.I_should_see_WIPprogress_status_as_on_CP_header(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});