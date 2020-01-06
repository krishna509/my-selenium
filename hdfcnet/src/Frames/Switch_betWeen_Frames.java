package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Switch_betWeen_Frames {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.get("https://telanganaepass.cgg.gov.in/");
		driver.manage().window().maximize();
	
		//Switch to frame
		driver.switchTo().frame("message");
		
		//Click link under Menuframe
		driver.findElement(By.xpath("//*[@id='navigation']/tbody/tr[3]/td/a")).click();
		
		//Switch to Diff Frame
		driver.switchTo().defaultContent();
		//Switch to Next frame
		
		
		

     
	}

}
