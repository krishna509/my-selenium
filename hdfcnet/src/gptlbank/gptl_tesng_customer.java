package gptlbank;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gptl_tesng_customer 
{
	public WebDriver driver;
	public login_as_manager manger;
	public newcustomer_login customer;
	@BeforeClass
	public void gptl(){
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // This is to Instantiate Home Page and LogIn Page class 
		manger=PageFactory.initElements(driver, login_as_manager.class);
		customer=PageFactory.initElements(driver, newcustomer_login.class);
		
	}
	@Test(priority=0)
	public void managerlogin()
	{
		manger.logindetail("mngr151706", "yryhupe");
		System.out.println("displayed customer login page");
		}
  @Test(priority=1)
  public void number_not_customer() throws Exception{
	  customer.cdetails("krishna123");
	  System.out.println("numbers are not allowed in the field");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);
	  
	  driver.navigate().refresh();
  }
  @Test(priority=2)
  public void spl_not_customer() throws Exception
  {
	  customer.cdetails("@@krishna");
	  System.out.println("special character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);

	  driver.navigate().refresh();
  }
  @Test(priority=3)
  public void blank_not_customer() throws Exception
  {
	  customer.cdetails("  ");
	  System.out.println("blank character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);
	  
	  driver.navigate().refresh();
  
  }
  @Test(priority=4)
  public void space_not_customer() throws Exception
  {
	  customer.cdetails(" krish");
	  System.out.println("space character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);
	  driver.navigate().refresh();
  }
  @Test(priority=5)
  public void only_char_customer() throws Exception
  {
	  customer.cdetails("krishamohan");
	  System.out.println("go to address filed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(3000);
	  
  }
  

}
