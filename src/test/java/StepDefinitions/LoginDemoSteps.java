package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


// steps definitions without Page Object Model, relates to LoginDemo.feature
public class LoginDemoSteps {
	
//	WebDriver driver =null;
//	@Given("Browser is  then opened")
//	public void browser_is_then_opened() {
//	    
//		//define ChromeDriver path
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("Project path is:"+ projectPath);
//		
//	 System.out.println("inside step -browser in open");
//	 System.getProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//	
//	 driver = new ChromeDriver();
//	 
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//	 
//	 //driver.manage().windows().maximize();
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		
//		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
//	    
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//   @ And ("user clicks on login")
//   public void user_clicks_on_login() {
//	   driver.findElement(By.id("submit")).click();
//	   
//   }
//	
//	@Then("user navigates to the homepage")
//	public void user_navigates_to_the_homepage() {
//	  
//		driver.findElement(By.xpath("//*[contains(text(), 'Log out')]")).isDisplayed();
//		
//	}




}
