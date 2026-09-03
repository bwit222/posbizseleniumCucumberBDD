Feature: Search Product with Valid Product Name 

Scenario: Search for a product using a valid product name 
Given User opens the browser 
Given  User navigates to the home page 
When User enters a valid product name in the search box 
When  User clicks the search button 
Then Search results for the product should be displayed

Scenario: Search for a product using a Exact Product Name 
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Exact product name in the search box 
When  User clicks the search button 
Then Search results for the Exact Product Name should be displayed

Scenario: Search for a product using a SKUNumber
Given User opens the browser 
Given  User navigates to the home page 
When User enters a SKUNumber in the search box 
When  User clicks the search button 
Then Search results for the SKUNumber should be displayed

Scenario: Search for a product using a Partial Product Name
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Partial Product Name in the search box 
When  User clicks the search button 
Then Search results for the Partial Product Name should be displayed

Scenario: Search for a product using a BrandName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Brand Name in the search box 
When  User clicks the search button 
Then Search results for the Brand Name should be displayed

Scenario: Search for a product using a LowerCaseProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a LowerCase Product Name in the search box 
When  User clicks the search button 
Then Search results for the LowerCase Product Name should be displayed

Scenario: Search for a product using a UpperCaseProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a UpperCase Product Name in the search box 
When  User clicks the search button 
Then Search results for the UpperCase Product Name should be displayed

Scenario: Search for a product using a MixcaseProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Mixcase Product Name in the search box 
When  User clicks the search button 
Then Search results for the Mixcase Product Name should be displayed

Scenario: Search for a product using a SpecialCharacterProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a SpecialCharacter Product Name in the search box 
When  User clicks the search button 
Then Search results for the SpecialCharacter Product Name should be displayed

Scenario: Search for a product using a DiscontinuedProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Discontinued Product Name in the search box 
When  User clicks the search button 
Then Search results for the Discontinued Product Name should be displayed

Scenario: Search for a product using a DiscontinuedProductSku
Given User opens the browser 
Given  User navigates to the home page 
When User enters a Discontinued Product Sku in the search box 
When  User clicks the search button 
Then Search results for the Discontinued Product Sku should be displayed

Scenario: Search for a product using a InvalidProductName
Given User opens the browser 
Given  User navigates to the home page 
When User enters a InvalidProductName in the search box 
When  User clicks the search button 
Then Search results for the InvalidProductName should not be displayed
















