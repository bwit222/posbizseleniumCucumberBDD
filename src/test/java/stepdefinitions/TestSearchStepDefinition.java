package stepdefinitions;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.SearchPage;
import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestSearchStepDefinition extends Base {


	WebDriver driver;
	LandingPage landingPage;
	SearchPage searchPage;


// ----------------------------------------------------	
//Search for a product using a valid product name
// ----------------------------------------------------	
    // =====================================================
    // COMMON - Open Browser
    // =====================================================
	@Given("^User opens the browser$")
    public void User_opens_the_browser() throws IOException  {
		
		driver = intializeDriver();
		landingPage = new LandingPage(driver);
     }
	
    // =====================================================
    // COMMON - Navigate to Home Page
    // =====================================================
	@Given("^User navigates to the home page$")
    public void User_navigates_to_the_home_page()  {
		
		driver.get(prop.getProperty("url"));
     }
	
    // =====================================================
    // SCENARIO 1 - Valid Product Name
    // =====================================================
	@When("^User enters a valid product name in the search box$")
    public void User_enters_a_valid_product_name_in_the_search_box()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("validproductname"));
     }
	
	
    // =====================================================
    // SCENARIO 2 - Exact Product Name
    // =====================================================
		
	@When("^User enters a Exact product name in the search box$")
	public void User_enters_a_Exact_product_name_in_the_search_box() {
			 
		 landingPage.SearchField().sendKeys(prop.getProperty("exactproductname"));
		        	    	
		 }	
	
	// =====================================================
    // SCENARIO 3 - Valid SKUNumber
    // =====================================================
	@When("^User enters a SKUNumber in the search box$")
    public void Search_for_a_product_using_a_SKUNumber()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("skunumber"));
     }
	
	// =====================================================
    // SCENARIO 4 - Partial Product Name
    // =====================================================
	@When("^User enters a Partial Product Name in the search box$")
    public void Search_for_a_product_using_a_Partial_Product_Name()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("partialproductname"));
     }
	
	// =====================================================
    // SCENARIO 5 - Brand Name
    // =====================================================
	@When("^User enters a Brand Name in the search box$")
    public void Search_for_a_product_using_a_BrandName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("brandname"));
     }
	
	// =====================================================
    // SCENARIO 6 - LowerCase Product Name
    // =====================================================
	@When("^User enters a LowerCase Product Name in the search box$")
    public void Search_for_a_product_using_a_LowerCaseProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("lowercaseproductname"));
     }
	
	// =====================================================
    // SCENARIO 7 - UpperCase Product Name
    // =====================================================
	@When("^User enters a UpperCase Product Name in the search box$")
    public void Search_for_a_product_using_a_UpperCaseProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("uppercaseproductname"));
     }
	
	// =====================================================
    // SCENARIO 8 - Mixcase Product Name
    // =====================================================
	@When("^User enters a Mixcase Product Name in the search box$")
    public void Search_for_a_product_using_a_MixcaseProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("mixcaseproductname"));
     }
	
	// =====================================================
    // SCENARIO 9 - SpecialCharacter Product Name
    // =====================================================
	@When("^User enters a SpecialCharacter Product Name in the search box$")
    public void Search_for_a_product_using_a_SpecialCharacterProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("specialcharacterproductname"));
     }
	
	// =====================================================
    // SCENARIO 10 - Discontinued Product Name
    // =====================================================
	@When("^User enters a Discontinued Product Name in the search box$")
    public void Search_for_a_product_using_a_DiscontinuedProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("discontinuedproductname"));
     }
	
	// =====================================================
    // SCENARIO 11 - Discontinued Product Sku
    // =====================================================
	@When("^User enters a Discontinued Product Sku in the search box$")
    public void Search_for_a_product_using_a_DiscontinuedProductSku()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("discontinuedproductsku"));
     }
	
	// =====================================================
    // SCENARIO 12 - InvalidProductName
    // =====================================================
	@When("^User enters a InvalidProductName in the search box$")
    public void Search_for_a_product_using_a_InvalidProductName()  {
		
		landingPage.SearchField().sendKeys(prop.getProperty("invalidproductname"));
     }
	
	 // =====================================================
     // COMMON - Click Search Button
     // =====================================================
	
	@When("^User clicks the search button$")
	public void User_clicks_the_search_button() {
		 
	      landingPage.SearchButton().click();	      	    
	 }
	 
	   // =====================================================
	   // SCENARIO 1 - Validate Search Result
	   // =====================================================
	 
	@Then("^Search results for the product should be displayed$")
	public void Search_results_for_the_product_should_be_displayed()  {
			
			validateSearchResult();

		    }
	 	 
	    // =====================================================
	    // SCENARIO 2 - Validate Exact Product Result
	    // ===================================================== 
		
	 @Then("^Search results for the Exact Product Name should be displayed$")
	 public void Search_results_for_the_Exact_Product_Name_should_be_displayed() {
		 
		 	validateSearchResult();
	  	    
	 }

	   // =====================================================
	   // SCENARIO 3 - Validate Valid SKUNumber
	   // =====================================================
	 
	@Then("^Search results for the SKUNumber should be displayed$")
	public void Search_results_for_the_SKUNumber_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 4 - Validate Partial Product Name
	   // =====================================================
	 
	@Then("^Search results for the Partial Product Name should be displayed$")
	public void Search_results_for_the_Partial_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 5 - Validate Brand Name
	   // =====================================================
	 
	@Then("^Search results for the Brand Name should be displayed$")
	public void Search_results_for_the_Brand_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 6 - Validate LowerCase Product Name
	   // =====================================================
	 
	@Then("^Search results for the LowerCase Product Name should be displayed$")
	public void Search_results_for_the_LowerCase_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 7 - Validate UpperCase Product Name
	   // =====================================================
	 
	@Then("^Search results for the UpperCase Product Name should be displayed$")
	public void Search_results_for_the_UpperCase_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 8 - Validate Mixcase Product Name
	   // =====================================================
	 
	@Then("^Search results for the Mixcase Product Name should be displayed$")
	public void Search_results_for_the_Mixcase_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 9 - Validate SpecialCharacter Product Name
	   // =====================================================
	 
	@Then("^Search results for the SpecialCharacter Product Name should be displayed$")
	public void Search_results_for_the_SpecialCharacter_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 10 - Validate Discontinued Product Name
	   // =====================================================
	 
	@Then("^Search results for the Discontinued Product Name should be displayed$")
	public void Search_results_for_the_Discontinued_Product_Name_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 11 - Validate Discontinued Product Sku
	   // =====================================================
	 
	@Then("^Search results for the Discontinued Product Sku should be displayed$")
	public void Search_results_for_the_Discontinued_Product_Sku_should_be_displayed()  {
			
			validateSearchResult();

		    }
	   // =====================================================
	   // SCENARIO 12 - Validate InvalidProductName
	   // =====================================================
	 
	@Then("^Search results for the InvalidProductName should not be displayed$")
	public void Search_results_for_the_InvalidProductName_should_not_be_displayed()  {
			
			validateSearchResult();

		    }
	
	 
	
	 
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&	
	 
	    // =====================================================
	    // COMMON - Valid Search Result Validation
	    // =====================================================

	    private void validateSearchResult() {

	        searchPage = new SearchPage(driver);

			// ASSERT: test passes only if ProductFoundMessage() is displayed, otherwise fail
	        boolean resultDisplayed = searchPage.ProductFoundMessage().isDisplayed();
	        Assert.assertTrue(resultDisplayed,"Search results were not displayed");
	    }
	    
	    // =====================================================
	    // COMMON - Invalid Search Result Validation
	    // =====================================================
	    
	    private void invalidateSearchResult() {

	        searchPage = new SearchPage(driver);

	     // ASSERT: test passes only if SuccessMessage() is displayed, otherwise fail
	     			boolean successVisible = searchPage.ProductNotFoundMessage().isDisplayed();
	     			Assert.assertTrue(successVisible, "Product not found message is displayed - Search may have failed");
	    }
	 
	 
	    // =====================================================
	    // CLOSE BROWSER
	    // =====================================================
		
		@After
		public void closeBrowser() {
			
			if (driver != null) {
				driver.quit();
			}
		}
	
	
		
}
