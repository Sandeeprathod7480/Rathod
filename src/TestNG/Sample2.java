package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 
{	
	@Test
	public void TC1()
	{
		String  ExpectedResult="Hello";
		
		String  ActualResult="Hi";
		
		Assert.assertNotEquals(ExpectedResult, ActualResult);
		
	}
	

	@Test
	public void TC2()
	{
		String  ExpectedResult="Hi";
		
		String  ActualResult="Hi";
		
		Assert.assertNotEquals(ExpectedResult, ActualResult);
		
	}


}
