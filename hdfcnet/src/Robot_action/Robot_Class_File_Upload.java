package Robot_action;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Class_File_Upload {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@value='exp']")).click();
		Thread.sleep(2000);
		
		WebElement Upload_resume=driver.findElement(By.xpath("/html/body/main/div/div/form/resman-uploader/div/div[1]/span[1]/input"));
		Upload_resume.click();
		Thread.sleep(5000);
     String resume="E:\\Downloads 2407018\\Sendkeys (1).txt";
  StringSelection stext=  new StringSelection(resume);
  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stext, stext);
  // create robot awt
  Robot robot =new Robot();
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
  robot.keyPress(KeyEvent.VK_TAB);
  robot.keyPress(KeyEvent.VK_TAB);
  robot.keyPress(KeyEvent.VK_ENTER);

	}

}
