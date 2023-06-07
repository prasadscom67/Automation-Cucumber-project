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
    Given a global administrator named "Greg"
    And a blog named "Greg's anti-tax rants"
    And a customer named "Dr. Bill"
    And a blog named "Expensive Therapy" owned by "Dr. Bill"
	
	@Smoke @P1
	Scenario: login for fb application 1-1 time 
		Given launch the fb application 
		When provide all the details 
		Then user is navigated to fb homepage 
		
	@Regression @P1
	Scenario: login for fb application 1-2 time 
		Given launch the fb application 
		When provide all the details 
		Then user is navigated to fb homepage		
		
	@Datadriven @P1
	Scenario Outline: Verify login functionality 
		Given launch the fb application
		When provide all the details "<DATA>"
		Then user is navigated to fb homepage
	Examples: 
		|DATA|
		|FACEBOOK-REGISTRATION|
	
	@Regression @P1
	Scenario: login for fb application 1-2 time 
		Given launch the fb application
		And this is for testing purpose 
		When provide all the details 
		Then user is navigated to fb homepage
		
	Scenario Outline: eating
  		Given there are <start> cucumbers
  		When I eat <eat> cucumbers
  		Then I should have <left> cucumbers

  	Examples:
    	| start | eat | left |
    |    12 |   5 |    7 |
    |    20 |   5 |   15 |
    
    Scenario: Dr. Bill posts to his own blog
    Given I am logged in as Dr. Bill
    When I try to post to "Expensive Therapy"
    Then I should see "Your article was published."
    
    
    
	
	