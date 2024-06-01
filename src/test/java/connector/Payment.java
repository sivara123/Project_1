package connector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends ProjectSpecfiction {

	@FindBy(xpath="//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input") public static WebElement town;
	@FindBy(xpath="//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[1]/div/div/div/div[1]/svg/g/path") public static WebElement primepass;
	@FindBy(xpath="//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[4]/div/div[2]/div[2]/div/div[2]/input") public static WebElement student;
	@FindBy(xpath="//*[@id=\"travellers-view\"]/div[2]/div/div/div[2]") public static WebElement continues1;
	@FindBy(xpath="//*[@id=\"card_number\"]")public static WebElement Card; 
	@FindBy(xpath="//*[@id=\"name_on_card\"]")public static WebElement Carduser; 
	@FindBy(xpath="//*[@id=\"card_exp_month\"]")public static WebElement month; 
	@FindBy(xpath="//*[@id=\"card_exp_year\"]")public static WebElement year; 
	@FindBy(xpath="//*[@id=\"security_code\"]")public static WebElement cvv;
	@FindBy(xpath="//*[@id=\"prepayment-container\"]/div[2]/div/div[2]/div")public static WebElement pay;
	
public Payment(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver = driver;
		}
	
public Payment Entertown() {
	town.sendKeys("Chennai");
	return this;
}
public Payment PrimePassenger() {
	primepass.click();
	return this;
}
public Payment studentid() {
	student.sendKeys("123456789");
	return this;
}
public Payment continues() {
	continues1.click();
	return this;
}
public Payment cardNumber() {
Card.sendKeys("1234567890123456");
	return this;
}
public Payment cardName() {
Carduser.sendKeys("siva");
	return this;
}
public Payment monthnumber() {
month.sendKeys("06");
	return this;
}
public Payment yearnumber() {
year.sendKeys("2024");
	return this;
}
public Payment cvvnumber() {
cvv.sendKeys("224");
	return this;
}
public Payment contipay() {
pay.click();
	return this;
}
}
