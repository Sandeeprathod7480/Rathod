package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods3 
{	
 	public static void main (String []args) throws InterruptedException 
 	{
 		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
 		
 		WebDriver       driver=new      ChromeDriver();
 		
	Thread.sleep(2000);
 		
 		driver.get("https://www.facebook.com");
 		
 		Thread.sleep(2000);
 		
 		driver.quit();
	Thread.sleep(2000);
 		
 		driver.get("https://www.facebook.com");
 		
 		Thread.sleep(2000);
 		
 		driver.quit();
 		
 		
 		
 		
 	}

}
