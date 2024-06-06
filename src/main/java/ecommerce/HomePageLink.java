package ecommerce;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLink extends ProjectSpecifications{

	@FindBy(className = "us-link")
	WebElement choosecountry;
	
	public HomePageLink(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void bottomlink() {
		
		click(choosecountry);
		
		List<WebElement> bottomlinks = driver.findElements(By.xpath("//li[@class='body-copy']"));
		
		
		
		
	}
}
