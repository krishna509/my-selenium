package method_parameters;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
  {

	public WebDriver driver;
		public WebDriverWait wait;
		
		// broeser lauch
		public void browser_launch(String browsername)
		{
			switch (browsername)
			{
			case "firefox":
				driver=new FirefoxDriver();
				break;
			case "chrome":
				driver=new ChromeDriver();
				break;
			case "ie":
				driver=new InternetExplorerDriver();
				break;

			default:System.err.println("miss amtch with browser");
				break;
			}
			
		}
		public void load(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
		public void settime(int sec)
		{
			// implict wait command
			 driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
			 //eplict command
			 wait=new WebDriverWait(driver,sec);
			 
		}
			
        //* MethodName:--> Enter text into Editbox..[using locator xpath]
		public void Enter_textTo_Eb(String xpath,String input)
		{
			driver.findElement(By.xpath(xpath)).clear();
			
			driver.findElement(By.xpath(xpath)).sendKeys(input);

		}
		//* MethodName:--> Enter text into Editbox..using locator class
		public void Enter_textto(By locater,String input)
		{
		       WebElement element=  driver.findElement(locater);	
		       if (element.isDisplayed()&&element.isEnabled()) 
		       {
		    	   element.clear();
		    	   element.sendKeys(input);
		       }
		}
		       //* MethodName:--> Select Dropdown using optioname
		       public void selectaction(By locater,String option_name)
		       
		       {
		    	  WebElement dropdown= driver.findElement(locater);
		    	  if (dropdown.isDisplayed()&&dropdown.isEnabled())
		    	  {
		    		  new Select(dropdown).selectByVisibleText(option_name);
				   }
		    	  else
		    	  {
		    		  System.err.println("text is hidden");
		    	  }
		    	   
		       }
		       // MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]

		public void click(By locater)
		{
			
			driver.findElement(locater).click();
		}
		/*
		 * MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
       */
		public void wait_and_click(By locater)
		{
			wait.until(ExpectedConditions.elementToBeClickable(locater));
		}
		
		/*
		 * MethodName:-->Mouse hover on element*/
		public void MouseHover(By locater)
		{
			WebElement element=driver.findElement(locater);
			new Actions(driver).moveToElement(element).perform();
		}

		/*
		 * MethodName:-->Wait for Elemnet visibility
		  */
		
		public void wait_for_elementTovisible(By locater)
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(locater));
			
		}
		//context click
		public void RightClick_OnElement(By locater)
		{
			WebElement element=driver.findElement(locater);
			new Actions(driver).contextClick(element).perform();
			}

		/*
		 * MethodName:-->switch to window using window title
		 */
   public void switchto_window(String win_title)
		{
		Set<String> allwindows=	driver.getWindowHandles();
		for(String eachwindow:allwindows)
		{
			driver.switchTo().window(eachwindow);
			String title=driver.getTitle();
			if(title.contains(win_title))
			{
				break;
			  }
		    }
			
		}
  public void capture(String image) throws IOException
   {
	DateFormat date= new SimpleDateFormat("yyyy/dd/mm hh-mm-ss");
	Date m=new Date();
	String time=date.format(m);
	System.out.println(m.toString());
	try
	  {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyDirectory(src, new File("screens\\"+time+image+".png"));
	FileUtils.copyFile(src, new File("screen\\"+time+image+".png"));
     }
  catch (Exception e)
    {
		e.printStackTrace();

    }

	}

  }
		
		

	


