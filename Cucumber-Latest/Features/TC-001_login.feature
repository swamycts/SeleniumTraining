//Feature: LeafTaps login functionality

//Background:
//Given OpenChrome browser 
//Given Load the application URL 
//And maximise the browser  
//And apply implicit wait 



//Scenario Outline: TC001_Login with valid credential

//changing scenario: into scenario outline as above and add examples as below
//then change the hardcoded value ''"Demoslaesmanager"' as <username>  

//moving the below 4 lines to the Background section as this is common for both scenarios
//Given OpenChrome browser 
//Given Load the application URL 
//And maximise the browser 
//And apply implicit wait

//Given enter the user name as <username>
//And enter the password as <password>
//When click on login button
//Then user should be able to login

//Examples:
//|username|password|
//|demosalesmanager|crmsfa|
//|demoCSR|crmsfa|


//Scenario: TC001_Login with invalid credential

//Given OpenChrome browser 
//Given Load the application URL 
//And maximise the browser 
//And apply implicit wait

//Given enter the user name as demoCSR 
//And enter the password as crmsfa123 
//When click on login button 
//But error message should be displayed  
