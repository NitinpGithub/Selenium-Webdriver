package MyListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllListeners  implements ITestListener{

	public void onTestStart(ITestResult result) {
		String test = result.getName();
		System.out.println(test+" Started");
		
	}

	public void onTestSuccess(ITestResult result) {
		String test = result.getName();
		System.out.println(test+" Success");
		
	}

	public void onTestFailure(ITestResult result) {
		String test = result.getName();
		System.out.println(test);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		String test = result.getName();
		System.out.println(test);
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
	}
	

}
