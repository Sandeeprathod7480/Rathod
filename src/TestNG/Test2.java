package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 
{	
	@Test						//Test Case/Method
	public void TC3()
	{
			//Assert.fail();
		Reporter.log("Runnig TC3" ,true);
	}
	
	@Test						//Test Case/Method
	public void TC4()
	{
		Reporter.log("Runnig TC4" ,true);
	}


}
