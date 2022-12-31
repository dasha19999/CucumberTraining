package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class AddLanguageToQualificationsSteps extends CommonMethods {
    @When("user selects admin option from dashboard")
    public void user_selects_admin_option_from_dashboard() {
        click(addLanguage.admin);
    }

    @When("user clicks on qualifications")
    public void user_clicks_on_qualifications() {
        click(addLanguage.qualifications);
    }

    @When("from dropdown user clicks on language")
    public void from_dropdown_user_clicks_on_language() {
        click(addLanguage.language);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addLanguage.addButton);
    }

    @When("user clicks textBox")
    public void user_clicks_text_box() {
        sendText(addLanguage.texBox,"*urdo");
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() { click(addLanguage.saveButton); }

    @Then("user selects language checkbox")
    public void user_selects_language_checkbox() { click(addLanguage.languageCheckBox);}

    @Then("user clicks on delete button to delete the language")
    public void user_clicks_on_delete_button_to_delete_the_language() { click(addLanguage.deleteButton); }

}
