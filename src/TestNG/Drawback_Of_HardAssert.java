package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Drawback_Of_HardAssert 
{	
	@Test
	public void TC1()
	{
	String  S1="Hi";
	
	String  S2="Hello";
	
	String  S3="Good Morning";
	
	Assert.assertNotEquals(S2, S1);    //pass
	
	Assert.assertEquals(S2, S1);		//fail
	
	Assert.assertEquals(S3, S1);			//fail
	
	Assert.assertNotEquals(S1, S3);			//pass
	}
		
	

}
