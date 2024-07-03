package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println("The Title of the page is  : " + driver.getTitle());
		WebElement checkbox = driver.findElement(By.xpath("//div/input[@type='checkbox']"));
		
		System.out.println("Check box is selected " + checkbox.isSelected());
		
		checkbox.click();
		
		System.out.println("Check box is selected " + checkbox.isSelected());
		driver.quit();

	}

}
