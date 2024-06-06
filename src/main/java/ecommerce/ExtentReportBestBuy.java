package ecommerce;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportBestBuy {

public static ExtentReports getReport() {
		
		String path = "C:\\Users\\laksh\\eclipse-workspace\\SpiceJet\\src\\main\\resources\\Report.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("BestBuy Report");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;

		}
}
