package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddJobDetailsSteps extends CommonMethods {

    @When("user clicks Job button")
    public void user_clicks_job_button() {
        click(personalDetails.Job);
    }

    @Then("Job tab is present")
    public void job_tab_is_present() {
        Assert.assertTrue(addJobDetails.header.isDisplayed());
    }

    @When("user clicks edit button")
    public void user_clicks_edit_button() {
        click(addJobDetails.editBtn);
    }

    @Then("Job Title dropdown field is displayed and user can select following values from there")
    public void job_title_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable jobTitles) {
        Assert.assertTrue(addJobDetails.jobTitleLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.jobTitleDropDown.isDisplayed());

        List<String> titles = jobTitles.asList();
        for(String title:titles) {
            selectDropDown(addJobDetails.jobTitleDropDown, title);


            }

        }

    @Then("Employment Status dropdown field is displayed and user can select following values from there")
    public void employment_status_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable statusTable) {
        Assert.assertTrue(addJobDetails.empStatusLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.empStatusDropDown.isDisplayed());
        List<String> statusList = statusTable.asList();
        for(String status:statusList) {
            selectDropDown(addJobDetails.empStatusDropDown, status);
        }

    }

    @Then("Job Category dropdown field is displayed and user can select following values from there")
    public void job_category_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable categoryTable) {

        Assert.assertTrue(addJobDetails.jobCategoryLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.jobCategoryDropDown.isDisplayed());
        List<String> categoryList = categoryTable.asList();
        for(String category:categoryList) {
            selectDropDown(addJobDetails.jobCategoryDropDown, category);
        }
    }

    @Then("Joined Date calendar is displayed and user can pick following values from there")
    public void joined_date_calendar_is_displayed_and_user_can_pick_following_values_from_there(DataTable datesTable) throws InterruptedException {
        Assert.assertTrue(addJobDetails.joinedDateLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.joinedDateInputField.isDisplayed());
        Assert.assertTrue(addJobDetails.joinedDateCalendarIcon.isDisplayed());

        List<Map<String, String>> datesList = datesTable.asMaps();

        for (Map<String, String> date : datesList) {

            String year = date.get("year");
            String month = date.get("month");
            String day = date.get("day");
            String monthName = date.get("monthName");

           inputDateInCalendar(addJobDetails.joinedDateInputField, year, month, day);

            Thread.sleep(2000);
        }

            for (Map<String, String> date : datesList) {

                String year = date.get("year");
                String day = date.get("day");
                String monthName = date.get("monthName");

            click(addJobDetails.joinedDateCalendarIcon);


            selectDateInCalendar(year, monthName, day.substring(1));

           /* selectDropDown(addJobDetails.selectYear, year);
            selectDropDown(addJobDetails.selectMonth, monthName);
            WebElement dateBtn = driver.findElement(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td/a[text() = "+ day+"]"));
            dateBtn.click();*/

            Thread.sleep(2000);
        }
    }




    @Then("Sub Unit dropdown field is displayed and user can select values from there")
    public void sub_unit_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Location dropdown field is displayed and user can select values from there")
    public void location_dropdown_field_is_displayed_and_user_can_select_values_from_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Start Date calendar is displayed and user can pick values from there")
    public void start_date_calendar_is_displayed_and_user_can_pick_values_from_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("End Date calendar is displayed and user can pick values from there")
    public void end_date_calendar_is_displayed_and_user_can_pick_values_from_there() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Contract Details file upload field is displayed and accepts file up to 1MB")
    public void contract_details_file_upload_field_is_displayed_and_accepts_file_up_to_1mb() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
