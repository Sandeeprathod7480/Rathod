package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Class 
{	
	@Test
	public void TC1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver            driver=new         ChromeDriver();
		
		//Wait
		Thread.sleep(5000);
		
		//To enter Url
		driver.get("https://kite.zerodha.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
