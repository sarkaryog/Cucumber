package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	// Before hook will run starting of each scenario
	// If we don't specify order then it will execute at last
	
	@Before
	public void setup_report() {
		System.out.println("Prepare the report");
	}
	
	@Before (order = 1)
	public void setup_browser() {
		System.out.println("Launch Chrome browser");
	}
	
	@Before(order = 2)
	public void setup_url() {
		System.out.println("Launch amazon application");
	}
	
	
	
	/* Before annotation output : 
	 * Launch Chrome browser (order = 1)
       Launch amazon application (order = 2)
       Prepare the report (No order specify)
	 */
	
	// After hook will run at the end of each scenario
	// If we don't specify order then it will execute at first for after annotation
	// for after annotation order execution is in descending order i.e 3 2 1 
	
	@After
	public void tearDown_url() {
		System.out.println("logout the application");
	}
	
	@After (order = 2)
	public void tearDown_browser() {
		System.out.println("Close the browser");
	}

	@After (order = 1)
	public void tearDown_report() {
		System.out.println("Print the report");
	}
	
	/* Output for after annotation: 
	 * logout the application  (No order specify)
       Close the browser (order = 2)
       Print the report (order = 1)
	 */
}
