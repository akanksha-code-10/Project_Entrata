package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * This class contains all Locator declaration and method implementation part of Manager login
 * */
public class ManagerLogin extends Helper{

    WebElement SIGN_IN_TO_ENTRATA = driver.findElement(By.xpath("//h2[@class='fsm-header']"));
    WebElement USERNAME = driver.findElement(By.id("entrata-username"));
    WebElement PASSWORD = driver.findElement(By.id("entrata-password"));
    WebElement SIGN_IN_BUTTON = driver.findElement(By.xpath("//li[@class='form-item submit']"));

    /**
     * This method validate Sign In to Entrata text displayed or not
     * */
    public void verifySignInEntrataIsDisplayed(){
        Assert.assertEquals(SIGN_IN_TO_ENTRATA.isDisplayed(),true,"Verify Manager Login Page");
    }

    /**
     * This method validate Username field is displayed or not
     * */
    public void verifyUsernameField(){
        Assert.assertEquals(USERNAME.isDisplayed(),true,"Verify option is present to enter user name");
    }

    /**
     * This method validate Password field is displayed or not
     * */
    public void verifyPasswordField(){
        Assert.assertEquals(PASSWORD.isDisplayed(),true,"Verify option is present to enter password");
    }

    /**
     * This method validate Sign In button is displayed or not
     * */
    public void verifySignInButton(){
        Assert.assertEquals(SIGN_IN_BUTTON.isDisplayed(),true,"Verify 'Sign In' button is present");
    }
}
