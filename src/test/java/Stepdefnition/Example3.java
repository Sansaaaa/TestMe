package Stepdefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example3 {
	WebDriver driver;
	@Given("User Launches TestMe")
	public void user_Launches_TestMe() {
		System.out.println("User launches browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	   
	}

	@When("User enters user name and password")
	public void user_enters_user_name_and_password() {
		loginPageObjects p=new loginPageObjects(driver);
		p.un.sendKeys("mercury");
		p.psd.sendKeys("mercury");
	    
	}

	@Then("Verify login")
	public void verify_login() {
		loginPageObjects p=new loginPageObjects(driver);
		p.clk.click();
		
	    
	}


}
