package FrameWork_TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UserDefined_keyward.Repository;

public class test_userdefined {
	Repository obj=new Repository();
	
	@Test(priority=1)
	public void browserlaunch()
	  {
		
		//Repository obj=new Repository();
		
		obj.browser_launch("chrome");
		//load url
		obj.load("https://www.facebook.com/");
		//set time
		obj.settime(20);
		//Verify title presented at webpage
	 if(obj.istitle_presented("Facebook"))
	 {
		 System.out.println("facebook title verified");
	 }
	 else
	 {
		 System.err.println("facebook title is not verifed");
	 }
	}
	@Test(priority=2)
	public void url() throws Exception
	{
		
		Thread.sleep(2000);
		if(obj.is_url_preseneted("https://"))
		{
		  System.out.println("url verified");	
		}
		 else{
			 System.out.println("url  not verified");	
		}
		
	}
	//Verify element presented at webpage
	@Test(priority=3)
	public void verify(){
		//Repository obj=new Repository();
		if(obj.is_pagesource_preseneted("email"))
			System.out.println("Element presented");
		else
		System.out.println("Element not presented");
		
		
	}
	//	
	//Verify text visible at webpage

 @Test(priority=4)
 public void verifytext()
 {
	 //Repository obj=new Repository();
	 if(obj.is_textvisible_atpage("Create an account"))
	 
		 System.out.println("text is presented");
	 else
	  System.out.println("text is not presented"); 
	 
 }
 //Verify text available on element
 @Test(priority=5)
 public void verifyelement()
 {
	 //Repository obj=new Repository();
	 if(obj.is_text_visible_AtElement(By.id("u_0_11"), "Sign Up"))
	 
		System.out.println("signup element is visible"); 
	 else
	 
		 System.out.println("signup element not visible");
	 }
 

}

