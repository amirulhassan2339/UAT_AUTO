$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/SoapNote/SoapNotes_AddLabResutls.feature");
formatter.feature({
  "name": "Soap Note Creation from Schedule flow",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Creating Lab Results - Based On Patient\u0027s Medical Record",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke_USMM_CreateLabResults"
    }
  ]
});
formatter.step({
  "name": "I should see already scheduled appointment",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on three dots",
  "keyword": "When "
});
formatter.step({
  "name": "I click on edit soapnotes",
  "keyword": "* "
});
formatter.step({
  "name": "I click on add Lab Results plus button",
  "keyword": "* "
});
formatter.step({
  "name": "I enter \u003cLabResults\u003e as lab results in search and select analyte",
  "keyword": "And "
});
formatter.step({
  "name": "I click on lab resutls OK button",
  "keyword": "* "
});
formatter.step({
  "name": "I should see Lab Resultss data in soap note popup",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Save button to save SOAP NOTE",
  "keyword": "When "
});
formatter.step({
  "name": "I should see soap note saved message",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on SaveAll button to save Lab Results",
  "keyword": "When "
});
formatter.step({
  "name": "I click on SaveClose button to save SOAP NOTE",
  "keyword": "* "
});
formatter.step({
  "name": "I should see soap note saved message",
  "keyword": "And "
});
formatter.step({
  "name": "I click on three dots",
  "keyword": "* "
});
formatter.step({
  "name": "I should see Edit Soap Note option",
  "keyword": "* "
});
formatter.step({
  "name": "I should see Lab Resultss data in soap note popup",
  "keyword": "* "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "LabResults",
        "Patient"
      ]
    },
    {
      "cells": [
        "A1C",
        "Dermo505, Mac505"
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
