package hdfcnet;

import org.openqa.selenium.ie.InternetExplorerDriver;


public class launch_InternetExplorer {

	public static void main(String[] args)
	{
	InternetExplorerDriver ie=new InternetExplorerDriver();
	ie.get("http://facebook.com");
	}

}
