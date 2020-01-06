package hydrib_framework;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Helper_class 
{
	public static WebDriver driver;
	public static void excel_helper_class(String filename,String sheetname)
	{
		excel_connection_class.excel_connection(filename, sheetname);
		String app_url=excel_connection_class.sheet.getRow(0).getCell(1).getStringCellValue();
		driver = new FirefoxDriver();
		driver.get(app_url);
		driver.manage().window().maximize();
		
	}
	public static void excel_helper_class1(String filename,String sheetname,String imagename)
	{
		excel_connection_class.excel_connection(filename, sheetname);
		// finding how many rows in sheet
		int rc= excel_connection_class.sheet.getLastRowNum();
		for (int i = 0; i <rc; i++)
		{
			String proname=excel_connection_class.sheet.getRow(1).getCell(i).getStringCellValue();
			String provalue=excel_connection_class.sheet.getRow(2).getCell(i).getStringCellValue();
			String action=excel_connection_class.sheet.getRow(3).getCell(i).getStringCellValue();
			String inputdata=excel_connection_class.sheet.getRow(4).getCell(i).getStringCellValue();
			
			switch (action) {
			case "Button":
		
			WebElement ele=	driver.findElement(excel_locators_class.excel_locator(proname, provalue));
		   ele.click();
		   break;
			case"TextBox":
				WebElement ele2=driver.findElement(excel_locators_class.excel_locator(proname, provalue));
				ele2.clear();
				ele2.sendKeys(inputdata);
				break;
			case"ListBox":
				Select ele3= new Select(driver.findElement(excel_locators_class.excel_locator(proname, provalue)));
				ele3.selectByVisibleText(inputdata);
				break;
			case"Capture Screen":
				try {
					File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("Screen\\"+imagename+".png"));
					
				} catch (Exception e)
				{
					// TODO: handle exception
				}
				
				break;
				
			default:
				break;
			}
			
			
			
		}
		
		
	}

}