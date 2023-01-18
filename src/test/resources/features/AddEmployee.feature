Feature: Add employee
Background:
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in
When user clicks on PIM option
  And user clicks on Add Employee button

@db
  Scenario: Adding employee and veryfication it is stored in database
  And user enter "Mansoor" and "Raufi"
  And user captures employee id
And user can press save button
  Then employee added successfully
  And added employee is displayed in database
