package com.toppros.pages;

import org.openqa.selenium.NoSuchElementException;
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
public class TopprExplorerPage extends TestBase {

	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]")
	WebElement Assignment;
	
	@FindBy(xpath= "//button[[@type, 'submit'] and [text()='Create']")
	WebElement createassignmentbutton;
	
	@FindBy(xpath = "modules-AssignmentsManager-pages-CreateAssignmentPage__textInput--1RgI4 input-hasError input input-hasError")
	WebElement title;
	

	public TopprExplorerPage() {

		PageFactory.initElements(driver, this);
	}

	public void createassignment(String Title) throws Exception {

		Assignment.click();
		createassignmentbutton.click();
		title.sendKeys("title");

	}
}
