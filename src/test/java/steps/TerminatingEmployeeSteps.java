package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class TerminatingEmployeeSteps extends CommonMethods {


    @When("Admin searches employee using employee Id")
    public void admin_selects_a_specified_employee() throws InterruptedException {

        sendText(employeeList.empSearchIdField,"43961A");
        click(employeeList.searchButton);
        click(employeeList.clickEmployeeButton);

    }

    @When("clicks on Job")
    public void clicks_on_job() {
    click(personalDetails.Job);
    }

    @When("clicks on Terminate Employment")
    public void clicks_on_terminate_employment() {
    click(terminatingEmployee.termBtn);
    }

    @When("clicks on Confrim")
    public void clicks_on_Confirm() {
    click(terminatingEmployee.confirmBtn);
    }

    @Then("specified employee is terminated")
    public void specified_employee_is_terminated() {
    WebElement employeeIsTerminated = driver.findElement(By.xpath("//*[@id=\"terminatedDate\"]/a"));
    Assert.assertTrue(employeeIsTerminated.isDisplayed());
    System.out.println("Employee Terminated Successfully");
    click(terminatingEmployee.termBtn);//Re-activate Employee to simplify re-testing
    }

}
