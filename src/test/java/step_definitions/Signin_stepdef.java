package step_definitions;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriver_manager.DriverManager;

public class Signin_stepdef {
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		DriverManager.getDriver().get(Constants.APP_URL);
		DriverManager.getDriver().manage().window().maximize();
		
	    System.out.println("The user opens the  signin page");
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	    System.out.println("The user clicks on register link");

	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	    System.out.println("The user redirected to Registration page ");

	}

}
