package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
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
	
	@Test						//Test Case/Method
	public void TC3()
	{
		Reporter.log("Runnig TC3" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC4()
	{
		Reporter.log("Runnig TC4" ,true);
	}

}
