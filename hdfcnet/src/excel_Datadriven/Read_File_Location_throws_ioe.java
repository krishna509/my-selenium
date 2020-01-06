package excel_Datadriven;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_File_Location_throws_ioe {

	public static void main(String[] args) throws IOException 
	
	{
		FileInputStream fi= new FileInputStream("TESTDATA\\InputData.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fi);
	System.out.println("work book available");
		
	}

}
