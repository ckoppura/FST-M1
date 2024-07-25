package project;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import activities.DoSwipe;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity04_Project {
	AndroidDriver driver;
	
	WebDriverWait wait;
	@BeforeClass

	public void setUp() throws MalformedURLException, URISyntaxException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.android.chrome");
		options.setAppActivity("com.google.android.apps.chrome.Main");
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
	public void toDoList() {

		driver.get("https://v1.training-support.net/selenium");
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.Button[@text='Get Started!']")));

		Dimension dims = driver.manage().window().getSize();
		System.out.println(dims);
		Point start = new Point((int) (dims.getWidth() * 0.5), (int) (dims.getHeight() * 0.85));
		Point end = new Point((int) (dims.getWidth() * 0.5), (int) (dims.getHeight() * 0.6));

		DoSwipe.doSwipeF(driver, start, end, 35);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(AppiumBy.xpath("//android.view.View[contains(@content-desc,'To-Do List')]")));

		driver.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'To-Do List')]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.EditText")));

		WebElement input = driver.findElement(AppiumBy.xpath("//android.webkit.WebView[@text='Todo List']//android.widget.EditText"));
		WebElement addTaskButton = driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']"));

		input.sendKeys("This is APpium test");
		addTaskButton.click();
		
		input.sendKeys("Task02");
		addTaskButton.click();
		
		input.sendKeys("Task03");
		addTaskButton.click();
		
		List<WebElement> tasks = driver.findElements(AppiumBy.xpath("//android.view.View[2]//android.widget.TextView"));
		System.out.println("The No of Taskes added " +tasks.size());
		
		Assert.assertEquals(tasks.size(), 4);
		for(int i=1 ; i<tasks.size();i++) {
			tasks.get(i).click();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=' Clear List']")).click();
		System.out.println("list successfully cleared");
	}
	
}
