package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This class contains all the locator declaration and method implementation of 'View Mobile App' page
 * */
public class ViewAppPage extends Helper{

    WebElement APP_TEXT = driver.findElement(By.xpath("//div[@class='two-third']/h1"));

    /**
     * This method checks the text in Mobile App page
     * */
    public String verifyAppText(){
        return APP_TEXT.getText();
    }

}
