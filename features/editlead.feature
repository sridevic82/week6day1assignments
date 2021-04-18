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
	And Click Findleads
	And Click on phone
	And enter the pnum as <pnum>
	And Click findleads
	And select firstlead
	And Click edit
	And enter cname<cname> 
	And Click update
	Then Edit lead is performed
	
	Examples: 
|username          |password|pnum|cname|	
|'demosalesmanager'|'crmsfa'|'5'|'TCS'|