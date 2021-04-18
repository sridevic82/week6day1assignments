Feature: Edit Lead Functionality 

Background: 
	Given Open the chrome browser
	And Load URL
	
	
	
Scenario Outline: TC004_editlead 
	Given enter the username as <username>
	And enter the password as <password> 
	When click on login button button
	And Click the Crmsfa link
	And Click leads button
	And Click Merge Leads
	And Click 1st lookup
	And find window handle and go to first window
	And enter first name as Naveen
	And Click findleads
	And select 1st leadid
	And go to first window
	And Click 2nd lookup
	And find window handle and go to first window
	And enter first name as Jacob
	And Click findleads
	And select 1st leadid
	And go to first window
	And Click Mergelead
	Then merge lead is done
	
	Examples:
|username          |password|
|'demosalesmanager'|'crmsfa'|