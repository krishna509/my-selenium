package FrameWork_TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
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
import org.openqa.selenium.chrome.ChromeDriver;


public class Other_example {
	public WebDriver driver;
	
  @Test
  public void signup() {
	  driver.findElement(By.linkText("Sign Up")).click();
	 Assert. assertEquals("Sign up for Facebook", "Sign up for Facebook",driver.getTitle());
	 Reporter.log("Signup sucessfull verified",true);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	driver.get("http://facebook.com");  
	  
  }

  @AfterMethod
  
	  public void afterClass() throws IOException {
			 DateFormat date= new SimpleDateFormat("yyyy/mm/dd hh-mm-ss");
			Date time= new Date();
			String timetaken =date.format(time);
			File src1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src1, new File("screens\\"+timetaken+"image.png"));
		  }
	 
  

  @BeforeClass
  public void beforeClass() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

 @AfterClass
 public void afterMethod() throws Exception {
 
	 Thread.sleep(4000);
	  driver.close();
}
}