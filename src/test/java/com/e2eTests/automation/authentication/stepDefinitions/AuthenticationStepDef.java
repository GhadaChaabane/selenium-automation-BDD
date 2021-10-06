package com.e2eTests.automation.authentication.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.authentication.pages.AuthenticationPage;
import com.e2eTests.automation.utils.CommonMethods;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthenticationStepDef {
	
	public WebDriver driver;
	private AuthenticationPage authenticationPage = new AuthenticationPage();
	private CommonMethods commonMethods = new CommonMethods();
	public AuthenticationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthenticationPage.class);
	}
	
	@Given("^je me connecte sur l'application OrangeHRM$")
	public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		commonMethods.openURLWithConfigFile("url1");
	}

	@When("^je saisie username$")
	public void jeSaisieUsername() throws Throwable {
		authenticationPage.fillUsername();
	}

	@When("^je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authenticationPage.fillPassword();
	}

	@When("^je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authenticationPage.clickLoginButton();
	}

	@Then("^je me redirige vers la page home$")
	public void jeMeRedirigeVersLaPageHome() throws Throwable {
	}

}
