package com.e2eTests.automation.authentication.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

	/*Locators*/

	/*@FindBy*/
	@FindBy(how= How.ID, using="txtUsername")
	public static WebElement userName;

	@FindBy(how= How.ID, using="txtPassword")
	public static WebElement password;

	@FindBy(how= How.ID, using="btnLogin")
	public static WebElement btnLogin;

	/*Methods*/
	public void fillUsername() {
		userName.sendKeys("Admin");
	}

	public void fillPassword() {
		password.sendKeys("admin123");
	}

	public void clickLoginButton() {
		btnLogin.click();

	}

}
