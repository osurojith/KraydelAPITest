Feature: API Test 

@Reg 
Scenario Outline: LogIn API
	Given user enter API "http://ec2-52-212-72-231.eu-west-1.compute.amazonaws.com:9091/Kraydel-server/rest/login/"
	When user enter credentials "<username>","<password>"
	Then Validate the result "<status>","<token>","<userId>"
	Examples: 
	|username|password|status|token|userId|
	||||||
	