package hydrib_framework;

import org.testng.annotations.Test;

public class helper_testdata 
{
	@Test(priority=0)
	public static void application()
	{
		Helper_class.excel_helper_class("Excel_inputdata.xls", "url");
		
	}
	@Test(priority=1)
	public static void adminlogin()
	{
		Helper_class.excel_helper_class1("Excel_inputdata.xls", "Admin", "Admin home page");
		
	}
	@Test(priority=2)
	public static void branch()
	{
		Helper_class.excel_helper_class1("Excel_inputdata.xls", "branches", "branch home page");
		
	}
	@Test(priority=3)
	public static void roles()
	{
		Helper_class.excel_helper_class1("Excel_inputdata.xls", "roles", "roles home page");
		
	}
	@Test(priority=3)
	public static void users()
	{
		Helper_class.excel_helper_class1("Excel_inputdata.xls", "users", "user home page");
		
	}
	
	
	

}
