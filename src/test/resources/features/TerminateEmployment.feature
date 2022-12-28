Feature: Terminating an Employee

Background:
When user enters valid admin username and valid admin password
And user clicks on login button
Then user is successfully logged in
When user clicks on PIM option
And user clicks on Employee List button

@test11
Scenario: Terminating Employee
When Admin searches employee using employee Id
And clicks on Job
And clicks on Terminate Employment
And clicks on Confrim
Then specified employee is terminated