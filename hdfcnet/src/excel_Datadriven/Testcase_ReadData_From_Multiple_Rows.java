package excel_Datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Testcase_ReadData_From_Multiple_Rows
{
	public static void main(String[] args) throws IOException, Exception 
	{
		
		//Target file location
				FileInputStream fi=new FileInputStream("TESTDATA\\InputData.xlsx");
				//Get Workbook using above location
				XSSFWorkbook book= new XSSFWorkbook(fi);
				//using the workbook getting the sheet
			XSSFSheet sht=	book.getSheet("Login_multiple");
			///Get Number of rows data available
			int rowcount=sht.getLastRowNum();
			WebDriver driver=new ChromeDriver();
			//iterating the row
			for (int i = 3; i <=rowcount; i++) 
			{
				
				//Get Static CellData From dynamic row
				XSSFRow row=sht.getRow(i);
				String username=row.getCell(0).getStringCellValue();
				String password=row.getCell(1).getStringCellValue();
						
				System.out.println(username+"   "+password);

				//load webpage
			String url=	sht.getRow(0).getCell(1).getStringCellValue();
			driver.get(url);
			//Get username location from excel
			 String email_locater= sht.getRow(1).getCell(0).getStringCellValue();
			 driver.findElement(By.id(email_locater)).clear();
			 driver.findElement(By.id(email_locater)).sendKeys(username);
			//Get password locator from excel
				String password_locator=sht.getRow(1).getCell(1).getStringCellValue();
				driver.findElement(By.id(password_locator)).clear();
				driver.findElement(By.id(password_locator)).sendKeys(password);
				
				Thread.sleep(3000);
				

			}
		
		
		
		
	}

}
