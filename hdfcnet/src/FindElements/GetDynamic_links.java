package FindElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDynamic_links {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Identify location
		WebElement footer_nav_links;
		footer_nav_links=driver.findElement(By.cssSelector(".inline"));
		// all ink availabile
	List<WebElement>All_LInks;	
	
	All_LInks=footer_nav_links.findElements(By.tagName("a"));
	//iterating 
	
for (int i = 0; i < All_LInks.size(); i++) 
{
	
		//target each 
	WebElement eachlink=All_LInks.get(i);
		// get href and  text of links
	String Textname=eachlink.getText();
	String hrefname=eachlink.getAttribute("href");
	System.out.println(Textname+"       "+ hrefname);
	eachlink.click();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	//Restore identification after refresh. To avoid stale-element-refferal-exception
	footer_nav_links=driver.findElement(By.cssSelector(".inline"));
	All_LInks=footer_nav_links.findElements(By.tagName("a"));

	
		
		
	}
	
		
		
	}	


	}
