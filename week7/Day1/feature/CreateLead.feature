Feature: CreateLead UserStory 

Background: 
	Given Open a browser- maximize and set the timeouts 
	And Load the application URL "http://leaftaps.com/opentaps/" 
	
Scenario Outline: TC001_Verify the user is able to create lead 
	Given Enter the username <Username> 
	And Enter the password <Password> 
	And Click Submit and verify login 
	And Click CRM-SFA 
	And Click Leads 
	And Click Create Lead 
	And Enter the lead form details <Companyname>, <Firstname>, <Lastname> 
	When Submit button is clicked 
	Then Lead should be created sucessfully 
	Examples: 
		|Username|Password|Companyname|Firstname|Lastname|
		|'DemoSalesManager'|'crmsfa'|'deloitte'|'venkatesh'|'balu'|
		|'demoCSR'|'crmsfa'|'CTS'|'moni'|'thirukonda'|
