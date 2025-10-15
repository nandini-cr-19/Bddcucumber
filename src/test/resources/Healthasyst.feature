Feature: Logo navigation healthasyst

  Scenario: User clicks on the healthasyst logo to return to the home page
    Given the user is on any page of the website
    When the user clicks on the website logo
    Then the user should be redirected to the home page
