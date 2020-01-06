package Switch_comands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_mutiplewindow {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		// capture the current window title[home window]
		String main_window=driver.getWindowHandle();
		System.out.println("mainwindow id"+main_window);
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		/*
		 * Set is collection Interface framework
		 * 	=> Set Avoid duplicate values
		 * 	=> Set not going to maintain Order..
		 */
		//Get All window dynamic acces id's
	Set<String> Allwindow=	driver.getWindowHandles();
	System.out.println("allwindows id-->"+Allwindow);
	//Iterate for allwindows
    for (String eachwindow : Allwindow) {
    	//switch to each window
    	driver.switchTo().window(eachwindow);
    	//Get Window Title
    String Runtime_title=	driver.getTitle();
      if (Runtime_title.contains("Cancel Train Bookings")) 
     {
		 break;//stop iteration
	}
	
}
		
	
	System.out.println("Current window title is  --> "+driver.getTitle());

		
		

	}

}
