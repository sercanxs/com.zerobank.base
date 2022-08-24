package com.zerobank.stepdefinitions;

import com.zerobank.pages.BasePageSubPage;
import io.cucumber.java.en.Then;

public class BasePageStepDefs {
    BasePageSubPage bp = new BasePageSubPage();

    @Then("this page should have the title {string}")
    public void this_page_should_have_the_title(String expected) {

        bp.showTitle(expected);
    }

}
