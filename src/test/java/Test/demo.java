package Test;

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

public class demo extends Base {

    WebDriver driver;
    LandingPage landingPage;
    SearchPage searchPage;

    // =====================================================
    // COMMON - Open Browser
    // =====================================================

    @Given("User opens the browser")
    public void user_opens_the_browser() throws IOException {

        driver = intializeDriver();
        landingPage = new LandingPage(driver);
    }

    // =====================================================
    // COMMON - Navigate to Home Page
    // =====================================================

    @Given("User navigates to the home page")
    public void user_navigates_to_the_home_page() {

        driver.get(prop.getProperty("url"));
    }

    // =====================================================
    // SCENARIO 1 - Valid Product Name
    // =====================================================

    @When("User enters a valid product name in the search box")
    public void user_enters_a_valid_product_name_in_the_search_box() {

        landingPage.SearchField()
                   .sendKeys(prop.getProperty("validproductname"));
    }

    // =====================================================
    // SCENARIO 2 - Exact Product Name
    // =====================================================

    @When("User enters an Exact product name in the search box")
    public void user_enters_an_exact_product_name_in_the_search_box() {

        landingPage.SearchField()
                   .sendKeys(prop.getProperty("exactproductname"));
    }

    // =====================================================
    // COMMON - Click Search Button
    // =====================================================

    @When("User clicks the search button")
    public void user_clicks_the_search_button() {

        landingPage.SearchButton().click();
    }

    // =====================================================
    // SCENARIO 1 - Validate Search Result
    // =====================================================

    @Then("Search results for the product should be displayed")
    public void search_results_for_the_product_should_be_displayed() {

        validateSearchResult();
    }

    // =====================================================
    // SCENARIO 2 - Validate Exact Product Result
    // =====================================================

    @Then("Search results for the Exact Product Name should be displayed")
    public void search_results_for_the_exact_product_name_should_be_displayed() {

        validateSearchResult();
    }

    // =====================================================
    // COMMON - Search Result Validation
    // =====================================================

    private void validateSearchResult() {

        searchPage = new SearchPage(driver);

        boolean resultDisplayed =
                searchPage.ProductFoundMessage().isDisplayed();

        Assert.assertTrue(
                resultDisplayed,
                "Search results were not displayed"
        );
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