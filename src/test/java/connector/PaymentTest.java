package connector;

import org.testng.annotations.Test;

public class PaymentTest extends ProjectSpecfiction {

	@Test
	public void payTest() {
		
		Payment pay = new Payment(driver);
		pay.Entertown().PrimePassenger().studentid().continues().cardNumber().cardName().monthnumber().yearnumber().cvvnumber().contipay();
	}
	
}
