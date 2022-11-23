package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	//ITestListener is an interface
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test case is going to execute");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case is passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case is failed");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case is skipped");
	}
	
	public void OnTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		System.out.println("Partial Success");
	}
	public void onStart(ITestContext context)
	{
		System.out.println("Before Everything");
	}
	
	public void onFinish(ITestContext context)
	{
		System.out.println("After Everything");
	}

}
