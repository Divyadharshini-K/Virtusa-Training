package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
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

}//Executes in alphabetical order based on method name
//Priority is always a integer value to execute in the given order
//Priority is an parameter which accepts only integer values
