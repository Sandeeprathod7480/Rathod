package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 
{	// how to fetch/read/get/Retrive the data from Excel sheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To Naviagate To Excel Sheet
		
		FileInputStream    file=new 	FileInputStream ("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		//To Open Excel Sheet
		
		Workbook	S1=WorkbookFactory.create(file);
		
		//To Enter Perticular Sheet
	
		Sheet   Sh=S1.getSheet("Sheet1");
		
		//To Highlight Perticular Row
	
		Row  S2=Sh.getRow(0);
		
		//To Highlight Perticular Cell/Column
	
		Cell  S3=S2.getCell(0);
	
		//To Fetch String Information
	
		String   Value=S3.getStringCellValue();
	
			System.out.println(Value);
	
	}

}
