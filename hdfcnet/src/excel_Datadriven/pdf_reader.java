package excel_Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class pdf_reader {

	public static void main(String[] args) throws IOException 
	{
		 File file=new File("C:\\Users\\HanuNishu\\Desktop\\3 by7 Inch Boarding Pass.pdf");
		 FileInputStream fi= new FileInputStream(file);
		 System.out.println("file found");
		 PDFParser parser =new PDFParser(fi);
		 parser.parse();
	COSDocument cosoc=	 parser.getDocument();
	PDDocument pddoc = new PDDocument(cosoc);
	PDFTextStripper strip=    new PDFTextStripper();
	 String data=strip.getText(pddoc);
	 System.out.println(data);
	
	
		 
		 

	}

}
