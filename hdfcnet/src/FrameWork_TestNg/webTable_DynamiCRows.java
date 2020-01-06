package FrameWork_TestNg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class webTable_DynamiCRows
{
	public WebDriver driver;
	@BeforeClass
	public void  url()
	{
	//	Read Data from Specific row and Cell
		 driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    }		
		@Test
		public void inner()
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			

			//Click Markes link
			driver.findElement(By.cssSelector("#liMarket")).click();
					
					
			//Identify Webtable
			WebElement table=driver.findElement(By.xpath(".//*[@id='pnl_Bse']/table"));
					
			//Find number of rows available under table
			List<WebElement> rows=table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++)
			  {
				 //target dynamic cells
				WebElement DynamicRow=rows.get(i);
				//In each dynamic row find set of cells
				List<WebElement> cells;
			 cells=DynamicRow.findElements(By.tagName("td"));
				
				//Get Stockname and HighPrice
			String stockname=cells.get(0).getText();
			String Highprice=cells.get(3).getText();
				
				System.out.println(stockname+"   "+Highprice);
				
		         	}

			
	       	}
		
	  }


