package connector;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ProjectSpecfiction extends Utilities {
	ExtentReports report;
	ExtentHtmlReporter htmlreport;
	ExtentTest test;
	
@BeforeTest
	public void openbrowser() {
	
		launchbrowser();
	}
@AfterTest
	public void close(){
		
		closebrowser();
	}

@BeforeSuite
public void startreport() {
	 report  = new ExtentReports();
    htmlreport = new ExtentHtmlReporter("./spicejet.html");
    report.attachReporter(htmlreport);
}
@AfterSuite
public void endreport() {
	
	report.flush();
	
}
public void switchToAlret() {
	driver.switchTo().alert().accept();
	
}

public void select( WebElement element,String Value) {
	Select select = new Select(element);
}
}
