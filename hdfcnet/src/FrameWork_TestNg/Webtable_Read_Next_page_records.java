package FrameWork_TestNg;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Webtable_Read_Next_page_records 
{
	  public WebDriver driver;
	@BeforeClass
	public void uri()
	 {
		driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	@Test
	public void inner()
	 {
		WebElement market;
		 market=driver.findElement(By.id("liMarket"));
		 market.click();
		 //target on Nifty Weightage
		 WebElement Nifty_Weightage;
		  Nifty_Weightage= driver.findElement(By.linkText("Nifty Weightage"));
		   Nifty_Weightage.click();
			
			//Target Webtable
		   WebElement grid;
		   grid= driver.findElement(By.id("gridContainer"));
		   // selecting all the rows
	java.util.List<WebElement> rows= grid.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	//iterating all rows
	int count=0;
	for (int i = 0; i < rows.size(); i++)
	{
		String rowstext=rows.get(i).getText();
		System.out.println("==>"+rowstext);
		if(count==20){
			driver.findElement(By.xpath("//*[@id='gridSource']/tfoot/tr/th[3]")).click();
			count=0;
			
		}
		     count=count+1;
		
	   }
	
		   
		
	   }
	@AfterClass
	public void close()
	{
		driver.quit();
		
	}

}
