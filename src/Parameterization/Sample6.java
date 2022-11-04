package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample6
{	
	//To get last row Size
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{	
			//To navigate TO  Excel sheet
			
			FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
			
			int   RowSize=WorkbookFactory.create(file).getSheet("Sheet4").getLastRowNum()+1;
			
			System.out.println(RowSize);
		
		
		
		
		}

}
