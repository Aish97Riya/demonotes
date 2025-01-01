$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("locators.feature");
formatter.feature({
  "line": 3,
  "name": "selenium java",
  "description": "",
  "id": "selenium-java",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  Scenario: automate amazon website"
    },
    {
      "line": 5,
      "value": "#   Given Automate amazon using selenium locators"
    },
    {
      "line": 6,
      "value": "#   Then I locate element by linktext"
    },
    {
      "line": 7,
      "value": "#    Then I locate element by partial linktext"
    },
    {
      "line": 8,
      "value": "#    Then I locate element by xpath"
    },
    {
      "line": 9,
      "value": "#    Then I take screenshot"
    },
    {
      "line": 10,
      "value": "#    Then I scroll the window"
    },
    {
      "line": 11,
      "value": "#    Then I rightclick one item"
    },
    {
      "line": 12,
      "value": "#    Then I doubleclick on item"
    },
    {
      "line": 13,
      "value": "#    Then I hover the mouse on item"
    },
    {
      "line": 14,
      "value": "#    And close the google"
    },
    {
      "line": 16,
      "value": "#     Scenario: open google chrome"
    },
    {
      "line": 17,
      "value": "#        Given open google chrome browser"
    },
    {
      "line": 18,
      "value": "#        And close the google"
    }
  ],
  "line": 20,
  "name": "open Flipkart",
  "description": "",
  "id": "selenium-java;open-flipkart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 21,
  "name": "Launch Flipkart website",
  "keyword": "Given "
});
formatter.match({
  "location": "seleniumloccls.launch_Flipkart_website()"
});
formatter.result({
  "duration": 19057307300,
  "status": "passed"
});
});