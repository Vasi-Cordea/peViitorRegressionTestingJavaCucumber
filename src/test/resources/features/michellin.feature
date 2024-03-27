Feature: as a user I want to see Michelin open positions on peviitor.ro
  @ignore
  Scenario: User is able to check Michelin open positions
    Given Browser is opened for michellinUser
    Given the michellinUser is on the peviitor landing page
    Given the user clicks on Michelin company logo
    And user gets the text of first Michellin job listed
    Given the user navigates to Michelin home page career
    Then user compares job title from peviitor == Michellin.com
