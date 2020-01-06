package java_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Highlight_element {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//
  WebElement text=	driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span"));
     
   js.executeScript("arguments[0].style.backgroundColor='yellow'",text);
   js.executeScript("arguments[0].style.outline='red solid 2px'",text);
  
  
  
	}

}
