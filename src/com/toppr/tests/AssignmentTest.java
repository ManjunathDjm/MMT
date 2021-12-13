package com.toppr.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.qdox.model.expression.Assignment;
import com.toppros.base.TestBase;
import com.toppros.pages.Homepage;
import com.toppros.pages.LoginPage;
import com.toppros.pages.TopprExplorerPage;


public class AssignmentTest extends TestBase{
	
	@Parameters("browser")
	@Test()
	public void Login() throws Exception {

		Homepage home = new Homepage();
		home.Teacher();

		LoginPage login = new LoginPage();
		login.phone("mobile");
		login.password("password");
		login.loginbutton();
		
        TopprExplorerPage explorer = new TopprExplorerPage();
        explorer.assignmenttab();
        Thread.sleep(20000);
		
		


		
		
		
		
		
  }
}
	