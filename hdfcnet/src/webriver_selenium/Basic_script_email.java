package webriver_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_script_email {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		//maxmise the window
		driver.manage().window().maximize();
		//enterning the email with valid data
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("p.krishnamohanreddy@gmail.com",Keys.ENTER);
		Thread.sleep(9000);
		//enterning valid passward
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("9246246618",Keys.ENTER);
		Thread.sleep(9000);
		//ENTERNING SUBMIT BUTTON
		driver.findElement(By.name("password")).submit();
		Thread.sleep(9000);
		//compose button actiom
		driver.findElement(By.cssSelector(("div[class='z0']"))).click();
		Thread.sleep(9000);
		//to button action
		driver.findElement(By.cssSelector(".oj div")).sendKeys("krishnam.p1988@gmail.com",Keys.ENTER);
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
