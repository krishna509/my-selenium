package method_parameters;

import org.openqa.selenium.By;

public class SwitchTowindow {

	public static void main(String[] args) throws Exception {
		Repository obj=new Repository();
		obj.browser_launch("chrome");
		obj.load("https://www.hdfcbank.com/wholesale/default.htm");
		obj.settime(20);
		

		//switch to atm
		obj.selectaction(By.id("accesspointsselect"), "ATM");
		Thread.sleep(4000);
		obj.switchto_window("ATMs in Mumbai");
		obj.capture("ATM window");
	
		//swich to wholesale
		obj.switchto_window("Wholesale");
		Thread.sleep(4000);
		obj.capture("WholeSale");
		
		// Click link to open new window
		obj.click(By.linkText("HDFC Securities"));
		Thread.sleep(4000);
		obj.switchto_window("Open trading a/C");
		 obj.capture("opentradingac");
		
	}

}
