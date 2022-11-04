package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 
{	
	public static void main(String[] args) throws InterruptedException, IOException 
	{	

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(5000);
		
		File    Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println();
		
		File   Destination=new      File("E:\\Dream 10 LPA\\2.Automation Testing Notes\\Selenium\\Sept Selenium\\ScreenShot By Automation\\.Image3.jpg");
		
		FileHandler.copy(Source, Destination);
	}

}
