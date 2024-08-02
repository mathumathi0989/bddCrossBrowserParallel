package runner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.configReader;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions","hooks"},
        plugin = {"pretty", "html:target/cucumber-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{

	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios(); }
	
	

	@BeforeTest
	@Parameters({ "browser" })
	public void defineBrowser(@Optional("chrome") String browser) throws Throwable {
	configReader.setBrowserType(browser);
	}
	    
	
	
	
}
