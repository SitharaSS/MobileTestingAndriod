package com.hotel.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Sithara
 * @see This class is used to generate the Jvm report 
 * @since 30-06-2023
 */
public class Reporting {

	/**
	 * @author Sithara
	 * @see This method is used to generate a JVM report
	 * @param jsonFile should be passed as the argument in String
	 * @since 03-07-2023
	 */
	public  static void generateJvmReport(String jsonFile) {
		String path = System.getProperty("user.dir");
		File f=new File(path + "\\target");
		
		Configuration c= new Configuration(f,"OMR Branch Automation");
	    c.addClassifications("app","OMR Branch");
	    c.addClassifications("Android","13");
	    
	    List<String> l=new ArrayList<String>();
	    l.add(jsonFile);
	    
	    ReportBuilder builder = new ReportBuilder(l,c);
	    builder.generateReports();        

		}
}
