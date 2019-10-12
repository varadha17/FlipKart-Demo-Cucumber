package com.Flipkart.Pages;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Base.base;
import com.Utilities.HighlightWebElement;

import cucumber.api.DataTable;


public class HomePage extends base {
	
	public HomePage() throws IOException{
		super();
		PageFactory.initElements(driver, this);
	}
	
	private static List<List<String>> data;
	private static Set<String> window;
	private static Iterator<String> iterate;
	private static String parentWindow, childWindow;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Cart')]")
	WebElement CartIcon;
	
	@FindBy(css="input[title='Search for products, brands and more']")
	WebElement Search;
	
	@FindBy(xpath="((//div)[text()])[position()=120]")
	WebElement ItemClick;
	
	@FindBy(xpath="((//div)[text()])[position()=140]")
	WebElement ItemClick1;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	WebElement AddToCartButton;
	
	@FindBy(xpath="//span[text()='Place Order']")
	WebElement placeOrder;
	
	@FindBy(xpath="//div[text()='Remove']")
	WebElement Remove;
	
	public void ClickCartIcon() {
		HighlightWebElement.changeColor("rgb(0,200,0)", CartIcon, driver);
		HighlightWebElement.drawBorder(CartIcon, driver);
		CartIcon.click();

	}

	public void UserSearch(DataTable item) {
		
		data = item.raw();
		HighlightWebElement.changeColor("rgb(0,200,0)", Search, driver);
		HighlightWebElement.drawBorder(Search, driver);
		Search.sendKeys(data.get(0).get(0));
		
		Search.sendKeys(Keys.ENTER);
		
	}
	
	public void ClickSamsungMobile() throws InterruptedException {
		Thread.sleep(4000);
		ItemClick.click();
		
	}
	
	public void gotoLenovoPage() throws AWTException, InterruptedException {
				
				//Window handles
				window = driver.getWindowHandles();
				iterate = window.iterator();
				parentWindow = iterate.next();
				childWindow = iterate.next();
				System.out.println(parentWindow);
				System.out.println(childWindow);
				driver.switchTo().window(childWindow);
				Thread.sleep(4000);
				
				try {
				if(AddToCartButton.getText().equalsIgnoreCase("ADD TO CART")) {
					HighlightWebElement.changeColor("rgb(0,200,0)", AddToCartButton, driver);
					HighlightWebElement.drawBorder(AddToCartButton, driver);
					AddToCartButton.click();
					Thread.sleep(4000);
				}
				}catch(Exception e) {
					driver.close();
					Thread.sleep(3000);
					driver.switchTo().window(parentWindow);
					Thread.sleep(5000);
					ItemClick1.click();
					Thread.sleep(4000);
					window = driver.getWindowHandles();
					iterate = window.iterator();
					parentWindow = iterate.next();
					childWindow = iterate.next();
					System.out.println(parentWindow);
					System.out.println(childWindow);
					driver.switchTo().window(childWindow);
					Thread.sleep(4000);
					if(AddToCartButton.getText().equalsIgnoreCase("ADD TO CART")) {
						HighlightWebElement.changeColor("rgb(0,200,0)", AddToCartButton, driver);
						HighlightWebElement.drawBorder(AddToCartButton, driver);
						AddToCartButton.click();
						Thread.sleep(4000);
				}
				}
				
	}
	
	public void placeOrderCart() throws Exception {
		
		Thread.sleep(4000);
		try {
		if(placeOrder.getText().equalsIgnoreCase("Place Order")) {
			HighlightWebElement.changeColor("rgb(0,200,0)", Remove, driver);
			HighlightWebElement.drawBorder(Remove, driver);
			Remove.click();
			Thread.sleep(4000);
			HighlightWebElement.changeColor("rgb(0,200,0)", Remove, driver);
			HighlightWebElement.drawBorder(Remove, driver);
			Remove.click();
			Thread.sleep(4000);
		}
		}catch(Exception e) {
			throw new Exception("No Place Order available in the page");

		}
		
	}
	
}
