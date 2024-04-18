package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement optionContainer;

    public DropDownPage selectOption(String option) {
        Select select = new Select(optionContainer);
        select.selectByVisibleText(option);
        List<WebElement> options = select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText() + " is first");
        System.out.println("======================================================");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }

    public DropDownPage isOptionSelected(String expectedOption) {
        Select select = new Select(optionContainer);
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains(expectedOption),
                "Selected option does not contain the expected text: " + expectedOption);
        return this;
    }
}
