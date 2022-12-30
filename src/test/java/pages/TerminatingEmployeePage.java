package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class TerminatingEmployeePage extends CommonMethods {

    @FindBy(id = "btnTerminateEmployement")
    public WebElement termBtn;

    @FindBy(id="dialogConfirm")
    public WebElement confirmBtn;

    @FindBy(xpath = "//*[@id=\"terminatedDate\"]/a")
    public WebElement terminatedMessage;


    public TerminatingEmployeePage() {
        PageFactory.initElements(driver, this);
    }
}
