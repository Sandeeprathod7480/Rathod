package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods4 
{	
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver    driver=new   ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.flipkart.com");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
