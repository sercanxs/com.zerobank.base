package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy(id = "account_summary_link")
    public WebElement accountSummary;

    @FindBy(id = "account_activity_link")
    public WebElement accountActivity;

    @FindBy(id = "transfer_funds_link")
    public WebElement transferFunds;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(id = "money_map_link")
    public WebElement myMoneyMap;

    @FindBy(id = "online_statements_link")
    public WebElement onlineStatements;

    public void onlineBanking(String choose) {
        onlineBanking.click();
        switch (choose) {

            case "as":
                accountSummary.click();
                break;
            case "aa":
                accountActivity.click();
                break;
            case "tf":
                transferFunds.click();
                break;
            case "pb":
                payBills.click();
                break;
            case "mmm":
                myMoneyMap.click();
                break;
            case "os":
                onlineStatements.click();
                break;
        }

    }
}
