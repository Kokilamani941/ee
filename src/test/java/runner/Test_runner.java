package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/resources/features",
	glue="step_definitions",
	//tags="  @TS_ll_01 ",
	dryRun=false,
	monochrome=true
	
)
public class Test_runner {

}
