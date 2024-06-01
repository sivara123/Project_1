package connector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ProjectSpecfiction{
	
	@FindBy(partialLinkText ="//div[text()='Signup']") public static WebElement signinclick;
	
	@FindBy(partialLinkText ="//div[text()='Login']") public static WebElement loginclick;

	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver = driver;
		}
	
public HomePage signinbutton() {
	signinclick.click();
	return this;	
}
public HomePage loginbutton() {
	loginclick.click();
	return this;
}
}
