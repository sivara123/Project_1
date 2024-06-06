package ecommerce;

import java.io.IOException;

import org.testng.annotations.Test;

public class TC007_LinkIsNotBrokenTest extends ProjectSpecifications{

	@Test
	public void LinkIsNotBrokenTest() throws IOException {
		
		HomePage obj = new HomePage(driver);
		obj.linkstatuscheck("https://www.bestbuy.com/");

	}
}
