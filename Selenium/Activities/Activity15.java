package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		driver.findElement(By.xpath("//div[text()='Sign in!']/following::input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//div[text()='Sign in!']/following::input[2]")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit' and (text()='Log in')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),
				"Welcome Back, admin"));
		String text = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println("The Welcome Text is : " + text);
		
		driver.quit();

	}
}