package Launch_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_methods9 
{	
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
	
	    //To get the size of the browser	
		
	    Dimension	S1=driver.manage().window().getSize();
		
		System.out.println(S1);
		
		
	}

}
