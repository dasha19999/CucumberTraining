package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class PersonalDetailsPage extends CommonMethods {

    @FindBy (linkText = "Contact Details")
    public WebElement ContactDetails;

    @FindBy(linkText = "Emergency Contacts")
    public WebElement EmergencyContacts;

    @FindBy(linkText = "Dependents")
    public WebElement Dependents;

    @FindBy(linkText = "Immigration")
    public WebElement Immigration;

    @FindBy(linkText = "Job")
    public WebElement Job;

    @FindBy(linkText = "Salary")
    public WebElement Salary;

    @FindBy(linkText = "Tax Exemptions")
    public WebElement TaxExemptions;

    @FindBy(linkText = "Report-to")
    public WebElement ReportTo;

    @FindBy(linkText = "Qualifications")
    public WebElement Qualifications;

    @FindBy(linkText = "Memberships")
    public WebElement Memberships;


    public PersonalDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}
