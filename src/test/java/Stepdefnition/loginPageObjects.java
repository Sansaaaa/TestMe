package Stepdefnition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageObjects {
	//WebDriver driver;
	public loginPageObjects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	@FindBy(xpath="//input[@name='password']")
	public static WebElement psd;
	@FindBy(xpath="//input[@name='login']")
	public static WebElement clk;
	
}
