package com.hotel.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import com.hotel.base.BaseClass;


import io.cucumber.java.Before;
/**
* @author Sithara
* @see  This class is used to run predefined methods before or after each scenarios 
* @since  05-07-2023
*/
public class HooksClass extends BaseClass{
	
	
	/**
	 * @author Sithara
	 * @see  This method is used to launch mobile app before each scenario
	 * @param sc should be passed as parameter in Scenario
	 * @since  05-07-2023
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		launchMobileApp(getPropertyFileValue("deviceName"),getPropertyFileValue("platformName"),getPropertyFileValue("platformVersion"),getPropertyFileValue("appPackage"),getPropertyFileValue("appActivity"));
	}
}
