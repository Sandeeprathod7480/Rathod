package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods5 
{	
		
	 	public static void main (String []args) throws InterruptedException
	 	{
	 		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
	 		
	 		WebDriver       driver=new      ChromeDriver();
	 		
	 		Thread.sleep(5000);
	 		
	 		driver.get("https://www.facebook.com");
	 		
	 		Thread.sleep(5000);
	 		
	 		//To Get title of the web page
	 		
	        String Title1=driver.getTitle();
	 		System.out.println(Title1);
	 		
	 		
	 		
	 		
	 	}

}
