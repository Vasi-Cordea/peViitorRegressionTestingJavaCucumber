package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import StepDefinitions.Hooks;

import java.time.Duration;

public class SchaefflerPage extends Hooks {
  public static String firstJob;
   // public static WebDriver driver;



    public static By schaefflerLogo = By.xpath("//img[@alt='Schaeffler']");

    public static By firstJobViitorSchaeffer = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");
    public static By searchCareers = By.xpath("//input[@class='keywordsearch-q columnized-search']");
    //public static By searchCareers = By.className("keywordsearch-q columnized-search");
    public static By BtnCautaPosturi = By.xpath("//input[@value='Căutare posturi']");
    public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");


    public void user_click_logo()  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(schaefflerLogo));
        driver.findElement(schaefflerLogo).click();

    }

    public void getTextFirstJob() {
        //get attribute text name of first job on peviitor
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(veziPostul));
        String firstJob = driver.findElement(firstJobViitorSchaeffer).getText();

        System.out.println("Then the user checks first open position: " + firstJob);
    }



    public void user_goes_to_home_page() {

        driver.findElement(veziPostul).click();
       // Thread.sleep(3000);
//        driver.findElement(searchCareers).sendKeys(firstJob);
//        driver.findElement(BtnCautaPosturi).click();

        // Javascript executor scroll page to bottom
        //	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    public void user_searches_for_same_job() throws InterruptedException {
        Thread.sleep(3000);
// explicit wait - to wait for the Next button to be click-able
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(BtnCautaPosturi));


        driver.findElement(searchCareers).sendKeys(firstJob);
        driver.findElement(BtnCautaPosturi).click();
    }

    public void compares_results() {
        System.out.println("code");
        String bodyText = driver.findElement(By.xpath("html/body")).getText();

        Assert.assertTrue(bodyText.contains(firstJob));
    }
}