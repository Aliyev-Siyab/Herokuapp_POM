package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DragAndDropPage extends BasePage{
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }
    // id="column-a"

    @FindBy(id = "column-a")
    WebElement dragA;
    @FindBy(id = "column-b")
    WebElement dropB;
    public DragAndDropPage actionDragA() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragA,dropB).perform();
        String text = dropB.getText();
        if(text.equals("A")){
            System.out.println("PASSED");
        } else{
            System.out.println("FAIL");
        }
        return this;
    }

    public void actionDragAIsPassed(String expectedText) {
        String actualText = dropB.getText();
        Assert.assertEquals(actualText, expectedText, "Text in drop area is not as expected");
    }
}
