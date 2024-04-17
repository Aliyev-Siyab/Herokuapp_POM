package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "file-upload")
    WebElement fileUpload;
    @FindBy(id = "file-submit") // id="file-submit"
    WebElement fileSubmitButton;
    public FileUploadPage uploadFile(String path) {
        fileUpload.sendKeys(path);
        click(fileSubmitButton);
        return this;
    }

    @FindBy(id = "content")
    WebElement successTitle;
    public void verifySuccesTitle(String title) {
        Assert.assertTrue(shouldHaveText(successTitle,title,10));
    }
}
