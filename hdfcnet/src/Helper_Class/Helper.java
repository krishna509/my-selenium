package Helper_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// trst
public class Helper {
   public WebDriver driver;//GOBAL
   public String url;
   public String email ="p.krishnamohanreddy@gmail.com";
  public  void browserlaunch(String url)//local
  {
     driver= new ChromeDriver();
     
     driver.get(url);
     driver.manage().window().maximize();
  }
     //entergmail
     public void Signin() 
     {
     driver.findElement(By.id("email")).clear();
     driver.findElement(By.id("email")).sendKeys("email");
     }

  
}
