package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PfizerPage {
    WebDriver driver;
    WebDriverWait wait;
    String firstJobPF;
    // Declare the variable at the class level


    public static By pfizerLogo = By.xpath("/html/body/div/section/div/div[3]/a/img");

    public static By firstJobPfizer = By.xpath("//section[@class='serp']//section[1]//div[1]//h2[1]");

    public static By veziPostul = By.xpath("//*[@id=\"root\"]/section/div[1]/section[2]/section[1]/div[2]/a");


    public PfizerPage(WebDriver driver) {

        // this driver will refer to the driver in this class. it will help to maintain same session
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
      ;
    }


    public void user_click_pfLogo() {


        wait.until(ExpectedConditions.elementToBeClickable(pfizerLogo));
        driver.findElement(pfizerLogo).click();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

    }

    public void getTextFirstJob() {
        wait.until(ExpectedConditions.presenceOfElementLocated(firstJobPfizer));


        firstJobPF = driver.findElement(firstJobPfizer).getText();

        System.out.println("Then the user checks first Pfizer open position:::: " + firstJobPF);

    }

    public void userOn_PFhome_page() {
        wait.until(ExpectedConditions.elementToBeClickable(veziPostul));
        driver.findElement(veziPostul).click();


    }

    public String compares_results() throws InterruptedException {
        System.out.println("<comparison started>");

        Thread.sleep(4000);

        System.out.println("Then java still remembers the Pfizer job name====> " + firstJobPF);


        String bodyText = driver.findElement(By.tagName("body")).getText();
        // System.out.println(bodyText);


        Assert.assertTrue("Text not found in body!", bodyText.contains(firstJobPF));

        return firstJobPF;
    }


}