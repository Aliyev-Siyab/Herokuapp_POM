package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxesPage extends BasePage{
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(1)")
    WebElement box1;
    @FindBy(css = "#checkboxes > input[type=checkbox]:nth-child(3)")
    WebElement box2;

    public CheckboxesPage selectCheckbox(String[] box) {
        for (int i = 0; i < box.length; i++) {
            if(box[i].equals("checkbox 1")){
                click(box1);
            } else if (box[i].equals("checkbox 2")) {
                click(box2);
            }
        }
        return this;
    }

    public void verifyChecking() {
        Assert.assertTrue(box2.isEnabled(), "Checkbox 2 is not selected");
    }
}
