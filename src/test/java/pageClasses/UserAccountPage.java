package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserAccountPage extends BasePage {

    WebDriver driver;

    //constructor
    public UserAccountPage(WebDriver driver){
        super(driver);
    }


    //locators
    @FindBy (xpath="//h2[text()='My Account']")
    private WebElement myAccountText;

    @FindBy (xpath="//a[text()='Logout' and @class='list-group-item']")
    private WebElement logoutLink;




    // methods
    public boolean isLandingPageIsDisplayed() {

        try {
            return (myAccountText.isDisplayed());
        } catch (Exception e) {
            return false;
        }
    }

    public void performLogout() {

        logoutLink.click();

    }


}