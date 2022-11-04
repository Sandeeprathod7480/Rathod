package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 
{	
	public static void main(String []args ) throws InterruptedException
	{

 		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
 		
 		WebDriver       driver=new      ChromeDriver();
 		
 		Thread.sleep(5000);
 		
 		driver.get("https://www.Google.com");
 		
 		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
 	
	}
}
