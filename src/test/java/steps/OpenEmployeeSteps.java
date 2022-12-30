package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class OpenEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void userClicksOnPIMOption() {
        click(dashboard.pimOption);
    }
    @And("user clicks on Employee List button")
    public void userClicksOnEmployeeListButton() {
        click(dashboard.empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {

        sendText(employeeList.empSearchIdField,"43825A");

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
        WebElement personalDetailsTab = driver.findElement(By.xpath("//h1[text() = 'Personal Details' ]"));
        Assert.assertTrue(personalDetailsTab.isDisplayed());
    }

}
