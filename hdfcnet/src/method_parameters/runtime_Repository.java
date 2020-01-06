package method_parameters;

import org.openqa.selenium.By;

public class runtime_Repository {

	public static void main(String[] args) throws Exception
	{
		Repository obj=	new Repository();
		obj.browser_launch("chrome");
		obj.load("http:\\facebook.com");
		obj.settime(20);
		//enter text using xpath
		obj.Enter_textTo_Eb("//*[@id='email']", "krishna");
		//by using by
		obj.Enter_textto(By.id("pass"), "reddy");	
		//drop down
		obj.selectaction(By.id("day"), "19");
		obj.selectaction(By.id("month"),"May");
		obj.selectaction(By.id("year"), "1990");
		// MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]
       obj.click(By.id("u_0_a"));
       Thread.sleep(5000);
       /*
  	 MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
     */
       obj.wait_and_click(By.linkText("Messenger"));
       


	}

}
