package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Complete_editbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.goibibo.com/flights/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("gosuggest_inputSrc")).click();
		driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("HYD");
		Thread.sleep(3000);
		
		driver.findElement(By.id("gosuggest_inputDest")).click();
		driver.findElement(By.id("gosuggest_inputDest")).sendKeys("TRZ");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".form-control.inputTxtLarge.widgetCalenderTxt")).click();
		Thread.sleep(2000);
		//choosen
	//	driver.findElement(By.xpath(".//*[@class='DayPicker DayPicker--en']/div[2]/div[3]/div[4]/div[6]")).click();
		driver.findElement(By.cssSelector("#searchWidgetCommon > div > div:nth-child(4) > div.shCalenderBox.col-md-5.col-sm-5.col-xs-12.pad0.marginTB10.marginAdjust > div:nth-child(1) > div > div > div > div:nth-child(2) > div.DayPicker-Body > div:nth-child(5) > div:nth-child(2) ")).click();
		Thread.sleep(3000);
        driver.findElement(By.cssSelector(".form-control.inputTxtLarge.widgetCalenderTxt")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/input[1]")).click();
        Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[2]/div/div/div/div[3]/div[3]/div[4]/div[6]")).click();
		//driver.findElement(By.xpath(".//*[@class='DayPicker DayPicker--en']/div[2]/div[3]/div[4]/div[6]")).click();
		
	
		
    
    
		
		
		
	
	}

}
