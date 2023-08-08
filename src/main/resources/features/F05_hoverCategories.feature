#@smoke
Feature: F04_hoverCategories| user could hover on main category and select item from sub category
  Scenario: select random main category then select random sub category
    When user  select hover on one of the main categories and click on one of the three sub categories
    Then the page title must be equal selected sub category title
