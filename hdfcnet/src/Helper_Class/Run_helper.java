package Helper_Class;

import org.openqa.selenium.By;

public class Run_helper {

	public static void main(String[] args) {
	Helper	dr= new Helper();
	//acess gobal variable
	
//	dr.url="http://gmail.com";
	//
	
	dr.browserlaunch("http://www.gmail.com");
	dr.Signin();
	//passward enter
	dr.driver.findElement(By.id("password")).clear();
	dr.driver.findElement(By.id("password")).sendKeys("9246246618");
	
	

	}

}
