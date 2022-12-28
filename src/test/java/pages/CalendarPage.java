package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class CalendarPage extends CommonMethods {

    @FindBy(xpath = "//select[@class = 'ui-datepicker-month']")
    public WebElement selectMonth;

    @FindBy(xpath = "//select[@class = 'ui-datepicker-year']")
    public WebElement selectYear;

    @FindBy(xpath = "//table[@class = 'ui-datepicker-calendar']/tbody/tr/td/a")
    public List<WebElement> dates;

    public CalendarPage(){

        PageFactory.initElements(driver, this);
    }
}
