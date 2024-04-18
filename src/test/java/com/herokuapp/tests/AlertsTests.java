package com.herokuapp.tests;

import com.herokuapp.pages.HomePage;
import com.herokuapp.pages.JavaScriptAlerts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    // mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getJavaScriptAlerts();
    }

    @Test
    public void alertJs(){
        new JavaScriptAlerts(driver).alertJs().verifyAlertResult("You successfully clicked an alert");
    }

    @Test
    public void alertJsConfirm(){
        new JavaScriptAlerts(driver).alertJsConfirm("OK").verifyAlertResult("You clicked: Ok");
    }

    @Test
    public void alertJsPrompt(){
        new JavaScriptAlerts(driver).sendMessageToAlert("Hello world").verifyMessage("You entered: Hello world");
    }
}
