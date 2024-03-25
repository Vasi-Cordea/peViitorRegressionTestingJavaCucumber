package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class michellinPage {
    WebDriver driver;
    WebDriverWait wait;

    // public WebDriver driver = new ChromeDriver(options);
    public static By michellinLogo = By.xpath("//img[@alt='michelin']");

    public static By firstJobViitorSchaeffer = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");
    public static By searchCareers = By.xpath("//input[@class='keywordsearch-q columnized-search']");
    public static By BtnCautaPosturi = By.xpath("//input[@value='Căutare posturi']");
    public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");

    public michellinPage(WebDriver driver) {

        // this driver will refer to the driver in this class. it will help to maintain same session
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void user_click_Mlogo() {


        wait.until(ExpectedConditions.elementToBeClickable(michellinLogo));
        driver.findElement(michellinLogo).click();


    }
}