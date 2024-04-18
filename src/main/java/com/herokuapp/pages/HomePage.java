package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[href='/javascript_alerts']")
    WebElement javaScriptAlerts;

    public HomePage getJavaScriptAlerts() {
    click(javaScriptAlerts);
    return new HomePage(driver);
    }

    @FindBy(css = "[href='/windows']")
    WebElement multipleWindowsLink;
    public HomePage getMultipleWindows() {
        click(multipleWindowsLink);
        return new HomePage(driver);
    }

    @FindBy(css = "[href='/checkboxes']")
    WebElement checkboxLink;
    public HomePage getCheckboxesPage() {
        click(checkboxLink);
        return new HomePage(driver);
    }

    @FindBy(css = "[href='/dropdown']")
    WebElement dropdownLink;
    public HomePage getDropdownPage() {
        click(dropdownLink);
        return new HomePage(driver);
    }


    @FindBy(css = "[href='/upload']")
    WebElement uploadLink;
    public HomePage getFileUploadPage() {
        click(uploadLink);
        return new HomePage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImagesLink;
    public HomePage getBrokenImagesPage() {
        click(brokenImagesLink);
        return new HomePage(driver);
    }


    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDropLink;
    public HomePage getDragAndDropPage() {
        click(dragAndDropLink);
        return new HomePage(driver);
    }
}
