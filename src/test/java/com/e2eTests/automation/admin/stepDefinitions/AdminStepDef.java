package com.e2eTests.automation.admin.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automation.admin.pages.AdminPage;
import com.e2eTests.automation.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDef {
	
	public WebDriver driver;
	private AdminPage adminPage = new AdminPage();
	
	public AdminStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AdminPage.class);
	}

	@When("^j'ouvre l'interface admin$")
	public void jOuvreLInterfaceAdmin() throws Throwable {
		adminPage.clickAdminMenu();

	}
	
	@And("^je clique sur le menu User Management$")
	public void je_clique_sur_le_menu_User_Management() throws Throwable {
		adminPage.clickUserManagementMenu();

	}

	@And("^je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String username) throws Throwable {
		adminPage.enterDesiredUsername(username);

	}

	@And("^je clique sur le bouton search$")
	public void jeCliqueSurLeBoutonSearch() throws Throwable {
		adminPage.clickSearchButton();
	}

	@Then("^je trouve l'utilisateur recherché$")
	public void jeTrouveLUtilisateurRecherché() throws Throwable {
		String userToDisplay = AdminPage.userDisplayed.getText();
		Assert.assertTrue(userToDisplay.contains("Rebecca.Harmony"));

	}


	
}
