Feature:login functionality

Background:

Given Open the chrome browser
And Load URL

Scenario Outline:TC001_login with positive credentials
Given enter the username as <username>
And enter the password as <password>
When click on login button button
Then homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'Democsr'|'crmsfa'|


Scenario:TC002_login with negative credentials
Given enter the username as 'DemosalesManager'
And enter the password as 'crmsfa123'
When click on login button button
But Error should be displayed