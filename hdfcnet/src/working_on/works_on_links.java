package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class works_on_links {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://jntuh.ac.in/");
		// finding a link in jntu site
		driver.findElement(By.linkText("Academics")).click();
		// in academics i am finding partial link work
		driver.findElement(By.partialLinkText("Tables")).click();
		//drop on on all aacademics
		//select action
		driver.findElement(By.id("searchterm")).sendKeys("krishna",Keys.ENTER);
		Select s = new Select(driver.findElement(By.id("academic_year")));
		    s.selectByValue("2016-17");
		    
		  
		    
		    
		    
		    
		    
		
		
		

	}

}
