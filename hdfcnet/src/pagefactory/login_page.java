package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page
{
	public WebDriver driver;
	
	
	public login_page(WebDriver driver)
	{
		this.driver=driver;
	}
   @FindBy(id="log")
   WebElement user_editbox;
   @FindBy(id="pwd")
   WebElement pwd_edit_box;
   @FindBy(id="login")
   WebElement login_button;
   
   
   public void login(String uid,String pwd)
   {
	   user_editbox.clear();
	   user_editbox.sendKeys(uid);
	   pwd_edit_box.clear();
	   pwd_edit_box.sendKeys(pwd);
	   login_button.click();
	   
   }




   
   
  
   
}
