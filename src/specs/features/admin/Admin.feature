Feature: Admin - OrangeHRM 
 ETQ utilisateur je souhaite manipuler l'interface Admin

Background:
    Given je me connecte sur l'application OrangeHRM
    When je saisie username "Admin"
    And je saisie le mot de passe "admin123"
    And je clique sur le bouton login 
    
    
  @usersList
  Scenario: Verfier un utilisateur existant 
    When j'ouvre l'interface admin
    And je clique sur le menu User Management
    And je saisis le username "Rebecca.Harmony"
    And je clique sur le bouton search
    Then je trouve l'utilisateur recherché 

 