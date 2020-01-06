package web_driverlaunch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic_script_email {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		//maxmise the window
		driver.manage().window().maximize();
		//enterning the email with valid data
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("krishnam.p1988@gmail.com",Keys.ENTER);
		Thread.sleep(9000);
		//enterning valid passward
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("9246246618",Keys.ENTER);
		Thread.sleep(15000);
		//compose mailling
		
	//driver.findElement(By.className(".T-I.J-J5-Ji.T-I-KE.L3")).click();
		driver.findElement(By.cssSelector("div[class='T-I J-J5-Ji T-I-KE L3']")).click();
				
		Thread.sleep(2000);	
		driver.findElement(By.name("to")).clear();
		
		driver.findElement(By.name("to")).sendKeys("p.krishnamohanreddy@gmail.com");

		Thread.sleep(2000);
		driver.findElement(By.name("subjectbox")).sendKeys("hi u have mail");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		//result
String Exp_res="Message sent";
//		driver.findElement(By.linkText())
	
	//WebElement element=	driver.findElement(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span/span[1]"));
	//	WebElement element=driver.findElement(By.xpath("//span[@class='bAq']"));
		//WebElement element=driver.findElement(By.cssSelector("body > div:nth-child(17) > div.nH > div > div.nH.w-asV.aiw > div:nth-child(5) > div.no > div > div:nth-child(3) > div > div > div.vh > span > span.bAq"));
	//EXPLICT WAIT COMMAND FOR MSG SENT

	//WebDriverWait  wait = new  WebDriverWait(driver,50);
//	wait.until(ExpectedConditions.visibilityOf(element));
//	System.out.println("true ");
	
	WebDriverWait wait=new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("html/body/div[7]/div[3]/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div[2]/span/span[1]"), "Message sent"));
	System.out.println("true"+Exp_res);
	
/*	String Act_result=element.getText();
		//System.out.println("show result =>"+Act_result);
if (Act_result.equals(Exp_res)) {
			System.out.println("msg sent");
		
			
			
		} else {
                  System.out.println("not sent");
		}
		
		
	*/	

	}

}
