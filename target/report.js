$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/ACC-CreationFB.feature");
formatter.feature({
  "name": "To validate the new account creation functinality of facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "To validate the Account page by all valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@second"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the Url and click create new account button",
  "keyword": "When "
});
formatter.match({
  "location": "FBaccCreation.userHasToLaunchTheUrlAndClickCreateNewAccountButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to create new account page",
  "keyword": "And "
});
formatter.match({
  "location": "FBaccCreation.userHasToNavigateToCreateNewAccountPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the Firstname and secondname",
  "rows": [
    {
      "cells": [
        "sriram",
        "adhavan",
        "hari",
        "arun",
        "kiran"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FBaccCreation.userHasToEnterTheFirstnameAndSecondname(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the moblie number or email id",
  "rows": [
    {
      "cells": [
        "8765432109",
        "adghhawer@gmail.com",
        "Surya123@gmail.com"
      ]
    },
    {
      "cells": [
        "Keshave@gmail.com",
        "9080566459",
        "8228877124"
      ]
    },
    {
      "cells": [
        "charlie@yahoo.com",
        "raghul@buingo.com",
        "7564321890"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FBaccCreation.userHasToEnterTheMoblieNumberOrEmailId(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click the gender icon",
  "keyword": "And "
});
formatter.match({
  "location": "FBaccCreation.userHasToClickTheGenderIcon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to click signup button",
  "keyword": "And "
});
formatter.match({
  "location": "FBaccCreation.userHasToClickSignupButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to facebook homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "FBaccCreation.userHasToNavigateToFacebookHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/ERP-login.feature");
formatter.feature({
  "name": "To validate the login Functionality of ERP",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@first"
    }
  ]
});
formatter.step({
  "name": "user has to launch the url",
  "keyword": "When "
});
formatter.step({
  "name": "user has to enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "surya",
        "12345"
      ]
    },
    {
      "cells": [
        "surya",
        "admin"
      ]
    },
    {
      "cells": [
        "sylix",
        "password"
      ]
    },
    {
      "cells": [
        "sylix",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefanation.userHasToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the \"surya\" and \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefanation.userHasToNavigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefanation.userHasToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the \"surya\" and \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefanation.userHasToNavigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefanation.userHasToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the \"sylix\" and \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefanation.userHasToNavigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the login credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to launch the url",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefanation.userHasToLaunchTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the \"sylix\" and \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefanation.userHasToNavigateToHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the functionality of supplier managment",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    },
    {
      "name": "@third"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to click supplier Management",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefanation.userHasToClickSupplierManagement()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the date of enquiry",
  "rows": [
    {
      "cells": [
        "03.09.2029",
        "06.09.2029",
        "03.08.2029",
        "13.09.2029"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheDateOfEnquiry(DataTable)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-4PEI7LP\u0027, ip: \u0027192.168.1.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.2\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:125)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions$RemoteTimeouts.implicitlyWait(RemoteWebDriver.java:780)\r\n\tat in.steps.StepDefanation.userHasToEnterTheDateOfEnquiry(StepDefanation.java:52)\r\n\tat ✽.user has to enter the date of enquiry(file:src/test/resources/Features/ERP-login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has to enter the customer id",
  "rows": [
    {
      "cells": [
        "cus004400",
        "cus006600",
        "cus244400"
      ]
    },
    {
      "cells": [
        "cus004400",
        "cus006600",
        "cus244400"
      ]
    },
    {
      "cells": [
        "cus004400",
        "cus006600",
        "cus244400"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheCustomerId(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter the phone number",
  "rows": [
    {
      "cells": [
        "phonenumber",
        "9884178072"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterThePhoneNumber(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user has to enter the mobile number",
  "rows": [
    {
      "cells": [
        "phonenumber",
        "contactnumber",
        "privateNumber"
      ]
    },
    {
      "cells": [
        "9884178072",
        "1234567788",
        "9876543210"
      ]
    },
    {
      "cells": [
        "9884568072",
        "89765432190",
        "876534278"
      ]
    },
    {
      "cells": [
        "9884568072",
        "89765432190",
        "876534278"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefanation.userHasToEnterTheMobileNumber(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});