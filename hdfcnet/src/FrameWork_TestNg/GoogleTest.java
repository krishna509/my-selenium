package FrameWork_TestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/* before using priority
 * PASSED: gmailpage
   PASSED: logo
   PASSED: titletest
 * 
 * 
 */
/* after  using priority
 * PASSED: gmailpage
PASSED: titletest
PASSED: logo
 */

public class GoogleTest
{    
	public WebDriver driver;
	@BeforeMethod
	public void googlepage()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2,groups="titletest")
	public void titletest()
	{
   String title=	driver.getTitle();
	
	Reporter.log("Title is==>"+title);
		
	}
	@Test(priority=1)
	public void gmailpage(){
		 driver.findElement(By.linkText("Gmail")).click();
         
         Reporter.log("User name and passward displayed");
	}
	@Test(priority=3)
	public void logo(){
	boolean flag= driver.findElement(By.xpath("//*[@id='hplogo']/a/img")).isDisplayed();
		 Reporter.log("checking for logo"+flag);
	}
	
	@AfterMethod
	public void close(){
		driver.close();
		
	}
	
	 
	
	
	
	
	
	
	
	
	
	

}
