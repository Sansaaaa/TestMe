Feature: Login with mutible credentials


Scenario Outline: Login
When User login into Testme
Then User enters username as "<username>" And password as "<password>"
Then click ok
And verify login
 
Examples: 
|Username|password|
|Lalitha|password|
|sansaa|password123|