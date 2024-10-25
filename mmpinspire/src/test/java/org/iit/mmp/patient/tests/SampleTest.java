package org.iit.mmp.patient.tests;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {

	WebDriver driver;

	@Test(priority = 1)
	void openapp()

	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://85.209.95.122/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	void testtitle() throws Exception {
		Thread.sleep(3000);
		System.out.println("Title of webpage: " + driver.getTitle());
	}

	@Test(priority = 3)
	void testlogin() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ria1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ria12345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

	@Test(priority = 4)
	void closeapp() {
		driver.close();
	}

}
