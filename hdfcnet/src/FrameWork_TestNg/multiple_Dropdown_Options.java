package FrameWork_TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class multiple_Dropdown_Options 
{
  public WebDriver driver;
  @BeforeClass
  public void url()
  {
	  driver=new ChromeDriver();
	  driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/credit-card/Index.aspx");
	  driver.manage().window().maximize();
	  
	 }
  @Test
  public void income_drop_down() throws Exception
     {
	 WebElement income_list= driver.findElement(By.id("ddlEmpType"));
	 //list of income details
	 List< WebElement>Select_click;
	Select_click= income_list.findElements(By.tagName("option"));
	//Get option count at runtime
	int Option_count=Select_click.size();

	for (int i = 0; i <Select_click.size() ; i++) 
	{
		WebElement eachaption=Select_click.get(i);
		eachaption.click();
		Thread.sleep(2000);
		//target company
		WebElement company=driver.findElement(By.id("txtCompany"));
		if (company.isDisplayed())
		{
			System.out.println("company visible==>"+eachaption.getText());
		}
			else
			{
				System.out.println("company hiddenn"+eachaption.getText());
					
		
		}
	}
	  
     }
}

