package all_features

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/All Features Files For Cucumber Reports/AllCarePlan_Blank",
glue="",
//tags = "@Smoke_USMM",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_CarePlans_BlankFeature {
}
