package Switch_comands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://my.monsterindia.com/create_account.html?spl=G_Adgroup_Single%20Word%20Keyword%20Exact&WT.mc_n=olm_sk_srch_Google_Resume_Goo_Search_India_Brand_AllBrand&gclid=CjwKCAjwkrrbBRB9EiwAhlN8_K6m5fJcEskHa1gj0qHzQkhLkZKqtEepfxEFt0xsI-wddDWk_BubIBoCsDcQAvD_BwE");
	driver.manage().window().maximize();
	
	//with out enter any keys we are preforming create noew
	WebElement create = driver.findElement(By.name("submit1"));
	create.click();
	Thread.sleep(2000);
	//Write decision statement to verify alert presented at webpage
	
	if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	{ 
		//STep5;-->  Switch to Alert window
		Alert alert =driver.switchTo().alert();
		// capture the text
		String Acu_msg=alert.getText();
		System.out.println(Acu_msg);
		//capture alert
		alert.dismiss();
	}

		
	}

}
