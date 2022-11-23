package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	//Admit a student in engineering
	
	@Test(enabled=true)
	public void highSchool()
	{
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary()
	{
		System.out.println("High Secondary School");
	}
	
	@Test(dependsOnMethods="higherSecondary")
	public void engineering()
	{
		System.out.println("Engineering");
	}
}
