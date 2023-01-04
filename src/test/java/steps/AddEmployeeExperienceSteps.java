package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class AddEmployeeExperienceSteps extends CommonMethods {

    @When("on Work Experience section User clicks Add button")
    public void on_work_experience_section_user_clicks_add_button() {
    click(addEmployeeExperience.addWorkExperience);
    }

    @When("Company text box is displayed user enters value {string}")
    public void company_text_box_is_displayed_user_enters_value(String companyName) {
    sendText(addEmployeeExperience.companyField,companyName);
    }

    @When("Job Title text box is displayed user enters value {string}")
    public void job_title_text_box_is_displayed_user_enters_value(String jobTitle) {
        sendText(addEmployeeExperience.experience_jobtitle,jobTitle);
    }

    @When("user clicks From text box and Calender is displayed")
    public void user_clicks_from_text_box_and_calender_is_displayed() {
        Assert.assertTrue(addEmployeeExperience.experience_from_date.isDisplayed());
    }

    @When("user select From date\\ month {string}, year {string}, day {string}")
    public void user_select_from_date_month_year_day(String month, String year, String day) {
        click(addEmployeeExperience.experience_from_date);
        selectDateInCalendar(year,month,day);
    }

    @When("user clicks To text box and Calender is displayed")
    public void user_clicks_to_text_box_and_calender_is_displayed() {
        Assert.assertTrue(addEmployeeExperience.experience_to_date.isDisplayed());

    }
    @When("user select To date\\ month {string}, year {string}, day {string}")
    public void user_select_to_date_month_year_day(String month, String year, String day) {
       click(addEmployeeExperience.experience_to_date);
        selectDateInCalendar(year,month,day);
    }


    @When("Comment text box is displayed user enters value {string}")
    public void comment_text_box_is_displayed_user_enters_value(String comment) {
       sendText(addEmployeeExperience.experience_comments,comment);
    }

    @When("user clicks on save button on Work Experience tab")
    public void user_clicks_on_save_button_on_work_experience_tab() {
       click(addEmployeeExperience.btnWorkExpSave);
    }

    @Then("user successfully added work experience")
    public void user_successfully_added_work_experience() {
        waitForVisibility(addEmployeeExperience.successMessage);
        Assert.assertTrue(addEmployeeExperience.successMessage.getText().contains("Successfully Saved"));

    }

}
