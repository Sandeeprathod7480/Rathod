package Launch_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser2 
{	
	//How to launch /open Browser/ How to communicate with browser
	
	
		public static void main(String[] args) 
		{
			// Parameter 1= Name of the browser (Small letter)
			// Parameter 2= Path of the browser (ChromeDriver.exefile) (Convert \ to \\)
			
			System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver_win32\\chromedriver.exe\\");
			
			// Create object of the ChromeDriver Class
			
			WebDriver   driver=new 	ChromeDriver();  //Class name    object name=new  	Class name();
			
		}

}
