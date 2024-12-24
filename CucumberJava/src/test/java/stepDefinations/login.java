package stepDefinations;

import io.cucumber.java.en.*;

public class login {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user in login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		 System.out.println("user in username and password ");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    
	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
	    
	}

	@Then("error message is displayed - Invalid Credentials")
	public void error_message_is_displayed_Invalid_Credentials() {
	    
	}

	@When("user enters valid name1 and abc")
	public void user_enters_valid_name1_and_abc() {
	    
	}

	@When("user enters valid name2 and def")
	public void user_enters_valid_name2_and_def() {
	} 

}
