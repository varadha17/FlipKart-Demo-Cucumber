@LoginPage
Feature: User Login on Flipkart Page

Description: User should be able to login into Flipkart site when the username and password are valid

@tag1
Scenario Outline: Login with Multiple user
Given Enter the username "<username>" and password "<password>", then hit Enter

Examples:
	|username|password|
	|7373647396|vikram22|
	|9940067532|Qsty|
	

Scenario: After Login, Landing page should be homepage
Given Enter valid username and Valid Password, then hit enter

