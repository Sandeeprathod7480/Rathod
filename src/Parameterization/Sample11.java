package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample11 
{	
	//To fetch the perticular information of Cell/Column
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To fetch the perticular information of row
		
		FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int	LastRowNum=Sh.getLastRowNum();
		System.out.println(LastRowNum);
		
		for (int i=0;  i<=LastRowNum;   i++)
		{
		String S1=Sh.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println(S1);
		}
		
		
	}

}
