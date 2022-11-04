package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{	

	public static void main(String []args ) throws InterruptedException
	{

 		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
 		
 		WebDriver       driver=new      ChromeDriver();
 		
 		Thread.sleep(5000);
 		
 		driver.get("https://www.facebook.com");
 		
 		Thread.sleep(2000);
 		
 		//Click on login button
 		driver.findElement(By.xpath("//button[@name='login']")).click();
 		
	}

}
