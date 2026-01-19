package testScripts;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageClasses.HomePage;
import pageClasses.UserAccountPage;
import pageClasses.LoginPage;

public class LoginScripts extends BaseTest {


    @Test(groups={"Smoke","Regression"})
    public void loginValidation(){

        logger.info("Starting login Test");

        HomePage HomePageObj = new HomePage(driver);
        HomePageObj.clickMyAccountTab();
        logger.debug("clicked on my account tab");
        HomePageObj.clickOnLoginLink();


        LoginPage loginPageObj = new LoginPage(driver);
        loginPageObj.login(propObj.getProperty("username"),propObj.getProperty("password"));

        //page verifications
        UserAccountPage UserAccountPageObj = new UserAccountPage(driver);
        boolean isLoggedIn = UserAccountPageObj.isLandingPageIsDisplayed();

        Assert.assertTrue(isLoggedIn,"Not logged in please check credentails");







    }

}