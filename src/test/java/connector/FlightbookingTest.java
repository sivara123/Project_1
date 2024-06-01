package connector;

import org.testng.annotations.Test;

public class FlightbookingTest extends ProjectSpecfiction {

	@Test
	public void flightTest() {
		Flightbooking flight = new Flightbooking(driver);
		
		flight.fromplace().toplace().fromdate().searchflight().countinuebutton();
	}
}
