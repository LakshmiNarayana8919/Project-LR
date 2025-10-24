package utilsClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseclass.Base1;

public class ExtentReport implements ITestListener{

	
	
	 public ExtentSparkReporter sparkreporter; 
	 public ExtentReports reports; 
	 public ExtentTest test;
	 
	 	public void onStart(ITestContext context) {
			sparkreporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\extentreport\\"+"Report1.html");
			sparkreporter.config().setDocumentTitle(" Testing Practise ");
			sparkreporter.config().setReportName(" Testing--1");
	     	sparkreporter.config().setTheme(Theme.STANDARD);
			
			reports= new ExtentReports();
			reports.attachReporter(sparkreporter);
			
			reports.setSystemInfo("environment", "Qc");
			reports.setSystemInfo("name", "rahul");
			reports.setSystemInfo("operating system", "windows 11");
			
		  }
		public void onTestSuccess(ITestResult result) {
		    test= reports.createTest(result.getName());
			test.log(Status.PASS, " Passed  ");
			
		  }
		
		public void onTestFailure(ITestResult result) {
		    test= reports.createTest(result.getName());
		    test.log(Status.FAIL, " Faild  "+result.getName());
		    test.log(Status.FAIL, result.getThrowable());
		    try {
		    	 String imagepath= new Base1().screenshots(result.getName());
		    	 test.addScreenCaptureFromPath(imagepath);
			} catch (Exception e) {
				e.getMessage();
			}
		     
		  }
		
		public void onTestSkipped(ITestResult result) {
		    test= reports.createTest(result.getName());
		    test.log(Status.SKIP, " skipped  "+ result.getName());
		    test.log(Status.SKIP, result.getThrowable());
			
		  }
		public void onFinish(ITestContext context) {
		   
			reports.flush();
		  }
		

	
}
