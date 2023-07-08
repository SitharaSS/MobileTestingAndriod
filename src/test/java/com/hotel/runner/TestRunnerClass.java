
package com.hotel.runner;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.hotel.base.BaseClass;
import com.hotel.reports.Reporting;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags= ("@BCC"),dryRun=false,monochrome = true , plugin= {"pretty","json:target\\output.json"},features="src\\test\\resources\\Features",glue="com.hotel.stepdefinition")

/**
 * 
 * @author Sithara
 * @see This class is used to run the program and it is the starting point
 * @since 05-07-2023
 *
 */
	
public class TestRunnerClass extends BaseClass{
	/**
	 * @author Sithara
	 * @see This method is to generate report
	 * @throws FileNotFoundException because the file specified by that path may not be found
	 * @throws IOException because there may be an error during input or output operations
	 * @since  05-07-2023
	 */
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
	Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonPath"));
		
 }
	
}


			

