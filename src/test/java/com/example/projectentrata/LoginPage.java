package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * This class contains all Locator declaration and method implementation part related to Login page
 * */
public class LoginPage extends Helper{

    WebElement ENTRATA_LOGO = driver.findElement(By.xpath("//a[@class='main-header-logo']"));
    WebElement LOGIN_PAGE_TEXT = driver.findElement(By.xpath("//div[@class='markdown']"));
    WebElement MANAGER_LOGIN = driver.findElement(By.xpath("//a[@title='Client Login Button']"));
    WebElement RESIDENT_LOGIN = driver.findElement(By.xpath("//a[@title='Resident Portal Login Button']"));

    /**
     * This method checks whether Entrata logo is displayed or not
     * */
    public void verifyEntrataLogoIsDisplayed(){
        Assert.assertEquals(ENTRATA_LOGO.isDisplayed(),true,"Verify Entrata logo is present on the top");
    }

    /**
     * This method checks the text in login page
     * */
    public String getLoginText(){
        return LOGIN_PAGE_TEXT.getText();
    }

    /**
     * This method checks whether Manager Login option is present or not
     * */
    public void verifyManagerLoginButton(){
        Assert.assertEquals(MANAGER_LOGIN.isDisplayed(),true,"Verify 'Property Manager Login' button is present");
    }

    /**
     * This method checks whether Resident Login option is present or not
     * */
    public void verifyResidentLoginButton(){
        Assert.assertEquals(RESIDENT_LOGIN.isDisplayed(),true,"Verify 'Resident Login' button is Present");
    }

    /**
     * This method clicks on Manager Login button
     * */
    public void clickManagerLogin(){
        MANAGER_LOGIN.click();
    }

    /**
     * This method clicks on Resident login button
     * */
    public void clickResidentLogin(){
        RESIDENT_LOGIN.click();
    }
}
