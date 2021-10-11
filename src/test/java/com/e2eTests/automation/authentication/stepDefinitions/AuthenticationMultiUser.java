package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.e2eTests.automation.authentication.pages.AuthenticationPage;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.When;

public class AuthenticationMultiUser {
	
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	
	public AuthenticationMultiUser () {
		driver=Setup.driver;
	}

	@When("^je saisie le nom d'utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeNomDUtilisateur(String name) throws Throwable {
		authenticationPage.fillUsername(name);

	}

	@When("^je saisie le mot de passe de l'utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasseDeLUtilisateur(String psw) throws Throwable {
		authenticationPage.fillPassword(psw);
	}
}
