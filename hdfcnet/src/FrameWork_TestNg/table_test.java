package FrameWork_TestNg;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import UserDefined_keyward.Repository;

public class table_test {
	Repository obj =new Repository();
	@Test(priority=0)
 public void url(){
		
		obj.browser_launch("chrome");
		obj.load("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		obj.settime(20);
	}
	@Test(priority=1)
	public void tableaddress(){
		obj.Get_Table_CellAddress("//*[@id='tab-container-3']", 6, 1).getText();
		
	}
	@Test(priority=3)
	public void Dynamic_CellAdress(){
		obj.Webtable_Dynamic_CellAdress("//*[@id='tab-container-3']", "TATMOT", 8).findElement(By.tagName("a")).click();
	}
}
                 