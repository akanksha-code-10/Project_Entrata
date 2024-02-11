package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * This class contains all the Locator declaration and method implementation of Resident login page
 * */
public class ResidentLogin extends Helper{

    WebElement RP_LOGO = driver.findElement(By.xpath("//img[@alt='ResidentPortal app']"));
    WebElement WELCOME_TO_RESIDENT_PORTAL = driver.findElement(By.xpath("//div[@class='intro-content']/h1"));
    WebElement VIEW_THE_APP = driver.findElement(By.xpath("//div[text()='View the App']"));
    WebElement VIEW_THE_WEBSITE = driver.findElement(By.xpath("//div[text()='View the Website']"));

    /**
     * This method checks Resident Portal logo is displayed or not
     * */
    public void verifyRPLogoIsDisplayed(){
        Assert.assertEquals(RP_LOGO.isDisplayed(),true,"Verify 'Resident Portal' logo is displayed");
    }

    /**
     * This method checks 'Welcome to Resident Portal' text is displayed or not
     * */
    public void verifyWelcomeTextIsDisplayed(){
        Assert.assertEquals(WELCOME_TO_RESIDENT_PORTAL.isDisplayed(),true,"Verify 'Welcome to Resident Portal' text is displayed");
    }

    /**
     * This method checks 'View the App' button is displayed or not in resident login page
     * */
    public void verifyViewTheAppButtonIsDisplayed(){
        Assert.assertEquals(VIEW_THE_APP.isDisplayed(),true,"Verify 'View the App' button is present");
    }

    /**
     * This method checks 'View the Website' button is present or not in resident login page
     * */
    public void verifyViewTheWebsiteButtonIsDisplayed(){
        Assert.assertEquals(VIEW_THE_WEBSITE.isDisplayed(),true,"Verify 'View the Website' button is present");
    }

    /**
     * This method clicks on 'View the App' button
     * */
    public void clickViewTheApp(){
        VIEW_THE_APP.click();
    }
}
