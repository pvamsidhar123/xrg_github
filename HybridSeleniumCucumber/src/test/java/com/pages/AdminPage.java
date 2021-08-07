package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.Library;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminPage extends Library{
	
	SeleniumUtilities util =new  SeleniumUtilities(driver);
	//@FindBy(id="menu_admin_viewAdminModule")
	//locating admin link
	 @FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
	 WebElement admin;
	 //locating username link
	  @FindBy(id="searchSystemUser_userName")
		WebElement username;
	  //locating userrole
	  @FindBy(id="searchSystemUser_userType")
		WebElement userrole;
	  //locating Employee Name  
	  @FindBy(xpath="//*[@id='searchSystemUser_employeeName_empName']")
		WebElement empname;
	  //locating Status
	  @FindBy(id="searchSystemUser_status")
		WebElement status;
	  //locating search button
	  @FindBy(id="searchBtn")
		WebElement searchbtn;

	//constructor
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//clicking admin functionality
	public void adminClick() {
		admin.click();
		
	}
	//seraching emplyee 
	public void searchuser(String uname,String selectedValue,String ename,String selectedValue1) {
		username.sendKeys(uname);
		util.dropdown( userrole,selectedValue);
		empname.sendKeys(ename);
		util.dropdown( status,selectedValue1);
		searchbtn.click();
		
		
		
	}

}
