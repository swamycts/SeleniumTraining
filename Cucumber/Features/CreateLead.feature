Feature: Create Lead in LeafTaps

Scenario: TC003_Create a new Lead

Given OpenChrome browser
Given Load the application URL
And maximise the browser 
And apply implicit wait
Given enter the user name as demosalesmanager
And enter the password as crmsfa
When click on login button
Then user should be able to login
Then user click on crmsfa link 
Given click on leads Link 
And Click on createlead link
Given Enter company name
And user enters firstname 
And user enters lastname
When Click on CreatLead button
Then Lead should be created

