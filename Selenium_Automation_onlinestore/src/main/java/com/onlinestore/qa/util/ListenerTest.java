package com.onlinestore.qa.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest extends TestUtil implements ITestListener {
	 @Override		
	    public void onFinish(ITestContext Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult Result) {					
	        System.out.println("Failure Occured" + Result);	
	        TestUtil.takesScreenshot(Result.getMethod().getMethodName());
	        		
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestStart(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult Result) {					
	        // TODO Auto-generated method stub				
	        		
	    }	
		
	
	
	
	
	
	
	
	
	
	
	
}
