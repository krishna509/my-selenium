package working_on;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Relativexpath_nakuri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// target on create job alert
		
  driver.findElement(By.xpath("//button[@id='cjaMain']")).click();
  Thread.sleep(2000);
  // target on keyword
  driver.findElement(By.xpath("//form[@id='cjaFrm']/div/div[2]/div/div/div/input")).click();
  driver.findElement(By.xpath("//form[@id='cjaFrm']/div/div[2]/div/div/div/input")).sendKeys("Software testing,skills, roles");
  Thread.sleep(2000);
 
  driver.findElement(By.xpath("//div[@id='locsugg']/div/div/input")).clear();
  driver.findElement(By.xpath("//div[@id='locsugg']/div/div/input")).sendKeys("HYD",Keys.ESCAPE);
  
  //target on working
  driver.findElement(By.xpath("//input[@id='cjaExp']")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//li[@id='~3']")).click();
  Thread.sleep(2000);
  //experiences
  
  driver.findElement(By.xpath("//div[@id='minsal_dd_cja']/div/input")).click();
   Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@id='minsal_dd_cja']/div[2]/div/div/div/ul/li[4]")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//div[@id='indCja']/div/ul/li")).click();
  Thread.sleep(2000);
   driver.findElement(By.xpath("//div[@id='ul_indCja']/div/div/ul/li[1]")).click();
   Thread.sleep(2000);
  driver.findElement(By.xpath("//input[@id='cjaJob']")).clear();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//div[@id='dp_jcCja']/div/div/div/ul/li[1]")).click();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//div[@id='roleCja']/div/ul/li/input")).clear();
  Thread.sleep(3000);
  driver.findElement(By.xpath("//div[@id='dp_roleCja']/div/div/div/ul/li[3]")).click();
  
  
  
  //webelment locater
  
  //driver.findElement(By.xpath("//input[@id='u_0_j']")).click();
  
  //job alerts
  driver.findElement(By.xpath("//input[@id='nyja']")).click();
  
  //driver.findElement(By.xpath("//input[@autocapitalize='off']"));
  
	}

}
