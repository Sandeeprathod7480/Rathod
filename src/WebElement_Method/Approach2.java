package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approach2 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		
		WebElement  UserName=driver.findElement(By.xpath("//input[@id='userid']"));
		
		Thread.sleep(2000);
		
		UserName.sendKeys("ABCD");
		
		Thread.sleep(2000);
		
		UserName.clear();
		
		Thread.sleep(2000);
		
		UserName.sendKeys("12Ab");
		
	}

}
