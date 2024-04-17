package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class JavaScriptAlerts extends BasePage {
    public JavaScriptAlerts(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[onclick='jsAlert()']")
    WebElement jSAlertButton;

    public JavaScriptAlerts alertJs() {
        click(jSAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public JavaScriptAlerts verifyAlertResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

    @FindBy(css = "[onclick='jsConfirm()']")
    WebElement jsConfirmButton;
    public JavaScriptAlerts alertJsConfirm(String confirm) {
        click(jsConfirmButton);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(css = "[onclick='jsPrompt()']")
    WebElement jSPrompt;
    public JavaScriptAlerts sendMessageToAlert(String message) {
        click(jSPrompt);
        if(message != null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id="result")
    WebElement promptResult;
    public JavaScriptAlerts verifyMessage(String text) {
        Assert.assertTrue(promptResult.getText().contains(text));
        return this;
    }
}
