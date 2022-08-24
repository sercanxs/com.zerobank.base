package com.zerobank.stepdefinitions;

import com.zerobank.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardStepDefs {

    DashboardPage dp = new DashboardPage();

    @When("the user should be able lands on {string}")
    public void the_user_should_be_able_lands_on(String string) {


        dp.onlineBanking(string);

    }


}
