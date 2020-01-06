package FrameWork_TestNg;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Depenecesfacebook {
	public WebDriver driver;
	@BeforeMethod
	public void url(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@Test()
	public void login(){
		driver.findElement(By.linkText("Log In")).click();
		Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		Reporter.log("login page verified");
		
	}
	
	@Test(dependsOnMethods="login")
	public void email(){
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("krishna");
		
	}
	@Test(dependsOnMethods="email")
	public void passward(){
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("1234");
		
	}
	@AfterClass
	public void close(){
		driver.quit();
	}
	

}
