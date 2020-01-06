package Switch_comands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_for_alert {

	public static void main(String[] args) {

		/*
		 * Step1:--> launch chromebrowser
		 * Step2;--> Load webpage url;-->
		 * Step3:--> maximize browser widnow [Optional]
		 */

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		
		/*
		 * Step4:--> Click Search button without enter keyword and Course option
		 */
		WebElement Search_btn=driver.findElement(By.cssSelector(".w70.blueBtn.f13"));
		Search_btn.click();
		////Create object for Webdriver wait
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert handled as expected");




	}

}
