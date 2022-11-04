package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{	

	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver      driver=new      ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///E:/Dream%2010%20LPA/2.Automation%20Testing%20Notes/Selenium/3.Octomber/Table1.html");
		
		Thread.sleep(2000);
		
		for (int i=1;  i<=3;  i++)
		{
			
			WebElement	S1=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td["+i+"]"));
			
			String S2=S1.getText();
			
			System.out.print(S2+" ");
		}
		
	
	}

}
