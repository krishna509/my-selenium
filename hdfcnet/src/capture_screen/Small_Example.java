package capture_screen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Small_Example {

	public static void main(String[] args) throws  IOException
	{
	WebDriver driver= new ChromeDriver();
			driver.get("https://www.naukri.com/");
			driver.manage().window().maximize();		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          
          // capture with time
        String timetaken=  new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
      
	FileUtils.copyFile(src, new File("screen\\image.png"+timetaken));
        
	}

}
