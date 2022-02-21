package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class signUpActions extends searchActions{
    @Given("the user navigate to the sign up page")
    public void the_user_navigate_to_the_sign_up_page(){
        try
        {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath(""));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
    @Given("the user provide the sign up information <{string}> <{string}> <{string}>")
    public void the_user_provide_the_sign_up_information(String Name, String Surname, String Email) {
        try
        {
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Name);
            driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(Surname);
            driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Email);

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    @When("the user click on the signup button")
    public void the_user_click_on_the_signup_button() {
        try
        {
            driver.findElement(By.xpath("//*[@id='sign']")).click();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    @Then("the system create a new user on the system")
    public void the_system_create_a_new_user_on_the_system() {
        try
        {
            driver.findElement(By.xpath("//*[@id='welcome']")).isDisplayed();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
