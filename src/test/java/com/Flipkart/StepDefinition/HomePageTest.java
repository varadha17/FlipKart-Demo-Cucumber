package com.Flipkart.StepDefinition;

import java.io.IOException;

import com.Flipkart.Base.base;
import com.Flipkart.Pages.HomePage;
import com.Flipkart.Pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageTest extends base {
	
	public HomePageTest() throws IOException {
		super();
		
	}
	
	public LoginPage login;
	public HomePage home;
	
	@Before("@HomePage")
	public void setUp() throws IOException, InterruptedException {
		
		startBrowser();
		
		login = new LoginPage();
		
		home = login.ValidUsernameAndValidPassword();

	}
	
	@Given("^Click on cart icon$")
	public void Click_on_cart_icon() throws Throwable {
	    
		home.ClickCartIcon();
		
	}

	@Given("^User search for Samsung Mobiles$")
	public void User_search_for_Samsung_Mobiles(DataTable item) throws Throwable {
		
		home.UserSearch(item);
	    
	}

	@When("^Add the Mobile that appears in the search result to the basket$")
	public void Add_the_Mobile_that_appears_in_the_search_result_to_the_basket() throws Throwable {
	    
		home.ClickSamsungMobile();
		
	}

	@Then("^User basket should display with added item$")
	public void User_basket_should_display_with_added_item() throws Throwable {
	    
		home.gotoSamsungPage();
		
	}

	@Given("^Added item should be displayed in the cart$")
	public void Added_item_should_be_displayed_in_the_cart() throws Throwable {
	    
	    home.placeOrderCart();
	}
	
	@After("@HomePage")
	public void tearDown() {
		
		driver.quit();
	}
	

}
