package stepdefinitions;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testSteps2 {

	WebDriver driver = hooks.driver; 

	@Given("I open the application in array")
	public void i_open_the_application_in_array() {
		 driver.get("https://www.google.com");
	}
	@When("click topics covered")
	public void click_topics_covered() {
	   System.out.println("topics clicked");
	}
	@Then("page should be navigated to selected topics covered")
	public void page_should_be_navigated_to_selected_topics_covered() {
		System.out.println("page navigated to topics covered");
	}


	
	
}
