Feature: feature to test google search functionality

 
  Scenario: validate google search is working
    Given browser is opened
    And user is on google page
    When user enters a text in search box
    And hits enter
    Then user navigates to search results

