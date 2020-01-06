package hdfcnet;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chromedriver {

	public static void main(String[] args ) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
	}

}
