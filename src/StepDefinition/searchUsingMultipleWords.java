package StepDefinition;

import cucumber.api.java.en.*;
import mainPackage.ResultScreen;
import mainPackage.baseClass;

public class searchUsingMultipleWords extends baseClass{
	
	@Given("^Open the google search page$")
	public void Open_the_google_search_page() throws Throwable {
	    OpenChromeBrowser();
	    driver.get(googleURL);
	}
	
	@When("^The user searches for Instabug vs Testfairy$")
	public void the_user_searches_for_Instabug_vs_Testfairy() throws Throwable {
		//Search for keywords using google engine
		System.out.println(driver.getCurrentUrl());
		googleSearch("Instabug vs Testfairy");
	}

	@Then("^The results screen should open with Instabug vs Testfairy relevant results$")
	public void the_results_screen_should_open_with_Instabug_vs_Testfairy_relevant_results() throws Throwable {

		//This call is to get all the results in the results screen
		ResultScreen resultScreen = getAllResults();
		
		//This call is to check if the output results are relevant to the search keyword
		isResultsRelevant(resultScreen, "Instabug vs Testfairy Test Fairy Insta Bug Crash Track");
		
		//Quit the driver
		driver.close();
		driver.quit();
	}

	@When("^The user searches for Egypt News$")
	public void the_user_searches_for_Egypt_News() throws Throwable {
		//Search for keywords using google engine
		googleSearch("Egypt News");
	}

	@Then("^The results screen should open with Egypt News relevant results$")
	public void the_results_screen_should_open_with_Egypt_News_relevant_results() throws Throwable {

		//This call is to get all the results in the results screen
		ResultScreen resultScreen = getAllResults();
		
		//This call is to check if the output results are relevant to the search keyword
		isResultsRelevant(resultScreen, "Egypt News Nile Home Sohag Live Exclusive Suez Canal Ever Green");
		
		//Quit the driver
		driver.close();
		driver.quit();
	}
	

}
