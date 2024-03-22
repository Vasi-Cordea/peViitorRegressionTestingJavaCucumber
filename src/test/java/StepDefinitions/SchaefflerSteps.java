package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// steps definitions without Page Object Model, relates to LoginDemo.feature
public class SchaefflerSteps {
	public static String firstJob;


	 ChromeOptions options = new ChromeOptions();
	 public WebDriver driver = new ChromeDriver(options);
	public static By schaefflerLogo = By.xpath("//img[@alt='Schaeffler']");

	public static By firstJobViitorSchaeffer = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");
	public static By searchCareers = By.xpath("//input[@class='keywordsearch-q columnized-search']");
	public static By BtnCautaPosturi = By.xpath("//input[@value='Căutare posturi']");
	public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");

	@Given("Browser is then opened")
	public void browser_is_then_opened() {

		 options.addArguments("--remote-allow-origins=*)");
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/src/test/resources/chromedriver.exe");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// driver.manage().windows().maximize();
	}

	@And("the user is on the landing page")
	public void user_is_on_login_page() {

		driver.navigate().to("https://firme.peviitor.ro/");
		// driver.get("https://firme.peviitor.ro/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	@When("the user clicks on Scaheffler company logo")
	public void user_on_landing_page() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(schaefflerLogo));
		driver.findElement(schaefflerLogo).click();

	}

	@Then("Then the user checks first open position")
	public void the_user_checks_number_of_open_positions() {

//get attribute text name of first job on peviitor
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//		wait.until(ExpectedConditions.elementToBeClickable(firstJobViitorSchaeffer));
		String firstJob = driver.findElement(firstJobViitorSchaeffer).getText();

		System.out.println("Then the user checks first open position: " + firstJob);

	}

	@Given("the user navigates to Schaeffler home page career")
	public void user_navigates_to_home_page()throws InterruptedException {

		driver.findElement(veziPostul).click();
		Thread.sleep(3000);
		driver.findElement(searchCareers).sendKeys(firstJob);
		driver.findElement(BtnCautaPosturi).click();
		// Javascript executor scroll page to bottom
	//	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	@And("user searches for same job")
	public void user_searches_for_same_job() throws InterruptedException

	{
Thread.sleep(3000);
// explicit wait - to wait for the Next button to be click-able
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//		wait.until(ExpectedConditions.elementToBeClickable(BtnCautaPosturi));


		driver.findElement(searchCareers).sendKeys(firstJob);
		driver.findElement(BtnCautaPosturi).click();
	}

	@Then("user can compare the results with peviitor")
	public void user_compares_results() {
		System.out.println("code");
//String bodyText = findElement(By.xpath("html/body")).getText();

//Assert.assertTrue(bodyText.contains(firstJob));
	}

}
