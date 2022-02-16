package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class searchActions {
   static WebDriver driver;
    public static void startBrowwer() throws Throwable{
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();


        //   System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        //     driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }
    public static void closeBrower() throws Throwable{
        driver.quit();
    }

    @Given("The user have navigate to the investec url")
    public void the_user_have_navigate_to_the_investec_url() throws Throwable{
        startBrowwer();
        driver.get("https://www.investec.com");
        Set<Cookie> cookies= driver.manage().getCookies();

        System.out.println("Size of Cookies :" + cookies.size());
        for(Cookie cookie:cookies)
        {
            System.out.println(cookie.getName() +" : "+cookie.getValue());
        }
    }

    @Given("user enters the search value {string}")
    public void user_enters_the_search_value(String SearchValue) {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("search-//*[@id=\"search-toggler__search\"]")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"searchBarInput\"]")).sendKeys(SearchValue);

    }
    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        driver.findElement(By.xpath("//*[@id=\"searchBarButton\"]/a/button")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }
    @Then("The search results appears")
    public void the_search_results_appears() {
    driver.findElement(By.xpath("search-//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/a/h4")).click();
    System.out.println(driver.getCurrentUrl());
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
