package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    WebDriver driver;

    //constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }


    //locators
    @FindBy (xpath="//input[@name='email']")
    private WebElement emailInputBox;

    @FindBy (xpath="//input[@name='password']")
    private WebElement passwordInputBox;

    @FindBy (xpath="//input[@type='submit']")
    private WebElement loginButton;




    // methods
    public void login(String username, String password){
        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }




}