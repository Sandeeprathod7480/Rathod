package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{	
	@Test						//Test Case/Method
	public void TC5()
	{
		Reporter.log("Runnig TC5" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC6()
	{
		//Assert.fail();
		Reporter.log("Runnig TC6" ,true);
	}


}
