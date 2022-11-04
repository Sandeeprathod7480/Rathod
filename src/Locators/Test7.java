package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Wait
		Thread.sleep(5000);
		
		//Click on forgotten link
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		
		
		
	}

}
