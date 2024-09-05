package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Products {

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
	}
	
	@Test(priority=0)
	public void products1() {
		driver.findElement(By.id("react-burger-menu-btn")).click();//clicking three lines to view sidebar
		
	}
	
	@Test(priority=1)
	public void products2() {
		
		driver.findElement(By.id("inventory_sidebar_link")).click();
	}
	
	@Test(priority=2)
	public void products3(){
		
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
	}	
	
	@Test(priority=3)
	public void products4(){
		 
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"reset_sidebar_link\"]")).click();
	}	
	
	public void products5() {
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-cross-btn\"]")).click();
	}
	@Test(priority=4)
	public void products6(){
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	  	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
	@Test(priority=5)
    public void products7() {
    	
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }
	@Test(priority=6)
    public void products8() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=7)
    public void products9() {
    	
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
    }
	
	@Test(priority=8)
    public void products10() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=9)
    public void products11() {
    	
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
    }
	
	@Test(priority=10)
    public void products12() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[3]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=11)
    public void products13() {
    	
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
    }
	
	@Test(priority=13)
    public void products14() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[4]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=14)
    public void products15() {
    	
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
    }
	
	@Test(priority=15)
    public void products16() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[5]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=16)
    public void products17() {
    	
  
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
    }
	
	@Test(priority=17)
    public void products18() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")).click();//clicking name
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[1]/a/img")).click();//clicking image
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
		
    }
	
	@Test(priority=18)
    public void products19() {
    	
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span")).click();		
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[1]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[2]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[3]")).click();	
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[4]")).click();
    }
	
	@AfterTest
	public void productsEndtest() {
	
		driver.quit();
	}	
	
}
