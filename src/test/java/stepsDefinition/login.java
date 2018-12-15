package stepsDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() throws Throwable {
        System.out.println("Rishi");
    }

    @Given("^I navigate to the login page of the application$")
    public void iNavigateToTheLoginPageOfTheApplication() throws Throwable {
        System.out.println("Rishi\n");
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        System.out.println("/nRishi the starter");
    }

    @And("^I enter the \"([^\"]*)\" and \"([^\"]*)\" as admin$")
    public void iEnterTheAndAsAdmin(String userName, String password) throws Throwable {
        System.out.println("User name is " +userName);
        System.out.println("The password is " +password);
    }
}
