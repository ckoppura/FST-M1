package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println(ffDriver.getTitle());
		ffDriver.findElement(By.id("username")).sendKeys("admin");
		ffDriver.findElement(By.name("Password")).sendKeys("password");
		ffDriver.findElement(By.tagName("button")).click();
		ffDriver.quit();
	}

}
