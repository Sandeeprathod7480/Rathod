package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Sample3 
{
	@Test
	public void TC1()
	{
		boolean ActualResult=true;
		
		Assert.assertTrue(ActualResult);
	}

	@Test
	public void TC2()
	{
		boolean ActualResult=false;
		
		Assert.assertTrue(ActualResult);
	}
}
