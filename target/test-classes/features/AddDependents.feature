Feature: Add Dependents to Employee's Personal Details

   @test07
  Scenario: Adding dependents

     Given user enters valid admin username and valid admin password
    When user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Employee List button
    When user enters valid employee id
    And user clicks the search button
    And user clicks the employee
    Then employee's personal page is displayed
   And admin user clicks on Dependents button
    And admin user clicks on Add button
    When name textbox is displayed and user can enter values "Anna" there
    And relationship dropdown field is displayed and user can select values from there
     |Child|
     |Other|
     And user select "Child"
    And date of Birth calendar is displayed
     And user click on calendar field
     And user choose month "Dec" and year "2014"
     And user choose day "25" from calendar
    And user clicks on save button
    Then dependent added successfully

