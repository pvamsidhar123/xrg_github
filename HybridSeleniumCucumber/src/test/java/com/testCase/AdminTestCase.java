package com.testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;

public class AdminTestCase extends Library{
	AdminPage adminpage;
	@BeforeTest
	public void startup() {
		launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	
	}
	@Test(priority =1)
	public void login() {
		LoginPage lpage=new LoginPage(driver);
		lpage.login("Admin", "admin123");
	}
	@Test(priority =2)
	public void adminClick() {
		adminpage = new AdminPage(driver);
		adminpage.adminClick();
		adminpage.searchuser("kevin","All","Kevin Mathews","Enabled");
		
	
	}

}
