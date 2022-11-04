package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage1 
{	
	
		@FindBy(xpath="//input[@name='username']")    private	WebElement	UN;
		
		@FindBy(xpath="//input[@name='password']")	  private 	WebElement PSW; 
		
		@FindBy(xpath="//button[text()=' Login ']")	  private 	WebElement LoginBtn;
		
		
		public OrangeHRMLoginPage1(WebDriver   driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void EnterUsername()
		{
			UN.sendKeys("Admin");
		}
		public void EnterPassword()
		{
			PSW.sendKeys("admin123");
		}
		
		public void ClickLoginButton()
		{
			LoginBtn.click();
		}
}
