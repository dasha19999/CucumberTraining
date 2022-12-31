package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

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
    public WebElement texBox;

    @FindBy (id="btnSave")
    public WebElement saveButton;

    @FindBy (xpath = "//*[@id='recordsListTable']/tbody/tr[1]/td[1]/input")
    public WebElement languageCheckBox;

    @FindBy (id="btnDel")
    public WebElement deleteButton;

    public  AddLanguageToQualificationsPage(){
        PageFactory.initElements(driver,this);


    }}

