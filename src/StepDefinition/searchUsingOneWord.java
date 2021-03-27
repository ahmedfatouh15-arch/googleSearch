package StepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.*;
import mainPackage.ResultScreen;
import mainPackage.baseClass;

public class searchUsingOneWord extends baseClass{
	
	@Given("^The user opens the google search page$")
	public void the_user_opens_the_google_search_page() throws Throwable {
	    OpenChromeBrowser();
	    driver.get(googleURL);
	}

	@When("^The user searches for Instabug$")
	public void the_user_searches_for_Instabug() throws Throwable {
		//Search for keywords using google engine
		googleSearch("Instabug");
	}
	
	@Then("^The results screen should open with Instabug relevant results from \"([^\"]*)\"$")
	public void the_results_screen_should_open_with_Instabug_relevant_results_from(String fromScreen) throws Throwable {
	
		//This call is to get all the results in the results screen
		ResultScreen resultScreen = getAllResults();
		
		//This call is to check if the output results are relevant to the search keyword
		isResultsRelevant(resultScreen, "Instabug");
		
		if(fromScreen.equals("Search for only one word")) {
			//Quit the driver
			driver.close();
			driver.quit();
		}
		
	}

	@When("^The user searches for News$")
	public void the_user_searches_for_News() throws Throwable {
		//Search for keywords using google engine
		googleSearch("News");
	}

	@Then("^The results screen should open with News relevant results$")
	public void the_results_screen_should_open_with_News_relevant_results() throws Throwable {

		//This call is to get all the results in the results screen
		ResultScreen resultScreen = getAllResults();
		
		//This call is to check if the output results are relevant to the search keyword
		isResultsRelevant(resultScreen, "News Live Exclusive");
		
		//Quit the driver
		driver.close();
		driver.quit();
	}

	@When("^The user searches for Egypt$")
	public void the_user_searches_for_Egypt() throws Throwable {
		//Search for keywords using google engine
		googleSearch("Egypt");
	}

	@Then("^The results screen should open with Egypt relevant results$")
	public void the_results_screen_should_open_with_Egypt_relevant_results() throws Throwable {

		//This call is to get all the results in the results screen
		ResultScreen resultScreen = getAllResults();
		
		//This call is to check if the output results are relevant to the search keyword
		isResultsRelevant(resultScreen, "Egypt Nile Home Sohag Suez Canal Ever Green CAF Africa Football");
		
		//Quit the driver
		driver.close();
		driver.quit();
	}
	
	@When("^The user searches for Egypt from the results screen$")
	public void the_user_searches_for_Egypt_from_the_results_screen() throws Throwable {
		try {
			   WebElement searchBar = driver.findElement(By.xpath("//body[1]/div[4]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]"));
			   searchBar.clear();
			   searchBar.sendKeys("Egypt");
			   searchBar.sendKeys(Keys.RETURN);
		}
		catch(NoSuchElementException e) {
			   assertTrue(false, "The google search results screen is not open");
		}
	}

}
