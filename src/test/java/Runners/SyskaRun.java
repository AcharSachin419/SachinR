package Runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Test\\src\\test\\resources\\features\\syskaHairDryer.feature",
        glue={"StepDefinitions"},
		plugin  = {"json:target/cucumber-report.json","html:build/reports/cucumber"},publish = true,
        monochrome=true,// display the console output  in a proper readable format
        dryRun=false  //to check the mapping b/w feature file and step def file
      )
public class SyskaRun {

}

	