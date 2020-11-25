Feature: Application Login

@RegTest
Scenario: HomePage Login
Given User is on Landing Page
When User gives username and password
Then Home Screen is launched

