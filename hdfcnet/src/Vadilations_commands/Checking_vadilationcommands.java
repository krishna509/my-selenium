package Vadilations_commands;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import Helper_Class.Helper;

public class Checking_vadilationcommands {
public static void main(String[] args) throws InterruptedException {
		Helper dr= new Helper();
		dr.browserlaunch("https://www.cleartrip.com/");
		dr.driver.manage().window().maximize();
//Checking for more option is 
	WebElement more=	dr.driver.findElement(By.id("MoreOptionsLink"));
	more.click();
	Thread.sleep(5000);
	WebElement class_travels=dr.driver.findElement(By.xpath("//label[text()='Class of travel']"));
			
	WebElement preffered_airline=dr.driver.findElement(By.xpath("//label[text()='Preferred Airline']"));
	if(class_travels.isDisplayed()&& preffered_airline.isEnabled())
	{
		
		System.out.println("test pass==>");
	
		
	}
		else
		{
			System.out.println("displayed more option");
		}
	
	more.click();
	Thread.sleep(5000);
	
		if(!class_travels.isDisplayed()&&preffered_airline.isEnabled())
		{
			System.out.println("displayed more option");
		}
		else
		{
			System.out.println("displayed more option close");
		}
		Point more_location =more.getLocation();
		System.out.println("more_location==>"+more_location);
	String more_css=	more.getCssValue("font-size");
		System.out.println("more_css==>"+more_css);
         
		}
		
		
	}


