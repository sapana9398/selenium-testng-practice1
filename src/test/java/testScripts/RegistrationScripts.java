package testScripts;

import baseTest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.RegisterPage;

import java.time.Duration;

public class RegistrationScripts extends BaseTest {

    @Test (groups={"Regression","Sanity"})
    public void doRegistration(){

        logger.debug("Execution of doRegistration test script started");

        HomePage HomePageObj = new HomePage(driver);
        HomePageObj.clickMyAccountTab();
        logger.debug("clicked on my account tab");
        HomePageObj.clickOnRegisterLink();
        logger.debug("clickOnRegisterLink");

        RegisterPage RegistrationPageObj = new RegisterPage(driver);
        RegistrationPageObj.setFirstName("Sapana");
        RegistrationPageObj.setLastName("Ghodela");
        RegistrationPageObj.setEmail("Nsapana9398@gmail.com");
        RegistrationPageObj.setTelephone("12345");
        RegistrationPageObj.setPassword("Pass12345");
        RegistrationPageObj.setConfirmPwd("Pass12345");

        logger.debug("Entered all the mandatory fields");

        RegistrationPageObj.clickOnContinue();

        Assert.assertTrue(false);


        //validation
    }










}