package stepdefpkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Amazonpages.SignInpage;

import org.apache.commons.io.FileUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class seleniumloccls {
	
	
	WebDriver driver;
	WebDriverWait wait;

	
	@Given("^Automate amazon using selenium locators$")
	public void automate_amazon_using_selenium_locators() throws Throwable {
		ChromeOptions c =new ChromeOptions();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement a =driver.findElement(By.id("APjFqb"));
		a.sendKeys("Amazon");
		a.submit();	  
		Thread.sleep(5000);
		driver.manage().window().maximize();
	}
	@Then("^I locate element by linktext$")
	public void i_locate_element_by_linktext() throws Throwable {
	//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,350)","");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Deals on Fashion & Beauty")).click(); 
		driver.findElement(By.linkText("Women's fashion")).click();
		//driver.findElement(By.xpath("//a[class='sVXRqc']")).click();
		Thread.sleep(3000);
	}

	@Then("^I locate element by partial linktext$")
	public void i_locate_element_by_partial_linktext() throws Throwable {
		
		   JavascriptExecutor js=(JavascriptExecutor)driver;
		   //driver.findElement(By.linkText("Account & Lists")).click();
		   driver.findElement(By.xpath("//span[contains(text(),'sign in')]")).click();
		   SignInpage signinpageelements=new SignInpage(driver);
		   signinpageelements.EnterUsername("mjudhai2020@gmail.com");
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   screenshot("UsernameEntered.jpg");
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='continue']")));
		   signinpageelements.ClickContinueButton();
		   signinpageelements.EnterPassword("Welcome@2020");
		   signinpageelements.ClickSigninButton();
     	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     	   driver.findElement(By.xpath("//img[contains(@alt,'Handbags')]")).click();
     	  Thread.sleep(5000);
     	  //js.executeScript("window.scrollBy(0,350)","");
     	  driver.findElement(By.xpath("//img[@alt='2']")).click();
     	 Thread.sleep(5000);
     	 driver.findElement(By.xpath("//img[@class='s-image']")).click();
     	 String parentwindow=driver.getWindowHandle();
     	 System.out.println(driver.getTitle());
     	 Set<String> totalwindow=driver.getWindowHandles();
     	 Iterator<String> iterate=totalwindow.iterator();
     	Thread.sleep(5000);
     	 while(iterate.hasNext())
     	 {
     		 String childwindow=iterate.next();
     		 if(!parentwindow.equalsIgnoreCase(childwindow))
     		 {
     			 driver.switchTo().window(childwindow);
     			 System.out.println(driver.getTitle());
     			 Thread.sleep(5000);
     			 //driver.switchTo().window(parentwindow);
     			 //Thread.sleep(10000);
     			 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
     			 Thread.sleep(5000);
     			// js.executeScript("window.scrollBy(0,750)","");
     			// driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
     			 
     		 }
     	 }
     	
     	 Thread.sleep(10000);
	}
	
	@Then("^I locate element by xpath$")
	public void i_locate_element_by_xpath() throws Throwable {
		//driver.findElement(By.xpath("//img[@alt='Instax Cameras (From ₹3,999)']")).click();
		//driver.findElement(By.xpath("//a[@href='/fujifilm-instax-mini-11-instant-camera/p/itmcb1e85d86facd?pid=INAFSRZAZHKF2MHU&lid=LSTINAFSRZAZHKF2MHUNPFMYC&marketplace=FLIPKART&store=jek%2Fp31%2Fysu&spotlightTagId=TrendingId_jek%2Fp31%2Fysu&srno=b_1_3&otracker=dynamic_omu_infinite_Top%2BDeals_4_1.dealCard.OMU_INFINITE_6CKNDROFNLC9&fm=neo%2Fmerchandising&iid=85fceb46-1473-4aa5-9cb2-5c2c9a15f7a8.INAFSRZAZHKF2MHU.SEARCH&ppt=browse&ppn=browse&ssid=iexh6q3l3k0000001732375199483']")).click();
	}
	@Then("^I take screenshot$")
	public void i_take_screenshot() throws Throwable {
	  // File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //File dest=new File("C:\\Users\\HP\\Aiswaryawkspc\\Aishexercise\\screenshots\\childwindow1.jpg");
	   //FileUtils.copyFile(src,dest);
	}

	@And("^close the google$")
	public void close_the_google() throws Throwable {
		driver.close();
	}
	
	public void screenshot(String imagetitle) throws IOException
	{
	         File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File dest=new File("C:\\Users\\HP\\Aiswaryawkspc\\Aishexercise\\screenshots\\"+imagetitle);
		   FileUtils.copyFile(src,dest);
	}
	@Then("^I scroll the window$")
	public void i_scroll_the_window() throws Throwable {
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,750)");
	    Thread.sleep(15000);
	    js.executeScript("window.scrollBy(0,-750)", "");
	    Thread.sleep(5000);
	 //   js.executeScript("windows.scrollBy(750,0)", "");
	    //Thread.sleep(5000);
	   // js.executeScript("windows.scrollBy(-250,0)", "");
	 //   Thread.sleep(5000);
	}
	@Then("^I rightclick one item$")
	public void i_rightclick_one_item() throws Throwable {
		//driver.findElement(By.xpath("//a[@id=\"attach-close_sideSheet-link\"]")).click();
		Thread.sleep(10000);
		Actions a=new Actions(driver);
	      wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@id='attach-close_sideSheet-link']")));
	    WebElement b=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
	    a.contextClick(b).build().perform();
	    Thread.sleep(5000);
	    screenshot("rightclick.jpg");
	}
	@Then("^I doubleclick on item$")
	public void i_doubleclick_on_item() throws Throwable {
		Actions a=new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']"));
		a.doubleClick(b).build().perform();
		Thread.sleep(5000);
		screenshot("doubleclick.jpg");
	}
	@Then("^I hover the mouse on item$")
	public void i_hover_the_mouse_on_item() throws Throwable {
		Actions a=new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//a[@id='bylineInfo']"));
		a.moveToElement(b).build().perform();
		Thread.sleep(5000);
		screenshot("mousehover.jpg");
	}
	@Given("^open google chrome browser$")
    public void open_google_chrome_browser() throws Throwable {
	ChromeOptions co=new ChromeOptions();
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
   
}
		


