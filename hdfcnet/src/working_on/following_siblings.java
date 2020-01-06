package working_on;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class following_siblings {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.phptravels.net/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//form[@id='headersignupform']//div//input[@name='firstname']")).sendKeys("krishna");
		driver.findElement(By.xpath("//form[@id='headersignupform']//div//input[@name='lastname']")).sendKeys("reddy");
	}

}
