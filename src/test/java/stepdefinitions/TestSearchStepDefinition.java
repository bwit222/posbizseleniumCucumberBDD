package stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.LandingPage;
import PageObject.SearchPage;
import Resources.Base;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSearchStepDefinition extends Base {

	WebDriver driver;
	LandingPage landingPage;
	SearchPage searchPage;
	
	@Given("^User opens the browser$")
    public void User_opens_the_browser() throws IOException  {
		
		driver = intializeDriver();
     }
	
	@And("^User navigates to the home page$")
    public void User_navigates_to_the_home_page()  {
		
		driver.get(prop.getProperty("url"));
     }
	
	@When("^User enters a valid product name in the search box$")
    public void User_enters_a_valid_product_name_in_the_search_box()  {
		
		landingPage = new LandingPage(driver);
		landingPage.SearchField().sendKeys(prop.getProperty("validproductname"));
     }
	
	@And("^User clicks the search button$")
    public void User_clicks_the_search_button()  {
		
		landingPage = new LandingPage(driver);
		landingPage.SearchButton().click();
     }
	
	@Then("^Search results for the product should be displayed$")
    public void Search_results_for_the_product_should_be_displayed()  {
		
		landingPage = new LandingPage(driver);
		
		 searchPage = new SearchPage(driver);
	        
	        boolean productNotFoundVisible = false;
	        try {
	            productNotFoundVisible = searchPage.ProductNotFoundMessage().isDisplayed();
	           
	        } catch (NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
	            // Element not found = product WAS found = this is EXPECTED for valid product
	         
	            productNotFoundVisible = false;
	        }
	        
	        // Test FAILS if "not found" message is visible (product search failed)
	        // Test PASSES if "not found" message is NOT visible (product search succeeded)
	        Assert.assertFalse(productNotFoundVisible, "Product NOT found message should not be visible for a valid product");
	       
	        
	    }
	
	@After
	public void closeBrowser() {
		
		driver.close();
	}	
	
	
		
}
