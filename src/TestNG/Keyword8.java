package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword8 
{	

	@Test					//Test Case/Method
	public void login() throws InterruptedException
	{	
		
		Reporter.log("Runnig TC1" ,true);
	}
	
	@Test	(dependsOnMethods= {"login"})					//Test Case/Method
	public void Logout()
	{
		Reporter.log("Runnig TC2" ,true);
	}


}
