package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample9 
{	
	//To read numeric information as a String
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		FileInputStream     file=new     FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
	String	Value=WorkbookFactory.create(file).getSheet("Sheet5").getRow(0).getCell(0).getStringCellValue();
			
	System.out.println(Value);
	
	}

}
