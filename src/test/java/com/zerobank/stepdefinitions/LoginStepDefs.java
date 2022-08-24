package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage lp = new LoginPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
      lp.loginPage();
    }


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
        lp.goToLoginPage.click();

    }
    @When("the user enters the {string} {string}")
    public void the_user_enters_the(String string, String string2) {

       lp.login(string,string2);

    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        Driver.get().navigate().back();
        Assert.assertEquals("You are not in the dashboard page",ConfigurationReader.get("main"),Driver.get().getTitle());
    }

}
