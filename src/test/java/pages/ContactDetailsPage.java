package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {


@FindBy(xpath = "//a[text() = 'Contact Details' ]")
public WebElement contactDetailsButton;

@FindBy (xpath = "//h1[text()='Contact Details']")
public WebElement contactDetailsDisplay;
@FindBy (xpath = "//input[@id='btnSave']")
public WebElement editButton;

@FindBy(id="contact_street1")
public WebElement street1;

@FindBy (id="contact_street2")
public WebElement street2;

@FindBy (id="contact_city")
public WebElement city;

@FindBy (id="contact_province")
public WebElement state;

@FindBy (id="contact_emp_zipcode")
public WebElement zip;

@FindBy (id="contact_country")
public WebElement country;

@FindBy (id="contact_emp_hm_telephone")
public WebElement HomePhone;

@FindBy (id = "contact_emp_mobile")
public WebElement Mobile;

@FindBy (id = "contact_emp_work_telephone")
public WebElement WorkPhone;

@FindBy (id= "contact_emp_work_email")
public WebElement WorkEmail;

@FindBy (id="contact_emp_oth_email")
public  WebElement OtherEmail;

@FindBy(id ="btnSave")
public WebElement btnSave;




    public ContactDetailsPage(){
        PageFactory.initElements(driver, this);}
}
