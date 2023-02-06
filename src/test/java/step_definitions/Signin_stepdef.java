package step_definitions;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.SigninPage;
import webdriver_manager.DriverManager;

public class Signin_stepdef {
	SigninPage sg=new SigninPage();
	static String username;
	static String password;
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		DriverManager.getDriver().get(Constants.SIGNIN_URL);
		DriverManager.getDriver().manage().window().maximize();
	//	sg.StringinLinkbtn();
		
	    System.out.println("The user opens the  signin page");
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
	//	sg.StringinLinkbtn();
	    System.out.println("The user clicks on register link");

	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	    System.out.println("The user redirected to Registration page ");

	}
	@Given("The user is on signin page with valid username {string} and password {string}")
	public void the_user_is_on_signin_page_with_valid_username_and_password(String string, String string2) {
		sg.doLogin(username,password);
		sg.login();
		
	}

	@When("The user click login button")
	public void the_user_click_signout_button() {
		sg.login();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
	    
	}


}
