package com.mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.dom.model.ChildNodeCountUpdated;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mmt.base.TestBase;
import com.mmt.util.PropertiesData;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class HomePage extends TestBase {

	
	@FindBy(id = "city")
	WebElement citysearch;
	
	@FindBy(xpath="//input[@placeholder='Enter city/ Hotel/ Area/ Building']")
	WebElement cityinput;
	
	@FindBy(xpath="checkin")
	WebElement checkin;
	
	@FindBy(xpath="//div[@aria-label='Thu Apr 07 2022']")
	WebElement checkindate;
	
	@FindBy(xpath="//div[@aria-label='Thu Apr 14 2022']")
	WebElement checkoutdate;
	
	@FindBy(id="guest")
	WebElement guest;
	
	@FindBy(xpath="//div[@class='minContainer']//ul[2]//li[2]")
	WebElement childselection;
	
	@FindBy(xpath="0")
	WebElement childage;
	
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[3]/button[2]")
	WebElement applybutton;
	
	@FindBy(id="hsw_search_button")
	WebElement searchbutton;
	
	
	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void Citysearch() throws Exception {
        driver.switchTo().defaultContent();
		citysearch.click();
		cityinput.sendKeys(PropertiesData.getObject("city"));
		driver.findElement(By.xpath("//p[normalize-space()='Bangalore, Karnataka, India']")).click();	
	       
	}
	
	public void guestselection()throws Exception {
		
		checkindate.click();
		checkoutdate.click();
	}
		
   public void guest() throws Exception {
	   
	   guest.click();
	   childselection.click();
   }
   
   public void chileage() throws Exception {
	   
	   Select childage = new Select(driver.findElement(By.className("ageSelectBox")));
	   childage.selectByIndex(2);
	   
   }
	   
  public void applybutton () throws Exception{
	  
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,100)");
	  Thread.sleep(10000);
	  applybutton.click();
	  searchbutton.click();
   }
}