package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class MainPage extends BasePage {
    public MainPage(WebDriver driver){
        setDriver(driver);
        driver.get("https://ilcarro.web.app/");
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
    }
    public <T extends BasePage> T openTopMenu (String topMenuItem){
        WebElement menuItem = driver.findElement(By.xpath("//a[contains(text(),'"+topMenuItem+"')"));
        menuItem.click();
        switch (topMenuItem){
            case"SEARCH":
                return (T) new SearchPage(driver);
            case "LET_THE_CAR_WORK":
                return(T) new LetTheCarWorkPage(driver);
            case "TERMS_OF_USE":
                return (T) new TermsOfUse(driver);
            case "SING_UP":
                return (T)new SingUpPage(driver);
            case "LOG_IN":
                return (T) new LoginPage(driver);
            default:
                throw new IllegalArgumentException("Something wrong "+ topMenuItem);

        }
    }
}

