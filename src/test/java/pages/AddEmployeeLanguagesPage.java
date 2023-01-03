package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddEmployeeLanguagesPage extends CommonMethods {

@FindBy(id = "addLanguage")
public WebElement addLanguage;

@FindBy(id = "language_code")
public WebElement languageDropdown;

@FindBy(id="language_lang_type")
public WebElement fluencyDropdown;

@FindBy(id="language_competency")
public WebElement CompetencyDropdown;

@FindBy(id="language_comments")
public WebElement comments;

@FindBy(id="btnLanguageSave")
public WebElement Savebtn;

@FindBy (xpath = "//table[@id = 'lang_data_table']/tbody/tr")
public List<WebElement> languageTableLines;

public String tableLocator = "//table[@id = 'lang_data_table']";

@FindBy (id = "delLanguage")
public WebElement deleteBtn;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    public AddEmployeeLanguagesPage(){
        PageFactory.initElements(driver,this);
    }
}
