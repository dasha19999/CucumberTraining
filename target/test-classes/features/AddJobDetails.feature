Feature: Add Employee Job Details functionality

Background:
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in
When user clicks on PIM option
And user clicks on Employee List button
  Then list of all Employees is displayed
  When user enters valid employee id
  And user clicks the search button
When user click the employee name
  And  user clicks Job button
  And user clicks edit
