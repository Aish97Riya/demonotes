package Amazonpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInpage {
	WebDriver driver;
	By username= By.id("ap_email");
	By continueButton=By.xpath("//input[@id='continue']");
	By password=By.name("password");
	By submit=By.xpath("//input[@type='submit']");
	
	public SignInpage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	
	public void EnterUsername(String usernamevalue)
	{
		driver.findElement(username).sendKeys(usernamevalue);
	}
	
	public void EnterPassword(String passwordvalue)
	{
		driver.findElement(password).sendKeys(passwordvalue);
	}
	
	public void ClickContinueButton()
	{
		driver.findElement(continueButton).click();
	}
	
	public void ClickSigninButton()
	{
		driver.findElement(submit).click();
	}
	

}
