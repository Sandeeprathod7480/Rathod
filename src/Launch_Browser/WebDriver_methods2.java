package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods2 
{	
	public static void main (String [] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver     driver=new     ChromeDriver();
		
		//Wait
		Thread.sleep(5000);
		
		//To open an application /enter url
		driver.get("https://www.facebook.com");
		
		//Wait
		Thread.sleep(2000);
		
		//To close current tab of the browser
		driver.close();
		
	}

}
