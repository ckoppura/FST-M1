package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");

		System.out.println("The Title of the page is : " + driver.getTitle());

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		String txt = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Login message: " + txt);

		driver.close();
	}

}
