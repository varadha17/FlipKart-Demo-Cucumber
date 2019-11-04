$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:\\Users\\Varadharajan.Thiruve\\eclipse-workspace\\Flipkart.Demo\\src\\main\\java\\com\\Flipkart\\Featurefile\\HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Test HomePage",
  "description": "",
  "id": "test-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePage"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "Check for cart",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Click on cart icon",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.Click_on_cart_icon()"
});
formatter.result({
  "duration": 354548100,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Search a product and add the product in the user basket",
  "description": "",
  "id": "test-homepage;search-a-product-and-add-the-product-in-the-user-basket",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User search for Samsung Mobiles",
  "rows": [
    {
      "cells": [
        "Samsung Mobiles"
      ],
      "line": 9
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Add the Mobile that appears in the search result to the basket",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User basket should display with added item",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.User_search_for_Samsung_Mobiles(DataTable)"
});
formatter.result({
  "duration": 316346699,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.Add_the_Mobile_that_appears_in_the_search_result_to_the_basket()"
});
formatter.result({
  "duration": 4165581700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.User_basket_should_display_with_added_item()"
});
formatter.result({
  "duration": 12362182700,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Check for cart",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Click on cart icon",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.Click_on_cart_icon()"
});
formatter.result({
  "duration": 175786500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Check for cart, it should display an item",
  "description": "",
  "id": "test-homepage;check-for-cart,-it-should-display-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Added item should be displayed in the cart",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.Added_item_should_be_displayed_in_the_cart()"
});
formatter.result({
  "duration": 12302385000,
  "status": "passed"
});
});