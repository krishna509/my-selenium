package excel_Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Excel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("TESTDATA\\InputData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(fi);
		System.out.println("workbook presented");
		//target references of the sheet
	XSSFSheet sh=	book.getSheet("config");
	//using the sheet we are targeting the rows
	XSSFRow row=sh.getRow(1);
	////usng row referral get Cell
	XSSFCell cell= row.getCell(0);
	String url=cell.getStringCellValue();
	System.out.println(url);
	//get browsername
	String bname= sh.getRow(0).getCell(1).getStringCellValue();
	System.out.println(" browser name is "+bname);
	
	//Get Cell using row referral
	Double bversion=row.getCell(2).getNumericCellValue();
	System.out.println("version"+bversion);
	
	System.out.println("  browser version to integer "+bversion.intValue());
	//System.out.println("  browser version to String "+bversion.toString());
		
	

  }
}

