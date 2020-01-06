  package working_on;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class naukri_using_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//targeting on create job alert
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		//target object with element name
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("Software Testing, ");
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("Bug Reporting, ");
		driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Roles, Companies']")).sendKeys("Performance Testing Tool,");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter the cities you want to work in']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter the cities you want to work in']")).sendKeys("Hyderabad/Secunderabad, ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select']")).sendKeys("3");
	
	/*   driver.findElement(By.xpath("//input(id('cjaExp'))")).click();
	   Thread.sleep(2000);
        new Select(driver.findElement(By.xpath("//input(id('cjaExp'))"))).selectByIndex(3);
		Thread.sleep(2000)
		*/
		;
		new Select(driver.findElement(By.xpath("//input[@placeholder='Select']"))).selectByIndex(5);	
		Thread.sleep(2000); 
		//target on industry
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired industry where you want to work']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired industry where you want to work']")).sendKeys("Banking , Financial Services , Broking");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired industry where you want to work']")).sendKeys("Accounting , Finance");
		Thread.sleep(2000);
		// target on Job Category
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired category where you want to work']")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired category where you want to work']")).sendKeys("Accounts, Finance, Tax, Company Secretary, Audit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired category where you want to work']")).sendKeys("Analytics & Business Intelligence");
		Thread.sleep(2000);
		// target on roles
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired role where you want to work']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Type or Select the desired role where you want to work']")).sendKeys("Accounts Executive/Accountant");
		Thread.sleep(2000);
		//name your job alert
		driver.findElement(By.xpath("//input[@placeholder='Enter a name that will help you recognize this Job Alert']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter a name that will help you recognize this Job Alert']")).sendKeys("hi");
		//target on email
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email ID where you would like to receive this Job Alert']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your Email ID where you would like to receive this Job Alert']")).sendKeys("p.krishnamohanreddy@gmail.com");
		Thread.sleep(2000);
		//check box
		driver.findElement(By.xpath("//*[@id='cjaFrm']/div[10]/div")).click();
		//submit
      driver.findElement(By.xpath("id('cjaSubmit')")).submit(); 
		
		
		
	}

}
