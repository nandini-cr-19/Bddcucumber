package setpdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoNavPage {
	WebDriver driver;
	@Given("the user is on any page of the website")
    public void the_user_is_on_any_page_of_the_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.healthasyst.com/");
    }

    @When("the user clicks on the website logo")
    public void the_user_clicks_on_the_website_logo() {
        WebElement logo = driver.findElement(By.className("custom-logo"));
        logo.click();
    }

    @Then("the user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() {
        String expectedUrl = "https://www.healthasyst.com/";
        String actualUrl = driver.getCurrentUrl();
        driver.quit(); 
    }
}

