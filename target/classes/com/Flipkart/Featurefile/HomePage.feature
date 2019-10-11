@HomePage
Feature: Test HomePage

Background: Check for cart
Given Click on cart icon

Scenario: Search a product and add the product in the user basket
Given User search for Samsung Mobiles
|Samsung Mobiles|
When Add the Mobile that appears in the search result to the basket 
Then User basket should display with added item 

Scenario: Check for cart, it should display an item
Given Added item should be displayed in the cart