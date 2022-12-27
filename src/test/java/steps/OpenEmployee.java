package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class OpenEmployee extends CommonMethods {

    @When("user clicks on PIM option")
    public void userClicksOnPIMOption() {
        click(dashboard.pimOption);
    }
    @And("user clicks on Employee List button")
    public void userClicksOnEmployeeListButton() {
        click(dashboard.empListOption);
    }
    @Then("list of all Employees is displayed")
    public void list_of_all_employees_is_displayed() {
        System.out.println("List of all Employees is displayed");
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
        sendText(employeeList.empSearchIdField,"45154A");
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        click(employeeList.searchButton);
    }


    @And("user clicks the employee")
    public void user_clicks_the_employee() {
        click(employeeList.clickEmployeeButton);
    }

    @Then("employee's personal page is displayed")
    public void that_employee_s_personal_page_is_displayed() {
        System.out.println("Employee Personal page is displayed");
    }

}
