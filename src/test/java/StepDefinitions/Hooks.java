package StepDefinitions;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;
    public ChromeOptions options;
    //@Before
    public void setup() {
        this.driver=driver;
        //define ChromeDriver path
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is:"+ projectPath);

        System.out.println("inside step -browser in open");
        System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //driver.manage().windows().maximize();
    }

//    @After
    public void tearDown() {
        this.driver.close();
    }

}
