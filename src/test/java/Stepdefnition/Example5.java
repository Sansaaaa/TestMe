package Stepdefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example5 {
	WebDriver driver;
	@When("User login into Testme")
	public void user_login_into_Testme() {
		System.out.println("User launches browser");
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	   
	}

	@Then("User enters username as {string} And password as {string}")
	public void user_enters_username_as_And_password_as(String un, String psd) {
		loginPageObjects p=new loginPageObjects(driver);
		p.un.sendKeys('Username');
		p.psd.sendKeys('password');
	    
	}

	@Then("click ok")
	public void click_ok() {
		loginPageObjects p=new loginPageObjects(driver);
		p.clk.click();
		
	    
	}

	@Then("verify login")
	public void verify_login() {
	   
	}


}
