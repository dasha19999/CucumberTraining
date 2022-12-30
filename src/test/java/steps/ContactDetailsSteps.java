package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ContactDetailsSteps extends CommonMethods {


    @And("user clicks on Contact Details button")
    public void userClicksOnContactDetailsButton() {
click(contactDetails.contactDetailsButton);

    }

    @Given("the contact details are displayed")
    public void the_contact_details_are_displayed() {
        WebElement contactDetailsDisplay = driver.findElement(By.xpath("//h1[text()='Contact Details']"));
        Assert.assertTrue(contactDetailsDisplay.isDisplayed());
    }

    @Given("user clicks on Edit button")
    public void edit_button_is_clickable() {
      click(contactDetails.editButton);
    }

    @When("I enter street address in the {string} textbox")
    public void iEnterStreetAddressInTheTextbox(String arg0) {
        sendText(contactDetails.street1, "123 west ln");
    }


    @And("I enter  street address in the {string} textbox")
    public void IEnterStreetAddressInTheTextbox(String adress2) {
        sendText(contactDetails.street2, "apt 123");
    }

    @When("I enter city in the {string} textbox")
    public void i_enter_city_in_the_textbox(String string) {
    sendText(contactDetails.city, "Gotam");
    }

    @When("I enter state or province in the {string} textbox")
    public void i_enter_state_or_province_in_the_textbox(String string) {
        sendText(contactDetails.state, "Virginia");
    }

    @When("I enter zip or postal code in the {string} textbox")
    public void i_enter_zip_or_postal_code_in_the_textbox(String string) {
       sendText(contactDetails.zip, "12345");
    }

    @When("I select country from the {string} dropdown")
    public void i_select_country_from_the_dropdown(String string) {
       selectDropDown(contactDetails.country, "Albania");
    }

    @When("I enter home phone number in the {string} textbox")
    public void i_enter_home_phone_number_in_the_textbox(String string) {
       sendText(contactDetails.HomePhone, "123-234-233");
    }

    @When("I enter mobile phone number in the {string} textbox")
    public void i_enter_mobile_phone_number_in_the_textbox(String string) {
        sendText(contactDetails.Mobile, "234-234-334");
    }

    @When("I enter work phone number in the {string} textbox")
    public void i_enter_work_phone_number_in_the_textbox(String string) {
       sendText(contactDetails.WorkPhone, "233-444-444");
    }

    @When("I enter work email in the {string} textbox")
    public void i_enter_work_email_in_the_textbox(String string) {
       sendText(contactDetails.WorkEmail, "lukyguy@gmail.com");
    }

    @When("I enter other email in the {string} textbox")
    public void i_enter_other_email_in_the_textbox(String string) {
        sendText(contactDetails.OtherEmail, "superman@yahoo.com");
    }

    @Then("I should be able to submit the form")
    public void i_should_be_able_to_submit_the_form() {
        click(contactDetails.btnSave);
    }

    @Then("contact information should be saved successfully.")
    public void contact_information_should_be_saved_successfully() {
        System.out.println("Contact information is saved successfully");
    }



}
