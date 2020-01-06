package hdfcnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox_Browser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		

	}

}
