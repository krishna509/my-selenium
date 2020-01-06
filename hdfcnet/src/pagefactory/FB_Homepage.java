package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FB_Homepage
{
	public WebDriver driver=null;
	 public FB_Homepage(WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		
	} 
   @FindBy(how=How.ID,using="email")
   WebElement email_text;
   @FindBy(how=How.ID,using="pass")
   WebElement pass_text;
   @FindBy(xpath="//*[@id='u_0_2']")
   WebElement sign_login_button;
   @FindBy(id="u_0_j")
   WebElement sign_firstname;
   
   
   
                                                           


/*
	 * Methodname:--> UserLogin
	 */
   public void userlogin(String UID,String PWD)
   {
	 email_text.clear();
	 email_text.sendKeys(UID);
	 pass_text.clear();
	 pass_text.sendKeys(PWD);
	 //sign_login_button.click();
	 
	 
   }
   public void first(String NAME){
	   sign_firstname.clear();
	   sign_firstname.sendKeys(NAME);
	   
	   
   }
   
}
