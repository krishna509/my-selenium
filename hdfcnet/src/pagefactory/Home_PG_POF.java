package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Home_PG_POF {
	public WebDriver driver;
	
	
	@FindBy(xpath="//*[@id='account']/a")
	public WebElement account_link;
	
	 
	
	
	
	
	
	
	//we are calling the constructor 
	public Home_PG_POF(WebDriver driver)
	{
		this.driver=driver;
		
		
	}

}
