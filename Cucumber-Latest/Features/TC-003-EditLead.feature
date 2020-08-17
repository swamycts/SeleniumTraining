Feature: Edit Lead in Leaf tap

Scenario: Edit a Lead

Given user click on Leads Menu 
And user clicks on Find Leads link 
Given user enters firstname field 
When user clicks on Find Leads button
Then search result page is displayed
When user clicks on the search result
And user clicks on Edit button
And user Updates the firstname 
When Click on Update button
Then Verify the lead is updated


