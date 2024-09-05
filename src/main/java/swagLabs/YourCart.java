package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YourCart {
	
WebDriver driver;
	
	@BeforeTest
	public void precondition() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
				
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		
		
	}
	
	@Test(priority=0)
    public void yourCart1() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-test.allthethings()-t-shirt-(red)\"]")).click();
    }
    
	@Test(priority=1)
    public void yourCart2() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
    }
    
	@Test(priority=2)
    public void yourCart3() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
    }
    
	@Test(priority=3)
	public void yourCart4() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
    }
    
	@Test(priority=4)
	public void yourCart5() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
    }
    
	@Test(priority=5)
    public void yourCart6() {
    	
    	driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
    }
    
    
	@Test(priority=6)
    public void yourCart7() {
    	
    	driver.findElement(By.id("checkout")).click();
    	driver.findElement(By.id("cancel")).click();
    }
	
	@Test(priority=7)
    public void yourCart8() {
    	
    	driver.findElement(By.id("continue-shopping")).click();
    }
    
	
	@Test(priority=8)
    public void yourCart9() {
    	
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
    	driver.findElement(By.id("checkout")).click();
    	
    }
	
	
	@AfterTest
    public void yourCartEndtest() {
    	driver.quit();
    }

}
