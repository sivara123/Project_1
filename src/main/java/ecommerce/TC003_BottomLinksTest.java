package ecommerce;

import org.testng.annotations.Test;

public class TC003_BottomLinksTest extends ProjectSpecifications{
	@Test
	public void BottomLinksTest() {
		
		HomePageLink obj = new HomePageLink(driver);
		obj.bottomlink();

	}
}
