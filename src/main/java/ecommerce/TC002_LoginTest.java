package ecommerce;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002_LoginTest extends ProjectSpecifications{
	@BeforeTest
	public void setup() {
		excelFile = "Bool1";
		excelSheet = 1;
		
	}

	
	@Test(dataProvider = "readExcel")
	public void LoginTest(String email, String password, String firstname) {
		
		HomePage obj = new HomePage(driver);
		obj.login().email(email).password(password).submit(firstname);

	}
}
