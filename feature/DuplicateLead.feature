Feature: Leaftaps Duplicate Lead functionality

Scenario Outline: TC004 Edit Lead - Positive
Given Click on Login
And Click on 'CRM/SFA'
And Click on 'Leads'
And Click on 'Find Leads'
And Click on Email
And Enter Email <email>
And Capture first result
And Click first lead result
And Click Duplicate Lead
And Verify duplicate lead

Examples:
|email|
|'test@selenium.com'|
