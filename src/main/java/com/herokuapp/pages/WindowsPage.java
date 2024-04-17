package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage{
    public WindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/windows/new']")
    WebElement windowButton;

    public WindowsPage switchToNextWindow(int index) {
        click(windowButton);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(xpath = "//h3")
    WebElement sampleHeading;
    public WindowsPage verifyNewWindowMessage(String text) {
        Assert.assertTrue(shouldHaveText(sampleHeading,text,10));
        return this;
    }
}
