package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.nio.channels.Selector.open;

@DefaultUrl("https://twitter.com/explore")
public class MainPages extends BasePage {

    @FindBy(id = "Зарегистрироваться" )
    private WebElement signInButton;

    @FindBy (css = "[class='1dbjc4n']")
    private WebElement UserName;

    @FindBy (id = "Использовать эл. почту")
    private WebElement UseEmailInstead;

    @FindBy (id = "email")
    private WebElement EmailAdressField;


    protected MainPages(WebDriver driver) {
        super (driver);
    }

    public void openMainPage() {
        open();
    }

    public void clickOnSignButton() {
        element (signInButton).click();
    }


    public void FillInUserName(String name) {
        element (UserName).sendKeys(name);
    }

    }


