package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		Actions act = new Actions(driver);

		act.sendKeys("C").build().perform();

		act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).sendKeys("a").sendKeys("c")
				.pause(1000).build().perform();

		driver.quit();

	}

}
