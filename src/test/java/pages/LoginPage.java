package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy (id="[id='txtUsername']")
    public WebElement userNameFiled;

    @FindBy (id="[id='txtPassword']")
    public WebElement passWordFiled;

    @FindBy (id="[id='btnLogin']")
    public WebElement loginButton;

    @FindBy (id="[id='spanMessage']")
    public WebElement errorMessage;

   public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}
