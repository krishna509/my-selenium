package pagefractor_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagefactory.FB_Homepage;

public class fb_homepage_testng
{
	public WebDriver driver;
	FB_Homepage page;
	@BeforeClass
	public void browerlunch(){
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void fbtest(){
		FB_Homepage page=new FB_Homepage(driver);
		page.userlogin("krishna", "pwd123");
		
		
	}
	@Test
	public void name(){
		FB_Homepage page=new FB_Homepage(driver);
		page.first("krishna");
	}

}
