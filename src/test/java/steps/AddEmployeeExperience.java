package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.math3.analysis.function.Add;
import org.junit.Assert;
import utils.CommonMethods;

import static utils.CommonMethods.selectDateInCalendar;

public class AddEmployeeExperience extends CommonMethods {







    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
        click(personalDetails.Qualifications);
    }

    @When("on Work Experience section User clicks Add button")
    public void on_Work_Experience_section_user_clicks_on_add_button() {
        click(addEmployeeExperiencePage.addWorkExperience);
    }

    @When("Company text box is displayed user enters value {string}")
    public void companyTextBoxIsDisplayedUserEntersValue(String arg0) {
    }

    @And("Job Title text box is displayed user enters value {string}")
    public void jobTitleTextBoxIsDisplayedUserEntersValue(String arg0) {
    }

    @And("user clicks From text box and Calender is displayed")
    public void userClicksFromTextBoxAndCalenderIsDisplayed() {
    }

    @And("user select date\\ month \\{Jan}, year \\{{int}}, day \\{{int}} date\\( month {string}, year {string}, day {string})")
    public void userSelectDateMonthJanYearDayDateMonthYearDay(int arg0, int arg1, String arg2, String arg3, String arg4) {
    }

    @When("user clicks To text box and Calender is displayed")
    public void userClicksToTextBoxAndCalenderIsDisplayed() {
    }

    @And("user select date\\ month \\{Sep}, year \\{{int}}, day \\{{int}} date\\( month {string}, year {string}, day {string})")
    public void userSelectDateMonthSepYearDayDateMonthYearDay(int arg0, int arg1, String arg2, String arg3, String arg4) {
    }

    @When("Comment text box is displayed user enters value {string}")
    public void commentTextBoxIsDisplayedUserEntersValue(String arg0) {
    }

    @And("user clicks on save button on Work Experience tab")
    public void userClicksOnSaveButtonOnWorkExperienceTab() {
    }

    @Then("user successfully added work experience")
    public void userSuccessfullyAddedWorkExperience() {
    }
}



