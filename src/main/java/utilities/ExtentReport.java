package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
  
public static ExtentReports getReport() {
		
	String path="./reports/report.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Spicejet Reporter");
	reporter.config().setDocumentTitle("Spicejet Reporter title");
	
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(reporter);
	
	return extent;


		
	}
	
	
}
