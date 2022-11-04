package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 
{	

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver   driver=new 	ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement	S1=driver.findElement(By.xpath("driver.findElement(By.xpath(null))"));
		
		Thread.sleep(5000);
		
		WebElement  S2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		Thread.sleep(5000);
		
		Actions    A1=new    Actions(driver);  

		Thread.sleep(5000);
		
		A1.dragAndDrop(S1, S2).perform();
		
		
		
		
	}
	

}
