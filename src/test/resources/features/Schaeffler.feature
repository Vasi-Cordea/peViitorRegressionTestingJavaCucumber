Feature: as a user I want to see Schaeffler open positions on peviitor.ro

  Scenario: User is able to check Schaeffler open positions
    Given Browser is then opened for Schaeffler
    When the user is on the landing page
    Then the user clicks on Schaeffler company logo
    And user gets the text of first job listed2
    When the user navigates to Schaeffler home page career
    And user searches for same job
    Then user can assert same results on both pages
