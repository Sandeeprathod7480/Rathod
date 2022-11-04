package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 
{	
	@Test
	public void TC1()
	{
		SoftAssert    soft=new      SoftAssert();
	String  S1="Hi";
	
	String  S2="Hello";
	
	String  S3="Good Morning";
	
	soft.assertEquals(S2, S1);		//fail
	
	soft.assertNotEquals(S2, S1);    //pass
	
	
	soft.assertEquals(S3, S1);			//fail
	
	soft.assertNotEquals(S1, S3);			//pass
	
	soft.assertAll();
	}
	

}
