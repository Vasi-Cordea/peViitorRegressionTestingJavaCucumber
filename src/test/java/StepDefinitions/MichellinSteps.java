package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.michellinPage;

import java.time.Duration;


public class MichellinSteps {
    WebDriver driver = null;
    michellinPage michellinPage;

    public MichellinSteps() {
        driver = new ChromeDriver();

        michellinPage = new michellinPage(driver);
    }


    @Given("Browser is opened for michellinUser")
    public void Browser_is_opened3() {
        michellinPage.Browser_is_opened();
    }

    @And("the michellinUser is on the peviitor landing page")
    public void user_on_main_page2() {
        michellinPage.user_on_main_page();
    }

    @Given("the user clicks on Michelin company logo")
    public void userClicksMlogo() {
        //call constructor from loginPage
        michellinPage.user_click_Mlogo();

    }

    @And("user gets the text of first Michellin job listed")
    public void userGetsMIchelText() {
        michellinPage.getTextMclFirstJob();

    }

    @Given("the user navigates to Michelin home page career")
    public void userClicksMIchellLogo() {
        michellinPage.userOn_Mcl_page();
    }

    @Then("user compares job title from peviitor == Michellin.com")
    public void userClicksMIchelLogo() throws InterruptedException {
     michellinPage.compares_results();
    }
}