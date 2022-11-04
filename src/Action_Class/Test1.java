package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{	

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "\\D:\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver   driver=new 	ChromeDriver(); 
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement S1=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		Actions    A1=new   Actions(driver);
		
		Thread.sleep(2000);
		
		A1.moveToElement(S1).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Frames']")).click();
		
		
	}


}
