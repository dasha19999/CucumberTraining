Feature: Add Employee Experience


  Background:
    When user enters valid admin username and valid admin password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee List button
    When user enters valid employee id
    And user clicks the search button
    When user clicks the employee
    Then employee's personal page is displayed
    When user clicks on Qualifications button
@test9
  Scenario: Adding Employees Experience


    When on Work Experience section User clicks Add button
    When Company text box is displayed user enters value "Radio Depot"
    And Job Title text box is displayed user enters value "Manager"
    And user clicks From text box and Calender is displayed
    And user select From date\ month "Jan", year "2018", day "01"
    When user clicks To text box and Calender is displayed
    And user select To date\ month "Sep", year "2022", day "30"
    When Comment text box is displayed user enters value "Worked there for 4yrs."
    And user clicks on save button on Work Experience tab
    Then user successfully added work experience
