package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Working_on_csspath {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
	
driver.findElement(By.cssSelector("div[#imsLBCnt]/div/div/div[2]/div/div/div/input")).clear();


	}

}
