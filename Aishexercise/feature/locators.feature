#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: selenium java
  Scenario: automate amazon website
    Given Automate amazon using selenium locators
    Then I locate element by linktext
    Then I locate element by partial linktext
    Then I locate element by xpath
    Then I take screenshot
    Then I scroll the window
    Then I rightclick one item
    Then I doubleclick on item
    Then I hover the mouse on item
    And close the google