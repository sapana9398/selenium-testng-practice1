package testScripts;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import pageClasses.HomePage;
import pageClasses.RegisterPage;

public class RegistrationScripts extends BaseTest {

    @Test
    public void doRegistration(){
        logger.info("Execution of doRegistration Test Script Started");

        HomePage HomePageOb = new HomePage(driver);
        HomePageOb.clickOnMyAccount();
        HomePageOb.clickOnRegister();
        logger.info("Clicked on Register Tab");

        RegisterPage RegisterPageob = new RegisterPage(driver);
        RegisterPageob.setFirstName("Sapana");
        RegisterPageob.setLastName("Ghodela");
        RegisterPageob.setEmail("sapana9398@gmail.com");
        RegisterPageob.setTelephone("9028420988");
        RegisterPageob.setPassword("Ashu1234");
        RegisterPageob.setConfirm("Ashu1234");
        RegisterPageob.clickCheckbox();
        logger.info("Entered all mandatory fields");

        RegisterPageob.clickSubmit();
        logger.info("Form Submission successful");
    }
}
