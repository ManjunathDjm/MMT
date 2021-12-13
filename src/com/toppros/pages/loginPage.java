package com.toppros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toppros.base.TestBase;
import com.topprschool.util.PropertiesData;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class LoginPage extends TestBase {


	@FindBy(id = "countryPhone")
	WebElement phone;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[4]/button[1]")
	WebElement loginbutton;

	@FindBy(xpath = "//input[@id='password']")
	WebElement loginpassword;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/button[1]")
	WebElement loginbuttonpassword;

	@FindBy(xpath = "//div[@class='modules-Auth-components-EnterPassword__loginUsingOtp--2th34']")
	WebElement loginusingotp;

	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	WebElement enterOTP;

	@FindBy(partialLinkText = "Login")
	WebElement otploginbutton;

	@FindBy(className = "modules-Auth-components-Otp__resendOtp--2I-u-")
	WebElement resendotplink;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public void phone(String mobile) throws Exception {

		phone.sendKeys(PropertiesData.getObject("mobile"));
		loginbutton.click();

	}

	public void password(String password) throws Exception {
        
		loginpassword.sendKeys(PropertiesData.getObject("password"));

	}

	public void loginbutton() throws Exception {

		loginbuttonpassword.click();
	}

	public void loginusingotp(String OTP) throws Exception {

		loginusingotp.click();
		enterOTP.sendKeys("otp");
		otploginbutton.click();
	}

	public void resentOTP() throws Exception {

		resendotplink.click();
	}
}