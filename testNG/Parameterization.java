package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	public void name()
	{
		System.out.println("Name is "+"Divya");
	}
	
	@Test
	@Parameters("Name")
	public void readName(String name)
	{
		System.out.println("Name is "+name);
	}
}
//It gives error but output is displayed when xml fie runs as parameter is passed through the xml file