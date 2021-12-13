package com.toppros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toppros.base.TestBase;

import org.apache.log4j.Logger;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class Homepage extends TestBase {

	@FindBy(className = "shared-LandingSection__arrow--3867J")
	WebElement TeacherStarthere;

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	public void Teacher() {

		TeacherStarthere.click();

	}
}
