package com.herokuapp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DropDownPage extends BasePage{
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="dropdown" )
    WebElement optionContainer;
    @FindBy(xpath = "//option[.='Option 1']")
    WebElement option1;
    @FindBy(xpath = "//option[.='Option 2']")
    WebElement option2;
    public DropDownPage selectOption() {
        click(optionContainer);
        optionContainer.sendKeys(Keys.ARROW_DOWN);
        optionContainer.sendKeys(Keys.ENTER);
        return this;
    }

    public void isOptionSelected() {
        Assert.assertTrue(option1.isSelected(), "Option 2 is not selected");
    }
}
