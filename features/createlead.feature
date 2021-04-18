Feature: Create Lead Functionality 

Background: 
	Given Open the chrome browser 
	And Load URL 
	
	
	
Scenario Outline: TC003_createlead
	Given enter the username as <username> 
	And enter the password as <password> 
	When click on login button button 
	And Click the Crmsfa link 
	And Click leads button 
	And Click Createlead 
	And enter the company name as <cname> 
	And Enter the first name as <fname> 
	And Enter the last name as <lname> 
	And Click Create lead 
	Then Create lead is created 
	
	Examples: 
		|username		   |password|cname  |fname  |lname  |
		|'demosalesmanager'|'crmsfa'|'HCL'  |'Ramya'|'Raj'  |
		|'demosalesmanager'|'crmsfa'|'Wipro'|'Guna' |'Sekar'|
		
		
		
