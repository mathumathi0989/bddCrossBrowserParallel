package stepdefinitions;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testSteps1 {

	WebDriver driver = hooks.getDriver(); 
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	@Given("I open the application in login")
	public void i_open_the_application_in_login() {
	   driver.get("http://dsportalapp.herokuapp.com/");
	   WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn']")));
       button.click();
	}
	
	@When("I entered valid username and password")
	public void i_entered_valid_username_and_password() {
		driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Sign in']")));
        signInLink.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']"))).sendKeys("seleniumsquad");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']"))).sendKeys("numpyninja");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    
	}
	@Then("home page displayed")
	public void home_page_displayed() {
	   System.out.println("Home page displayed");
	   String expectedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
	        Assert.assertEquals("You are logged in", expectedMessage);
	}
	
	
	@When("I entered invalid username and password")
	public void i_entered_invalid_username_and_password() {
		 WebElement signInLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Sign in']")));
	        signInLink.click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_username']"))).sendKeys("seleniumsquad");
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_password']"))).sendKeys("invalid");
	        driver.findElement(By.xpath("//input[@value='Login']")).click();
	   }
	@Then("popup message should be displayed")
	public void popup_message_should_be_displayed() {
		 System.out.println("alert message displayed");
	        String expectedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alert']"))).getText();
	        Assert.assertEquals("Invalid Username and Password", expectedMessage);
	  
	}
	
	

}
