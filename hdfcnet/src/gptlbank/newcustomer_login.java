package gptlbank;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;



public class newcustomer_login
{
	public WebDriver driver;
	public newcustomer_login(WebDriver driver){
		this.driver=driver;
		
	}
	
	@FindBy(name="name")
	WebElement cname;
	@FindBy(name="rad1")
	WebElement maleradio;
	
	@FindBy(name="dob")
	WebElement enter_dob;
	@FindBy(name="addr")
	WebElement address_bar;
	@FindBy(name="city")
	WebElement city_bar;
	@FindBy(name="state")
	WebElement state_enter;
	@FindBy(name="pinno")
	WebElement pinc;
	@FindBy(name="telephoneno")
	WebElement tno;
	@FindBy(name="emailid")
	WebElement email;
	@FindBy(name="sub")
	WebElement submit;
	@FindBy(name="res")
	WebElement reset;
	
	public void cdetails( String n){
		cname.clear();
		cname.sendKeys(n,Keys.ENTER);
	}
	public void click(){
		maleradio.click();
	}
	public void address(String d)
	{
		address_bar.clear();
		address_bar.sendKeys(d,Keys.ENTER);
	}
	public void city(String c)
	{
		city_bar.clear();
		city_bar.sendKeys(c,Keys.ENTER);
	}
	public void state(String s)
	{
		state_enter.clear();
		state_enter.sendKeys(s,Keys.ENTER);
	}
	public void pin(String p)
	{
		pinc.clear();
		pinc.sendKeys(p,Keys.ENTER);
	}
	public void tele(String t)
	{
		tno.clear();
		tno.sendKeys(t,Keys.ENTER);
	}
	public void emailenter(String e)
	{
		email.clear();
		email.sendKeys(e,Keys.ENTER);
	}
	public void submitbutton()
	{
		submit.click();
	}
	public void resetbutton()
	{
		reset.click();
	}
	
}



