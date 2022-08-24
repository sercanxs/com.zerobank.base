package com.zerobank.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage{


    @FindBy(id ="sp_amount")
    public WebElement amount;

    @FindBy(id = "sp_date")
    public WebElement date;

    @FindBy(id = "pay_saved_payees")
    public WebElement pay;

    @FindBy(xpath = "//div[@id='alert_content']/span")
    public WebElement successMessage;

    public void payOperation(String amount,String date) {

        this.amount.sendKeys(amount);
        this.date.sendKeys(date);
        pay.click();

    }
    public void successMessageValidation(String expected){
        String actual = successMessage.getAttribute("innerHTML");
        Assert.assertTrue("they are not same", expected.equals(actual));


    }
}
