package com.toppros.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.toppros.base.TestBase;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class TopprExplorerPage extends TestBase {

	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/div[2]")
	WebElement assignment;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]")
	WebElement createbutton;
	
	public TopprExplorerPage() {

		PageFactory.initElements(driver, this);

	}
	
	public void assignmenttab() throws Exception {

			assignment.click();
			createbutton.click();

		}
}