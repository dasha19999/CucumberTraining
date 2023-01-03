package steps;

import pages.*;


public class PageInitializer {


    public static LoginPage login;
    public static DashboardPage dashboard;

    public static AddEmployeePage addEmployee;

    public static AddEmployeeLanguagesPage addEmployeeLanguages;

    public static ContactDetailsPage contactDetails;
    public static EmployeeListPage employeeList;
    public static PersonalDetailsPage personalDetails;

    public static AddJobDetailsPage addJobDetails;
    public static CalendarPage calendar;
    public static TerminatingEmployeePage terminatingEmployee;

    public static AddDependentPage addDependent;
    public static AddLanguageToQualificationsPage addLanguageToQualifications;


    public static void initializePageObjects() {


        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployee = new AddEmployeePage();
        contactDetails = new ContactDetailsPage();
        employeeList = new EmployeeListPage();
        personalDetails = new PersonalDetailsPage();
        addDependent = new AddDependentPage();
        calendar = new CalendarPage();
        addJobDetails = new AddJobDetailsPage();
        terminatingEmployee = new TerminatingEmployeePage();
        addEmployeeLanguages = new AddEmployeeLanguagesPage();
        addLanguageToQualifications =new AddLanguageToQualificationsPage();

    }

}



