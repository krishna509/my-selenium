package hydrib_framework;

import org.openqa.selenium.By;

public class excel_locators_class
{
	public static By excel_locator(String proname,String provalue)
	{
		By obj=null;
		switch (proname) {
		case "xpath":
			obj=By.xpath(provalue);
		case "id":
			obj=By.xpath(provalue);
		case"css":
			obj=By.xpath(provalue);
			
			break;

		default:
			break;
		}
		return obj;
		
	}

}
