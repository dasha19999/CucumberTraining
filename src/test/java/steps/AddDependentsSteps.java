package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class AddDependentsSteps extends CommonMethods {
    @Then("admin user clicks on Dependents button")
    public void admin_user_clicks_on_dependents_button() {
       click(personalDetails.Dependents);
    }

    @Then("admin user clicks on Add button")
    public void admin_user_clicks_on_add_button() {

        click(addDependent.btnAddDependent);
    }

    @When("name textbox is displayed and user can enter values {string} there")
    public void name_textbox_is_displayed_and_user_can_enter_values_there(String name) {
        Assert.assertTrue(addDependent.dependentName.isDisplayed());
            sendText(addDependent.dependentName, name);
        }

    @When("relationship dropdown field is displayed and user can select values from there")
    public void relationship_dropdown_field_is_displayed_and_user_can_select_values_from_there(DataTable Relationship) {
       Assert.assertTrue(addDependent.relationshipType.isDisplayed());
        List<String>relationshipType=Relationship.asList();
        for(String relation:relationshipType){
            selectDropDown(addDependent.relationshipType, relation);
            if(relation.equalsIgnoreCase("Other")){

                addDependent.specifyRelationship.sendKeys("other");
            }
        }
    }
    @When("user select {string}")
    public void user_select(String string) {
       selectDropDown(addDependent.relationshipType, string);
    }


    @When("date of Birth calendar is displayed")
    public void date_of_birth_calendar_is_displayed() {
        Assert.assertTrue(addDependent.dependentDOB.isDisplayed());

    }

    @When("user click on calendar field")
    public void user_click_on_calendar_field() {
        addDependent.dependentDOB.click();
    }


    @When("user choose month {string} and year {string}")
    public void user_choose_month_and_year(String month, String year) {
       selectDropDown(addDependent.selectMonth, month);
       selectDropDown(addDependent.selectYear,year);

    }

    @When("user choose day {string} from calendar")
    public void user_choose_day_from_calendar(String date) {
for(WebElement day: addDependent.selectDay){
   if(day.getText().equals(date)){
       day.click();
       break;
   }
}
    }


    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        addDependent.btnSaveDep.click();
    }

    @Then("dependent added successfully")
    public void dependent_added_successfully() {
for(WebElement elem: addDependent.dependents){
    if(elem.getText().equalsIgnoreCase("Anna")){
        System.out.println("Dependent added successfully");
    }else{
        System.out.println("Dependent was not added, try again");
    }

}
    }



}
