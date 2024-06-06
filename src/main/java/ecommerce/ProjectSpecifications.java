package ecommerce;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecifications extends Utilies{
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void launchBrowser(String browser, String url) {
		browserLaunch(browser,url);
		}
	
	@DataProvider(name = "Excel")
	public String[][] getExceldata() throws IOException {
		String[][] data = readExcel(excelFile, excelSheet);
	return data;
	
	}
		}