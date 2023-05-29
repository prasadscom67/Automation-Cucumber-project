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
    
    
    
	
	