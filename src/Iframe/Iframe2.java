package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//Switch to frame (String frame id)
		driver.switchTo().frame("iframeResult");
		
		//Click me to display Date and Time
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
	}

}
