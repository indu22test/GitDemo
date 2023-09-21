
@Homepage
Feature: Title of your feature
  I want to land on the homepage

  @Testcase01
  Scenario Outline: Open the homepage of DSPortalApp
    Given User open the application of DSPortalapp <App>
    When user clicks to <Button> 
    Then user navigate to homepage
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
