package com.mmt.tests;

import org.testng.annotations.Test;

import com.mmt.base.TestBase;
import com.mmt.pages.HomePage;
import com.mmt.pages.HotelPage;
import com.mmt.pages.LoginPage;


public class AssignmentTestMMT extends TestBase{
	

	@Test()
	public void Login() throws Exception {

		LoginPage login = new LoginPage();
		login.LoginSignupButton();
		login.GoogleLogin();
		Thread.sleep(20000);
		
		HotelPage hotel = new HotelPage();
		hotel.Hotelicon();
		//Thread.sleep(20000);
		
		HomePage home = new HomePage();
		home.Citysearch();
		home.guestselection();
		home.guest();
		home.chileage();
		home.applybutton();
		//Thread.sleep(20000);
		
		HotelPage hotellist = new HotelPage();
		hotellist.hotelfilter();
		hotellist.selecthotel();
		//Thread.sleep(20000);
	  
	    LoginPage logout = new LoginPage();
	    logout.profile();
	    Thread.sleep(20000);
	    
     

		
		
		
		
		
  }
}
	