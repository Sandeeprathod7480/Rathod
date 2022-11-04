package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method1 
{	
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']")).click();
	}

}
