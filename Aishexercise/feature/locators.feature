
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
    
     Scenario: open google chrome
        Given open google chrome browser