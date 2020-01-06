package mouseaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=545c2021-6bb3-4b5c-a352-abc4c2b85bd3&ie=UTF8");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//action on shop by category
	Actions	action=new Actions(driver);
	//targeton web element sho category
	//locate element
  WebElement	shop_elment= driver.findElement(By.xpath("//a[@id='nav-link-shopall']"));
      action.click(shop_elment).perform();
   //sub action on tv
    WebElement tv_sub = driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']"));
      action.click(tv_sub).perform();
      //right click action on television
 // WebElement     televsion_context =driver.findElement(By.xpath("//span[text()='Televisions']"));
//  action.contextClick( televsion_context).perform();
  //hold action Speakers
WebElement speakers =driver.findElement(By.xpath("//span[text()='Speakers']"));
  action.clickAndHold(speakers).perform();
  //release cursor on web element
  action.release(speakers).perform();
	}
	

}
