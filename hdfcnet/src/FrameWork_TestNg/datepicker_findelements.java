package FrameWork_TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class datepicker_findelements {
	public WebDriver driver;

	@BeforeClass
	public void urlpage() throws Exception
	{
		driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@Test
	public void dateselection() throws Exception
	{
		//IDentfy datepicker
				WebElement DptDate=driver.findElement(By.id("dpt_date"));
				DptDate.click();
				Thread.sleep(3000);
				for (int i = 0; i < 3; i++)
				{

					//Identify table
					WebElement Datepicker_table;
					Datepicker_table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table"));
					//list of clickable dates
					List<WebElement>click_abledates;
		            click_abledates=	Datepicker_table.findElements(By.tagName("a"));
					System.out.println("clickable dates display"+click_abledates.size());
					//iterating
					for (int j = 0; j < click_abledates.size(); j++)
					{
						//select the date
					WebElement each_date=click_abledates.get(j);
					each_date.click();
					Thread.sleep(1000);
					DptDate.click();
					Thread.sleep(2000);
					//Restore all identifications
					Datepicker_table=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
					click_abledates = Datepicker_table.findElements(By.tagName("a"));

						}
					DptDate.click();
					Thread.sleep(2000);
					driver.findElement(By.id("cal_showNextMonth")).click();
					Thread.sleep(2000);
					

				}
			

		
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
}
