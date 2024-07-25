package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity03 {
	AppiumDriver driver;

	@BeforeClass

	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.oneplus.calculator");
		options.setAppActivity(".Calculator");
		options.noReset();
		URL serverURL = new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, options);

	}

	@AfterClass
	public void close() {
		driver.quit();
	}

	@Test
	public void add() {
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("img_op_add")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_9")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_eq")).click();
		String sum = driver.findElement(AppiumBy.id("com.oneplus.calculator:id/result")).getText();
		System.out.println("Sum is : " + sum);
		Assert.assertEquals(sum, "14");
	}

	@Test
	public void subtract() {
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_op_sub")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_eq")).click();
		String sub = driver.findElement(AppiumBy.id("com.oneplus.calculator:id/result")).getText();
		System.out.println("Subtract is : " + sub);
		Assert.assertEquals(sub, "5");
	}

	@Test
	public void multiply() {
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_op_mul")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_eq")).click();
		String mul = driver.findElement(AppiumBy.id("com.oneplus.calculator:id/result")).getText();
		System.out.println("Multiply is : " + mul);
		Assert.assertEquals(mul, "500");
	}

	@Test
	public void division() {
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_op_div")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/digit_2")).click();
		driver.findElement(AppiumBy.id("com.oneplus.calculator:id/img_eq")).click();
		String divs = driver.findElement(AppiumBy.id("com.oneplus.calculator:id/result")).getText();
		System.out.println("division by 2 is : " + divs);
		Assert.assertEquals(divs, "25");
	}

}
