package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver;
	
	@Before(order=0)
	public void browserSetup()
	{
		System.out.println("Inside Before Hook");
		String relativeaddress=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", relativeaddress+"/src/test/resources/Drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	}
	
	@BeforeStep
	public void beforeEachStep()
	{
		System.out.println("Before each step hook");
	}
	
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		
//		String UserDirectory=System.getProperty("user.dir");
//		System.out.println(UserDirectory);
//	    System.setProperty("webdriver.chrome.driver", UserDirectory+"/src/test/resources/Driver/chromedriver.exe");
//	    driver=new ChromeDriver();
	    driver.get("https://www.google.co.in/");
//	    driver.manage().window().maximize();
	    
	}

	@When("User types in Cheese and hits ENTER")
	public void user_types_in_cheese_and_hits_enter() {
	   WebElement ele=driver.findElement(By.id("APjFqb"));
	   ele.sendKeys("Cheese");
	   ele.sendKeys(Keys.ENTER);
	}

	@Then("Show how many search results were shown")
	public void show_how_many_search_results_were_shown() throws Exception {
	   Thread.sleep(5000);
	}

	@And("Close the browser")
	public void close_the_browser() {
	    System.out.println("And block");
	}
	
	@After
	public void closeBrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@AfterStep
	public void afterEachStep()
	{
		System.out.println("After each step method");
	}


}
