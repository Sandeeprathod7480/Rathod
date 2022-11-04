package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{	
	@Test						//Test Case/Method
	public void TC1()
	{
		Reporter.log("Runnig TC1" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC2()
	{
		Reporter.log("Runnig TC2" ,true);
	}

}
