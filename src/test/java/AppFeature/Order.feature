Feature: Amazon order page
  In order to check my order details 
  as a registered user
  I want to specify the features of order details page
  
# to avoid repetive test steps we use background keyword

# Background should be a part of feature file
  
Background:

    Given a registered user exists
    Given User is on amazon login page
    When users enters username
    And User enters password
    And user click on login button
    Then user navigate to order page



  Scenario: Check previous Order details
  
      When user clicks on previous order link
      Then user check the previous order details

 
  Scenario: Check open order details
  
      When user clicks on open order link
      Then user check the open order details
  
  
  
  Scenario: Check cancelled order details
  
      When user clicks on cancelled  order link
      Then user check the cancelled order detailsed order details