#@smoke
Feature: F03_Currencies| user could change currencies
  Scenario: user could change to Euro currency
    When Select Euro currency from the dropdown list on the top left of home page
    Then Euro Symbol (€) is shown on the products displayed in Home page
