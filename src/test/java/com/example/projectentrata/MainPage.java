package com.example.projectentrata;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * This class contains all the locator declaration and method implementation part related to Home Page
 * */
// page_url = https://www.jetbrains.com/
public class MainPage extends Helper{

      WebElement ENTRATA_LOGO = driver.findElement(By.xpath("//a[@class='main-header-logo']"));
      WebElement PRODUCTS = driver.findElement(By.xpath(" //div[@class='header-desktop-nav hide-on-mobile']/div[@class='header-nav-item']/div[text()='Products']"));
      WebElement SOLUTIONS = driver.findElement(By.xpath(" //div[@class='header-desktop-nav hide-on-mobile']/div[@class='header-nav-item']/div[text()='Solutions']"));
      WebElement RESOURCES = driver.findElement(By.xpath(" //div[@class='header-desktop-nav hide-on-mobile']/div[@class='header-nav-item']/a[text()='Resources']"));
      WebElement TOP_WATCH_DEMO_BUTTON = driver.findElement(By.xpath("//div[@class='main-header-grid']/div[@class=\"header-desktop-buttons hide-on-mobile\"]/a[@class='button-default solid-dark-button']"));
      WebElement SIGN_IN_BUTTON = driver.findElement(By.xpath("//div[@class='main-header-grid']/div[@class=\"header-desktop-buttons hide-on-mobile\"]/a[@href='/sign-in']"));
      WebElement ENABLING_EFFICIENT_OPERATION = driver.findElement(By.xpath("//div[@class=\"hero-left\"]/h1[text()='Enabling efficient operations']"));
      WebElement SYSTEM_TEXT = driver.findElement(By.xpath("//div[@class='hero-left']/div[@class='markdown']"));
      WebElement WATCH_DEMO_BUTTON = driver.findElement(By.xpath("//div[@class='hero-left']/div[@class='button-holder']/a[@title='Watch Demo Button']"));
      WebElement WINNER = driver.findElement(By.xpath("//div[@class='hero-left']//div[@class='badge-1-container']"));
      WebElement SHORTLIST = driver.findElement(By.xpath("//div[@class='hero-left']//div[@class='badge-2-container']"));
      WebElement FRONT_RUNNER = driver.findElement(By.xpath("//div[@class='hero-left']//div[@class='badge-3-container']"));
      WebElement RIGHT_SIDE_IMAGE = driver.findElement(By.xpath("//div[@class=\"hero-right\"]/div[@class=\"main-image-container\"]"));
      WebElement WHAT_IS_ENTRATA_TEXT = driver.findElement(By.xpath("//div[@class='video-button-feature']/span[@id='wistia-0murpe5hrg-1']/div/a"));
      WebElement MANAGE_PORTFOLIO_HEAD = driver.findElement(By.xpath("//h2[text()='Manage your entire portfolio in one operating system']"));
      WebElement MANAGE_PORTFOLIO_TEXT = driver.findElement(By.xpath("//div[@class='p-mobile-margin markdown']/p"));
      WebElement DO_IT_ALL_WITH_ENTRATA = driver.findElement(By.xpath("//div[@class='four-bucket-header']"));
      WebElement PROPERTY_MANAGEMENT_TILE_HEAD = driver.findElement(By.xpath("//h3[text()='Property Management']"));
      WebElement PROPERTY_MANAGEMENT_TILE_SUBTEXT = driver.findElement(By.xpath("//h3[text()='Property Management']/following-sibling::h4"));
      WebElement PROPERTY_MANAGEMENT_EXPLORE_MORE_BUTTON = driver.findElement(By.xpath("//div[@title='Property Management Explore Link']"));
      WebElement MARKETING_AND_LEASING_TILE_HEAD = driver.findElement(By.xpath("//h3[text()='Marketing & Leasing']"));
      WebElement MARKETING_AND_LEASING_TILE_SUBTEXT = driver.findElement(By.xpath("//h3[text()='Marketing & Leasing']/following-sibling::h4"));
      WebElement MARKETING_AND_LEASING_EXPLORE_MORE_BUTTON = driver.findElement(By.xpath("//div[@title='Marketing & Leasing Explore Link']"));
      WebElement ACCOUNTING_TILE_HEAD = driver.findElement(By.xpath("//h3[text()='Accounting']"));
      WebElement ACCOUNTING_TILE_SUBTEXT = driver.findElement(By.xpath("//h3[text()='Accounting']/following-sibling::h4"));
      WebElement ACCOUNTING_EXPLORE_MORE_BUTTON = driver.findElement(By.xpath("//div[@title='Accounting Explore Link']"));
      WebElement UTILITIES_TILE_HEAD = driver.findElement(By.xpath("//h3[text()='Utilities']"));
      WebElement UTILITIES_TILE_SUBTEXT = driver.findElement(By.xpath("//h3[text()='Utilities']/following-sibling::h4"));
      WebElement UTILITIES_EXPLORE_MORE_BUTTON = driver.findElement(By.xpath("//div[@title='Utilities Explore Link']"));

