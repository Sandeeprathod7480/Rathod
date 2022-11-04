package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe5 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		//Wait
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Wait
		Thread.sleep(2000);
		
		//Switch to frame (WebElement)
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		
		//Wait
		Thread.sleep(2000);
		
		//Click me to display Date and Time
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Wait
		Thread.sleep(2000);
		
		//Switch to main page
		driver.switchTo().defaultContent();
		
		//Wait
		Thread.sleep(2000);
		
		//Click on Home Button
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
	}

}
