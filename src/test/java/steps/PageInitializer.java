package steps;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.PersonalDetailsPage;

public class PageInitializer {

        public static LoginPage login;
        public static DashboardPage dashboard;

        public static AddEmployeePage addEmployee;

        public static PersonalDetailsPage personalDetails;

        public static void initializePageObjects() {

            login = new LoginPage();
            dashboard = new DashboardPage();
            addEmployee = new AddEmployeePage();
            personalDetails=new PersonalDetailsPage();
        }
    }

