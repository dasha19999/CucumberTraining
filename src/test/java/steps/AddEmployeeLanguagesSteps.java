package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddEmployeeLanguagesSteps extends CommonMethods {

    @When("user clicks on Qualifications button")
    public void user_clicks_on_qualifications_button() {
        click(personalDetails.Qualifications);
    }

    @When("on Languages section user clicks on Add button")
    public void on_languages_section_user_clicks_on_add_button() {
        click(addEmployeeLanguages.addLanguage);
    }

    @When("user selects {string} on Languages dropdown")
    public void user_selects_on_languages_dropdown(String language) {
        selectDropDown(addEmployeeLanguages.languageDropdown, language);
    }

    @When("user selects {string} on Fluency dropdown")
    public void user_selects_on_fluency_dropdown(String fluency) {
        selectDropDown(addEmployeeLanguages.fluencyDropdown, fluency);
    }

    @When("user selects {string} on Competency dropdown")
    public void user_selects_on_competency_dropdown(String competency) {

        selectDropDown(addEmployeeLanguages.CompetencyDropdown, competency);
    }

    @When("on Comments text box user enters {string}")
    public void on_comments_text_box_user_enters(String message) {
        sendText(addEmployeeLanguages.comments, "My English is great");
    }

    @Then("user clicks on Save button")
    public void user_clicks_on_save_button() {
        click(addEmployeeLanguages.Savebtn);
    }

    @Then("the language is saved successfully")
    public void the_language_is_saved_successfully() {

        waitForVisibility(addEmployeeLanguages.successMessage);
        Assert.assertTrue(addEmployeeLanguages.successMessage.getText().contains("Successfully Saved"));

    }

    @Then("user can delete language {string} from employee for retesting")
    public void user_can_delete_language_from_employee_for_retesting(String language) throws InterruptedException {

     selectCheckBoxInTable(language, addEmployeeLanguages.tableLocator);
        click(addEmployeeLanguages.deleteBtn);
        waitForVisibility(addEmployeeLanguages.successMessage);
        Assert.assertTrue(addEmployeeLanguages.successMessage.getText().contains("Successfully Deleted"));
    }
}

