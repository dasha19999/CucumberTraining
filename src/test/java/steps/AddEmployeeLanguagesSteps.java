package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddEmployeeLanguagesPages;
import utils.CommonMethods;

public class AddEmployeeLanguagesSteps extends CommonMethods {


    @When("user clicks on PIM tab")
    public void user_clicks_on_pim_tab() {
       click(dashboard.pimOption);
    }

    @When("user clicks on Employee List dropdown")
    public void user_clicks_on_employee_list_dropdown() throws InterruptedException {
       click(dashboard.empListOption);
       Thread.sleep(2000);
    }

    @When("user enters 43541A in Employee id text field")
    public void user_enters_43541a_in_employee_id_text_field() {
       sendText(employeeList.empSearchIdField,"43541A");
    }

    @When("user clicks search")
    public void user_clicks_search() {
       click(employeeList.searchButton);
    }

    @When("user clicks on Employee Name Annali Rosalie Solano")
    public void user_clicks_on_employee_name_annali_rosalie_solano() {
        click(languages.employeeName);
    }

    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
       click(languages.qualificationsBtn);
    }

    @When("on Languages section click on Add button")
    public void on_languages_section_click_on_add_button() {
        click(languages.addLanguage);
    }

    @When("user selects English on Languages dropdown")
    public void user_selects_english_on_languages_dropdown() throws InterruptedException {
       click(languages.languageDropdown);
       Thread.sleep(2000);
       click(languages.english);
    }

    @When("user selects Specking on Fluency dropdown")
    public void user_selects_specking_on_fluency_dropdown() {
     click(languages.fluencyDropdown);
     click(languages.Speaking);
    }

    @When("user selects Good on Competency dropdown")
    public void user_selects_good_on_competency_dropdown() {
       click(languages.CompetencyDropdown);
       click(languages.Good);
    }

    @When("on Comments text box user enters desired text")
    public void on_comments_text_box_user_enters_desired_text() {
       sendText(languages.comments, "My English is great");
    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(languages.Savebtn);
    }
}
