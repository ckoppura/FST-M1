package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity04 {
	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass

	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.contacts");
		options.setAppActivity(".activities.PeopleActivity");
		options.noReset();
		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, options);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

	@Test
	public void addNewContact() {

		driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
		wait.until(ExpectedConditions
				.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text='First name']")));

		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='First name']")).sendKeys("Test");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Last name']")).sendKeys("Appium");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Phone']")).sendKeys("9848022338");
		driver.findElement(AppiumBy.id("com.google.android.contacts:id/toolbar_button")).click();

		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));

		String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
		Assert.assertEquals(contactName, "Test Appium");

		// Delete contact
		driver.findElement(AppiumBy.accessibilityId("More options")).click();
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath(
				"//android.widget.TextView[@resource-id='com.google.android.contacts:id/title' and @text='Delete']")));
		driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[@resource-id='com.google.android.contacts:id/title' and @text='Delete']"))
				.click();
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("android:id/button1")));
		driver.findElement(AppiumBy.id("android:id/button1")).click();

	}
}
