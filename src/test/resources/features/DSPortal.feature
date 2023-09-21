@DSPortal
Feature: DSPortal
  I want to use this template for my feature file

  @Testcase01
  Scenario Outline: Open the homepage of DSPortalApp
    Given User open the application of DSPortalapp <App>
    Then user navigate to homepage  
   
 
    Examples: 
      | App                                |  Button    |
      | https://dsportalapp.herokuapp.com/ |  Get Started|
      
     @Testcase02
  Scenario Outline: Open the homepage of DSPortalApp
    Given User open the application of DSPortalapp <App>
    When user clicks to <Button> 
    Then user navigate to homepage 
 
    Examples: 
      | App                                |  Button    |
      | https://dsportalapp.herokuapp.com/ |  Get Started|
         

