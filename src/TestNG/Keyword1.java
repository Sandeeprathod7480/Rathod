package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword1 
{	

	@Test(invocationCount=10)						//Test Case/Method
	public void TC1()
	{
		Reporter.log("Runnig TC1" ,true);
	}

}
