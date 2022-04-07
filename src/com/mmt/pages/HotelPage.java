package com.mmt.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mmt.base.TestBase;
import com.mmt.util.PropertiesData;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Locators and methods for HomeScreen We will call these locator and methods to
 * create test cases
 * 
 * @author manjunathdj
 *
 */
public class HotelPage extends TestBase {

	
	@FindBy(xpath = "//div[2]//div[1]//div[1]//nav[1]//ul[1]//li[2]//a[1]")
	WebElement HotelIcon;
	
	@FindBy(xpath = "//label[contains(text(),'₹ 0 - ₹ 2000')]")
	WebElement HotelPrice;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[2]")
	WebElement Selecthotel;
	
	@FindBy(xpath="//button[@class='apldFltr__item--close']")
	WebElement removefilter;
	
	@FindBy(id="hlistpg_sortby_option")
	WebElement popularfilter;
	
	@FindBy(xpath="//li[normalize-space()='Price - High to Low']")
	WebElement hightolow;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/div[2]/div[1]")
	WebElement filterhotelselect;
	
	public HotelPage() {

		PageFactory.initElements(driver, this);
	}

	public void Hotelicon() throws InterruptedException {
        driver.switchTo().defaultContent();
		HotelIcon.click();
		
	}
	
	public void hotelfilter() throws  Exception{
		  
		  Thread.sleep(10000);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,500)");
		  HotelPrice.click();
    
	}
	
   public void selecthotel() throws Exception {
	   
	   Selecthotel.click();
	   Thread.sleep(10000);
	   String parentWindow= driver.getWindowHandle();
	   Set<String> allWindows = driver.getWindowHandles();
	   for(String curWindow : allWindows){
	       //driver.switchTo().window(curWindow);
	       driver.switchTo().window(parentWindow);
	       Thread.sleep(10000);
	       removefilter.click();   
	       popularfilter.click();
	       hightolow.click();
	       filterhotelselect.click();
		
	}
 }
}
		

