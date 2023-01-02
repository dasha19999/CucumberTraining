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

    @When("user inputs {string} in textBox")
    public void user_inputs_in_text_box(String language) {
        sendText(addLanguage.textBox, language);
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {
        click(addLanguage.saveButton);
    }

    @Then("language is succesfully added")
    public void language_is_succesfully_added() {
        waitForVisibility(addLanguage.successMessage);
        Assert.assertTrue(addLanguage.successMessage.getText().contains("Successfully Saved"));
    }

    @Then("user can delete language {string} for retesting")
    public void user_can_delete_language_for_retesting(String language) {

        int counter = 0;
        for (WebElement languageLine : addLanguage.languageTableLines) {
            if (languageLine.getText().equals(language)) {
                System.out.println(counter);
                System.out.println("//*[@id='recordsListTable']/tbody/tr["+(counter+1)+"]/td[1]");
                WebElement clickBtn = driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr["+(counter+1)+"]/td[1]"));
                click(clickBtn);
                break;
            }
            counter++;
        }
        click(addLanguage.deleteButton);

    }
}
