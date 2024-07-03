package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		System.out.println("The Title of the page is  : " + driver.getTitle());

		driver.findElement(By.id("prompt")).click();

		Alert alt = driver.switchTo().alert();

		String altText = alt.getText();
		System.out.println(altText);
		
		alt.sendKeys("Awsome!!");
		alt.accept();
		
		driver.quit();

	}

}
