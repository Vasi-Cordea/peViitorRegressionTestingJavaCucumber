package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SchaefflerPage {

    WebDriver driver;
    WebDriverWait wait;
    String firstJob;

    // public WebDriver driver = new ChromeDriver(options);
    public static By schaefflerLogo = By.xpath("//img[@alt='Schaeffler']");
    public static By optiuni = By.xpath("//a[contains(@class, 'search-option-link btn-link') and normalize-space(text()) = 'Afișare mai multe opțiuni']");
    public static By firstJobViitorSchaeffer = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");
    public static By searchCareers = By.xpath("//input[@class='keywordsearch-q columnized-search']");
    public static By BtnCautaPosturi = By.xpath("//input[@value='Căutare posturi']");
    public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");

    public SchaefflerPage(WebDriver driver) {

        // this driver will refer to the driver in this class. it will help to maintain same session
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void user_click_logo() {


        wait.until(ExpectedConditions.elementToBeClickable(schaefflerLogo));
        driver.findElement(schaefflerLogo).click();

    }

    public void getTextFirstJob1() {
        //get attribute text name of first job on peviitor

        wait.until(ExpectedConditions.elementToBeClickable(veziPostul));
        firstJob = driver.findElement(firstJobViitorSchaeffer).getText();

        System.out.println("Then the user checks first open position: " + firstJob);
    }


    public void userOn_home_page() throws InterruptedException {

        driver.findElement(veziPostul).click();
        // Thread.sleep(3000);

        // Javascript executor scroll page to bottom
        //	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public void user_searches_for_same_job()  {
       // Thread.sleep(3000);
// explicit wait - to wait for the Next button to be click-able

        wait.until(ExpectedConditions.elementToBeClickable(optiuni));


        driver.findElement(searchCareers).sendKeys(firstJob);
        driver.findElement(BtnCautaPosturi).click();
    }

    public String compares_results() {
        System.out.println("<comparison started>");


        System.out.println("Then java still remembers the Pfizer job name====> " + firstJob);


        String bodyText = driver.findElement(By.tagName("body")).getText();
        // System.out.println(bodyText);


        Assert.assertTrue("Text not found in body!", bodyText.contains(firstJob));



        return firstJob;
    }
}