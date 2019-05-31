Feature: Test Login 
Description: Registerd user can login into testme app using proper credentials.
-Pre-Requiiste: Registration module should be completed
Example Mapping:
Business Rule: signin
Scenario:
Given User Launch Chrome Browser And Enter TestMeApp URL
When User enter username in username field
When User enters password in password field
When user cliks submit button
Then user verfiy