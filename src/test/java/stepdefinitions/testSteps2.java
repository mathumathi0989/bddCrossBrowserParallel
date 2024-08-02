package stepdefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testSteps2 {

	WebDriver driver = hooks.getDriver(); 


	@Given("I open the application")
	public void i_open_the_application() {
		 driver.get("http://dsportalapp.herokuapp.com/");
		   driver.findElement(By.xpath("//button[@class='btn']")).click();
		   driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		
	}
	@When("click register page")
	public void click_register_page() {
	   System.out.println("topics clicked");
	   driver.findElement(By.xpath("//a[normalize-space()='Register!']")).click();
	   
	}
	@Then("page should be navigated to register page")
	public void page_should_be_navigated_to_register_page() {
		System.out.println("page navigated to register pae");
	}

	
	
}
