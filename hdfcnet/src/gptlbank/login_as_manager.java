package gptlbank;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class login_as_manager 
{
	 public WebDriver diver;
	 
	public login_as_manager(WebDriver driver)
	{
		this.diver=driver;
	}

  @FindBy(name="uid")
	public WebElement user1;
	@FindBy(name="password")
	public WebElement passward;
	@FindBy(name="btnLogin")
     public	WebElement loginbtn;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
	public WebElement customer_link;
	
  public void logindetail(String UID,String PWD)
  {
	  user1.clear();
	  user1.sendKeys(UID);
	  passward.clear();
	  passward.sendKeys(PWD);
	  loginbtn.click();
	  customer_link.click();
	  }
  
}

	  
  

