package testScripts;

import utilities.DataProviders;
import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.UserAccountPage;
import pageClasses.LoginPage;

import java.util.Base64;

public class LoginDataDrivenTest extends BaseTest {


    @Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = {"P1","Regression","Login"})
    public void performLoginWithDifferentData(String username, String pwd, String expectedCase){

        logger.info("Starting performLoginWithDifferentData script");

        HomePage HomePageObj = new HomePage(driver);
        HomePageObj.clickMyAccountTab();
        logger.debug("clicked on my account tab");
        HomePageObj.clickOnLoginLink();

        LoginPage LoginPageObj = new LoginPage(driver);
        LoginPageObj.login(username,pwd);

        UserAccountPage UserAccountPageObj = new UserAccountPage(driver);
        boolean isLoggedIn = UserAccountPageObj.isLandingPageIsDisplayed();

        if(true){
            logger.info("logged in successfully");
            UserAccountPageObj.performLogout();
        }else{
            logger.info("Not successfully logged in");
        }

        boolean expectedflag = true;
        if(expectedCase== "Valid") expectedflag = true;
        else expectedflag = false;

        if( isLoggedIn == expectedflag ){
            logger.info("Validaiton is passed");
        } else {
            logger.info("Validaiton is failed");
        }



    }



}