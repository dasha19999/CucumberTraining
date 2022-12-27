Feature: Add Employee Job Details functionality

Background:
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in
When user clicks PIM option
And user clicks Employee List button
  Then list of all Employees is displayed
  When user enters valid employee id
  And user clicks the search button
When user click the employee name
  Then Employee personal page is present
  When  user clicks Job button
  Then Job tab is present
  When user clicks edit

  @test10
Scenario: adding job details to an existing employee profile





