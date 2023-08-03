#@smoke
Feature: F04_hoverCategories| user could hover on main category and select item from sub category
  Scenario: select random main category then select random sub category
    When user  select random one of the main categories and hover on it
    And select random one of the three sub categories
    And Click on selected category
    Then the page title must be equal selected sub category title
