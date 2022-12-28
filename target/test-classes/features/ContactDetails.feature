Feature: contact details
Background:
  When user enters valid admin username and valid admin password
  And user clicks on login button
  Then user is successfully logged in
  When user clicks on PIM option
  And user clicks on Employee List button
  When user enters valid employee id
  And user clicks the search button
  And user clicks the employee
  Then employee's personal page is displayed
  And user clicks on Contact Details button
@test6
  Scenario: editing employee contact details

    Given the contact details are displayed

    And user clicks on Edit button

    When I enter street address in the "Address Street 1" textbox

    And I enter  street address in the "Address Street 2" textbox

    And I enter city in the "City" textbox

    And I enter state or province in the "State/Province" textbox

    And I enter zip or postal code in the "Zip/Postal Code" textbox

    And I select country from the "Country" dropdown

    And I enter home phone number in the "Home Phone" textbox

    And I enter mobile phone number in the "Mobile Phone" textbox

    And I enter work phone number in the "Work Phone" textbox

    And I enter work email in the "Work Email" textbox

    And I enter other email in the "Other Email" textbox

    Then I should be able to submit the form

    And  contact information should be saved successfully.
