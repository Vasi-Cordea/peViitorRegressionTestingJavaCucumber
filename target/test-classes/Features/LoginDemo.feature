Feature: Test login functionality
  I want to use this template for my feature file

  Scenario Outline: Check login is succesfully with valid credentials
    Given Browser is  then opened
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user navigates to the homepage

    Examples: 
      | username | password    |
      | student  | Password123 |
      | student  | passFail    |
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      #relates to LoginDemoSteps or (LoginDemoSteps_POM and pages.loginPage)
      
       # To execute scenario:
       # 1. right click 
       # 2. Run As > 
       # 1 Cucumber Feature
