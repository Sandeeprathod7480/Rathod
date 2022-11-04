package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample10 
{	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To fetch the perticular information of row
		
		FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int S1=Sh.getRow(0).getLastCellNum()-1;
		System.out.println(S1);
		
		for  (int i=0;  i<=S1;  i++)
		{
		String 	S2=Sh.getRow(0).getCell(i).getStringCellValue();
		System.out.println(S2);
		}
		
	}

}
