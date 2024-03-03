package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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


}

