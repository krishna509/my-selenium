package web_driverlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_DROP_DOWN {

	public static void main(String[] args) {
   WebDriver	driver =new ChromeDriver();
   driver.get("https://leads.hdfcbank.com /applications/new_webforms/apply/credit-card/Index.aspx?");
     //maximise windows application8, jkm n                                          320za
   driver.manage().window().maximize();	
   //in hdfc bank we select city for drop down
   Select  obj= new Select(driver.findElement(By.id("ddlCity")));
   obj.selectByVisibleText("HYDERABAD");
   obj.selectByIndex(5);
   obj.selectByValue("HYDERABAD");
   //for address proof
  Select r= new Select(driver.findElement(By.name("ddlAddrProof")));
  r.selectByVisibleText("Latest pipe gas bill");
  r.selectByIndex(2);
  r.selectByValue("Latest pipe gas bill");
  Select y=new Select(driver.findElement(By.name("ddlEmpType")));
  y.selectByVisibleText("Student");
  y.selectByIndex(4);
  y.selectByValue("Student");
   Select s =new Select(driver.findElement(By.name("ddlAnnualIncome")));
   s.selectByVisibleText("250000-300000");
   s.selectByIndex(2);
   s.selectByValue("250000-300000");
                                                                                                                                                                            
   
   
  
   
    
   
   
	}

}
