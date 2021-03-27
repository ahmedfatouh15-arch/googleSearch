Feature: Search from the results screen

Scenario: Search for only one word using Instabug
Given The user opens the google search page
When The user searches for Instabug
Then The results screen should open with Instabug relevant results from "Search from the results screen"
When The user searches for Egypt from the results screen
Then The results screen should open with Egypt relevant results
