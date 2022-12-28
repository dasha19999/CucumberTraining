package steps;

import utils.CommonMethods;
import utils.ConfigReader;

public class Testing extends CommonMethods {

    public static void main(String[] args) {
        openBrowserAndLaunchApplication();
        sendText(login.userNameField, ConfigReader.getPropertyValue("username"));

        sendText(login.passWordField, ConfigReader.getPropertyValue("password"));

        click(login.loginButton);

        click(dashboard.pimOption);

        sendText(employeeList.empSearchIdField,"41903A");

        click(employeeList.clickEmployeeButton);

        click(personalDetails.Job);


    }
}
