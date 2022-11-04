package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample12 
{	
	//To fetch the Whole Data From Excel Sheet
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		
		FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		int	LastRowIndex=Sh.getLastRowNum();
		
		//Take Outer for loop for Row
		for  (int i=0;  i<=LastRowIndex;  i++)
		{
			int LastCellIndex=Sh.getRow(i).getLastCellNum()-1;
			
			
			//Take inner For loop for Cell
			for (int a=0;  a<=LastCellIndex;   a++)
			{
				String  Value=Sh.getRow(i).getCell(a).getStringCellValue();
				System.out.print(Value+" ");
			}
		System.out.println();
		}
		
		
		
		
		
		
	}

}
