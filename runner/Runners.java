package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/mergelead.feature",glue="steps", monochrome=true)
public class Runners extends AbstractTestNGCucumberTests {

}
