package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.PfizerPage;


import java.time.Duration;


public class PfizerSteps {
    WebDriver driver = null;
    PfizerPage pfizerPage;

    public PfizerSteps() {
        driver = new ChromeDriver();

        pfizerPage = new PfizerPage(driver);
    }


    @Given("Browser is opened for PfizerUser")
    public void Browser_is_opened() {


        // setup chromedriver to be used from inside project folder
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    @And("the PfizerUser is on the peviitor landing page")
    public void user_on_main_page() {
        driver.navigate().to("https://firme.peviitor.ro/");
        // driver.get("https://firme.peviitor.ro/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    @Then("the user clicks on Pfizer company logo")
    public void userClickslogo() {
        //call constructor from loginPage
        pfizerPage.user_click_pfLogo();

    }

    @And("user gets the text of first job listed")
    public void userGetPfizerJobName() {
        pfizerPage.getTextFirstJob();

    }


    @And("the user navigates to Pfizer home page career")
    public void user_navigates_to_home_page1() {
        pfizerPage.userOn_PFhome_page();

    }

    @Then("user compares job from peviitor == Pfizer.com")
    public void compares_results1() throws InterruptedException {

        pfizerPage.compares_results();
    }
}