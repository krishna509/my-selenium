package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Various_method_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		// TARGET ON JOB ALERT
		driver.findElement(By.xpath("//button[@id='cjaMain']")).click();
		//target on keyboard 
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).click();
		driver.findElement(By.xpath("//input[@id='Sug_kwdsugg']")).sendKeys("Roles");
		Thread.sleep(4000);
		// target on location
		driver.findElement(By.xpath("//input[@id='Sug_locsugg']")).click();
		driver.findElement(By.xpath("//*[@id='Sug_locsugg']")).sendKeys("Pune");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired industry where you want to work']")).click();
		driver.findElement(By.xpath("//*[@placeholder='Type or Select the desired industry where you want to work']")).sendKeys("Accounting , Finance");

	}

}
