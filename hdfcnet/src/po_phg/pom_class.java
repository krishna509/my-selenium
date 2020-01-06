package po_phg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pom_class
{
	public static WebElement user(WebDriver driver){
		return driver.findElement(locator_php.username_xpath);
	}
	public static WebElement pass(WebDriver driver){
		return driver.findElement(locator_php.pass_xpath);
	}
	public static WebElement login(WebDriver driver){
		return driver.findElement(locator_php.login_xpath);
	}
	public static WebElement tour(WebDriver driver){
		return driver.findElement(locator_php.tour_xpath);
	}
	public static WebElement touradd(WebDriver driver){
		return driver.findElement(locator_php.touradd_xpath);
	}
	
	public static WebElement type(WebDriver driver){
		return driver.findElement(locator_php.tour_type);
	}
	public static Select typese(WebDriver driver){
		return new Select( driver.findElement(locator_php.tour_select));
	}
}
