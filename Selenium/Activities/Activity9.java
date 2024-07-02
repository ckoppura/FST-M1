package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/ajax");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		WebElement changeButton = driver.findElement(By.xpath("//button[text()='Change Content']"));
		changeButton.click();
		WebElement txt = driver.findElement(By.xpath("//h1"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(txt));

		System.out.println("Text displayed is : " + txt.getText());

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
		WebElement lateText = driver.findElement(By.tagName("h3"));
		System.out.println("Late text is:  " + lateText.getText());
		driver.quit();
	}

}
