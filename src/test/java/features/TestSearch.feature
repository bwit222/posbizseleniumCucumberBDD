Feature: Search Product with Valid Product Name 

Scenario: Search for a product using a valid product name 
Given User opens the browser 
And User navigates to the home page 
When User enters a valid product name in the search box 
And User clicks the search button 
Then Search results for the product should be displayed