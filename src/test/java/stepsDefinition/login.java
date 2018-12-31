package stepsDefinition;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.List;

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
        System.out.println("User name is " + userName);
        System.out.println("The password is " + password);
    }

    @And("^I enter the following for the login$")
    public void iEnterTheFollowingForTheLogin(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List<List<String>> data =table.raw();
        System.out.println("The username is from datatable:"+data.get(1).get(0));
        System.out.println("The password is from datatable:"+data.get(1).get(1));
    }
}
