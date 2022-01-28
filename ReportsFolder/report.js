$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/SupperBll/SupperBill.feature");
formatter.feature({
  "name": "Supper Bill flows",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify that patients are filtered from left filter against specific practice facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_SupperBill_PracticeFacility"
    }
  ]
});
formatter.step({
  "name": "I click on Reset button to reset supper bill filters",
  "keyword": "When "
});
formatter.step({
  "name": "I enter \u003cDateOfService_FromDate\u003e as date of service from date",
  "keyword": "And "
});
formatter.step({
  "name": "I enter \u003cPractice\u003e as practice",
  "keyword": "* "
});
formatter.step({
  "name": "I click on Apply button to apply supper bill filters",
  "keyword": "* "
});
formatter.step({
  "name": "I click on particular patient and expand",
  "keyword": "* "
});
formatter.step({
  "name": "I should see \u003cPractice\u003e particualar patient practice facility",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "DateOfService_FromDate",
        "Practice"
      ]
    },
    {
      "cells": [
        "12012020",
        "VPA PC WEST ALLIS"
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
  "name": "I navigate to patient grid With Supper Bill",
  "keyword": "Given "
});
formatter.match({
  "location": "SD_PatientGrid_SupperBillTab.I_navigate_to_patient_grid_SupperBill()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to click on object \u0027Object Repository/OR_Alert/Obj_Hide\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat patientGrid.SD_PatientGrid_SupperBillTab.I_navigate_to_patient_grid_SupperBill(SD_PatientGrid_SupperBillTab.groovy:56)\r\n\tat ✽.I navigate to patient grid With Supper Bill(Include/features/PatientGrid/SupperBll/SupperBill.feature:4)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/OR_Alert/Obj_Hide\u0027 located by \u0027//*/text()[normalize-space(.)\u003d\u0027Hide\u0027]/parent::*\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1370)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.doCall(ClickKeyword.groovy:65)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword$_click_closure1.call(ClickKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.click(ClickKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.ClickKeyword.execute(ClickKeyword.groovy:40)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.click(WebUiBuiltInKeywords.groovy:620)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$click$3.call(Unknown Source)\r\n\tat patientGrid.SD_PatientGrid_SupperBillTab.I_navigate_to_patient_grid_SupperBill(SD_PatientGrid_SupperBillTab.groovy:56)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:105)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy:621)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:618)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:718)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner.call(Unknown Source)\r\n\tat TC_SupperBill_PracticeFacility.run(TC_SupperBill_PracticeFacility:5)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:442)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:433)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:412)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:404)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:281)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1643355936419.run(TempTestSuite1643355936419.groovy:36)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verify that patients are filtered from left filter against specific practice facility",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@SmokeUSMM_SupperBill_PracticeFacility"
    }
  ]
});
formatter.step({
  "name": "I click on Reset button to reset supper bill filters",
  "keyword": "When "
});
formatter.match({
  "location": "SD_SupperBill.I_Click_RestButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter 12012020 as date of service from date",
  "keyword": "And "
});
formatter.match({
  "location": "SD_SupperBill.I_Search_as_service_Fromdate(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter VPA PC WEST ALLIS as practice",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SupperBill.I_Search_as_practice(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Apply button to apply supper bill filters",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SupperBill.I_click_on_supperbill_apply_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on particular patient and expand",
  "keyword": "* "
});
formatter.match({
  "location": "SD_SupperBill.I_click_on_particularpatient_Expand()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see VPA PC WEST ALLIS particualar patient practice facility",
  "keyword": "Then "
});
formatter.match({
  "location": "SD_SupperBill.I_should_see_supperbill_practice_facility(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});