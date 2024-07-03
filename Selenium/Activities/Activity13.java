package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/tables");

		System.out.println("The Title of the page is  : " + driver.getTitle());

		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));

		System.out.println("No of Rows in table is  : " + rows.size());
		System.out.println("No Of Columns in table is  : " + col.size());

		List<WebElement> thirdRow = driver
				.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));

		for (WebElement cell : thirdRow) {
			System.out.println(cell.getText());
		}

		WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
		System.out.println("Second row, second cell value is : " + cellValue.getText());
		
		driver.quit();
	}

}
