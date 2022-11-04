package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample8 
{	
	//To get last Cell/Column Index
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{	
			//To navigate TO  Excel sheet
			
			FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
			
			int  CellIndex=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum()-1;
			
			System.out.println(CellIndex);
		
		
		
		
		}


}
