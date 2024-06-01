package connector;

public class LoginTest extends ProjectSpecfiction {

	public void  loginpageTest() {
		
		LoginPage login = new LoginPage(driver);
		
		login.loginbutton();
		login.loginusernumber().loginuserpassword().loginbutton();
	}
}
