package steps;

import io.cucumber.java.en.Then;

public class Login extends BaseClassLeaftaps{
	
	@Then("Homepage should be displayed")
	public void homepageDisplay () {
		System.out.println(driver.getTitle());
		
	}

}
