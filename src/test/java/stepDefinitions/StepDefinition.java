package stepDefinitions;

import org.openqa.selenium.WebDriver;

import Utils.TableReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public static WebDriver driver;
	

@Given("^When the user lands on the actual page$")
public void when_the_user_lands_on_the_actual_page() throws Exception {
	
	System.out.println(" User lands on the actual page ");
	
    
}

@Then("^Validate the contents of the HTML table$")
public void validate_the_contents_of_the_HTML_table() throws Exception {
	
	TableReader t = new TableReader();
	t.tableValidationByGivenLoacators(); // Assuming the locators given 
	t.htmlTableReader(); // reading WebTable from the Webpage and doing vlaidation 
   

}
}