package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method5 
{	

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		WebElement     Radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		boolean      S1=Radio.isSelected();
		
		System.out.println(S1);
		
	}
		

}