      /**
       * This method checks whether Entrata Logo is displayed at the top or not
       * */
      public void verifyLogoIsDisplayed(){
        Assert.assertEquals(ENTRATA_LOGO.isDisplayed(),true,"Verify logo is displayed");
      }

      /**
       * This method checks whether products option is displayed or not
       * */
      public void verifyProductsOptionIsDisplayed(){
        Assert.assertEquals(PRODUCTS.isDisplayed(),true,"Verify 'Product' drop down is displayed");
      }

      /**
       * This method checks whether Solutions option is displayed or not
       * */
      public void verifySolutionsOptionIsDisplayed(){
        Assert.assertEquals(SOLUTIONS.isDisplayed(),true,"Verify 'Solutions' drop down is present");
      }

      /**
       * This method checks whether Resources option is displayed or not
       * */
      public void verifyResourcesOptionIsDisplayed(){
        Assert.assertEquals(RESOURCES.isDisplayed(),true,"Verify 'Resources' option is present");
      }

      /**
       * This method checks whether Watch Demo button is present at the top of page or not
       * */
      public void verifyTopWatchDemoButtonIsDisplayed(){
        Assert.assertEquals(TOP_WATCH_DEMO_BUTTON.isDisplayed(),true,"Verify 'Watch Demo' button is Present on the top");
      }

      /**
       * This method checks whether Sign in button is present or not
       * */
      public void verifySignInButtonIsDisplayed(){
        Assert.assertEquals(SIGN_IN_BUTTON.isDisplayed(),true,"Verify 'Sign In' button is displayed");
      }

      /**
       * This method checks Head text is displayed at left side of the page or not
       * */
      public void verifyHeadIsDisplayed(){
        Assert.assertEquals(ENABLING_EFFICIENT_OPERATION.isDisplayed(),true,"Verify Head Text is displayed");
      }

      /**
       * This method checks whether text is present below head text or not
       * */
      public void getSystemText(){
        String systemText = "The operating system built to help you focus on residents, not technology.";
        Assert.assertEquals(SYSTEM_TEXT.getText(),systemText,"Verify System Text is present");
      }

      /**
       * This method checks whether Watch Demo button is present at left side of the page or not
       * */
      public void verifyWatchDemoButtonIsPresent(){
        Assert.assertEquals(WATCH_DEMO_BUTTON.isDisplayed(),true,"Verify 'Watch Demo' Button is present");
      }

      /**
       * This method checks whether Winner Badge is displayed at left side of the page or not
       * */
      public void verifyWinnerBadgeIsDisplayed(){
        Assert.assertEquals(WINNER.isDisplayed(),true,"Verify 'Winner' badge is displayed");
      }

      /**
       * This method checks whether Shortlist Badge is displayed at left side of the page or not
       * */
      public void verifyShortlistBadgeIsDisplayed(){
        Assert.assertEquals(SHORTLIST.isDisplayed(),true,"Verify 'Shortlist' badge is displayed");
      }

      /**
       * This method checks whether Front Runner is displayed at left side of the page or not
       * */
      public void verifyFrontRunnerBadgeIsDisplayed(){
        Assert.assertEquals(FRONT_RUNNER.isDisplayed(),true,"Verify 'Runner' Badge is displayed");
      }

      /**
       * This method checks whether Image is present at right side of the page or not
       * */
      public void verifyRightSideImageIsDisplayed(){
        Assert.assertEquals(RIGHT_SIDE_IMAGE.isDisplayed(),true,"Verify Right side image is present");
      }

      /**
       * This method checks 'What is Entrata?' is present at right side of the page or not
       * */
      public void getWhatIsEntrataText(){
        String whatIsEntrataText = "What is Entrata?";
        Assert.assertEquals(WHAT_IS_ENTRATA_TEXT.getText(),whatIsEntrataText,"Verify 'What is Entrata?' text");
      }

      /**
       * This method checks 'Manager Portfolio' head text is present at middle of the page or not
       * */
      public void verifyManagePortfolioHead(){
        Assert.assertEquals(MANAGE_PORTFOLIO_HEAD.isDisplayed(),true,"Verify manage portfolio head is displayed");
      }

      /**
       * This method checks 'Manager Portfolio' text is present at middle of the page or not
       * */
      public void getManagePortfolioText(){
        String portfolioText = "Some of the world’s largest owners and operators use Entrata to run their properties. That’s millions of residents in thousands of apartment communities.";
        Assert.assertEquals(MANAGE_PORTFOLIO_TEXT.getText(),portfolioText,"Verify manage portfolio text is present");
      }

