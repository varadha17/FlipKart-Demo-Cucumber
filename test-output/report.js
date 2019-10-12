$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\Flipkart.Demo\\src\\main\\java\\com\\Flipkart\\Featurefile\\Login.feature");
formatter.feature({
  "line": 2,
  "name": "User Login on Flipkart Page",
  "description": "\r\nDescription: User should be able to login into Flipkart site when the username and password are valid",
  "id": "user-login-on-flipkart-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    }
  ]
});
formatter.scenario({
  "line": 12,
  "name": "Login with Multiple user",
  "description": "",
  "id": "user-login-on-flipkart-page;login-with-multiple-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Enter the username \"7373647396\" and password \"vikram22\", then hit Enter",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "7373647396",
      "offset": 20
    },
    {
      "val": "vikram22",
      "offset": 46
    }
  ],
  "location": "LoginPageTest.Enter_the_username_and_password_then_hit_Enter(String,String)"
});
formatter.result({
  "duration": 6032338500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login with Multiple user",
  "description": "",
  "id": "user-login-on-flipkart-page;login-with-multiple-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LoginPage"
    },
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Enter the username \"9940067532\" and password \"Qsty\", then hit Enter",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "9940067532",
      "offset": 20
    },
    {
      "val": "Qsty",
      "offset": 46
    }
  ],
  "location": "LoginPageTest.Enter_the_username_and_password_then_hit_Enter(String,String)"
});
formatter.result({
  "duration": 5748208200,
  "status": "passed"
});
});