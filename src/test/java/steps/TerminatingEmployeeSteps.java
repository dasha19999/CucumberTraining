package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class TerminatingEmployeeSteps extends CommonMethods {


    @When("user clicks on Job")
    public void user_clicks_on_job() {
    click(personalDetails.Job);
    }

    @When("user clicks on Terminate Employment")
    public void user_clicks_on_terminate_employment() {
    click(terminatingEmployee.termBtn);
    }

    @When("user clicks on Confirm")
    public void user_clicks_on_Confirm() {
    click(terminatingEmployee.confirmBtn);
    }

    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
    Assert.assertTrue(terminatingEmployee.terminatedMessage.isDisplayed());
    System.out.println("Employee Terminated Successfully");
    click(terminatingEmployee.termBtn);//Re-activate Employee to simplify re-testing
    }

}
