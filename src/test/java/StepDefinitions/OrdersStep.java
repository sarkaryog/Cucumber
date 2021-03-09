package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersStep {
	
	@Given("a registered user exists")
	public void a_registered_user_exists() {
	   System.out.println("A register user should be exist");
	}

	@Given("User is on amazon login page")
	public void user_is_on_amazon_login_page() {
	  System.out.println("User is on login page");
	}

	@When("users enters username")
	public void users_enters_username() {
	   System.out.println("User enter the username");
	}

	@When("User enters password")
	public void user_enters_password() {
	   System.out.println("User enter password");
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	  System.out.println("User click on login button");
	}

	@Then("user navigate to order page")
	public void user_navigate_to_order_page() {
	   System.out.println("User navigate to login page");
	}

	@When("user clicks on previous order link")
	public void user_clicks_on_previous_order_link() {
	    System.out.println("User click on previous order link");
	}

	@Then("user check the previous order details")
	public void user_check_the_previous_order_details() {
	   System.out.println("User check the previous details");
	}

	@When("user clicks on open order link")
	public void user_clicks_on_open_order_link() {
	  System.out.println("User click on order link");
	}

	@Then("user check the open order details")
	public void user_check_the_open_order_details() {
	   System.out.println("user check the open order details");
	}

	@When("user clicks on cancelled  order link")
	public void user_clicks_on_cancelled_order_link() {
	 System.out.println("user clicks on cancelled  order link");
	}

	@Then("user check the cancelled order detailsed order details")
	public void user_check_the_cancelled_order_detailsed_order_details() {
	   System.out.println("user check the cancelled order detailsed order details");
	}

}
