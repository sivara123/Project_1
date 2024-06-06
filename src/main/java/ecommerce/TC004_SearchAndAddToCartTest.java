package ecommerce;

import org.testng.annotations.Test;

public class TC004_SearchAndAddToCartTest extends ProjectSpecifications{

	@Test
	public void SearchandAddToCart() {
		
		HomePage obj = new HomePage(driver);
		obj.searchandadd().search("samsung galaxy s23");
		obj.addToCart().addToCartAssertion();


	}

}
