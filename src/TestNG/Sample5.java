package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample5 
{	
	@Test
	public void TC1()
	{
		String Str=null;
		
		Assert.assertNull(Str);
	}
	
	@Test
	public void TC2()
	{
		String Str="ABCD";
		
		Assert.assertNull(Str);
	}

}
