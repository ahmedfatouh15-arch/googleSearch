Feature: Search for only one word

Scenario: Search for only one word using Instabug
Given The user opens the google search page
When The user searches for Instabug
Then The results screen should open with Instabug relevant results from "Search for only one word"


Scenario: Search for only one word using News
Given The user opens the google search page
When The user searches for News
Then The results screen should open with News relevant results

Scenario: Search for only one word using Egypt
Given The user opens the google search page
When The user searches for Egypt
Then The results screen should open with Egypt relevant results

