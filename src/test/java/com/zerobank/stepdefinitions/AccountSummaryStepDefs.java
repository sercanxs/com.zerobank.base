package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountSummaryStepDefs {

    AccountSummaryPage asp = new AccountSummaryPage();

    @Then("Account summary page should have to following account types {string}")
    public void account_summary_page_should_have_to_following_account_types(String types) {

asp.validationAccountTypes(types);


    }


}
