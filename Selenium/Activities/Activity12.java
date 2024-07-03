package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println("The Title of the page is  : " + driver.getTitle());
		WebElement txtField = driver.findElement(By.id("input-text"));

		System.out.println("Text Box is Enabled : " + txtField.isEnabled());

		WebElement enableInputButton = driver.findElement(By.cssSelector("#toggleInput"));

		enableInputButton.click();

		System.out.println("Text Box is Enabled : " + txtField.isEnabled());
		driver.quit();

	}

}
