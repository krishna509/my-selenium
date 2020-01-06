package Wait_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * visbile of element located  ===>|is displayed
 * invisible of elementlocated    ===>|is dispalyed
 */



public class ExpectedConditions_Visibilityof_Element_located {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		WebElement RoundTrip=driver.findElement(By.id("RoundTrip"));
		RoundTrip.click();
		//wait for return date writing wait command explict
		WebDriverWait wait =new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ReturnDate"))).click();
		System.out.println("as selecting round trip return date is visble");
		//clicking on one way 
		WebElement OneWay=driver.findElement(By.id("OneWay"));
		OneWay.click();
		//retun date must be in visible
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ReturnDate")));
		System.out.println("return date is inivisble");
		
		

	}

}
