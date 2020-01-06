package gptlbank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng_address 
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
	 @Test(priority=1)
	  public void only_char_customer() throws Exception
	  {
		  customer.cdetails("krishamohan");
		  System.out.println("go to address filed");
		  driver.switchTo().alert().dismiss();
		  Thread.sleep(3000);
	  }
	@Test(priority=0)
	public void managerlogin(){
		manger.logindetail("mngr151706", "yryhupe");
		System.out.println("displayed customer login page");
		}
  
  @Test(priority=2)
  public void space_char__not() throws Exception
  {
	  customer.address("krishna    h   r");
	  System.out.println("special character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(4000);
      driver.navigate().refresh();
  }
  @Test(priority=3)
  public void blank_not_address() throws Exception
  {
	  customer.address("   ");
	  System.out.println("blank character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(4000);
	  driver.navigate().refresh();
  
  }
  @Test(priority=4)
  public void special_char_not_customer() throws Exception
  {
	  
	  customer.address("krish@@12//fg");
	  System.out.println("space character are not allowed");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(5000);
	  driver.navigate().refresh();
  }
  
  @Test(priority=5)
  public void char_number_allowed() throws Exception
  {
	  customer.address(" plot no 23 roadno 8");
	  System.out.println("go next field");
	  driver.switchTo().alert().dismiss();
	  Thread.sleep(5000);
	  customer.city_bar.click();
	  
	  
   }
  

}
