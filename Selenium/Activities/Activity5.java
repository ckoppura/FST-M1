package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity5 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/input-events");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		Actions actionClass = new Actions(driver);
		actionClass.click().pause(1000).build().perform();

		String text = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(text);

		actionClass.doubleClick().pause(1000).build().perform();

		String text2 = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(text2);

		actionClass.click().pause(1000).build().perform();

		String text3 = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(text3);

		driver.quit();
	}

}
