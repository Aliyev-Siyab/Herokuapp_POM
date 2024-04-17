package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getCheckboxesPage();

    }

    @Test
    public void checkboxesTest() {
        new CheckboxesPage(driver)
                .selectCheckbox(new String[]{"checkbox 2"})
                .verifyChecking();
    }
}
