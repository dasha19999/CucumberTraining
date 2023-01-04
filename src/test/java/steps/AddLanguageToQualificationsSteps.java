package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class AddLanguageToQualificationsSteps extends CommonMethods {
    @When("user selects admin option from dashboard")
    public void user_selects_admin_option_from_dashboard() {
        click(addLanguageToQualifications.admin);
    }

    @When("user clicks on qualifications")
    public void user_clicks_on_qualifications() {
        click(addLanguageToQualifications.qualifications);
    }

    @When("from dropdown user clicks on language")
    public void from_dropdown_user_clicks_on_language() {
        click(addLanguageToQualifications.language);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addLanguageToQualifications.addButton);
    }

    @When("user inputs {string} in textBox")
    public void user_inputs_in_text_box(String language) {
        sendText(addLanguageToQualifications.textBox, language);
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        click(addLanguageToQualifications.saveButton);
    }

    @Then("language is succesfully added")
    public void language_is_succesfully_added() {
        waitForVisibility(addLanguageToQualifications.successMessage);
        Assert.assertTrue(addLanguageToQualifications.successMessage.getText().contains("Successfully Saved"));
    }

    @Then("user can delete language {string} for retesting")
    public void user_can_delete_language_for_retesting(String language) {

        selectCheckBoxInTable(language, addLanguageToQualifications.tableLocator);
        click(addLanguageToQualifications.deleteButton);

        waitForVisibility(addLanguageToQualifications.successMessage);
        System.out.println(addEmployeeLanguages.successMessage.getText());
        Assert.assertTrue(addLanguageToQualifications.successMessage.getText().contains("Successfully Deleted"));

    }
}
