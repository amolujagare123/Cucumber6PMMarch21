package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class RegisterationSD {

    @Given("I am on the user registration page")
    public void i_am_on_the_user_registration_page() {
        System.out.println("I am on the user registration page");

        // open browser
        // maximize
        // open url

    }

    @When("I enter below data")
    public void i_enter_below_data(DataTable dataTable) {

        /*List<String> data = dataTable.asList();

        System.out.println("First name = "+data.get(0));
        System.out.println("Last name = "+data.get(1));
        System.out.println("Email = "+data.get(2));
        System.out.println("Number = "+data.get(3));
        System.out.println("City = "+data.get(4));

        */

        // driver.findElement(By.xpath("")).sendkeys(data.get(0))


        List<List<String>> data = dataTable.asLists();

        System.out.println("First name = "+data.get(0).get(0));
        System.out.println("Last name = "+data.get(0).get(1));
        System.out.println("Email = "+data.get(0).get(2));
        System.out.println("Number = "+data.get(0).get(3));
        System.out.println("City = "+data.get(0).get(4));


        System.out.println("First name = "+data.get(1).get(0));
        System.out.println("Last name = "+data.get(1).get(1));
        System.out.println("Email = "+data.get(1).get(2));
        System.out.println("Number = "+data.get(1).get(3));
        System.out.println("City = "+data.get(1).get(4));


        System.out.println("First name = "+data.get(2).get(0));
        System.out.println("Last name = "+data.get(2).get(1));
        System.out.println("Email = "+data.get(2).get(2));
        System.out.println("Number = "+data.get(2).get(3));
        System.out.println("City = "+data.get(2).get(4));



    }





    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
        // click on sumit button
    }

    @Then("record should be inserted")
    public void record_should_be_inserted() {
        System.out.println("record should be inserted");
    }


    @When("^I enter (.+) , (.+) , (.+) , (.+) , (.+)$")
    public void i_enter_(String fname, String lname, String email, String phone, String city)
             {
                 System.out.println("First name = "+fname);
                 System.out.println("Last name = "+lname);
                 System.out.println("Email = "+email);
                 System.out.println("Number = "+phone);
                 System.out.println("City = "+city);
    }
}
