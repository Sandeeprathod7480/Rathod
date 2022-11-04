package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample6 
{	
	@Test
	public void TC1()
	{
		String Str="abcd";
		
		Assert.assertNotNull(Str);
	}
	
	@Test
	public void TC2()
	{
		String Str=null;
		
		Assert.assertNotNull(Str);
	}

}
