#@smoke
Feature: F05_homeSliders|User could use home slider to choose items
  Scenario: first slider is clickable on home page
    When user click on first slider galaxy mobile
    Then the page must move to galaxy mobile page and URL must be changed

  Scenario: first slider is clickable on home page
    When user click on second slider iphone mobile
    Then the page must move to iphone mobile page and URL must be changed