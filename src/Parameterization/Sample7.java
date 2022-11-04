package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample7 
{	
	//To get last Cell/Column Size
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{	
		//To navigate TO  Excel sheet
		
		FileInputStream file=new FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		short  CellSize=WorkbookFactory.create(file).getSheet("Sheet4").getRow(0).getLastCellNum();
		
		System.out.println(CellSize);
	
	
	
	
	}


}
