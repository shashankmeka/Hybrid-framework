package UtilsLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Baseclass.Baseclass;

public class ExtendsReportsetup extends Baseclass{

	public static ExtentReports extent;
	public static ExtentSparkReporter sparkReport;
	public static ExtentTest extentTest;
		
		
		public static ExtentReports extentReportSetup() {
			String dateName=new SimpleDateFormat("_ddMMyyyy_HHmmss").format(new Date());
			sparkReport=new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/sparkreport"+dateName+".html");
			
			extent=new ExtentReports();
		
			extent.attachReporter(sparkReport);
			
			sparkReport.config().setTheme(Theme.STANDARD);
			
			sparkReport.config().setDocumentTitle("Test Automation Report");
		
			return extent;
}
}
