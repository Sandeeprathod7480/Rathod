package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods7 
{	

 	public static void main (String []args) throws InterruptedException
 	{
 		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
 		
 		WebDriver       driver=new      ChromeDriver();
 		
 		Thread.sleep(5000);
 		
 		driver.get("https://www.facebook.com");
 		
 		Thread.sleep(5000);
 		
 		//TO maximize the browser
 		
 		driver.manage().window().maximize();
 		
 		Thread.sleep(5000);
 		
 		//To minimize the browser
 		
 		driver.manage().window().minimize();
 		
 	
 		
 	}

}
