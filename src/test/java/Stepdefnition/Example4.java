package Stepdefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example4 {

	@Given("User Login into Testme app")
	public void user_Login_into_Testme_app() {
		System.out.println("User launches browser");
		
	}

	@When("User Selects the product {string}")
	public void user_Selects_the_product(String S) {
		System.out.println("User selects product" +S);
	    
	}

	@When("User clicks to add cart")
	public void user_clicks_to_add_cart() {
		System.out.println("User adds product to cart");
	    
	}

	@When("User clicks Cart link")
	public void user_clicks_Cart_link() {
		System.out.println("User clicks cart link");
	    
	}

	@When("User selects the Quantity as {int}")
	public void user_selects_the_Quantity_as(int a) {
		System.out.println("User selects quantity" +a );
	   
	}

	@Then("User review the payment")
	public void user_review_the_payment() {
		System.out.println("User reviews payment");
	    
	}

}
