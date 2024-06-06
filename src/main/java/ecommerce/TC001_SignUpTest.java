package ecommerce;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_SignUpTest extends ProjectSpecifications{

	@BeforeTest
	public void setup() {
		excelFile = "Excel";
		excelSheet = 0;
	}

	@Test(dataProvider = "readExcel")
	public void SignUpTest(String fname, String lname, String email, String password, String phonenumber) {
		
		HomePage obj = new HomePage(driver);
		obj.signup().firstname(fname).lastname(lname).email(email).password(password).phone(phonenumber).submit(fname);

	}
}
