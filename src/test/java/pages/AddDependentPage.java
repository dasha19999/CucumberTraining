package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class AddDependentPage extends CommonMethods {

    @FindBy(id="btnAddDependent")
    public WebElement btnAddDependent;

    @FindBy(id="dependent_name")
    public WebElement dependentName;

    @FindBy(id="dependent_relationshipType")
    public WebElement relationshipType;

    @FindBy(id="dependent_relationship")
    public WebElement specifyRelationship;

    @FindBy(id="dependent_dateOfBirth")
    public WebElement dependentDOB;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    public WebElement selectMonth;

    @FindBy(xpath = "//select[@class='ui-datepicker-year']")
    public WebElement selectYear;

    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/tr/td")
    public List<WebElement> selectDay;

    @FindBy(id = "btnSaveDependent")
    public WebElement btnSaveDep;

@FindBy(xpath = "//table[@id='dependent_list']/tbody/tr/td")
public List<WebElement>dependents;

@FindBy(xpath = "//img[@class='ui-datepicker-trigger']")
public WebElement calendarIcon;

    public AddDependentPage() {
        PageFactory.initElements(driver, this);
    }



}
