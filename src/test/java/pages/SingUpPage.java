package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SingUpPage extends BasePage{
@FindBy (xpath = "//input[@id='name']")
    WebElement nameField;
@FindBy (xpath = "//input[@id='lastName']")
    WebElement lastNameField;
@FindBy (xpath = "//input[@id='email']")
    WebElement emailField;
@FindBy (xpath = "//input[@id='password']")
    WebElement passwordField ;
@FindBy (xpath = "//input[@id='terms-of-use']")
    WebElement termsOfUseCheckBox ;
@FindBy (xpath = "//button[@type='submit']")
    WebElement buttonYalla;
    public SingUpPage(WebDriver driver){
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);

    }

}

