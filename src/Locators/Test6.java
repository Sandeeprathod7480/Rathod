package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//Wait
		Thread.sleep(5000);
		
		//Enter UserName
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("ABCD");
		
		//Enter PW
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 _6luy _9npi')]")).sendKeys("12345");
		
		
	}

}
