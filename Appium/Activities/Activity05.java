package activities;

import java.awt.AWTException;

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
//import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver;

//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//mport io.appium.java_client.android.nativekey.PressesKey;


import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
public class Activity05 {
	AppiumDriver driver;
	WebDriverWait wait;

	@BeforeClass

	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.apps.messaging");
        options.setAppActivity(".ui.ConversationListActivity");
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
	public void activity05() throws AWTException, InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Start chat")).click();

		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));

		((AndroidDriver) driver).pressKey(null);

		System.out.println("Is Keyboard shown : " + ((AndroidDriver) driver).isKeyboardShown());
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Send to 099668 83418']"));

		wait.until(ExpectedConditions
				.elementToBeClickable(AppiumBy.xpath("com.google.android.apps.messaging:id/compose_message_text")));

		driver.findElement(AppiumBy.id("com.google.android.apps.messaging:id/compose_message_text"))
				.sendKeys("Hello from Appium");

		driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
		String messageTextSent = driver.findElement(AppiumBy.id("message_text")).getText();
		Assert.assertEquals(messageTextSent, "Hello from Appium");

	}
	
	
	
}
