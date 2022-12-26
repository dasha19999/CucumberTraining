package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;


public class AddEmployeePage extends CommonMethods {
    @FindBy (id="[id='firstName']")
    public WebElement firstNameField;

    @FindBy (id="[id='middleName']")
    public WebElement middleNameField;

    @FindBy (id="[id='lastName']")
    public WebElement lastNameField;

    @FindBy (id="[id='photofile']")
    public WebElement photograph;

    @FindBy (id="[id='chkLogin']")
    public WebElement checkBox;

    @FindBy (id="[id='user_name']")
    public WebElement userName;

    @FindBy (id="[id='user_password']")
    public WebElement password;

    @FindBy (id="[id='re_password']")
    public WebElement confirmPassword;

    @FindBy (id="[id='employeeId']")
    public WebElement employeeId;

    @FindBy (id="[id='btnSave']")
    public WebElement saveButton;

    public  AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
