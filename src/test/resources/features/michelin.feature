Feature: as a user I want to see Michelin open positions on peviitor.ro

  Scenario: User is able to check Michelin open positions
    Given Browser is then opened
    Given the user is on the landing page
    Given the user clicks on Michelin company logo
    
     Given the user navigates to Michelin home page career
    And user searches for same job
    Then user can compare the results with peviitor