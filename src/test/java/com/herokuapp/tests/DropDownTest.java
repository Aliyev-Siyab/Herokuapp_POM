package com.herokuapp.tests;

import com.herokuapp.pages.DropDownPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getDropdownPage();

    }
    @Test
    public void dropDownTest(){
        new DropDownPage(driver)
                .IsOptionPresent("Option 1");
    }
}
