package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 
{	// how to fetch/read/get/Retrive the data from Excel sheet (Numeric data)
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To navigate TO  Excel sheet
		
		FileInputStream   file=new		FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		double Value=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		
		System.out.println(Value);
	}

}
