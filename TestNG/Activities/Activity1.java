package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/");
	}

	@Test (priority = 1)
	public void homePageTest() {

		System.out.println("The Tittle of page is  : " + driver.getTitle());
		Assert.assertEquals("Training Support", driver.getTitle());
		driver.findElement(By.id("about-link")).click();

	}

	@Test(priority = 2)

	public void aboutPageTest() {
		System.out.println("The Tittle of page is  : " + driver.getTitle());
		Assert.assertEquals("About Training Support", driver.getTitle());
	}

	
	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}
}
