package pagefractor_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagefactory.Home_PG_POF;
import pagefactory.login_page;

public class homepg_login_testng 
{  public WebDriver driver;
     Home_PG_POF home;
     login_page log;
	@BeforeClass
	public void browserlaunch(){
		driver=new ChromeDriver();
       driver.get("http://www.store.demoqa.com");	
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
    // This is to Instantiate Home Page and LogIn Page class  

       home=PageFactory.initElements(driver, Home_PG_POF.class);
       log=PageFactory.initElements(driver, login_page.class);
       	// Once both classes Initialised, use their Web Element Objects

       
	}
	@Test
	public void signup(){
		home.account_link.click();
		log.login("krishna", "mohan");
	
		System.out.println("invalid username and pwd ");
	
	}
	@AfterClass
	public void quit(){
	  driver.quit();	
	}

	

}
