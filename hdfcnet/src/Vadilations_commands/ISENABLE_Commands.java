package Vadilations_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Helper_Class.Helper;

public class ISENABLE_Commands {

	public static void main(String[] args) {
	Helper dr =new Helper();
	dr.browserlaunch("https://secure.icicidirect.com/IDirectTrading/customer/customeroverview.aspx?filename=CorpAcc");
	
	dr.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
	//Identify dropdown
	//		WebElement 
			
     WebElement	City=dr.driver.findElement(By.id("FML_USR_ADDRSS_CTY_DROP"));
     City.click();
 // Select Any predefined city option at dropdown
     new Select(City).selectByIndex(4);
    
		//Expected [State] and [Others-editbox] should be disabled

     WebElement Other= dr.driver.findElement(By.id("FML_USR_ADDRSS_CTY_OTHERS"));
     WebElement State= dr.driver.findElement(By.id("FML_USR_ADDRSS_STTE"));
   //Write decision statement to verify disable
     if(!Other.isEnabled()&&State.isEnabled())
     {
    	 System.out.println("both state are invisible ");
     }
     else
     {
    	 System.err.println("both state are  visble");
    	 
     }
     //select others in the dropdwon
     
     new Select(City).selectByVisibleText("Others");
     if(Other.isEnabled()&&State.isEnabled())
     {
    	 System.out.println("as expected both are visible");
     }
     else
    	 System.err.println("as expected both are not visble");
	}

}
