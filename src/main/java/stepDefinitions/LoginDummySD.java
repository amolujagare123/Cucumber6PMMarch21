package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginDummySD {

    @And("^I click on login button of billing page$")
    public void i_click_on_login_button_of_billing_page()  {
        System.out.println("output: >>> I click on login button of billing page");
    }

    @Given("^I am on login page of billing$")
    public void i_am_on_login_page_of_billing()  {
        System.out.println("output: >>> I am on login page of billing");
    }

    @When("^I enter username and password correctly$")
    public void i_enter_username_and_password_correctly() {
        System.out.println("output: >>> I enter username and password correctly");
    }

    @Then("^I should be landed to home page$")
    public void i_should_be_landed_to_home_page()  {
        System.out.println("output: >>> I should be landed to home page");
    }


    @When("^I enter username and password incorrectly$")
    public void i_enter_username_and_password_incorrectly() throws Throwable {
        System.out.println("output: >>> I enter username and password incorrectly");

    }


    @Then("^I should get error message$")
    public void i_should_get_error_message() throws Throwable {
        System.out.println("output: >>> I should get error message");
        Assert.assertEquals("this is failed",true,false);
    }


    @When("^I dont enter username and password$")
    public void i_dont_enter_username_and_password() throws Throwable {
        System.out.println("output: >>> I dont enter username and password");

    }

    @Then("^I should get another error message$")
    public void this_is_the_name_given_by_amol() throws Throwable {
        System.out.println("output: >>> I should get another error message");

    }


    /*@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String user, String password)
             {

                 System.out.println("username="+user);
                 System.out.println("password="+password);

             }*/

    /*@When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String user, String password) {
        System.out.println("username="+user);
        System.out.println("password="+password);
    }*/



    @Given("^I open the browser$")
    public void i_open_the_browser() {
        System.out.println("======> I open the browser");
    }

    @And("^I maximize it$")
    public void i_maximize_it()  {
        System.out.println("======> I maximize it");
    }

}
