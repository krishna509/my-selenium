package java_scripts;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scripts {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
	 driver.manage().window().maximize();
	 // using java script writing the code
	 JavascriptExecutor js= ((JavascriptExecutor)driver);
	// js.executeScript("document.getElementById('Sug_kwdsugg').value='Sug_kwdsugg'");
	// js.executeScript(docmume, arg1)
	//js js.executeScript(return.docu, arg1)
	 js.executeScript("document.getElementById('Sug_kwdsugg').value='Skills, Designations, Roles, Companies'");
	 js.executeScript("document.getElementById('Sug_locsugg').value='hyderabad'");
	 js.executeScript("document.getElementById('cjaExp').value='4'");
	 js.executeScript("document.getElementById('cjaMinSal').value='2'");
	 WebElement Signup_btn=driver.findElement(By.name("sbt"));
	 js.executeScript("arguments[0].click()",Signup_btn);
	 

	}

}
