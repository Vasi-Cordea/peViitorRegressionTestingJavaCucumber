package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class michellinPage {
    WebDriver driver;
    WebDriverWait wait;
    String firstJobMcl;

    // public WebDriver driver = new ChromeDriver(options);
    public static By michellinLogo = By.xpath("//img[@alt='michelin']");

    public static By firstJobViitorMichellin = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");

    public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");

    public michellinPage(WebDriver driver) {

        // this driver will refer to the driver in this class. it will help to maintain same session
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void Browser_is_opened() {
        // setup chromedriver to be used from inside project folder
        System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void user_on_main_page() {
        driver.navigate().to("https://firme.peviitor.ro/");
        // driver.get("https://firme.peviitor.ro/");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    public void user_click_Mlogo() {


        wait.until(ExpectedConditions.elementToBeClickable(michellinLogo));
        driver.findElement(michellinLogo).click();

    }

    public void getTextMclFirstJob() {
        wait.until(ExpectedConditions.presenceOfElementLocated(firstJobViitorMichellin));


        firstJobMcl = driver.findElement(firstJobViitorMichellin).getText();

        System.out.println("Then the user checks first Pfizer open position:::: " + firstJobMcl);

    }

    public void userOn_Mcl_page() {
        wait.until(ExpectedConditions.elementToBeClickable(veziPostul));
        driver.findElement(veziPostul).click();


    }

    public String compares_results() throws InterruptedException {
        System.out.println("<comparison started>");

        Thread.sleep(4000);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        System.out.println("Then java still remembers the Pfizer job name====> " + firstJobMcl);


        String bodyText = driver.findElement(By.tagName("body")).getText();
        // System.out.println(bodyText);


        Assert.assertTrue("Text not found in body!", bodyText.contains(firstJobMcl));

        return firstJobMcl;
    }
}
