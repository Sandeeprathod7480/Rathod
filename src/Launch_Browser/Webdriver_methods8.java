package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods8 
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		//To set the size of the browser
		
		Dimension       D1=new      Dimension(400,700);
		
		driver.manage().window().setSize(D1);
		
		
		
		
		
		
	}

}
