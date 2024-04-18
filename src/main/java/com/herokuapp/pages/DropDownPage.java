package com.herokuapp.pages;

import org.openqa.selenium.Keys;
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

    public DropDownPage selectOptionPresent(String option) {
        Select select = new Select(optionContainer);
        select.selectByVisibleText(option);
        List<WebElement> options = select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText() + " is first");
        System.out.println("======================================================");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        // Получаем выбранный элемент и сравниваем его текст с ожидаемым значением
        WebElement selectedOption = select.getFirstSelectedOption();
        String actualText = selectedOption.getText();
        Assert.assertEquals(actualText, option, "Selected option is not present in the dropdown");
        return this;
    }

}
