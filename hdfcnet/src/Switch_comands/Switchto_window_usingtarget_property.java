package Switch_comands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchto_window_usingtarget_property {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://telanganaepass.cgg.gov.in/");
		driver.manage().window().maximize();
		driver.switchTo().frame("bottomFrame");
		driver.findElement(By.linkText("Centre for Good Governance")).click();
		Thread.sleep(2000);
   // using external link target property we can switch to next window
		driver.switchTo().window("_new");
		

	}

}
