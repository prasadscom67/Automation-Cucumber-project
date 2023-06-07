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

Feature: Facebook login functionality

 Background:
    Given This is for testing
    #This is for testing purpose 
	
	@Smoke @P1
	Scenario: login for fb application smoke 
		Given launch the fb application 
		When provide all the details 
		Then user is navigated to fb homepage 
		
	@Regression @P1
	Scenario: login for fb application regression 
		Given launch the fb application 
		When provide all the details 
		Then user is navigated to fb homepage		
		
	@Datadriven @P1 @Anushna
	Scenario Outline: Verify login functionality 
		Given launch the fb application
		# Launch the browser and enter www.facebook.com
		When provide all the details "<DATA>"
		# Enter input data i.e username = anu, mobilenumber=9876543210
		Then user is navigated to fb homepage
	Examples: 
		|DATA|
		|FACEBOOK-ANUSHNAREGISTRATION|
		
	@Datadriven @P1 @AnuandPrasad
	Scenario Outline: Verify login functionality
		Given launch the fb application
		When provide all the details "<DATA>"
		Then user is navigated to fb homepage
	Examples: 
		|DATA|
		|FACEBOOK-ANUSHNAREGISTRATION|
		|FACEBOOK-PRASADREGISTRATION|
	
	@Regression
	Scenario: login for fb application 1-2 time 
		Given launch the fb application
		And this is for testing purpose 
		When provide all the details 
		Then user is navigated to fb homepage
		
	Scenario: Breaker joins a game
    	Given the Maker has started a game with the word "silky"
    	When the Breaker joins the Maker's game
    	Then the Breaker must guess a word with 5 characters
	
	
