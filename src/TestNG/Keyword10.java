package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword10 
{	
	@Test(enabled=false)					//Test Case/Method
	public void TC1() throws InterruptedException
	{	
		Thread.sleep(5000);
		Reporter.log("Runnig TC1" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC2()
	{
		Reporter.log("Runnig TC2" ,true);
	}


}
