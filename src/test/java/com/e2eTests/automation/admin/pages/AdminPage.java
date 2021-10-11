package com.e2eTests.automation.admin.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage {

	/*Locators*/

	/*@FindBy*/
	@FindBy(how= How.XPATH, using="//b[contains(text(),'Admin')]")
	//@FindBy(how= How.XPATH, using="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	public static WebElement adminMenu;	
	@FindBy(how= How.ID, using="searchSystemUser_userName")
	public static WebElement searchUsernameField;	
	@FindBy(how= How.ID, using="menu_admin_UserManagement")
	public static WebElement userManagement;		
	@FindBy(how= How.ID, using="searchBtn")
	public static WebElement searchBtn;
	@FindBy(how= How.XPATH, using="//a[contains(text(),'Rebecca.Harmony')]")
	//@FindBy(how= How.XPATH, using="//*[@id=\\\"resultTable\\\"]/tbody[1]/tr[1]/td[2]/a")
	public static WebElement userDisplayed;
	
	/*Methods*/
	
	public void clickAdminMenu() {
		adminMenu.click();
	}
	
	public void clickUserManagementMenu() {
		userManagement.click();
	}
	
	public void enterDesiredUsername(String username) {
		searchUsernameField.sendKeys(username);
	}
	
	public void clickSearchButton() {
		searchBtn.click();
	}

}



