package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{	

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver   driver=new 	ChromeDriver(); 
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Thread.sleep(2000);
		
		WebElement S1=driver.findElement(By.xpath("//span[text()='Cart']"));
		
		Actions    A1=new   Actions(driver);
		
		Thread.sleep(2000);
		
		A1.click(S1).perform();
		
		
		
	}


}
