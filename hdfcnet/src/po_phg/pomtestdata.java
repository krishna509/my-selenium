package po_phg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class pomtestdata {
      public static WebDriver driver;
	public static void main(String[] args) throws Exception
	{
		driver=new ChromeDriver();
		driver.get(input_data.url);
		pom_class.login(driver).sendKeys(input_data.username);
		pom_class.pass(driver).sendKeys(input_data.passward);
		pom_class.login(driver).click();
		Thread.sleep(10000);
		pom_class.tour(driver).click();
		Thread.sleep(10000);
		pom_class.touradd(driver).click();
		Thread.sleep(3000);
		pom_class.type(driver).click();
		pom_class.typese(driver).selectByIndex(1);

	}

}
