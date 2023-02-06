package step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import constants.Constants;
import constants.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.Linkedlistpage;
//import utilities.Loggerload;
import webdriver_manager.DriverManager;

public class Linkedlist_stepdef {

	WebDriver driver = DriverManager.getDriver();	
	Linkedlistpage ll =new  Linkedlistpage();
	
//@Demo_ll_01
	@Given("The User is on signin page")
	public void the_user_is_on_signin_page() throws InterruptedException {

		DriverManager.getDriver().get(Constants.LinkedListpage);
		DriverManager.getDriver().manage().window().maximize();

		System.out.println("User get in to sigin in page after signin");    
	}
	

	@When("The user enter valid user name and password")
	public void the_user_enter_valid_user_name_and_password() throws InterruptedException {
		ll.getstart();
		System.out.println("User enter the valid usernam and password");    

	}

	@When("The user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		System.out.println("The user clicks the login button");    

	}

	@Then("The user redirected into home page")
	public void the_user_redirected_into_home_page() {
		
		System.out.println("User on the home page");
	   
	}

	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		System.out.println("User on the home page after lofgges in");

	}

	@When("The user is selecting the linked list item from the drop down")
	public void the_user_is_selecting_the_linked_list_item_from_the_drop_down() throws InterruptedException {
	//	Thread.sleep(1000);
      //  ll.dropdown();
		System.out.println("User Clicks on Get Started button linkedlist Page");
	}
	
	

	@Then("The user is redirected into {string} page")
	public void the_user_is_redirected_into_page(String string) {
		
		System.out.println("User clicks the linked list page");
	   
	}
	//@Demo_ll_02
	@Given("The user is on the {string} page after logged in")
	public void the_user_is_on_the_page_after_logged_in(String string) {
		System.out.println("User clicks the linked list page");

	}

	
	@When("The user clicks the introduction link")
	public void the_user_clicks_the_introduction_link() throws InterruptedException {
		ll.getstart_linkedlist();
  		System.out.println("User clicks the linked list page after click the link");

	}

	@Then("The user redirected to {string} of linked list page")
	public void the_user_redirected_to_of_linked_list_page(String string) {
		String Title =ll.getLinkedlistPageTitle();
		Loggerload.info("Title of current page is : " + Title);
		assertEquals(Title, "Linked list intoduction", "Title not matched");
	}

	@When("The user clicks the {string} button on the {string} page")
	public void the_user_clicks_the_button_on_the_page(String string, String string2) throws InterruptedException {
       ll.clickOnTryHereLink();

	}

	@Then("The user redirected into tryEditor page with run button to test")
	public void the_user_redirected_into_try_editor_page_with_run_button_to_test() {
		
		System.out.println("user should be directed to  linkedlist in Python link page");

	}

	@Given("The user is in the try here page to run the python code in tryEditor")
	public void the_user_is_in_the_try_here_page_to_run_the_python_code_in_try_editor() {

	}

	@When("The user is enter the valid python code in tryEditor")
	public void the_user_is_enter_the_valid_python_code_in_try_editor() {
		String Title = ll.getLinkedlistPageTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title not matched");
		
		ll.EnterPhytonCode("print(\"Implementation in Queue\")");
	}

	@When("user clicks the run button")
	public void user_clicks_the_run_button() {
		ll.clickOnRunButton();	
	}

	@Then("The should be presented with run output")
	public void the_should_be_presented_with_run_output() {
		String actualMsg = ll.getActualResult1();
		Loggerload.info("Actual result  :" + actualMsg);
	    assertEquals(actualMsg, "Implementation in Queue"); 
	}

	@Given("The user is in the try here page having tryEditor and run button")
	public void the_user_is_in_the_try_here_page_having_try_editor_and_run_button() {
		System.out.println("The user is in a page having an Editor with a Run button to test introduction linked list python page");
		ll.navigateToEditorUrl();
	}

	@When("The user is enter the invalid python code in the tryEditor")
	public void the_user_is_enter_the_invalid_python_code_in_the_try_editor() throws InterruptedException {
		ll.InvalidPhytonCode("print\"Implementation in Queue\")");

	}

	@When("The user clicks the Run button")
	public void the_user_clicks_the_run_button() {
		ll.clickOnRunButton();
	}

	@Then("The user get the error message")
	public void the_user_get_the_error_message() throws InterruptedException {
		Loggerload.info("Invalid code when clicked on run button");
		String actualMsg = ll.getErrorText();
		Loggerload.info("Error message for invalid python code is" + actualMsg);
		assertEquals(actualMsg,"SyntaxError: bad input on line 1", "Result do not match");
	}
//@demo_ll_05
	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() throws InterruptedException {

	   ll.creating_linked_listpage();
	}

	@Then("The user redirected into creating linked list page")
	public void the_user_redirected_into_creating_linked_list_page() {
		System.out.println("The user should be redirected to creating linked list page");

	}

	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string, String string2) {
		System.out.println("The user stay here link to enter the python code");

	}
	//@demo_ll_05
	@When("The user clicks the Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
		ll.implementLLInPythonLinkpage();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		System.out.println("The user should redirected into linked list page");

	}

	@When("The user clicks the Traversal button")
	public void the_user_clicks_the_traversal_button() {
	ll.traversalLinkpage();
	}

	@When("The user clicks the Insertion button")
	public void the_user_clicks_the_insertion_button() {
	 ll.insertionLinkpage();
	}

	@When("The user clicks the Deletion button")
	public void the_user_clicks_the_deletion_button() {
	ll.deletionLinkpage();
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
	ll.getLinkedlistPageTitle();
	}

	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
	   ll.practiceQuestionLinkpage();
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
	System.out.println("The user redirected into python page");
	}



}
