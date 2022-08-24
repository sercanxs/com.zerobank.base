package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountSummaryPage extends BasePage {

public void validationAccountTypes(String types){

    String text = Driver.get().findElement(By.xpath("//*[text()='" + types + "']")).getAttribute("innerHTML");
    System.out.println(text);
    Assert.assertTrue("there are something wrong", text.equals(types));
}
}
