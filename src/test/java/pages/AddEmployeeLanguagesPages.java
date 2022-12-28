package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeeLanguagesPages extends CommonMethods {

@FindBy(xpath ="//*[@id=\"menu_pim_viewPimModule\"]" )
    public WebElement pimButton;
@FindBy(partialLinkText = ("Annali Rosalie"))
public WebElement employeeName;

@FindBy(xpath = "//*[@id=\"sidenav\"]/li[10]/a")
public WebElement qualificationsBtn;

@FindBy(id = "addLanguage")
public WebElement addLanguage;
@FindBy(id = "language_code")
public WebElement languageDropdown;

@FindBy(xpath = "//*[@id=\"language_code\"]/option[13]")
public WebElement english;

@FindBy(id="language_lang_type")
public WebElement fluencyDropdown;

@FindBy(xpath ="//*[@id=\"language_lang_type\"]/option[3]")
public WebElement Speaking;

@FindBy(id="language_competency")
public WebElement CompetencyDropdown;

@FindBy(xpath ="//*[@id=\"language_competency\"]/option[4]")
public WebElement Good;

@FindBy(id="language_comments")
public WebElement comments;

@FindBy(id="btnLanguageSave")
public WebElement Savebtn;

    public AddEmployeeLanguagesPages(){
        PageFactory.initElements(driver,this);
    }
}
