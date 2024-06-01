package connector;

import org.testng.annotations.Test;

public class HomepageTest extends ProjectSpecfiction{

	@Test
	public void executehome() {
		test = report.createTest("HomePage Test");
		HomePage home = new HomePage(driver);
	   home.switchToAlret();
	   home.signinbutton();
	 //  home.loginbutton();
	
   }
 }
