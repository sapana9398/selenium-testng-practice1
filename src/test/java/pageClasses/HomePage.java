package pageClasses;

import basePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebDriver driver;

    //constructor
    public HomePage (WebDriver driver){
        super(driver);
    }

    //locators pagefactory model
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement MyAccountTab;

    @FindBy(xpath="//a[text()='Register']")
    private WebElement RegisterLink;

    //methods
    public void clickOnMyAccount(){
        MyAccountTab.click();
    }
    public void clickOnRegister(){
        RegisterLink.click();
    }

}
