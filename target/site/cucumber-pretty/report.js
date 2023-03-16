$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/SearchUser.feature");
formatter.feature({
  "line": 2,
  "name": "Search user",
  "description": "",
  "id": "search-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SearchUser"
    }
  ]
});
formatter.before({
  "duration": 3248591958,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "search user with alphabet",
  "description": "",
  "id": "search-user;search-user-with-alphabet",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User open website immersive dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User input username \"admin@alta.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User input password \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User already on dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click user menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User input search user \"Admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "system show user related",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.userOpenWebsiteImmersiveDashboard()"
});
formatter.result({
  "duration": 151055167,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@alta.com",
      "offset": 21
    }
  ],
  "location": "LoginSteps.userInputUsername(String)"
});
formatter.result({
  "duration": 2170567375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 21
    }
  ],
  "location": "LoginSteps.userInputPassword(String)"
});
formatter.result({
  "duration": 2053619916,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginButton()"
});
formatter.result({
  "duration": 3054075375,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userAlreadyOnDashboardPage()"
});
formatter.result({
  "duration": 3121141958,
  "status": "passed"
});
formatter.match({
  "location": "AddNewUserSteps.userClickUserMenu()"
});
formatter.result({
  "duration": 1563176208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 24
    }
  ],
  "location": "SearchUserSteps.userInputSearchUser(String)"
});
formatter.result({
  "duration": 65709417,
  "status": "passed"
});
formatter.match({
  "location": "SearchUserSteps.systemShowUserRelated()"
});
formatter.result({
  "duration": 26514000,
  "status": "passed"
});
formatter.after({
  "duration": 125943542,
  "status": "passed"
});
});