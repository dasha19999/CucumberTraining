package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.Constants;
import utils.Log;

import java.util.List;
import java.util.Map;

public class AddJobDetailsSteps extends CommonMethods {

    @When("user clicks Job button")
    public void user_clicks_job_button() {

        Log.info("Add Job Details Test started");
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
        for (String title : titles) {
            selectDropDown(addJobDetails.jobTitleDropDown, title);

        }

    }

    @Then("Employment Status dropdown field is displayed and user can select following values from there")
    public void employment_status_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable statusTable) {
        Assert.assertTrue(addJobDetails.empStatusLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.empStatusDropDown.isDisplayed());
        List<String> statusList = statusTable.asList();
        for (String status : statusList) {
            selectDropDown(addJobDetails.empStatusDropDown, status);
        }

    }

    @Then("Job Category dropdown field is displayed and user can select following values from there")
    public void job_category_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable categoryTable) {

        Assert.assertTrue(addJobDetails.jobCategoryLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.jobCategoryDropDown.isDisplayed());
        List<String> categoryList = categoryTable.asList();
        for (String category : categoryList) {
            selectDropDown(addJobDetails.jobCategoryDropDown, category);
        }
    }

    @Then("Joined Date calendar is displayed and user can input following values in Calendar field")
    public void joined_date_calendar_is_displayed_and_user_can_input_following_values_in_calendar_field(DataTable datesTable) {
        Assert.assertTrue(addJobDetails.joinedDateLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.joinedDateInputField.isDisplayed());
        Assert.assertTrue(addJobDetails.joinedDateCalendarIcon.isDisplayed());

        List<Map<String, String>> datesList = datesTable.asMaps();

        for (Map<String, String> date : datesList) {

            String year = date.get("year");
            String month = date.get("month");
            String day = date.get("day");

            inputDateInCalendar(addJobDetails.joinedDateInputField, year, month, day);

        }
    }

    @Then("user can select following values from Calendar")
    public void user_can_select_following_values_from_calendar(DataTable datesTable) throws InterruptedException {

        List<Map<String, String>> datesList = datesTable.asMaps();
        for (Map<String, String> date : datesList) {

            String year = date.get("year");
            String day = date.get("day");
            String month = date.get("month");

            waitToBeClickable(addJobDetails.joinedDateCalendarIcon);
            click(addJobDetails.joinedDateCalendarIcon);

            selectDateInCalendar(year, month, day);

            Thread.sleep(1000);

        }
    }


    @Then("Sub Unit dropdown field is displayed and user can select following values from there")
    public void sub_unit_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable subUnits) {

        Assert.assertTrue(addJobDetails.subUnitLabel.isDisplayed());

        List<String> subUnitList = subUnits.asList();
        for (String subUnit : subUnitList) {
            selectDropDown(addJobDetails.subUnitDropDown, subUnit);
        }
    }

    @Then("Location dropdown field is displayed and user can select following values from there")
    public void location_dropdown_field_is_displayed_and_user_can_select_following_values_from_there(DataTable locationsTable) {
        Assert.assertTrue(addJobDetails.jobLocationLabel.isDisplayed());

        List<String> locationsList = locationsTable.asList();
        for (String location : locationsList) {
            selectDropDown(addJobDetails.jobLocationDropDown, location);
        }
    }


    @Then("Start Date calendar is displayed and user can pick following values from there")
    public void start_date_calendar_is_displayed_and_user_can_pick_following_values_from_there(DataTable datesTable) throws InterruptedException {
        Assert.assertTrue(addJobDetails.contractStartDateLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.contractStartDateInputField.isDisplayed());
        Assert.assertTrue(addJobDetails.contractStartDateCalendarIcon.isDisplayed());

        List<Map<String, String>> datesMaps = datesTable.asMaps();

        for (Map<String, String> date : datesMaps) {

            String year = date.get("year");
            String day = date.get("day");
            String month = date.get("month");

            waitToBeClickable(addJobDetails.contractStartDateCalendarIcon);
            click(addJobDetails.contractStartDateCalendarIcon);

            selectDateInCalendar(year, month, day);

            Thread.sleep(1000);

        }
    }

    @Then("End Date calendar is displayed and user can pick following values from there")
    public void end_date_calendar_is_displayed_and_user_can_pick_following_values_from_there(DataTable datesTable) throws InterruptedException {
        Assert.assertTrue(addJobDetails.contractEndDateLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.contractEndDateInputField.isDisplayed());
        Assert.assertTrue(addJobDetails.contractEndDateCalendarIcon.isDisplayed());

        List<Map<String, String>> datesMaps = datesTable.asMaps();

        for (Map<String, String> date : datesMaps) {

            String year = date.get("year");
            String day = date.get("day");
            String month = date.get("month");

            waitToBeClickable(addJobDetails.contractEndDateCalendarIcon);
            click(addJobDetails.contractEndDateCalendarIcon);

            selectDateInCalendar(year, month, day);
            Thread.sleep(1000);


        }
    }

    @Then("Contract Details file upload field is displayed and accepts file up to 1MB")
    public void contract_details_file_upload_field_is_displayed_and_accepts_file_up_to_1mb() {
        Assert.assertTrue(addJobDetails.contractDetailsLabel.isDisplayed());
        Assert.assertTrue(addJobDetails.contractUploadBtn.isDisplayed());
        sendText(addJobDetails.contractUploadBtn, Constants.CONTRACT_FILEPATH);
        click(addJobDetails.saveBtn);
        waitForVisibility(addJobDetails.successMessage);
        Assert.assertTrue(addJobDetails.successMessage.getText().contains("Successfully Updated"));

        //delete contract to simplify retesting

        click(addJobDetails.editBtn);
        click(addJobDetails.deleteCurrentContractBtn);
        click(addJobDetails.saveBtn);

        Log.info("Add Job Details Steps ended");
    }

}
