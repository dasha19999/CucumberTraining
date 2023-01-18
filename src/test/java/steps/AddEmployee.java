package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.Constants;
import utils.DBUtility;
import utils.ExcelReader;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AddEmployee extends CommonMethods {
    String id;
    String fName, lName;
    @When("user clicks on Add Employee button")
    public void user_clicks_on_add_employee_button() {
        //  WebElement addEmployeeOption = driver.findElement(By.id("menu_pim_addEmployee"));
        //addEmployeeOption.click();
        click(dashboard.addEmployeeOption);
    }

    @When("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname() {
        //  WebElement firstName = driver.findElement(By.id("firstName"));
        //firstName.sendKeys("Katya");
        sendText(addEmployee.firstNameField, "Dinam");
        //WebElement lastName = driver.findElement(By.id("lastName"));
        //lastName.sendKeys("Ivanova");
        sendText(addEmployee.lastNameField, "ninid");
    }

   /* @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //  WebElement saveButton = driver.findElement(By.id("btnSave"));
        //saveButton.click();
        click(addEmployee.saveButton);
    *///}

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee added");
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String firstName, String lastName) {
        fName=firstName;
        lName=lastName;
        sendText(addEmployee.firstNameField, firstName);
        sendText(addEmployee.lastNameField, lastName);
    }

    @And("user enter firstname and lastname")
    public void userEnterFirstnameAndLastname() {
    }

    @When("user enter {string} and {string} for adding multiple employees")
    public void user_enter_and_for_adding_multiple_employees(String firstNameValue, String lastNameValue) {
        sendText(addEmployee.firstNameField, firstNameValue);
        sendText(addEmployee.lastNameField, lastNameValue);
    }

    @When("user adds multiple employees and verify they are added successfully")
    public void user_adds_multiple_employees_and_verify_they_are_added_successfully(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> employeeNames = dataTable.asMaps();

        //getting the map from list of maps
        for (Map<String, String> employee : employeeNames
        ) {
            //getting the  keys and values from every map
            String firstNameValue = employee.get("firstName");
            String middleNameValue = employee.get("middleName");
            String lastNameValue = employee.get("lastName");

            sendText(addEmployee.firstNameField, firstNameValue);
            sendText(addEmployee.lastNameField, lastNameValue);
            sendText(addEmployee.middleNameField, middleNameValue);

            click(addEmployee.saveButton);
            Thread.sleep(2000);
            //till this point one employee has been added
            //verifying the employee is home-work
            click(dashboard.addEmployeeOption);
            Thread.sleep(2000);

        }


    }


    @When("user captures employee id")
    public void user_captures_employee_id() {
        id=addEmployee.empIdLocator.getAttribute("value");
    }

    @Then("added employee is displayed in database")
    public void added_employee_is_displayed_in_database() {

        String query=DatabaseSteps.getFnameLnameQuery()+id;
        List<Map<String, String>> dataFromDatabase=DBUtility.getListOfMapsFromRset(query);

        String fNameFromDb=dataFromDatabase.get(0).get("emp_firstname");
        String lNameFromDb=dataFromDatabase.get(0).get("emp_lastname");

        Assert.assertEquals(fName, fNameFromDb);
        Assert.assertEquals(lName, lNameFromDb);
    }
}
