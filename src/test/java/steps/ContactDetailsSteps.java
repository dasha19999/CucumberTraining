package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class ContactDetailsSteps extends CommonMethods {


    @And("user clicks on Contact Details button")
    public void userClicksOnContactDetailsButton() {
        click(contactDetails.contactDetailsButton);

    }

    @Given("the contact details are displayed")
    public void the_contact_details_are_displayed() {

        Assert.assertTrue(contactDetails.contactDetailsDisplay.isDisplayed());
    }

    @Given("user clicks on Edit button")
    public void edit_button_is_clickable() {
        click(contactDetails.editButton);
    }

    @When("I enter {string} in the Address Street First textbox")
    public void iEnterStreetAddressInTheTextbox(String address) {
        sendText(contactDetails.street1, address);
    }


    @And("I enter {string} in the Address Street Second textbox")
    public void IEnterStreetAddressInTheTextbox(String adress2) {
        sendText(contactDetails.street2, adress2);
    }

    @When("I enter {string} in the City textbox")
    public void i_enter_city_in_the_textbox(String city) {
        sendText(contactDetails.city, city);
    }

    @When("I enter {string} or province in the State textbox")
    public void i_enter_state_or_province_in_the_textbox(String state) {
        sendText(contactDetails.state, state);
    }

    @When("I enter {string} in the Zip Postal Code textbox")
    public void i_enter_zip_or_postal_code_in_the_textbox(String zip) {
        sendText(contactDetails.zip, zip);
    }

    @When("I select {string} from the Country dropdown")
    public void i_select_country_from_the_dropdown(String country) {
        selectDropDown(contactDetails.country, country);
    }

    @When("I enter {string} number in the Home Phone textbox")
    public void i_enter_home_phone_number_in_the_textbox(String homePhone) {
        sendText(contactDetails.HomePhone, homePhone);
    }

    @When("I enter {string} number in the Mobile Phone textbox")
    public void i_enter_mobile_phone_number_in_the_textbox(String Mobile) {
        sendText(contactDetails.Mobile, Mobile);
    }

    @When("I enter {string} number in the Work Phone textbox")
    public void i_enter_work_phone_number_in_the_textbox(String workPhone) {
        sendText(contactDetails.WorkPhone, workPhone);
    }

    @When("I enter {string} in the Work Email textbox")
    public void i_enter_work_email_in_the_textbox(String workEmail) {
        sendText(contactDetails.WorkEmail, workEmail);
    }

    @When("I enter {string} in the Other Email textbox")
    public void i_enter_other_email_in_the_textbox(String otherEmail) {
        sendText(contactDetails.OtherEmail, otherEmail);
    }

    @Then("I should be able to submit the form")
    public void i_should_be_able_to_submit_the_form() {
        click(contactDetails.btnSave);
    }

    @Then("contact information should be saved successfully.")
    public void contact_information_should_be_saved_successfully() {
        System.out.println("Contact information is saved successfully");

//clear info for easy re-testing
        click(contactDetails.editButton);
        clear(contactDetails.OtherEmail);
        clear(contactDetails.WorkEmail);
        click(contactDetails.btnSave);

    }



}
