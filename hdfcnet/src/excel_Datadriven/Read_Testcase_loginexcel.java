package excel_Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Testcase_loginexcel {

	public static void main(String[] args) throws IOException, Exception {
	 FileInputStream fi= new FileInputStream("TESTDATA\\InputData.xlsx");
      System.out.println("work book found ");
      XSSFWorkbook book=new XSSFWorkbook(fi);
     XSSFSheet sh= book.getSheet("Login");
     //get the row using sheet
      XSSFRow row=sh.getRow(1);
      //get url  cell using the row
     String url= row.getCell(1).getStringCellValue();
     //launch the browser and load url in it
     WebDriver driver= new ChromeDriver();
     driver.get(url);
     // moving to the sign the next button
    String sign_nex_button=  row.getCell(2).getStringCellValue();
    driver.findElement(By.xpath(sign_nex_button)).click();
      //Get Email locator and EmailInput
    String email_locator=row.getCell(3).getStringCellValue();
    String email=row.getCell(4).getStringCellValue();
    driver.findElement(By.xpath(email_locator)).clear();
    driver.findElement(By.xpath(email_locator)).sendKeys(email);
    // next button and click
   String next_button= row.getCell(5).getStringCellValue();
   driver.findElement(By.xpath(next_button)).click();
   //passward and clear and sendkeys
  String passward_locater=  row.getCell(6).getStringCellValue();
   String pass=  row.getCell(7).getStringCellValue();
   driver.findElement(By.xpath(passward_locater)).clear();
   driver.findElement(By.xpath(passward_locater)).sendKeys(pass);
     String sign_in= row.getCell(8).getStringCellValue();
     Thread.sleep(3000);
    driver.findElement(By.xpath(sign_in)).click();
    
	}

}
