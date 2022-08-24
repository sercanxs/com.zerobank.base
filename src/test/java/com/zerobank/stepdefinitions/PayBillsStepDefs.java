package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PayBillsStepDefs {

    PayBillsPage pb = new PayBillsPage();

    @When("User should able to complete pay operation {string} {string}")
    public void user_should_able_to_complete_pay_operation(String string, String string2) {

        pb.payOperation(string,string2);
    }

    @Then("user should able to get this message {string}")
    public void user_should_able_to_get_this_message(String string) {

        pb.successMessageValidation(string);
    }
}
