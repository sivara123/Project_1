package ecommerce;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC008_MenuValidation extends ProjectSpecifications {

	@BeforeTest
	public void setup() {
		excelFile = "TestData";
		excelSheet = 2;
	}

	@Test(dataProvider = "readExcel")
	public void menuValidation(String menu, String expTitle) {
		
		HomePage obj = new HomePage(driver);
		obj.menuValidation(menu, expTitle);

	}
}
