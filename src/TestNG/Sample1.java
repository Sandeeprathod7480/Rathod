package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 
{
	@Test  
	public void TC1()
	{
		String  ExpectedResult="Hi";
		
		String  ActualResult="Hi";
		
		Assert.assertEquals(ExpectedResult, ActualResult);
		
	}
	@Test  
	public void TC2()
	{
		String  ExpectedResult="Hi";
		
		String  ActualResult="Hello";
		
		Assert.assertEquals(ExpectedResult, ActualResult);
		
	}
	
	
}
