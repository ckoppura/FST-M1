package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.get("http://v1.training-support.net/");
		String title = ffDriver.getTitle();
		System.out.println("The Title of the page is  : "+title);
		ffDriver.findElement(By.id("about-link")).click();
		System.out.println("The New Title is  : " +ffDriver.getTitle());
		ffDriver.quit();
	}

}
