package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;



public class AddEmployeeExperiencePage extends CommonMethods {

    @FindBy(id = "addWorkExperience")
    public WebElement addWorkExperience;

    @FindBy(id = "experience_employer")
    public WebElement experience_employer;

    @FindBy(id="experience_jobtitle")
    public WebElement experience_jobtitle;

    @FindBy(id="experience_from_date")
    public WebElement experience_from_date;

    @FindBy(id="experience_to_date")
    public WebElement experience_to_date;

    @FindBy (id = "experience_comments")
    public WebElement experience_comments;

    @FindBy (id = "btnWorkExpSave")
    public WebElement btnWorkExpSave;


    public AddEmployeeExperiencePage(){
        PageFactory.initElements(driver,this);
    }

}
