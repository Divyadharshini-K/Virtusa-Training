package testNG;

import org.testng.annotations.Test;

public class Grouping {
	
	//There are 8 test cases and I am going to run apple and vivo test cases here
	//Multiple commands can be given in groups separated by commas

	@Test(groups= {"Apple"})
	public void apple1()
	{
		System.out.println("Apple Testing");
	}
	
	@Test(groups= {"Apple"})
	public void apple2()
	{
		System.out.println("Apple Testing");
	}
	
	@Test(groups= {"Moto"})
	public void moto1()
	{
		System.out.println("Moto Testing");
	}
	
	@Test(groups= {"Moto"})
	public void moto2()
	{
		System.out.println("Moto Testing");
	}
	
	@Test(groups= {"Vivo"})
	public void vivo1()
	{
		System.out.println("Vivo Testing");
	}
	
	@Test(groups= {"Vivo"})
	public void vivo2()
	{
		System.out.println("Vivo Testing");
	}
	
	@Test(groups= {"Oppo"})
	public void oppo1()
	{
		System.out.println("Oppo Testing");
	}
	
	@Test(groups= {"Oppo"})
	public void oppo2()
	{
		System.out.println("Oppo Testing");
	}
}
