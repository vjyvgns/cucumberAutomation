package stepDefinition;

import io.cucumber.java.en.*;

public class loginPageSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Login Page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Username and Password");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Clicking login button");
    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("Navigated to Home Page");
    }
}
