package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSPortal {
	public WebDriver driver;
	String URL =""

	@Given("User opens the URL")
	public void user_opens_the_url() {
		driver.get("https://dsportalapp.herokuapp.com/"); 
		driver.manage().window().maximize();
		
	}

	@Then("User land on the page")
	public void user_land_on_the_page() {
					
	    
	}

	@When("user clicks to Get Started")
	public void user_clicks_to_Get_Started() {
	    driver.findElement(By.xpath("//button[text()='Get Started']")).click();
	    
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    
	    
	}

	@Then("user land on DSPortal page")
	public void user_land_on_ds_portal_page() {

	
	}
	
}
