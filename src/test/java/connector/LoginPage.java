package connector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProjectSpecfiction{

	@FindBy(partialLinkText ="//div[text()='Login']") public static WebElement loginclick;
	@FindBy(className="user-mobileno-input-box") public static WebElement loginuserno;
	@FindBy(className="user-mobileno-input-box") public static WebElement loginuserpass;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public LoginPage loginbutton() {
		loginclick.click();
		return this;
	}
	
	public LoginPage loginusernumber() {
		loginuserno.sendKeys("123416789");
		return this;
	}
	public LoginPage loginuserpassword() {
		loginuserno.sendKeys("siva@123");
		return this;
    }
 }
