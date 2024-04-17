package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.WindowsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowsTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getMultipleWindows();
    }


    @Test
    public void newWindowsTest(){
        new WindowsPage(driver).switchToNextWindow(1).verifyNewWindowMessage("New Window");
    }
}
