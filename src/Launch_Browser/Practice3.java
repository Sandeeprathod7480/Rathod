package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 
{	
	public static void main (String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver            driver=new         ChromeDriver();
		
		
		//Wait
		Thread.sleep(5000);
		
		
		
		//To enter Url
		driver.get("https://kite.zerodha.com");
		
		
		
		
		
		
		
	}

}
