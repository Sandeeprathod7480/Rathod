package POM_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.OrangeHRMLoginPage1;
import POM.OrangeHRMPIMPage1;

public class TEST 
{	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream   file=new		FileInputStream("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Parameterization\\11_June_Morning.xlsx");
		
		Thread.sleep(5000);

		Sheet Sh=WorkbookFactory.create(file).getSheet("Sheet6");
			
		Thread.sleep(5000);
		
		POM1   Login1=new    POM1(driver);
		
		Thread.sleep(5000);

		String   username=Sh.getRow(0).getCell(0).getStringCellValue();
		Login1.EnterUsername(username);
		
		Thread.sleep(5000);

		
		String  Password=Sh.getRow(0).getCell(1).getStringCellValue();	
		
		Login1.EnterPassword(Password);

		Thread.sleep(5000);

		Login1.ClickLoginButton();
		
		Thread.sleep(5000);
		
		POM2		PIM1=new   POM2(driver);
		Thread.sleep(5000);

		String Verify=Sh.getRow(0).getCell(2).getStringCellValue();
		
		PIM1.VerifyUserName(Verify);
		
		Thread.sleep(5000);

		driver.close();
		
		
	}

}
