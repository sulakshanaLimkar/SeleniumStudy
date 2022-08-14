package testNGListener_new;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteAppBaseClass.BaseClassUsingProperty;

public class Listener implements ITestListener 
{
	BaseClassUsingProperty b=new BaseClassUsingProperty();  //created object of Base class
	
	//onTestPass
	//onTestFail
	//onTestSkipp
	
	@Override
	public void onTestFailure(ITestResult result) {
	
		String TCName = result.getName();
		
		try {
			b.takeScreenshot(TCName);
		} catch (IOException e) {
			// TODO: handle exception
		
		e.printStackTrace();
		
		Reporter.log("TC execution is failed "+result.getTestName(), true);
		
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Success TC name is "+result.getTestName(), true);
	
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		Reporter.log("Skipped TC is "+result.getTestName(), true);
	ITestListener.super.onTestSkipped(result);
	
	}

}
