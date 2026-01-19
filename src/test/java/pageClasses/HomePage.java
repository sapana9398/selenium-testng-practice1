package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        super(driver);
    }


    //locators
    @FindBy (xpath="//span[text()='My Account']")
    private WebElement myAccountTab;

    @FindBy (xpath="//a[text()='Register']")
    private WebElement registerLink;

    @FindBy (xpath="//a[text()='Login']")
    private WebElement loginButton;






    // methods
    public void clickMyAccountTab(){
        myAccountTab.click();
    }

    public void clickOnRegisterLink(){
        registerLink.click();
    }

    public void clickOnLoginLink(){
        loginButton.click();
    }


}