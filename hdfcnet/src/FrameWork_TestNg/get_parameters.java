package FrameWork_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class get_parameters
{
	public WebDriver driver;
	@Test(priority=0)
	@Parameters("appurl")
	public void browser_launch(String url){
		driver=new ChromeDriver();
		driver.get(url);
		
	}
	
	@Test(priority=1)
	@Parameters({"appuid","apppwd"})
	public void load(String uid,String pwd)
	{
		System.out.println(uid);
		System.out.println(pwd);
	}

}