      /**
       * This method checks 'Do it all with Entrata' head text is present or not
       * */
      public void getDoItAllWithEntrataText(){
          String doItAllWithEntrata = "Do it all with Entrata";
          Assert.assertEquals(DO_IT_ALL_WITH_ENTRATA.getText(),doItAllWithEntrata,"Verify 'Do it all with Entrata' text is present");
      }

      /**
       * This method checks 'Property Management' text is present or not
       * */
      public void getPropertyManagementHeadText(){
          String propertyManagement = "Property Management";
          Assert.assertEquals(PROPERTY_MANAGEMENT_TILE_HEAD.getText(),propertyManagement,"Verify 'Property Management' tile is present");
      }

      /**
       * This method checks sub text is present in 'Property Management' tile
       * */
      public void getPropertyManagementSubText(){
          String propertyManagementSubText = "Manage all your property operations in one place.";
          Assert.assertEquals(PROPERTY_MANAGEMENT_TILE_SUBTEXT.getText(),propertyManagementSubText,"Verify Property Management sub text is present");
      }

      /**
       * This method checks whether 'Explore More' button in 'Property Management' tile
       * */
      public void verifyPropertyManagementExploreMoreButtonIsDisplayed(){
          Assert.assertEquals(PROPERTY_MANAGEMENT_EXPLORE_MORE_BUTTON.isDisplayed(),true,"Verify 'Explore More' button is present in 'Property Management' tile");
      }

      /**
       * This method checks whether 'Marketing & Leasing' text tile
       * */
      public void getMarketingAndLeasingHeadText(){
          String marketingAndLeasing = "Marketing & Leasing";
          Assert.assertEquals(MARKETING_AND_LEASING_TILE_HEAD.getText(),marketingAndLeasing,"Verify 'Marketing & Leasing' tile is present");
      }

      /**
       * This method checks whether sub text is present in 'Attract and Convert Prospects faster' in tile
       * */
      public void getMarketingAndLeasingSubText(){
          String marketingAndLeasingSubText = "Attract and convert prospects faster.";
          Assert.assertEquals(MARKETING_AND_LEASING_TILE_SUBTEXT.getText(),marketingAndLeasingSubText,"Verify Marketing & Leasing sub text is present");
      }

      /**
       * This method checks whether 'Explore More' button present in 'Marketing & Leasing' tile
       * */
      public void verifyMarketingAndLeasingExploreMoreButtonIsDisplayed(){
          Assert.assertEquals(MARKETING_AND_LEASING_EXPLORE_MORE_BUTTON.isDisplayed(),true,"Verify 'Explore More' button is present in 'Marketing & Leasing' tile");
      }

      /**
       * This method whether 'Accounting' text is present in the tile
       * */
    public void getAccountingHeadText(){
          String accounting = "Accounting";
          Assert.assertEquals(ACCOUNTING_TILE_HEAD.getText(),accounting,"Verify 'Accounting' tile is present");
    }

    /**
     * This method whether sub text is present in the 'Accounting' tile
     * */
    public void getAccountingSubText(){
          String accountingSubText = "Manage and track property and portfolio performance.";
          Assert.assertEquals(ACCOUNTING_TILE_SUBTEXT.getText(),accountingSubText,"Verify Accounting sub text is present");
    }

    /**
     * This method whether 'Explore More' button is present in 'Accounting' tile
     * */
    public void verifyAccountingExploreMoreButtonIsDisplayed(){
          Assert.assertEquals(ACCOUNTING_EXPLORE_MORE_BUTTON.isDisplayed(),true,"Verify 'Explore More' button is present in 'Accounting' tile");
    }

    /**
     * This method checks 'Utilities' text in the tile
     * */
    public void getUtilitiesHeadText(){
          String utilities = "Utilities";
          Assert.assertEquals(UTILITIES_TILE_HEAD.getText(),utilities,"Verify 'Utilities' tile is present");
    }

    /**
     * This method checks sub text is present in 'Utilities' tile
     * */
    public void getUtilitiesSubText(){
          String utilitySubText = "Centralize and manage reporting and expense recapture.";
          Assert.assertEquals(UTILITIES_TILE_SUBTEXT.getText(),utilitySubText,"Verify Utilities sub text is present");
    }

    /**
     * This method is checks 'Explore More' button present in 'Utilities' tile
     * */
    public void verifyUtilitiesExploreMoreButtonIsDisplayed(){
          Assert.assertEquals(UTILITIES_EXPLORE_MORE_BUTTON.isDisplayed(),true,"Verify 'Explore More' button is present in 'Utilities' tile");
    }

    /**
     * This method clicks on 'Sign In' button
     * */
    public void clickSignIn(){
          SIGN_IN_BUTTON.click();
    }

    /**
     * This method clicks on 'Resources' option
     * */
    public void clickResources(){
          RESOURCES.click();
    }
}
