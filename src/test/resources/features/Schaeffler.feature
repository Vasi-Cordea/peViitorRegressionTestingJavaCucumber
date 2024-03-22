Feature: as a user I want to see Schaeffler open positions on peviitor.ro

  Scenario: User is able to check Schaeffler open positions
    Given Browser is then opened
    Given the user is on the landing page
    Given the user clicks on Scaheffler company logo

    Given the user navigates to Schaeffler home page career
    And user searches for same job
    Then user can compare the results with peviitor
