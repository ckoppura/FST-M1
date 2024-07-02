package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		WebElement checkbox = driver.findElement(By.xpath("//div/input[@type='checkbox']"));
		checkbox.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement toggleButton = driver.findElement(By.id("toggleCheckbox"));
		toggleButton.click();

		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		toggleButton.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		driver.quit();
	}

}
