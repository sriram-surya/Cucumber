@sanity
Feature: To validate the login Functionality of ERP
@first
  Scenario Outline: To validate the login credentials
 
    When user has to launch the url
    And user has to enter the "<username>" and "<password>"
    Then user has to navigate to homepage

    Examples: 
      | username | password |
      | surya    |    12345 |
      | surya    | admin    |
      | sylix    | password |
      | sylix    | admin    |
@third
  Scenario: To validate the functionality of supplier managment
    When user has to click supplier Management
    And user has to enter the date of enquiry
      | 03.09.2029 | 06.09.2029 | 03.08.2029 | 13.09.2029 |
    And user has to enter the customer id
      | cus004400 | cus006600 | cus244400 |
      | cus004400 | cus006600 | cus244400 |
      | cus004400 | cus006600 | cus244400 |
    And user has to enter the phone number
      | phonenumber | 9884178072 |
    And user has to enter the mobile number
      | phonenumber | contactnumber | privateNumber |
      |  9884178072 |    1234567788 |    9876543210 |
      |  9884568072 |   89765432190 |     876534278 |
      |  9884568072 |   89765432190 |     876534278 |
