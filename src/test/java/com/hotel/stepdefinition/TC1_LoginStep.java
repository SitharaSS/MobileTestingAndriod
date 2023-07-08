package com.hotel.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.hotel.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

/**
 * @author Sithara
 * @see This class is used to perform the functionalities in login page of the mobile app
 * @since 05-07-2023
 */
public class TC1_LoginStep extends BaseClass {
	
	public static PageObjectManager pom = new PageObjectManager();
	public static CommonStep common = new CommonStep();

	/**
	 * @author Sithara
	 * @see This method is used to login in to the mobile app
	 * @param userName should be passed as the argument in String
	 * @param password should be passed as the argument in String
	 * @throws FileNotFoundException because the file specified by that path may not be found
	 * @throws IOException because there may be an error during input or output operations
	 * @since 05-07-2023
	 */
	@Given("User login {string},{string} in Mob App")
	public void user_login_in_mob_app(String userName, String password) throws FileNotFoundException, IOException {
	   pom.getLoginpage().loginWithValidCred(getPropertyFileValue("userName"), getPropertyFileValue("password"));
	}
	
}
