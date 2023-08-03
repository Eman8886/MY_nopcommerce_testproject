#@smoke
  Feature: F07_Wishlist | user could add his favourite items in wishlist
    Scenario: user add item in wishlist and the success msg will be shown
      When user click on wishlist button on the product
      Then the success msg will be shown

      Scenario:user add item in wishlist and the Qty value wont be 0
        When user click on wishlist button on the product
        And wait success msg to disappear click on Wishlist Tab on the top of the page
        And get Qty value
        Then Qty value must be it's bigger than zero