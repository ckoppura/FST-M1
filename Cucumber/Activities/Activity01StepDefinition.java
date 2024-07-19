package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity01StepDefinition {
	private WebDriver driver;
	private WebDriverWait wait;

	@Given("User is on Google Home Page")
	public void user_is_on_google_page() {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

	@When("User types in Cheese and hits ENTER")
	public void user_type_cheese() {
		driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
	}

	@Then("^Show how many search results were shown$")
	public void showHowManySearchResultsWereShown() throws Throwable {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@aria-label,'Amul Blend Diced Cheese')]")));

		String txt = driver.findElement(By.xpath("//div[contains(@aria-label,'Amul Blend Diced Cheese')]")).getText();
		System.out.println("The Result text is : " + txt);
	}

	@And("^Close the browser$")
	public void closeTheBrowser() throws Throwable {
		driver.close();
	}
}
