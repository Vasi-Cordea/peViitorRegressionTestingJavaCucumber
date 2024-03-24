Feature: as a user I want to see  Pfizer open positions on peviitor.ro
@ignore
  Scenario: User is able to check Pfizer open positions
    Given Browser is then opened
    Given the user is on the landing page
    Given the user clicks on  Pfizer company logo
   
    Given the user navigates to Pfizer home page career
    And user searches for same job
    Then user can compare the results with peviitor
