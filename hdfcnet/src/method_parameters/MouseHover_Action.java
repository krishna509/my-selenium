package method_parameters;

import org.openqa.selenium.By;

public class MouseHover_Action {

	public static void main(String[] args) {
	Repository obj=	new Repository();
	obj.browser_launch("chrome");
	obj.load("https://www.amazon.in/");
	obj.settime(10);
	//Mouse hover on location
	obj.MouseHover(By.cssSelector("#nav-link-shopall > span.nav-line-2"));
	
	//Wait for element to visible at webpage
	obj.wait_for_elementTovisible(By.cssSelector("#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span:nth-child(16) > span"));
	 obj.MouseHover(By.cssSelector("#nav-flyout-shopAll > div.nav-template.nav-flyout-content.nav-tpl-itemList > span:nth-child(16) > span"));
	
		
		//wait for Element to visible
              obj.wait_for_elementTovisible(By.cssSelector("#nav-flyout-shopAll > div.nav-subcats > div:nth-child(15) > div > a:nth-child(7) > span"));
              obj.click(By.cssSelector("#nav-flyout-shopAll > div.nav-subcats > div:nth-child(15) > div > a:nth-child(7) > span"));
	}

}
