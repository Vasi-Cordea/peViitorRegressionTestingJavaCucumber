package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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


    @Given("Browser is opened")
    public void Browser_is_opened() {
        // setup chromedriver to be used from inside project folder
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    @And("the user is on the peviitor landing page")
    public void user_on_main_page() {
        driver.navigate().to("https://firme.peviitor.ro/");
        // driver.get("https://firme.peviitor.ro/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    @Given("the user clicks on Michelin company logo")
    public void userClicksMlogo() {
        //call constructor from loginPage
        michellinPage.user_click_Mlogo();

    }
}