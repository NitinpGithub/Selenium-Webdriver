package TestNg;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practise {

	boolean b=false;
	@BeforeMethod
	public void beforeMethod()
	{
		if(b)
		{
			throw new SkipException("Skipping test");
		}
	}
	@Test
	public void t1()
	{
		System.out.println("Test 1 start..");
		System.out.println("Test 1 end");
		
	}
	@Test
	public void t2()
	{
		System.out.println("Test 2 start..");
		assert false:"Test2 failed";
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			b=true;
		}
	}

}
