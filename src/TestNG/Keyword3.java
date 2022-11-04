package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword3 
{	

	@Test	(priority=2)					//Test Case/Method
	public void TC1()
	{
		Reporter.log("Runnig TC1" ,true);
	}
	
	@Test	(priority=1)					//Test Case/Method
	public void TC2()
	{
		Reporter.log("Runnig TC2" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC3()
	{
		Reporter.log("Runnig TC3" ,true);
	}
	

}
