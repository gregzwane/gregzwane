package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import static io.netty.util.internal.SystemPropertyUtil.contains;

public class searchActions {
    WebDriver driver;

    @Given("The user have navigate to the investec url")
    public void the_user_have_navigate_to_the_investec_url() throws Throwable{
                System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.investec.com");

    }

    @Given("user enters the search value {string}")
    public void user_enters_the_search_value(String SearchValue) {
        driver.findElement(By.id("search-toggler__cross")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.findElement(By.id("searchBarInput")).sendKeys(SearchValue);

    }
    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        driver.findElement(By.id("searchBarButton")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
    @Then("The search results appears")
    public void the_search_results_appears() {
    driver.findElements(By.className("search-results__title"));
    driver.getCurrentUrl().equals("understanding-interest-rates");

    }

    @Given("the user click to navigate to the focu page")
    public void the_user_click_to_navigate_to_the_focu_page() {

    }

    @When("a user click on the investment interest rates")
    public void a_user_click_on_the_investment_interest_rates() {

    }

    @Then("the browser navigate to the cash investment interest rates page")
    public void the_browser_navigate_to_the_cash_investment_interest_rates_page() {

    }


}
