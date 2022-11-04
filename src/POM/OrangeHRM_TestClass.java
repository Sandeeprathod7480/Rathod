package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_TestClass 
{	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		OrangeHRMLoginPage1   Login1=new    OrangeHRMLoginPage1(driver);
		Login1.EnterUsername();
		Login1.EnterPassword();
		Login1.ClickLoginButton();
		
		OrangeHRMPIMPage1		PIM1=new   OrangeHRMPIMPage1(driver);
		
		PIM1.VerifyUserName();
		
		
	}

}
