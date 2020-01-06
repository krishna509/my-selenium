package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nakuri_css_dynamic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//target on create job alert
		driver.findElement(By.cssSelector("#cjaMain")).click();
		//targeting on single ement
		driver.findElement(By.cssSelector("input[placeholder='Skills, Designations, Roles, Companies']")).clear();
		// i am asuming 3 rd element is unique
		
		driver.findElement(By.cssSelector("input[placeholder*='Roles']")).clear();
		driver.findElement(By.cssSelector("input[placeholder*='Roles']")).sendKeys("Developer,");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholer^='Skills'")).click();
		driver.findElement(By.cssSelector("input[placeholer^='Skills'")).sendKeys("tester");
	//	driver.findElement(By.cssSelector("input[placeholder='Enter the cities you want to work in']")).clear();
		Thread.sleep(4000);

	//	driver.findElement(By.cssSelector("inpu[id='cjaInd'][placeholder='Type or Select the desired industry where you want to work']")).click();
		//
		

	}

}
