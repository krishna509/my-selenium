package java_scripts;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checking_visiblity {

	public static void main(String[] args) throws Exception 
	{
	
         WebDriver driver=new ChromeDriver();
         driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
       //Select Dropdown
 		WebElement Open_account=driver.findElement(By.id("open_account"));
 		//Use New Selector to get single option
 		new Select(Open_account).selectByVisibleText("Corporate Account");
 				
 		//Target Webelement
 		WebElement Open_my_account_btn=driver.findElement(By.xpath("//input[@value='Open my Account']"));
 		Open_my_account_btn.click();
 		Thread.sleep(10000);
     WebElement Others_editbox=driver.findElement(By.id("FML_USR_ADDRSS_CTY_OTHERS"));
		
		//using javascript executor enable element at runtime
       ((JavascriptExecutor)driver).executeScript("arguments[0].disabled=false", Others_editbox);
       Thread.sleep(5000);
       ((JavascriptExecutor)driver).executeScript("arguments[0].value='HYD'",Others_editbox);
       Thread.sleep(5000);
       ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'",Others_editbox);
       Thread.sleep(5000);
		
		//Get element to visible using javascript
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].style.visibility='visible'",Others_editbox);
		Thread.sleep(5000);
		// target on state
	WebElement state_box=	driver.findElement(By.id("FML_USR_ADDRSS_STTE_DIS"));
	((JavascriptExecutor)driver).executeScript("arguments[0].disabled=false",state_box );
	Thread.sleep(5000);
	((JavascriptExecutor)driver).executeScript("arguments[0].value='AP'",state_box);
	Thread.sleep(5000);
	((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'",state_box);
	Thread.sleep(5000);
	((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='visible'",state_box);
	Thread.sleep(5000);

       

	}

}
