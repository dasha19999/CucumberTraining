Feature: Add Employee Job Details functionality

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
    When  user clicks Job button
    Then Job tab is present
    When user clicks edit button

  @test10
  Scenario: adding job details to an existing employee profile

    Then Job Title dropdown field is displayed and user can select following values from there
      | Cloud Engineer |
      | QA lead        |
      | Trainee        |
    And Employment Status dropdown field is displayed and user can select following values from there
      | Active      |
      | Fired       |
      | in training |
    And Job Category dropdown field is displayed and user can select following values from there
      | Sales Workers |
      | Technicians   |
      | Artist        |
    And Joined Date calendar is displayed and user can input following values in Calendar field
      | month | day | year |
      | 08    | 23  | 2012 |
      | 11    | 05  | 2020 |
      | 01    | 16  | 2018 |

    And user can select following values from Calendar
      | month | day | year |
      | Aug   | 23  | 2012 |
      | Nov   | 5   | 2020 |
      | Jan   | 16  | 2018 |

    And Sub Unit dropdown field is displayed and user can select following values from there
      | IT Support          |
      | Account             |
      | Sales and marketing |
    And Location dropdown field is displayed and user can select following values from there
      | Big Office   |
      | New Office   |
      | White Office |
    And Start Date calendar is displayed and user can pick following values from there
      | month | day | year |
      | Aug   | 23  | 2012 |
      | Nov   | 5  | 2020 |
      | Jan   | 16  | 2018 |
    And End Date calendar is displayed and user can pick following values from there
      | month | day | year |
      | Aug   | 23  | 2012 |
      | Nov   | 5  | 2020 |
      | Jan   | 16  | 2018 |
    And Contract Details file upload field is displayed and accepts file up to 1MB









