Feature: Image search

Scenario: check if the image search get the relevant results
Given The user opens the image search page
When The user searches for keyword Instabug
Then All results should be relevant to Instabug from "check relevant"

Scenario: same results from image search and normal search then images filter
Given Accessing the search page
When the user searchs with Instabug as a keyword
And the user filter the data with the images tab
And user opens the image search page
And The user searches for keyword Instabug
Then All results should be relevant to Instabug from "same results"
Then Both results should be identical