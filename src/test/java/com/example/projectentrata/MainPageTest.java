package com.example.projectentrata;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.attribute;

/**
 * This class contains all the test cases related to Entrata.com
 * */
public class MainPageTest extends Helper{

    /**
     * This test case validated all elements of Entrata home page
     * */
    @Test
    public void verifyEntrataHomePage(){

        driver.manage().window().maximize();
        driver.get("https://www.entrata.com/");
        handleCookies();
        addTestStep("Navigate to Entrata Page");

        MainPage mainPage = new MainPage();
        mainPage.verifyLogoIsDisplayed();
        addTestStep("Verify Entrata Logo is displayed");

        mainPage.verifyProductsOptionIsDisplayed();
        mainPage.verifySolutionsOptionIsDisplayed();
        mainPage.verifyResourcesOptionIsDisplayed();
        addTestStep("Verify Products drop down, Solutions drop down and Resources are displayed");

        mainPage.verifyTopWatchDemoButtonIsDisplayed();
        mainPage.verifySignInButtonIsDisplayed();
        addTestStep("Verify 'Watch Demo' button and 'Sign In' button are displayed on the top");

        mainPage.verifyHeadIsDisplayed();
        mainPage.getSystemText();
        mainPage.verifyWatchDemoButtonIsPresent();
        addTestStep("Verify Head Text, System Text are present");

        mainPage.verifyWinnerBadgeIsDisplayed();
        mainPage.verifyShortlistBadgeIsDisplayed();
        mainPage.verifyFrontRunnerBadgeIsDisplayed();
        addTestStep("Verify all badges are present");

        mainPage.verifyRightSideImageIsDisplayed();
        addTestStep("Verify Right side image is present");

        mainPage.getWhatIsEntrataText();
        addTestStep("Verify 'What is Entrata?' text is present");

        mainPage.verifyManagePortfolioHead();
        mainPage.getManagePortfolioText();
        addTestStep("Verify manage portfolio text is diplayed");

        mainPage.getDoItAllWithEntrataText();
        addTestStep("Verify 'Do it all with Entrata' text is present");

        mainPage.getPropertyManagementHeadText();
        mainPage.getPropertyManagementSubText();
        mainPage.verifyPropertyManagementExploreMoreButtonIsDisplayed();
        addTestStep("Verify all elements of 'Property Management' tile");

        mainPage.getMarketingAndLeasingHeadText();
        mainPage.getMarketingAndLeasingSubText();
        mainPage.verifyMarketingAndLeasingExploreMoreButtonIsDisplayed();
        addTestStep("Verify all elements of 'Marketing & Leasing' tile");

        mainPage.getAccountingHeadText();
        mainPage.getAccountingSubText();
        mainPage.verifyAccountingExploreMoreButtonIsDisplayed();
        addTestStep("Verify all elements of 'Accounting' tile");

        mainPage.getUtilitiesHeadText();
        mainPage.getUtilitiesSubText();
        mainPage.verifyUtilitiesExploreMoreButtonIsDisplayed();
        addTestStep("Verify all elements of 'Utilities' tile");
    }

    /**
     * This test case validates Manager login actions and validate the elements present between login action
     * */
    @Test
    public void verifyManagerLoginAction() {

        String loginText = "If you are a property manager, login with your property details. If you are a resident, please use the link below to access ResidentPortal.";

        driver.manage().window().maximize();
        driver.get("https://www.entrata.com/");
        handleCookies();
        addTestStep("Navigate to Entrata Page");

        MainPage mainPage = new MainPage();
        mainPage.clickSignIn();
        addTestStep("Click on Sign in button");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();
        loginPage.verifyEntrataLogoIsDisplayed();
        addTestStep("Verify Entrata logo is present on the top of the page");

        Assert.assertEquals(loginPage.getLoginText(), loginText, "Verify login text after clicking on login button");
        addTestStep("Verify text on the login page");

        loginPage.verifyManagerLoginButton();
        loginPage.verifyResidentLoginButton();
        addTestStep("Verify 'Property Manager Login' and 'Resident Login' button");

        loginPage.clickManagerLogin();
        addTestStep("Click on Manager Login");

        ManagerLogin managerLogin = new ManagerLogin();
        managerLogin.verifySignInEntrataIsDisplayed();
        managerLogin.verifyUsernameField();
        managerLogin.verifyPasswordField();
        managerLogin.verifySignInButton();
        addTestStep("Verify Manager Login Page");

    }

    /**
     * This test case validates Resident login actions and validates the element present between login action
     * */
    @Test
    public void verifyResidentMobileAppPage(){

        String appText = "Welcome to the\n" +
                "ResidentPortal\n" +
                "app.";

        driver.manage().window().maximize();
        driver.get("https://www.entrata.com/");
        handleCookies();
        addTestStep("Navigate to Entrata Page");

        MainPage mainPage = new MainPage();
        mainPage.clickSignIn();
        addTestStep("Click on Sign in button");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        LoginPage loginPage = new LoginPage();
        loginPage.clickResidentLogin();
        addTestStep("Click on Resident Login");

        ResidentLogin residentLogin = new ResidentLogin();
        residentLogin.verifyRPLogoIsDisplayed();
        residentLogin.verifyWelcomeTextIsDisplayed();
        residentLogin.verifyViewTheAppButtonIsDisplayed();
        residentLogin.verifyViewTheWebsiteButtonIsDisplayed();
        addTestStep("Verify Resident Portal Page");

        residentLogin.clickViewTheApp();
        addTestStep("Click on 'View the App' button");

        ViewAppPage viewAppPage = new ViewAppPage();
        Assert.assertEquals(viewAppPage.verifyAppText(),appText,"Verify application is navigated to app page");
    }

    /**
     * This test case validates the Resources page
     * */
    @Test
    public void verifyResourcePage(){

        driver.manage().window().maximize();

        driver.get("https://www.entrata.com/");
        handleCookies();
        addTestStep("Navigate to Entrata page");

        MainPage mainPage = new MainPage();
        mainPage.clickResources();

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        ResourcePage resourcePage = new ResourcePage();
        resourcePage.verifyResourceCenterIsDisplayed();
        addTestStep("Verify Resource Page");

        resourcePage.verifyAllTab();
        resourcePage.verifyGuidesTab();
        resourcePage.verifyWebinarsTab();
        resourcePage.verifyReportsTab();
        addTestStep("Verify tabs in Resource page");
    }
}