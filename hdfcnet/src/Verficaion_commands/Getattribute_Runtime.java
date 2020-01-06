package Verficaion_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper_Class.Helper;

public class Getattribute_Runtime {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Testcase:--> verify Addcity visibility on multicity label
		 * 				selection under flight trip types.
		 * Steps:-->
		 * 			1. launch browser and load Makemytrip webpage
		 * 			2. Click Milticity label
		 * 			3. Make sure mulicity label Selected
		 * 
		 * Expected:-->
		 * 			Add City button should visible at webpage..
		 */
                   Helper dr=new Helper();
                   dr.browserlaunch("https://www.makemytrip.com/");
                   //we are clicking on mutlicity label
               WebElement multicity=  dr.driver.findElement(By.xpath("//label[text()='multi-city']"));
               multicity.click();
               Thread.sleep(5000);
               String Runtime_class  =  multicity.getAttribute("class");
               if(Runtime_class.contains(" flight-trip-type"))
               {
                System.out.println("multicity is selected");
                //after multicity is selected add button should be visible
             WebElement Add_city  = dr.driver.findElement(By.id("addModifyBtn"));
             if(Add_city.isDisplayed())
             {  System.out.println("add city is visble");
               }
             else
             {  System.err.println("add city is not visble");
            	 }
             }
               else
               {
            	   System.err.println("multicity not selected");
               }
	}

}
