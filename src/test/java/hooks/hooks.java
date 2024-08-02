package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.configReader;
import utilities.driverFactory;

public class hooks {

	public static WebDriver driver;
	
	@Before
	public static void before() throws Throwable {
	//	Loggerload.info("Loading Config file");

		configReader.loadConfig();
		String browser = configReader.getBrowserType();
		 driverFactory driverFactory = new driverFactory();
		 driver = driverFactory.initializeDrivers(browser);

	//	Loggerload.info("Initializing driver for : "+browser);

	

	}

	 @After
	    public void after() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	 
	
	
}
