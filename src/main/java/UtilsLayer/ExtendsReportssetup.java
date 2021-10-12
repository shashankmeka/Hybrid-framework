package UtilsLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Baseclass.Baseclass;

public class ExtendsReportssetup extends Baseclass{

	public static ExtentReports extent;
	public static ExtentSparkReporter sparkReport;
	public static ExtentTest extentTest;
		
		
		public static ExtentReports extentReportSetup() {
			
			sparkReport=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\abc.html");
			
			extent=new ExtentReports();
		
			extent.attachReporter(sparkReport);
			
			sparkReport.config().setTheme(Theme.STANDARD);
			
			sparkReport.config().setDocumentTitle("Test Automation Report");
		
			return extent;
}
}