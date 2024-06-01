package connector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class SignInPage extends ProjectSpecfiction {

	@FindBy(partialLinkText ="//div[text()='Signup']") public static WebElement signinclick;
	@FindBy(id="first_name") public static WebElement firstname;
	@FindBy(id="last_name") public static WebElement lastname;
	@FindBy(id="email_id") public static WebElement email; 
	@FindBy(id="new-password") public static WebElement pass;
	@FindBy(id="c-password") public static WebElement conpass;
	@FindBy(id="defaultCheck1") public static WebElement chebox;
	@FindBy(partialLinkText="Submit") public static WebElement submit;

	public SignInPage (WebDriver driver){
		PageFactory.initElements(driver,this );
		this.driver = driver;
	}
	public SignInPage signinbutton() {
		signinclick.click();
		return this;
	}
	
	public SignInPage firstnamebox() {
		firstname.sendKeys("siva");
		return this;
	}
	public SignInPage lasttnamebox() {
		lastname.sendKeys("M");
		return this;
	}
	public SignInPage emailbox() {
		email.sendKeys("siva123@gmail.com");
		return this;
	}
	
	public SignInPage passwordlbox() {
		pass.sendKeys("siva@123");
		return this;
	}
	public SignInPage conformpasswordbox() {
		conpass.sendKeys("siva@123");
		return this;
	}
	public SignInPage Checkbox() {
		chebox.isEnabled();
		return this;
	}
	public SignInPage submitbutton() {
		submit.submit();
		return this;
	}
	
}
