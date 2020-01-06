package excel_Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData_From_Multiple_Rows 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file location
		FileInputStream fi=new FileInputStream("TESTDATA\\InputData.xlsx");
		//Get Workbook using above location
		XSSFWorkbook book= new XSSFWorkbook(fi);
		//using the workbook getting the sheet
	XSSFSheet sht=	book.getSheet("Login_multiple");
	///Get Number of rows data available
	int rowcount=sht.getLastRowNum();
	//iterating the row 
	
	for (int i = 0; i <=rowcount; i++)
	{
		//Get Static CellData From dynamic row
		XSSFRow row=sht.getRow(i);
		 String username=row.getCell(0).getStringCellValue();
		 String pass=row.getCell(1).getStringCellValue();
		 System.out.println(username+"   "+pass);
		 		
	}
	
		
	}

}
