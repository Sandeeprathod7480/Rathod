package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Wait
		Thread.sleep(5000);
		
		//Click on create new account button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(5000);
		
		//Enter first name
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Sandeep");
			
	}



}
