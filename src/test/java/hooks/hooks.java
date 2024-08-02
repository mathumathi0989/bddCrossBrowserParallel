package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.configReader;
import utilities.driverFactory;

public class hooks {


	  // ThreadLocal for WebDriver instances
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
	@Before
	public static void before() throws Throwable {

		String browser = configReader.getBrowserType();
		 driverFactory driverFactory = new driverFactory();
		 driver.set(driverFactory.initializeDrivers(browser));
		

	}

	 @After
	    public void after() {
		 WebDriver webDriver = driver.get();
	        if (webDriver != null) {
	            webDriver.quit(); 
	            driver.remove();  // Remove the thread-local reference
	        }
	    }
	 
	// Method to get the WebDriver instance
	    public static WebDriver getDriver() {
	        return driver.get();
	    }
	
	
}
