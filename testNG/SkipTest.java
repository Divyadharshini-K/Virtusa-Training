package testNG;

import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(priority=0)
	public void start()
	{
		System.out.println("Start the car");
	}
	@Test(priority=1)
	public void first()
	{
		System.out.println("Put the first gear");
	}
	@Test(priority=2)
	public void second()
	{
		System.out.println("Put the second gear");
	}
	@Test(priority=3)
	public void third()
	{
		System.out.println("Put the third gear");
	}
	@Test(priority=4,enabled=false)
	public void music()
	{
		System.out.println("Turn on the music");
	}

}//enabled=false ==> skips the testcase