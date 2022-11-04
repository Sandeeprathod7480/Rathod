package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPIMPage1 
{	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")	private 	WebElement	UserName;
	
	public OrangeHRMPIMPage1(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyUserName()
	{
		String ExpextedResult="Paul Collings";
		
		String ActualResult=UserName.getText();
		
		if(ExpextedResult.equals(ActualResult))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	

}
