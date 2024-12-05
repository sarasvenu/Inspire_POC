package saucedemo;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSauceDemoTest {
	
	
	//launch browser
	WebDriver driver;
	
	@Test(priority = 1)
	//open url
	public void openurl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	//login
	public void login() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Test(priority = 3)
	//product
	public void cart() throws Exception {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();

		//cart
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();   
		
		String text = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
		System.out.println("Item name in cart is : " +text);

	}

	@Test(priority = 4)
	//checkout
	public void checkout() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Smith");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("07748");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//button[@id='finish']")).click();

		Thread.sleep(3000);

		
		String message = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']")).getText();  //thank you message
		System.out.println("Confirmation message is: " +message);
	}

	@Test(priority = 5)
	//logout
	public void logout() throws Exception {
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		driver.close();
	}
	
	
	
}
