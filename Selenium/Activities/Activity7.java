package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/drag-drop");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		Actions act = new Actions(driver);

		WebElement ball = driver.findElement(By.xpath("//div/img[@id='draggable']"));
		WebElement zone1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement zone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

		act.clickAndHold(ball).moveToElement(zone1).pause(5000).release().build().perform();

		String dropzone1Verify = zone1.findElement(By.tagName("p")).getText();
		if (dropzone1Verify.equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 1");
		}

		act.clickAndHold(ball).moveToElement(zone2).pause(5000).release().build().perform();

		String verify2 = zone1.findElement(By.tagName("p")).getText();
		if (verify2.equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 2");
		}

		driver.quit();

	}

}
