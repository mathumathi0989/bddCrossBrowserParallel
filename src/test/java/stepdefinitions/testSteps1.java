package stepdefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testSteps1 {

	WebDriver driver = hooks.driver; 
	

	@Given("I open the application in login")
	public void i_open_the_application_in_login() {
	   driver.get("https://www.google.com");
	}
	@When("I entered invalid username and password")
	public void i_entered_invalid_username_and_password() {
	    System.out.println("entered invalid username and password");
	}
	@Then("popup message should be displayed")
	public void popup_message_should_be_displayed() {
	    System.out.println("alert message displayed");
	}
	
	@When("I entered valid username and password")
	public void i_entered_valid_username_and_password() {
	   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("browser");
	   driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	   
	}
	@Then("home page displayed")
	public void home_page_displayed() {
	   System.out.println("Home page displayed");
	}

}
