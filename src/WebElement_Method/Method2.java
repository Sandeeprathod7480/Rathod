package WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method2 
{
		

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver      driver=new        ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com");
		
		Thread.sleep(2000);
		
		//Get text of forgot password link
		
		WebElement	Password=driver.findElement(By.xpath("//a[text()='Forgot user ID or password?']"));
		
		//get the text
		
		String     S1=Password.getText();
		
		System.out.println(S1);
	}

}
