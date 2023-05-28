@smoke 
Feature: To validate the new account creation functinality of facebook
@second
  Scenario: To validate the Account page by all valid credentials
    When user has to launch the Url and click create new account button
    And user has to navigate to create new account page
    And user has to enter the Firstname and secondname
      | sriram | adhavan | hari | arun | kiran |
    And user has to enter the moblie number or email id
      |        8765432109 | adghhawer@gmail.com | Surya123@gmail.com |
      | Keshave@gmail.com |          9080566459 |         8228877124 |
      | charlie@yahoo.com | raghul@buingo.com   |         7564321890 |
    And user has to click the gender icon
    And user has to click signup button
    Then user has to navigate to facebook homepage
