package com.Flipkart.StepDefinition;

import java.io.IOException;

import com.Flipkart.Base.base;
import com.Flipkart.Pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class LoginPageTest extends base {

	public LoginPageTest() throws IOException{
		super();
	}
	
	public LoginPage login;
	
	@Before("@LoginPage")
	public void setUp() throws IOException {
		
		startBrowser();
		
		login = new LoginPage();

	}
	

	@Given("^Enter the username \"([^\"]*)\" and password \"([^\"]*)\", then hit Enter$")
	public void Enter_the_username_and_password_then_hit_Enter(String username, String Loginpassword) throws Throwable {
    
		login.UsernameAndPassword(username, Loginpassword);
		
	}
	
	@Given("^Enter valid username and Valid Password, then hit enter$")
	public void Enter_valid_username_and_Valid_Password_then_hit_enter() throws Throwable {
	    
		login.ValidUsernameAndValidPassword();
		
	}

	
	
	@After("@LoginPage")
	public void tearDown() {
		
		driver.quit();
	}
}
