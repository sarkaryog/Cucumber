package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	// Before hook will run starting of each scenario
	@Before
	public void setup() {
		System.out.println("Launch browser");
	}
	
	// After hook will run at the end of each scenario
	@After
	public void tearDown() {
		System.out.println("Close the browser");
	}

}
