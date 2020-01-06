package Switch_comands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Other_example_alert_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/candidate/register.html?siteparams=3p9901&utm_source=google&utm_medium=cpc&utm_campaign=search");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //we are not performing any action we are trying to click on login
        WebElement login =driver.findElement(By.xpath("//a[@class='button_snd']"));
        login.click();
        Thread.sleep(2000);
        //action on submit button
        WebElement submit= driver.findElement(By.id("submitbutton"));
        submit.click();
        Thread.sleep(5000);
       // we are capure the alert 
        if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
        {
        	//we are capture alert msg
        	Alert alert =driver.switchTo().alert();
        	String Act_msg= alert.getText();
        	System.out.println(Act_msg);
        	//acept alert
        	alert.accept();
        }
        	
        
	}

}
