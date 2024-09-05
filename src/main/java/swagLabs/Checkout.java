package swagLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkout {
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

	    
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		
	}
	
	
	@Test(priority=0)
	public void checkout1() {
		driver.findElement(By.id("first-name")).sendKeys("Md.Mamun Anwar");//first name
		driver.findElement(By.id("last-name")).sendKeys("D'Souza Van Hel-sing");//last name
		driver.findElement(By.id("postal-code")).sendKeys("3400");//postal code
		driver.findElement(By.id("continue")).click();

	}
	

	
	@Test(priority=1)
	public void checkout2() {
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.id("last-name")).sendKeys("D'Souza Van Hel-sing");//last name
		driver.findElement(By.id("postal-code")).sendKeys("3400");//postal code
		driver.findElement(By.id("continue")).click();

	}
	
	
		@Test(priority=2)
		public void checkout3() {
			driver.navigate().refresh();
			driver.findElement(By.id("first-name")).sendKeys("!~&*^%GFH528735fGghj{}\":><?|_+=");//first name
			driver.findElement(By.id("last-name")).sendKeys("Khan");//last name
			driver.findElement(By.id("postal-code")).sendKeys("1818");//postal code
			driver.findElement(By.id("continue")).click();

		}
	
	
		@Test(priority=3)
		public void checkout4() {
			driver.navigate().back();
			driver.navigate().refresh();
			driver.findElement(By.id("first-name")).sendKeys("Md.Mamun Anwar");//first name
			driver.findElement(By.id("postal-code")).sendKeys("1200");//postal code
			driver.findElement(By.id("continue")).click();

		}
		
	
			@Test(priority=4)
			public void checkout5() {
				driver.navigate().refresh();
				driver.findElement(By.id("first-name")).sendKeys("Erin");//first name
				driver.findElement(By.id("last-name")).sendKeys("56234875ETYgu!~!@#$&^*");//last name
				driver.findElement(By.id("postal-code")).sendKeys("2500");//postal code
				driver.findElement(By.id("continue")).click();

			}
			
	
			@Test(priority=5)
			public void checkout6() {
				driver.navigate().back();
				driver.navigate().refresh();
				driver.findElement(By.id("first-name")).sendKeys("Anwar");//first name
				driver.findElement(By.id("last-name")).sendKeys("Akhter");//last name
	            driver.findElement(By.id("continue")).click();

			}
			
	
				@Test(priority=6)
				public void checkout7() {
					driver.navigate().refresh();
					driver.findElement(By.id("first-name")).sendKeys("Rasha");//first name
					driver.findElement(By.id("last-name")).sendKeys("Rahman Khan");//last name
					driver.findElement(By.id("postal-code")).sendKeys("RYYK JCjhkdl!@#~#$@&  (*)+_=-}{}:\"|';><./?");//postal code
					driver.findElement(By.id("continue")).click();

				}	
				
			
	
			@Test(priority=7)	
			public void checkout9() {
				driver.findElement(By.id("cancel")).click();
			}
			
			@Test(priority=8)
			public void checkout8() {
			
				driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
				driver.findElement(By.id("checkout")).click();
				driver.findElement(By.xpath("//button[@id=\"cancel\"]")).click(); 
			}
			
			
			@Test(priority=9)
			public void checkout10() {
			
				driver.findElement(By.id("checkout")).click();
				driver.findElement(By.id("first-name")).sendKeys("Unaa");
				driver.findElement(By.id("last-name")).sendKeys("Fabiola");
				driver.findElement(By.id("postal-code")).sendKeys("86592436");
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.xpath("//button[@id=\"finish\"]")).click();
			}
			
			@Test(priority=10)
			public void checkout11() {
		        driver.findElement(By.xpath("//button[@id=\"back-to-products\"]")).click();
			}
			
			@AfterTest
			public void endCheckoutTest() {
				driver.quit();
			}

}
