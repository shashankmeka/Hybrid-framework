package TestLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import UtilsLayer.ExtendsReportsetup;
import UtilsLayer.Screenshot;

public class ExtendReportListener extends ExtendsReportsetup implements ITestListener{

	public void onTestStart(ITestResult result) {
		extentReportSetup();
		System.out.println(result.getMethod().getMethodName()+" ==========Test Started============");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed test : "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test : "+result.getMethod().getMethodName());
		Screenshot sc=new Screenshot ();
		sc.FailedScreenshot(result.getMethod().getMethodName());
		extentTest.log(Status.FAIL, result.getThrowable());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped test case : "+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		 extent.flush();	
		System.out.println("*****************  Test Done **********************");
	}

}
