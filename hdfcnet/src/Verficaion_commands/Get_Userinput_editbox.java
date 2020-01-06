package Verficaion_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper_Class.Helper;

public class Get_Userinput_editbox {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Testcase:-->
		 * 		Verify Operatorname and Locationname autogenarated During
		 * 		mobile reacharge functionality
		 * Steps:-->
		 * 		Launch and load patym application
		 * 		Make sure Prepaid radio button selected
		 * 		Enter mobile number
		 * 
		 * Expected:-->
		 * 		System should autogenarate Operator and location
		 */
   
       Helper dr=new Helper();
       dr.browserlaunch("https://paytm.com/");
     dr.driver.manage().window().maximize();
       //click on prepiad recharge
        //target location
  boolean prepaid  = dr.driver.findElement(By.id("radio0")).isSelected();
  System.out.println("prepaid is seleced"+prepaid);
     WebElement mobile_num=  dr.driver.findElement(By.xpath("//label[text()='Mobile Number']/preceding-sibling::input"));
        mobile_num.clear();
       mobile_num.sendKeys("9502361974");
       Thread.sleep(5000);
       //target on operation
    WebElement operator= dr.driver.findElement(By.xpath("//label[text()='Operator']/preceding-sibling::input"));
    String operatorname=operator.getAttribute("value");
    System.out.println(operatorname);
    
       if(operatorname.equals("BSNL"))
       {
    	   System.out.println("displayed correct operator");
    	}
       else
       {
    	   System.err.println("display invalid operator");
       }
    
       WebElement circle=dr.driver.findElement(By.xpath("//label[text()='Circle']/preceding-sibling::input"));
       String circle_area=circle.getAttribute("value");
         System.out.println(circle_area);
         if(circle_area.equals("Andhra Pradesh"))
         {
        	 System.out.println("CIRCLE AREA IS PROVIDED CORRECT ");
         }
         else
         {
        	 System.err.println("circle area is wrong");
         }
       
}
}