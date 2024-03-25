Feature:  I want to see if opened positions on peviitor.ro are found in Pfizer.com
  @ignore
  Scenario: User is able to check Pfizer open positions
    Given Browser is opened for PfizerUser
    When the PfizerUser is on the peviitor landing page

   Then the user clicks on Pfizer company logo
    And user gets the text of first job listed
   And the user navigates to Pfizer home page career

    Then user compares job from peviitor == Pfizer.com
