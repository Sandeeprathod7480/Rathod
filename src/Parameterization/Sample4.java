package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample4 
{	
	// how to fetch/read/get/Retrive the data from Excel sheet (true false/ boolean data)
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{	
			//To navigate TO  Excel sheet
			
			FileInputStream   file=new		FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
			
			boolean  Value=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
			
			System.out.println(Value);
		}


}
