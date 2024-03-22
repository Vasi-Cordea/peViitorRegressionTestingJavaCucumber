Feature: as a user I want to see Procter Gamble open positions on peviitor.ro
@ignore
  Scenario: User is able to check Procter Gamble open positions
    Given Browser is then opened
    Given the user is on the landing page
    Given the user clicks on Scaheffler company logo
   
    Given the user navigates to Procter Gamble home page career
    And user searches for same job
    Then user can compare the results with peviitor
