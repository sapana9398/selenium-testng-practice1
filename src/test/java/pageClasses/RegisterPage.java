package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
    WebDriver driver;

    //constructor
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //locators
    @FindBy(xpath="//input[@name=\'firstname\']")
    private WebElement fisrtnameInput;
    @FindBy(xpath="//input[@name=\'lastname\']")
    WebElement lastnameInput;
    @FindBy(xpath="//input[@name=\'email\']")
    WebElement emailInput;
    @FindBy(xpath="//input[@name=\'telephone\']")
    WebElement telephoneInput;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordInput;
    @FindBy(xpath="//input[@name='confirm']")
    WebElement confirmInput;
    @FindBy(xpath="//input[@type='submit']")
    WebElement submitBtn;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement checkboxBtn;

    //methods
    public void setFirstName(String firstname ){
        fisrtnameInput.sendKeys(firstname);
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
    public void setConfirm(String confirm){
        confirmInput.sendKeys(confirm);
    }
    public void clickCheckbox(){
        checkboxBtn.click();
    }
    public void clickSubmit(){
        submitBtn.click();
    }

}