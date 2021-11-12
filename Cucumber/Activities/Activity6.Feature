@Activity6
Feature: Basic Syntax
@SmokeTest Scenario: Opening a webpage using Selenium
Given User is on Google Home Page
When User types in Cheese and hits ENTER
Then Show how many search results were shown
And Close the browser

@Activity5  Feature: Testing with Tags
@SimpleAlert@SmokeTest 
Scenario: Test for Simple Alert
Given User is on the page
When User clicks the Simple Alert button
Then Alert opens
And Read the text from it and print it
And Close the alert
And Read the result text
And Close Browser