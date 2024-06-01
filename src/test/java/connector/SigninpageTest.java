package connector;

public class SigninpageTest extends ProjectSpecfiction{

	public void signin() throws InterruptedException {
		
		SignInPage sign = new SignInPage(driver);
		
		sign.signinbutton();
		Thread.sleep(30);
	    sign.firstnamebox().lasttnamebox().emailbox().passwordlbox().conformpasswordbox().Checkbox().submitbutton();
		
		
	}
}
