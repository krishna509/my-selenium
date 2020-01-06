package excel_Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_File_Location 
{

	public static void main(String[] args) 
	{
		
		
		
		try {
			
			
			//Target file location
			FileInputStream fi=new FileInputStream("TESTDATA\\InputData.xlsx");
			//Open Existing Workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
		
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		/*
		 * try catch catpure exception and cotinue run for next steps.
		 */
		System.out.println("Script Continued");
	}

}
