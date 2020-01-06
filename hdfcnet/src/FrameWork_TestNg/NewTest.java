package FrameWork_TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	public WebDriver driver;
	
	
	 @BeforeClass
	  public void beforeClass() {
		 driver =new ChromeDriver();
		 driver.get("http://facebook.com");
		 driver.manage().window().maximize();
		   }

  @Test
  public void tc001_Verify_SignupPage()
  {
	  driver.findElement(By.linkText("Sign Up")).click();
	  Assert.assertEquals("Sign up for Facebook | Facebook",driver.getTitle());
	  Reporter.log("sign up page title verified ");
	  
  }
  @Test
  public void tc002_Verify_LoginPage()
  {
	  driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		
		//Log in to Facebook | Log in to Facebook
		Reporter.log("login page title verified",true);
	  
  }
  @Test
  public void tc003_Verify_MessengerPage() throws Exception 
  {
	  driver.findElement(By.linkText("Messenger")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		Thread.sleep(5000);
	WebElement KeepMe_signin_checkbox=	driver.findElement(By.name("persistent"));
	Assert.assertTrue(!KeepMe_signin_checkbox.isDisplayed());
	Reporter.log("Messenger page title verified",true);

 }
  
  @AfterMethod
  public void afterMethod() throws IOException {
	 DateFormat date= new SimpleDateFormat("yyyy/mm/dd hh-mm-ss");
	 Date d=new Date();
		String time=date.format(d);

	File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("screen\\"+time+"image.png"));
  }

 
  @AfterClass
  public void afterClass() throws Exception {
	  Thread.sleep(2000);
	  driver.close();
  }

}
