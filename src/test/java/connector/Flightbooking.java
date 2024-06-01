package connector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flightbooking extends ProjectSpecfiction{

	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div") public static WebElement from;
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/inputq1") public static WebElement to;
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div")public static WebElement date;
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[7]/div[2]/div")public static WebElement fightsearch;
	@FindBy(xpath="//*[@id=\"main-container\"]/div/div[1]/div[5]/div/div/div[2]/div[2]")public static WebElement continues;
	
      public Flightbooking (WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver = driver;
		}
      public Flightbooking fromplace() {
    	  from.sendKeys("Delhi");
		return this;
      }
      
      public Flightbooking toplace() {
    	  to.sendKeys("Chennai");
		return this;
      }
      public Flightbooking fromdate() {
    	  date.click();
		return this;  
		}
      public Flightbooking searchflight() {
    	  fightsearch.click();
		return this; 
    }
      public Flightbooking countinuebutton() {
    	  continues.click();
		return this;
      }
 }
