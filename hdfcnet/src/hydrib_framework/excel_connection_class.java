package hydrib_framework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class excel_connection_class 
{
	public static XSSFWorkbook wbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static String path ="TESTDATA\\";
	public static void excel_connection(String filename,String sheetname)
	{
		try {
			FileInputStream fi= new FileInputStream(path+filename);
			wbook= new XSSFWorkbook(fi);
			sheet=wbook.getSheet(sheetname);
			
			
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
		public static String excel_rows(int row,int cell)
		{
			return sheet.getRow(row).getCell(cell).getStringCellValue();
			
		}
		
	}
	
	


