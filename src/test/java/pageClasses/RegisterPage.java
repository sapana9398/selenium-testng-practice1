package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    WebDriver driver;

    //constructor
    public RegisterPage(WebDriver driver){
        super(driver);
    }

    //locator
    @FindBy(xpath="//input[@name='firstname']")
    private WebElement firstnameInput;

    @FindBy(xpath="//input[@name='lastname']")
    private WebElement lastnameInput;

    @FindBy(xpath="//input[@name='email']")
    private WebElement emailInput;

    @FindBy(xpath="//input[@name='telephone']")
    private WebElement telephoneInput;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath="//input[@name='confirm']")
    private WebElement confirmInput;

    @FindBy(xpath="//input[@type='submit']")
    private WebElement submitButton;


    //methods

    public void setFirstName(String firstname){
        firstnameInput.sendKeys(firstname);
    }

    public void setLastName(String lastname){
        lastnameInput.sendKeys(lastname);
    }


    public void setEmail(String email){
        emailInput.sendKeys(email);
    }
    public void setTelephone(String telephone){
        telephoneInput.sendKeys(telephone);
    }
    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void setConfirmPwd(String confirm){
        confirmInput.sendKeys(confirm);
    }

    public void clickOnContinue(){
        submitButton.click();
    }





}