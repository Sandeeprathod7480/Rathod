package Launch_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods10 
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		//To change the position of the browser
		Point      P1=new    Point(100,500);
		
		driver.manage().window().setPosition(P1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
