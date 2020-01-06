package Wait_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpectedConditions_WithoutWebdriverWait {
	/*
	 * url to be ===>get url
	 * url contains
	 */

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
	String	Exp_res="https://www.cleartrip.com/";
	boolean flag =ExpectedConditions.urlToBe(Exp_res).apply(driver);
	System.out.println("flag"+flag);

		
     boolean flag1= ExpectedConditions.titleContains("Site for Booking Flights").apply(driver);
     System.out.println("flag1"+flag1);
     
	}

}
