package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddLanguageToQualificationsPage extends CommonMethods {

    @FindBy (id="menu_admin_viewAdminModule")
    public WebElement admin;

    @FindBy (id="menu_admin_Qualifications")
    public WebElement qualifications;

    @FindBy (id="menu_admin_viewLanguages")
        public WebElement language;

    @FindBy (css="#btnAdd")
    public WebElement addButton;

    @FindBy (name="language[name]")
    public WebElement textBox;

    @FindBy (id="btnSave")
    public WebElement saveButton;

    @FindBy (xpath = "//*[@id='recordsListTable']/tbody/tr")
    public List<WebElement> languageTableLines;
    public String tableLinePath = "//*[@id='recordsListTable']/tbody/tr";

    @FindBy (id="btnDel")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    public  AddLanguageToQualificationsPage(){
        PageFactory.initElements(driver,this);


    }}

