package Stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	WebDriver driver=new ChromeDriver();
	@Given("User Launch Chrome Browser And Enter TestMeApp URL")
	public void user_Launch_Chrome_Browser_And_Enter_TestMeApp_URL() 
	{
		System.out.println("User launches browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	    
	}

	@When("User enter username in username field")
	public void user_enter_username_in_username_field() {
		System.out.println("User enters UserName");     	    
		driver.findElement(By.name("userName")).sendKeys("deenu");
        
	}

	@When("User enters password in password field")
	public void user_enters_password_in_password_field() {
		System.out.println("User enters password");
		driver.findElement(By.name("password")).sendKeys("qwerty123");
		
		
	    
	}

	@When("user cliks submit button")
	public void user_cliks_submit_button() {
		System.out.println("User clicks on submit button");
		driver.findElement(By.name("login")).click();
	    
	}

	@Then("user verfiy")
	public void user_verfiy() {
		System.out.println("login success");
	    
	}

}
