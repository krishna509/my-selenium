package Robot_action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_File_Download {

	public static void main(String[] args)throws AWTException, Exception
	{
		
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.bseindia.com/markets/equity/EQReports/StockPrcHistori.aspx?scripcode=512289&flag=sp&Submit=G");
			driver.manage().window().maximize();
			
			
			
			//Select StockName
			WebElement Stock_search_Editbox=driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_GetQuote1_smartSearch']"));
			Stock_search_Editbox.clear();
			Stock_search_Editbox.sendKeys("BPL");
			Thread.sleep(3000);
			WebElement stockname=driver.findElement(By.xpath("//*[@id='listEQ']/li[1]/a/span[1]"));
			stockname.click();
			
			//Open From Date calendar
			driver.findElement(By.xpath("//*[@id='imgCal']")).click();
				
			
			
			
			
			//Download Excel file
			WebElement Download_excel=driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnDownload"));
			Download_excel.click();
			
			Thread.sleep(5000);
			
		
			String text = "C:\\Users\\Administrator\\Downloads\\Sunil";
			StringSelection stringSelection = new StringSelection(text);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(stringSelection, stringSelection);
			
			
			//Create object for Robot framework
			Robot robot=new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			Thread.sleep(5000);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			
			
		}

	}


