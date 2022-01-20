package com.demo.project.steps;

import io.cucumber.java.en.When;

public class DemoSteps {

	@When("something happens")
	public void somethingHappens() {
		System.out.println("Something happens");
	}

}
