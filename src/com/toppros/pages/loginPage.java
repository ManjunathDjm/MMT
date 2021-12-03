package com.toppros.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toppros.base.TestBase;
import com.topprschool.util.PropertiesData;

import org.apache.log4j.Logger;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class LoginPage extends TestBase {

	private static final Logger logger = org.apache.log4j.Logger.getLogger(Homepage.class);

	@FindBy(id = "countryPhone")
	WebElement phone;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]")
	WebElement loginbutton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
	WebElement pass;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public void phone(String mobile) throws Exception {

		if (logger.isDebugEnabled()) {
			logger.debug("entering Login ");
		}
		try {
			phone.sendKeys(PropertiesData.getObject("mobile"));
			loginbutton.click();
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		if (logger.isDebugEnabled()) {
			logger.debug("exiting Login()");
		}
	}
	
	public void password(String password) throws Exception {
		
		pass.sendKeys(PropertiesData.getObject("password"));
		loginbutton.click();
		
	}
}