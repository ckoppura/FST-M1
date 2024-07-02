package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/target-practice");

		System.out.println("The Title Of the Page is  : " + driver.getTitle());

		String thrirdHeader = driver.findElement(By.xpath("//h3")).getText();
		System.out.println("Third Header IS : " + thrirdHeader);

		String fifthHeaderColor = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("The clolor of the fifth header is :" + fifthHeaderColor);

		String vilotClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
		System.out.println("The class of Violet is :" + vilotClass);

		String greyText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
		System.out.println(greyText);

		driver.quit();
	}

}
