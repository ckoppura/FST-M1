package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://v1.training-support.net/selenium/tables");

		System.out.println("The Title of the page is  : " + driver.getTitle());
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'sortable ')]/tbody/tr"));
		List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class, 'sortable')]/tbody/tr[1]/td"));

		System.out.println("No of Rows in table is  : " + rows.size());
		System.out.println("No Of Columns in table is  : " + col.size());

		WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

		System.out.println("2Nd Row And 2nd column cell value is  : " + cellValue.getText());

		WebElement header = driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]"));
		header.click();

		System.out.println("User performed click operation on first header");
		cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("2Nd Row And 2nd column cell value is  : " + cellValue.getText());

		List<WebElement> tfoot = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));

		System.out.println("The footer values is :");
		for (WebElement cell : tfoot) {
			System.out.println(cell.getText());
		}

		driver.quit();
	}

}
