package webriver_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class basic_underscript {

	public static void main(String[] args) throws InterruptedException
	{
		 
	WebDriver driver=new ChromeDriver();
	 driver.get("http://facebook.com");
	 
	 //maximize window
	 driver.manage().window().maximize();
	 
	 //* identify location at webpage and entertext into veditbox
	/* driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("krishnam.p1988@gmail.com",Keys.ENTER);
    Thread.sleep(9000);
    //*identify location and enter valid passward
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys("krishna",Keys.ENTER);
    //submit login
    driver.findElement(By.name("passw")).submit();
    */
	 Thread.sleep(9000);
	 // enter name by using css selector
	 driver.findElement(By.cssSelector("input[aria-label='First name']")).clear();
	 driver.findElement(By.cssSelector("inpu[aria-label='First name']")).sendKeys("krishna");
   //surname by using css selector
	 driver.findElement(By.cssSelector("input[aria-label='Surname'][name='Surname']")).clear();
	 driver.findElement(By.cssSelector("input[aria-label='Surname'][name='Surname']")).sendKeys("krishna pitta ");
	 
	 
    
    
    
	 
	 
	 

	}

}
