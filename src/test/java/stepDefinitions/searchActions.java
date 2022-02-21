package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import sun.font.Script;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class searchActions {
   static WebDriver driver;
    public static void startBrowwer() throws Throwable{
        try {


        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();


        //   System.setProperty("webdriver.edge.driver","src/test/resources/msedgedriver.exe");
        //     driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        }
        catch (Exception e)
        {
            System.out.println("Browser fail to open "+e.getMessage());

        }


    }

    public static void closeBrower() throws Throwable{
        try {
            driver.quit();
        }
       catch (Exception e)
       {
           System.out.println("Browser fail to close a session "+e.getMessage());
       }
    }

    @Given("The user have navigate to the investec url")
    public void the_user_have_navigate_to_the_investec_url() throws Throwable{
        try {
            startBrowwer();
            driver.get("https://www.investec.com");
            Set<Cookie> cookies= driver.manage().getCookies();

            System.out.println("Size of Cookies :" + cookies.size());
            for(Cookie cookie:cookies)
            {
                System.out.println(cookie.getName() +" : "+cookie.getValue());
            }

        }
        catch (Exception e)
        {
            System.out.println("fail to open the url" + e.getMessage());
        }

    }

    @Given("user enters the search value {string}")
    public void user_enters_the_search_value(String SearchValue) {
        try {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath("search-//*[@id=\"search-toggler__search\"]")).click();
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"searchBarInput\"]")).sendKeys(SearchValue);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    @When("user click on the search button")
    public void user_click_on_the_search_button() {
        try {
            driver.findElement(By.xpath("//*[@id=\"searchBarButton\"]/a/button")).click();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    @Then("The search results appears")
    public void the_search_results_appears() {
        try {
            driver.findElement(By.xpath("search-//*[@id=\"content\"]/div[2]/div/div[1]/div/div[1]/a/h4")).click();
            System.out.println(driver.getCurrentUrl());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Given("the user click to navigate to the focu page")
    public void the_user_click_to_navigate_to_the_focu_page() {
        try {
            driver.findElement(By.xpath("//*[@id=\"s-header\"]/div[3]/ul/li[9]/a"));
            driver.findElement(By.xpath("//*[@id=\"main-sub-nav-cta-3\"]/span/span"));
        }
      catch (Exception e)
      {
          System.out.println(e.getMessage());
      }
    }

    @When("a user click on the investment interest rates")
    public void a_user_click_on_the_investment_interest_rates() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,1000)");
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[10]/div/div/div[2]/div/div/div[13]/a/button")).click();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    @Then("the browser navigate to the cash investment interest rates page")
    public void the_browser_navigate_to_the_cash_investment_interest_rates_page() {
        try{
            driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/div/div[1]/div/div/h3")).isDisplayed();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


}
