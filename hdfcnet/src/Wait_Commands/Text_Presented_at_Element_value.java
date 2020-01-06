package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;



public class Text_Presented_at_Element_value {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	       driver.get("https://paytm.com/");
	     driver.manage().window().maximize();
	       //click on prepiad recharge
	        //target location
	  boolean prepaid  = driver.findElement(By.id("radio0")).isSelected();
	  System.out.println("prepaid is seleced"+prepaid);
	     WebElement mobile_num=  driver.findElement(By.xpath("//label[text()='Mobile Number']/preceding-sibling::input"));
	        mobile_num.clear();
	       mobile_num.sendKeys("9502361974");
	       //target for operater using explict wait command
	       WebDriverWait  wait= new  WebDriverWait(driver,50);
	       wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("//label[text()='Operator']/preceding-sibling::input"), "BSNL"));
	       
	   	
			System.out.println("Expected Operator displayed");
		}

	         
               
	}


