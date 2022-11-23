package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Assertions {

	String name = "Divya";
	boolean flag = false;
	
	@Test
	public void checkEqual()
	{
		Assert.assertEquals(name, "Divya"); 
		//Assert.assertNotSame(name, "Divya");
		//Assert.assertFalse(name, flag);
		//Assert.assertTrue(flag);
	}
}
