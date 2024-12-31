$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("locators.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "selenium java",
  "description": "",
  "id": "selenium-java",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 21,
  "name": "automate amazon website",
  "description": "",
  "id": "selenium-java;automate-amazon-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "Automate amazon using selenium locators",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "I locate element by linktext",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I locate element by partial linktext",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "I locate element by xpath",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I take screenshot",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I scroll the window",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I rightclick one item",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I doubleclick on item",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "I hover the mouse on item",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "close the google",
  "keyword": "And "
});
formatter.match({
  "location": "seleniumloccls.automate_amazon_using_selenium_locators()"
});
formatter.result({
  "duration": 20779290300,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_locate_element_by_linktext()"
});
formatter.result({
  "duration": 12896407900,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_locate_element_by_partial_linktext()"
});
formatter.result({
  "duration": 67318071500,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_locate_element_by_xpath()"
});
formatter.result({
  "duration": 76900,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_take_screenshot()"
});
formatter.result({
  "duration": 56300,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_scroll_the_window()"
});
formatter.result({
  "duration": 20447504600,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_rightclick_one_item()"
});
formatter.result({
  "duration": 15984341600,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_doubleclick_on_item()"
});
formatter.result({
  "duration": 6459296000,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.i_hover_the_mouse_on_item()"
});
formatter.result({
  "duration": 5484351500,
  "status": "passed"
});
formatter.match({
  "location": "seleniumloccls.close_the_google()"
});
formatter.result({
  "duration": 53400,
  "status": "passed"
});
});