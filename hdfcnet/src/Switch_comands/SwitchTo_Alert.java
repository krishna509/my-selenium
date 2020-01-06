package Switch_comands;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * Step1:--> launch chromebrowser
		 * Step2;--> Load webpage url;-->
		 * Step3:--> maximize browser widnow [Optional]
		 */

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
	 	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String timetaken=	new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		FileUtils.copyFile(src, new File("screen\\image.png"+timetaken));
		
		/*
		 * Step4:--> Click Search button without enter keyword and Course option
		 */
	/*	WebElement Search_btn=driver.findElement(By.cssSelector(".w70.blueBtn.f13"));
		Search_btn.click();
		Thread.sleep(4000);

		
	/*	//STep5;-->  Switch to Alert window
		Alert alert=driver.switchTo().alert();
		
		//Capture text on alert
		String Act_msg=alert.getText();
		System.out.println(Act_msg);
		
		//Accept Alert window
		alert.accept();
		
		
		/*
		 *   GetText on  alert window
		 *          driver.switchto().alert().getText();
		 *        
		 *    Accept Alert popup  [Close]
		 *    	    driver.switchTo().alert().accept();
		 *    
		 *    Dismiss Alert popup  [Close]
		 *    		driver.switchTo().alert().dismiss();
		 *    
		 *    Type text at prompt window  
		 *    		driver.switchto().alert().sendkeys("text");
		 */
		


	}

}
