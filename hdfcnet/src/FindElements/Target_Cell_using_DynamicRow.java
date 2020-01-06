package FindElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_Cell_using_DynamicRow {

	public static void main(String[] args) 
		{
			//Read Data from Specific row and Cell
					WebDriver driver=new ChromeDriver();
					driver.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							
							
					//Click Markes link
					driver.findElement(By.cssSelector("#liMarket > a:nth-child(1)")).click();
							
							
					//Identify Webtable
					WebElement table=driver.findElement(By.xpath(".//*[@id='pnl_Bse']/table"));
							
					//Find number of rows available under table
					List<WebElement> rows=table.findElements(By.tagName("tr"));
					
					boolean flag=false;
					//Iterator for dynamic rows
					for (int i = 1; i < rows.size(); i++) 
					
					{
						
						WebElement dynamic_rows=rows.get(i);
						//In each dynamic row find set of cells
						List<WebElement> celss=dynamic_rows.findElements(By.tagName("td"));
						//Iterator for dynamic cells in each dynamic row
						for (int j = 0; j < celss.size(); j++)
						{
							//Target each cell 
						WebElement	each=celss.get(j);
						//accept condition on selected record
						if (each.getText().equals("WIPRO")) 
						{
							System.out.println("row number is --> "+i);
							System.out.println("celss number is --> "+j);
							flag=true;
							
							//Target required cell on using dynamic cells
                                celss.get(8).findElement(By.tagName("a")).click();
                                break;
						  }
                                
                                } //cells
						if(flag==true){
							break;
						
						}//rows
						System.out.println("Record available status is  "+flag);
					}



	}


		}
