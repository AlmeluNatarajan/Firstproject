package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)
public class StepDefinition 
{

    @Given("^User is on Landing Page$")
    public void user_is_on_landing_page() throws Throwable 
    {
        System.out.println("Inside User is on Landing Page");
    }

    @When("^User gives username and password$")
    public void user_gives_username_and_password() throws Throwable 
    {
    	 System.out.println("Inside user_gives_username_and_password");
    }

    @Then("^Home Screen is launched$")
    public void home_screen_is_launched() throws Throwable 
    {
    	System.out.println("Inside home_screen_is_launched");
    }

}