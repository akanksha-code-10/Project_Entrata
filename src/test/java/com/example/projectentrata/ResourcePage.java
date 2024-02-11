package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * This method contains all the Locator declaration and method implementation part of Resource page
 * */
public class ResourcePage extends Helper{

    WebElement RESOURCE_CENTER = driver.findElement(By.xpath("//h2[text()='Resource Center']"));
    WebElement ALL_TAB = driver.findElement(By.xpath("//div[@class='tab-nav-item all-tab selected-tab']"));
    WebElement GUIDES_TAB = driver.findElement(By.xpath("//div[@class='tab-nav-item guides-tab']"));
    WebElement WEBINARS_TAB = driver.findElement(By.xpath("//div[@class='tab-nav-item webinars-tab']"));
    WebElement REPORTS_TAB = driver.findElement(By.xpath("//div[@class='tab-nav-item reports-tab']"));

    /**
     * This method checks 'Resource Center' text is displayed or not
     * */
    public void verifyResourceCenterIsDisplayed(){
        Assert.assertEquals(RESOURCE_CENTER.isDisplayed(),true,"Verify Resource Center Label");
    }

    /**
     * This method checks 'All' tab is displayed in resource page
     * */
    public void verifyAllTab(){
        Assert.assertEquals(ALL_TAB.isDisplayed(),true,"Verify 'All' tab");
    }

    /**
     * This method checks 'Guides' tab is displayed in resource page
     * */
    public void verifyGuidesTab(){
        Assert.assertEquals(GUIDES_TAB.isDisplayed(),true,"Verify 'Guides' tab");
    }

    /**
     * This method checks 'Webinars' tab is displayed in resource page
     * */
    public void verifyWebinarsTab(){
        Assert.assertEquals(WEBINARS_TAB.isDisplayed(),true,"Verify 'Webinars' tab");
    }

    /**
     * This method checks 'Reports' tab is displayed in resource page
     * */
    public void verifyReportsTab(){
        Assert.assertEquals(REPORTS_TAB.isDisplayed(),true,"Verify 'Reports' tab");
    }
}
