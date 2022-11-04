package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		WebElement      Month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Thread.sleep(5000);
		
		Select          S2=new         Select(Month);
		
		Thread.sleep(5000);
		
		S2.selectByValue("6");
		
		
		
		
	}
	

}
