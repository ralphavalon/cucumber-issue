package com.demo.project;

import com.demo.project.steps.DemoSteps;
import io.cucumber.java.en.Then;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DemoParentSteps {

	private DemoSteps demoSteps;

	@Then("something happened")
	public void somethingHappened() {
		demoSteps.somethingHappens();
	}

}
