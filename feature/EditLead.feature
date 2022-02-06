Feature: Leaftaps Edit Lead functionality

#Background: 
#Given Launch the Browser
#And Load the application url
#And Enter Username as 'DemoCSR'
#And Enter password as 'crmsfa'

Scenario Outline: TC004 Edit Lead - Positive
Then Click on Login
Then Click on 'CRM/SFA'
Then Click on 'Leads'
Then Click on 'Find Leads'
And Enter leadfirstname <fName>
Then Click on Lead button
Then Click on firstLead Result
Then Click on Edit
And Enter companyname as <companyName>
When Click on Update button
Then Verify company name <companyName>

Examples:
|fName|companyName|
|'Vidya'|'Selenium'|

Scenario: TC005 Edit Lead - Negative
Then Click on Login
Then Click on 'CRM/SFA'
Then Click on 'Leads'
Then Click on 'Find Leads'
And Enter leadfirstname 'Vidya'
Then Click on Lead button
Then Click on firstLead Result
Then Click on Edit
And Enter companyname as ''
When Click on Update button
Then Verify company name ''