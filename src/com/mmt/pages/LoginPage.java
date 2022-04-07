package com.mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.base.TestBase;
import com.mmt.util.PropertiesData;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class LoginPage extends TestBase {

	@FindBy(xpath = "//div[@class='makeFlex googleLoginBtn flexOne paddingR10']")
	WebElement GoogleSignup;

	@FindBy(name = "identifier")
	WebElement googlesignupform;

	@FindBy(xpath = "//span[normalize-space()='Next']")
	WebElement nextButton;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div[1]//div[1]//div[1]//div[1]//ul[2]")
	WebElement profile;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[2]/li[1]")
	WebElement myprofile;
	
	@FindBy(xpath="//div[1]//div[1]//div[1]//div[1]//ul[2]")
	WebElement logout;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void LoginSignupButton() {

		GoogleSignup.click();

	}

	public void GoogleLogin() throws Exception {

		Thread.sleep(5000);

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window ID is : " + parentWindow);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
		}
		Thread.sleep(10000);
		googlesignupform.sendKeys(PropertiesData.getObject("email"));
		nextButton.click();
		Thread.sleep(10000);
		password.sendKeys(PropertiesData.getObject("password"));
		nextButton.click();
		driver.switchTo().window(parentWindow);
		Thread.sleep(10000);

	}

	public void profile() throws Exception {
      
		profile.click();
		myprofile.click();
		logout.click();
		
	}
}
