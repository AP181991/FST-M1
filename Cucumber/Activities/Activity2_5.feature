@activity2_5
Feature: Login Test

Scenario: Testing Login with Example

Given User is on Login page
When User enters "<Usernames>" and "<Passwords>"
Then Read the page title and confirmation message
And Close the Browser
    
