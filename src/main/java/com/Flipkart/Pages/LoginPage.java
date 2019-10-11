package com.Flipkart.Pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Base.base;
import com.Utilities.HighlightWebElement;


public class LoginPage extends base {
	
	public LoginPage() throws IOException{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public String getWrongUsernameErrorMessage, getWrongPasswordErrorMessage;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement emailorMobile;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	WebElement Loginbutton;
	
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")
	WebElement WrongUsernameErrorMessage;
	
	@FindBy(xpath="//span[text()='Your username or password is incorrect']")
	WebElement WrongPasswordErrorMessage;
	
	@FindBy(xpath="//div[contains(text(),'Vikram')]")
	WebElement user;
	
	public void UsernameAndPassword(String username, String Loginpassword) throws InterruptedException {
		HighlightWebElement.changeColor("rgb(0,200,0)", emailorMobile, driver);
		HighlightWebElement.drawBorder(emailorMobile, driver);
		emailorMobile.sendKeys(username);
		HighlightWebElement.changeColor("rgb(0,200,0)", password, driver);
		HighlightWebElement.drawBorder(password, driver);
		password.sendKeys(Loginpassword);
		password.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		try {
		if(user.getText().equalsIgnoreCase("Vikram")) {
			
			System.out.println("Landed into home page");
			
		}
		}catch(Exception e)  { 
			getWrongPasswordErrorMessage = WrongPasswordErrorMessage.getText();
			System.out.println(getWrongPasswordErrorMessage);
			
			}
		}
	
	
	public HomePage ValidUsernameAndValidPassword() throws InterruptedException, IOException {
		
		HighlightWebElement.changeColor("rgb(0,200,0)", emailorMobile, driver);
		HighlightWebElement.drawBorder(emailorMobile, driver);
		emailorMobile.sendKeys("7373647396");
		HighlightWebElement.changeColor("rgb(0,200,0)", password, driver);
		HighlightWebElement.drawBorder(password, driver);
		password.sendKeys("vikram22");
		password.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		return new HomePage();
	}
		
	}
	
	


