$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/CarePlan/SaveNotes.feature");
formatter.feature({
  "name": "Care Plan - Notes",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Notes",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I search \u003cPatient\u003e using global search",
  "keyword": "When "
});
formatter.step({
  "name": "I click on notes tab",
  "keyword": "And "
});
formatter.step({
  "name": "I click on plus notes button",
  "keyword": "* "
});
formatter.step({
  "name": "I should see notes popup",
  "keyword": "* "
});
formatter.step({
  "name": "I select privacy",
  "keyword": "When "
});
formatter.step({
  "name": "I select priority",
  "keyword": "* "
});
formatter.step({
  "name": "I select type",
  "keyword": "* "
});
formatter.step({
  "name": "I \u003cEnter_Notes\u003e notes",
  "keyword": "* "
});
formatter.step({
  "name": "I click on save btn",
  "keyword": "* "
});
formatter.step({
  "name": "I should see newly added note",
  "keyword": "* "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Patient",
        "Enter_Notes"
      ]
    },
    {
      "cells": [
        "BABCOX, MICHAEL",
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\u0027s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
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
  "name": "Verify Notes",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I click on notes tab",
  "keyword": "And "
});
formatter.match({
  "location": "SD_SaveNotes.i_click_on_notes_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on plus notes button",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_click_on_plus_notes_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see notes popup",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_should_see_notes_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select privacy",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I select priority",
  "keyword": "* "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I select type",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_select_CCM()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\u0027s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. notes",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_enter_notes(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on save btn",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_click_on_save_btn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see newly added note",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SaveNotes.i_should_see_newly_added()"
});
formatter.result({
  "status": "skipped"
});
