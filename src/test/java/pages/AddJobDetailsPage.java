package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddJobDetailsPage extends CommonMethods {

    //Job Title
    @FindBy(xpath = "//label[text() = 'Job Title']")
    public WebElement jobTitleLabel;

    @FindBy(xpath = "//select[@id =\"job_job_title\"]")
    public WebElement jobTitleDropDown;

    //Employment Status
    @FindBy(xpath = "//label[text() = 'Employment Status']")
    public WebElement empStatusLabel;

    @FindBy(xpath = "//select[@id =\"job_emp_status\"]")
    public WebElement empStatusDropDown;

    //Job Category
    @FindBy(xpath = "//label[text() = 'Job Category']")
    public WebElement jobCategoryLabel;

    @FindBy(xpath = "//select[@id =\"job_eeo_category\"]")
    public WebElement jobCategoryDropDown;

    //Joined Date
    @FindBy(xpath = "//label[text() = 'Joined Date']")
    public WebElement joinedDateLabel;

    @FindBy(xpath = "//input[@id =\"job_joined_date\"]")
    public WebElement joinedDateInputField;

    @FindBy(xpath = "//input[@id = 'job_joined_date']/following-sibling::img")
    public WebElement joinedDateCalendarIcon;

    //Sub Unit
    @FindBy(xpath = "//label[text() = 'Sub Unit']")
    public WebElement subUnitLabel;

    @FindBy(xpath = "//select[@id= 'job_sub_unit']")
    public WebElement subUnitDropDown;

    //Job Location
    @FindBy(xpath = "//label[text() = 'Location']")
    public WebElement jobLocationLabel;

    @FindBy(xpath = "//select[@id= 'job_location']")
    public WebElement jobLocationDropDown;

    //Employment Contract
    //StartDate
    @FindBy(xpath = "//label[text() = 'Start Date']")
    public WebElement contractStartDateLabel;

    @FindBy(xpath = "//input[@id = 'job_contract_start_date']")
    public WebElement contractStartDateInputField;

    @FindBy(xpath = "//input[@id = 'job_contract_start_date']/following-sibling::img")
    public WebElement contractStartDateCalendarIcon;

    //End Date
    @FindBy(xpath = "//label[text() = 'End Date']")
    public WebElement contractEndDateLabel;

    @FindBy(xpath = "//input[@id = 'job_contract_end_date']")
    public WebElement contractEndDateInputField;

    @FindBy(xpath = "//input[@id = 'job_contract_end_date']/following-sibling::img")
    public WebElement contractEndDateCalendarIcon;

    //Contract Details
    @FindBy(xpath = "//label[text() = 'Contract Details']")
    public WebElement contractDetailsLabel;

    @FindBy(xpath = "//input[@id = 'job_contract_file']")
    public WebElement contractUploadBtn;

    @FindBy(xpath = "//label[text() = 'Accepts up to 1MB'][1]")
    public WebElement fileSizeLimitLabel;

    //Other
    @FindBy(xpath = "//input[@id = 'btnSave']")
    public WebElement editBtn;

    @FindBy(xpath = "//h1[text() = 'Job']")
    public WebElement header;

    @FindBy(xpath = "//input[@value = 'Save']")
    public WebElement saveBtn;

    @FindBy(xpath = "//div[@class = 'message success fadable']")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@id = 'job_contract_update_2']")
    public WebElement deleteCurrentContractBtn;

    public AddJobDetailsPage() {
        PageFactory.initElements(driver, this);

    }
}
