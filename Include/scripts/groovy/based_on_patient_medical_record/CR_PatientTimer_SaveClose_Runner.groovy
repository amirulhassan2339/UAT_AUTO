package based_on_patient_medical_record

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/ClincalData_BOPMR/PatientTimer_SaveCloseBTN.feature",
glue="",
tags = "@Regression_Timer_SaveClose",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_PatientTimer_SaveClose_Runner {
}
