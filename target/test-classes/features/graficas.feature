#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Graficas

  @tag1
  Scenario: Mostrar Graficas
    Given El usuario esta en la pagina principal alerts
    When El usuario busca alerts frame windows
    And El usuario clica modal dialogs
    And El usuario clica small modal
    Then Se comprueba el dialog
    
    Given El usuario esta en la pagina principal
    When El usuario busca textbox
    And Rellenar el formulario
    Then Submit al formulario
    
    Given El usuario esta en la pagina principal
    When El usuario busca radiobutton
    And El usuario clica impressive
    Then Se comprueba radiobutton impressive

	  Given El usuario esta en la pagina principal
    When El usuario busca dynamic properties
    And El usuario espera cinco segundos
    Then El boton esta habilitado

	  Given El usuario esta en la pagina principal
    When El usuario busca dynamic properties
    And El usuario espera cinco segundos
    Then El color del boton ha cambiado

	  Given El usuario esta en la pagina principal alerts
    When El usuario busca alerts frame windows
    And El usuario clica alerts 
    And El usuario clica see alert
    Then Se comprueba la alert

		Given El usuario esta en la pagina principal alerts
    When El usuario busca alerts frame windows
    And El usuario clica alerts 
    And El usuario clica alert after five seconds
    And El usuario espera cinco segundos
    Then Se comprueba la timer alert
    
    Given El usuario esta en la pagina principal
    When El usuario busca textbox
    And Rellenar el formulario
    Then Submit al formulario
    
    Given El usuario esta en la pagina principal
    When El usuario busca radiobutton
    And El usuario clica yes
  	Then Se comprueba el check
  	
  	Given El usuario esta en la pagina principal
  	When El usuario busca webtables
  	And El usuario filtra
  	Then Se comprueba la tabla

		Given El usuario esta en la pagina principal
		When El usuario busca buttons
		And clicks
		Then Se comprueba el clic

    Given El usuario esta en la pagina principal
		When El usuario busca buttons
		And clicks double
		Then Se comprueba el clic double
  
    Given El usuario esta en la pagina principal
    When El usuario busca links
    And El usuario clica en created
    Then Se comprueba el created

		Given El usuario esta en la pagina principal
		When El usuario busca checkbox
		And El usuario clica en el checkbox
		Then Se comprueba el checkbox

