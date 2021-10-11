@tag
Feature: Authentification avec plusieurs utilisateurs
  Je souhaite m'identifier avec plusieurs utilisateurs

  @cnx
  Scenario Outline: Title of your scenario outline
    Given je me connecte sur l'application OrangeHRM
    When je saisie le nom d'utilisateur "<username>"
    When je saisie le mot de passe de l'utilisateur "<password>"
    And je clique sur le bouton login
    Then je me redirige vers la page home "Welcome"

    Examples: 
      | username | password |
      | Admin    |        admin123 |
      | Ghada    |        ghada123 |

