package ecommerce;

import org.testng.annotations.Test;

public class TC005_ShopByDepartmentTest extends ProjectSpecifications{

	@Test
	public void Shopbydept() {
		
		HomePage obj = new HomePage(driver);
		obj.shopbydepartment().shopbydept().selectitem();
		obj.addToCart().addToCartAssertion();

	}
}
