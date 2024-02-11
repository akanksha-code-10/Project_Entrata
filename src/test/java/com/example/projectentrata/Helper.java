package com.example.projectentrata;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * This class contains the basic actions related to project
 * */
public class Helper {

    public static WebDriver driver;

    /**
     * This method is used to launch the browser
     * */
    @BeforeTest
    public void setUp(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Akanksha\\Documents\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    /**
     * This method is used to print the message
     * */
    public void addTestStep(String step){
        System.out.println(step);
    }

    public void handleCookies(){
        WebElement DECLINE_COOKIES = driver.findElement(By.xpath("//button[@aria-label='Decline cookies']"));
        DECLINE_COOKIES.click();
    }

    /**
     * This method is used to close all open windows of the browser
     * */
   // @AfterTest
    public void closeBrowser(){
        driver.close();
    }

}
