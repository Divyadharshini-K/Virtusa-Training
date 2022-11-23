package StepDefinitions;

import io.cucumber.java.en.Given;

public class Expression {
	
	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Laptop count : "+int1);
	}

	@Given("I have {double} CGPA")
	public void i_have_cgpa(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("CGPA : "+double1);
	}

	@Given("{string} is elder to {string}")
	public void is_elder_to(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string+" is sister of  "+string2);
	}


}
