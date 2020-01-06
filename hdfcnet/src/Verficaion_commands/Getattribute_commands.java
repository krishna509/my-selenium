package Verficaion_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper_Class.Helper;

public class Getattribute_commands {

	public static void main(String[] args) {
		Helper dr=new Helper();
		dr.browserlaunch("https://www.cleartrip.com/");
	
		//workson search flight
	/*	// <div id:"homeErrorMessage"style:""/div>
		html source in visible
		<div id:"homeErrorMessage"style:"display:none/div>
		*/
WebElement error_location=	dr.driver.findElement(By.id("homeErrorMessage"));
            String Runtime=    error_location.getAttribute("style");	
            if(!Runtime.equals("display:none"))
            {
            	System.out.println("visible");
            }
            else
            {
            	System.out.println("hidden");
            	
            }
	}

	

}
