package UserDefined_keyward;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

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
  
   //===================userdefinedkeyward==================== 
  /*
	 * MethodName:-->Verify title presented
	 * */ 
   public boolean istitle_presented(String exp_title)
   {
	//Capture runtime title
	 String Runtime_title= driver.getTitle();
	 ////Verify Runtime title contains expected title
	boolean flag= Runtime_title.contains(exp_title);
	return flag;
	   }
   /*
	 * MethodName:--->verify url presented at webpage*/

  public boolean is_url_preseneted(String exp_url)
     {
	  //capture runtime url
	 String url_title= driver.getCurrentUrl();
	boolean flag= url_title.contains(exp_url);
	return flag;
     }
  /*
	 * MethodName:--->verify page source [title,url,element,text---etc]
	  */
  public boolean is_pagesource_preseneted(String text_or_Element)
  {
	 String Runtime_source= driver.getPageSource();
	boolean flag= Runtime_source.contains(text_or_Element);
	  return flag;
      }
  /*
	 * MethodName:--->verify text visible at webpage

    */
  public boolean is_textvisible_atpage(String exp_title){
	  //indentify page
	WebElement page = driver.findElement(By.tagName("body"));
	//Capture text at webpage
	String page_visible_text=page.getText();
	boolean flag=page_visible_text.contains(exp_title);
	  return flag;
	  
  }
  /*
	 * Methodname:--> verify text visible at selected Element or Area
   */
  public boolean is_text_visible_AtElement(By locater,String exp_title)
  {
		
		 //Get page visible text

	  String Element_text=driver.findElement(locater).getText();
	boolean flag=  Element_text.contains(exp_title);
	return flag;
	  
	 }
  /*
 	 * Methodname:--> verify text visible at selected Element or Area
 	 * Author
      * CreatedOn
      * Reviewed By
      * parameters used;---> local parameter
      * last update date:--->
      * 
      * Note;-->
      * 		Can verify Errormsg,Status msg, Info msg, headers, text
      * 
 	 */
  public boolean Verify_TextAt_location(By locator,String exp_title)
   {
	
	 return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, exp_title));  
     }

	 
	 /*
	 * Methodname:--> verify input available at Editbox
	 * Author
  * CreatedOn
  * Reviewed By
  * parameters used;---> local parameter
  * last update date:--->
  * 
  * Note;-->
  * 		Can verify Input available at editbox  
  * 
	 */	 
  public Boolean isInput_availableAt_editbox(By locater,String exp_title)
  {
	  return wait.until(ExpectedConditions.textToBePresentInElementValue(locater, exp_title));
  }
	 
	 /*
	 * Methodname:--> get input available at Editbox
	 * Author	
  * CreatedOn
  * Reviewed By
  * parameters used;---> local parameter
  * last update date:--->
  * 
  * Note;-->
  * 		We can also capture autogenarated input text. 
  * 
	 */	 
  public String getUser_input_from_editbox(By locater)
  {
	String inputvalue=  driver.findElement(locater).getAttribute("value");
	return inputvalue;
	  
  }

	/*
	 * Methodname:--> Verify Alert presented at webpage
	 * Author
	 * CreatedOn
	 * Reviewed By
	 * parameters used;---> local parameter
	 * last update date:--->
	 * 
	 */

  public boolean alertispresented()
  {
	  if(ExpectedConditions.alertIsPresent().apply(driver)!=null)
	  {
		  return true; 
	  }else
	  
		  return false;
	  
   }

  /*
   * Methodname:--> Capture Alert Text at webpage
	* Author
	* CreatedOn
	* Reviewed By
	* parameters used;---> local parameter
	* last update date:--->
	* 
	*/
	public String Get_AlertText()
    {
		if(alertispresented()){
		String alerttext=driver.switchTo().alert().getText();
		return alerttext;
		}else{
			
			return null;
         }
	 
	}

	/*
	* Methodname:--> Accept or dismiss alert window
	* Author
	* CreatedOn
	* Reviewed By
	* parameters used;---> local parameter
	* last update date:--->
	* 
	*/
	public void close_alert(){
		if(alertispresented()){
			driver.switchTo().alert().accept();
		}
		else{
			System.out.println("alert is not presented");
		}
	}

	/*
	 * Methodname:---> Wait element to visible
	 * Author:--->
	 * create on:--->
	 * reviewed by:--->
	 * last updated date:--->
	 * parameters used:--->local parameters
	 */
	public WebElement waitfor_ElementVisible(String xpath)
	{
	WebElement element=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		return element;
	}
	/*
	 * Methodname:---> Get Table CellAdress Using Row number and Column Number
	 * Author:--->
	 * create on:--->
	 * reviewed by:--->
	 * last updated date:--->
	 * parameters used:--->local parameters
	 */
	public WebElement Get_Table_CellAddress(String Table_xpath,int Row, int cell)
	{
	WebElement table=	driver.findElement(By.xpath(Table_xpath));

	////Find number of rows available with in table
	List<WebElement>  rows;
	rows=table.findElements(By.tagName("tr"));
	//Target fifth row 
	WebElement seletedrow=rows.get(Row);
	//On Selected row find list of cells available
  List<WebElement>	cells=seletedrow.findElements(By.tagName("td"));

//Get zero cell ddata
  WebElement cellsaddress=cells.get(cell);
   return cellsaddress;
	}
	/* * Methodname:---> return webtable celladdress [Using record name and Column name]
			 * Author:--->
			 * create on:--->
			 * reviewed by:--->
			 * last updated date:--->
			 * parameters used:--->local parameters
			 */
	public  WebElement Webtable_Dynamic_CellAdress(String tablexpath, String recordname, int col)
			{
			//targert webelement
		WebElement table=driver.findElement(By.xpath(tablexpath));
		List<WebElement>allrows=table.findElements(By.tagName("tr"));
		System.out.println(allrows.size());
		boolean flag=false;
		WebElement CellArea=null;
  //iteration 
		for (int i = 0; i < allrows.size(); i++)
		{
			WebElement selected_rows=allrows.get(i);
			//System.out.println(Selected_row.getText());
			
			//Find 3rd row column count
			List<WebElement> All_columns=selected_rows.findElements(By.tagName("td"));
									
			//Iteration for columns
			for (int j = 0; j < All_columns.size(); j++) 
			{
				//Target 3rd column
				WebElement CellAddress=All_columns.get(j);
											
				//get celltext
				String CellData=CellAddress.getText();
									
									
				if(CellData.equals(recordname))
				{
					flag=true;
					CellArea=All_columns.get(col);
					break;//break column iteration
									
				}
									
									
			}//col
							
			if(flag==true)
			{
				break; //break row iteration
			}
							
								
	}//row
	System.out.println("record available status  "+flag);
			return CellArea;				
	}

		
  }		

	
 
     
  
		
		

	


