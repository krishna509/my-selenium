package working_on;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_selection {

	public static void main(String[] args) {
	ChromeDriver	driver=new ChromeDriver();
	driver.get("https://www.m-icicibank.com/credit-cards/index.html?card=platinum-chip&utm_source=google&utm_medium=cpc&utm_campaign=icicibank-pr-cc-desktop-search-brand-em&utm_content=icici-credit-card&utm_term=icici-credit-card&utm_lms=google-searchbrand-icicibank-pr-cc-desktop-search-brand-em-icici-credit-card&gclid=CjwKCAjwhLHaBRAGEiwAHCgG3iW763OMpax6owj4BjWGpKPLnOfuPHWvEYYN32ELEM50XAV02aYSWBoCVqkQAvD_BwE");
	//maxime the winow
	driver.manage().window().maximize();
	// fining the live city
	new Select(driver.findElement(By.id("city"))).selectByVisibleText("DELHI");
	
	//select option
	
	
	
		

	}

}
