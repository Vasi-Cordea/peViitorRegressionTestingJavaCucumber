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
import pages.PfizerPage;
import pages.SchaefflerPage;
import pages.loginPage;

import java.time.Duration;


// steps definitions without Page Object Model, relates to LoginDemo.feature
public class SchaefflerSteps {

    WebDriver driver = null;

    SchaefflerPage Schaeffler1;

    public SchaefflerSteps(){


        driver = new ChromeDriver();

        Schaeffler1  = new SchaefflerPage (driver);
    }

    @Given("Browser is then opened for Schaeffler")
    public void browser_is_then_opened() {

        System.out.println("=== I am inside SchaefflerSteps====");
        System.out.println("inside step -browser in open");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        // define ChromeDriver path
        // setup chromedriver to be used from inside project folder
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @And("the user is on the landing page")
    public void user_is_on_login_page() {
        System.out.println("i am accessing fime.peviitor");
        driver.navigate().to("https://firme.peviitor.ro/");
        // driver.get("https://firme.peviitor.ro/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @When("the user clicks on Schaeffler company logo")
    public void user_on_landing_page() {

        // call constructor from loginPage
        Schaeffler1 = new SchaefflerPage(driver);

        Schaeffler1.user_click_logo();

    }


    @And("user gets the text of first job listed2")
    public void the_user_checks_number_of_open_positions1() {

        Schaeffler1.getTextFirstJob1();

    }

    @Given("the user navigates to Schaeffler home page career")
    public void user_navigates_to_home_page() throws InterruptedException {

        Schaeffler1.userOn_home_page();

    }

    @And("user searches for same job")
    public void user_searches_for_same_job()  {
        Schaeffler1.user_searches_for_same_job();
    }

    @Then("user can assert same results on both pages")
    public void user_compares_results() {
        Schaeffler1.compares_results();
    }
}

