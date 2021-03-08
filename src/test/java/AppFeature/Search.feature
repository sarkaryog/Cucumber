Feature: Google Search

  Scenario: Search a product
    Given I have a search field on google
    When I search for a product with name "Apple macbook pro" and price 100000
    Then product with name "Apple macbook pro" should be displayed
 